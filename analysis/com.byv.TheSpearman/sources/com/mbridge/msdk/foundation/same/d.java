package com.mbridge.msdk.foundation.same;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;

/* compiled from: SameTools.java */
/* loaded from: classes4.dex */
public final class d {
    public static int a(CampaignEx campaignEx, String str) {
        int iB;
        if (campaignEx == null) {
            return -1;
        }
        try {
            if (!TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                iB = ai.b(campaignEx.getMof_template_url());
            } else {
                iB = ai.b(str);
            }
            return iB;
        } catch (Exception e) {
            ad.b("SameTools", e.getMessage());
            return -1;
        }
    }
}
