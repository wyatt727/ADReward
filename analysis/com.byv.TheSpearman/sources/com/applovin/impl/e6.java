package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.jc;
import com.applovin.impl.ma;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class e6 implements hc {

    /* renamed from: a, reason: collision with root package name */
    private final int f377a;

    @Override // com.applovin.impl.hc
    public /* synthetic */ void a(long j) {
        hc.CC.$default$a(this, j);
    }

    public e6() {
        this(-1);
    }

    @Override // com.applovin.impl.hc
    public int a(int i) {
        int i2 = this.f377a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    public e6(int i) {
        this.f377a = i;
    }

    @Override // com.applovin.impl.hc
    public long a(hc.a aVar) {
        IOException iOException = aVar.c;
        if ((iOException instanceof ah) || (iOException instanceof FileNotFoundException) || (iOException instanceof ma.a) || (iOException instanceof jc.h) || h5.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((aVar.d - 1) * 1000, 5000);
    }
}
