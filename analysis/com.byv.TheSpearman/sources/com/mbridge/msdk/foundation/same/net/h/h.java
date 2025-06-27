package com.mbridge.msdk.foundation.same.net.h;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;

/* compiled from: HeaderBiddingRequest.java */
/* loaded from: classes4.dex */
public class h extends c {
    public h(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.h.c
    public void addExtraParams(String str, e eVar) {
        try {
            try {
                int iA = ai.a();
                String strC = ai.c();
                if (eVar != null) {
                    eVar.a("misk_spt", String.valueOf(iA));
                    if (!TextUtils.isEmpty(strC)) {
                        eVar.a("misk_spt_det", strC);
                    }
                }
            } catch (Exception e) {
                ad.a("CampaignRequest", e.getMessage());
            }
        } finally {
            super.addExtraParams(str, eVar);
        }
    }
}
