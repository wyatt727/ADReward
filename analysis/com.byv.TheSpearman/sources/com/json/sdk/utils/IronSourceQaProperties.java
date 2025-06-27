package com.json.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class IronSourceQaProperties {

    /* renamed from: a, reason: collision with root package name */
    private static IronSourceQaProperties f2280a;
    private static Map<String, String> b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f2280a == null) {
            f2280a = new IronSourceQaProperties();
        }
        return f2280a;
    }

    public static boolean isInitialized() {
        return f2280a != null;
    }

    public Map<String, String> getParameters() {
        return b;
    }

    public void setQaParameter(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        b.put(str, str2);
    }
}
