package com.vungle.ads.internal.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.core.util.Consumer;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdvertisingInfo;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.util.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidPlatform.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 '2\u00020\u0001:\u0001'B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001f\u001a\u00020\bH\u0016J\n\u0010 \u001a\u0004\u0018\u00010\nH\u0017J\n\u0010!\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\"\u001a\u00020#2\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0%H\u0016J\b\u0010&\u001a\u00020#H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\n8VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/vungle/ads/internal/platform/AndroidPlatform;", "Lcom/vungle/ads/internal/platform/Platform;", "context", "Landroid/content/Context;", "uaExecutor", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "(Landroid/content/Context;Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;)V", "advertisingInfo", "Lcom/vungle/ads/internal/model/AdvertisingInfo;", "appSetId", "", "carrierName", "getCarrierName", "()Ljava/lang/String;", "isAtLeastMinimumSDK", "", "()Z", "isBatterySaverEnabled", "isSdCardPresent", "isSideLoaded", "isSoundEnabled", "powerManager", "Landroid/os/PowerManager;", "userAgent", "getUserAgent", "setUserAgent", "(Ljava/lang/String;)V", "volumeLevel", "", "getVolumeLevel", "()F", "getAdvertisingInfo", "getAndroidId", "getAppSetId", "getUserAgentLazy", "", "consumer", "Landroidx/core/util/Consumer;", "updateAppSetID", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidPlatform implements Platform {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "AndroidPlatform";
    private AdvertisingInfo advertisingInfo;
    private String appSetId;
    private final Context context;
    private final boolean isSideLoaded;
    private final PowerManager powerManager;
    private final VungleThreadPoolExecutor uaExecutor;
    private String userAgent;

    public AndroidPlatform(Context context, VungleThreadPoolExecutor uaExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uaExecutor, "uaExecutor");
        this.context = context;
        this.uaExecutor = uaExecutor;
        updateAppSetID();
        Object systemService = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        this.powerManager = (PowerManager) systemService;
    }

    /* compiled from: AndroidPlatform.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/platform/AndroidPlatform$Companion;", "", "()V", "TAG", "", "getCarrierName", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "getCarrierName$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getCarrierName$vungle_ads_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("phone");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            return ((TelephonyManager) systemService).getNetworkOperatorName();
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isAtLeastMinimumSDK() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isBatterySaverEnabled() {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.powerManager.isPowerSaveMode();
        }
        return false;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    /* renamed from: isSideLoaded, reason: from getter */
    public boolean getIsSideLoaded() {
        return this.isSideLoaded;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public float getVolumeLevel() {
        try {
            Object systemService = this.context.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSoundEnabled() {
        try {
            Object systemService = this.context.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return ((AudioManager) systemService).getStreamVolume(3) > 0;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getCarrierName() {
        String carrierName$vungle_ads_release = INSTANCE.getCarrierName$vungle_ads_release(this.context);
        Intrinsics.checkNotNullExpressionValue(carrierName$vungle_ads_release, "getCarrierName(context)");
        return carrierName$vungle_ads_release;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSdCardPresent() {
        try {
            return Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e) {
            Logger.INSTANCE.e(TAG, "Acquiring external storage state failed", e);
            return false;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public void getUserAgentLazy(final Consumer<String> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.uaExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.platform.AndroidPlatform$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AndroidPlatform.m957getUserAgentLazy$lambda0(this.f$0, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getUserAgentLazy$lambda-0, reason: not valid java name */
    public static final void m957getUserAgentLazy$lambda0(AndroidPlatform this$0, Consumer consumer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consumer, "$consumer");
        new WebViewUtil(this$0.context).getUserAgent(consumer);
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public AdvertisingInfo getAdvertisingInfo() {
        AdvertisingInfo advertisingInfo = this.advertisingInfo;
        if (advertisingInfo != null) {
            String advertisingId = advertisingInfo.getAdvertisingId();
            if (!(advertisingId == null || advertisingId.length() == 0)) {
                return advertisingInfo;
            }
        }
        AdvertisingInfo advertisingInfo2 = new AdvertisingInfo();
        try {
            if (Intrinsics.areEqual("Amazon", Build.MANUFACTURER)) {
                try {
                    ContentResolver contentResolver = this.context.getContentResolver();
                    advertisingInfo2.setLimitAdTracking(Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 1);
                    advertisingInfo2.setAdvertisingId(Settings.Secure.getString(contentResolver, "advertising_id"));
                } catch (Settings.SettingNotFoundException e) {
                    Logger.INSTANCE.w(TAG, "Error getting Amazon advertising info", e);
                }
            } else {
                try {
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.context);
                        Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(context)");
                        advertisingInfo2.setAdvertisingId(advertisingIdInfo.getId());
                        advertisingInfo2.setLimitAdTracking(advertisingIdInfo.isLimitAdTrackingEnabled());
                    } catch (NoClassDefFoundError e2) {
                        Logger.INSTANCE.e(TAG, "Play services Not available: " + e2.getLocalizedMessage());
                        advertisingInfo2.setAdvertisingId(Settings.Secure.getString(this.context.getContentResolver(), "advertising_id"));
                    }
                } catch (GooglePlayServicesNotAvailableException e3) {
                    Logger.INSTANCE.e(TAG, "Play services Not available: " + e3.getLocalizedMessage());
                }
            }
        } catch (Exception unused) {
            Logger.INSTANCE.e(TAG, "Cannot load Advertising ID");
        }
        this.advertisingInfo = advertisingInfo2;
        return advertisingInfo2;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getAppSetId() {
        return this.appSetId;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getAndroidId() {
        return PrivacyManager.INSTANCE.getPublishAndroidId() ? Settings.Secure.getString(this.context.getContentResolver(), "android_id") : "";
    }

    private final void updateAppSetID() {
        try {
            AppSetIdClient client = AppSet.getClient(this.context);
            Intrinsics.checkNotNullExpressionValue(client, "getClient(context)");
            Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
            Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "client.appSetIdInfo");
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.vungle.ads.internal.platform.AndroidPlatform$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    AndroidPlatform.m958updateAppSetID$lambda1(this.f$0, (AppSetIdInfo) obj);
                }
            });
        } catch (NoClassDefFoundError e) {
            Logger.INSTANCE.e(TAG, "Required libs to get AppSetID Not available: " + e.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateAppSetID$lambda-1, reason: not valid java name */
    public static final void m958updateAppSetID$lambda1(AndroidPlatform this$0, AppSetIdInfo appSetIdInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (appSetIdInfo != null) {
            this$0.appSetId = appSetIdInfo.getId();
        }
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getUserAgent() {
        String str = this.userAgent;
        return str == null ? System.getProperty("http.agent") : str;
    }
}
