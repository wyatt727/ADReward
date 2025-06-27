package com.applovin.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class h7 extends bk {
    private final i7 o;

    public h7(List list) {
        super("DvbDecoder");
        yg ygVar = new yg((byte[]) list.get(0));
        this.o = new i7(ygVar.C(), ygVar.C());
    }

    @Override // com.applovin.impl.bk
    protected kl a(byte[] bArr, int i, boolean z) {
        if (z) {
            this.o.d();
        }
        return new j7(this.o.a(bArr, i));
    }
}
