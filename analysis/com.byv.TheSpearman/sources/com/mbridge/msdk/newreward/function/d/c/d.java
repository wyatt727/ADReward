package com.mbridge.msdk.newreward.function.d.c;

/* compiled from: BaseCampaignResourceTemplate.java */
/* loaded from: classes4.dex */
public abstract class d<Resource> extends a<Resource> {
    protected abstract boolean f();

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final boolean i() {
        return true;
    }

    public d(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.a
    public final boolean c() {
        return f() || super.c();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.a
    public final boolean d() {
        return f() || super.d();
    }
}
