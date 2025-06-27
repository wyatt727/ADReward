package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;

/* compiled from: MediationConfig.java */
/* loaded from: classes2.dex */
public class VwS implements Comparable<VwS> {
    private final String EYQ;
    private final int IPb;
    private String Kbd;
    private final int Pm;
    private final String QQ;
    private final int Td;
    private final int VwS;
    private final String mZx;

    public VwS(String str, String str2, int i, int i2, String str3, int i3, int i4, String str4) {
        this.EYQ = str;
        this.mZx = str2;
        this.Td = i;
        this.Pm = i2;
        this.Kbd = str3;
        if (TextUtils.isEmpty(str3)) {
            this.Kbd = "0";
        }
        this.IPb = i3;
        this.VwS = i4;
        this.QQ = str4;
    }

    public int EYQ() {
        return this.IPb;
    }

    @Override // java.lang.Comparable
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public int compareTo(VwS vwS) {
        if (this.IPb < vwS.EYQ()) {
            return -1;
        }
        return this.IPb == vwS.EYQ() ? 0 : 1;
    }
}
