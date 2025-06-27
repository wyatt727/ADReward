package com.bytedance.sdk.component.Kbd.EYQ.IPb;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: TrackInfo.java */
/* loaded from: classes2.dex */
public class Pm {
    private final String EYQ;
    private final String IPb;
    private final int Kbd;
    private boolean MxO;
    private String QQ;
    private final boolean Td;
    private String VwS;
    private final String mZx;
    private int Pm = -1;
    private int HX = 0;
    private String tp = null;

    Pm(String str, String str2, boolean z, int i, String str3) {
        this.EYQ = str;
        this.mZx = str2;
        this.Td = z;
        this.Kbd = i;
        this.IPb = str3;
    }

    public String EYQ() {
        return this.EYQ;
    }

    public String mZx() {
        return this.mZx;
    }

    public boolean Td() {
        return this.Td;
    }

    public int Pm() {
        return this.Pm;
    }

    public void EYQ(int i) {
        this.Pm = i;
    }

    public int Kbd() {
        return this.Kbd;
    }

    public String IPb() {
        return this.IPb;
    }

    public void EYQ(String str) {
        this.VwS = str;
    }

    public String VwS() {
        return this.VwS;
    }

    public void mZx(int i) {
        this.HX = i;
        if (i == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.VwS)) {
            this.VwS = String.valueOf(this.HX);
            return;
        }
        this.VwS += "," + this.HX;
    }

    public int QQ() {
        return this.HX;
    }

    public void mZx(String str) {
        this.QQ = str;
    }

    public String HX() {
        return this.QQ;
    }

    public void Td(String str) {
        this.tp = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.QQ)) {
            this.QQ = String.valueOf(this.tp);
            return;
        }
        this.QQ += "," + this.tp;
    }

    public void EYQ(boolean z) {
        this.MxO = z;
    }

    public boolean tp() {
        return this.MxO;
    }

    public Runnable EYQ(String str, Map<String, String> map) {
        return EYQ.EYQ().EYQ(this, str, map);
    }

    public boolean MxO() {
        return this.Pm == -1;
    }
}
