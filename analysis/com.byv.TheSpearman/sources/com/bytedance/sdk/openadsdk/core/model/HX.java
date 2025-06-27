package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ClickEventModel.java */
/* loaded from: classes2.dex */
public class HX {
    private final int[] EYQ;
    private final long HX;
    private final float IPb;
    private final SparseArray<Td.EYQ> KO;
    private final float Kbd;
    private final int MxO;
    private final int[] Pm;
    private final float QQ;
    private final int[] Td;
    private final JSONObject UB;
    private final String Uc;
    private final float VwS;
    private final int hu;
    private final int[] mZx;
    private final int nWX;
    private final int pi;
    private final long tp;
    private final int tsL;

    private HX(EYQ eyq) {
        this.EYQ = eyq.MxO;
        this.mZx = eyq.tsL;
        this.Pm = eyq.pi;
        this.Td = eyq.tp;
        this.Kbd = eyq.HX;
        this.IPb = eyq.QQ;
        this.VwS = eyq.VwS;
        this.QQ = eyq.IPb;
        this.HX = eyq.Kbd;
        this.tp = eyq.Pm;
        this.MxO = eyq.nWX;
        this.tsL = eyq.KO;
        this.pi = eyq.hu;
        this.nWX = eyq.Uc;
        this.KO = eyq.UB;
        this.Uc = eyq.hYh;
        this.hu = eyq.zF;
        this.UB = eyq.WU;
    }

    public JSONObject EYQ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            int[] iArr = this.EYQ;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.EYQ[1]));
            }
            int[] iArr2 = this.mZx;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.mZx[1]));
            }
            int[] iArr3 = this.Td;
            if (iArr3 != null && iArr3.length == 2) {
                jSONObject.putOpt("button_x", Integer.valueOf(iArr3[0])).putOpt("button_y", Integer.valueOf(this.Td[1]));
            }
            int[] iArr4 = this.Pm;
            if (iArr4 != null && iArr4.length == 2) {
                jSONObject.putOpt("button_width", Integer.valueOf(iArr4[0])).putOpt("button_height", Integer.valueOf(this.Pm[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.Kbd)).putOpt("down_y", Float.toString(this.IPb)).putOpt("up_x", Float.toString(this.VwS)).putOpt("up_y", Float.toString(this.QQ)).putOpt("down_time", Long.valueOf(this.HX)).putOpt("up_time", Long.valueOf(this.tp)).putOpt("toolType", Integer.valueOf(this.MxO)).putOpt("deviceId", Integer.valueOf(this.tsL)).putOpt(FirebaseAnalytics.Param.SOURCE, Integer.valueOf(this.pi)).putOpt("ft", EYQ(this.KO, this.nWX)).putOpt("click_area_type", this.Uc);
            int i = this.hu;
            if (i > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i));
            }
            JSONObject jSONObject2 = this.UB;
            if (jSONObject2 != null) {
                jSONObject.putOpt("rectInfo", jSONObject2);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject EYQ(SparseArray<Td.EYQ> sparseArray, int i) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    Td.EYQ eyqValueAt = sparseArray.valueAt(i2);
                    if (eyqValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(eyqValueAt.Td)).putOpt("mr", Double.valueOf(eyqValueAt.mZx)).putOpt(TypedValues.CycleType.S_WAVE_PHASE, Integer.valueOf(eyqValueAt.EYQ)).putOpt("ts", Long.valueOf(eyqValueAt.Pm));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* compiled from: ClickEventModel.java */
    public static class EYQ {
        float EYQ;
        private float HX;
        private float IPb;
        private int KO;
        private long Kbd;
        private int[] MxO;
        private long Pm;
        private float QQ;
        float Td;
        private SparseArray<Td.EYQ> UB;
        private int Uc;
        private float VwS;
        private JSONObject WU;
        private String hYh;
        private int hu;
        int mZx;
        private int nWX;
        private int[] pi;
        private int[] tp;
        private int[] tsL;
        private int zF;

        public EYQ EYQ(int i) {
            this.zF = i;
            return this;
        }

        public EYQ EYQ(JSONObject jSONObject) {
            this.WU = jSONObject;
            return this;
        }

        public EYQ mZx(int i) {
            this.Uc = i;
            return this;
        }

        public EYQ EYQ(SparseArray<Td.EYQ> sparseArray) {
            this.UB = sparseArray;
            return this;
        }

        public EYQ EYQ(float f) {
            this.EYQ = f;
            return this;
        }

        public EYQ Td(int i) {
            this.mZx = i;
            return this;
        }

        public EYQ mZx(float f) {
            this.Td = f;
            return this;
        }

        public EYQ EYQ(long j) {
            this.Pm = j;
            return this;
        }

        public EYQ mZx(long j) {
            this.Kbd = j;
            return this;
        }

        public EYQ Td(float f) {
            this.IPb = f;
            return this;
        }

        public EYQ Pm(float f) {
            this.VwS = f;
            return this;
        }

        public EYQ Kbd(float f) {
            this.QQ = f;
            return this;
        }

        public EYQ IPb(float f) {
            this.HX = f;
            return this;
        }

        public EYQ EYQ(int[] iArr) {
            this.tp = iArr;
            return this;
        }

        public EYQ mZx(int[] iArr) {
            this.MxO = iArr;
            return this;
        }

        public EYQ Td(int[] iArr) {
            this.tsL = iArr;
            return this;
        }

        public EYQ Pm(int[] iArr) {
            this.pi = iArr;
            return this;
        }

        public EYQ Pm(int i) {
            this.nWX = i;
            return this;
        }

        public EYQ Kbd(int i) {
            this.KO = i;
            return this;
        }

        public EYQ IPb(int i) {
            this.hu = i;
            return this;
        }

        public EYQ EYQ(String str) {
            this.hYh = str;
            return this;
        }

        public HX EYQ() {
            return new HX(this);
        }
    }
}
