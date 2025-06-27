package com.bytedance.adsdk.ugeno.EYQ;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FindInvoker.java */
/* loaded from: classes2.dex */
public class EYQ implements mZx {
    @Override // com.bytedance.adsdk.ugeno.EYQ.mZx
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public String mZx(Object[] objArr) {
        if (objArr != null && objArr.length == 3) {
            String strValueOf = String.valueOf(objArr[0]);
            if (TextUtils.isEmpty(strValueOf)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(strValueOf);
                String strValueOf2 = String.valueOf(objArr[1]);
                if (TextUtils.isEmpty(strValueOf2)) {
                    return null;
                }
                return jSONObject.optString(strValueOf2, String.valueOf(objArr[2]));
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
