package com.my.target;

import android.app.UiModeManager;
import android.content.Context;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class m0 extends p1 {
    public static boolean a(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 3;
    }

    public Map<String, String> a(MyTargetConfig myTargetConfig, Context context) {
        HashMap map = new HashMap();
        if (a(context)) {
            map.put("isc", "1");
        }
        return map;
    }
}
