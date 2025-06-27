package com.bytedance.sdk.openadsdk.tp.EYQ;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.FH;

/* compiled from: BrowserLogModel.java */
/* loaded from: classes2.dex */
public class EYQ {
    private String EYQ;
    private String IPb;
    private boolean Kbd;
    private int Pm;
    private String Td;
    private int VwS;
    private UB mZx;
    private int QQ = 0;
    private int HX = 0;

    public String EYQ() {
        return this.EYQ;
    }

    public void EYQ(String str) {
        this.EYQ = str;
    }

    public UB mZx() {
        return this.mZx;
    }

    public void EYQ(UB ub) {
        this.mZx = ub;
    }

    public String Td() {
        UB ub;
        if (TextUtils.isEmpty(this.Td) && (ub = this.mZx) != null) {
            this.Td = FH.EYQ(ub);
        }
        return this.Td;
    }

    public void mZx(String str) {
        this.Td = str;
    }

    public int Pm() {
        return this.Pm;
    }

    public void EYQ(int i) {
        this.Pm = i;
    }

    public boolean Kbd() {
        return this.Kbd;
    }

    public void EYQ(boolean z) {
        this.Kbd = z;
    }

    public String IPb() {
        return this.IPb;
    }

    public void Td(String str) {
        this.IPb = str;
    }

    public int VwS() {
        return this.VwS;
    }

    public void mZx(int i) {
        this.VwS = i;
    }

    public int QQ() {
        return this.QQ;
    }

    public void Td(int i) {
        this.QQ = i;
    }

    public int HX() {
        return this.HX;
    }

    public void Pm(int i) {
        this.HX = i;
    }
}
