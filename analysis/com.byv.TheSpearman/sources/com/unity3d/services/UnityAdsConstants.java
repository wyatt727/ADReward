package com.unity3d.services;

import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;
import kotlin.Metadata;

/* compiled from: UnityAdsConstants.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants;", "", "()V", "AdOperations", "Cache", "ClientInfo", "DefaultUrls", "Messages", "OpenMeasurement", "RequestPolicy", "SharedFlow", InitializeAndroidBoldSDK.MSG_TIMEOUT, "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnityAdsConstants {
    public static final UnityAdsConstants INSTANCE = new UnityAdsConstants();

    private UnityAdsConstants() {
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$Messages;", "", "()V", "MSG_INTERNAL_ERROR", "", "MSG_UNITY_BASE", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Messages {
        public static final Messages INSTANCE = new Messages();
        public static final String MSG_INTERNAL_ERROR = "Internal error";
        public static final String MSG_UNITY_BASE = "[Unity Ads] ";

        private Messages() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$Timeout;", "", "()V", "GET_TOKEN_TIMEOUT_MS", "", "INIT_TIMEOUT_MS", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Timeout {
        public static final long GET_TOKEN_TIMEOUT_MS = 5000;
        public static final long INIT_TIMEOUT_MS = 10000;
        public static final Timeout INSTANCE = new Timeout();

        private Timeout() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$RequestPolicy;", "", "()V", "CONNECT_TIMEOUT_MS", "", "OVERALL_TIMEOUT_MS", "READ_TIMEOUT_MS", "RETRY_JITTER_PCT", "", "RETRY_MAX_DURATION", "RETRY_MAX_INTERVAL", "RETRY_SCALING_FACTOR", "RETRY_WAIT_BASE", "SHOULD_STORE_LOCALLY", "", "WRITE_TIMEOUT_MS", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequestPolicy {
        public static final int CONNECT_TIMEOUT_MS = 10000;
        public static final RequestPolicy INSTANCE = new RequestPolicy();
        public static final int OVERALL_TIMEOUT_MS = 10000;
        public static final int READ_TIMEOUT_MS = 10000;
        public static final float RETRY_JITTER_PCT = 0.1f;
        public static final int RETRY_MAX_DURATION = 20000;
        public static final int RETRY_MAX_INTERVAL = 1000;
        public static final float RETRY_SCALING_FACTOR = 2.0f;
        public static final int RETRY_WAIT_BASE = 500;
        public static final boolean SHOULD_STORE_LOCALLY = false;
        public static final int WRITE_TIMEOUT_MS = 10000;

        private RequestPolicy() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$SharedFlow;", "", "()V", "EXTRA_CAPACITY", "", "REPLAY", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SharedFlow {
        public static final int EXTRA_CAPACITY = 10;
        public static final SharedFlow INSTANCE = new SharedFlow();
        public static final int REPLAY = 10;

        private SharedFlow() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$DefaultUrls;", "", "()V", "AD_ASSET_DOMAIN", "", "AD_ASSET_PATH", "AD_CACHE_DOMAIN", "AD_MARKUP_URL", "AD_PLAYER_QUERY_PARAMS", "ASSET_DOMAIN", "CACHE_DIR_NAME", "GATEWAY_URL", "WEBVIEW_ASSET_PATH", "WEBVIEW_DOMAIN", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultUrls {
        public static final String AD_ASSET_DOMAIN = "unity.ads.asset";
        public static final String AD_ASSET_PATH = "/";
        public static final String AD_CACHE_DOMAIN = "unity.ads.cache";
        public static final String AD_MARKUP_URL = "https://gateway.unityads.unity3d.com/tools/convert_ad_response_to_ad_markup";
        public static final String AD_PLAYER_QUERY_PARAMS = "?platform=android&";
        public static final String ASSET_DOMAIN = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
        public static final String CACHE_DIR_NAME = "UnityAdsCache";
        public static final String GATEWAY_URL = "https://gateway.unityads.unity3d.com/v1";
        public static final DefaultUrls INSTANCE = new DefaultUrls();
        public static final String WEBVIEW_ASSET_PATH = "/unity-ads-sdk-webview/";
        public static final String WEBVIEW_DOMAIN = "config.unityads.unity3d.com";

        private DefaultUrls() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$ClientInfo;", "", "()V", "SDK_VERSION", "", "SDK_VERSION_NAME", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ClientInfo {
        public static final ClientInfo INSTANCE = new ClientInfo();
        public static final int SDK_VERSION = 41103;
        public static final String SDK_VERSION_NAME = "4.11.3";

        private ClientInfo() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$OpenMeasurement;", "", "()V", "OM_JS_SERVICE_FILENAME", "", "OM_JS_SESSION_FILENAME", "OM_JS_URL_SERVICE", "OM_JS_URL_SESSION", "OM_PARTNER_NAME", "OM_PARTNER_VERSION", "OM_SESSION_FINISH_DELAY_MS", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OpenMeasurement {
        public static final OpenMeasurement INSTANCE = new OpenMeasurement();
        public static final String OM_JS_SERVICE_FILENAME = "ad-viewer/omsdk-v1.js";
        public static final String OM_JS_SESSION_FILENAME = "ad-viewer/omid-session-client-v1.js";
        public static final String OM_JS_URL_SERVICE = "unity-ads-cache://unity.ads.asset/ad-viewer/omsdk-v1.js";
        public static final String OM_JS_URL_SESSION = "unity-ads-cache://unity.ads.asset/ad-viewer/omid-session-client-v1.js";
        public static final String OM_PARTNER_NAME = "Unity3d";
        public static final String OM_PARTNER_VERSION = "1";
        public static final long OM_SESSION_FINISH_DELAY_MS = 1000;

        private OpenMeasurement() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$Cache;", "", "()V", "CACHE_SCHEME", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Cache {
        public static final String CACHE_SCHEME = "unity-ads-cache";
        public static final Cache INSTANCE = new Cache();

        private Cache() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$AdOperations;", "", "()V", "GET_TOKEN_TIMEOUT_MS", "", "LOAD_TIMEOUT_MS", "SHOW_TIMEOUT_MS", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AdOperations {
        public static final int GET_TOKEN_TIMEOUT_MS = 5000;
        public static final AdOperations INSTANCE = new AdOperations();
        public static final int LOAD_TIMEOUT_MS = 30000;
        public static final int SHOW_TIMEOUT_MS = 10000;

        private AdOperations() {
        }
    }
}
