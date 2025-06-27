package com.mbridge.msdk.mbnative.a;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: NativeCacheFactory.java */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static Map<Integer, b<String, List<Campaign>>> f3099a = new HashMap();

    public static b<String, List<Campaign>> a(int i) {
        if (f3099a.containsKey(Integer.valueOf(i))) {
            return f3099a.get(Integer.valueOf(i));
        }
        a aVar = new a(i);
        f3099a.put(Integer.valueOf(i), aVar);
        return aVar;
    }
}
