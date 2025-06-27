package com.json;

import com.json.d0;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.utils.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/ironsource/l8;", "Lcom/ironsource/p;", "", "t", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "u", "Lcom/ironsource/n8;", "v", "userId", "providerList", x6.p, "a", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lcom/ironsource/n8;", "w", "()Lcom/ironsource/n8;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/n8;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.ironsource.l8, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class InterstitialAdManagerData extends p {

    /* renamed from: t, reason: from kotlin metadata */
    private final String userId;

    /* renamed from: u, reason: from kotlin metadata */
    private final List<NetworkSettings> providerList;

    /* renamed from: v, reason: from kotlin metadata and from toString */
    private final n8 configs;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public InterstitialAdManagerData(String str, List<? extends NetworkSettings> list, n8 configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        a aVarG = configs.g();
        Intrinsics.checkNotNullExpressionValue(aVarG, "configs.interstitialAuctionSettings");
        super(ad_unit, str, list, aVarG, configs.c(), configs.d(), configs.f(), configs.b(), -1, new d0(d0.a.MANUAL, configs.g().j(), configs.g().b(), -1L), configs.h(), configs.i(), configs.l(), configs.o(), configs.n(), configs.m(), false, 65536, null);
        this.userId = str;
        this.providerList = list;
        this.configs = configs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterstitialAdManagerData a(InterstitialAdManagerData interstitialAdManagerData, String str, List list, n8 n8Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interstitialAdManagerData.getUserId();
        }
        if ((i & 2) != 0) {
            list = interstitialAdManagerData.j();
        }
        if ((i & 4) != 0) {
            n8Var = interstitialAdManagerData.configs;
        }
        return interstitialAdManagerData.a(str, list, n8Var);
    }

    public final InterstitialAdManagerData a(String userId, List<? extends NetworkSettings> providerList, n8 configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new InterstitialAdManagerData(userId, providerList, configs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterstitialAdManagerData)) {
            return false;
        }
        InterstitialAdManagerData interstitialAdManagerData = (InterstitialAdManagerData) other;
        return Intrinsics.areEqual(getUserId(), interstitialAdManagerData.getUserId()) && Intrinsics.areEqual(j(), interstitialAdManagerData.j()) && Intrinsics.areEqual(this.configs, interstitialAdManagerData.configs);
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
        return "InterstitialAdManagerData(userId=" + getUserId() + ", providerList=" + j() + ", configs=" + this.configs + ')';
    }

    public final List<NetworkSettings> u() {
        return j();
    }

    /* renamed from: v, reason: from getter */
    public final n8 getConfigs() {
        return this.configs;
    }

    public final n8 w() {
        return this.configs;
    }
}
