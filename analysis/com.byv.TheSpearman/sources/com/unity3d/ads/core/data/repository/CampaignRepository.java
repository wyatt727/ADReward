package com.unity3d.ads.core.data.repository;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.ByteString;
import gateway.v1.CampaignStateOuterClass;
import kotlin.Metadata;

/* compiled from: CampaignRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "", "getCampaign", "Lgateway/v1/CampaignStateOuterClass$Campaign;", "opportunityId", "Lcom/google/protobuf/ByteString;", "getCampaignState", "Lgateway/v1/CampaignStateOuterClass$CampaignState;", "removeState", "", "setCampaign", FirebaseAnalytics.Param.CAMPAIGN, "setLoadTimestamp", "setShowTimestamp", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CampaignRepository {
    CampaignStateOuterClass.Campaign getCampaign(ByteString opportunityId);

    CampaignStateOuterClass.CampaignState getCampaignState();

    void removeState(ByteString opportunityId);

    void setCampaign(ByteString opportunityId, CampaignStateOuterClass.Campaign campaign);

    void setLoadTimestamp(ByteString opportunityId);

    void setShowTimestamp(ByteString opportunityId);
}
