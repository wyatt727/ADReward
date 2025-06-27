package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.y3;

/* loaded from: classes.dex */
public class AppLovinPrivacySettings {
    public static Boolean getAdditionalConsentStatus(int i) {
        k kVar = k.A0;
        if (kVar != null) {
            return kVar.m0().a(i);
        }
        t.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getAdditionalConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static Boolean getPurposeConsentStatus(int i) {
        k kVar = k.A0;
        if (kVar != null) {
            return kVar.m0().b(i);
        }
        t.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getPurposeConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static Boolean getSpecialFeatureOptInStatus(int i) {
        k kVar = k.A0;
        if (kVar != null) {
            return kVar.m0().c(i);
        }
        t.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getSpecialFeatureOptInStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static Boolean getTcfVendorConsentStatus(int i) {
        k kVar = k.A0;
        if (kVar != null) {
            return kVar.m0().d(i);
        }
        t.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getTcfVendorConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static boolean hasUserConsent(Context context) {
        Boolean boolB = y3.b().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUser(Context context) {
        Boolean boolB = y3.c().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUserSet(Context context) {
        return y3.c().b(context) != null;
    }

    public static boolean isDoNotSell(Context context) {
        Boolean boolB = y3.a().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet(Context context) {
        return y3.a().b(context) != null;
    }

    public static boolean isUserConsentSet(Context context) {
        return y3.b().b(context) != null;
    }

    public static void setDoNotSell(boolean z, Context context) {
        t.g("AppLovinPrivacySettings", "setDoNotSell()");
        if (y3.a(z, context)) {
            AppLovinSdk.reinitializeAll(null, null, Boolean.valueOf(z));
        }
    }

    public static void setHasUserConsent(boolean z, Context context) {
        t.g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (y3.b(z, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z), null, null);
        }
    }

    public static void setIsAgeRestrictedUser(boolean z, Context context) {
        t.g("AppLovinPrivacySettings", "setIsAgeRestrictedUser()");
        if (y3.c(z, context)) {
            AppLovinSdk.reinitializeAll(null, Boolean.valueOf(z), null);
        }
    }
}
