package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ea, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0689Ea extends ZW {
    public static String[] A00 = {"ebBTtcDfrXbt7XUNv2xXXzukgR", "AfSrg72OINfokWlk8lEehE43rER54C5K", "DLWRAT6zkYb5ZQ4lVerhsjeXnJdmq546", "HcA6UXt4lgXnqoCqWVxSHZRcl", "xLJGdEWbtHtgosfXVcR1IwW", "KlZdBiYd7CYsgOQcQxjIKqODuE8wujbn", "gwTEk6Fa0GjLNEZ2sqovA8E7SRT86ppt", "mobLesdsIst7Z6gfBQK3QOgi9WAmLStS"};

    public C0689Ea(C5V c5v) {
        super(c5v, null);
    }

    public /* synthetic */ C0689Ea(C5V c5v, C5R c5r) {
        this(c5v);
    }

    @Override // com.facebook.ads.redexgen.uinode.ZW, com.facebook.ads.redexgen.uinode.MC
    public final void A43(String str) {
        if (this.A00.get() == null) {
            return;
        }
        C5V c5v = this.A00.get();
        if (A00[1].charAt(12) != 'k') {
            throw new RuntimeException();
        }
        A00[0] = "wcnlDkVPCotGmNFV8gEH10X6";
        c5v.A0G(str);
        String strA02 = QP.A08.A02();
        String rewardedVideoError = QP.A09.A02();
        if (str.equals(strA02)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.ZW, com.facebook.ads.redexgen.uinode.MC
    public final void A44(String str, C05678q c05678q) {
        super.A44(str, c05678q);
    }
}
