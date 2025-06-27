package gateway.v1;

import com.google.protobuf.ByteString;
import gateway.v1.GetTokenEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetTokenEventRequestKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgateway/v1/GetTokenEventRequestKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetTokenEventRequestKt {
    public static final GetTokenEventRequestKt INSTANCE = new GetTokenEventRequestKt();

    /* compiled from: GetTokenEventRequestKt.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0018"}, d2 = {"Lgateway/v1/GetTokenEventRequestKt$Dsl;", "", "_builder", "Lgateway/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest$Builder;", "(Lgateway/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest$Builder;)V", "value", "Lcom/google/protobuf/ByteString;", "interstitial", "getInterstitial", "()Lcom/google/protobuf/ByteString;", "setInterstitial", "(Lcom/google/protobuf/ByteString;)V", "rewarded", "getRewarded", "setRewarded", "_build", "Lgateway/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "clearInterstitial", "", "clearRewarded", "hasInterstitial", "", "hasRewarded", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder _builder;

        public /* synthetic */ Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: GetTokenEventRequestKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgateway/v1/GetTokenEventRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgateway/v1/GetTokenEventRequestKt$Dsl;", "builder", "Lgateway/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ GetTokenEventRequestOuterClass.GetTokenEventRequest _build() {
            GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequestBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(getTokenEventRequestBuild, "_builder.build()");
            return getTokenEventRequestBuild;
        }

        public final ByteString getRewarded() {
            ByteString rewarded = this._builder.getRewarded();
            Intrinsics.checkNotNullExpressionValue(rewarded, "_builder.getRewarded()");
            return rewarded;
        }

        public final void setRewarded(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setRewarded(value);
        }

        public final void clearRewarded() {
            this._builder.clearRewarded();
        }

        public final boolean hasRewarded() {
            return this._builder.hasRewarded();
        }

        public final ByteString getInterstitial() {
            ByteString interstitial = this._builder.getInterstitial();
            Intrinsics.checkNotNullExpressionValue(interstitial, "_builder.getInterstitial()");
            return interstitial;
        }

        public final void setInterstitial(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInterstitial(value);
        }

        public final void clearInterstitial() {
            this._builder.clearInterstitial();
        }

        public final boolean hasInterstitial() {
            return this._builder.hasInterstitial();
        }
    }

    private GetTokenEventRequestKt() {
    }
}
