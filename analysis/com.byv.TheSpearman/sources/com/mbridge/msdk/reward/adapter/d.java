package com.mbridge.msdk.reward.adapter;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ai;

/* compiled from: RewardVideoRequestParams.java */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f3430a;
    private final String b;
    private final boolean c;
    private final com.mbridge.msdk.videocommon.d.c d;
    private final String e;

    public d(String str, String str2, boolean z, com.mbridge.msdk.videocommon.d.c cVar, String str3) {
        this.f3430a = str;
        this.b = str2;
        this.c = z;
        this.d = cVar;
        this.e = str3;
    }

    public final e a(boolean z, String str, int i, String str2, String str3, String str4, String str5, boolean z2, int i2) {
        int iU;
        String strK = com.mbridge.msdk.foundation.controller.c.m().k();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.m().k() + com.mbridge.msdk.foundation.controller.c.m().b());
        int i3 = z ? 2 : 3;
        com.mbridge.msdk.videocommon.d.c cVar = this.d;
        int iT = 0;
        if (cVar != null) {
            iT = cVar.t();
            iU = this.d.u();
        } else {
            iU = 0;
        }
        String strA = com.mbridge.msdk.foundation.same.a.d.a(this.b, "reward");
        int i4 = this.c ? 287 : 94;
        e eVar = new e();
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "app_id", strK);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
        if (!TextUtils.isEmpty(this.f3430a)) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.f3430a);
        }
        if (com.mbridge.msdk.f.b.a()) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ttc_ids", str4 == null ? "" : str4);
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "install_ids", str3 == null ? "" : str3);
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "req_type", String.valueOf(i3));
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ad_num", String.valueOf(iT));
        if (this.c) {
            iU = 1;
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "tnum", String.valueOf(iU));
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, e.d, strA);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, e.e, str == null ? "" : str);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, String.valueOf(1));
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, e.f, str2 == null ? "" : str2);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ad_type", String.valueOf(i4));
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, TypedValues.CycleType.S_WAVE_OFFSET, String.valueOf(i));
        if (!TextUtils.isEmpty(str5)) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "token", str5);
        }
        if (this.c) {
            if (i2 == com.mbridge.msdk.foundation.same.a.H || i2 == com.mbridge.msdk.foundation.same.a.G) {
                com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ivrwd", "1");
            } else {
                com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ivrwd", "0");
            }
        }
        com.mbridge.msdk.videocommon.d.c cVar2 = this.d;
        if (cVar2 != null && !TextUtils.isEmpty(cVar2.k())) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "u_stid", this.d.k());
        }
        com.mbridge.msdk.videocommon.d.a aVarB = com.mbridge.msdk.videocommon.d.b.a().b();
        if (aVarB != null && !TextUtils.isEmpty(aVarB.b())) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "r_stid", aVarB.b());
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "rw_plus", z2 ? "1" : "0");
        String strD = ai.d(this.b);
        if (!TextUtils.isEmpty(strD)) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "j", strD);
        }
        String str6 = this.e;
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, str6 != null ? str6 : "");
        return eVar;
    }
}
