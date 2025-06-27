package com.mbridge.msdk.newreward.function.d.c;

/* compiled from: CampaignResourceEndScreenTemplate.java */
/* loaded from: classes4.dex */
public final class h extends c {
    @Override // com.mbridge.msdk.newreward.function.d.c.c
    protected final boolean a_() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 8;
    }

    public h(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        b(true);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        return (b() == null || b().g() == null) ? "" : b().g().getEndScreenUrl();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return new v(a(), b(), this);
    }
}
