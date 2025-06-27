package com.bytedance.sdk.component.mZx.EYQ;

import java.nio.charset.Charset;

/* compiled from: MediaType.java */
/* loaded from: classes2.dex */
public final class HX {
    private String EYQ;
    private String mZx;

    private HX(String str) {
        this.EYQ = str;
    }

    public static HX EYQ(String str) {
        return new HX(str);
    }

    public String EYQ() {
        return this.EYQ;
    }

    public Charset EYQ(Charset charset) {
        try {
            String str = this.mZx;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
