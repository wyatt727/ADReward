package com.bytedance.sdk.openadsdk.core.settings;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ISettingsDataRepository.java */
/* loaded from: classes2.dex */
public interface Pm {
    public static final mZx<JSONObject> EYQ = new mZx<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.Pm.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.mZx
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public JSONObject mZx(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("ISettingsDataRepository", "", e);
                return null;
            }
        }
    };
    public static final mZx<Set<String>> mZx = new mZx<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.Pm.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.mZx
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public Set<String> mZx(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.getString(i));
                }
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("ISettingsDataRepository", "", e);
            }
            return hashSet;
        }
    };

    /* compiled from: ISettingsDataRepository.java */
    public interface EYQ {
        EYQ EYQ(String str);

        EYQ EYQ(String str, float f);

        EYQ EYQ(String str, int i);

        EYQ EYQ(String str, long j);

        EYQ EYQ(String str, String str2);

        EYQ EYQ(String str, boolean z);

        void EYQ();
    }

    /* compiled from: ISettingsDataRepository.java */
    public interface mZx<T> {
        T mZx(String str);
    }

    void EYQ(JSONObject jSONObject);
}
