package com.bytedance.sdk.openadsdk.mZx;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.utils.hYh;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdEvent.java */
/* loaded from: classes2.dex */
public class EYQ implements com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ.mZx {
    private static final Set<String> tp = new HashSet(Arrays.asList("insight_log"));
    public final String EYQ;
    private int HX;
    private final String IPb;
    private String KO;
    private long Kbd;
    private final AtomicBoolean MxO;
    private String NZ;
    private long Pm;
    private int QQ;
    private boolean Td;
    private String UB;
    private String Uc;
    private int VwS;
    private String WU;
    private int XN;
    private com.bytedance.sdk.openadsdk.mZx.mZx.EYQ hYh;
    private String hu;
    protected final JSONObject mZx;
    private String nWX;
    private String pi;
    private JSONObject tsL;
    private String zF;

    public EYQ(String str, JSONObject jSONObject) {
        this.IPb = "adiff";
        this.MxO = new AtomicBoolean(false);
        this.tsL = new JSONObject();
        this.EYQ = str;
        this.mZx = jSONObject;
    }

    private void IPb() {
        JSONObject jSONObject = this.tsL;
        if (jSONObject == null) {
            if (!EYQ(this.hu, this.KO, this.WU)) {
                return;
            }
        } else {
            String strOptString = jSONObject.optString("value");
            String strOptString2 = this.tsL.optString("category");
            String strOptString3 = this.tsL.optString("log_extra");
            if (EYQ(this.hu, this.KO, this.WU)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !mZx(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, "0")) && (TextUtils.isEmpty(this.hu) || TextUtils.equals(this.hu, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.KO) || !mZx(this.KO)) && (TextUtils.isEmpty(strOptString2) || !mZx(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.WU) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        }
        this.Pm = com.bytedance.sdk.openadsdk.mZx.EYQ.Pm.EYQ.incrementAndGet();
    }

    private boolean mZx(String str) {
        str.hashCode();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private boolean EYQ(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.hashCode();
        switch (str2) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    public JSONObject Td() {
        if (this.MxO.get()) {
            return this.mZx;
        }
        try {
            VwS();
            com.bytedance.sdk.openadsdk.mZx.mZx.EYQ eyq = this.hYh;
            if (eyq != null) {
                eyq.EYQ(this.mZx);
            }
            if (this.mZx.has("ad_extra_data")) {
                Object objOpt = this.mZx.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            com.bytedance.sdk.component.utils.pi.EYQ("AdEvent", "ad_extra_data is JSONObject");
                            if (!((JSONObject) objOpt).has("adiff")) {
                                ((JSONObject) objOpt).put("adiff", this.EYQ);
                            }
                            if (this.Td) {
                                if (!((JSONObject) objOpt).has("interaction_method")) {
                                    ((JSONObject) objOpt).put("interaction_method", this.VwS);
                                }
                                if (!((JSONObject) objOpt).has("real_interaction_method")) {
                                    ((JSONObject) objOpt).put("real_interaction_method", this.QQ);
                                }
                                if (!((JSONObject) objOpt).has("image_mode")) {
                                    ((JSONObject) objOpt).put("image_mode", this.HX);
                                }
                            }
                            this.mZx.put("ad_extra_data", objOpt.toString());
                        } else if (objOpt instanceof String) {
                            JSONObject jSONObject = new JSONObject((String) objOpt);
                            if (!jSONObject.has("adiff")) {
                                jSONObject.put("adiff", this.EYQ);
                            }
                            if (this.Td) {
                                if (!jSONObject.has("interaction_method")) {
                                    jSONObject.put("interaction_method", this.VwS);
                                }
                                if (!jSONObject.has("real_interaction_method")) {
                                    jSONObject.put("real_interaction_method", this.QQ);
                                }
                                if (!jSONObject.has("image_mode")) {
                                    jSONObject.put("image_mode", this.HX);
                                }
                            }
                            this.mZx.put("ad_extra_data", jSONObject.toString());
                        }
                    } catch (JSONException e) {
                        com.bytedance.sdk.component.utils.pi.EYQ("AdEvent", "json error", e.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("adiff", this.EYQ);
                    if (this.Td) {
                        jSONObject2.put("interaction_method", this.VwS);
                        jSONObject2.put("real_interaction_method", this.QQ);
                        jSONObject2.put("image_mode", this.HX);
                    }
                    this.mZx.put("ad_extra_data", jSONObject2.toString());
                } catch (JSONException e2) {
                    com.bytedance.sdk.component.utils.pi.EYQ("AdEvent", "json error", e2.getMessage());
                }
            }
            this.MxO.set(true);
        } catch (Throwable unused) {
        }
        return this.mZx;
    }

    public JSONObject EYQ(boolean z) {
        JSONObject jSONObjectTd = Td();
        try {
            if (z) {
                JSONObject jSONObject = new JSONObject(jSONObjectTd.toString());
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                if (jSONObjectOptJSONObject != null) {
                    jSONObjectOptJSONObject.remove("app_log_url");
                }
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(jSONObjectTd.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.pi.EYQ("AdEvent", e.getMessage());
            return jSONObjectTd;
        }
    }

    private void VwS() throws JSONException {
        this.mZx.putOpt("app_log_url", this.NZ);
        this.mZx.putOpt("tag", this.pi);
        this.mZx.putOpt("label", this.nWX);
        this.mZx.putOpt("category", this.KO);
        if (!TextUtils.isEmpty(this.hu)) {
            try {
                this.mZx.putOpt("value", Long.valueOf(Long.parseLong(this.hu)));
            } catch (NumberFormatException unused) {
                this.mZx.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.Uc)) {
            try {
                this.mZx.putOpt("ext_value", Long.valueOf(Long.parseLong(this.Uc)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.WU)) {
            this.mZx.putOpt("log_extra", this.WU);
        }
        if (!TextUtils.isEmpty(this.zF)) {
            try {
                this.mZx.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.zF)));
            } catch (NumberFormatException unused3) {
            }
        }
        EYQ(this.mZx, this.nWX);
        try {
            this.mZx.putOpt("nt", Integer.valueOf(this.XN));
        } catch (Exception unused4) {
        }
        Iterator<String> itKeys = this.tsL.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.mZx.putOpt(next, this.tsL.opt(next));
        }
    }

    public String Pm() {
        return this.EYQ;
    }

    EYQ(C0131EYQ c0131eyq) throws JSONException {
        this.IPb = "adiff";
        this.MxO = new AtomicBoolean(false);
        this.tsL = new JSONObject();
        if (TextUtils.isEmpty(c0131eyq.mZx)) {
            this.EYQ = hYh.EYQ();
        } else {
            this.EYQ = c0131eyq.mZx;
        }
        this.hYh = c0131eyq.KO;
        this.WU = c0131eyq.IPb;
        this.pi = c0131eyq.Td;
        this.nWX = c0131eyq.Pm;
        if (TextUtils.isEmpty(c0131eyq.Kbd)) {
            this.KO = "app_union";
        } else {
            this.KO = c0131eyq.Kbd;
        }
        this.zF = c0131eyq.MxO;
        this.hu = c0131eyq.QQ;
        this.Uc = c0131eyq.HX;
        this.UB = c0131eyq.VwS;
        this.XN = c0131eyq.tsL;
        this.NZ = c0131eyq.pi;
        this.tsL = c0131eyq.tp = c0131eyq.tp != null ? c0131eyq.tp : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.mZx = jSONObject;
        if (!TextUtils.isEmpty(c0131eyq.pi)) {
            try {
                jSONObject.put("app_log_url", c0131eyq.pi);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.pi.EYQ("AdEvent", e.getMessage());
            }
        }
        this.VwS = c0131eyq.UB;
        this.QQ = c0131eyq.Uc;
        this.HX = c0131eyq.EYQ;
        this.Td = c0131eyq.hYh;
        this.Kbd = System.currentTimeMillis();
        IPb();
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ.mZx
    public JSONObject EYQ(String str) {
        return Td();
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ.mZx
    public long EYQ() {
        return this.Kbd;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ.mZx
    public long mZx() {
        return this.Pm;
    }

    /* compiled from: AdEvent.java */
    /* renamed from: com.bytedance.sdk.openadsdk.mZx.EYQ$EYQ, reason: collision with other inner class name */
    public static final class C0131EYQ {
        public int EYQ;
        private String HX;
        private String IPb;
        private com.bytedance.sdk.openadsdk.mZx.mZx.EYQ KO;
        private String Kbd;
        private String MxO;
        private String Pm;
        private String QQ;
        private String Td;
        private int UB;
        private int Uc;
        private String VwS;
        private boolean hYh;
        private final long hu;
        private String mZx;
        private com.bytedance.sdk.openadsdk.mZx.mZx.mZx nWX;
        private String pi;
        private JSONObject tp;
        private final int tsL;

        public C0131EYQ(long j, UB ub) {
            this.UB = -1;
            this.Uc = -1;
            this.EYQ = -1;
            if (ub != null) {
                this.hYh = zF.mZx(ub);
                this.UB = ub.KO();
                this.Uc = ub.nWX();
                this.EYQ = ub.by();
            }
            this.hu = j;
            this.tsL = com.bytedance.sdk.component.utils.hu.Td(com.bytedance.sdk.openadsdk.core.hu.EYQ());
        }

        public C0131EYQ EYQ(String str) {
            this.pi = str;
            return this;
        }

        public C0131EYQ mZx(String str) {
            this.Td = str;
            return this;
        }

        public C0131EYQ Td(String str) {
            this.Pm = str;
            return this;
        }

        public C0131EYQ Pm(String str) {
            this.Kbd = str;
            return this;
        }

        public C0131EYQ Kbd(String str) {
            this.IPb = str;
            return this;
        }

        public C0131EYQ IPb(String str) {
            this.QQ = str;
            return this;
        }

        public C0131EYQ VwS(String str) {
            this.HX = str;
            return this;
        }

        public C0131EYQ EYQ(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.tp = jSONObject;
            return this;
        }

        public C0131EYQ QQ(String str) {
            this.VwS = str;
            return this;
        }

        public void EYQ(com.bytedance.sdk.openadsdk.mZx.mZx.EYQ eyq) {
            this.KO = eyq;
            final EYQ eyq2 = new EYQ(this);
            try {
                com.bytedance.sdk.openadsdk.mZx.mZx.mZx mzx = this.nWX;
                if (mzx != null) {
                    mzx.EYQ(eyq2.mZx, this.hu);
                } else {
                    new com.bytedance.sdk.openadsdk.mZx.mZx.Td().EYQ(eyq2.mZx, this.hu);
                }
            } catch (Throwable unused) {
            }
            if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                xt.Td(new com.bytedance.sdk.component.VwS.QQ("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.mZx.EYQ.EYQ.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.mZx.EYQ.Pm.EYQ(eyq2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.mZx.EYQ.Pm.EYQ(eyq2);
            }
        }
    }

    public boolean Kbd() {
        Set<String> setNWX;
        if (this.mZx == null || (setNWX = com.bytedance.sdk.openadsdk.core.hu.Pm().nWX()) == null) {
            return false;
        }
        String strOptString = this.mZx.optString("label");
        if (TextUtils.isEmpty(strOptString)) {
            if (TextUtils.isEmpty(this.nWX)) {
                return false;
            }
            return setNWX.contains(this.nWX);
        }
        return setNWX.contains(strOptString);
    }

    private static void EYQ(JSONObject jSONObject, String str) {
        try {
            Set<String> set = tp;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("AdEvent", th);
        }
    }
}
