package com.pgl.ssdk;

import org.json.JSONArray;

/* loaded from: classes4.dex */
public class Q {

    /* renamed from: a, reason: collision with root package name */
    public int f4298a;
    public String b;

    public Q(int i, String... strArr) {
        this.f4298a = i;
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        this.b = jSONArray.toString();
    }
}
