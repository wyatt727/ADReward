package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes2.dex */
public class PAGRequest {
    private String EYQ;
    private Bundle Td = null;
    private Map<String, Object> mZx;

    public String getAdString() {
        return this.EYQ;
    }

    public void setAdString(String str) {
        this.EYQ = str;
    }

    public Map<String, Object> getExtraInfo() {
        return this.mZx;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.mZx = map;
    }

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.Td == null) {
            this.Td = new Bundle();
        }
        this.Td.putBundle(cls.getName(), bundle);
    }

    public Bundle getNetworkExtrasBundle() {
        return this.Td;
    }
}
