package com.bytedance.sdk.component.mZx.EYQ;

/* compiled from: RequestBody.java */
/* loaded from: classes2.dex */
public class nWX {
    public EYQ IPb;
    public byte[] Kbd;
    public String Pm;
    public HX Td;

    /* compiled from: RequestBody.java */
    public enum EYQ {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public nWX() {
    }

    public String EYQ() {
        return this.Pm;
    }

    public nWX(HX hx, String str, EYQ eyq) {
        this.Td = hx;
        this.Pm = str;
        this.IPb = eyq;
    }

    public nWX(HX hx, byte[] bArr, EYQ eyq) {
        this.Td = hx;
        this.Kbd = bArr;
        this.IPb = eyq;
    }

    public static nWX EYQ(HX hx, String str) {
        return new nWX(hx, str, EYQ.STRING_TYPE);
    }

    public static nWX EYQ(HX hx, byte[] bArr) {
        return new nWX(hx, bArr, EYQ.BYTE_ARRAY_TYPE);
    }
}
