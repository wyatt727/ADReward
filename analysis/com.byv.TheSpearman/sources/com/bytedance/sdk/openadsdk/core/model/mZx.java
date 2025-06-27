package com.bytedance.sdk.openadsdk.core.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdLogInfoModel.java */
/* loaded from: classes2.dex */
public class mZx {
    public String EYQ;
    public AdSlot Kbd;
    public ArrayList<Integer> Pm;
    public int Td = 1;
    public int mZx;

    public String EYQ() {
        return this.EYQ;
    }

    public void EYQ(String str) {
        this.EYQ = str;
    }

    public int mZx() {
        return this.mZx;
    }

    public void EYQ(int i) {
        this.mZx = i;
    }

    public int Td() {
        return this.Td;
    }

    public void mZx(int i) {
        this.Td = i;
    }

    public AdSlot Pm() {
        return this.Kbd;
    }

    public void EYQ(AdSlot adSlot) {
        this.Kbd = adSlot;
    }

    public ArrayList<Integer> Kbd() {
        return this.Pm;
    }

    public void EYQ(ArrayList<Integer> arrayList) {
        this.Pm = arrayList;
    }

    public static void EYQ(mZx mzx) {
        int iMZx;
        if (mzx == null || mzx.Pm() == null || (iMZx = mzx.mZx()) >= 0 || iMZx == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.tp.Td.EYQ();
        com.bytedance.sdk.openadsdk.tp.Td.EYQ("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.core.model.mZx.1
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypedValues.TransitionType.S_FROM, mZx.this.Td());
                jSONObject.put("err_code", mZx.this.mZx());
                jSONObject.put("server_res_str", mZx.this.EYQ());
                if (mZx.this.Kbd() != null && mZx.this.Kbd().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) mZx.this.Kbd()).toString());
                }
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("rd_client_custom_error").EYQ(mZx.this.Pm().getDurationSlotType()).mZx(jSONObject.toString());
            }
        });
    }
}
