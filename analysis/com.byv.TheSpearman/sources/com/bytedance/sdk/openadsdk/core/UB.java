package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.Uc;
import java.util.List;
import org.json.JSONObject;

/* compiled from: NetApi.java */
/* loaded from: classes2.dex */
public interface UB<T> {

    /* compiled from: NetApi.java */
    public interface EYQ {
        void EYQ(int i, String str);

        void EYQ(com.bytedance.sdk.openadsdk.core.model.EYQ eyq, com.bytedance.sdk.openadsdk.core.model.mZx mzx);
    }

    /* compiled from: NetApi.java */
    public interface mZx {
        void EYQ(int i, String str);

        void EYQ(Uc.mZx mzx);
    }

    com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ EYQ();

    com.bytedance.sdk.openadsdk.mZx.Kbd EYQ(JSONObject jSONObject);

    com.bytedance.sdk.openadsdk.mZx.Kbd EYQ(JSONObject jSONObject, String str, boolean z);

    void EYQ(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hYh hyh, int i, EYQ eyq);

    void EYQ(String str);

    void EYQ(String str, List<FilterWord> list, String str2, String str3);

    void EYQ(JSONObject jSONObject, mZx mzx);

    void EYQ(JSONObject jSONObject, String str);
}
