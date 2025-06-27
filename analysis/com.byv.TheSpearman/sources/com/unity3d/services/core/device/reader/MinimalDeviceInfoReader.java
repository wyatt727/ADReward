package com.unity3d.services.core.device.reader;

import com.unity3d.ads.core.domain.GetAndroidAdPlayerContext;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MinimalDeviceInfoReader implements IDeviceInfoReader {
    final IGameSessionIdReader _gameSessionIdReader;

    public MinimalDeviceInfoReader(IGameSessionIdReader iGameSessionIdReader) {
        this._gameSessionIdReader = iGameSessionIdReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        HashMap map = new HashMap();
        map.put("platform", "android");
        map.put("sdkVersion", Integer.valueOf(SdkProperties.getVersionCode()));
        map.put("sdkVersionName", SdkProperties.getVersionName());
        map.put(ScarConstants.IDFI_KEY, Device.getIdfi());
        map.put(JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this._gameSessionIdReader.getGameSessionIdAndStore());
        map.put("ts", Long.valueOf(System.currentTimeMillis()));
        map.put(GetAndroidAdPlayerContext.KEY_GAME_ID, ClientProperties.getGameId());
        return map;
    }
}
