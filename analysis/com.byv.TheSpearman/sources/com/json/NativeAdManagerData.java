package com.json;

import com.json.d0;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/ironsource/ka;", "Lcom/ironsource/p;", "", "t", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "u", "Lcom/ironsource/fa;", "v", "userId", "providerList", x6.p, "a", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lcom/ironsource/fa;", "w", "()Lcom/ironsource/fa;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/fa;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.ironsource.ka, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class NativeAdManagerData extends p {

    /* renamed from: t, reason: from kotlin metadata */
    private final String userId;

    /* renamed from: u, reason: from kotlin metadata */
    private final List<NetworkSettings> providerList;

    /* renamed from: v, reason: from kotlin metadata and from toString */
    private final fa configs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeAdManagerData(String str, List<? extends NetworkSettings> list, fa configs) {
        super(IronSource.AD_UNIT.NATIVE_AD, str, list, configs.getAuctionSettings(), configs.getAdaptersSmartLoadAmount(), (int) (configs.getAdaptersSmartLoadTimeoutInMills() / 1000), configs.getBidderExclusive(), configs.getDelayLoadFailure(), -1, new d0(d0.a.MANUAL, configs.getAuctionSettings().j(), configs.getAuctionSettings().b(), -1L), configs.getMCollectBiddingDataAsyncEnabled(), configs.getMCollectBiddingDataTimeout(), configs.getMProvidersParallelInit(), configs.getMWaitUntilAllProvidersFinishInit(), configs.getMThreadPerManager(), configs.getMSharedManagersThread(), false, 65536, null);
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.userId = str;
        this.providerList = list;
        this.configs = configs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeAdManagerData a(NativeAdManagerData nativeAdManagerData, String str, List list, fa faVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeAdManagerData.getUserId();
        }
        if ((i & 2) != 0) {
            list = nativeAdManagerData.j();
        }
        if ((i & 4) != 0) {
            faVar = nativeAdManagerData.configs;
        }
        return nativeAdManagerData.a(str, list, faVar);
    }

    public final NativeAdManagerData a(String userId, List<? extends NetworkSettings> providerList, fa configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new NativeAdManagerData(userId, providerList, configs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeAdManagerData)) {
            return false;
        }
        NativeAdManagerData nativeAdManagerData = (NativeAdManagerData) other;
        return Intrinsics.areEqual(getUserId(), nativeAdManagerData.getUserId()) && Intrinsics.areEqual(j(), nativeAdManagerData.j()) && Intrinsics.areEqual(this.configs, nativeAdManagerData.configs);
    }

    public int hashCode() {
        return ((((getUserId() == null ? 0 : getUserId().hashCode()) * 31) + (j() != null ? j().hashCode() : 0)) * 31) + this.configs.hashCode();
    }

    @Override // com.json.p
    public List<NetworkSettings> j() {
        return this.providerList;
    }

    @Override // com.json.p
    /* renamed from: p, reason: from getter */
    public String getUserId() {
        return this.userId;
    }

    public final String t() {
        return getUserId();
    }

    public String toString() {
        return "NativeAdManagerData(userId=" + getUserId() + ", providerList=" + j() + ", configs=" + this.configs + ')';
    }

    public final List<NetworkSettings> u() {
        return j();
    }

    /* renamed from: v, reason: from getter */
    public final fa getConfigs() {
        return this.configs;
    }

    public final fa w() {
        return this.configs;
    }
}
