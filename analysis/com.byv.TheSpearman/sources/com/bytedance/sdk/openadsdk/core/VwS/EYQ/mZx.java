package com.bytedance.sdk.openadsdk.core.VwS.EYQ;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.VwS.mZx.Td;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastXmlParser.java */
/* loaded from: classes2.dex */
public abstract class mZx {
    public int EYQ;
    public EYQ IPb;
    public int Kbd;
    protected double Pm;
    protected int Td;
    protected final Context mZx;

    /* compiled from: VastXmlParser.java */
    public static class EYQ {
        public int EYQ;
        public boolean Td;
        public int mZx;
    }

    public abstract com.bytedance.sdk.openadsdk.core.VwS.EYQ EYQ(String str, List<Td> list);

    public mZx(Context context, int i, int i2) {
        this.Td = 0;
        this.Pm = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (i2 > 0 && i > 0) {
            this.Pm = i / i2;
        }
        float fKbd = tr.Kbd(context);
        if (fKbd != 0.0f && i > 0) {
            this.Td = (int) (i / fKbd);
        }
        this.mZx = context.getApplicationContext();
    }

    protected void EYQ(Exception exc, int i) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put(AndroidBridgeConstants.ERROR_CODE, i);
            com.bytedance.sdk.openadsdk.tp.Td.EYQ().EYQ("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    protected boolean EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    protected String mZx(String str, List<Td> list) throws JSONException {
        String strPm;
        com.bytedance.sdk.component.IPb.mZx mzxEYQ;
        int i = this.EYQ;
        if (i >= 5) {
            return null;
        }
        this.EYQ = i + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.IPb.mZx.mZx mzxTd = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().Td();
            mzxTd.EYQ(str);
            mzxEYQ = mzxTd.EYQ();
            strPm = mzxEYQ.Pm();
        } catch (Exception e) {
            e = e;
            strPm = null;
        }
        try {
            mzxEYQ.EYQ();
        } catch (Exception e2) {
            e = e2;
            EYQ(e, 0);
            if (!list.isEmpty()) {
                Td.mZx(list, com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ.WRAPPER_TIMEOUT, -1L, null);
            }
            return strPm;
        }
        return strPm;
    }
}
