package com.bytedance.sdk.component.mZx.EYQ;

/* compiled from: Protocol.java */
/* loaded from: classes2.dex */
public enum tsL {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    private final String Kbd;

    tsL(String str) {
        this.Kbd = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.Kbd;
    }
}
