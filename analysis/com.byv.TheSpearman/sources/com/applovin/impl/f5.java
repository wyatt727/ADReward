package com.applovin.impl;

import android.net.Uri;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Charsets;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class f5 extends z1 {
    private j5 e;
    private byte[] f;
    private int g;
    private int h;

    public f5() {
        super(false);
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) throws h5, ah {
        b(j5Var);
        this.e = j5Var;
        Uri uri = j5Var.f560a;
        String scheme = uri.getScheme();
        a1.a("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrA = yp.a(uri.getSchemeSpecificPart(), ",");
        if (strArrA.length == 2) {
            String str = strArrA[1];
            if (strArrA[0].contains(";base64")) {
                try {
                    this.f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw ah.b("Error while parsing Base64 encoded string: " + str, e);
                }
            } else {
                this.f = yp.c(URLDecoder.decode(str, Charsets.US_ASCII.name()));
            }
            long j = j5Var.g;
            byte[] bArr = this.f;
            if (j <= bArr.length) {
                int i = (int) j;
                this.g = i;
                int length = bArr.length - i;
                this.h = length;
                long j2 = j5Var.h;
                if (j2 != -1) {
                    this.h = (int) Math.min(length, j2);
                }
                c(j5Var);
                long j3 = j5Var.h;
                return j3 != -1 ? j3 : this.h;
            }
            this.f = null;
            throw new h5(2008);
        }
        throw ah.b("Unexpected URI format: " + uri, null);
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        j5 j5Var = this.e;
        if (j5Var != null) {
            return j5Var.f560a;
        }
        return null;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        if (this.f != null) {
            this.f = null;
            g();
        }
        this.e = null;
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(yp.a((Object) this.f), this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        d(iMin);
        return iMin;
    }
}
