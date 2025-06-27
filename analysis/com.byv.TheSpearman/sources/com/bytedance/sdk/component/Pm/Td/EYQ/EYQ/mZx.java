package com.bytedance.sdk.component.Pm.Td.EYQ.EYQ;

import android.util.Log;
import com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.EYQ;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* compiled from: LruCountDiskCache.java */
/* loaded from: classes2.dex */
public class mZx implements com.bytedance.sdk.component.Pm.Td {
    private long EYQ;
    private EYQ mZx;

    public mZx(File file, long j, ExecutorService executorService) {
        this.EYQ = j;
        try {
            this.mZx = EYQ.EYQ(file, 20210302, 1, j, executorService);
        } catch (IOException e) {
            Log.w("LruCountDiskCache", e.toString());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.Pm.Td
    public InputStream EYQ(String str) {
        EYQ eyq = this.mZx;
        if (eyq == null) {
            return null;
        }
        try {
            EYQ.Td tdEYQ = eyq.EYQ(str);
            if (tdEYQ != null) {
                return tdEYQ.EYQ(0);
            }
        } catch (IOException e) {
            Log.w("LruCountDiskCache", e.getMessage());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Pm.EYQ
    public boolean EYQ(String str, byte[] bArr) throws Throwable {
        Closeable closeable;
        EYQ.C0085EYQ c0085eyqMZx;
        EYQ eyq = this.mZx;
        if (eyq == null || bArr == null || str == null) {
            return false;
        }
        EYQ.C0085EYQ c0085eyq = null;
        Closeable closeable2 = null;
        try {
            try {
                c0085eyqMZx = eyq.mZx(str);
            } catch (Throwable th) {
                th = th;
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(closeable2);
                throw th;
            }
        } catch (IOException e) {
            e = e;
            closeable = null;
        }
        try {
            if (c0085eyqMZx == null) {
                Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(null);
                return false;
            }
            OutputStream outputStreamEYQ = c0085eyqMZx.EYQ(0);
            if (outputStreamEYQ != EYQ.Td) {
                outputStreamEYQ.write(bArr);
                c0085eyqMZx.EYQ();
                this.mZx.EYQ();
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(outputStreamEYQ);
                return true;
            }
            Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
            com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(outputStreamEYQ);
            return false;
        } catch (IOException e2) {
            e = e2;
            closeable = null;
            c0085eyq = c0085eyqMZx;
            try {
                Log.w("LruCountDiskCache", e.toString());
                if (c0085eyq != null) {
                    try {
                        c0085eyq.mZx();
                    } catch (IOException unused) {
                    }
                }
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(closeable);
                return false;
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(closeable2);
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdk.component.Pm.EYQ
    /* renamed from: mZx, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] EYQ(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStreamEYQ;
        EYQ eyq = this.mZx;
        InputStream inputStream = null;
        if (eyq == null || str == null) {
            return null;
        }
        try {
            EYQ.Td tdEYQ = eyq.EYQ(str);
            if (tdEYQ == null) {
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(null);
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(null);
                return null;
            }
            inputStreamEYQ = tdEYQ.EYQ(0);
            if (inputStreamEYQ != null) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = inputStreamEYQ.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                            }
                        } catch (IOException e) {
                            e = e;
                            Log.w("LruCountDiskCache", e.toString());
                            com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(inputStreamEYQ);
                            com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(byteArrayOutputStream);
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStreamEYQ;
                        com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(inputStream);
                        com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    byteArrayOutputStream = null;
                    Log.w("LruCountDiskCache", e.toString());
                    com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(inputStreamEYQ);
                    com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(byteArrayOutputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = null;
                    inputStream = inputStreamEYQ;
                    com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(inputStream);
                    com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(byteArrayOutputStream);
                    throw th;
                }
            } else {
                byteArrayOutputStream = null;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(inputStreamEYQ);
            com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(byteArrayOutputStream);
            return byteArray;
        } catch (IOException e3) {
            e = e3;
            inputStreamEYQ = null;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(inputStream);
            com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(byteArrayOutputStream);
            throw th;
        }
    }

    @Override // com.bytedance.sdk.component.Pm.EYQ
    /* renamed from: Td, reason: merged with bridge method [inline-methods] */
    public boolean mZx(String str) throws IOException {
        try {
            try {
                EYQ.Td tdEYQ = this.mZx.EYQ(str);
                boolean z = tdEYQ != null;
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(tdEYQ);
                return z;
            } catch (IOException e) {
                Log.w("LruCountDiskCache", e.getMessage());
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(null);
                return false;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(null);
            throw th;
        }
    }
}
