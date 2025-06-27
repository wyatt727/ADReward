package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.json.i5;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import gateway.v1.AllowedPiiOuterClass;
import gateway.v1.DynamicDeviceInfoOuterClass;
import gateway.v1.PiiOuterClass;
import gateway.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.koin.core.annotation.Single;

/* compiled from: AndroidDeviceInfoRepository.kt */
@Single
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u00103\u001a\u000204H\u0016J\u0011\u00105\u001a\u000206H\u0096@ø\u0001\u0000¢\u0006\u0002\u00107J\u0011\u00108\u001a\u000206H\u0096@ø\u0001\u0000¢\u0006\u0002\u00107J\u0011\u00109\u001a\u000204H\u0096@ø\u0001\u0000¢\u0006\u0002\u00107R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u0014\u0010 \u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0011R\u0014\u0010\"\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0011R\u0014\u0010$\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0011R\u0014\u0010&\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u0002000/X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidDeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "staticDeviceInfoDataSource", "Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", "dynamicDeviceInfoDataSource", "Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;", "privacyDeviceInfoDataSource", "Lcom/unity3d/ads/core/data/datasource/PrivacyDeviceInfoDataSource;", "(Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;Lcom/unity3d/ads/core/data/datasource/PrivacyDeviceInfoDataSource;)V", "allowedPii", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lgateway/v1/AllowedPiiOuterClass$AllowedPii;", "getAllowedPii", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "analyticsUserId", "", "getAnalyticsUserId", "()Ljava/lang/String;", "appName", "getAppName", "connectionTypeStr", "getConnectionTypeStr", "dynamicDeviceInfo", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "hasInternet", "", "getHasInternet", "()Z", "manufacturer", "getManufacturer", i5.u, "getModel", "orientation", "getOrientation", "osVersion", "getOsVersion", "piiData", "Lgateway/v1/PiiOuterClass$Pii;", "getPiiData", "()Lgateway/v1/PiiOuterClass$Pii;", "ringerMode", "", "getRingerMode", "()I", "volumeSettingsChange", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "getVolumeSettingsChange", "()Lkotlinx/coroutines/flow/Flow;", "cachedStaticDeviceInfo", "Lgateway/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getAuid", "Lcom/google/protobuf/ByteString;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIdfi", "staticDeviceInfo", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidDeviceInfoRepository implements DeviceInfoRepository {
    private final MutableStateFlow<AllowedPiiOuterClass.AllowedPii> allowedPii;
    private final String analyticsUserId;
    private final DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource;
    private final PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource;
    private final StaticDeviceInfoDataSource staticDeviceInfoDataSource;
    private final Flow<VolumeSettingsChange> volumeSettingsChange;

    public AndroidDeviceInfoRepository(StaticDeviceInfoDataSource staticDeviceInfoDataSource, DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource, PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource) {
        Intrinsics.checkNotNullParameter(staticDeviceInfoDataSource, "staticDeviceInfoDataSource");
        Intrinsics.checkNotNullParameter(dynamicDeviceInfoDataSource, "dynamicDeviceInfoDataSource");
        Intrinsics.checkNotNullParameter(privacyDeviceInfoDataSource, "privacyDeviceInfoDataSource");
        this.staticDeviceInfoDataSource = staticDeviceInfoDataSource;
        this.dynamicDeviceInfoDataSource = dynamicDeviceInfoDataSource;
        this.privacyDeviceInfoDataSource = privacyDeviceInfoDataSource;
        AllowedPiiOuterClass.AllowedPii defaultInstance = AllowedPiiOuterClass.AllowedPii.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
        this.allowedPii = StateFlowKt.MutableStateFlow(defaultInstance);
        this.analyticsUserId = staticDeviceInfoDataSource.getAnalyticsUserId();
        this.volumeSettingsChange = dynamicDeviceInfoDataSource.getVolumeSettingsChange();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public MutableStateFlow<AllowedPiiOuterClass.AllowedPii> getAllowedPii() {
        return this.allowedPii;
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public Object staticDeviceInfo(Continuation<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> continuation) {
        return this.staticDeviceInfoDataSource.fetch(continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo() {
        return this.staticDeviceInfoDataSource.fetchCached();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
        return this.dynamicDeviceInfoDataSource.fetch();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public PiiOuterClass.Pii getPiiData() {
        return this.privacyDeviceInfoDataSource.fetch(getAllowedPii().getValue());
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public Object getIdfi(Continuation<? super ByteString> continuation) {
        return this.staticDeviceInfoDataSource.getIdfi(continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public Object getAuid(Continuation<? super ByteString> continuation) {
        return this.staticDeviceInfoDataSource.getAuid(continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getAnalyticsUserId() {
        return this.analyticsUserId;
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public Flow<VolumeSettingsChange> getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public int getRingerMode() {
        return this.dynamicDeviceInfoDataSource.getRingerMode();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getOrientation() {
        return this.dynamicDeviceInfoDataSource.getOrientation();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getConnectionTypeStr() {
        return this.dynamicDeviceInfoDataSource.getConnectionTypeStr();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getAppName() {
        return this.staticDeviceInfoDataSource.getAppName();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getModel() {
        return this.staticDeviceInfoDataSource.getModel();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getManufacturer() {
        return this.staticDeviceInfoDataSource.getManufacturer();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getOsVersion() {
        return this.staticDeviceInfoDataSource.getOsVersion();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public boolean getHasInternet() {
        return this.dynamicDeviceInfoDataSource.hasInternet();
    }
}
