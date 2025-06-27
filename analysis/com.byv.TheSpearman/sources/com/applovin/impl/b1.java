package com.applovin.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class b1 extends z1 {
    private final AssetManager e;
    private Uri f;
    private InputStream g;
    private long h;
    private boolean i;

    public static final class a extends h5 {
        public a(Throwable th, int i) {
            super(th, i);
        }
    }

    public b1(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) throws IOException {
        try {
            Uri uri = j5Var.f560a;
            this.f = uri;
            String strSubstring = (String) a1.a((Object) uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            b(j5Var);
            InputStream inputStreamOpen = this.e.open(strSubstring, 1);
            this.g = inputStreamOpen;
            if (inputStreamOpen.skip(j5Var.g) >= j5Var.g) {
                long j = j5Var.h;
                if (j != -1) {
                    this.h = j;
                } else {
                    long jAvailable = this.g.available();
                    this.h = jAvailable;
                    if (jAvailable == 2147483647L) {
                        this.h = -1L;
                    }
                }
                this.i = true;
                c(j5Var);
                return this.h;
            }
            throw new a(null, 2008);
        } catch (a e) {
            throw e;
        } catch (IOException e2) {
            throw new a(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
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
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new a(e, 2000);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                g();
            }
        }
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(e, 2000);
            }
        }
        int i3 = ((InputStream) yp.a((Object) this.g)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - i3;
        }
        d(i3);
        return i3;
    }
}
