package gateway.v1;

import gateway.v1.SessionCountersOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionCountersKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgateway/v1/SessionCountersKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SessionCountersKt {
    public static final SessionCountersKt INSTANCE = new SessionCountersKt();

    /* compiled from: SessionCountersKt.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000b¨\u0006!"}, d2 = {"Lgateway/v1/SessionCountersKt$Dsl;", "", "_builder", "Lgateway/v1/SessionCountersOuterClass$SessionCounters$Builder;", "(Lgateway/v1/SessionCountersOuterClass$SessionCounters$Builder;)V", "value", "", "bannerImpressions", "getBannerImpressions", "()I", "setBannerImpressions", "(I)V", "bannerLoadRequests", "getBannerLoadRequests", "setBannerLoadRequests", "bannerRequestsAdm", "getBannerRequestsAdm", "setBannerRequestsAdm", "loadRequests", "getLoadRequests", "setLoadRequests", "loadRequestsAdm", "getLoadRequestsAdm", "setLoadRequestsAdm", "_build", "Lgateway/v1/SessionCountersOuterClass$SessionCounters;", "clearBannerImpressions", "", "clearBannerLoadRequests", "clearBannerRequestsAdm", "clearLoadRequests", "clearLoadRequestsAdm", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final SessionCountersOuterClass.SessionCounters.Builder _builder;

        public /* synthetic */ Dsl(SessionCountersOuterClass.SessionCounters.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(SessionCountersOuterClass.SessionCounters.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: SessionCountersKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgateway/v1/SessionCountersKt$Dsl$Companion;", "", "()V", "_create", "Lgateway/v1/SessionCountersKt$Dsl;", "builder", "Lgateway/v1/SessionCountersOuterClass$SessionCounters$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(SessionCountersOuterClass.SessionCounters.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ SessionCountersOuterClass.SessionCounters _build() {
            SessionCountersOuterClass.SessionCounters sessionCountersBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(sessionCountersBuild, "_builder.build()");
            return sessionCountersBuild;
        }

        public final int getLoadRequests() {
            return this._builder.getLoadRequests();
        }

        public final void setLoadRequests(int i) {
            this._builder.setLoadRequests(i);
        }

        public final void clearLoadRequests() {
            this._builder.clearLoadRequests();
        }

        public final int getLoadRequestsAdm() {
            return this._builder.getLoadRequestsAdm();
        }

        public final void setLoadRequestsAdm(int i) {
            this._builder.setLoadRequestsAdm(i);
        }

        public final void clearLoadRequestsAdm() {
            this._builder.clearLoadRequestsAdm();
        }

        public final int getBannerLoadRequests() {
            return this._builder.getBannerLoadRequests();
        }

        public final void setBannerLoadRequests(int i) {
            this._builder.setBannerLoadRequests(i);
        }

        public final void clearBannerLoadRequests() {
            this._builder.clearBannerLoadRequests();
        }

        public final int getBannerRequestsAdm() {
            return this._builder.getBannerRequestsAdm();
        }

        public final void setBannerRequestsAdm(int i) {
            this._builder.setBannerRequestsAdm(i);
        }

        public final void clearBannerRequestsAdm() {
            this._builder.clearBannerRequestsAdm();
        }

        public final int getBannerImpressions() {
            return this._builder.getBannerImpressions();
        }

        public final void setBannerImpressions(int i) {
            this._builder.setBannerImpressions(i);
        }

        public final void clearBannerImpressions() {
            this._builder.clearBannerImpressions();
        }
    }

    private SessionCountersKt() {
    }
}
