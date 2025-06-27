package com.applovin.impl;

import com.applovin.impl.we;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class qk extends ak {

    /* renamed from: a, reason: collision with root package name */
    private final yg f839a = new yg();
    private final xg b = new xg();
    private io c;

    @Override // com.applovin.impl.ak
    protected we a(ze zeVar, ByteBuffer byteBuffer) {
        io ioVar = this.c;
        if (ioVar == null || zeVar.j != ioVar.c()) {
            io ioVar2 = new io(zeVar.f);
            this.c = ioVar2;
            ioVar2.a(zeVar.f - zeVar.j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f839a.a(bArrArray, iLimit);
        this.b.a(bArrArray, iLimit);
        this.b.d(39);
        long jA = (this.b.a(1) << 32) | this.b.a(32);
        this.b.d(20);
        int iA = this.b.a(12);
        int iA2 = this.b.a(8);
        we.b skVar = null;
        this.f839a.g(14);
        if (iA2 == 0) {
            skVar = new sk();
        } else if (iA2 == 255) {
            skVar = vh.a(this.f839a, iA, jA);
        } else if (iA2 == 4) {
            skVar = tk.a(this.f839a);
        } else if (iA2 == 5) {
            skVar = rk.a(this.f839a, jA, this.c);
        } else if (iA2 == 6) {
            skVar = eo.a(this.f839a, jA, this.c);
        }
        return skVar == null ? new we(new we.b[0]) : new we(skVar);
    }
}
