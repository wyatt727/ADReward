package com.mbridge.msdk.foundation.tools;

import android.os.Build;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.tools.f;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
public class FastKV {
    static final int ASYNC_BLOCKING = 1;
    private static final String A_SUFFIX = ".kva";
    private static final int BASE_GC_BYTES_THRESHOLD = 4096;
    private static final int BASE_GC_KEYS_THRESHOLD = 80;
    private static final String BOTH_FILES_ERROR = "both files error";
    private static final String B_SUFFIX = ".kvb";
    private static final String C_SUFFIX = ".kvc";
    private static final int DATA_SIZE_LIMIT = 536870912;
    private static final int DATA_START = 12;
    private static final int DOUBLE_LIMIT;
    private static final byte[] EMPTY_ARRAY = new byte[0];
    static final String GC_FINISH = "gc finish";
    private static final int INTERNAL_LIMIT = 2048;
    private static final String MAP_FAILED = "map failed";
    static final int NON_BLOCKING = 0;
    private static final String OPEN_FILE_FAILED = "open file failed";
    private static final int PAGE_SIZE;
    private static final String PARSE_DATA_FAILED = "parse dara failed";
    static final int SYNC_BLOCKING = 2;
    private static final String TEMP_SUFFIX = ".tmp";
    static final String TRUNCATE_FINISH = "truncate finish";
    private static final int TRUNCATE_THRESHOLD;
    private static final int[] TYPE_SIZE;
    private MappedByteBuffer aBuffer;
    private FileChannel aChannel;
    private MappedByteBuffer bBuffer;
    private FileChannel bChannel;
    private long checksum;
    private int dataEnd;
    private final Map<String, a> encoderMap;
    private p fastBuffer;
    private int invalidBytes;
    private final String name;
    private final String path;
    private int removeStart;
    private boolean sizeChanged;
    private String tempExternalName;
    private int updateSize;
    private int updateStart;
    private int writingMode;
    private final Map<String, f.b> data = new HashMap();
    private final Executor executor = new s();
    private final ArrayList<c> invalids = new ArrayList<>();
    private final b logger = q.b;
    private boolean autoCommit = true;

    public interface a<T> {
        T a(byte[] bArr, int i, int i2);

        String a();

        byte[] a(T t);
    }

    public interface b {
        void a(String str, Exception exc);

        void a(String str, String str2);

        void b(String str, Exception exc);
    }

    private long shiftCheckSum(long j, int i) {
        int i2 = (i & 7) << 3;
        return (j >>> (64 - i2)) | (j << i2);
    }

    static {
        int iA = ap.a();
        PAGE_SIZE = iA;
        int iMax = Math.max(iA << 1, 16384);
        DOUBLE_LIMIT = iMax;
        TRUNCATE_THRESHOLD = iMax << 1;
        TYPE_SIZE = new int[]{0, 1, 4, 4, 8, 8};
    }

    FastKV(String str, String str2, a[] aVarArr, int i) {
        this.path = str;
        this.name = str2;
        this.writingMode = i;
        HashMap map = new HashMap();
        map.put("StringSet", am.f2979a);
        if (aVarArr != null && aVarArr.length > 0) {
            for (a aVar : aVarArr) {
                String strA = aVar.a();
                if (map.containsKey(strA)) {
                    error("duplicate encoder tag:" + strA);
                } else {
                    map.put(strA, aVar);
                }
            }
        }
        this.encoderMap = map;
        loadData();
    }

    private void addObject(String str, Object obj, byte[] bArr, byte b2) {
        Object obj2;
        int length;
        f.b hVar;
        int iSaveArray = saveArray(str, bArr, b2);
        if (iSaveArray != 0) {
            String str2 = this.tempExternalName;
            boolean z = str2 != null;
            if (z) {
                this.tempExternalName = null;
                length = 32;
                obj2 = str2;
            } else {
                obj2 = obj;
                length = bArr.length;
            }
            if (b2 == 6) {
                hVar = new f.i(this.updateStart, iSaveArray, (String) obj2, length, z);
            } else if (b2 == 7) {
                hVar = new f.a(this.updateStart, iSaveArray, obj2, length, z);
            } else {
                hVar = new f.h(this.updateStart, iSaveArray, obj2, length, z);
            }
            this.data.put(str, hVar);
            updateChange();
        }
    }

    private void addOrUpdate(String str, Object obj, byte[] bArr, f.j jVar, byte b2) throws IOException {
        if (jVar == null) {
            addObject(str, obj, bArr, b2);
        } else if (jVar.b || jVar.e != bArr.length) {
            updateObject(str, obj, bArr, jVar);
        } else {
            updateBytes(jVar.f2988a, bArr);
            jVar.d = obj;
        }
        checkIfCommit();
    }

    private int bytesThreshold() {
        int i = this.dataEnd;
        if (i <= 16384) {
            return 4096;
        }
        return i <= 65536 ? 8192 : 16384;
    }

    private void checkGC() throws IOException {
        if (this.invalidBytes < (bytesThreshold() << 1)) {
            if (this.invalids.size() < (this.dataEnd < 16384 ? 80 : Opcodes.IF_ICMPNE)) {
                return;
            }
        }
        gc(0);
    }

    private void checkIfCommit() {
        if (this.writingMode == 0 || !this.autoCommit) {
            return;
        }
        commitToCFile();
    }

    private void checkKey(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    private void checkKeySize(int i) {
        if (i > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
    }

    private void checkValueSize(int i, boolean z) {
        if (z) {
            if (i != 32) {
                throw new IllegalStateException("name size not match");
            }
        } else if (i < 0 || i >= 2048) {
            throw new IllegalStateException("value size out of bound");
        }
    }

    public synchronized void clear() {
        resetData();
        if (this.writingMode != 0) {
            deleteCFiles();
        }
    }

    private void resetData() throws IOException {
        if (this.writingMode == 0) {
            try {
                resetBuffer(this.aBuffer);
                resetBuffer(this.bBuffer);
            } catch (IOException unused) {
                toBlockingMode();
            }
        }
        clearData();
        ap.a(new File(this.path + this.name));
    }

    private void deleteCFiles() {
        try {
            ap.a(new File(this.path, this.name + C_SUFFIX));
            ap.a(new File(this.path, this.name + TEMP_SUFFIX));
        } catch (Exception e) {
            error(e);
        }
    }

    private void resetBuffer(MappedByteBuffer mappedByteBuffer) throws IOException {
        int iCapacity = mappedByteBuffer.capacity();
        int i = PAGE_SIZE;
        if (iCapacity != i) {
            FileChannel fileChannel = mappedByteBuffer == this.aBuffer ? this.aChannel : this.bChannel;
            fileChannel.truncate(i);
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i);
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (mappedByteBuffer == this.aBuffer) {
                this.aBuffer = map;
            } else {
                this.bBuffer = map;
            }
            mappedByteBuffer = map;
        }
        mappedByteBuffer.putInt(0, 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    private void toBlockingMode() throws IOException {
        this.writingMode = 1;
        ap.a(this.aChannel);
        ap.a(this.bChannel);
        this.aChannel = null;
        this.bChannel = null;
        this.aBuffer = null;
        this.bBuffer = null;
    }

    private void clearData() {
        this.dataEnd = 12;
        this.checksum = 0L;
        clearInvalid();
        this.data.clear();
        p pVar = this.fastBuffer;
        if (pVar == null || pVar.f2994a.length != PAGE_SIZE) {
            this.fastBuffer = new p(PAGE_SIZE);
        } else {
            this.fastBuffer.b(0, 0);
            this.fastBuffer.a(4, 0L);
        }
    }

    private void error(Exception exc) {
        b bVar = this.logger;
        if (bVar != null) {
            bVar.a(this.name, exc);
        }
    }

    private void clearInvalid() {
        this.invalidBytes = 0;
        this.invalids.clear();
    }

    public synchronized boolean commit() {
        this.autoCommit = true;
        return commitToCFile();
    }

    private boolean commitToCFile() {
        int i = this.writingMode;
        if (i == 1) {
            this.executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.FastKV.1
                @Override // java.lang.Runnable
                public final void run() {
                    FastKV.this.writeToCFile();
                }
            });
        } else if (i == 2) {
            return writeToCFile();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean writeToCFile() {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.lang.String r2 = r6.path     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            r3.<init>()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.lang.String r4 = r6.name     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            r3.append(r4)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.lang.String r4 = ".tmp"
            r3.append(r4)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            boolean r2 = com.mbridge.msdk.foundation.tools.ap.c(r1)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            if (r2 == 0) goto L7b
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.lang.String r3 = "rw"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            int r3 = r6.dataEnd     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            r2.setLength(r3)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            com.mbridge.msdk.foundation.tools.p r3 = r6.fastBuffer     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            byte[] r3 = r3.f2994a     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            int r4 = r6.dataEnd     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            r2.write(r3, r0, r4)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            r2.close()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.lang.String r3 = r6.path     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            r4.<init>()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.lang.String r5 = r6.name     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            r4.append(r5)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.lang.String r5 = ".kvc"
            r4.append(r5)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            if (r3 == 0) goto L61
            boolean r3 = r2.delete()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            if (r3 == 0) goto L7b
        L61:
            boolean r1 = r1.renameTo(r2)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            if (r1 == 0) goto L6a
            r0 = 1
            monitor-exit(r6)
            return r0
        L6a:
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.lang.String r2 = "rename failed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            r6.warning(r1)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            goto L7b
        L75:
            r0 = move-exception
            goto L7d
        L77:
            r1 = move-exception
            r6.error(r1)     // Catch: java.lang.Throwable -> L75
        L7b:
            monitor-exit(r6)
            return r0
        L7d:
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.FastKV.writeToCFile():boolean");
    }

    private void warning(Exception exc) {
        b bVar = this.logger;
        if (bVar != null) {
            bVar.b(this.name, exc);
        }
    }

    public synchronized boolean contains(String str) {
        return this.data.containsKey(str);
    }

    private void copyBuffer(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i) throws IOException {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            try {
                MappedByteBuffer map = (mappedByteBuffer2 == this.bBuffer ? this.bChannel : this.aChannel).map(FileChannel.MapMode.READ_WRITE, 0L, mappedByteBuffer.capacity());
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (mappedByteBuffer2 == this.bBuffer) {
                    this.bBuffer = map;
                } else {
                    this.aBuffer = map;
                }
                mappedByteBuffer2 = map;
            } catch (IOException e) {
                error(e);
                toBlockingMode();
                return;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    private void countInvalid(int i, int i2) {
        this.invalidBytes += i2 - i;
        this.invalids.add(new c(i, i2));
    }

    public synchronized void disableAutoCommit() {
        this.autoCommit = false;
    }

    private void ensureSize(int i) throws IOException {
        int length = this.fastBuffer.f2994a.length;
        int i2 = this.dataEnd + i;
        if (i2 >= length) {
            int i3 = this.invalidBytes;
            if (i3 > i && i3 > bytesThreshold()) {
                gc(i);
                return;
            }
            int newCapacity = getNewCapacity(length, i2);
            byte[] bArr = new byte[newCapacity];
            System.arraycopy(this.fastBuffer.f2994a, 0, bArr, 0, this.dataEnd);
            this.fastBuffer.f2994a = bArr;
            if (this.writingMode == 0) {
                try {
                    long j = newCapacity;
                    MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                    this.aBuffer = map;
                    map.order(ByteOrder.LITTLE_ENDIAN);
                    MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                    this.bBuffer = map2;
                    map2.order(ByteOrder.LITTLE_ENDIAN);
                } catch (IOException e) {
                    error(new Exception(MAP_FAILED, e));
                    this.fastBuffer.b(0, this.dataEnd - 12);
                    this.fastBuffer.a(4, this.checksum);
                    toBlockingMode();
                }
            }
        }
    }

    private void error(String str) {
        b bVar = this.logger;
        if (bVar != null) {
            bVar.a(this.name, new Exception(str));
        }
    }

    private void fastPutString(String str, String str2, f.i iVar) throws IOException {
        int iA = p.a(str2);
        if (iVar == null) {
            int iA2 = p.a(str);
            checkKeySize(iA2);
            int i = iA2 + 4;
            this.updateSize = i + iA;
            preparePutBytes();
            this.fastBuffer.a((byte) 6);
            putKey(str, iA2);
            putStringValue(str2, iA);
            Map<String, f.b> map = this.data;
            int i2 = this.updateStart;
            map.put(str, new f.i(i2, i2 + i, str2, iA, false));
            updateChange();
        } else {
            int i3 = iVar.f2988a - iVar.c;
            boolean z = true;
            if (iVar.e == iA) {
                this.checksum ^= this.fastBuffer.a(iVar.f2988a, iVar.e);
                if (iA == str2.length()) {
                    str2.getBytes(0, iA, this.fastBuffer.f2994a, iVar.f2988a);
                } else {
                    this.fastBuffer.b = iVar.f2988a;
                    this.fastBuffer.b(str2);
                }
                this.updateStart = iVar.f2988a;
                this.updateSize = iA;
                z = false;
            } else {
                this.updateSize = i3 + iA;
                preparePutBytes();
                this.fastBuffer.a((byte) 6);
                int i4 = i3 - 3;
                System.arraycopy(this.fastBuffer.f2994a, iVar.c + 1, this.fastBuffer.f2994a, this.fastBuffer.b, i4);
                this.fastBuffer.b += i4;
                putStringValue(str2, iA);
                remove((byte) 6, iVar.c, iVar.f2988a + iVar.e);
                str = iVar.b ? (String) iVar.d : null;
                iVar.b = false;
                iVar.c = this.updateStart;
                iVar.f2988a = this.updateStart + i3;
                iVar.e = iA;
            }
            iVar.d = str2;
            updateChange();
            if (z) {
                checkGC();
            }
            if (str != null) {
                ap.a(new File(this.path + this.name, str));
            }
        }
        checkIfCommit();
    }

    public synchronized void force() {
        if (this.writingMode == 0) {
            this.aBuffer.force();
            this.bBuffer.force();
        }
    }

    void gc(int i) throws IOException {
        Collections.sort(this.invalids);
        mergeInvalids();
        c cVar = this.invalids.get(0);
        int i2 = cVar.b;
        int i3 = this.dataEnd;
        int i4 = i3 - this.invalidBytes;
        int i5 = i4 - 12;
        int i6 = i4 - i2;
        int i7 = i3 - i2;
        boolean z = i5 < i7 + i6;
        if (!z) {
            this.checksum ^= this.fastBuffer.a(i2, i7);
        }
        int size = this.invalids.size();
        int i8 = size - 1;
        int i9 = this.dataEnd - this.invalids.get(i8).f2960a;
        int[] iArr = new int[(i9 > 0 ? size : i8) << 1];
        int i10 = cVar.b;
        int i11 = cVar.f2960a;
        int i12 = 1;
        while (i12 < size) {
            c cVar2 = this.invalids.get(i12);
            int i13 = cVar2.b - i11;
            int i14 = size;
            System.arraycopy(this.fastBuffer.f2994a, i11, this.fastBuffer.f2994a, i10, i13);
            int i15 = (i12 - 1) << 1;
            iArr[i15] = i11;
            iArr[i15 + 1] = i11 - i10;
            i10 += i13;
            i11 = cVar2.f2960a;
            i12++;
            size = i14;
        }
        if (i9 > 0) {
            System.arraycopy(this.fastBuffer.f2994a, i11, this.fastBuffer.f2994a, i10, i9);
            int i16 = i8 << 1;
            iArr[i16] = i11;
            iArr[i16 + 1] = i11 - i10;
        }
        clearInvalid();
        if (z) {
            this.checksum = this.fastBuffer.a(12, i5);
        } else {
            this.checksum ^= this.fastBuffer.a(i2, i6);
        }
        this.dataEnd = i4;
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            this.aBuffer.putLong(4, this.checksum);
            this.aBuffer.position(i2);
            this.aBuffer.put(this.fastBuffer.f2994a, i2, i6);
            this.aBuffer.putInt(0, i5);
            this.bBuffer.putInt(0, i5);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.position(i2);
            this.bBuffer.put(this.fastBuffer.f2994a, i2, i6);
        } else {
            this.fastBuffer.b(0, i5);
            this.fastBuffer.a(4, this.checksum);
        }
        updateOffset(i2, iArr);
        int i17 = i4 + i;
        if (this.fastBuffer.f2994a.length - i17 > TRUNCATE_THRESHOLD) {
            truncate(i17);
        }
        info(GC_FINISH);
    }

    public synchronized Map<String, Object> getAll() {
        Object objValueOf;
        int size = this.data.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry<String, f.b> entry : this.data.entrySet()) {
            String key = entry.getKey();
            f.b value = entry.getValue();
            Object obj = null;
            switch (value.a()) {
                case 1:
                    objValueOf = Boolean.valueOf(((f.c) value).b);
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((f.C0273f) value).b);
                    break;
                case 3:
                    objValueOf = Float.valueOf(((f.e) value).b);
                    break;
                case 4:
                    objValueOf = Long.valueOf(((f.g) value).b);
                    break;
                case 5:
                    objValueOf = Double.valueOf(((f.d) value).b);
                    break;
                case 6:
                    f.i iVar = (f.i) value;
                    if (iVar.b) {
                        objValueOf = getStringFromFile(iVar);
                        break;
                    } else {
                        objValueOf = iVar.d;
                        break;
                    }
                case 7:
                    f.a aVar = (f.a) value;
                    if (aVar.b) {
                        objValueOf = getArrayFromFile(aVar);
                        break;
                    } else {
                        objValueOf = aVar.d;
                        break;
                    }
                case 8:
                    f.h hVar = (f.h) value;
                    if (hVar.b) {
                        objValueOf = getObjectFromFile(hVar);
                        break;
                    } else {
                        objValueOf = ((f.h) value).d;
                        break;
                    }
                default:
                    continue;
                    map.put(key, obj);
            }
            obj = objValueOf;
            map.put(key, obj);
        }
        return map;
    }

    private String getStringFromFile(f.i iVar) {
        try {
            byte[] bArrB = ap.b(new File(this.path + this.name, (String) iVar.d));
            if (bArrB != null) {
                return Build.VERSION.SDK_INT >= 19 ? bArrB.length == 0 ? "" : new String(bArrB, StandardCharsets.UTF_8) : bArrB.length == 0 ? "" : new String(bArrB);
            }
        } catch (Exception e) {
            error(e);
        }
        return "";
    }

    private byte[] getArrayFromFile(f.a aVar) {
        try {
            byte[] bArrB = ap.b(new File(this.path + this.name, (String) aVar.d));
            return bArrB != null ? bArrB : EMPTY_ARRAY;
        } catch (Exception e) {
            error(e);
            return EMPTY_ARRAY;
        }
    }

    private Object getObjectFromFile(f.h hVar) {
        String str;
        try {
            byte[] bArrB = ap.b(new File(this.path + this.name, (String) hVar.d));
            if (bArrB != null) {
                int i = bArrB[0] & 255;
                if (Build.VERSION.SDK_INT >= 19) {
                    str = new String(bArrB, 1, i, StandardCharsets.UTF_8);
                } else {
                    str = new String(bArrB, 1, i);
                }
                a aVar = this.encoderMap.get(str);
                if (aVar != null) {
                    int i2 = i + 1;
                    return aVar.a(bArrB, i2, bArrB.length - i2);
                }
                warning(new Exception("No encoder for tag:" + str));
                return null;
            }
            warning(new Exception("Read object data failed"));
            return null;
        } catch (Exception e) {
            error(e);
            return null;
        }
    }

    public byte[] getArray(String str) {
        return getArray(str, EMPTY_ARRAY);
    }

    public synchronized byte[] getArray(String str, byte[] bArr) {
        f.a aVar = (f.a) this.data.get(str);
        if (aVar != null) {
            return aVar.b ? getArrayFromFile(aVar) : (byte[]) aVar.d;
        }
        return bArr;
    }

    public synchronized boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public synchronized boolean getBoolean(String str, boolean z) {
        f.c cVar = (f.c) this.data.get(str);
        if (cVar != null) {
            z = cVar.b;
        }
        return z;
    }

    public double getDouble(String str) {
        return getDouble(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    public synchronized double getDouble(String str, double d) {
        f.d dVar = (f.d) this.data.get(str);
        if (dVar != null) {
            d = dVar.b;
        }
        return d;
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public synchronized float getFloat(String str, float f) {
        f.e eVar = (f.e) this.data.get(str);
        if (eVar != null) {
            f = eVar.b;
        }
        return f;
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public synchronized int getInt(String str, int i) {
        f.C0273f c0273f = (f.C0273f) this.data.get(str);
        if (c0273f != null) {
            i = c0273f.b;
        }
        return i;
    }

    public synchronized long getLong(String str) {
        f.g gVar;
        gVar = (f.g) this.data.get(str);
        return gVar == null ? 0L : gVar.b;
    }

    public synchronized long getLong(String str, long j) {
        f.g gVar = (f.g) this.data.get(str);
        if (gVar != null) {
            j = gVar.b;
        }
        return j;
    }

    private int getNewCapacity(int i, int i2) {
        if (i2 > 536870912) {
            throw new IllegalStateException("data size out of limit");
        }
        int i3 = PAGE_SIZE;
        if (i2 <= i3) {
            return i3;
        }
        while (i < i2) {
            int i4 = DOUBLE_LIMIT;
            i = i <= i4 ? i << 1 : i + i4;
        }
        return i;
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public synchronized String getString(String str, String str2) {
        f.i iVar = (f.i) this.data.get(str);
        if (iVar != null) {
            return iVar.b ? getStringFromFile(iVar) : (String) iVar.d;
        }
        return str2;
    }

    public synchronized Set<String> getStringSet(String str) {
        return (Set) getObject(str);
    }

    public synchronized <T> T getObject(String str) {
        f.h hVar = (f.h) this.data.get(str);
        if (hVar != null) {
            return hVar.b ? (T) getObjectFromFile(hVar) : (T) hVar.d;
        }
        return null;
    }

    private void info(String str) {
        b bVar = this.logger;
        if (bVar != null) {
            bVar.a(this.name, str);
        }
    }

    private boolean isABFileEqual() {
        p pVar = new p(this.dataEnd);
        this.bBuffer.rewind();
        this.bBuffer.get(pVar.f2994a, 0, this.dataEnd);
        byte[] bArr = this.fastBuffer.f2994a;
        byte[] bArr2 = pVar.f2994a;
        for (int i = 0; i < this.dataEnd; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private synchronized void loadData() {
        long jNanoTime = System.nanoTime();
        if (!loadFromCFile() && this.writingMode == 0) {
            loadFromABFile();
        }
        if (this.fastBuffer == null) {
            this.fastBuffer = new p(PAGE_SIZE);
        }
        if (this.logger != null) {
            info("loading finish, data len:" + this.dataEnd + ", get keys:" + this.data.size() + ", use time:" + ((System.nanoTime() - jNanoTime) / 1000000) + " ms");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void loadFromABFile() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.FastKV.loadFromABFile():void");
    }

    private boolean loadFromCFile() {
        File file = new File(this.path, this.name + C_SUFFIX);
        File file2 = new File(this.path, this.name + TEMP_SUFFIX);
        boolean z = true;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (loadWithBlockingIO(file)) {
                    if (this.writingMode == 0) {
                        if (writeToABFile(this.fastBuffer)) {
                            info("recover from c file");
                            try {
                                deleteCFiles();
                                return true;
                            } catch (Exception e) {
                                e = e;
                                error(e);
                                return z;
                            }
                        }
                        this.writingMode = 1;
                    }
                } else {
                    clearData();
                    deleteCFiles();
                }
            } else if (this.writingMode != 0) {
                File file3 = new File(this.path, this.name + A_SUFFIX);
                File file4 = new File(this.path, this.name + B_SUFFIX);
                if (file3.exists() && file4.exists()) {
                    tryBlockingIO(file3, file4);
                }
            }
            return false;
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
    }

    private boolean loadWithBlockingIO(File file) throws IOException {
        p pVar;
        long length = file.length();
        if (length != 0 && length <= 536870912) {
            int i = (int) length;
            int newCapacity = getNewCapacity(PAGE_SIZE, i);
            p pVar2 = this.fastBuffer;
            if (pVar2 != null && pVar2.f2994a.length == newCapacity) {
                pVar = this.fastBuffer;
                pVar.b = 0;
            } else {
                p pVar3 = new p(new byte[newCapacity]);
                this.fastBuffer = pVar3;
                pVar = pVar3;
            }
            ap.a(file, pVar.f2994a, i);
            int iC = pVar.c();
            long jB = pVar.b();
            this.dataEnd = iC + 12;
            if (iC >= 0 && iC <= i - 12 && jB == pVar.a(12, iC) && parseData() == 0) {
                this.checksum = jB;
                return true;
            }
        }
        return false;
    }

    private void mergeInvalids() {
        int size = this.invalids.size() - 1;
        c cVar = this.invalids.get(size);
        while (size > 0) {
            size--;
            c cVar2 = this.invalids.get(size);
            if (cVar.b == cVar2.f2960a) {
                cVar2.f2960a = cVar.f2960a;
                this.invalids.remove(size + 1);
            }
            cVar = cVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x017f, code lost:
    
        throw new java.lang.Exception(com.mbridge.msdk.foundation.tools.FastKV.PARSE_DATA_FAILED);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int parseData() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.FastKV.parseData():int");
    }

    private void preparePutBytes() throws IOException {
        ensureSize(this.updateSize);
        int i = this.dataEnd;
        this.updateStart = i;
        this.dataEnd = this.updateSize + i;
        this.fastBuffer.b = i;
        this.sizeChanged = true;
    }

    public void putAll(Map<String, Object> map) {
        putAll(map, null);
    }

    public synchronized void putAll(Map<String, Object> map, Map<Class, a> map2) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && !key.isEmpty()) {
                if (value instanceof String) {
                    putString(key, (String) value);
                } else if (value instanceof Boolean) {
                    putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    putLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof Double) {
                    putDouble(key, ((Double) value).doubleValue());
                } else if (value instanceof Set) {
                    Set set = (Set) value;
                    if (!set.isEmpty() && (set.iterator().next() instanceof String)) {
                        putStringSet(key, (Set) value);
                    }
                } else if (value instanceof byte[]) {
                    putArray(key, (byte[]) value);
                } else if (map2 != null) {
                    a aVar = map2.get(value.getClass());
                    if (aVar != null) {
                        putObject(key, value, aVar);
                    } else {
                        warning(new Exception("missing encoder for type:" + value.getClass()));
                    }
                } else {
                    warning(new Exception("missing encoders"));
                }
            }
        }
    }

    public synchronized void putArray(String str, byte[] bArr) {
        checkKey(str);
        if (bArr == null) {
            remove(str);
        } else {
            addOrUpdate(str, bArr, bArr, (f.a) this.data.get(str), (byte) 7);
        }
    }

    public synchronized void putBoolean(String str, boolean z) {
        checkKey(str);
        f.c cVar = (f.c) this.data.get(str);
        if (cVar == null) {
            wrapHeader(str, (byte) 1);
            int i = this.fastBuffer.b;
            this.fastBuffer.a((byte) (z ? 1 : 0));
            updateChange();
            this.data.put(str, new f.c(i, z));
            checkIfCommit();
        } else if (cVar.b != z) {
            cVar.b = z;
            updateBoolean((byte) (z ? 1 : 0), cVar.f2988a);
            checkIfCommit();
        }
    }

    public synchronized void putDouble(String str, double d) {
        checkKey(str);
        f.d dVar = (f.d) this.data.get(str);
        if (dVar == null) {
            wrapHeader(str, (byte) 5);
            int i = this.fastBuffer.b;
            this.fastBuffer.a(Double.doubleToRawLongBits(d));
            updateChange();
            this.data.put(str, new f.d(i, d));
            checkIfCommit();
        } else if (dVar.b != d) {
            long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
            long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(dVar.b) ^ jDoubleToRawLongBits;
            dVar.b = d;
            updateInt64(jDoubleToRawLongBits, jDoubleToRawLongBits2, dVar.f2988a);
            checkIfCommit();
        }
    }

    public synchronized void putFloat(String str, float f) {
        checkKey(str);
        f.e eVar = (f.e) this.data.get(str);
        if (eVar == null) {
            wrapHeader(str, (byte) 3);
            int i = this.fastBuffer.b;
            this.fastBuffer.b(Float.floatToRawIntBits(f));
            updateChange();
            this.data.put(str, new f.e(i, f));
            checkIfCommit();
        } else if (eVar.b != f) {
            eVar.b = f;
            updateInt32(Float.floatToRawIntBits(f), (Float.floatToRawIntBits(eVar.b) ^ r6) & 4294967295L, eVar.f2988a);
            checkIfCommit();
        }
    }

    public synchronized void putInt(String str, int i) {
        checkKey(str);
        f.C0273f c0273f = (f.C0273f) this.data.get(str);
        if (c0273f == null) {
            wrapHeader(str, (byte) 2);
            int i2 = this.fastBuffer.b;
            this.fastBuffer.b(i);
            updateChange();
            this.data.put(str, new f.C0273f(i2, i));
            checkIfCommit();
        } else if (c0273f.b != i) {
            c0273f.b = i;
            updateInt32(i, (c0273f.b ^ i) & 4294967295L, c0273f.f2988a);
            checkIfCommit();
        }
    }

    private void putKey(String str, int i) {
        this.fastBuffer.a((byte) i);
        if (i == str.length()) {
            str.getBytes(0, i, this.fastBuffer.f2994a, this.fastBuffer.b);
            this.fastBuffer.b += i;
            return;
        }
        this.fastBuffer.b(str);
    }

    public synchronized void putLong(String str, long j) {
        checkKey(str);
        f.g gVar = (f.g) this.data.get(str);
        if (gVar == null) {
            wrapHeader(str, (byte) 4);
            int i = this.fastBuffer.b;
            this.fastBuffer.a(j);
            updateChange();
            this.data.put(str, new f.g(i, j));
            checkIfCommit();
        } else if (gVar.b != j) {
            long j2 = j ^ gVar.b;
            gVar.b = j;
            updateInt64(j, j2, gVar.f2988a);
            checkIfCommit();
        }
    }

    public synchronized <T> void putObject(String str, T t, a<T> aVar) {
        checkKey(str);
        if (aVar == null) {
            throw new IllegalArgumentException("Encoder is null");
        }
        String strA = aVar.a();
        if (strA == null || strA.isEmpty() || strA.length() > 50) {
            throw new IllegalArgumentException("Invalid encoder tag:" + strA);
        }
        if (!this.encoderMap.containsKey(strA)) {
            throw new IllegalArgumentException("Encoder hasn't been registered");
        }
        if (t == null) {
            remove(str);
            return;
        }
        byte[] bArrA = null;
        try {
            bArrA = aVar.a(t);
        } catch (Exception e) {
            error(e);
        }
        if (bArrA == null) {
            remove(str);
            return;
        }
        int iA = p.a(strA);
        p pVar = new p(iA + 1 + bArrA.length);
        pVar.a((byte) iA);
        pVar.b(strA);
        pVar.a(bArrA);
        addOrUpdate(str, t, pVar.f2994a, (f.h) this.data.get(str), (byte) 8);
    }

    public synchronized void putString(String str, String str2) {
        byte[] bytes;
        checkKey(str);
        if (str2 == null) {
            remove(str);
        } else {
            f.i iVar = (f.i) this.data.get(str);
            if (str2.length() * 3 < 2048) {
                fastPutString(str, str2, iVar);
            } else {
                if (Build.VERSION.SDK_INT >= 19) {
                    bytes = str2.isEmpty() ? EMPTY_ARRAY : str2.getBytes(StandardCharsets.UTF_8);
                } else {
                    bytes = str2.isEmpty() ? EMPTY_ARRAY : str2.getBytes();
                }
                addOrUpdate(str, str2, bytes, iVar, (byte) 6);
            }
        }
    }

    public synchronized void putStringSet(String str, Set<String> set) {
        if (set == null) {
            remove(str);
        } else {
            putObject(str, set, am.f2979a);
        }
    }

    private void putStringValue(String str, int i) {
        this.fastBuffer.a((short) i);
        if (i == str.length()) {
            str.getBytes(0, i, this.fastBuffer.f2994a, this.fastBuffer.b);
        } else {
            this.fastBuffer.b(str);
        }
    }

    public synchronized void remove(String str) {
        f.b bVar = this.data.get(str);
        if (bVar != null) {
            this.data.remove(str);
            byte bA = bVar.a();
            String str2 = null;
            if (bA <= 5) {
                remove(bA, bVar.f2988a - (p.a(str) + 2), bVar.f2988a + TYPE_SIZE[bA]);
            } else {
                f.j jVar = (f.j) bVar;
                remove(bA, jVar.c, jVar.f2988a + jVar.e);
                if (jVar.b) {
                    str2 = (String) jVar.d;
                }
            }
            byte b2 = (byte) (bA | Byte.MIN_VALUE);
            if (this.writingMode == 0) {
                this.aBuffer.putLong(4, this.checksum);
                this.aBuffer.put(this.removeStart, b2);
                this.bBuffer.putLong(4, this.checksum);
                this.bBuffer.put(this.removeStart, b2);
            } else {
                this.fastBuffer.a(4, this.checksum);
            }
            this.removeStart = 0;
            if (str2 != null) {
                ap.a(new File(this.path + this.name, str2));
            }
            checkGC();
            checkIfCommit();
        }
    }

    private void remove(byte b2, int i, int i2) {
        countInvalid(i, i2);
        this.checksum ^= ((this.fastBuffer.f2994a[i] ^ r8) & 255) << ((i & 7) << 3);
        this.fastBuffer.f2994a[i] = (byte) (b2 | Byte.MIN_VALUE);
        this.removeStart = i;
    }

    private int saveArray(String str, byte[] bArr, byte b2) {
        this.tempExternalName = null;
        if (bArr.length < 2048) {
            return wrapArray(str, bArr, b2);
        }
        info("large value, key: " + str + ", size: " + bArr.length);
        String strB = ap.b();
        if (ap.a(new File(this.path + this.name, strB), bArr)) {
            this.tempExternalName = strB;
            byte[] bArr2 = new byte[32];
            strB.getBytes(0, 32, bArr2, 0);
            return wrapArray(str, bArr2, (byte) (b2 | 64));
        }
        error("save large value failed");
        return 0;
    }

    private void syncABBuffer(MappedByteBuffer mappedByteBuffer) {
        if (this.sizeChanged && mappedByteBuffer != this.aBuffer) {
            mappedByteBuffer.putInt(0, this.dataEnd - 12);
        }
        mappedByteBuffer.putLong(4, this.checksum);
        int i = this.removeStart;
        if (i != 0) {
            mappedByteBuffer.put(i, this.fastBuffer.f2994a[this.removeStart]);
        }
        if (this.updateSize != 0) {
            mappedByteBuffer.position(this.updateStart);
            mappedByteBuffer.put(this.fastBuffer.f2994a, this.updateStart, this.updateSize);
        }
    }

    public synchronized String toString() {
        return "FastKV: path:" + this.path + " name:" + this.name;
    }

    private void truncate(int i) throws IOException {
        int i2 = PAGE_SIZE;
        int newCapacity = getNewCapacity(i2, i + i2);
        if (newCapacity >= this.fastBuffer.f2994a.length) {
            return;
        }
        byte[] bArr = new byte[newCapacity];
        System.arraycopy(this.fastBuffer.f2994a, 0, bArr, 0, this.dataEnd);
        this.fastBuffer.f2994a = bArr;
        if (this.writingMode == 0) {
            try {
                long j = newCapacity;
                this.aChannel.truncate(j);
                MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.aBuffer = map;
                map.order(ByteOrder.LITTLE_ENDIAN);
                this.bChannel.truncate(j);
                MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.bBuffer = map2;
                map2.order(ByteOrder.LITTLE_ENDIAN);
            } catch (IOException e) {
                error(new Exception(MAP_FAILED, e));
                toBlockingMode();
            }
        }
        info(TRUNCATE_FINISH);
    }

    private void tryBlockingIO(File file, File file2) {
        try {
            if (loadWithBlockingIO(file)) {
                return;
            }
        } catch (IOException e) {
            warning(e);
        }
        clearData();
        try {
            if (loadWithBlockingIO(file2)) {
                return;
            }
        } catch (IOException e2) {
            warning(e2);
        }
        clearData();
    }

    private void updateBoolean(byte b2, int i) {
        long jShiftCheckSum = this.checksum ^ shiftCheckSum(1L, i);
        this.checksum = jShiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, jShiftCheckSum);
            this.aBuffer.put(i, b2);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.put(i, b2);
        } else {
            this.fastBuffer.a(4, jShiftCheckSum);
        }
        this.fastBuffer.f2994a[i] = b2;
    }

    private void updateBytes(int i, byte[] bArr) {
        int length = bArr.length;
        this.checksum ^= this.fastBuffer.a(i, length);
        this.fastBuffer.b = i;
        this.fastBuffer.a(bArr);
        long jA = this.checksum ^ this.fastBuffer.a(i, length);
        this.checksum = jA;
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            this.aBuffer.putLong(4, this.checksum);
            this.aBuffer.position(i);
            this.aBuffer.put(bArr);
            this.aBuffer.putInt(0, this.dataEnd - 12);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.position(i);
            this.bBuffer.put(bArr);
            return;
        }
        this.fastBuffer.a(4, jA);
    }

    private void updateChange() {
        this.checksum ^= this.fastBuffer.a(this.updateStart, this.updateSize);
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            syncABBuffer(this.aBuffer);
            this.aBuffer.putInt(0, this.dataEnd - 12);
            syncABBuffer(this.bBuffer);
        } else {
            if (this.sizeChanged) {
                this.fastBuffer.b(0, this.dataEnd - 12);
            }
            this.fastBuffer.a(4, this.checksum);
        }
        this.sizeChanged = false;
        this.removeStart = 0;
        this.updateSize = 0;
    }

    private void updateInt32(int i, long j, int i2) {
        long jShiftCheckSum = shiftCheckSum(j, i2) ^ this.checksum;
        this.checksum = jShiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, jShiftCheckSum);
            this.aBuffer.putInt(i2, i);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putInt(i2, i);
        } else {
            this.fastBuffer.a(4, jShiftCheckSum);
        }
        this.fastBuffer.b(i2, i);
    }

    private void updateInt64(long j, long j2, int i) {
        long jShiftCheckSum = shiftCheckSum(j2, i) ^ this.checksum;
        this.checksum = jShiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, jShiftCheckSum);
            this.aBuffer.putLong(i, j);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putLong(i, j);
        } else {
            this.fastBuffer.a(4, jShiftCheckSum);
        }
        this.fastBuffer.a(i, j);
    }

    private void updateObject(String str, Object obj, byte[] bArr, f.j jVar) throws IOException {
        int iSaveArray = saveArray(str, bArr, jVar.a());
        if (iSaveArray != 0) {
            String str2 = jVar.b ? (String) jVar.d : null;
            remove(jVar.a(), jVar.c, jVar.f2988a + jVar.e);
            boolean z = this.tempExternalName != null;
            jVar.c = this.updateStart;
            jVar.f2988a = iSaveArray;
            jVar.b = z;
            if (z) {
                jVar.d = this.tempExternalName;
                jVar.e = 32;
                this.tempExternalName = null;
            } else {
                jVar.d = obj;
                jVar.e = bArr.length;
            }
            updateChange();
            checkGC();
            if (str2 != null) {
                ap.a(new File(this.path + this.name, str2));
            }
        }
    }

    private void updateOffset(int i, int[] iArr) {
        for (f.b bVar : this.data.values()) {
            if (bVar.f2988a > i) {
                int i2 = bVar.f2988a;
                int i3 = 0;
                int length = (iArr.length >> 1) - 1;
                while (true) {
                    if (i3 > length) {
                        break;
                    }
                    int i4 = (i3 + length) >>> 1;
                    int i5 = iArr[i4 << 1];
                    if (i5 >= i2) {
                        if (i5 <= i2) {
                            length = i4;
                            break;
                        }
                        length = i4 - 1;
                    } else {
                        i3 = i4 + 1;
                    }
                }
                int i6 = iArr[(length << 1) + 1];
                bVar.f2988a -= i6;
                if (bVar.a() >= 6) {
                    ((f.j) bVar).c -= i6;
                }
            }
        }
    }

    private int wrapArray(String str, byte[] bArr, byte b2) throws IOException {
        wrapHeader(str, b2, bArr.length + 2);
        this.fastBuffer.a((short) bArr.length);
        int i = this.fastBuffer.b;
        this.fastBuffer.a(bArr);
        return i;
    }

    private void wrapHeader(String str, byte b2) throws IOException {
        wrapHeader(str, b2, TYPE_SIZE[b2]);
    }

    private void wrapHeader(String str, byte b2, int i) throws IOException {
        int iA = p.a(str);
        checkKeySize(iA);
        this.updateSize = iA + 2 + i;
        preparePutBytes();
        this.fastBuffer.a(b2);
        putKey(str, iA);
    }

    private boolean writeToABFile(p pVar) throws Exception {
        int length = pVar.f2994a.length;
        File file = new File(this.path, this.name + A_SUFFIX);
        File file2 = new File(this.path, this.name + B_SUFFIX);
        try {
            if (!ap.c(file) || !ap.c(file2)) {
                throw new Exception(OPEN_FILE_FAILED);
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
            long j = length;
            randomAccessFile.setLength(j);
            randomAccessFile2.setLength(j);
            this.aChannel = randomAccessFile.getChannel();
            this.bChannel = randomAccessFile2.getChannel();
            MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
            this.aBuffer = map;
            map.order(ByteOrder.LITTLE_ENDIAN);
            MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
            this.bBuffer = map2;
            map2.order(ByteOrder.LITTLE_ENDIAN);
            this.aBuffer.put(pVar.f2994a, 0, this.dataEnd);
            this.bBuffer.put(pVar.f2994a, 0, this.dataEnd);
            return true;
        } catch (Exception e) {
            error(e);
            return false;
        }
    }

    public static class Builder {
        private static final Map<String, FastKV> INSTANCE_MAP = new ConcurrentHashMap();
        private a[] encoders;
        private final String name;
        private final String path;
        private int writingMode = 0;

        public Builder(String str, String str2) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("path is empty");
            }
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            if (!str.endsWith("/")) {
                str = str + '/';
            }
            this.path = str;
            this.name = str2;
        }

        public Builder asyncBlocking() {
            this.writingMode = 1;
            return this;
        }

        public Builder blocking() {
            this.writingMode = 2;
            return this;
        }

        public FastKV build() {
            String str = this.path + this.name;
            Map<String, FastKV> map = INSTANCE_MAP;
            FastKV fastKV = map.get(str);
            if (fastKV == null) {
                synchronized (Builder.class) {
                    fastKV = map.get(str);
                    if (fastKV == null) {
                        fastKV = new FastKV(this.path, this.name, this.encoders, this.writingMode);
                        map.put(str, fastKV);
                    }
                }
            }
            return fastKV;
        }

        public Builder encoder(a[] aVarArr) {
            this.encoders = aVarArr;
            return this;
        }
    }

    private static class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name */
        int f2960a;
        int b;

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(c cVar) {
            return this.b - cVar.b;
        }

        c(int i, int i2) {
            this.b = i;
            this.f2960a = i2;
        }
    }
}
