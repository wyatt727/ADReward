package com.bytedance.sdk.openadsdk.api.factory;

/* loaded from: classes2.dex */
public class SDKTypeConfig {
    private static ISDKTypeFactory EYQ;

    public static ISDKTypeFactory getSdkTypeFactory() {
        return EYQ;
    }

    public static void setSdkTypeFactory(ISDKTypeFactory iSDKTypeFactory) {
        EYQ = iSDKTypeFactory;
    }
}
