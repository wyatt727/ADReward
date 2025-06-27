package com.json;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class fe {
    private int b = 4;
    private int c = 4;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, Boolean> f1784a = new a();

    class a extends HashMap<String, Boolean> {
        a() {
            put(x6.k, Boolean.valueOf(fe.this.b == 0));
            put(x6.l, Boolean.valueOf(fe.this.c == 0));
            Boolean bool = Boolean.FALSE;
            put(x6.m, bool);
            put(x6.n, bool);
        }
    }

    fe() {
    }

    public JSONObject a() {
        return new JSONObject(this.f1784a);
    }

    void a(String str, int i, boolean z) {
        if (this.f1784a.containsKey(str)) {
            this.f1784a.put(str, Boolean.valueOf(i == 0));
        }
        this.f1784a.put(x6.m, Boolean.valueOf(z));
        this.f1784a.put(x6.n, Boolean.valueOf((this.f1784a.get(x6.l).booleanValue() || this.f1784a.get(x6.k).booleanValue()) && this.f1784a.get(x6.m).booleanValue()));
    }
}
