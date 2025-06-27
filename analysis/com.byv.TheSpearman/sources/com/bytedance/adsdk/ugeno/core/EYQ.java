package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AnimationSetModel.java */
/* loaded from: classes2.dex */
public class EYQ {
    private String EYQ;
    private String IPb;
    private long Kbd;
    private long Pm;
    private List<C0077EYQ> Td;
    private float mZx;

    public String EYQ() {
        return this.EYQ;
    }

    public void EYQ(String str) {
        this.EYQ = str;
    }

    public void EYQ(float f) {
        this.mZx = f;
    }

    public float mZx() {
        return this.mZx;
    }

    public List<C0077EYQ> Td() {
        return this.Td;
    }

    public void EYQ(List<C0077EYQ> list) {
        this.Td = list;
    }

    public long Pm() {
        return this.Pm;
    }

    public void EYQ(long j) {
        this.Pm = j;
    }

    public long Kbd() {
        return this.Kbd;
    }

    public void mZx(long j) {
        this.Kbd = j;
    }

    public String IPb() {
        return this.IPb;
    }

    public void mZx(String str) {
        this.IPb = str;
    }

    public static EYQ EYQ(String str, com.bytedance.adsdk.ugeno.component.mZx mzx) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return EYQ(new JSONObject(str), mzx);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static EYQ EYQ(JSONObject jSONObject, com.bytedance.adsdk.ugeno.component.mZx mzx) {
        return EYQ(jSONObject, null, mzx);
    }

    public static EYQ EYQ(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.component.mZx mzx) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        EYQ eyq = new EYQ();
        eyq.EYQ(jSONObject.optString("ordering"));
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            eyq.EYQ(-1.0f);
        } else {
            try {
                eyq.EYQ(Float.parseFloat(strOptString));
            } catch (NumberFormatException unused) {
                eyq.EYQ(0.0f);
            }
        }
        eyq.EYQ(jSONObject.optLong("duration", 0L));
        eyq.mZx(com.bytedance.adsdk.ugeno.mZx.Td.EYQ(com.bytedance.adsdk.ugeno.EYQ.Td.EYQ(jSONObject.optString("startDelay"), mzx.tp()), 0L));
        eyq.mZx(jSONObject.optString("loopMode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.mZx.mZx.EYQ(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0077EYQ.EYQ(jSONObjectOptJSONObject, mzx));
            }
            eyq.EYQ(arrayList);
        }
        return eyq;
    }

    /* compiled from: AnimationSetModel.java */
    /* renamed from: com.bytedance.adsdk.ugeno.core.EYQ$EYQ, reason: collision with other inner class name */
    public static class C0077EYQ {
        private long EYQ;
        private String HX;
        private float IPb;
        private String Kbd;
        private long Pm;
        private float[] QQ;
        private String Td;
        private float VwS;
        private float mZx;
        private String tp;

        public long EYQ() {
            return this.EYQ;
        }

        public void EYQ(long j) {
            this.EYQ = j;
        }

        public float mZx() {
            return this.mZx;
        }

        public void EYQ(float f) {
            this.mZx = f;
        }

        public String Td() {
            return this.Td;
        }

        public void EYQ(String str) {
            this.Td = str;
        }

        public long Pm() {
            return this.Pm;
        }

        public void mZx(long j) {
            this.Pm = j;
        }

        public String Kbd() {
            return this.Kbd;
        }

        public void mZx(String str) {
            this.Kbd = str;
        }

        public float IPb() {
            return this.IPb;
        }

        public void mZx(float f) {
            this.IPb = f;
        }

        public float VwS() {
            return this.VwS;
        }

        public void Td(float f) {
            this.VwS = f;
        }

        public float[] QQ() {
            return this.QQ;
        }

        public void EYQ(float[] fArr) {
            this.QQ = fArr;
        }

        public String HX() {
            return this.HX;
        }

        public String tp() {
            return this.tp;
        }

        public void Td(String str) {
            this.tp = str;
        }

        public void Pm(String str) {
            this.HX = str;
        }

        public static C0077EYQ EYQ(JSONObject jSONObject, com.bytedance.adsdk.ugeno.component.mZx mzx) {
            if (jSONObject == null) {
                return null;
            }
            C0077EYQ c0077eyq = new C0077EYQ();
            c0077eyq.EYQ(jSONObject.optLong("duration"));
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0077eyq.EYQ(-1.0f);
            } else {
                try {
                    c0077eyq.EYQ(Float.parseFloat(strOptString));
                } catch (NumberFormatException unused) {
                    c0077eyq.EYQ(0.0f);
                }
            }
            c0077eyq.EYQ(jSONObject.optString("loopMode"));
            c0077eyq.mZx(jSONObject.optString("type"));
            if (TextUtils.equals(c0077eyq.Kbd(), "ripple")) {
                c0077eyq.Td(jSONObject.optString("rippleColor"));
            }
            if (TextUtils.equals(c0077eyq.Kbd(), "backgroundColor")) {
                String strEYQ = com.bytedance.adsdk.ugeno.EYQ.Td.EYQ(jSONObject.optString("valueTo"), mzx.tp());
                int iEYQ = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(jSONObject.optString("valueFrom"));
                int iEYQ2 = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(strEYQ);
                c0077eyq.mZx(iEYQ);
                c0077eyq.Td(iEYQ2);
            } else {
                c0077eyq.mZx((float) jSONObject.optDouble("valueFrom"));
                c0077eyq.Td((float) jSONObject.optDouble("valueTo"));
            }
            c0077eyq.Pm(jSONObject.optString("interpolator"));
            String strEYQ2 = com.bytedance.adsdk.ugeno.EYQ.Td.EYQ(jSONObject.optString("startDelay"), mzx.tp());
            Log.d("TAG", "createAnimationModel: ");
            c0077eyq.mZx(com.bytedance.adsdk.ugeno.mZx.Td.EYQ(strEYQ2, 0L));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    fArr[i] = (float) jSONArrayOptJSONArray.optDouble(i);
                }
                c0077eyq.EYQ(fArr);
            }
            return c0077eyq;
        }
    }
}
