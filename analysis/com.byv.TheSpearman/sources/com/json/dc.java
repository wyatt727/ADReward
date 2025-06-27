package com.json;

import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.z1;

/* loaded from: classes4.dex */
public class dc extends z1 {
    private static dc R;
    private String P;
    private final x7 Q = ca.h().d();

    private dc() {
        this.H = "outcome";
        this.G = 3;
        this.I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized dc i() {
        if (R == null) {
            dc dcVar = new dc();
            R = dcVar;
            dcVar.e();
        }
        return R;
    }

    @Override // com.json.z1
    protected int c(l4 l4Var) {
        return this.Q.a(f(l4Var.c()) == z1.e.OFFERWALL.a() ? IronSource.AD_UNIT.OFFERWALL : IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    @Override // com.json.z1
    protected void d() {
        this.J.add(1000);
        this.J.add(1001);
        this.J.add(1002);
        this.J.add(1003);
        this.J.add(1200);
        this.J.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.J.add(1210);
        this.J.add(1211);
        this.J.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.J.add(1213);
        this.J.add(Integer.valueOf(IronSourceConstants.RV_MEDIATION_LOAD_ERROR));
    }

    @Override // com.json.z1
    protected boolean d(l4 l4Var) {
        int iC = l4Var.c();
        return iC == 14 || iC == 514 || iC == 305 || iC == 1003 || iC == 1005 || iC == 1203 || iC == 1010 || iC == 1301 || iC == 1302;
    }

    @Override // com.json.z1
    protected String e(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.P : "";
    }

    @Override // com.json.z1
    protected void f(l4 l4Var) {
        if (l4Var.c() == 15 || (l4Var.c() >= 300 && l4Var.c() < 400)) {
            this.P = l4Var.b().optString("placement");
        }
    }

    @Override // com.json.z1
    protected boolean j(l4 l4Var) {
        return false;
    }

    @Override // com.json.z1
    protected boolean k(l4 l4Var) {
        return l4Var.c() == 305;
    }
}
