package com.my.target.mediation;

import android.content.Context;
import java.util.Map;

/* loaded from: classes4.dex */
public interface AdNetworkLoader {

    public interface AdParamsListener {
        void onLoad(AdNetworkLoader adNetworkLoader, Map<String, String> map, String str);
    }

    void loadParams(String str, Context context);

    void setAdParamsListener(AdParamsListener adParamsListener);
}
