package com.unity3d.services.ads.gmascar.bridges.mobileads;

/* loaded from: classes4.dex */
public class MobileAdsBridgeFactory {
    public MobileAdsBridgeBase createMobileAdsBridge() {
        MobileAdsBridge mobileAdsBridge = new MobileAdsBridge();
        if (mobileAdsBridge.exists()) {
            return mobileAdsBridge;
        }
        MobileAdsBridgeLegacy mobileAdsBridgeLegacy = new MobileAdsBridgeLegacy();
        if (mobileAdsBridgeLegacy.exists()) {
            return mobileAdsBridgeLegacy;
        }
        return null;
    }
}
