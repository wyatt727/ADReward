package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.properties.Session;
import java.util.Map;

/* loaded from: classes4.dex */
public class DeviceInfoReaderWithSessionId implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final Session _session;

    public DeviceInfoReaderWithSessionId(IDeviceInfoReader iDeviceInfoReader, Session session) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._session = session;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        deviceInfoData.put("sessionId", this._session.getId());
        return deviceInfoData;
    }
}
