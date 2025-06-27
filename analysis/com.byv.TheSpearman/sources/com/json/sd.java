package com.json;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class sd extends k4 {
    public sd(a0 a0Var) {
        super(a0Var);
    }

    public void a() {
        a(y.COLLECT_TOKEN, new HashMap());
    }

    public void a(long j) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        a(y.COLLECT_TOKENS_COMPLETED, map);
    }

    public void a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        a(y.COLLECT_TOKENS_FAILED, map);
    }

    public void a(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        a(y.INSTANCE_COLLECT_TOKEN, map2);
    }

    public void a(Map<String, Object> map, long j) {
        HashMap map2 = new HashMap();
        map2.put("duration", Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        a(y.INSTANCE_COLLECT_TOKEN_SUCCESS, map2);
    }

    public void a(Map<String, Object> map, long j, String str) {
        HashMap map2 = new HashMap();
        map2.put("duration", Long.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            map2.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        a(y.INSTANCE_COLLECT_TOKEN_FAILED, map2);
    }

    public void b(Map<String, Object> map, long j) {
        HashMap map2 = new HashMap();
        map2.put("duration", Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        a(y.INSTANCE_COLLECT_TOKEN_TIMED_OUT, map2);
    }
}
