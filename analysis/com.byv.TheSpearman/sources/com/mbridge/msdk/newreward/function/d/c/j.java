package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* compiled from: CampaignResourceH5TemplateEndCard.java */
/* loaded from: classes4.dex */
public final class j extends c {
    private final v c;

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 4;
    }

    public j(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        this.c = new v(a(), b(), this);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        CampaignEx campaignExG;
        return (b() == null || (campaignExG = b().g()) == null || TextUtils.isEmpty(campaignExG.getendcard_url())) ? "" : campaignExG.getendcard_url();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return this.c;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.c
    protected final boolean a_() {
        if (b() == null) {
            return false;
        }
        CampaignEx campaignExG = b().g();
        if (campaignExG == null || TextUtils.isEmpty(campaignExG.getendcard_url())) {
            return true;
        }
        ArrayList<Integer> rsIgnoreCheckRule = campaignExG.getRsIgnoreCheckRule();
        if (rsIgnoreCheckRule != null && rsIgnoreCheckRule.size() != 0) {
            try {
                return rsIgnoreCheckRule.contains(2);
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
