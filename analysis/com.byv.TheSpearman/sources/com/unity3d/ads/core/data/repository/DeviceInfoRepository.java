package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.json.i5;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import gateway.v1.AllowedPiiOuterClass;
import gateway.v1.DynamicDeviceInfoOuterClass;
import gateway.v1.PiiOuterClass;
import gateway.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: DeviceInfoRepository.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010,\u001a\u00020-H&J\u0011\u0010.\u001a\u00020/H¦@ø\u0001\u0000¢\u0006\u0002\u00100J\u0011\u00101\u001a\u00020/H¦@ø\u0001\u0000¢\u0006\u0002\u00100J\u0011\u00102\u001a\u00020-H¦@ø\u0001\u0000¢\u0006\u0002\u00100R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0012\u0010\r\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0012\u0010\u0019\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\nR\u0012\u0010\u001b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\nR\u0012\u0010\u001d\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\nR\u0012\u0010\u001f\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0012\u0010#\u001a\u00020$X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "", "allowedPii", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lgateway/v1/AllowedPiiOuterClass$AllowedPii;", "getAllowedPii", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "analyticsUserId", "", "getAnalyticsUserId", "()Ljava/lang/String;", "appName", "getAppName", "connectionTypeStr", "getConnectionTypeStr", "dynamicDeviceInfo", "Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgateway/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "hasInternet", "", "getHasInternet", "()Z", "manufacturer", "getManufacturer", i5.u, "getModel", "orientation", "getOrientation", "osVersion", "getOsVersion", "piiData", "Lgateway/v1/PiiOuterClass$Pii;", "getPiiData", "()Lgateway/v1/PiiOuterClass$Pii;", "ringerMode", "", "getRingerMode", "()I", "volumeSettingsChange", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "getVolumeSettingsChange", "()Lkotlinx/coroutines/flow/Flow;", "cachedStaticDeviceInfo", "Lgateway/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getAuid", "Lcom/google/protobuf/ByteString;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIdfi", "staticDeviceInfo", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DeviceInfoRepository {
    StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo();

    MutableStateFlow<AllowedPiiOuterClass.AllowedPii> getAllowedPii();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuid(Continuation<? super ByteString> continuation);

    String getConnectionTypeStr();

    DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

    boolean getHasInternet();

    Object getIdfi(Continuation<? super ByteString> continuation);

    String getManufacturer();

    String getModel();

    String getOrientation();

    String getOsVersion();

    PiiOuterClass.Pii getPiiData();

    int getRingerMode();

    Flow<VolumeSettingsChange> getVolumeSettingsChange();

    Object staticDeviceInfo(Continuation<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> continuation);
}
