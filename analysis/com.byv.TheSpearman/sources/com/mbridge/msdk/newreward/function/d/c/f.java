package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: CampaignResourceDynamicTemplateEndCard.java */
/* loaded from: classes4.dex */
public final class f extends b {
    private final t b;

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 4;
    }

    public f(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        this.b = new t(a(), b(), this);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        CampaignEx campaignExG;
        return (b() == null || (campaignExG = b().g()) == null || TextUtils.isEmpty(campaignExG.getendcard_url())) ? "" : campaignExG.getendcard_url();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return this.b;
    }
}
