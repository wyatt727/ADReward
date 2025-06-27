package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: RitInfo.java */
/* loaded from: classes2.dex */
public class hYh {
    public static ConcurrentHashMap<Integer, hYh> EYQ = new ConcurrentHashMap<>();
    private String IPb;
    private int Kbd;
    private int Pm;
    private String mZx = "";
    private String Td = "";

    public String EYQ() {
        return this.IPb;
    }

    public String mZx() {
        return this.mZx;
    }

    public String Td() {
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

    public void mZx(int i) {
        this.Kbd = i;
    }

    private void IPb() {
        this.mZx = "";
        this.Td = "";
        this.Pm = 0;
        this.Kbd = 0;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub) {
        if (ub != null) {
            String strZFP = ub.ZFP();
            if (!TextUtils.isEmpty(strZFP)) {
                this.IPb = strZFP;
            }
            String strXPd = ub.XPd();
            if (TextUtils.isEmpty(strXPd) && ub.oIw()) {
                strXPd = ub.zzY().HX();
            }
            if (!TextUtils.isEmpty(strXPd)) {
                String[] strArrSplit = strXPd.split("/");
                if (strArrSplit.length >= 3) {
                    this.mZx = strArrSplit[2];
                }
            }
            if (ub.xh() == null || TextUtils.isEmpty(ub.xh().Td())) {
                return;
            }
            this.Td = ub.xh().Td();
        }
    }

    public static void mZx(com.bytedance.sdk.openadsdk.core.model.UB ub) {
        if (ub == null || TextUtils.isEmpty(ub.GfQ())) {
            return;
        }
        Integer numValueOf = Integer.valueOf(ub.yK());
        if (numValueOf.intValue() == 0) {
            return;
        }
        if (EYQ == null) {
            EYQ = new ConcurrentHashMap<>();
        }
        hYh hyh = EYQ.containsKey(numValueOf) ? EYQ.get(numValueOf) : null;
        if (hyh == null) {
            hyh = new hYh();
        }
        String strZFP = ub.ZFP();
        if (TextUtils.isEmpty(strZFP) || !strZFP.equals(hyh.EYQ())) {
            hyh.IPb();
            hyh.EYQ(ub);
            EYQ.put(numValueOf, hyh);
        }
    }

    public static void Td(int i) {
        hYh hyh;
        if (i == 0) {
            return;
        }
        if (EYQ == null) {
            EYQ = new ConcurrentHashMap<>();
        }
        if (!EYQ.containsKey(Integer.valueOf(i)) || (hyh = EYQ.get(Integer.valueOf(i))) == null) {
            return;
        }
        hyh.mZx(1);
    }

    public static void Td(com.bytedance.sdk.openadsdk.core.model.UB ub) {
        hYh hyh;
        if (ub == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(ub.yK());
        if (numValueOf.intValue() == 0) {
            return;
        }
        if (EYQ == null) {
            EYQ = new ConcurrentHashMap<>();
        }
        if (!EYQ.containsKey(numValueOf) || (hyh = EYQ.get(numValueOf)) == null) {
            return;
        }
        hyh.EYQ(1);
    }
}
