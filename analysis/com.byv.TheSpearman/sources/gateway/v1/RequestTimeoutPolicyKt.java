package gateway.v1;

import gateway.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RequestTimeoutPolicyKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgateway/v1/RequestTimeoutPolicyKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RequestTimeoutPolicyKt {
    public static final RequestTimeoutPolicyKt INSTANCE = new RequestTimeoutPolicyKt();

    /* compiled from: RequestTimeoutPolicyKt.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000b¨\u0006\u001d"}, d2 = {"Lgateway/v1/RequestTimeoutPolicyKt$Dsl;", "", "_builder", "Lgateway/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy$Builder;", "(Lgateway/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy$Builder;)V", "value", "", "connectTimeoutMs", "getConnectTimeoutMs", "()I", "setConnectTimeoutMs", "(I)V", "overallTimeoutMs", "getOverallTimeoutMs", "setOverallTimeoutMs", "readTimeoutMs", "getReadTimeoutMs", "setReadTimeoutMs", "writeTimeoutMs", "getWriteTimeoutMs", "setWriteTimeoutMs", "_build", "Lgateway/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "clearConnectTimeoutMs", "", "clearOverallTimeoutMs", "clearReadTimeoutMs", "clearWriteTimeoutMs", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder _builder;

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: RequestTimeoutPolicyKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgateway/v1/RequestTimeoutPolicyKt$Dsl$Companion;", "", "()V", "_create", "Lgateway/v1/RequestTimeoutPolicyKt$Dsl;", "builder", "Lgateway/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ NativeConfigurationOuterClass.RequestTimeoutPolicy _build() {
            NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicyBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(requestTimeoutPolicyBuild, "_builder.build()");
            return requestTimeoutPolicyBuild;
        }

        public final int getConnectTimeoutMs() {
            return this._builder.getConnectTimeoutMs();
        }

        public final void setConnectTimeoutMs(int i) {
            this._builder.setConnectTimeoutMs(i);
        }

        public final void clearConnectTimeoutMs() {
            this._builder.clearConnectTimeoutMs();
        }

        public final int getReadTimeoutMs() {
            return this._builder.getReadTimeoutMs();
        }

        public final void setReadTimeoutMs(int i) {
            this._builder.setReadTimeoutMs(i);
        }

        public final void clearReadTimeoutMs() {
            this._builder.clearReadTimeoutMs();
        }

        public final int getWriteTimeoutMs() {
            return this._builder.getWriteTimeoutMs();
        }

        public final void setWriteTimeoutMs(int i) {
            this._builder.setWriteTimeoutMs(i);
        }

        public final void clearWriteTimeoutMs() {
            this._builder.clearWriteTimeoutMs();
        }

        public final int getOverallTimeoutMs() {
            return this._builder.getOverallTimeoutMs();
        }

        public final void setOverallTimeoutMs(int i) {
            this._builder.setOverallTimeoutMs(i);
        }

        public final void clearOverallTimeoutMs() {
            this._builder.clearOverallTimeoutMs();
        }
    }

    private RequestTimeoutPolicyKt() {
    }
}
