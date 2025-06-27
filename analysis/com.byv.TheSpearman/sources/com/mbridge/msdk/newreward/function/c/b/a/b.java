package com.mbridge.msdk.newreward.function.c.b.a;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.json.t2;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.newreward.function.common.MBridgeOffsetManager;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.Map;

/* compiled from: CreateObjectReceiver.java */
/* loaded from: classes4.dex */
public final class b implements com.mbridge.msdk.newreward.function.c.b.b {
    @Override // com.mbridge.msdk.newreward.function.c.b.b
    public final void a(Object obj) {
        try {
            Map map = (Map) obj;
            com.mbridge.msdk.newreward.function.c.d dVar = (com.mbridge.msdk.newreward.function.c.d) map.get("result");
            Map map2 = (Map) map.get("obj_map");
            String str = (String) map.get("type");
            char c = 65535;
            int iHashCode = str.hashCode();
            if (iHashCode != -2057274110) {
                if (iHashCode != -1019779949) {
                    if (iHashCode == 95346201 && str.equals("daily")) {
                        c = 0;
                    }
                } else if (str.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                    c = 1;
                }
            } else if (str.equals("bridge_ids")) {
                c = 2;
            }
            if (c == 0) {
                if (a("daily", dVar, map2)) {
                    return;
                }
                MBridgeDailyPlayModel mBridgeDailyPlayModel = new MBridgeDailyPlayModel(((Integer) map.get("mb_ad_type")).intValue(), (String) map.get("mb_ad_pid"), (String) map.get("mb_ad_unit_id"));
                map2.put("daily", mBridgeDailyPlayModel);
                dVar.a(mBridgeDailyPlayModel);
                return;
            }
            if (c == 1) {
                if (a(TypedValues.CycleType.S_WAVE_OFFSET, dVar, map2)) {
                    return;
                }
                MBridgeOffsetManager mBridgeOffsetManager = new MBridgeOffsetManager();
                map2.put(TypedValues.CycleType.S_WAVE_OFFSET, mBridgeOffsetManager);
                dVar.a(mBridgeOffsetManager);
                return;
            }
            if (c == 2 && !a("bridge_ids", dVar, map2)) {
                MBridgeIds mBridgeIds = new MBridgeIds((String) map.get("mb_ad_pid"), (String) map.get("mb_ad_unit_id"));
                map2.put("bridge_ids", mBridgeIds);
                dVar.a(mBridgeIds);
            }
        } catch (Exception e) {
            ad.a("CreateObjectReceiver", t2.h.h, e);
        }
    }

    private boolean a(String str, com.mbridge.msdk.newreward.function.c.d dVar, Map map) {
        if (map.get(str) == null) {
            return false;
        }
        dVar.a(map.get(str));
        return true;
    }
}
