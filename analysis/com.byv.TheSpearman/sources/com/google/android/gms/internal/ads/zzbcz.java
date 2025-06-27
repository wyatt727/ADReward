package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesActivityResultCodes;
import com.json.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzbcz implements zzgzz {
    UNKNOWN_EVENT_TYPE(0),
    AD_REQUEST(1),
    AD_LOADED(2),
    AD_IMPRESSION(5),
    AD_FIRST_CLICK(6),
    AD_SUBSEQUENT_CLICK(7),
    REQUEST_WILL_START(8),
    REQUEST_DID_END(9),
    REQUEST_WILL_UPDATE_SIGNALS(10),
    REQUEST_DID_UPDATE_SIGNALS(11),
    REQUEST_WILL_BUILD_URL(12),
    REQUEST_DID_BUILD_URL(13),
    REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
    REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
    REQUEST_WILL_PROCESS_RESPONSE(16),
    REQUEST_DID_PROCESS_RESPONSE(17),
    REQUEST_WILL_RENDER(18),
    REQUEST_DID_RENDER(19),
    AD_FAILED_TO_LOAD(3),
    AD_FAILED_TO_LOAD_NO_FILL(4),
    AD_FAILED_TO_LOAD_INVALID_REQUEST(100),
    AD_FAILED_TO_LOAD_NETWORK_ERROR(101),
    AD_FAILED_TO_LOAD_TIMEOUT(102),
    AD_FAILED_TO_LOAD_CANCELLED(103),
    AD_FAILED_TO_LOAD_NO_ERROR(104),
    AD_FAILED_TO_LOAD_NOT_FOUND(105),
    REQUEST_WILL_UPDATE_GMS_SIGNALS(1000),
    REQUEST_DID_UPDATE_GMS_SIGNALS(1001),
    REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(1002),
    REQUEST_FAILED_TO_BUILD_URL(1003),
    REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(1004),
    REQUEST_FAILED_TO_PROCESS_RESPONSE(1005),
    REQUEST_FAILED_TO_UPDATE_SIGNALS(1006),
    REQUEST_FAILED_TO_RENDER(1007),
    REQUEST_IS_PREFETCH(IronSourceConstants.RV_API_SHOW_CALLED),
    REQUEST_SAVED_TO_CACHE(IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE),
    REQUEST_LOADED_FROM_CACHE(IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE),
    REQUEST_PREFETCH_INTERCEPTED(1103),
    REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED(1104),
    REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED(1105),
    NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED(1106),
    NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED(1107),
    REQUEST_FAILED_TO_LOAD_FROM_CACHE(1108),
    BANNER_SIZE_INVALID(10000),
    BANNER_SIZE_VALID(10001),
    ANDROID_WEBVIEW_CRASH(10002),
    OFFLINE_UPLOAD(10003),
    DELAY_PAGE_LOAD_CANCELLED_AD(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED);

    private static final zzhaa zzW = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzbcy
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            zzbcz zzbczVar = zzbcz.UNKNOWN_EVENT_TYPE;
            switch (i) {
                case 0:
                    return zzbcz.UNKNOWN_EVENT_TYPE;
                case 1:
                    return zzbcz.AD_REQUEST;
                case 2:
                    return zzbcz.AD_LOADED;
                case 3:
                    return zzbcz.AD_FAILED_TO_LOAD;
                case 4:
                    return zzbcz.AD_FAILED_TO_LOAD_NO_FILL;
                case 5:
                    return zzbcz.AD_IMPRESSION;
                case 6:
                    return zzbcz.AD_FIRST_CLICK;
                case 7:
                    return zzbcz.AD_SUBSEQUENT_CLICK;
                case 8:
                    return zzbcz.REQUEST_WILL_START;
                case 9:
                    return zzbcz.REQUEST_DID_END;
                case 10:
                    return zzbcz.REQUEST_WILL_UPDATE_SIGNALS;
                case 11:
                    return zzbcz.REQUEST_DID_UPDATE_SIGNALS;
                case 12:
                    return zzbcz.REQUEST_WILL_BUILD_URL;
                case 13:
                    return zzbcz.REQUEST_DID_BUILD_URL;
                case 14:
                    return zzbcz.REQUEST_WILL_MAKE_NETWORK_REQUEST;
                case 15:
                    return zzbcz.REQUEST_DID_RECEIVE_NETWORK_RESPONSE;
                case 16:
                    return zzbcz.REQUEST_WILL_PROCESS_RESPONSE;
                case 17:
                    return zzbcz.REQUEST_DID_PROCESS_RESPONSE;
                case 18:
                    return zzbcz.REQUEST_WILL_RENDER;
                case 19:
                    return zzbcz.REQUEST_DID_RENDER;
                default:
                    switch (i) {
                        case 100:
                            return zzbcz.AD_FAILED_TO_LOAD_INVALID_REQUEST;
                        case 101:
                            return zzbcz.AD_FAILED_TO_LOAD_NETWORK_ERROR;
                        case 102:
                            return zzbcz.AD_FAILED_TO_LOAD_TIMEOUT;
                        case 103:
                            return zzbcz.AD_FAILED_TO_LOAD_CANCELLED;
                        case 104:
                            return zzbcz.AD_FAILED_TO_LOAD_NO_ERROR;
                        case 105:
                            return zzbcz.AD_FAILED_TO_LOAD_NOT_FOUND;
                        default:
                            switch (i) {
                                case 1000:
                                    return zzbcz.REQUEST_WILL_UPDATE_GMS_SIGNALS;
                                case 1001:
                                    return zzbcz.REQUEST_DID_UPDATE_GMS_SIGNALS;
                                case 1002:
                                    return zzbcz.REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS;
                                case 1003:
                                    return zzbcz.REQUEST_FAILED_TO_BUILD_URL;
                                case 1004:
                                    return zzbcz.REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST;
                                case 1005:
                                    return zzbcz.REQUEST_FAILED_TO_PROCESS_RESPONSE;
                                case 1006:
                                    return zzbcz.REQUEST_FAILED_TO_UPDATE_SIGNALS;
                                case 1007:
                                    return zzbcz.REQUEST_FAILED_TO_RENDER;
                                default:
                                    switch (i) {
                                        case IronSourceConstants.RV_API_SHOW_CALLED /* 1100 */:
                                            return zzbcz.REQUEST_IS_PREFETCH;
                                        case IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE /* 1101 */:
                                            return zzbcz.REQUEST_SAVED_TO_CACHE;
                                        case IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE /* 1102 */:
                                            return zzbcz.REQUEST_LOADED_FROM_CACHE;
                                        case 1103:
                                            return zzbcz.REQUEST_PREFETCH_INTERCEPTED;
                                        case 1104:
                                            return zzbcz.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED;
                                        case 1105:
                                            return zzbcz.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED;
                                        case 1106:
                                            return zzbcz.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED;
                                        case 1107:
                                            return zzbcz.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED;
                                        case 1108:
                                            return zzbcz.REQUEST_FAILED_TO_LOAD_FROM_CACHE;
                                        default:
                                            switch (i) {
                                                case 10000:
                                                    return zzbcz.BANNER_SIZE_INVALID;
                                                case 10001:
                                                    return zzbcz.BANNER_SIZE_VALID;
                                                case 10002:
                                                    return zzbcz.ANDROID_WEBVIEW_CRASH;
                                                case 10003:
                                                    return zzbcz.OFFLINE_UPLOAD;
                                                case GamesActivityResultCodes.RESULT_APP_MISCONFIGURED /* 10004 */:
                                                    return zzbcz.DELAY_PAGE_LOAD_CANCELLED_AD;
                                                default:
                                                    return null;
                                            }
                                    }
                            }
                    }
            }
        }
    };
    private final int zzY;

    zzbcz(int i) {
        this.zzY = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzY);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        return this.zzY;
    }
}
