package com.unity3d.services.ads.operation.load;

import com.unity3d.services.core.configuration.ExperimentsReader;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class LoadBannerModule extends BaseLoadModule {
    static ILoadModule _instance;

    public static ILoadModule getInstance() {
        if (_instance == null) {
            _instance = new LoadModuleDecoratorTimeout(new LoadModuleDecoratorInitializationBuffer(new LoadBannerModule((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)), InitializationNotificationCenter.getInstance()), new ExperimentsReader());
        }
        return _instance;
    }

    public LoadBannerModule(SDKMetricsSender sDKMetricsSender) {
        super(sDKMetricsSender);
    }

    @Override // com.unity3d.services.ads.operation.load.BaseLoadModule
    protected void addOptionalParameters(LoadOperationState loadOperationState, JSONObject jSONObject) throws JSONException {
        if (loadOperationState instanceof LoadBannerOperationState) {
            LoadBannerOperationState loadBannerOperationState = (LoadBannerOperationState) loadOperationState;
            jSONObject.put("width", loadBannerOperationState.getSize().getWidth());
            jSONObject.put("height", loadBannerOperationState.getSize().getHeight());
        }
    }
}
