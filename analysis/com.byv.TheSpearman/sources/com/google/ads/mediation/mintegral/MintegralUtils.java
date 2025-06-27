package com.google.ads.mediation.mintegral;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.applovin.mediation.AppLovinExtras;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.out.MBConfiguration;

/* loaded from: classes2.dex */
public class MintegralUtils {
    public static final String TAG = "MintegralUtils";

    public static String getAdapterVersion() {
        return BuildConfig.ADAPTER_VERSION;
    }

    public static String getSdkVersion() {
        return MBConfiguration.SDK_VERSION;
    }

    public static boolean shouldMuteAudio(Bundle bundle) {
        return bundle.getBoolean(AppLovinExtras.Keys.MUTE_AUDIO);
    }

    public static AdError validateMintegralAdLoadParams(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(101, "Missing or invalid ad Unit ID configured for this ad source instance in the AdMob or Ad Manager UI.");
            Log.e(TAG, adErrorCreateAdapterError.toString());
            return adErrorCreateAdapterError;
        }
        if (!TextUtils.isEmpty(str2)) {
            return null;
        }
        AdError adErrorCreateAdapterError2 = MintegralConstants.createAdapterError(101, "Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.");
        Log.e(TAG, adErrorCreateAdapterError2.toString());
        return adErrorCreateAdapterError2;
    }

    public static AdError validateMintegralAdLoadParams(String str, String str2, String str3) {
        AdError adErrorValidateMintegralAdLoadParams = validateMintegralAdLoadParams(str, str2);
        if (adErrorValidateMintegralAdLoadParams != null) {
            return adErrorValidateMintegralAdLoadParams;
        }
        if (!TextUtils.isEmpty(str3)) {
            return null;
        }
        AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(103, "Missing or invalid Mintegral bidding signal in this ad request.");
        Log.w(TAG, adErrorCreateAdapterError.toString());
        return adErrorCreateAdapterError;
    }

    public static int convertDipToPixel(Context context, float f) {
        Resources resources = context.getResources();
        if (resources == null) {
            return 0;
        }
        return (int) TypedValue.applyDimension(1, f + 0.5f, resources.getDisplayMetrics());
    }
}
