package com.mbridge.msdk.c.a;

import android.content.Context;
import com.json.i5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;

/* compiled from: SettingRequestDiff.java */
/* loaded from: classes4.dex */
public final class d {
    public static void a(Context context, e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            eVar.a(i5.w0, z.c());
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SettingRequestDiff", e.getMessage());
            }
        }
    }
}
