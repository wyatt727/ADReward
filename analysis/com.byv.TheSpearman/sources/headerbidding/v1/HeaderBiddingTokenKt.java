package headerbidding.v1;

import com.google.protobuf.ByteString;
import gateway.v1.CampaignStateOuterClass;
import gateway.v1.ClientInfoOuterClass;
import gateway.v1.DynamicDeviceInfoOuterClass;
import gateway.v1.PiiOuterClass;
import gateway.v1.SessionCountersOuterClass;
import gateway.v1.StaticDeviceInfoOuterClass;
import gateway.v1.TimestampsOuterClass;
import headerbidding.v1.HeaderBiddingTokenOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeaderBiddingTokenKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lheaderbidding/v1/HeaderBiddingTokenKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HeaderBiddingTokenKt {
    public static final HeaderBiddingTokenKt INSTANCE = new HeaderBiddingTokenKt();

    /* compiled from: HeaderBiddingTokenKt.kt */
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010E\u001a\u00020FH\u0001J\u0006\u0010G\u001a\u00020HJ\u0006\u0010I\u001a\u00020HJ\u0006\u0010J\u001a\u00020HJ\u0006\u0010K\u001a\u00020HJ\u0006\u0010L\u001a\u00020HJ\u0006\u0010M\u001a\u00020HJ\u0006\u0010N\u001a\u00020HJ\u0006\u0010O\u001a\u00020HJ\u0006\u0010P\u001a\u00020HJ\u0006\u0010Q\u001a\u00020HJ\u0006\u0010R\u001a\u00020HJ\u0006\u0010S\u001a\u00020TJ\u0006\u0010U\u001a\u00020TJ\u0006\u0010V\u001a\u00020TJ\u0006\u0010W\u001a\u00020TJ\u0006\u0010X\u001a\u00020TJ\u0006\u0010Y\u001a\u00020TJ\u0006\u0010Z\u001a\u00020TJ\u0006\u0010[\u001a\u00020TR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020*8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00100\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R$\u00104\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u00109\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010'\"\u0004\b;\u0010)R$\u0010=\u001a\u00020<2\u0006\u0010\u0005\u001a\u00020<8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0017\u0010B\u001a\u0004\u0018\u00010\u0018*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006]"}, d2 = {"Lheaderbidding/v1/HeaderBiddingTokenKt$Dsl;", "", "_builder", "Lheaderbidding/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;", "(Lheaderbidding/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;)V", "value", "Lgateway/v1/CampaignStateOuterClass$CampaignState;", "campaignState", "getCampaignState", "()Lgateway/v1/CampaignStateOuterClass$CampaignState;", "setCampaignState", "(Lgateway/v1/CampaignStateOuterClass$CampaignState;)V", "Lgateway/v1/ClientInfoOuterClass$ClientInfo;", "clientInfo", "getClientInfo", "()Lgateway/v1/ClientInfoOuterClass$ClientInfo;", "setClientInfo", "(Lgateway/v1/ClientInfoOuterClass$ClientInfo;)V", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "getDynamicDeviceInfo", "()Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "Lgateway/v1/PiiOuterClass$Pii;", "pii", "getPii", "()Lgateway/v1/PiiOuterClass$Pii;", "setPii", "(Lgateway/v1/PiiOuterClass$Pii;)V", "Lgateway/v1/SessionCountersOuterClass$SessionCounters;", "sessionCounters", "getSessionCounters", "()Lgateway/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgateway/v1/SessionCountersOuterClass$SessionCounters;)V", "Lcom/google/protobuf/ByteString;", "sessionToken", "getSessionToken", "()Lcom/google/protobuf/ByteString;", "setSessionToken", "(Lcom/google/protobuf/ByteString;)V", "Lgateway/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "getStaticDeviceInfo", "()Lgateway/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgateway/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "tcf", "getTcf", "setTcf", "Lgateway/v1/TimestampsOuterClass$Timestamps;", "timestamps", "getTimestamps", "()Lgateway/v1/TimestampsOuterClass$Timestamps;", "setTimestamps", "(Lgateway/v1/TimestampsOuterClass$Timestamps;)V", "tokenId", "getTokenId", "setTokenId", "", "tokenNumber", "getTokenNumber", "()I", "setTokenNumber", "(I)V", "piiOrNull", "getPiiOrNull", "(Lheaderbidding/v1/HeaderBiddingTokenKt$Dsl;)Lgateway/v1/PiiOuterClass$Pii;", "_build", "Lheaderbidding/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "clearCampaignState", "", "clearClientInfo", "clearDynamicDeviceInfo", "clearPii", "clearSessionCounters", "clearSessionToken", "clearStaticDeviceInfo", "clearTcf", "clearTimestamps", "clearTokenId", "clearTokenNumber", "hasCampaignState", "", "hasClientInfo", "hasDynamicDeviceInfo", "hasPii", "hasSessionCounters", "hasStaticDeviceInfo", "hasTcf", "hasTimestamps", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder _builder;

        public /* synthetic */ Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: HeaderBiddingTokenKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lheaderbidding/v1/HeaderBiddingTokenKt$Dsl$Companion;", "", "()V", "_create", "Lheaderbidding/v1/HeaderBiddingTokenKt$Dsl;", "builder", "Lheaderbidding/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ HeaderBiddingTokenOuterClass.HeaderBiddingToken _build() {
            HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingTokenBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(headerBiddingTokenBuild, "_builder.build()");
            return headerBiddingTokenBuild;
        }

        public final ByteString getTokenId() {
            ByteString tokenId = this._builder.getTokenId();
            Intrinsics.checkNotNullExpressionValue(tokenId, "_builder.getTokenId()");
            return tokenId;
        }

        public final void setTokenId(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTokenId(value);
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        public final int getTokenNumber() {
            return this._builder.getTokenNumber();
        }

        public final void setTokenNumber(int i) {
            this._builder.setTokenNumber(i);
        }

        public final void clearTokenNumber() {
            this._builder.clearTokenNumber();
        }

        public final ByteString getSessionToken() {
            ByteString sessionToken = this._builder.getSessionToken();
            Intrinsics.checkNotNullExpressionValue(sessionToken, "_builder.getSessionToken()");
            return sessionToken;
        }

        public final void setSessionToken(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSessionToken(value);
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            Intrinsics.checkNotNullExpressionValue(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
        }

        public final void setClientInfo(ClientInfoOuterClass.ClientInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setClientInfo(value);
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            Intrinsics.checkNotNullExpressionValue(timestamps, "_builder.getTimestamps()");
            return timestamps;
        }

        public final void setTimestamps(TimestampsOuterClass.Timestamps value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTimestamps(value);
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            Intrinsics.checkNotNullExpressionValue(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final PiiOuterClass.Pii getPii() {
            PiiOuterClass.Pii pii = this._builder.getPii();
            Intrinsics.checkNotNullExpressionValue(pii, "_builder.getPii()");
            return pii;
        }

        public final void setPii(PiiOuterClass.Pii value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPii(value);
        }

        public final void clearPii() {
            this._builder.clearPii();
        }

        public final boolean hasPii() {
            return this._builder.hasPii();
        }

        public final PiiOuterClass.Pii getPiiOrNull(Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getPiiOrNull(dsl._builder);
        }

        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            Intrinsics.checkNotNullExpressionValue(campaignState, "_builder.getCampaignState()");
            return campaignState;
        }

        public final void setCampaignState(CampaignStateOuterClass.CampaignState value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCampaignState(value);
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final ByteString getTcf() {
            ByteString tcf = this._builder.getTcf();
            Intrinsics.checkNotNullExpressionValue(tcf, "_builder.getTcf()");
            return tcf;
        }

        public final void setTcf(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTcf(value);
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final boolean hasTcf() {
            return this._builder.hasTcf();
        }
    }

    private HeaderBiddingTokenKt() {
    }
}
