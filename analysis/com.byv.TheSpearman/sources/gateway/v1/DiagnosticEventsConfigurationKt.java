package gateway.v1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.json.m4;
import gateway.v1.DiagnosticEventRequestOuterClass;
import gateway.v1.NativeConfigurationOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiagnosticEventsConfigurationKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgateway/v1/DiagnosticEventsConfigurationKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DiagnosticEventsConfigurationKt {
    public static final DiagnosticEventsConfigurationKt INSTANCE = new DiagnosticEventsConfigurationKt();

    /* compiled from: DiagnosticEventsConfigurationKt.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u001c\n\u0002\b\u0012\b\u0007\u0018\u0000 E2\u00020\u0001:\u0003CDEB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010'\u001a\u00020(H\u0001J\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020*J\u0006\u0010,\u001a\u00020*J\u0006\u0010-\u001a\u00020*J\u0006\u0010.\u001a\u00020*J%\u0010/\u001a\u00020**\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0002\b0J%\u0010/\u001a\u00020**\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0002\b1J+\u00102\u001a\u00020**\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000704H\u0007¢\u0006\u0002\b5J+\u00102\u001a\u00020**\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000704H\u0007¢\u0006\u0002\b6J\u001d\u00107\u001a\u00020**\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0002\b8J\u001d\u00107\u001a\u00020**\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u0006H\u0007¢\u0006\u0002\b9J&\u0010:\u001a\u00020**\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000e\u001a\u00020\u0007H\u0087\n¢\u0006\u0002\b;J,\u0010:\u001a\u00020**\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000704H\u0087\n¢\u0006\u0002\b<J&\u0010:\u001a\u00020**\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000e\u001a\u00020\u0007H\u0087\n¢\u0006\u0002\b=J,\u0010:\u001a\u00020**\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000704H\u0087\n¢\u0006\u0002\b>J.\u0010?\u001a\u00020**\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010@\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\bAJ.\u0010?\u001a\u00020**\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010@\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\bBR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\nR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014¨\u0006F"}, d2 = {"Lgateway/v1/DiagnosticEventsConfigurationKt$Dsl;", "", "_builder", "Lgateway/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder;", "(Lgateway/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder;)V", "allowedEvents", "Lcom/google/protobuf/kotlin/DslList;", "Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "Lgateway/v1/DiagnosticEventsConfigurationKt$Dsl$AllowedEventsProxy;", "getAllowedEvents", "()Lcom/google/protobuf/kotlin/DslList;", "blockedEvents", "Lgateway/v1/DiagnosticEventsConfigurationKt$Dsl$BlockedEventsProxy;", "getBlockedEvents", "value", "", m4.r, "getEnabled", "()Z", "setEnabled", "(Z)V", "", "maxBatchIntervalMs", "getMaxBatchIntervalMs", "()I", "setMaxBatchIntervalMs", "(I)V", "maxBatchSize", "getMaxBatchSize", "setMaxBatchSize", "Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity;", "severity", "getSeverity", "()Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity;", "setSeverity", "(Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity;)V", "ttmEnabled", "getTtmEnabled", "setTtmEnabled", "_build", "Lgateway/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "clearEnabled", "", "clearMaxBatchIntervalMs", "clearMaxBatchSize", "clearSeverity", "clearTtmEnabled", "add", "addAllowedEvents", "addBlockedEvents", "addAll", "values", "", "addAllAllowedEvents", "addAllBlockedEvents", "clear", "clearAllowedEvents", "clearBlockedEvents", "plusAssign", "plusAssignAllowedEvents", "plusAssignAllAllowedEvents", "plusAssignBlockedEvents", "plusAssignAllBlockedEvents", "set", FirebaseAnalytics.Param.INDEX, "setAllowedEvents", "setBlockedEvents", "AllowedEventsProxy", "BlockedEventsProxy", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder _builder;

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: DiagnosticEventsConfigurationKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgateway/v1/DiagnosticEventsConfigurationKt$Dsl$Companion;", "", "()V", "_create", "Lgateway/v1/DiagnosticEventsConfigurationKt$Dsl;", "builder", "Lgateway/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ NativeConfigurationOuterClass.DiagnosticEventsConfiguration _build() {
            NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfigurationBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(diagnosticEventsConfigurationBuild, "_builder.build()");
            return diagnosticEventsConfigurationBuild;
        }

        public final boolean getEnabled() {
            return this._builder.getEnabled();
        }

        public final void setEnabled(boolean z) {
            this._builder.setEnabled(z);
        }

        public final void clearEnabled() {
            this._builder.clearEnabled();
        }

        public final int getMaxBatchSize() {
            return this._builder.getMaxBatchSize();
        }

        public final void setMaxBatchSize(int i) {
            this._builder.setMaxBatchSize(i);
        }

        public final void clearMaxBatchSize() {
            this._builder.clearMaxBatchSize();
        }

        public final int getMaxBatchIntervalMs() {
            return this._builder.getMaxBatchIntervalMs();
        }

        public final void setMaxBatchIntervalMs(int i) {
            this._builder.setMaxBatchIntervalMs(i);
        }

        public final void clearMaxBatchIntervalMs() {
            this._builder.clearMaxBatchIntervalMs();
        }

        public final boolean getTtmEnabled() {
            return this._builder.getTtmEnabled();
        }

        public final void setTtmEnabled(boolean z) {
            this._builder.setTtmEnabled(z);
        }

        public final void clearTtmEnabled() {
            this._builder.clearTtmEnabled();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
            DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity severity = this._builder.getSeverity();
            Intrinsics.checkNotNullExpressionValue(severity, "_builder.getSeverity()");
            return severity;
        }

        public final void setSeverity(DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSeverity(value);
        }

        public final void clearSeverity() {
            this._builder.clearSeverity();
        }

        /* compiled from: DiagnosticEventsConfigurationKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgateway/v1/DiagnosticEventsConfigurationKt$Dsl$AllowedEventsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AllowedEventsProxy extends DslProxy {
            private AllowedEventsProxy() {
            }
        }

        public final /* synthetic */ DslList getAllowedEvents() {
            List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = this._builder.getAllowedEventsList();
            Intrinsics.checkNotNullExpressionValue(allowedEventsList, "_builder.getAllowedEventsList()");
            return new DslList(allowedEventsList);
        }

        public final /* synthetic */ void addAllowedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addAllowedEvents(value);
        }

        public final /* synthetic */ void plusAssignAllowedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, AllowedEventsProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addAllowedEvents(dslList, value);
        }

        public final /* synthetic */ void addAllAllowedEvents(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllAllowedEvents(values);
        }

        public final /* synthetic */ void plusAssignAllAllowedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, AllowedEventsProxy> dslList, Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllAllowedEvents(dslList, values);
        }

        public final /* synthetic */ void setAllowedEvents(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAllowedEvents(i, value);
        }

        public final /* synthetic */ void clearAllowedEvents(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearAllowedEvents();
        }

        /* compiled from: DiagnosticEventsConfigurationKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgateway/v1/DiagnosticEventsConfigurationKt$Dsl$BlockedEventsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BlockedEventsProxy extends DslProxy {
            private BlockedEventsProxy() {
            }
        }

        public final /* synthetic */ DslList getBlockedEvents() {
            List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = this._builder.getBlockedEventsList();
            Intrinsics.checkNotNullExpressionValue(blockedEventsList, "_builder.getBlockedEventsList()");
            return new DslList(blockedEventsList);
        }

        public final /* synthetic */ void addBlockedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addBlockedEvents(value);
        }

        public final /* synthetic */ void plusAssignBlockedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, BlockedEventsProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addBlockedEvents(dslList, value);
        }

        public final /* synthetic */ void addAllBlockedEvents(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllBlockedEvents(values);
        }

        public final /* synthetic */ void plusAssignAllBlockedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, BlockedEventsProxy> dslList, Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllBlockedEvents(dslList, values);
        }

        public final /* synthetic */ void setBlockedEvents(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setBlockedEvents(i, value);
        }

        public final /* synthetic */ void clearBlockedEvents(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearBlockedEvents();
        }
    }

    private DiagnosticEventsConfigurationKt() {
    }
}
