package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* compiled from: Image.java */
/* loaded from: classes2.dex */
public class nWX {
    private String EYQ;
    private String IPb;
    private boolean Kbd;
    private double Pm;
    private int Td;
    private int mZx;

    public String EYQ() {
        return this.EYQ;
    }

    public void EYQ(String str) {
        this.EYQ = str;
    }

    public int mZx() {
        return this.mZx;
    }

    public void EYQ(int i) {
        this.mZx = i;
    }

    public int Td() {
        return this.Td;
    }

    public void mZx(int i) {
        this.Td = i;
    }

    public double Pm() {
        return this.Pm;
    }

    public boolean Kbd() {
        return !TextUtils.isEmpty(this.EYQ) && this.mZx > 0 && this.Td > 0;
    }

    public boolean IPb() {
        return this.Kbd;
    }

    public void EYQ(boolean z) {
        this.Kbd = z;
    }

    public String VwS() {
        return this.IPb;
    }

    public void mZx(String str) {
        this.IPb = str;
    }
}
