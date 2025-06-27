package com.json;

import com.json.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class c8 extends k4 {
    public c8(a0 a0Var) {
        super(a0Var);
    }

    public void a() {
        a(y.INIT_SUCCESS);
    }

    public void a(int i, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        map.put("reason", str);
        a(y.INIT_FAILED, map);
    }

    public void a(long j) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        a(y.INIT_ENDED, map);
    }

    public void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str + "|" + str2);
        a(y.INIT_STARTED, map);
    }
}
