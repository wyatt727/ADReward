package com.json;

import android.app.Activity;
import android.text.TextUtils;
import com.json.mediationsdk.metadata.a;
import com.json.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class o extends k4 {
    public o(a0 a0Var) {
        super(a0Var);
    }

    public void a() {
        a(y.SESSION_CAPPED);
    }

    public void a(Activity activity, String str) {
        HashMap map = new HashMap();
        map.put("placement", str);
        if (activity != null) {
            map.put(IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
        }
        a(y.SHOW_AD, map);
    }

    public void a(String str) {
        HashMap map = new HashMap();
        map.put("placement", str);
        a(y.AD_CLICKED, map);
    }

    public void a(String str, int i, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("placement", str);
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        map.put("reason", str2);
        if (!TextUtils.isEmpty(str3)) {
            map.put(IronSourceConstants.EVENTS_EXT1, str3);
        }
        a(y.SHOW_AD_FAILED, map);
    }

    public void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            map.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        a(y.AD_CLOSED, map);
    }

    public void a(String str, String str2, int i, long j, String str3, long j2, Map<String, Object> map, String str4) {
        HashMap map2 = new HashMap();
        map2.put("placement", str);
        map2.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        map2.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i));
        map2.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j2 != 0) {
            map2.put("duration", Long.valueOf(j2));
        }
        if (map != null) {
            map2.putAll(map);
        }
        if (!TextUtils.isEmpty(str4)) {
            map2.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        a(y.AD_REWARDED, map2, j);
    }

    public void a(boolean z) {
        HashMap map = new HashMap();
        map.put("status", z ? a.g : "false");
        a(y.SHOW_AD_CHANCE, map);
    }

    public void b(String str) {
        HashMap map = new HashMap();
        map.put("placement", str);
        a(y.AD_DISMISS_SCREEN, map);
    }

    public void c(String str) {
        HashMap map = new HashMap();
        map.put("placement", str);
        a(y.AD_ENDED, map);
    }

    public void d(String str) {
        HashMap map = new HashMap();
        map.put("placement", str);
        a(y.AD_LEFT_APPLICATION, map);
    }

    public void e(String str) {
        HashMap map = new HashMap();
        map.put("placement", str);
        a(y.AD_OPENED, map);
    }

    public void f(String str) {
        HashMap map = new HashMap();
        map.put("placement", str);
        a(y.AD_PRESENT_SCREEN, map);
    }

    public void g(String str) {
        HashMap map = new HashMap();
        map.put("placement", str);
        a(y.AD_STARTED, map);
    }

    public void h(String str) {
        HashMap map = new HashMap();
        map.put("placement", str);
        a(y.AD_VISIBLE, map);
    }

    public void i(String str) {
        HashMap map = new HashMap();
        map.put("placement", str);
        a(y.PLACEMENT_CAPPED, map);
    }

    public void j(String str) {
        HashMap map = new HashMap();
        map.put("placement", str);
        a(y.SHOW_AD_SUCCESS, map);
    }
}
