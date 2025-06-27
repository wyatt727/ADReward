package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: CampaignResourceH5TemplateVideo.java */
/* loaded from: classes4.dex */
public final class k extends c {
    @Override // com.mbridge.msdk.newreward.function.d.c.c
    protected final boolean a_() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 2;
    }

    public k(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        a(false);
        b(true);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        CampaignEx campaignExG;
        return (b() == null || (campaignExG = b().g()) == null || campaignExG.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignExG.getRewardTemplateMode().e())) ? "" : campaignExG.getRewardTemplateMode().e();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return new z(a(), b(), this);
    }
}
