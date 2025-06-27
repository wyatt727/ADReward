package com.mbridge.msdk.newreward.function.g;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.same.net.h.f;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.CustomInfoManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* compiled from: RewardVideoParameters.java */
/* loaded from: classes4.dex */
public final class d extends a {
    private final int c;
    private final String d;
    private final String e;
    private final boolean f;
    private final String g;
    private int h;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f3385a = new HashMap();
    private boolean i = false;
    private final Context b = com.mbridge.msdk.foundation.controller.c.m().c();

    public d(int i, String str, String str2, boolean z, String str3) {
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = str3;
    }

    public final int b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.g;
    }

    public final Map<String, String> f() throws JSONException {
        int iU;
        Map<String, String> mapA = a();
        if (mapA != null) {
            this.f3385a.putAll(mapA);
        }
        e eVar = new e(this.f3385a);
        if (com.mbridge.msdk.f.b.a()) {
            eVar.a("gp_version", z.c(this.b));
        }
        eVar.a("version_flag", "1");
        if (com.mbridge.msdk.f.b.a()) {
            com.mbridge.msdk.foundation.controller.authoritycontroller.c.c(true);
        }
        eVar.a("misk_spt", String.valueOf(ai.a()));
        String strC = ai.c();
        if (!TextUtils.isEmpty(strC)) {
            eVar.a("misk_spt_det", strC);
        }
        String str = this.e;
        if (str != null) {
            String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str, this.f ? 7 : 8);
            if (!TextUtils.isEmpty(customInfoByUnitId)) {
                eVar.a("ch_info", customInfoByUnitId);
            }
            k kVarD = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), str);
            if (kVarD != null && !TextUtils.isEmpty(kVarD.a())) {
                eVar.a("u_stid", kVarD.a());
            }
        }
        String strA = com.mbridge.msdk.foundation.same.a.d.a(this.e, "reward");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.e);
        if (!TextUtils.isEmpty(this.d)) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.d);
        }
        com.mbridge.msdk.videocommon.d.c cVarA = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.e);
        int iT = 0;
        if (cVarA != null) {
            iT = cVarA.t();
            iU = cVarA.u();
        } else {
            iU = 0;
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ad_num", String.valueOf(iT));
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "tnum", String.valueOf(this.c != 287 ? iU : 1));
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, e.d, strA);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, e.f, MBridgeGlobalCommon.SESSION_ID == null ? "" : MBridgeGlobalCommon.SESSION_ID);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ad_type", String.valueOf(this.c));
        if (!TextUtils.isEmpty(this.g)) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "token", this.g);
        }
        if (this.c == 287) {
            if (this.h == com.mbridge.msdk.foundation.same.a.H || this.h == com.mbridge.msdk.foundation.same.a.G) {
                com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ivrwd", "1");
            } else {
                com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ivrwd", "0");
            }
        }
        if (cVarA != null && !TextUtils.isEmpty(cVarA.k())) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "u_stid", cVarA.k());
        }
        com.mbridge.msdk.videocommon.d.a aVarB = com.mbridge.msdk.videocommon.d.b.a().b();
        if (aVarB != null && !TextUtils.isEmpty(aVarB.b())) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "r_stid", aVarB.b());
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "rw_plus", this.i ? "1" : "0");
        String strD = ai.d(this.e);
        if (!TextUtils.isEmpty(strD)) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "j", strD);
        }
        f.a(eVar, this.b);
        f.a(eVar);
        f.c(eVar);
        f.e(eVar);
        f.f(eVar);
        return eVar.a();
    }

    public final void a(boolean z) {
        this.i = z;
    }

    public final void a(int i) {
        this.h = i;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f3385a.put(e.e, str);
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str) || !com.mbridge.msdk.f.b.a()) {
            return;
        }
        this.f3385a.put("install_ids", str);
    }

    public final void c(String str) {
        if (!TextUtils.isEmpty(str) && com.mbridge.msdk.f.b.a() && com.mbridge.msdk.f.b.a()) {
            this.f3385a.put("ttc_ids", str);
        }
    }

    public final void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f3385a.put(e.f, str);
    }

    public final void b(int i) {
        this.f3385a.put(TypedValues.CycleType.S_WAVE_OFFSET, String.valueOf(i));
    }

    public final void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f3385a.put(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, str);
    }

    public final void c(int i) {
        this.f3385a.put("req_type", String.valueOf(i));
    }
}
