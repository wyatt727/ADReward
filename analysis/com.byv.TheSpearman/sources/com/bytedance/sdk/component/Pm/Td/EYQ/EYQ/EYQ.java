package com.bytedance.sdk.component.Pm.Td.EYQ.EYQ;

import android.util.Log;
import com.json.t2;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* compiled from: DiskLruCache.java */
/* loaded from: classes2.dex */
public final class EYQ implements Closeable {
    static final Pattern EYQ = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream Td = new OutputStream() { // from class: com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.EYQ.2
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    };
    private long HX;
    private final File IPb;
    private final File Kbd;
    private final File Pm;
    private final int QQ;
    private final File VwS;
    final ExecutorService mZx;
    private int nWX;
    private final int tp;
    private Writer tsL;
    private long MxO = 0;
    private final LinkedHashMap<String, mZx> pi = new LinkedHashMap<>(0, 0.75f, true);
    private long KO = -1;
    private long hu = 0;
    private final Callable<Void> UB = new Callable<Void>() { // from class: com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.EYQ.1
        @Override // java.util.concurrent.Callable
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (EYQ.this) {
                if (EYQ.this.tsL == null) {
                    return null;
                }
                EYQ.this.QQ();
                if (EYQ.this.IPb()) {
                    EYQ.this.Kbd();
                    EYQ.this.nWX = 0;
                }
                return null;
            }
        }
    };

    private EYQ(File file, int i, int i2, long j, ExecutorService executorService) {
        this.Pm = file;
        this.QQ = i;
        this.Kbd = new File(file, "journal");
        this.IPb = new File(file, "journal.tmp");
        this.VwS = new File(file, "journal.bkp");
        this.tp = i2;
        this.HX = j;
        this.mZx = executorService;
    }

    public static EYQ EYQ(File file, int i, int i2, long j, ExecutorService executorService) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                EYQ(file2, file3, false);
            }
        }
        EYQ eyq = new EYQ(file, i, i2, j, executorService);
        if (eyq.Kbd.exists()) {
            try {
                eyq.Td();
                eyq.Pm();
                return eyq;
            } catch (IOException e) {
                Log.w("DiskLruCache ", file + " is corrupt: " + e.getMessage() + ", removing");
                eyq.mZx();
            }
        }
        file.mkdirs();
        EYQ eyq2 = new EYQ(file, i, i2, j, executorService);
        eyq2.Kbd();
        return eyq2;
    }

    private void Td() throws IOException {
        com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.Td td = new com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.Td(new FileInputStream(this.Kbd), Pm.EYQ);
        try {
            String strEYQ = td.EYQ();
            String strEYQ2 = td.EYQ();
            String strEYQ3 = td.EYQ();
            String strEYQ4 = td.EYQ();
            String strEYQ5 = td.EYQ();
            if (!"libcore.io.DiskLruCache".equals(strEYQ) || !"1".equals(strEYQ2) || !Integer.toString(this.QQ).equals(strEYQ3) || !Integer.toString(this.tp).equals(strEYQ4) || !"".equals(strEYQ5)) {
                throw new IOException("unexpected journal header: [" + strEYQ + ", " + strEYQ2 + ", " + strEYQ4 + ", " + strEYQ5 + t2.i.e);
            }
            int i = 0;
            while (true) {
                try {
                    Pm(td.EYQ());
                    i++;
                } catch (EOFException unused) {
                    this.nWX = i - this.pi.size();
                    if (td.mZx()) {
                        Kbd();
                    } else {
                        this.tsL = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.Kbd, true), Pm.EYQ));
                    }
                    com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(td);
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(td);
            throw th;
        }
    }

    private void Pm(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.pi.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        mZx mzx = this.pi.get(strSubstring);
        if (mzx == null) {
            mzx = new mZx(strSubstring);
            this.pi.put(strSubstring, mzx);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            mzx.Pm = true;
            mzx.Kbd = null;
            mzx.EYQ(strArrSplit);
            return;
        }
        if (iIndexOf2 != -1 || iIndexOf != 5 || !str.startsWith("DIRTY")) {
            if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
            }
            return;
        }
        mzx.Kbd = new C0085EYQ(mzx);
    }

    private void Pm() throws IOException {
        EYQ(this.IPb);
        Iterator<mZx> it = this.pi.values().iterator();
        while (it.hasNext()) {
            mZx next = it.next();
            int i = 0;
            if (next.Kbd == null) {
                while (i < this.tp) {
                    this.MxO += next.Td[i];
                    i++;
                }
            } else {
                next.Kbd = null;
                while (i < this.tp) {
                    EYQ(next.EYQ(i));
                    EYQ(next.mZx(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Kbd() throws IOException {
        Writer writer = this.tsL;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.IPb), Pm.EYQ));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.QQ));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.tp));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (mZx mzx : this.pi.values()) {
                if (mzx.Kbd != null) {
                    bufferedWriter.write("DIRTY " + mzx.mZx + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + mzx.mZx + mzx.EYQ() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.Kbd.exists()) {
                EYQ(this.Kbd, this.VwS, true);
            }
            EYQ(this.IPb, this.Kbd, false);
            this.VwS.delete();
            this.tsL = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.Kbd, true), Pm.EYQ));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    private static void EYQ(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void EYQ(File file, File file2, boolean z) throws IOException {
        if (z) {
            EYQ(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public synchronized Td EYQ(String str) throws IOException {
        VwS();
        Kbd(str);
        mZx mzx = this.pi.get(str);
        if (mzx == null) {
            return null;
        }
        if (!mzx.Pm) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.tp];
        for (int i = 0; i < this.tp; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(mzx.EYQ(i));
            } catch (FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.tp && inputStreamArr[i2] != null; i2++) {
                    com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(inputStreamArr[i2]);
                }
                return null;
            }
        }
        this.nWX++;
        this.tsL.append((CharSequence) ("READ " + str + '\n'));
        if (IPb()) {
            this.mZx.submit(this.UB);
        }
        return new Td(str, mzx.IPb, inputStreamArr, mzx.Td);
    }

    public C0085EYQ mZx(String str) throws IOException {
        return EYQ(str, -1L);
    }

    private synchronized C0085EYQ EYQ(String str, long j) throws IOException {
        VwS();
        Kbd(str);
        mZx mzx = this.pi.get(str);
        if (j != -1 && (mzx == null || mzx.IPb != j)) {
            return null;
        }
        if (mzx == null) {
            mzx = new mZx(str);
            this.pi.put(str, mzx);
        } else if (mzx.Kbd != null) {
            return null;
        }
        C0085EYQ c0085eyq = new C0085EYQ(mzx);
        mzx.Kbd = c0085eyq;
        this.tsL.write("DIRTY " + str + '\n');
        this.tsL.flush();
        return c0085eyq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void EYQ(C0085EYQ c0085eyq, boolean z) throws IOException {
        mZx mzx = c0085eyq.mZx;
        if (mzx.Kbd != c0085eyq) {
            throw new IllegalStateException();
        }
        if (z && !mzx.Pm) {
            for (int i = 0; i < this.tp; i++) {
                if (!c0085eyq.Td[i]) {
                    c0085eyq.mZx();
                    throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                }
                if (!mzx.mZx(i).exists()) {
                    c0085eyq.mZx();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.tp; i2++) {
            File fileMZx = mzx.mZx(i2);
            if (z) {
                if (fileMZx.exists()) {
                    File fileEYQ = mzx.EYQ(i2);
                    fileMZx.renameTo(fileEYQ);
                    long j = mzx.Td[i2];
                    long length = fileEYQ.length();
                    mzx.Td[i2] = length;
                    this.MxO = (this.MxO - j) + length;
                }
            } else {
                EYQ(fileMZx);
            }
        }
        this.nWX++;
        mzx.Kbd = null;
        if (mzx.Pm | z) {
            mzx.Pm = true;
            this.tsL.write("CLEAN " + mzx.mZx + mzx.EYQ() + '\n');
            if (z) {
                long j2 = this.hu;
                this.hu = 1 + j2;
                mzx.IPb = j2;
            }
        } else {
            this.pi.remove(mzx.mZx);
            this.tsL.write("REMOVE " + mzx.mZx + '\n');
        }
        this.tsL.flush();
        if (this.MxO > this.HX || IPb()) {
            this.mZx.submit(this.UB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean IPb() {
        int i = this.nWX;
        return i >= 2000 && i >= this.pi.size();
    }

    public synchronized boolean Td(String str) throws IOException {
        VwS();
        Kbd(str);
        mZx mzx = this.pi.get(str);
        if (mzx != null && mzx.Kbd == null) {
            for (int i = 0; i < this.tp; i++) {
                File fileEYQ = mzx.EYQ(i);
                if (fileEYQ.exists() && !fileEYQ.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(fileEYQ)));
                }
                this.MxO -= mzx.Td[i];
                mzx.Td[i] = 0;
            }
            this.nWX++;
            this.tsL.append((CharSequence) ("REMOVE " + str + '\n'));
            this.pi.remove(str);
            if (IPb()) {
                this.mZx.submit(this.UB);
            }
            return true;
        }
        return false;
    }

    private void VwS() {
        if (this.tsL == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void EYQ() throws IOException {
        VwS();
        QQ();
        this.tsL.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.tsL == null) {
            return;
        }
        Iterator it = new ArrayList(this.pi.values()).iterator();
        while (it.hasNext()) {
            mZx mzx = (mZx) it.next();
            if (mzx.Kbd != null) {
                mzx.Kbd.mZx();
            }
        }
        QQ();
        this.tsL.close();
        this.tsL = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void QQ() throws IOException {
        long j = this.HX;
        long j2 = this.KO;
        if (j2 >= 0) {
            j = j2;
        }
        while (this.MxO > j) {
            Td(this.pi.entrySet().iterator().next().getKey());
        }
        this.KO = -1L;
    }

    public void mZx() throws IOException {
        close();
        Pm.EYQ(this.Pm);
    }

    private void Kbd(String str) {
        if (EYQ.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    /* compiled from: DiskLruCache.java */
    public final class Td implements Closeable {
        private final long[] Kbd;
        private final InputStream[] Pm;
        private final long Td;
        private final String mZx;

        private Td(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.mZx = str;
            this.Td = j;
            this.Pm = inputStreamArr;
            this.Kbd = jArr;
        }

        public InputStream EYQ(int i) {
            return this.Pm[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            for (InputStream inputStream : this.Pm) {
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(inputStream);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.EYQ$EYQ, reason: collision with other inner class name */
    public final class C0085EYQ {
        private boolean Kbd;
        private boolean Pm;
        private final boolean[] Td;
        private final mZx mZx;

        private C0085EYQ(mZx mzx) {
            this.mZx = mzx;
            this.Td = mzx.Pm ? null : new boolean[EYQ.this.tp];
        }

        public OutputStream EYQ(int i) throws IOException {
            FileOutputStream fileOutputStream;
            C0086EYQ c0086eyq;
            if (i < 0 || i >= EYQ.this.tp) {
                throw new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + EYQ.this.tp);
            }
            synchronized (EYQ.this) {
                if (this.mZx.Kbd != this) {
                    throw new IllegalStateException();
                }
                if (!this.mZx.Pm) {
                    this.Td[i] = true;
                }
                File fileMZx = this.mZx.mZx(i);
                try {
                    fileOutputStream = new FileOutputStream(fileMZx);
                } catch (FileNotFoundException unused) {
                    EYQ.this.Pm.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileMZx);
                    } catch (FileNotFoundException unused2) {
                        return EYQ.Td;
                    }
                }
                c0086eyq = new C0086EYQ(fileOutputStream);
            }
            return c0086eyq;
        }

        public void EYQ() throws IOException {
            if (this.Pm) {
                EYQ.this.EYQ(this, false);
                EYQ.this.Td(this.mZx.mZx);
            } else {
                EYQ.this.EYQ(this, true);
            }
            this.Kbd = true;
        }

        public void mZx() throws IOException {
            EYQ.this.EYQ(this, false);
        }

        /* compiled from: DiskLruCache.java */
        /* renamed from: com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.EYQ$EYQ$EYQ, reason: collision with other inner class name */
        private class C0086EYQ extends FilterOutputStream {
            private C0086EYQ(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) throws IOException {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C0085EYQ.this.Pm = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C0085EYQ.this.Pm = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C0085EYQ.this.Pm = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C0085EYQ.this.Pm = true;
                }
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    private final class mZx {
        private long IPb;
        private C0085EYQ Kbd;
        private boolean Pm;
        private final long[] Td;
        private final String mZx;

        private mZx(String str) {
            this.mZx = str;
            this.Td = new long[EYQ.this.tp];
        }

        public String EYQ() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.Td) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void EYQ(String[] strArr) throws IOException {
            if (strArr.length != EYQ.this.tp) {
                throw mZx(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.Td[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw mZx(strArr);
                }
            }
        }

        private IOException mZx(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File EYQ(int i) {
            return new File(EYQ.this.Pm, this.mZx + "." + i);
        }

        public File mZx(int i) {
            return new File(EYQ.this.Pm, this.mZx + "." + i + ".tmp");
        }
    }
}
