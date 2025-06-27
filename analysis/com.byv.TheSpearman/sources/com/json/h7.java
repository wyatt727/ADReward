package com.json;

import com.json.sdk.utils.SDKUtils;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class h7 {

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f1799a = new HashMap<>();

    public h7 a(String str, Object obj) {
        if (obj != null) {
            this.f1799a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }

    public HashMap<String, Object> a() {
        return this.f1799a;
    }
}
