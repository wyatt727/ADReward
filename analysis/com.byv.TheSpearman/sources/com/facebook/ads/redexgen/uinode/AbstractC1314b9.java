package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.b9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1314b9 implements InterfaceC03710p {
    public int A00;
    public long A01;
    public RewardData A02;

    public abstract int A0G();

    public abstract C1F A0H();

    public abstract boolean A0I();

    public final void A00(int i) {
        this.A00 = i;
    }

    public final void A01(long j) {
        this.A01 = j;
    }

    public final void A02(RewardData rewardData) {
        this.A02 = rewardData;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03710p
    public final AdPlacementType A7e() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
