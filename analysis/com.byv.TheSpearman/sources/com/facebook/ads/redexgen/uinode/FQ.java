package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* loaded from: assets/audience_network.dex */
public final class FQ extends AbstractC1291am {
    public static String[] A00 = {"Ze8NKKgwBfy46YDq5I0lzRS5nG7yrU8J", "E1ojaS3uTXsRavQORrTdUhX9c7MV5aHd", "ItCt9Q9mXWs9PIywah58uBD5YWxogfVc", "TvzxiXVOv8ol3X69Q34742hsr7pKLonV", "WogP6aaFjSX27EG5W88ejxN6ir7ZffIG", "o9NxBVrFd1YzPTzVCo2rgQ7Rf3HS8hqa", "2XopQN6Gw1", "j82AvX7B8A16DzVk8Gq1uvpNrrFgPLHx"};

    public FQ(C1207Yn c1207Yn, C04021u c04021u) {
        super(c1207Yn, c04021u);
    }

    private C1289ak A00(Runnable runnable) {
        return new C1289ak(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1291am
    public final C1F A0G() {
        C1327bM successfullyLoadedAdapter = (C1327bM) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1291am
    public final void A0M() {
        C1327bM interstitialAdapter = (C1327bM) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1291am
    public final void A0O(InterfaceC03710p interfaceC03710p, C8S c8s, C8Q c8q, C04031v c04031v) {
        C1327bM c1327bM = (C1327bM) interfaceC03710p;
        C1290al c1290al = new C1290al(this, c04031v, c1327bM);
        A0F().postDelayed(c1290al, c8s.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A07.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
            if (A00[7].charAt(1) == 'D') {
                throw new RuntimeException();
            }
            A00[5] = "sZ24rCHUkfT3uSPodHZqWzeJet0EqBqU";
        }
        c1327bM.A0A(this.A0B, A00(c1290al), c04031v, enumSet, this.A07.A04, this.A07.A05, this.A07.A02);
    }
}
