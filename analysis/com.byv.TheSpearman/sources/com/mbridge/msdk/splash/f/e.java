package com.mbridge.msdk.splash.f;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.out.MBridgeIds;

/* compiled from: SplashV3Params.java */
/* loaded from: classes4.dex */
public final class e extends a {
    public static com.mbridge.msdk.foundation.same.net.h.e a(Context context, MBridgeIds mBridgeIds, f fVar) {
        String strK = com.mbridge.msdk.foundation.controller.c.m().k();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.m().k() + com.mbridge.msdk.foundation.controller.c.m().b());
        com.mbridge.msdk.foundation.same.net.h.e eVar = new com.mbridge.msdk.foundation.same.net.h.e();
        String strA = com.mbridge.msdk.foundation.same.a.d.a(mBridgeIds.getUnitId(), "splash");
        String strA2 = ai.a(context, mBridgeIds.getUnitId());
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "app_id", strK);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, mBridgeIds.getUnitId());
        if (!TextUtils.isEmpty(mBridgeIds.getPlacementId())) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.PLACEMENT_ID, mBridgeIds.getPlacementId());
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "req_type", fVar.a() + "");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ad_num", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "tnum", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, com.mbridge.msdk.foundation.same.net.h.e.d, strA);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, com.mbridge.msdk.foundation.same.net.h.e.e, strA2);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, com.mbridge.msdk.foundation.same.net.h.e.f, fVar.b());
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ad_type", "297");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, TypedValues.CycleType.S_WAVE_OFFSET, fVar.c() + "");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, fVar.d() + "x" + fVar.e());
        return eVar;
    }
}
