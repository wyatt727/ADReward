package com.mbridge.msdk.mbbanner.common.a;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.my.tracker.ads.AdFormat;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;

/* compiled from: BannerV3Params.java */
/* loaded from: classes4.dex */
public class d extends e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3040a = "d";

    public static com.mbridge.msdk.foundation.same.net.h.e a(boolean z, Context context, String str, String str2, int i, b bVar) throws JSONException, NoSuchAlgorithmException {
        String strK = com.mbridge.msdk.foundation.controller.c.m().k();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.m().k() + com.mbridge.msdk.foundation.controller.c.m().b());
        String strA = ai.a(context, str);
        String strA2 = com.mbridge.msdk.foundation.same.a.d.a(str, AdFormat.BANNER);
        String closeIds = BannerUtils.getCloseIds(str);
        com.mbridge.msdk.foundation.same.net.h.e eVar = new com.mbridge.msdk.foundation.same.net.h.e();
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "app_id", strK);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, str);
        if (!TextUtils.isEmpty(bVar.d())) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.PLACEMENT_ID, bVar.d());
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, com.mbridge.msdk.foundation.same.net.h.e.e, strA);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, com.mbridge.msdk.foundation.same.net.h.e.f, str2);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ad_type", "296");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, TypedValues.CycleType.S_WAVE_OFFSET, i + "");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, com.mbridge.msdk.foundation.same.net.h.e.d, strA2);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "close_id", closeIds);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, bVar.a() + "");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "refresh_time", bVar.b() + "");
        if (!TextUtils.isEmpty(bVar.c())) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "token", bVar.c() + "");
        }
        if (!TextUtils.isEmpty(bVar.e())) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, bVar.e());
        }
        return eVar;
    }
}
