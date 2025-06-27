package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.json.t2;
import com.unity3d.ads.core.data.model.StorageType;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import gateway.v1.StaticDeviceInfoKt;
import gateway.v1.StaticDeviceInfoOuterClass;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import org.koin.core.annotation.Named;
import org.koin.core.annotation.Single;

/* compiled from: AndroidStaticDeviceInfoDataSource.kt */
@Single
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 i2\u00020\u0001:\u0001iB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u0015\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u0006\u0010\u001a\u001a\u00020\u000eJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u000eH\u0002J\u0011\u0010!\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0006\u0010#\u001a\u00020\u000eJ\u0006\u0010$\u001a\u00020\u000eJ\u0006\u0010%\u001a\u00020\u000eJ\b\u0010&\u001a\u0004\u0018\u00010\u000eJ\b\u0010'\u001a\u0004\u0018\u00010\u000eJ\b\u0010(\u001a\u00020\u001fH\u0002J\b\u0010)\u001a\u00020\u000eH\u0002J\b\u0010*\u001a\u00020\u000eH\u0003J\u0006\u0010+\u001a\u00020\u000eJ\u0006\u0010,\u001a\u00020\u000eJ\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u001cH\u0002J\u0012\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020\u000eH\u0002J\u0013\u00105\u001a\u0004\u0018\u00010\u000eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\b\u00106\u001a\u00020\u000eH\u0002J\u0006\u00107\u001a\u00020\u000eJ\u0006\u00108\u001a\u00020\u000eJ\u0011\u00109\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\b\u0010:\u001a\u00020\u000eH\u0003J\b\u0010;\u001a\u00020\u000eH\u0016J\u0010\u0010<\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020>H\u0002J\u0012\u0010?\u001a\u00020\u001f2\b\u0010@\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010A\u001a\u00020\u000eH\u0016J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000e0CH\u0003J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000e0EH\u0002J\b\u0010F\u001a\u00020\u000eH\u0002J\b\u0010G\u001a\u00020\u000eH\u0016J\b\u0010H\u001a\u00020\u000eH\u0002J\u0006\u0010I\u001a\u00020\u000eJ\b\u0010J\u001a\u00020\u001cH\u0002J\b\u0010K\u001a\u00020\u001cH\u0002J\b\u0010L\u001a\u00020\u001cH\u0002J\b\u0010M\u001a\u00020\u001cH\u0002J\f\u0010N\u001a\b\u0012\u0004\u0012\u00020O0EJ\u000e\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000e0EH\u0002J\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000e0EJ\u0006\u0010R\u001a\u00020\u001fJ\u0010\u0010S\u001a\u00020\u001f2\b\u0010T\u001a\u0004\u0018\u000101J\b\u0010U\u001a\u00020\u001cH\u0002J\b\u0010V\u001a\u00020\u000eH\u0002J\b\u0010W\u001a\u00020\u000eH\u0002J\u0006\u0010X\u001a\u00020YJ\u0006\u0010Z\u001a\u00020YJ\b\u0010[\u001a\u00020YH\u0002J\u001a\u0010\\\u001a\u00020Y2\u0006\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010`\u001a\u00020Y2\u0006\u0010]\u001a\u00020^H\u0003J\u0006\u0010a\u001a\u00020YJ\b\u0010b\u001a\u00020YH\u0002J\u001a\u0010c\u001a\u00020Y2\u0006\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010d\u001a\u00020Y2\u0006\u0010]\u001a\u00020^H\u0003J\b\u0010e\u001a\u00020YH\u0002J\u0010\u0010f\u001a\u00020Y2\u0006\u0010g\u001a\u00020\u000eH\u0002J\u0018\u0010h\u001a\b\u0012\u0004\u0012\u00020^0E2\b\u0010_\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006j"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidStaticDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", "context", "Landroid/content/Context;", "idfiStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "auidStore", "glInfoStore", "analyticsDataSource", "Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;)V", "DEBUG_CERT", "Ljavax/security/auth/x500/X500Principal;", "analyticsUserId", "", "getAnalyticsUserId", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "staticDeviceInfo", "Lgateway/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", RemoteConfigComponent.FETCH_FILE_NAME, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAndroidStaticDeviceInfo", "Lgateway/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "fetchCached", "getAdvertisingTrackingId", "getApiLevel", "", "getAppName", "getAppStartTime", "", "getAppVersion", "getAuid", "Lcom/google/protobuf/ByteString;", "getBoard", "getBootloader", "getBrand", "getBuildId", "getBuildVersionIncremental", "getCPUCount", "getCPUModel", "getCertificateFingerprint", "getDevice", "getDisplay", "getDisplayMetricDensity", "", "getExtensionVersion", "getFileForStorageType", "Ljava/io/File;", "storageType", "Lcom/unity3d/ads/core/data/model/StorageType;", "getFingerprint", "getGPUModel", "getGameId", "getHardware", "getHost", "getIdfi", "getInstallerPackageName", "getManufacturer", "getMemoryInfo", "infoType", "Lcom/unity3d/services/core/device/Device$MemoryInfoType;", "getMemoryValueFromString", "memVal", "getModel", "getNewAbiList", "Ljava/util/ArrayList;", "getOldAbiList", "", "getOpenAdvertisingTrackingId", "getOsVersion", "getPlatform", "getProduct", "getScreenDensity", "getScreenHeight", "getScreenLayout", "getScreenWidth", "getSensorList", "Landroid/hardware/Sensor;", "getStores", "getSupportedAbis", "getTotalMemory", "getTotalSpace", t2.h.b, "getVersionCode", "getVersionName", "getWebViewUserAgent", "hasX264Decoder", "", "hasX265Decoder", "isAppDebuggable", "isHardwareAccelerated", "codecInfo", "Landroid/media/MediaCodecInfo;", "mimeType", "isHardwareAcceleratedV29", "isLimitOpenAdTrackingEnabled", "isRooted", "isSoftwareOnly", "isSoftwareOnlyV29", "isTestMode", "searchPathForBinary", "binary", "selectAllDecodeCodecs", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidStaticDeviceInfoDataSource implements StaticDeviceInfoDataSource {
    public static final String ALGORITHM_SHA1 = "SHA-1";
    public static final String APP_VERSION_FAKE = "FakeVersionName";
    public static final String BINARY_SU = "su";
    public static final String CERTIFICATE_TYPE_X509 = "X.509";
    public static final String ENVIRONMENT_VARIABLE_PATH = "PATH";
    public static final String PLATFORM_ANDROID = "android";
    public static final String PREF_KEY_AUID = "auid";
    public static final String PREF_KEY_IDFI = "unityads-idfi";
    public static final String PREF_KEY_INSTALLINFO = "unityads-installinfo";
    public static final String PREF_KEY_SUPERSONIC = "supersonic_shared_preferen";
    public static final String STORE_GOOGLE = "google";
    private final X500Principal DEBUG_CERT;
    private final AnalyticsDataSource analyticsDataSource;
    private final ByteStringDataSource auidStore;
    private final Context context;
    private final ByteStringDataSource glInfoStore;
    private final ByteStringDataSource idfiStore;
    private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo;

    /* compiled from: AndroidStaticDeviceInfoDataSource.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Device.MemoryInfoType.values().length];
            try {
                iArr[Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StorageType.values().length];
            try {
                iArr2[StorageType.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[StorageType.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: AndroidStaticDeviceInfoDataSource.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", i = {0}, l = {99}, m = RemoteConfigComponent.FETCH_FILE_NAME, n = {"this"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidStaticDeviceInfoDataSource.this.fetch(this);
        }
    }

    /* compiled from: AndroidStaticDeviceInfoDataSource.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", i = {}, l = {224}, m = "getAuid", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getAuid$1, reason: invalid class name and case insensitive filesystem */
    static final class C14511 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C14511(Continuation<? super C14511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidStaticDeviceInfoDataSource.this.getAuid(this);
        }
    }

    /* compiled from: AndroidStaticDeviceInfoDataSource.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", i = {}, l = {474}, m = "getGPUModel", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1, reason: invalid class name and case insensitive filesystem */
    static final class C14521 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C14521(Continuation<? super C14521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidStaticDeviceInfoDataSource.this.getGPUModel(this);
        }
    }

    /* compiled from: AndroidStaticDeviceInfoDataSource.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", i = {}, l = {212}, m = "getIdfi", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getIdfi$1, reason: invalid class name and case insensitive filesystem */
    static final class C14531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C14531(Continuation<? super C14531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidStaticDeviceInfoDataSource.this.getIdfi(this);
        }
    }

    private final String getPlatform() {
        return "android";
    }

    private final int getVersionCode() {
        return 41103;
    }

    private final String getVersionName() {
        return "4.11.3";
    }

    public AndroidStaticDeviceInfoDataSource(Context context, @Named(ServiceProvider.DATA_STORE_IDFI) ByteStringDataSource idfiStore, @Named(ServiceProvider.DATA_STORE_AUID) ByteStringDataSource auidStore, @Named(ServiceProvider.DATA_STORE_GL_INFO) ByteStringDataSource glInfoStore, AnalyticsDataSource analyticsDataSource) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(idfiStore, "idfiStore");
        Intrinsics.checkNotNullParameter(auidStore, "auidStore");
        Intrinsics.checkNotNullParameter(glInfoStore, "glInfoStore");
        Intrinsics.checkNotNullParameter(analyticsDataSource, "analyticsDataSource");
        this.context = context;
        this.idfiStore = idfiStore;
        this.auidStore = auidStore;
        this.glInfoStore = glInfoStore;
        this.analyticsDataSource = analyticsDataSource;
        this.DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        StaticDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setBundleId(getAppName());
        dsl_create.setBundleVersion(getAppVersion());
        dsl_create.setAppDebuggable(isAppDebuggable());
        dsl_create.setRooted(isRooted());
        dsl_create.setOsVersion(getOsVersion());
        dsl_create.setDeviceMake(getManufacturer());
        dsl_create.setDeviceModel(getModel());
        dsl_create.setWebviewUa(getWebViewUserAgent());
        dsl_create.setScreenDensity(getScreenDensity());
        dsl_create.setScreenWidth(getScreenWidth());
        dsl_create.setScreenHeight(getScreenHeight());
        dsl_create.setScreenSize(getScreenLayout());
        dsl_create.addAllStores(dsl_create.getStores(), getStores());
        dsl_create.setTotalDiskSpace(getTotalSpace(getFileForStorageType(StorageType.EXTERNAL)));
        dsl_create.setTotalRamMemory(getTotalMemory());
        dsl_create.setCpuModel(getCPUModel());
        dsl_create.setCpuCount(getCPUCount());
        dsl_create.setAndroid(fetchAndroidStaticDeviceInfo());
        this.staticDeviceInfo = dsl_create._build();
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetch(kotlin.coroutines.Continuation<? super gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r6
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5f
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            gateway.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r6 = r5.staticDeviceInfo
            java.lang.String r6 = r6.getGpuModel()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L4d
            int r6 = r6.length()
            if (r6 != 0) goto L4b
            goto L4d
        L4b:
            r6 = r3
            goto L4e
        L4d:
            r6 = r4
        L4e:
            if (r6 != 0) goto L53
            gateway.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r6 = r5.staticDeviceInfo
            return r6
        L53:
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.getGPUModel(r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            r0 = r5
        L5f:
            java.lang.String r6 = (java.lang.String) r6
            r1 = r6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L6c
            int r1 = r1.length()
            if (r1 != 0) goto L6d
        L6c:
            r3 = r4
        L6d:
            if (r3 == 0) goto L72
            gateway.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r6 = r0.staticDeviceInfo
            return r6
        L72:
            gateway.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r1 = r0.staticDeviceInfo
            gateway.v1.StaticDeviceInfoKt$Dsl$Companion r2 = gateway.v1.StaticDeviceInfoKt.Dsl.INSTANCE
            com.google.protobuf.GeneratedMessageLite$Builder r1 = r1.toBuilder()
            java.lang.String r3 = "this.toBuilder()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            gateway.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder r1 = (gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) r1
            gateway.v1.StaticDeviceInfoKt$Dsl r1 = r2._create(r1)
            r1.setGpuModel(r6)
            gateway.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r6 = r1._build()
            r0.staticDeviceInfo = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.fetch(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    /* renamed from: fetchCached, reason: from getter */
    public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
        return this.staticDeviceInfo;
    }

    private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android fetchAndroidStaticDeviceInfo() {
        StaticDeviceInfoKt staticDeviceInfoKt = StaticDeviceInfoKt.INSTANCE;
        StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = StaticDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        StaticDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setApiLevel(getApiLevel());
        dsl_create.setVersionCode(getVersionCode());
        dsl_create.setAndroidFingerprint(getFingerprint());
        dsl_create.setAppInstaller(getInstallerPackageName());
        dsl_create.setApkDeveloperSigningCertificateHash(getCertificateFingerprint());
        dsl_create.setBuildBoard(getBoard());
        dsl_create.setBuildBrand(getBrand());
        dsl_create.setBuildDevice(getDevice());
        dsl_create.setBuildDisplay(getDisplay());
        dsl_create.setBuildFingerprint(getFingerprint());
        dsl_create.setBuildHardware(getHardware());
        dsl_create.setBuildHost(getHost());
        dsl_create.setBuildBootloader(getBootloader());
        dsl_create.setBuildProduct(getProduct());
        dsl_create.setExtensionVersion(getExtensionVersion());
        String buildId = getBuildId();
        if (buildId != null) {
            dsl_create.setBuildId(buildId);
        }
        return dsl_create._build();
    }

    private final int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getManufacturer() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getModel() {
        String str = Build.MODEL;
        return str == null ? "" : str;
    }

    private final int getScreenLayout() {
        return this.context.getResources().getConfiguration().screenLayout;
    }

    public final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }

    public final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getIdfi(kotlin.coroutines.Continuation<? super com.google.protobuf.ByteString> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.C14531
            if (r0 == 0) goto L14
            r0 = r5
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getIdfi$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.C14531) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getIdfi$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getIdfi$1
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.idfiStore
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            ByteStringStoreOuterClass$ByteStringStore r5 = (ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "idfiStore.get().data"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.getIdfi(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getAnalyticsUserId() {
        return this.analyticsDataSource.getUserId();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getAuid(kotlin.coroutines.Continuation<? super com.google.protobuf.ByteString> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.C14511
            if (r0 == 0) goto L14
            r0 = r5
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getAuid$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.C14511) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getAuid$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getAuid$1
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.auidStore
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            ByteStringStoreOuterClass$ByteStringStore r5 = (ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "auidStore.get().data"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.getAuid(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final float getDisplayMetricDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 0.0f;
        }
        return displayMetrics.density;
    }

    private final int getScreenDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.densityDpi;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final boolean isRooted() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            return searchPathForBinary("su");
        } catch (Exception e) {
            DeviceLog.exception("Rooted check failed", e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean searchPathForBinary(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "PATH"
            java.lang.String r0 = java.lang.System.getenv(r0)
            r1 = 0
            if (r0 == 0) goto L92
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            kotlin.text.Regex r2 = new kotlin.text.Regex
            java.lang.String r3 = ":"
            r2.<init>(r3)
            java.util.List r0 = r2.split(r0, r1)
            if (r0 == 0) goto L92
            boolean r2 = r0.isEmpty()
            r3 = 1
            if (r2 != 0) goto L4c
            int r2 = r0.size()
            java.util.ListIterator r2 = r0.listIterator(r2)
        L27:
            boolean r4 = r2.hasPrevious()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r2.previous()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 != 0) goto L3d
            r4 = r3
            goto L3e
        L3d:
            r4 = r1
        L3e:
            if (r4 != 0) goto L27
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            int r2 = r2.nextIndex()
            int r2 = r2 + r3
            java.util.List r0 = kotlin.collections.CollectionsKt.take(r0, r2)
            goto L50
        L4c:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L50:
            if (r0 == 0) goto L92
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 == 0) goto L92
            int r2 = r0.length
            r4 = r1
        L60:
            if (r4 >= r2) goto L92
            r5 = r0[r4]
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            boolean r5 = r6.exists()
            if (r5 == 0) goto L8f
            boolean r5 = r6.isDirectory()
            if (r5 == 0) goto L8f
            java.io.File[] r5 = r6.listFiles()
            if (r5 == 0) goto L8f
            int r6 = r5.length
            r7 = r1
        L7d:
            if (r7 >= r6) goto L8f
            r8 = r5[r7]
            java.lang.String r8 = r8.getName()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r10)
            if (r8 == 0) goto L8c
            return r3
        L8c:
            int r7 = r7 + 1
            goto L7d
        L8f:
            int r4 = r4 + 1
            goto L60
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.searchPathForBinary(java.lang.String):boolean");
    }

    @Deprecated(message = "This constant was deprecated in API level 28. Use GET_SIGNING_CERTIFICATES instead")
    private final String getCertificateFingerprint() throws IllegalAccessException, NoSuchMethodException, SecurityException, CertificateException, IllegalArgumentException, InvocationTargetException {
        try {
            Signature[] signatureArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
            if (signatureArr == null) {
                return "";
            }
            if (!(!(signatureArr.length == 0))) {
                return "";
            }
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
            Intrinsics.checkNotNull(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            String hexString = Utilities.toHexString(MessageDigest.getInstance(ALGORITHM_SHA1).digest(((X509Certificate) certificateGenerateCertificate).getEncoded()));
            Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(publicKey)");
            return hexString;
        } catch (Exception e) {
            DeviceLog.exception("Exception when signing certificate fingerprint", e);
            return "";
        }
    }

    public final String getBoard() {
        String str = Build.BOARD;
        return str == null ? "" : str;
    }

    public final String getBootloader() {
        String str = Build.BOOTLOADER;
        return str == null ? "" : str;
    }

    public final String getBrand() {
        String str = Build.BRAND;
        return str == null ? "" : str;
    }

    public final String getDisplay() {
        String str = Build.DISPLAY;
        return str == null ? "" : str;
    }

    public final String getDevice() {
        String str = Build.DEVICE;
        return str == null ? "" : str;
    }

    public final String getHardware() {
        String str = Build.HARDWARE;
        return str == null ? "" : str;
    }

    public final String getHost() {
        String str = Build.HOST;
        return str == null ? "" : str;
    }

    public final String getProduct() {
        String str = Build.PRODUCT;
        return str == null ? "" : str;
    }

    private final String getFingerprint() {
        String str = Build.FINGERPRINT;
        return str == null ? "" : str;
    }

    @Deprecated(message = "This method was deprecated in API level 30. use getInstallSourceInfo")
    private final String getInstallerPackageName() {
        String installerPackageName = this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    public final List<String> getSupportedAbis() {
        if (getApiLevel() < 21) {
            return getOldAbiList();
        }
        return getNewAbiList();
    }

    public final List<Sensor> getSensorList() {
        Object systemService = this.context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        List<Sensor> sensorList = ((SensorManager) systemService).getSensorList(-1);
        Intrinsics.checkNotNullExpressionValue(sensorList, "sensorManager.getSensorList(Sensor.TYPE_ALL)");
        return sensorList;
    }

    private final String getCPUModel() {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.SOC_MODEL;
            Intrinsics.checkNotNullExpressionValue(str, "{\n            Build.SOC_MODEL\n        }");
            return str;
        }
        return (String) CollectionsKt.last(FilesKt.readLines$default(new File("/proc/cpuinfo"), null, 1, null));
    }

    private final long getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getGPUModel(kotlin.coroutines.Continuation<? super java.lang.String> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.C14521
            if (r0 == 0) goto L14
            r0 = r5
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.C14521) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.glInfoStore
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            ByteStringStoreOuterClass$ByteStringStore r5 = (ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.nio.charset.Charset r0 = kotlin.text.Charsets.ISO_8859_1
            java.lang.String r5 = r5.toString(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.getGPUModel(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String getBuildId() {
        return Build.ID;
    }

    public final String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    private final List<String> getOldAbiList() {
        ArrayList arrayList = new ArrayList();
        String CPU_ABI = Build.CPU_ABI;
        Intrinsics.checkNotNullExpressionValue(CPU_ABI, "CPU_ABI");
        arrayList.add(CPU_ABI);
        String CPU_ABI2 = Build.CPU_ABI2;
        Intrinsics.checkNotNullExpressionValue(CPU_ABI2, "CPU_ABI2");
        arrayList.add(CPU_ABI2);
        return arrayList;
    }

    private final ArrayList<String> getNewAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        arrayList.addAll(CollectionsKt.listOf(Arrays.copyOf(SUPPORTED_ABIS, SUPPORTED_ABIS.length)));
        return arrayList;
    }

    private final String getWebViewUserAgent() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.context);
            Intrinsics.checkNotNullExpressionValue(defaultUserAgent, "{\n        WebSettings.ge…tUserAgent(context)\n    }");
            return defaultUserAgent;
        } catch (Exception e) {
            DeviceLog.exception("Exception getting webview user agent", e);
            return "";
        }
    }

    private final List<String> getStores() {
        return CollectionsKt.listOf(STORE_GOOGLE);
    }

    private final long getAppStartTime() {
        return SdkProperties.getInitializationTimeEpoch();
    }

    private final boolean isTestMode() {
        return SdkProperties.isTestMode();
    }

    private final String getGameId() {
        String gameId = ClientProperties.getGameId();
        return gameId == null ? "" : gameId;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    private final long getMemoryInfo(Device.MemoryInfoType infoType) {
        int i = WhenMappings.$EnumSwitchMapping$0[infoType.ordinal()];
        int i2 = 2;
        if (i == 1) {
            i2 = 1;
        } else if (i != 2) {
            i2 = -1;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, "r");
        try {
            RandomAccessFile randomAccessFile2 = randomAccessFile;
            String line = null;
            for (int i3 = 0; i3 < i2; i3++) {
                line = randomAccessFile2.readLine();
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(randomAccessFile, null);
            return getMemoryValueFromString(line);
        } finally {
        }
    }

    private final long getMemoryValueFromString(String memVal) {
        if (memVal == null) {
            return 0L;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(memVal);
        String strGroup = null;
        while (matcher.find()) {
            strGroup = matcher.group(1);
        }
        if (strGroup != null) {
            return Long.parseLong(strGroup);
        }
        return -1L;
    }

    public final long getTotalSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return MathKt.roundToInt(file.getTotalSpace() / 1024);
    }

    private final File getFileForStorageType(StorageType storageType) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i = WhenMappings.$EnumSwitchMapping$1[storageType.ordinal()];
        if (i == 1) {
            return ClientProperties.getApplicationContext().getCacheDir();
        }
        if (i == 2) {
            return ClientProperties.getApplicationContext().getExternalCacheDir();
        }
        DeviceLog.error("Unhandled storagetype: " + storageType);
        return null;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getAppName() {
        String packageName = this.context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return packageName;
    }

    private final String getAppVersion() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String packageName = this.context.getPackageName();
        PackageManager packageManager = this.context.getPackageManager();
        try {
            String str = packageManager.getPackageInfo(packageName, 0).versionName == null ? APP_VERSION_FAKE : packageManager.getPackageInfo(packageName, 0).versionName;
            Intrinsics.checkNotNullExpressionValue(str, "{\n            if (pm.get…e\n            }\n        }");
            return str;
        } catch (PackageManager.NameNotFoundException e) {
            DeviceLog.exception("Error getting package info", e);
            return "";
        }
    }

    private final boolean isAppDebuggable() throws IllegalAccessException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, CertificateException, IllegalArgumentException, InvocationTargetException {
        boolean zAreEqual;
        PackageManager packageManager = this.context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        String packageName = this.context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        boolean z = true;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(pkgName, 0)");
            applicationInfo.flags &= 2;
            if (applicationInfo.flags != 0) {
                zAreEqual = true;
                z = false;
            } else {
                z = false;
                zAreEqual = false;
            }
        } catch (PackageManager.NameNotFoundException e) {
            DeviceLog.exception("Could not find name", e);
            zAreEqual = false;
        }
        if (z) {
            try {
                Signature[] signatures = packageManager.getPackageInfo(packageName, 64).signatures;
                Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
                for (Signature signature : signatures) {
                    Certificate certificateGenerateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                    Intrinsics.checkNotNull(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    zAreEqual = Intrinsics.areEqual(((X509Certificate) certificateGenerateCertificate).getSubjectX500Principal(), this.DEBUG_CERT);
                    if (zAreEqual) {
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                DeviceLog.exception("Could not find name", e2);
            } catch (CertificateException e3) {
                DeviceLog.exception("Certificate exception", e3);
            }
        }
        return zAreEqual;
    }

    private final int getExtensionVersion() {
        if (Build.VERSION.SDK_INT >= 30) {
            return SdkExtensions.getExtensionVersion(30);
        }
        return -1;
    }

    public final boolean hasX264Decoder() {
        return !selectAllDecodeCodecs("video/avc").isEmpty();
    }

    public final boolean hasX265Decoder() {
        return !selectAllDecodeCodecs("video/hevc").isEmpty();
    }

    private final List<MediaCodecInfo> selectAllDecodeCodecs(String mimeType) {
        ArrayList arrayList = new ArrayList();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfo = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfo.isEncoder()) {
                for (String str : codecInfo.getSupportedTypes()) {
                    if (StringsKt.equals(str, mimeType, true)) {
                        Intrinsics.checkNotNullExpressionValue(codecInfo, "codecInfo");
                        if (isHardwareAccelerated(codecInfo, mimeType)) {
                            arrayList.add(codecInfo);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final boolean isHardwareAccelerated(MediaCodecInfo codecInfo, String mimeType) {
        if (getApiLevel() >= 29) {
            return isHardwareAcceleratedV29(codecInfo);
        }
        return !isSoftwareOnly(codecInfo, mimeType);
    }

    private final boolean isHardwareAcceleratedV29(MediaCodecInfo codecInfo) {
        return codecInfo.isHardwareAccelerated();
    }

    private final boolean isSoftwareOnly(MediaCodecInfo codecInfo, String mimeType) {
        if (getApiLevel() >= 29) {
            return isSoftwareOnlyV29(codecInfo);
        }
        String name = codecInfo.getName();
        Intrinsics.checkNotNullExpressionValue(name, "codecInfo.name");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = name.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt.startsWith$default(lowerCase, "arc.", false, 2, (Object) null)) {
            return false;
        }
        return StringsKt.startsWith$default(lowerCase, "omx.google.", false, 2, (Object) null) || StringsKt.startsWith$default(lowerCase, "omx.ffmpeg.", false, 2, (Object) null) || (StringsKt.startsWith$default(lowerCase, "omx.sec.", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) ".sw.", false, 2, (Object) null)) || Intrinsics.areEqual(lowerCase, "omx.qcom.video.decoder.hevcswvdec") || StringsKt.startsWith$default(lowerCase, "c2.android.", false, 2, (Object) null) || StringsKt.startsWith$default(lowerCase, "c2.google.", false, 2, (Object) null) || !(StringsKt.startsWith$default(lowerCase, "omx.", false, 2, (Object) null) || StringsKt.startsWith$default(lowerCase, "c2.", false, 2, (Object) null));
    }

    private final boolean isSoftwareOnlyV29(MediaCodecInfo codecInfo) {
        return codecInfo.isSoftwareOnly();
    }
}
