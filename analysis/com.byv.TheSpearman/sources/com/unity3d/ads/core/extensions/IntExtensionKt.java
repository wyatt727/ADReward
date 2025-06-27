package com.unity3d.ads.core.extensions;

import com.applovin.sdk.AppLovinErrorCodes;
import com.unity3d.ads.adplayer.model.ErrorReason;
import kotlin.Metadata;

/* compiled from: IntExtension.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"webResourceToErrorReason", "Lcom/unity3d/ads/adplayer/model/ErrorReason;", "", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IntExtensionKt {
    public static final ErrorReason webResourceToErrorReason(int i) {
        switch (i) {
            case -16:
                return ErrorReason.REASON_WEB_ERROR_UNSAFE_RESOURCE;
            case -15:
                return ErrorReason.REASON_WEB_ERROR_TOO_MANY_REQUESTS;
            case -14:
                return ErrorReason.REASON_WEB_ERROR_FILE_NOT_FOUND;
            case -13:
                return ErrorReason.REASON_WEB_ERROR_FILE;
            case -12:
                return ErrorReason.REASON_WEB_ERROR_BAD_URL;
            case -11:
                return ErrorReason.REASON_WEB_ERROR_FAILED_SSL_HANDSHAKE;
            case -10:
                return ErrorReason.REASON_WEB_ERROR_UNSUPPORTED_SCHEME;
            case -9:
                return ErrorReason.REASON_WEB_ERROR_REDIRECT_LOOP;
            case AppLovinErrorCodes.INVALID_AD_TOKEN /* -8 */:
                return ErrorReason.REASON_WEB_ERROR_TIMEOUT;
            case AppLovinErrorCodes.INVALID_ZONE /* -7 */:
                return ErrorReason.REASON_WEB_ERROR_IO;
            case AppLovinErrorCodes.UNABLE_TO_RENDER_AD /* -6 */:
                return ErrorReason.REASON_WEB_ERROR_CONNECT;
            case -5:
                return ErrorReason.REASON_WEB_ERROR_PROXY_AUTHENTICATION;
            case -4:
                return ErrorReason.REASON_WEB_ERROR_AUTHENTICATION;
            case -3:
                return ErrorReason.REASON_WEB_ERROR_UNSUPPORTED_AUTH_SCHEME;
            case -2:
                return ErrorReason.REASON_WEB_ERROR_HOST_LOOKUP;
            case -1:
                return ErrorReason.REASON_WEB_ERROR_UNKNOWN;
            default:
                return ErrorReason.REASON_UNKNOWN;
        }
    }
}
