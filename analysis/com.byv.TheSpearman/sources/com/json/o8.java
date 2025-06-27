package com.json;

import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.z1;

/* loaded from: classes4.dex */
public class o8 extends z1 {
    private static o8 R;
    private String P;
    private final x7 Q = ca.h().d();

    private o8() {
        this.H = "ironbeast";
        this.G = 2;
        this.I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized o8 i() {
        if (R == null) {
            o8 o8Var = new o8();
            R = o8Var;
            o8Var.e();
        }
        return R;
    }

    @Override // com.json.z1
    protected int c(l4 l4Var) {
        x7 x7Var;
        IronSource.AD_UNIT ad_unit;
        int iF = f(l4Var.c());
        if (iF == z1.e.BANNER.a()) {
            x7Var = this.Q;
            ad_unit = IronSource.AD_UNIT.BANNER;
        } else if (iF == z1.e.NATIVE_AD.a()) {
            x7Var = this.Q;
            ad_unit = IronSource.AD_UNIT.NATIVE_AD;
        } else {
            x7Var = this.Q;
            ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        }
        return x7Var.a(ad_unit);
    }

    @Override // com.json.z1
    protected void d() {
        this.J.add(2001);
        this.J.add(2002);
        this.J.add(2003);
        this.J.add(2004);
        this.J.add(2200);
        this.J.add(2213);
        this.J.add(2211);
        this.J.add(2212);
        this.J.add(3001);
        this.J.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_LOAD_ERROR));
        this.J.add(Integer.valueOf(IronSourceConstants.BN_RELOAD));
        this.J.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_RELOAD_ERROR));
        this.J.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS));
        this.J.add(3002);
        this.J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD));
        this.J.add(3005);
        this.J.add(3300);
        this.J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS));
        this.J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS));
        this.J.add(3009);
        this.J.add(4001);
        this.J.add(Integer.valueOf(IronSourceConstants.NT_CALLBACK_LOAD_ERROR));
        this.J.add(4002);
        this.J.add(4005);
        this.J.add(Integer.valueOf(IronSourceConstants.NT_INSTANCE_LOAD_ERROR));
        this.J.add(Integer.valueOf(IronSourceConstants.NT_INSTANCE_SHOW));
    }

    @Override // com.json.z1
    protected boolean d(l4 l4Var) {
        int iC = l4Var.c();
        return iC == 2004 || iC == 2005 || iC == 2204 || iC == 2301 || iC == 2300 || iC == 3009 || iC == 3502 || iC == 3501 || iC == 4005 || iC == 4009 || iC == 4502 || iC == 4501;
    }

    @Override // com.json.z1
    protected String e(int i) {
        return this.P;
    }

    @Override // com.json.z1
    protected void f(l4 l4Var) {
        this.P = l4Var.b().optString("placement");
    }

    @Override // com.json.z1
    protected boolean j(l4 l4Var) {
        return false;
    }

    @Override // com.json.z1
    protected boolean k(l4 l4Var) {
        return false;
    }
}
