package com.mbridge.msdk.foundation.same.report.d;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ParameterWrapper.java */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f2928a = new HashMap();

    public final void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (obj instanceof String) {
                if (!TextUtils.isEmpty((String) obj)) {
                    this.f2928a.put(str, (String) obj);
                }
            } else {
                this.f2928a.put(str, obj + "");
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public final boolean a(String str) {
        return this.f2928a.containsKey(str);
    }

    public final Object b(String str) {
        return this.f2928a.get(str);
    }

    public final void c(String str) {
        if (this.f2928a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f2928a.remove(str);
    }

    public final Map<String, String> a() {
        return this.f2928a;
    }

    public final void a(d dVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (dVar == null || (map = dVar.f2928a) == null || (map2 = this.f2928a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public final void a(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.f2928a.putAll(map);
    }
}
