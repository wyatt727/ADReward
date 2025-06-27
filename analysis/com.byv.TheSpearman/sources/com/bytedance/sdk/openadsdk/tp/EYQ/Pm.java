package com.bytedance.sdk.openadsdk.tp.EYQ;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.bytedance.sdk.component.mZx.EYQ.nWX;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RequestMonitor.java */
/* loaded from: classes2.dex */
public class Pm {
    public static int EYQ = -10;
    private boolean HX;
    private long IPb;
    private long Kbd;
    private int MxO;
    private long Pm;
    private int QQ;
    private String Td;
    private int VwS;
    private final int mZx;
    private String tp;

    public Pm(int i) {
        this.mZx = i;
    }

    public Pm EYQ(String str) {
        this.Td = str;
        return this;
    }

    public Pm mZx(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.VwS = bytes.length;
        }
        return this;
    }

    public Pm EYQ(nWX nwx) {
        if (nwx != null) {
            if (nwx.IPb == nWX.EYQ.STRING_TYPE && !TextUtils.isEmpty(nwx.EYQ())) {
                this.VwS = nwx.EYQ().getBytes().length;
            }
            if (nwx.IPb == nWX.EYQ.BYTE_ARRAY_TYPE && nwx.Kbd != null) {
                this.VwS = nwx.Kbd.length;
            }
        }
        return this;
    }

    public void EYQ() {
        this.Pm = SystemClock.elapsedRealtime();
    }

    public Pm Td(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.QQ = bytes.length;
        }
        return this;
    }

    public Pm EYQ(int i) {
        this.MxO = i;
        return this;
    }

    public void mZx() {
        this.IPb = SystemClock.elapsedRealtime() - this.Pm;
    }

    public Pm Pm(String str) {
        this.tp = str;
        return this;
    }

    public Pm EYQ(boolean z) {
        this.HX = z;
        return this;
    }

    public void Td() {
        this.Kbd = SystemClock.elapsedRealtime() - this.Pm;
        xt.Td().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tp.EYQ.Pm.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                EYQ EYQ2;
                JSONObject jSONObjectOptJSONObject;
                synchronized (Pm.class) {
                    String strMZx = com.bytedance.sdk.openadsdk.multipro.Pm.Pm.mZx("tt_sdk_req_monitor", "req_monitor_data", null);
                    try {
                        if (TextUtils.isEmpty(strMZx)) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = new JSONObject(strMZx);
                        }
                    } catch (Exception e) {
                        pi.mZx(e.getMessage());
                    }
                    if (jSONObject.has(Pm.this.Td) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(Pm.this.Td)) != null) {
                        EYQ2 = EYQ.EYQ(jSONObjectOptJSONObject);
                        EYQ2.EYQ(Pm.this.HX, Pm.this.Kbd, Pm.this.VwS, Pm.this.QQ, Pm.this.MxO);
                        jSONObject.put(Pm.this.Td, EYQ2.EYQ());
                        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_sdk_req_monitor", "req_monitor_data", jSONObject.toString());
                    } else {
                        EYQ eyq = new EYQ(Pm.this.mZx, Pm.this.HX, Pm.this.Kbd, Pm.this.VwS, Pm.this.QQ, Pm.this.MxO);
                        EYQ2 = eyq;
                        jSONObject.put(Pm.this.Td, EYQ2.EYQ());
                        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_sdk_req_monitor", "req_monitor_data", jSONObject.toString());
                    }
                }
            }
        });
    }

    public static void Pm() {
        synchronized (Pm.class) {
            long jEYQ = com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_sdk_req_monitor", "req_monitor_las_req", 0L);
            if (jEYQ <= 0) {
                com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_sdk_req_monitor", "req_monitor_las_req", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (System.currentTimeMillis() - jEYQ >= SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                String strMZx = com.bytedance.sdk.openadsdk.multipro.Pm.Pm.mZx("tt_sdk_req_monitor", "req_monitor_data", null);
                if (!TextUtils.isEmpty(strMZx)) {
                    com.bytedance.sdk.openadsdk.tp.Td.Td(strMZx);
                    com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_sdk_req_monitor");
                    com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_sdk_req_monitor", "req_monitor_las_req", Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
    }

    /* compiled from: RequestMonitor.java */
    private static class EYQ {
        private int EYQ;
        private int IPb;
        private long Kbd;
        private long Pm;
        private final SparseIntArray QQ;
        private int Td;
        private int VwS;
        private int mZx;

        public EYQ() {
            this.EYQ = 0;
            this.mZx = 0;
            this.Td = 0;
            this.Pm = 0L;
            this.Kbd = 0L;
            this.IPb = 0;
            this.VwS = 0;
            this.QQ = new SparseIntArray();
        }

        public EYQ(int i, boolean z, long j, int i2, int i3, int i4) {
            this.EYQ = 0;
            this.mZx = 0;
            this.Td = 0;
            this.Pm = 0L;
            this.Kbd = 0L;
            this.IPb = 0;
            this.VwS = 0;
            SparseIntArray sparseIntArray = new SparseIntArray();
            this.QQ = sparseIntArray;
            this.EYQ = i;
            if (z) {
                this.mZx++;
                this.Pm = j;
            } else {
                this.Td++;
                this.Kbd = j;
                sparseIntArray.put(i4, 1);
            }
            this.IPb = i2;
            this.VwS = i3;
        }

        public void EYQ(boolean z, long j, int i, int i2, int i3) {
            if (!z) {
                this.QQ.put(i3, this.QQ.get(i3) + 1);
            }
            int i4 = this.mZx;
            int i5 = this.Td;
            int i6 = i4 + i5;
            int i7 = (this.IPb * i6) + i;
            int i8 = i6 + 1;
            this.IPb = i7 / i8;
            this.VwS = ((this.VwS * i6) + i2) / i8;
            if (z) {
                long j2 = (this.Pm * i4) + j;
                int i9 = i4 + 1;
                this.mZx = i9;
                this.Pm = j2 / i9;
                return;
            }
            long j3 = (this.Kbd * i5) + j;
            int i10 = i5 + 1;
            this.Td = i10;
            this.Kbd = j3 / i10;
        }

        public static EYQ EYQ(JSONObject jSONObject) {
            EYQ eyq = new EYQ();
            eyq.EYQ = jSONObject.optInt("type", 0);
            eyq.mZx = jSONObject.optInt("suc_times", 0);
            eyq.Td = jSONObject.optInt("fail_times", 0);
            eyq.Pm = jSONObject.optLong("suc_duration", 0L);
            eyq.Kbd = jSONObject.optLong("fail_duration", 0L);
            eyq.IPb = jSONObject.optInt("req_size", 0);
            eyq.VwS = jSONObject.optInt("res_size", 0);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("codes");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    eyq.QQ.put(Integer.parseInt(next), jSONObjectOptJSONObject.optInt(next));
                }
            }
            return eyq;
        }

        public JSONObject EYQ() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", this.EYQ);
                jSONObject.put("suc_times", this.mZx);
                jSONObject.put("fail_times", this.Td);
                jSONObject.put("suc_duration", this.Pm);
                jSONObject.put("fail_duration", this.Kbd);
                jSONObject.put("req_size", this.IPb);
                jSONObject.put("res_size", this.VwS);
                JSONObject jSONObject2 = new JSONObject();
                for (int i = 0; i < this.QQ.size(); i++) {
                    jSONObject2.put(String.valueOf(this.QQ.keyAt(i)), this.QQ.valueAt(i));
                }
                jSONObject.put("codes", jSONObject2);
            } catch (Exception e) {
                pi.mZx(e.getMessage());
            }
            return jSONObject;
        }
    }
}
