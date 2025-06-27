package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import gateway.v1.DeveloperConsentOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.annotation.Single;

/* compiled from: AndroidDeveloperConsentRepository.kt */
@Single
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidDeveloperConsentRepository;", "Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;", "developerConsentDataSource", "Lcom/unity3d/ads/core/data/datasource/DeveloperConsentDataSource;", "(Lcom/unity3d/ads/core/data/datasource/DeveloperConsentDataSource;)V", "developerConsent", "Lgateway/v1/DeveloperConsentOuterClass$DeveloperConsent;", "getDeveloperConsent", "()Lgateway/v1/DeveloperConsentOuterClass$DeveloperConsent;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidDeveloperConsentRepository implements DeveloperConsentRepository {
    private final DeveloperConsentOuterClass.DeveloperConsent developerConsent;

    public AndroidDeveloperConsentRepository(DeveloperConsentDataSource developerConsentDataSource) {
        Intrinsics.checkNotNullParameter(developerConsentDataSource, "developerConsentDataSource");
        this.developerConsent = developerConsentDataSource.getDeveloperConsent();
    }

    @Override // com.unity3d.ads.core.data.repository.DeveloperConsentRepository
    public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        return this.developerConsent;
    }
}
