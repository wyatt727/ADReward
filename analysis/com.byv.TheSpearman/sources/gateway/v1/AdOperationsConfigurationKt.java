package gateway.v1;

import gateway.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdOperationsConfigurationKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgateway/v1/AdOperationsConfigurationKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdOperationsConfigurationKt {
    public static final AdOperationsConfigurationKt INSTANCE = new AdOperationsConfigurationKt();

    /* compiled from: AdOperationsConfigurationKt.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0019"}, d2 = {"Lgateway/v1/AdOperationsConfigurationKt$Dsl;", "", "_builder", "Lgateway/v1/NativeConfigurationOuterClass$AdOperationsConfiguration$Builder;", "(Lgateway/v1/NativeConfigurationOuterClass$AdOperationsConfiguration$Builder;)V", "value", "", "getTokenTimeoutMs", "getGetTokenTimeoutMs", "()I", "setGetTokenTimeoutMs", "(I)V", "loadTimeoutMs", "getLoadTimeoutMs", "setLoadTimeoutMs", "showTimeoutMs", "getShowTimeoutMs", "setShowTimeoutMs", "_build", "Lgateway/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "clearGetTokenTimeoutMs", "", "clearLoadTimeoutMs", "clearShowTimeoutMs", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NativeConfigurationOuterClass.AdOperationsConfiguration.Builder _builder;

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: AdOperationsConfigurationKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgateway/v1/AdOperationsConfigurationKt$Dsl$Companion;", "", "()V", "_create", "Lgateway/v1/AdOperationsConfigurationKt$Dsl;", "builder", "Lgateway/v1/NativeConfigurationOuterClass$AdOperationsConfiguration$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ NativeConfigurationOuterClass.AdOperationsConfiguration _build() {
            NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfigurationBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(adOperationsConfigurationBuild, "_builder.build()");
            return adOperationsConfigurationBuild;
        }

        public final int getLoadTimeoutMs() {
            return this._builder.getLoadTimeoutMs();
        }

        public final void setLoadTimeoutMs(int i) {
            this._builder.setLoadTimeoutMs(i);
        }

        public final void clearLoadTimeoutMs() {
            this._builder.clearLoadTimeoutMs();
        }

        public final int getShowTimeoutMs() {
            return this._builder.getShowTimeoutMs();
        }

        public final void setShowTimeoutMs(int i) {
            this._builder.setShowTimeoutMs(i);
        }

        public final void clearShowTimeoutMs() {
            this._builder.clearShowTimeoutMs();
        }

        public final int getGetTokenTimeoutMs() {
            return this._builder.getGetTokenTimeoutMs();
        }

        public final void setGetTokenTimeoutMs(int i) {
            this._builder.setGetTokenTimeoutMs(i);
        }

        public final void clearGetTokenTimeoutMs() {
            this._builder.clearGetTokenTimeoutMs();
        }
    }

    private AdOperationsConfigurationKt() {
    }
}
