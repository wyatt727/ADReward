package com.applovin.impl;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class n8 extends z1 {
    private RandomAccessFile e;
    private Uri f;
    private long g;
    private boolean h;

    public static class b extends h5 {
        public b(String str, Throwable th, int i) {
            super(str, th, i);
        }

        public b(Throwable th, int i) {
            super(th, i);
        }
    }

    public n8() {
        super(false);
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) throws IOException {
        Uri uri = j5Var.f560a;
        this.f = uri;
        b(j5Var);
        RandomAccessFile randomAccessFileA = a(uri);
        this.e = randomAccessFileA;
        try {
            randomAccessFileA.seek(j5Var.g);
            long length = j5Var.h;
            if (length == -1) {
                length = this.e.length() - j5Var.g;
            }
            this.g = length;
            if (length >= 0) {
                this.h = true;
                c(j5Var);
                return this.g;
            }
            throw new b(null, null, 2008);
        } catch (IOException e) {
            throw new b(e, 2000);
        }
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new b(e, 2000);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
                g();
            }
        }
    }

    private static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.g == 0) {
            return -1;
        }
        try {
            int i3 = ((RandomAccessFile) yp.a((Object) this.e)).read(bArr, i, (int) Math.min(this.g, i2));
            if (i3 > 0) {
                this.g -= i3;
                d(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new b(e, 2000);
        }
    }

    private static RandomAccessFile a(Uri uri) throws b {
        try {
            return new RandomAccessFile((String) a1.a((Object) uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e, (yp.f1214a < 21 || !a.b(e.getCause())) ? 2005 : 2006);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
        } catch (SecurityException e2) {
            throw new b(e2, 2006);
        } catch (RuntimeException e3) {
            throw new b(e3, 2000);
        }
    }
}
