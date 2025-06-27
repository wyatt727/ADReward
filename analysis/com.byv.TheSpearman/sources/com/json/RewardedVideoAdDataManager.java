package com.json;

import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.utils.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/ironsource/yb;", "Lcom/ironsource/p;", "", "t", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "u", "Lcom/ironsource/cc;", "v", "", "w", "userId", "providerList", x6.p, "isManual", "a", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lcom/ironsource/cc;", "x", "()Lcom/ironsource/cc;", "Z", "y", "()Z", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/cc;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.ironsource.yb, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class RewardedVideoAdDataManager extends p {

    /* renamed from: t, reason: from kotlin metadata */
    private final String userId;

    /* renamed from: u, reason: from kotlin metadata */
    private final List<NetworkSettings> providerList;

    /* renamed from: v, reason: from kotlin metadata and from toString */
    private final cc configs;

    /* renamed from: w, reason: from kotlin metadata and from toString */
    private final boolean isManual;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public RewardedVideoAdDataManager(String str, List<? extends NetworkSettings> list, cc configs, boolean z) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        a aVarK = configs.k();
        Intrinsics.checkNotNullExpressionValue(aVarK, "configs.rewardedVideoAuctionSettings");
        super(ad_unit, str, list, aVarK, configs.g(), configs.h(), configs.j(), configs.b(), configs.c(), zb.b(configs, z), configs.l(), configs.m(), configs.f(), configs.q(), configs.p(), configs.o(), false, 65536, null);
        this.userId = str;
        this.providerList = list;
        this.configs = configs;
        this.isManual = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardedVideoAdDataManager a(RewardedVideoAdDataManager rewardedVideoAdDataManager, String str, List list, cc ccVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardedVideoAdDataManager.getUserId();
        }
        if ((i & 2) != 0) {
            list = rewardedVideoAdDataManager.j();
        }
        if ((i & 4) != 0) {
            ccVar = rewardedVideoAdDataManager.configs;
        }
        if ((i & 8) != 0) {
            z = rewardedVideoAdDataManager.isManual;
        }
        return rewardedVideoAdDataManager.a(str, list, ccVar, z);
    }

    public final RewardedVideoAdDataManager a(String userId, List<? extends NetworkSettings> providerList, cc configs, boolean isManual) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new RewardedVideoAdDataManager(userId, providerList, configs, isManual);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardedVideoAdDataManager)) {
            return false;
        }
        RewardedVideoAdDataManager rewardedVideoAdDataManager = (RewardedVideoAdDataManager) other;
        return Intrinsics.areEqual(getUserId(), rewardedVideoAdDataManager.getUserId()) && Intrinsics.areEqual(j(), rewardedVideoAdDataManager.j()) && Intrinsics.areEqual(this.configs, rewardedVideoAdDataManager.configs) && this.isManual == rewardedVideoAdDataManager.isManual;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (((((getUserId() == null ? 0 : getUserId().hashCode()) * 31) + (j() != null ? j().hashCode() : 0)) * 31) + this.configs.hashCode()) * 31;
        boolean z = this.isManual;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
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
        return "RewardedVideoAdDataManager(userId=" + getUserId() + ", providerList=" + j() + ", configs=" + this.configs + ", isManual=" + this.isManual + ')';
    }

    public final List<NetworkSettings> u() {
        return j();
    }

    /* renamed from: v, reason: from getter */
    public final cc getConfigs() {
        return this.configs;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getIsManual() {
        return this.isManual;
    }

    public final cc x() {
        return this.configs;
    }

    public final boolean y() {
        return this.isManual;
    }
}
