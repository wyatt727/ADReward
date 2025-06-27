package com.json;

import com.json.mediationsdk.IronSource;

/* loaded from: classes4.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2377a = false;
    private boolean b = false;
    private boolean c = false;

    public void a(IronSource.AD_UNIT ad_unit, boolean z) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f2377a = z;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.b = z;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.c = z;
        }
    }

    public boolean a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.f2377a;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.b;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.c;
        }
        return false;
    }
}
