package com.applovin.mediation;

import android.content.Context;
import android.os.Bundle;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AppLovinUtils {
    private static final String DEFAULT_ZONE = "";
    public static final String ERROR_MSG_REASON_PREFIX = "AppLovin SDK returned a load failure callback with reason: ";
    private static final String TRUE = "true";

    public static class ServerParameterKeys {
        public static final String MULTIPLE_ADS_PER_AD_UNIT = "enable_multiple_ads_per_unit";
        public static final String SDK_KEY = "sdkKey";
        public static final String ZONE_ID = "zone_id";

        private ServerParameterKeys() {
        }
    }

    public static String retrieveZoneId(Bundle bundle) {
        return bundle.containsKey(ServerParameterKeys.ZONE_ID) ? bundle.getString(ServerParameterKeys.ZONE_ID) : "";
    }

    public static boolean isMultiAdsEnabled(Bundle bundle) {
        if (bundle.containsKey(ServerParameterKeys.MULTIPLE_ADS_PER_AD_UNIT)) {
            return bundle.getString(ServerParameterKeys.MULTIPLE_ADS_PER_AD_UNIT).equals("true");
        }
        return false;
    }

    public static boolean shouldMuteAudio(Bundle bundle) {
        return bundle != null && bundle.getBoolean(AppLovinExtras.Keys.MUTE_AUDIO);
    }

    public static AdError getAdError(int i) {
        String str = "AppLovin error code " + i;
        if (i == -8) {
            str = "INVALID_AD_TOKEN";
        } else if (i == -7) {
            str = "INVALID_ZONE";
        } else if (i != -6) {
            switch (i) {
                case -1009:
                    str = "NO_NETWORK";
                    break;
                case -1001:
                    str = "FETCH_AD_TIMEOUT";
                    break;
                case AppLovinErrorCodes.INVALID_URL /* -900 */:
                    str = "INVALID_URL";
                    break;
                case AppLovinErrorCodes.INVALID_RESPONSE /* -800 */:
                    str = "INVALID_RESPONSE";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO /* -600 */:
                    str = "INCENTIVIZED_USER_CLOSED_VIDEO";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT /* -500 */:
                    str = "INCENTIVIZED_SERVER_TIMEOUT";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR /* -400 */:
                    str = "INCENTIVIZED_UNKNOWN_SERVER_ERROR";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED /* -300 */:
                    str = "INCENTIVIZED_NO_AD_PRELOADED";
                    break;
                case AppLovinErrorCodes.SDK_DISABLED /* -22 */:
                    str = "SDK_DISABLED";
                    break;
                case -1:
                    str = "UNSPECIFIED_ERROR";
                    break;
                case 204:
                    str = "NO_FILL";
                    break;
                default:
                    switch (i) {
                        case AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES /* -202 */:
                            str = "UNABLE_TO_PRECACHE_VIDEO_RESOURCES";
                            break;
                        case AppLovinErrorCodes.UNABLE_TO_PRECACHE_IMAGE_RESOURCES /* -201 */:
                            str = "UNABLE_TO_PRECACHE_IMAGE_RESOURCES";
                            break;
                        case AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES /* -200 */:
                            str = "UNABLE_TO_PRECACHE_RESOURCES";
                            break;
                    }
            }
        } else {
            str = "UNABLE_TO_RENDER_AD";
        }
        return new AdError(i, ERROR_MSG_REASON_PREFIX + str, AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
    }

    public static AppLovinAdSize appLovinAdSizeFromAdMobAdSize(Context context, AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AdSize.BANNER);
        arrayList.add(AdSize.LEADERBOARD);
        arrayList.add(AdSize.MEDIUM_RECTANGLE);
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (AdSize.BANNER.equals(adSizeFindClosestSize)) {
            return AppLovinAdSize.BANNER;
        }
        if (AdSize.MEDIUM_RECTANGLE.equals(adSizeFindClosestSize)) {
            return AppLovinAdSize.MREC;
        }
        if (AdSize.LEADERBOARD.equals(adSizeFindClosestSize)) {
            return AppLovinAdSize.LEADER;
        }
        return null;
    }
}
