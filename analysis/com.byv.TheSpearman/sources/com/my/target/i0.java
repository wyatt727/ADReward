package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class i0 extends p1 {
    public synchronized Map<String, String> a(MyTargetConfig myTargetConfig, Context context) {
        HashMap map = new HashMap();
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return map;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
        int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
        int intExtra3 = intentRegisterReceiver.getIntExtra("status", 1);
        if (intExtra >= 0 && intExtra2 > 0) {
            map.put(CmcdConfiguration.KEY_BUFFER_LENGTH, String.valueOf((intExtra * 100) / intExtra2));
        }
        map.put("bs", String.valueOf(intExtra3));
        return map;
    }
}
