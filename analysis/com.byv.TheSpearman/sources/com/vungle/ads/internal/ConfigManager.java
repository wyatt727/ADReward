package com.vungle.ads.internal;

import android.net.Uri;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.model.CleverCache;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.util.Logger;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigManager.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0007J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u001b\u001a\u00020\u0007J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u001d\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0011J\b\u0010 \u001a\u0004\u0018\u00010\u0007J\b\u0010!\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\"\u001a\u00020\u0007J\u0010\u0010#\u001a\u0004\u0018\u00010\u000f2\u0006\u0010$\u001a\u00020\u0007J\b\u0010%\u001a\u0004\u0018\u00010\u0007J\u0006\u0010&\u001a\u00020\u0015J\u0006\u0010'\u001a\u00020\u0015J\u0006\u0010(\u001a\u00020\u0011J\u000e\u0010)\u001a\u00020*2\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010+\u001a\u00020\u0011J\u0006\u0010,\u001a\u00020\u0011J\u0006\u0010-\u001a\u00020\u0011J\u0006\u0010.\u001a\u00020\u0011J\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eJ\u0006\u0010/\u001a\u00020\u0011J\u0006\u00100\u001a\u00020\u0011J\u0006\u00101\u001a\u00020\u0011J\u0010\u00102\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u00010\u0007J\u0006\u00104\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/vungle/ads/internal/ConfigManager;", "", "()V", "DEFAULT_SESSION_TIMEOUT_SECONDS", "", "DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS", "TAG", "", "config", "Lcom/vungle/ads/internal/model/ConfigPayload;", "configExt", "endpoints", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "placements", "", "Lcom/vungle/ads/internal/model/Placement;", "adLoadOptimizationEnabled", "", "getAdsEndpoint", "getCleverCacheDiskPercentage", "getCleverCacheDiskSize", "", "getConfigExtension", "getErrorLoggingEndpoint", "getGDPRButtonAccept", "getGDPRButtonDeny", "getGDPRConsentMessage", "getGDPRConsentMessageVersion", "getGDPRConsentTitle", "getGDPRIsCountryDataProtected", "getLogLevel", "getMetricsEnabled", "getMetricsEndpoint", "getMraidEndpoint", "getMraidJsVersion", "getPlacement", "id", "getRiEndpoint", "getSessionTimeout", "getSignalsSessionTimeout", "heartbeatEnabled", "initWithConfig", "", "isCacheableAssetsRequired", "isCleverCacheEnabled", "isReportIncentivizedEnabled", "omEnabled", "rtaDebuggingEnabled", "shouldDisableAdId", "signalsDisabled", "updateConfigExtension", "ext", "validateEndpoints", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ConfigManager {
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 900;
    private static final int DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS = 1800;
    public static final ConfigManager INSTANCE = new ConfigManager();
    public static final String TAG = "ConfigManager";
    private static ConfigPayload config;
    private static String configExt;
    private static ConfigPayload.Endpoints endpoints;
    private static List<Placement> placements;

    private ConfigManager() {
    }

    public final void initWithConfig(ConfigPayload config2) {
        Intrinsics.checkNotNullParameter(config2, "config");
        config = config2;
        endpoints = config2.getEndpoints();
        placements = config2.getPlacements();
    }

    public final List<Placement> placements() {
        return placements;
    }

    public final Placement getPlacement(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        List<Placement> list = placements;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((Placement) next).getReferenceId(), id)) {
                obj = next;
                break;
            }
        }
        return (Placement) obj;
    }

    public final String getAdsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getAdsEndpoint();
        }
        return null;
    }

    public final String getRiEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getRiEndpoint();
        }
        return null;
    }

    public final String getMraidEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getMraidEndpoint();
        }
        return null;
    }

    public final String getMraidJsVersion() {
        String mraidEndpoint = getMraidEndpoint();
        if (mraidEndpoint != null) {
            String str = "mraid_" + Uri.parse(mraidEndpoint).getLastPathSegment();
            if (str != null) {
                return str;
            }
        }
        return "mraid_1";
    }

    public final String getGDPRConsentMessage() {
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (gdpr = configPayload.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentMessage();
    }

    public final String getGDPRConsentTitle() {
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (gdpr = configPayload.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentTitle();
    }

    public final String getGDPRButtonAccept() {
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (gdpr = configPayload.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonAccept();
    }

    public final String getGDPRButtonDeny() {
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (gdpr = configPayload.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonDeny();
    }

    public final String getGDPRConsentMessageVersion() {
        ConfigPayload.GDPRSettings gdpr;
        String consentMessageVersion;
        ConfigPayload configPayload = config;
        return (configPayload == null || (gdpr = configPayload.getGdpr()) == null || (consentMessageVersion = gdpr.getConsentMessageVersion()) == null) ? "" : consentMessageVersion;
    }

    public final boolean getGDPRIsCountryDataProtected() {
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (gdpr = configPayload.getGdpr()) == null) {
            return false;
        }
        return gdpr.isCountryDataProtected();
    }

    public final boolean shouldDisableAdId() {
        Boolean disableAdId;
        ConfigPayload configPayload = config;
        if (configPayload == null || (disableAdId = configPayload.getDisableAdId()) == null) {
            return true;
        }
        return disableAdId.booleanValue();
    }

    public final boolean adLoadOptimizationEnabled() {
        ConfigPayload.LoadOptimizationSettings loadOptimizationSettingsIsAdDownloadOptEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (loadOptimizationSettingsIsAdDownloadOptEnabled = configPayload.isAdDownloadOptEnabled()) == null) {
            return false;
        }
        return loadOptimizationSettingsIsAdDownloadOptEnabled.getEnabled();
    }

    public final boolean isReportIncentivizedEnabled() {
        ConfigPayload.ReportIncentivizedSettings reportIncentivizedSettingsIsReportIncentivizedEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (reportIncentivizedSettingsIsReportIncentivizedEnabled = configPayload.isReportIncentivizedEnabled()) == null) {
            return false;
        }
        return reportIncentivizedSettingsIsReportIncentivizedEnabled.getEnabled();
    }

    public final String getConfigExtension() {
        String str = configExt;
        return str == null ? "" : str;
    }

    public final void updateConfigExtension(String ext) {
        configExt = ext;
    }

    public final boolean omEnabled() {
        ConfigPayload.ViewabilitySettings viewability;
        ConfigPayload configPayload = config;
        if (configPayload == null || (viewability = configPayload.getViewability()) == null) {
            return false;
        }
        return viewability.getOm();
    }

    public final boolean heartbeatEnabled() {
        ConfigPayload.Template template;
        ConfigPayload configPayload = config;
        if (configPayload == null || (template = configPayload.getTemplate()) == null) {
            return false;
        }
        return template.getHeartbeatEnabled();
    }

    public final String getMetricsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getMetricsEndpoint();
        }
        return null;
    }

    public final String getErrorLoggingEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getErrorLogsEndpoint();
        }
        return null;
    }

    public final boolean getMetricsEnabled() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        ConfigPayload configPayload = config;
        if (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null) {
            return false;
        }
        return logMetricsSettings.getMetricsEnabled();
    }

    public final int getLogLevel() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        ConfigPayload configPayload = config;
        return (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null) ? AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel() : logMetricsSettings.getErrorLogLevel();
    }

    public final long getSessionTimeout() {
        ConfigPayload.Session session;
        ConfigPayload configPayload = config;
        return ((configPayload == null || (session = configPayload.getSession()) == null) ? 900 : session.getTimeout()) * 1000;
    }

    public final long getSignalsSessionTimeout() {
        Integer signalSessionTimeout;
        ConfigPayload configPayload = config;
        return ((configPayload == null || (signalSessionTimeout = configPayload.getSignalSessionTimeout()) == null) ? DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS : signalSessionTimeout.intValue()) * 1000;
    }

    public final boolean rtaDebuggingEnabled() {
        Boolean rtaDebugging;
        ConfigPayload configPayload = config;
        if (configPayload == null || (rtaDebugging = configPayload.getRtaDebugging()) == null) {
            return false;
        }
        return rtaDebugging.booleanValue();
    }

    public final boolean isCacheableAssetsRequired() {
        Boolean boolIsCacheableAssetsRequired;
        ConfigPayload configPayload = config;
        if (configPayload == null || (boolIsCacheableAssetsRequired = configPayload.isCacheableAssetsRequired()) == null) {
            return false;
        }
        return boolIsCacheableAssetsRequired.booleanValue();
    }

    public final boolean signalsDisabled() {
        Boolean signalsDisabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (signalsDisabled = configPayload.getSignalsDisabled()) == null) {
            return false;
        }
        return signalsDisabled.booleanValue();
    }

    public final boolean validateEndpoints() {
        boolean z;
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String adsEndpoint = endpoints2 != null ? endpoints2.getAdsEndpoint() : null;
        boolean z2 = true;
        if (adsEndpoint == null || adsEndpoint.length() == 0) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(122, "The ads endpoint was not provided in the config.", (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
            z = false;
        } else {
            z = true;
        }
        ConfigPayload.Endpoints endpoints3 = endpoints;
        String riEndpoint = endpoints3 != null ? endpoints3.getRiEndpoint() : null;
        if (riEndpoint == null || riEndpoint.length() == 0) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(123, "The ri endpoint was not provided in the config.", (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
        }
        ConfigPayload.Endpoints endpoints4 = endpoints;
        String mraidEndpoint = endpoints4 != null ? endpoints4.getMraidEndpoint() : null;
        if (mraidEndpoint == null || mraidEndpoint.length() == 0) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(130, "The mraid endpoint was not provided in the config.", (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
            z = false;
        }
        ConfigPayload.Endpoints endpoints5 = endpoints;
        String metricsEndpoint = endpoints5 != null ? endpoints5.getMetricsEndpoint() : null;
        if (metricsEndpoint == null || metricsEndpoint.length() == 0) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(125, "The metrics endpoint was not provided in the config.", (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
        }
        ConfigPayload.Endpoints endpoints6 = endpoints;
        String errorLogsEndpoint = endpoints6 != null ? endpoints6.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint != null && errorLogsEndpoint.length() != 0) {
            z2 = false;
        }
        if (z2) {
            Logger.INSTANCE.e(TAG, "The error logging endpoint was not provided in the config.");
        }
        return z;
    }

    public final boolean isCleverCacheEnabled() {
        CleverCache cleverCache;
        Boolean enabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (enabled = cleverCache.getEnabled()) == null) {
            return false;
        }
        return enabled.booleanValue();
    }

    public final long getCleverCacheDiskSize() {
        CleverCache cleverCache;
        Long diskSize;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskSize = cleverCache.getDiskSize()) == null) {
            return 1048576000L;
        }
        long j = 1024;
        return diskSize.longValue() * j * j;
    }

    public final int getCleverCacheDiskPercentage() {
        CleverCache cleverCache;
        Integer diskPercentage;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskPercentage = cleverCache.getDiskPercentage()) == null) {
            return 3;
        }
        return diskPercentage.intValue();
    }
}
