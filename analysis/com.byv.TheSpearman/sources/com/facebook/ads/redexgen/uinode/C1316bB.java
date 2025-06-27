package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1316bB extends AbstractC03730r {
    public static String[] A05 = {"RwkPFHsv9wotgH8PCqYhpIij5lIi", "drIC7gYxypHASOm9CvVJaHIQeep0", "f0dvIXyq27iv5zRXvkJTu2cqkG", "fzusVvXWPget8SSdASQ7tAMFHi8p37he", "Ar6p", "jDkSEm6Ik6fEWWn08WKTicIvFe3Dtksc", "J7vaKr0jTjoObEFZmlhET1S0K8S4ujA7", "2rimL2d5m8eNJCurq2ysJBza56R6EvG7"};
    public static final String A06 = C1316bB.class.getSimpleName();
    public C1318bD A00;
    public boolean A01;
    public final C1207Yn A02;
    public final J2 A03;
    public final NY A04;

    public C1316bB(C1207Yn c1207Yn, J2 j2, NY ny, RE re, AbstractC03740s abstractC03740s) {
        super(c1207Yn, abstractC03740s, re);
        this.A03 = j2;
        this.A04 = ny;
        this.A02 = c1207Yn;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03730r
    public final void A06(Map<String, String> map) {
        C1318bD c1318bD = this.A00;
        if (c1318bD != null && !TextUtils.isEmpty(c1318bD.A6T())) {
            this.A02.A0E().A2k();
            C2O.A00(this.A00.A05());
            J2 j2 = this.A03;
            String strA6T = this.A00.A6T();
            String[] strArr = A05;
            if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "Tkg0tGhzpCvpbpNuTPjRHtf4b45H";
            strArr2[1] = "dBPpzaB1YNfwJk5banXGE19c57tB";
            j2.A9g(strA6T, map);
        }
    }

    public final synchronized void A07() {
        C1318bD c1318bD;
        if (!this.A01 && (c1318bD = this.A00) != null) {
            this.A01 = true;
            if (!TextUtils.isEmpty(c1318bD.A03())) {
                ExecutorC0868Li.A00(new C1317bC(this));
            }
        }
    }

    public final void A08(C1318bD c1318bD) {
        this.A00 = c1318bD;
    }
}
