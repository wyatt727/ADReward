package gateway.v1;

import gateway.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeConfigurationKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgateway/v1/NativeConfigurationKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NativeConfigurationKt {
    public static final NativeConfigurationKt INSTANCE = new NativeConfigurationKt();

    /* compiled from: NativeConfigurationKt.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001CB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00100\u001a\u000201H\u0001J\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u000203J\u0006\u00105\u001a\u000203J\u0006\u00106\u001a\u000203J\u0006\u00107\u001a\u000203J\u0006\u00108\u001a\u000203J\u0006\u00109\u001a\u000203J\u0006\u0010:\u001a\u000203J\u0006\u0010;\u001a\u000203J\u0006\u0010<\u001a\u00020\u0018J\u0006\u0010=\u001a\u00020\u0018J\u0006\u0010>\u001a\u00020\u0018J\u0006\u0010?\u001a\u00020\u0018J\u0006\u0010@\u001a\u00020\u0018J\u0006\u0010A\u001a\u00020\u0018J\u0006\u0010B\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR$\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R$\u0010*\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R$\u0010-\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011¨\u0006D"}, d2 = {"Lgateway/v1/NativeConfigurationKt$Dsl;", "", "_builder", "Lgateway/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;", "(Lgateway/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;)V", "value", "Lgateway/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "adOperations", "getAdOperations", "()Lgateway/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "setAdOperations", "(Lgateway/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;)V", "Lgateway/v1/NativeConfigurationOuterClass$RequestPolicy;", "adPolicy", "getAdPolicy", "()Lgateway/v1/NativeConfigurationOuterClass$RequestPolicy;", "setAdPolicy", "(Lgateway/v1/NativeConfigurationOuterClass$RequestPolicy;)V", "Lgateway/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "diagnosticEvents", "getDiagnosticEvents", "()Lgateway/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "setDiagnosticEvents", "(Lgateway/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;)V", "", "enableIapEvent", "getEnableIapEvent", "()Z", "setEnableIapEvent", "(Z)V", "enableOm", "getEnableOm", "setEnableOm", "Lgateway/v1/NativeConfigurationOuterClass$FeatureFlags;", "featureFlags", "getFeatureFlags", "()Lgateway/v1/NativeConfigurationOuterClass$FeatureFlags;", "setFeatureFlags", "(Lgateway/v1/NativeConfigurationOuterClass$FeatureFlags;)V", "initPolicy", "getInitPolicy", "setInitPolicy", "operativeEventPolicy", "getOperativeEventPolicy", "setOperativeEventPolicy", "otherPolicy", "getOtherPolicy", "setOtherPolicy", "_build", "Lgateway/v1/NativeConfigurationOuterClass$NativeConfiguration;", "clearAdOperations", "", "clearAdPolicy", "clearDiagnosticEvents", "clearEnableIapEvent", "clearEnableOm", "clearFeatureFlags", "clearInitPolicy", "clearOperativeEventPolicy", "clearOtherPolicy", "hasAdOperations", "hasAdPolicy", "hasDiagnosticEvents", "hasFeatureFlags", "hasInitPolicy", "hasOperativeEventPolicy", "hasOtherPolicy", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NativeConfigurationOuterClass.NativeConfiguration.Builder _builder;

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: NativeConfigurationKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgateway/v1/NativeConfigurationKt$Dsl$Companion;", "", "()V", "_create", "Lgateway/v1/NativeConfigurationKt$Dsl;", "builder", "Lgateway/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ NativeConfigurationOuterClass.NativeConfiguration _build() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfigurationBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(nativeConfigurationBuild, "_builder.build()");
            return nativeConfigurationBuild;
        }

        public final NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents() {
            NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this._builder.getDiagnosticEvents();
            Intrinsics.checkNotNullExpressionValue(diagnosticEvents, "_builder.getDiagnosticEvents()");
            return diagnosticEvents;
        }

        public final void setDiagnosticEvents(NativeConfigurationOuterClass.DiagnosticEventsConfiguration value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDiagnosticEvents(value);
        }

        public final void clearDiagnosticEvents() {
            this._builder.clearDiagnosticEvents();
        }

        public final boolean hasDiagnosticEvents() {
            return this._builder.hasDiagnosticEvents();
        }

        public final NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
            NativeConfigurationOuterClass.RequestPolicy initPolicy = this._builder.getInitPolicy();
            Intrinsics.checkNotNullExpressionValue(initPolicy, "_builder.getInitPolicy()");
            return initPolicy;
        }

        public final void setInitPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInitPolicy(value);
        }

        public final void clearInitPolicy() {
            this._builder.clearInitPolicy();
        }

        public final boolean hasInitPolicy() {
            return this._builder.hasInitPolicy();
        }

        public final NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
            NativeConfigurationOuterClass.RequestPolicy adPolicy = this._builder.getAdPolicy();
            Intrinsics.checkNotNullExpressionValue(adPolicy, "_builder.getAdPolicy()");
            return adPolicy;
        }

        public final void setAdPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdPolicy(value);
        }

        public final void clearAdPolicy() {
            this._builder.clearAdPolicy();
        }

        public final boolean hasAdPolicy() {
            return this._builder.hasAdPolicy();
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
            NativeConfigurationOuterClass.RequestPolicy operativeEventPolicy = this._builder.getOperativeEventPolicy();
            Intrinsics.checkNotNullExpressionValue(operativeEventPolicy, "_builder.getOperativeEventPolicy()");
            return operativeEventPolicy;
        }

        public final void setOperativeEventPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOperativeEventPolicy(value);
        }

        public final void clearOperativeEventPolicy() {
            this._builder.clearOperativeEventPolicy();
        }

        public final boolean hasOperativeEventPolicy() {
            return this._builder.hasOperativeEventPolicy();
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
            NativeConfigurationOuterClass.RequestPolicy otherPolicy = this._builder.getOtherPolicy();
            Intrinsics.checkNotNullExpressionValue(otherPolicy, "_builder.getOtherPolicy()");
            return otherPolicy;
        }

        public final void setOtherPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOtherPolicy(value);
        }

        public final void clearOtherPolicy() {
            this._builder.clearOtherPolicy();
        }

        public final boolean hasOtherPolicy() {
            return this._builder.hasOtherPolicy();
        }

        public final NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations() {
            NativeConfigurationOuterClass.AdOperationsConfiguration adOperations = this._builder.getAdOperations();
            Intrinsics.checkNotNullExpressionValue(adOperations, "_builder.getAdOperations()");
            return adOperations;
        }

        public final void setAdOperations(NativeConfigurationOuterClass.AdOperationsConfiguration value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdOperations(value);
        }

        public final void clearAdOperations() {
            this._builder.clearAdOperations();
        }

        public final boolean hasAdOperations() {
            return this._builder.hasAdOperations();
        }

        public final NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
            NativeConfigurationOuterClass.FeatureFlags featureFlags = this._builder.getFeatureFlags();
            Intrinsics.checkNotNullExpressionValue(featureFlags, "_builder.getFeatureFlags()");
            return featureFlags;
        }

        public final void setFeatureFlags(NativeConfigurationOuterClass.FeatureFlags value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setFeatureFlags(value);
        }

        public final void clearFeatureFlags() {
            this._builder.clearFeatureFlags();
        }

        public final boolean hasFeatureFlags() {
            return this._builder.hasFeatureFlags();
        }

        public final boolean getEnableIapEvent() {
            return this._builder.getEnableIapEvent();
        }

        public final void setEnableIapEvent(boolean z) {
            this._builder.setEnableIapEvent(z);
        }

        public final void clearEnableIapEvent() {
            this._builder.clearEnableIapEvent();
        }

        public final boolean getEnableOm() {
            return this._builder.getEnableOm();
        }

        public final void setEnableOm(boolean z) {
            this._builder.setEnableOm(z);
        }

        public final void clearEnableOm() {
            this._builder.clearEnableOm();
        }
    }

    private NativeConfigurationKt() {
    }
}
