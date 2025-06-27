package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.dl;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.Arrays;
import okio.Utf8;

/* loaded from: classes.dex */
final class qg extends dl {
    private static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean n;

    qg() {
    }

    public static boolean b(yg ygVar) {
        int iA = ygVar.a();
        byte[] bArr = o;
        if (iA < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        ygVar.a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private long a(byte[] bArr) {
        byte b = bArr[0];
        int i = b & 255;
        int i2 = b & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1 && i2 != 2) {
            i3 = bArr[1] & Utf8.REPLACEMENT_BYTE;
        }
        int i4 = i >> 3;
        return i3 * (i4 >= 16 ? 2500 << r0 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? MBridgeCommon.DEFAULT_LOAD_TIMEOUT : 10000 << r0);
    }

    @Override // com.applovin.impl.dl
    protected long a(yg ygVar) {
        return b(a(ygVar.c()));
    }

    @Override // com.applovin.impl.dl
    protected boolean a(yg ygVar, long j, dl.b bVar) {
        if (!this.n) {
            byte[] bArrCopyOf = Arrays.copyOf(ygVar.c(), ygVar.e());
            bVar.f368a = new d9.b().f("audio/opus").c(rg.b(bArrCopyOf)).n(OpusUtil.SAMPLE_RATE).a(rg.a(bArrCopyOf)).a();
            this.n = true;
            return true;
        }
        a1.a(bVar.f368a);
        boolean z = ygVar.j() == 1332770163;
        ygVar.f(0);
        return z;
    }

    @Override // com.applovin.impl.dl
    protected void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = false;
        }
    }
}
