package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderPrivacyBuilder;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;

/* loaded from: classes4.dex */
public class DeviceInfoDataFactory {
    private final SDKMetricsSender _sdkMetricsSender;

    public DeviceInfoDataFactory(SDKMetricsSender sDKMetricsSender) {
        this._sdkMetricsSender = sDKMetricsSender;
    }

    /* renamed from: com.unity3d.services.core.device.reader.DeviceInfoDataFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$configuration$InitRequestType;

        static {
            int[] iArr = new int[InitRequestType.values().length];
            $SwitchMap$com$unity3d$services$core$configuration$InitRequestType = iArr;
            try {
                iArr[InitRequestType.TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$configuration$InitRequestType[InitRequestType.PRIVACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public IDeviceInfoDataContainer getDeviceInfoData(InitRequestType initRequestType) {
        int i = AnonymousClass1.$SwitchMap$com$unity3d$services$core$configuration$InitRequestType[initRequestType.ordinal()];
        if (i == 1) {
            return getTokenDeviceInfoData();
        }
        if (i != 2) {
            return null;
        }
        return getPrivacyDeviceInfoData();
    }

    private IDeviceInfoDataContainer getPrivacyDeviceInfoData() {
        return new DeviceInfoReaderCompressor(new DeviceInfoReaderPrivacyBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance()).build());
    }

    private IDeviceInfoDataContainer getTokenDeviceInfoData() {
        return new DeviceInfoReaderCompressorWithMetrics(new DeviceInfoReaderCompressor(new DeviceInfoReaderBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance()).build()), this._sdkMetricsSender);
    }
}
