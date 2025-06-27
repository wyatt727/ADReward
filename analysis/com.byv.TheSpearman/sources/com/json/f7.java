package com.json;

/* loaded from: classes4.dex */
public class f7 {

    public enum a {
        None,
        Device,
        Controller
    }

    public enum b {
        None,
        Loading,
        Loaded,
        Ready,
        Failed
    }

    public enum c {
        Web,
        Native,
        None
    }

    public enum d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);


        /* renamed from: a, reason: collision with root package name */
        private int f1775a;

        d(int i) {
            this.f1775a = i;
        }

        public int a() {
            return this.f1775a;
        }
    }

    public enum e {
        Banner,
        OfferWall,
        Interstitial,
        OfferWallCredits,
        RewardedVideo,
        NativeAd,
        None
    }
}
