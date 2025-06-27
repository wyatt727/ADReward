package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;

/* compiled from: CampaignResourceDynamicTemplateBig.java */
/* loaded from: classes4.dex */
public final class e extends b {
    private final s b;

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 3;
    }

    public e(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        this.b = new s(a(), b(), this);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        return (a() == null || TextUtils.isEmpty(a().z())) ? "" : a().z();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return this.b;
    }
}
