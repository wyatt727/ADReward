package com.google.unity.mediation.liftoffmonetize;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.unity.ads.AdNetworkExtras;
import java.util.HashMap;

/* loaded from: classes4.dex */
abstract class VungleUnityExtrasBuilder implements AdNetworkExtras {
    private static final String USER_ID_KEY = "user_id";

    VungleUnityExtrasBuilder() {
    }

    @Override // com.google.unity.ads.AdNetworkExtras
    public Bundle buildExtras(HashMap<String, String> map) {
        Bundle bundle = new Bundle();
        String str = map.get(USER_ID_KEY);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("userId", str);
        }
        return bundle;
    }
}
