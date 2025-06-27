package com.bytedance.sdk.openadsdk.tsL;

import com.json.p2;

/* compiled from: NetType.java */
/* loaded from: classes2.dex */
public enum Pm {
    TYPE_2G("2g"),
    TYPE_3G(p2.f2055a),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI(p2.b),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");

    private String QQ;

    Pm(String str) {
        this.QQ = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.QQ;
    }
}
