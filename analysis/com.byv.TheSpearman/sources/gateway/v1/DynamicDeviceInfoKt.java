package gateway.v1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import gateway.v1.DynamicDeviceInfoOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DynamicDeviceInfoKt.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0002\b\nJ*\u0010\u000b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lgateway/v1/DynamicDeviceInfoKt;", "", "()V", "android", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "block", "Lkotlin/Function1;", "Lgateway/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeandroid", "ios", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "Lgateway/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "-initializeios", "AndroidKt", "Dsl", "IosKt", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DynamicDeviceInfoKt {
    public static final DynamicDeviceInfoKt INSTANCE = new DynamicDeviceInfoKt();

    /* compiled from: DynamicDeviceInfoKt.kt */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0007\u0018\u0000 v2\u00020\u0001:\u0001vB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010R\u001a\u00020SH\u0001J\u0006\u0010T\u001a\u00020UJ\u0006\u0010V\u001a\u00020UJ\u0006\u0010W\u001a\u00020UJ\u0006\u0010X\u001a\u00020UJ\u0006\u0010Y\u001a\u00020UJ\u0006\u0010Z\u001a\u00020UJ\u0006\u0010[\u001a\u00020UJ\u0006\u0010\\\u001a\u00020UJ\u0006\u0010]\u001a\u00020UJ\u0006\u0010^\u001a\u00020UJ\u0006\u0010_\u001a\u00020UJ\u0006\u0010`\u001a\u00020UJ\u0006\u0010a\u001a\u00020UJ\u0006\u0010b\u001a\u00020UJ\u0006\u0010c\u001a\u00020UJ\u0006\u0010d\u001a\u00020UJ\u0006\u0010e\u001a\u00020UJ\u0006\u0010f\u001a\u00020\fJ\u0006\u0010g\u001a\u00020\fJ\u0006\u0010h\u001a\u00020\fJ\u0006\u0010i\u001a\u00020\fJ\u0006\u0010j\u001a\u00020\fJ\u0006\u0010k\u001a\u00020\fJ\u0006\u0010l\u001a\u00020\fJ\u0006\u0010m\u001a\u00020\fJ\u0006\u0010n\u001a\u00020\fJ\u0006\u0010o\u001a\u00020\fJ\u0006\u0010p\u001a\u00020\fJ\u0006\u0010q\u001a\u00020\fJ\u0006\u0010r\u001a\u00020\fJ\u0006\u0010s\u001a\u00020\fJ\u0006\u0010t\u001a\u00020\fJ\u0006\u0010u\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R$\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00104\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u00109\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\u000f\"\u0004\b;\u0010\u0011R$\u0010<\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\u000f\"\u0004\b>\u0010\u0011R$\u0010?\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u00106\"\u0004\bA\u00108R$\u0010B\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u00106\"\u0004\bD\u00108R\u0011\u0010E\u001a\u00020F8G¢\u0006\u0006\u001a\u0004\bG\u0010HR$\u0010I\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u00106\"\u0004\bK\u00108R$\u0010L\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010'\"\u0004\bN\u0010)R$\u0010O\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010\u000f\"\u0004\bQ\u0010\u0011¨\u0006w"}, d2 = {"Lgateway/v1/DynamicDeviceInfoKt$Dsl;", "", "_builder", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;", "(Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;)V", "value", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "android", "getAndroid", "()Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "setAndroid", "(Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;)V", "", "appActive", "getAppActive", "()Z", "setAppActive", "(Z)V", "", "batteryLevel", "getBatteryLevel", "()D", "setBatteryLevel", "(D)V", "", "batteryStatus", "getBatteryStatus", "()I", "setBatteryStatus", "(I)V", "Lgateway/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "connectionType", "getConnectionType", "()Lgateway/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "setConnectionType", "(Lgateway/v1/DynamicDeviceInfoOuterClass$ConnectionType;)V", "", "freeDiskSpace", "getFreeDiskSpace", "()J", "setFreeDiskSpace", "(J)V", "freeRamMemory", "getFreeRamMemory", "setFreeRamMemory", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "ios", "getIos", "()Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "setIos", "(Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;)V", "", "language", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "limitedOpenAdTracking", "getLimitedOpenAdTracking", "setLimitedOpenAdTracking", "limitedTracking", "getLimitedTracking", "setLimitedTracking", "networkOperator", "getNetworkOperator", "setNetworkOperator", "networkOperatorName", "getNetworkOperatorName", "setNetworkOperatorName", "platformSpecificCase", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase;", "getPlatformSpecificCase", "()Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase;", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "getTimeZone", "setTimeZone", "timeZoneOffset", "getTimeZoneOffset", "setTimeZoneOffset", "wiredHeadset", "getWiredHeadset", "setWiredHeadset", "_build", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "clearAndroid", "", "clearAppActive", "clearBatteryLevel", "clearBatteryStatus", "clearConnectionType", "clearFreeDiskSpace", "clearFreeRamMemory", "clearIos", "clearLanguage", "clearLimitedOpenAdTracking", "clearLimitedTracking", "clearNetworkOperator", "clearNetworkOperatorName", "clearPlatformSpecific", "clearTimeZone", "clearTimeZoneOffset", "clearWiredHeadset", "hasAndroid", "hasAppActive", "hasBatteryLevel", "hasBatteryStatus", "hasConnectionType", "hasFreeDiskSpace", "hasFreeRamMemory", "hasIos", "hasLanguage", "hasLimitedOpenAdTracking", "hasLimitedTracking", "hasNetworkOperator", "hasNetworkOperatorName", "hasTimeZone", "hasTimeZoneOffset", "hasWiredHeadset", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder _builder;

        public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: DynamicDeviceInfoKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgateway/v1/DynamicDeviceInfoKt$Dsl$Companion;", "", "()V", "_create", "Lgateway/v1/DynamicDeviceInfoKt$Dsl;", "builder", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo _build() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfoBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(dynamicDeviceInfoBuild, "_builder.build()");
            return dynamicDeviceInfoBuild;
        }

        public final String getLanguage() {
            String language = this._builder.getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "_builder.getLanguage()");
            return language;
        }

        public final void setLanguage(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setLanguage(value);
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final boolean hasLanguage() {
            return this._builder.hasLanguage();
        }

        public final String getNetworkOperator() {
            String networkOperator = this._builder.getNetworkOperator();
            Intrinsics.checkNotNullExpressionValue(networkOperator, "_builder.getNetworkOperator()");
            return networkOperator;
        }

        public final void setNetworkOperator(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setNetworkOperator(value);
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final boolean hasNetworkOperator() {
            return this._builder.hasNetworkOperator();
        }

        public final String getNetworkOperatorName() {
            String networkOperatorName = this._builder.getNetworkOperatorName();
            Intrinsics.checkNotNullExpressionValue(networkOperatorName, "_builder.getNetworkOperatorName()");
            return networkOperatorName;
        }

        public final void setNetworkOperatorName(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setNetworkOperatorName(value);
        }

        public final void clearNetworkOperatorName() {
            this._builder.clearNetworkOperatorName();
        }

        public final boolean hasNetworkOperatorName() {
            return this._builder.hasNetworkOperatorName();
        }

        public final long getFreeDiskSpace() {
            return this._builder.getFreeDiskSpace();
        }

        public final void setFreeDiskSpace(long j) {
            this._builder.setFreeDiskSpace(j);
        }

        public final void clearFreeDiskSpace() {
            this._builder.clearFreeDiskSpace();
        }

        public final boolean hasFreeDiskSpace() {
            return this._builder.hasFreeDiskSpace();
        }

        public final long getFreeRamMemory() {
            return this._builder.getFreeRamMemory();
        }

        public final void setFreeRamMemory(long j) {
            this._builder.setFreeRamMemory(j);
        }

        public final void clearFreeRamMemory() {
            this._builder.clearFreeRamMemory();
        }

        public final boolean hasFreeRamMemory() {
            return this._builder.hasFreeRamMemory();
        }

        public final boolean getWiredHeadset() {
            return this._builder.getWiredHeadset();
        }

        public final void setWiredHeadset(boolean z) {
            this._builder.setWiredHeadset(z);
        }

        public final void clearWiredHeadset() {
            this._builder.clearWiredHeadset();
        }

        public final boolean hasWiredHeadset() {
            return this._builder.hasWiredHeadset();
        }

        public final String getTimeZone() {
            String timeZone = this._builder.getTimeZone();
            Intrinsics.checkNotNullExpressionValue(timeZone, "_builder.getTimeZone()");
            return timeZone;
        }

        public final void setTimeZone(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTimeZone(value);
        }

        public final void clearTimeZone() {
            this._builder.clearTimeZone();
        }

        public final boolean hasTimeZone() {
            return this._builder.hasTimeZone();
        }

        public final long getTimeZoneOffset() {
            return this._builder.getTimeZoneOffset();
        }

        public final void setTimeZoneOffset(long j) {
            this._builder.setTimeZoneOffset(j);
        }

        public final void clearTimeZoneOffset() {
            this._builder.clearTimeZoneOffset();
        }

        public final boolean hasTimeZoneOffset() {
            return this._builder.hasTimeZoneOffset();
        }

        public final boolean getLimitedTracking() {
            return this._builder.getLimitedTracking();
        }

        public final void setLimitedTracking(boolean z) {
            this._builder.setLimitedTracking(z);
        }

        public final void clearLimitedTracking() {
            this._builder.clearLimitedTracking();
        }

        public final boolean hasLimitedTracking() {
            return this._builder.hasLimitedTracking();
        }

        public final boolean getLimitedOpenAdTracking() {
            return this._builder.getLimitedOpenAdTracking();
        }

        public final void setLimitedOpenAdTracking(boolean z) {
            this._builder.setLimitedOpenAdTracking(z);
        }

        public final void clearLimitedOpenAdTracking() {
            this._builder.clearLimitedOpenAdTracking();
        }

        public final boolean hasLimitedOpenAdTracking() {
            return this._builder.hasLimitedOpenAdTracking();
        }

        public final double getBatteryLevel() {
            return this._builder.getBatteryLevel();
        }

        public final void setBatteryLevel(double d) {
            this._builder.setBatteryLevel(d);
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final boolean hasBatteryLevel() {
            return this._builder.hasBatteryLevel();
        }

        public final int getBatteryStatus() {
            return this._builder.getBatteryStatus();
        }

        public final void setBatteryStatus(int i) {
            this._builder.setBatteryStatus(i);
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final boolean hasBatteryStatus() {
            return this._builder.hasBatteryStatus();
        }

        public final DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
            DynamicDeviceInfoOuterClass.ConnectionType connectionType = this._builder.getConnectionType();
            Intrinsics.checkNotNullExpressionValue(connectionType, "_builder.getConnectionType()");
            return connectionType;
        }

        public final void setConnectionType(DynamicDeviceInfoOuterClass.ConnectionType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setConnectionType(value);
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final boolean hasConnectionType() {
            return this._builder.hasConnectionType();
        }

        public final boolean getAppActive() {
            return this._builder.getAppActive();
        }

        public final void setAppActive(boolean z) {
            this._builder.setAppActive(z);
        }

        public final void clearAppActive() {
            this._builder.clearAppActive();
        }

        public final boolean hasAppActive() {
            return this._builder.hasAppActive();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroid() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2 = this._builder.getAndroid();
            Intrinsics.checkNotNullExpressionValue(android2, "_builder.getAndroid()");
            return android2;
        }

        public final void setAndroid(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAndroid(value);
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIos() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios = this._builder.getIos();
            Intrinsics.checkNotNullExpressionValue(ios, "_builder.getIos()");
            return ios;
        }

        public final void setIos(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setIos(value);
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            Intrinsics.checkNotNullExpressionValue(platformSpecificCase, "_builder.getPlatformSpecificCase()");
            return platformSpecificCase;
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }
    }

    private DynamicDeviceInfoKt() {
    }

    /* compiled from: DynamicDeviceInfoKt.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgateway/v1/DynamicDeviceInfoKt$AndroidKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AndroidKt {
        public static final AndroidKt INSTANCE = new AndroidKt();

        /* compiled from: DynamicDeviceInfoKt.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00100\u001a\u000201H\u0001J\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u000203J\u0006\u00105\u001a\u000203J\u0006\u00106\u001a\u000203J\u0006\u00107\u001a\u000203J\u0006\u00108\u001a\u000203J\u0006\u00109\u001a\u000203J\u0006\u0010:\u001a\u000203J\u0006\u0010;\u001a\u000203J\u0006\u0010<\u001a\u000203J\u0006\u0010=\u001a\u00020\u0006J\u0006\u0010>\u001a\u00020\u0006J\u0006\u0010?\u001a\u00020\u0006J\u0006\u0010@\u001a\u00020\u0006J\u0006\u0010A\u001a\u00020\u0006J\u0006\u0010B\u001a\u00020\u0006J\u0006\u0010C\u001a\u00020\u0006J\u0006\u0010D\u001a\u00020\u0006J\u0006\u0010E\u001a\u00020\u0006J\u0006\u0010F\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR$\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR$\u0010-\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001a¨\u0006H"}, d2 = {"Lgateway/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "", "_builder", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;", "(Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;)V", "value", "", "adbEnabled", "getAdbEnabled", "()Z", "setAdbEnabled", "(Z)V", "", "deviceElapsedRealtime", "getDeviceElapsedRealtime", "()J", "setDeviceElapsedRealtime", "(J)V", "deviceUpTime", "getDeviceUpTime", "setDeviceUpTime", "", "maxVolume", "getMaxVolume", "()D", "setMaxVolume", "(D)V", "networkConnected", "getNetworkConnected", "setNetworkConnected", "networkMetered", "getNetworkMetered", "setNetworkMetered", "", "networkType", "getNetworkType", "()I", "setNetworkType", "(I)V", "telephonyManagerNetworkType", "getTelephonyManagerNetworkType", "setTelephonyManagerNetworkType", "usbConnected", "getUsbConnected", "setUsbConnected", "volume", "getVolume", "setVolume", "_build", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "clearAdbEnabled", "", "clearDeviceElapsedRealtime", "clearDeviceUpTime", "clearMaxVolume", "clearNetworkConnected", "clearNetworkMetered", "clearNetworkType", "clearTelephonyManagerNetworkType", "clearUsbConnected", "clearVolume", "hasAdbEnabled", "hasDeviceElapsedRealtime", "hasDeviceUpTime", "hasMaxVolume", "hasNetworkConnected", "hasNetworkMetered", "hasNetworkType", "hasTelephonyManagerNetworkType", "hasUsbConnected", "hasVolume", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder _builder;

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }

            /* compiled from: DynamicDeviceInfoKt.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgateway/v1/DynamicDeviceInfoKt$AndroidKt$Dsl$Companion;", "", "()V", "_create", "Lgateway/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "builder", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android _build() {
                DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android androidBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(androidBuild, "_builder.build()");
                return androidBuild;
            }

            public final boolean getNetworkConnected() {
                return this._builder.getNetworkConnected();
            }

            public final void setNetworkConnected(boolean z) {
                this._builder.setNetworkConnected(z);
            }

            public final void clearNetworkConnected() {
                this._builder.clearNetworkConnected();
            }

            public final boolean hasNetworkConnected() {
                return this._builder.hasNetworkConnected();
            }

            public final int getNetworkType() {
                return this._builder.getNetworkType();
            }

            public final void setNetworkType(int i) {
                this._builder.setNetworkType(i);
            }

            public final void clearNetworkType() {
                this._builder.clearNetworkType();
            }

            public final boolean hasNetworkType() {
                return this._builder.hasNetworkType();
            }

            public final boolean getNetworkMetered() {
                return this._builder.getNetworkMetered();
            }

            public final void setNetworkMetered(boolean z) {
                this._builder.setNetworkMetered(z);
            }

            public final void clearNetworkMetered() {
                this._builder.clearNetworkMetered();
            }

            public final boolean hasNetworkMetered() {
                return this._builder.hasNetworkMetered();
            }

            public final int getTelephonyManagerNetworkType() {
                return this._builder.getTelephonyManagerNetworkType();
            }

            public final void setTelephonyManagerNetworkType(int i) {
                this._builder.setTelephonyManagerNetworkType(i);
            }

            public final void clearTelephonyManagerNetworkType() {
                this._builder.clearTelephonyManagerNetworkType();
            }

            public final boolean hasTelephonyManagerNetworkType() {
                return this._builder.hasTelephonyManagerNetworkType();
            }

            public final boolean getAdbEnabled() {
                return this._builder.getAdbEnabled();
            }

            public final void setAdbEnabled(boolean z) {
                this._builder.setAdbEnabled(z);
            }

            public final void clearAdbEnabled() {
                this._builder.clearAdbEnabled();
            }

            public final boolean hasAdbEnabled() {
                return this._builder.hasAdbEnabled();
            }

            public final boolean getUsbConnected() {
                return this._builder.getUsbConnected();
            }

            public final void setUsbConnected(boolean z) {
                this._builder.setUsbConnected(z);
            }

            public final void clearUsbConnected() {
                this._builder.clearUsbConnected();
            }

            public final boolean hasUsbConnected() {
                return this._builder.hasUsbConnected();
            }

            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final void setVolume(double d) {
                this._builder.setVolume(d);
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            public final double getMaxVolume() {
                return this._builder.getMaxVolume();
            }

            public final void setMaxVolume(double d) {
                this._builder.setMaxVolume(d);
            }

            public final void clearMaxVolume() {
                this._builder.clearMaxVolume();
            }

            public final boolean hasMaxVolume() {
                return this._builder.hasMaxVolume();
            }

            public final long getDeviceUpTime() {
                return this._builder.getDeviceUpTime();
            }

            public final void setDeviceUpTime(long j) {
                this._builder.setDeviceUpTime(j);
            }

            public final void clearDeviceUpTime() {
                this._builder.clearDeviceUpTime();
            }

            public final boolean hasDeviceUpTime() {
                return this._builder.hasDeviceUpTime();
            }

            public final long getDeviceElapsedRealtime() {
                return this._builder.getDeviceElapsedRealtime();
            }

            public final void setDeviceElapsedRealtime(long j) {
                this._builder.setDeviceElapsedRealtime(j);
            }

            public final void clearDeviceElapsedRealtime() {
                this._builder.clearDeviceElapsedRealtime();
            }

            public final boolean hasDeviceElapsedRealtime() {
                return this._builder.hasDeviceElapsedRealtime();
            }
        }

        private AndroidKt() {
        }
    }

    /* renamed from: -initializeandroid, reason: not valid java name */
    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android m1021initializeandroid(Function1<? super AndroidKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AndroidKt.Dsl.Companion companion = AndroidKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: DynamicDeviceInfoKt.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgateway/v1/DynamicDeviceInfoKt$IosKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IosKt {
        public static final IosKt INSTANCE = new IosKt();

        /* compiled from: DynamicDeviceInfoKt.kt */
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u001c\n\u0002\b\u0012\b\u0007\u0018\u0000 M2\u00020\u0001:\u0003MNOB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010)\u001a\u00020*H\u0001J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020,J\u0006\u0010.\u001a\u00020,J\u0006\u0010/\u001a\u00020,J\u0006\u00100\u001a\u00020,J\u0006\u00101\u001a\u00020,J\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u000203J\u0006\u00105\u001a\u000203J\u0006\u00106\u001a\u000203J\u0006\u00107\u001a\u000203J\u0006\u00108\u001a\u000203J%\u00109\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b:J%\u00109\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u00162\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b;J+\u0010<\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060>H\u0007¢\u0006\u0002\b?J+\u0010<\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u00162\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060>H\u0007¢\u0006\u0002\b@J\u001d\u0010A\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u0016H\u0007¢\u0006\u0002\bBJ\u001d\u0010A\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u0016H\u0007¢\u0006\u0002\bCJ&\u0010D\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\n¢\u0006\u0002\bEJ,\u0010D\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060>H\u0087\n¢\u0006\u0002\bFJ&\u0010D\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u00162\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\n¢\u0006\u0002\bGJ,\u0010D\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u00162\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060>H\u0087\n¢\u0006\u0002\bHJ.\u0010I\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010J\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\bKJ.\u0010I\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u00162\u0006\u0010J\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\bLR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00168F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001d\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u00168F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R$\u0010 \u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R$\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006P"}, d2 = {"Lgateway/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "", "_builder", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;", "(Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;)V", "value", "", "currentRadioAccessTechnology", "getCurrentRadioAccessTechnology", "()Ljava/lang/String;", "setCurrentRadioAccessTechnology", "(Ljava/lang/String;)V", "", "currentUiTheme", "getCurrentUiTheme", "()I", "setCurrentUiTheme", "(I)V", "deviceName", "getDeviceName", "setDeviceName", "localeList", "Lcom/google/protobuf/kotlin/DslList;", "Lgateway/v1/DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy;", "getLocaleList", "()Lcom/google/protobuf/kotlin/DslList;", "networkReachabilityFlags", "getNetworkReachabilityFlags", "setNetworkReachabilityFlags", "nwPathInterfaces", "Lgateway/v1/DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy;", "getNwPathInterfaces", "trackingAuthStatus", "getTrackingAuthStatus", "setTrackingAuthStatus", "", "volume", "getVolume", "()D", "setVolume", "(D)V", "_build", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "clearCurrentRadioAccessTechnology", "", "clearCurrentUiTheme", "clearDeviceName", "clearNetworkReachabilityFlags", "clearTrackingAuthStatus", "clearVolume", "hasCurrentRadioAccessTechnology", "", "hasCurrentUiTheme", "hasDeviceName", "hasNetworkReachabilityFlags", "hasTrackingAuthStatus", "hasVolume", "add", "addLocaleList", "addNwPathInterfaces", "addAll", "values", "", "addAllLocaleList", "addAllNwPathInterfaces", "clear", "clearLocaleList", "clearNwPathInterfaces", "plusAssign", "plusAssignLocaleList", "plusAssignAllLocaleList", "plusAssignNwPathInterfaces", "plusAssignAllNwPathInterfaces", "set", FirebaseAnalytics.Param.INDEX, "setLocaleList", "setNwPathInterfaces", "Companion", "LocaleListProxy", "NwPathInterfacesProxy", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder _builder;

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }

            /* compiled from: DynamicDeviceInfoKt.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgateway/v1/DynamicDeviceInfoKt$IosKt$Dsl$Companion;", "", "()V", "_create", "Lgateway/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "builder", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios _build() {
                DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios iosBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(iosBuild, "_builder.build()");
                return iosBuild;
            }

            public final String getCurrentRadioAccessTechnology() {
                String currentRadioAccessTechnology = this._builder.getCurrentRadioAccessTechnology();
                Intrinsics.checkNotNullExpressionValue(currentRadioAccessTechnology, "_builder.getCurrentRadioAccessTechnology()");
                return currentRadioAccessTechnology;
            }

            public final void setCurrentRadioAccessTechnology(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setCurrentRadioAccessTechnology(value);
            }

            public final void clearCurrentRadioAccessTechnology() {
                this._builder.clearCurrentRadioAccessTechnology();
            }

            public final boolean hasCurrentRadioAccessTechnology() {
                return this._builder.hasCurrentRadioAccessTechnology();
            }

            public final int getNetworkReachabilityFlags() {
                return this._builder.getNetworkReachabilityFlags();
            }

            public final void setNetworkReachabilityFlags(int i) {
                this._builder.setNetworkReachabilityFlags(i);
            }

            public final void clearNetworkReachabilityFlags() {
                this._builder.clearNetworkReachabilityFlags();
            }

            public final boolean hasNetworkReachabilityFlags() {
                return this._builder.hasNetworkReachabilityFlags();
            }

            /* compiled from: DynamicDeviceInfoKt.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgateway/v1/DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class NwPathInterfacesProxy extends DslProxy {
                private NwPathInterfacesProxy() {
                }
            }

            public final DslList<String, NwPathInterfacesProxy> getNwPathInterfaces() {
                List<String> nwPathInterfacesList = this._builder.getNwPathInterfacesList();
                Intrinsics.checkNotNullExpressionValue(nwPathInterfacesList, "_builder.getNwPathInterfacesList()");
                return new DslList<>(nwPathInterfacesList);
            }

            public final /* synthetic */ void addNwPathInterfaces(DslList dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addNwPathInterfaces(value);
            }

            public final /* synthetic */ void plusAssignNwPathInterfaces(DslList<String, NwPathInterfacesProxy> dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addNwPathInterfaces(dslList, value);
            }

            public final /* synthetic */ void addAllNwPathInterfaces(DslList dslList, Iterable values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllNwPathInterfaces(values);
            }

            public final /* synthetic */ void plusAssignAllNwPathInterfaces(DslList<String, NwPathInterfacesProxy> dslList, Iterable<String> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllNwPathInterfaces(dslList, values);
            }

            public final /* synthetic */ void setNwPathInterfaces(DslList dslList, int i, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setNwPathInterfaces(i, value);
            }

            public final /* synthetic */ void clearNwPathInterfaces(DslList dslList) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                this._builder.clearNwPathInterfaces();
            }

            /* compiled from: DynamicDeviceInfoKt.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgateway/v1/DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class LocaleListProxy extends DslProxy {
                private LocaleListProxy() {
                }
            }

            public final DslList<String, LocaleListProxy> getLocaleList() {
                List<String> localeListList = this._builder.getLocaleListList();
                Intrinsics.checkNotNullExpressionValue(localeListList, "_builder.getLocaleListList()");
                return new DslList<>(localeListList);
            }

            public final /* synthetic */ void addLocaleList(DslList dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addLocaleList(value);
            }

            public final /* synthetic */ void plusAssignLocaleList(DslList<String, LocaleListProxy> dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addLocaleList(dslList, value);
            }

            public final /* synthetic */ void addAllLocaleList(DslList dslList, Iterable values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllLocaleList(values);
            }

            public final /* synthetic */ void plusAssignAllLocaleList(DslList<String, LocaleListProxy> dslList, Iterable<String> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllLocaleList(dslList, values);
            }

            public final /* synthetic */ void setLocaleList(DslList dslList, int i, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setLocaleList(i, value);
            }

            public final /* synthetic */ void clearLocaleList(DslList dslList) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                this._builder.clearLocaleList();
            }

            public final int getCurrentUiTheme() {
                return this._builder.getCurrentUiTheme();
            }

            public final void setCurrentUiTheme(int i) {
                this._builder.setCurrentUiTheme(i);
            }

            public final void clearCurrentUiTheme() {
                this._builder.clearCurrentUiTheme();
            }

            public final boolean hasCurrentUiTheme() {
                return this._builder.hasCurrentUiTheme();
            }

            public final String getDeviceName() {
                String deviceName = this._builder.getDeviceName();
                Intrinsics.checkNotNullExpressionValue(deviceName, "_builder.getDeviceName()");
                return deviceName;
            }

            public final void setDeviceName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setDeviceName(value);
            }

            public final void clearDeviceName() {
                this._builder.clearDeviceName();
            }

            public final boolean hasDeviceName() {
                return this._builder.hasDeviceName();
            }

            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final void setVolume(double d) {
                this._builder.setVolume(d);
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            public final int getTrackingAuthStatus() {
                return this._builder.getTrackingAuthStatus();
            }

            public final void setTrackingAuthStatus(int i) {
                this._builder.setTrackingAuthStatus(i);
            }

            public final void clearTrackingAuthStatus() {
                this._builder.clearTrackingAuthStatus();
            }

            public final boolean hasTrackingAuthStatus() {
                return this._builder.hasTrackingAuthStatus();
            }
        }

        private IosKt() {
        }
    }

    /* renamed from: -initializeios, reason: not valid java name */
    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios m1022initializeios(Function1<? super IosKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        IosKt.Dsl.Companion companion = IosKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        IosKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
