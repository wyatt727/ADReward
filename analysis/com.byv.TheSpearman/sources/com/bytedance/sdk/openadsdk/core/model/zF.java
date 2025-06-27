package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PlayableModel.java */
/* loaded from: classes2.dex */
public class zF {
    private int EYQ;
    private int HX;
    private String IPb;
    private String Kbd;
    private int Pm;
    private int QQ;
    private boolean Td;
    private int VwS;
    private int mZx;
    private boolean tp;

    public static int EYQ(int i) {
        return i + 10;
    }

    public static boolean VwS(UB ub) {
        return true;
    }

    private static int mZx(int i) {
        return i == 1 ? 10 : 5;
    }

    public zF(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.Td = jSONObject.optBoolean("is_playable");
        this.Pm = jSONObject.optInt("playable_type", 0);
        this.Kbd = jSONObject.optString("playable_style");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
        if (jSONObjectOptJSONObject != null) {
            this.IPb = jSONObjectOptJSONObject.optString("playable_url", "");
            this.VwS = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
            this.mZx = jSONObjectOptJSONObject.optInt("new_style", 0);
            this.EYQ = jSONObjectOptJSONObject.optInt("close_2_app", 0);
            int iMZx = mZx(this.Pm);
            this.QQ = jSONObjectOptJSONObject.optInt("playable_webview_timeout", iMZx);
            this.HX = jSONObjectOptJSONObject.optInt("playable_js_timeout", iMZx);
            this.tp = jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1;
        }
    }

    public static int EYQ(UB ub) {
        int i;
        zF zFVarPi = ub.pi();
        if (zFVarPi != null && (i = zFVarPi.EYQ) >= 0 && i <= 100) {
            return i;
        }
        return 0;
    }

    public void EYQ(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("is_playable", this.Td);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.pi.EYQ("PlayableModel", e.getMessage());
        }
        if (!TextUtils.isEmpty(this.IPb)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.IPb);
                jSONObject2.put("playable_orientation", this.VwS);
                jSONObject2.put("new_style", this.mZx);
                jSONObject2.put("close_2_app", this.EYQ);
                jSONObject2.put("playable_webview_timeout", this.QQ);
                jSONObject2.put("playable_js_timeout", this.HX);
                jSONObject2.put("playable_backup_enable", this.tp ? 1 : 0);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.pi.EYQ("PlayableModel", e2.getMessage());
            }
        }
        try {
            jSONObject.put("playable_type", this.Pm);
        } catch (JSONException e3) {
            com.bytedance.sdk.component.utils.pi.EYQ("PlayableModel", e3.getMessage());
        }
        try {
            jSONObject.put("playable_style", this.Kbd);
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.pi.EYQ("PlayableModel", e4.getMessage());
        }
    }

    private static zF UB(UB ub) {
        if (ub == null) {
            return null;
        }
        return ub.pi();
    }

    public static boolean mZx(UB ub) {
        zF zFVarUB = UB(ub);
        return (zFVarUB == null || !zFVarUB.Td || TextUtils.isEmpty(IPb(ub))) ? false : true;
    }

    public static boolean Td(UB ub) {
        zF zFVarPi = ub.pi();
        return zFVarPi != null && zFVarPi.Td && zFVarPi.mZx == 1;
    }

    private static int Uc(UB ub) {
        zF zFVarUB = UB(ub);
        if (zFVarUB == null) {
            return 0;
        }
        return zFVarUB.Pm;
    }

    public static String Pm(UB ub) {
        zF zFVarUB = UB(ub);
        if (zFVarUB == null) {
            return null;
        }
        return zFVarUB.Kbd;
    }

    public static String Kbd(UB ub) {
        zF zFVarUB = UB(ub);
        if (zFVarUB == null) {
            return null;
        }
        return zFVarUB.IPb;
    }

    public static String IPb(UB ub) {
        if (ub == null) {
            return null;
        }
        zF zFVarPi = ub.pi();
        if (zFVarPi != null && zFVarPi.Td) {
            String str = zFVarPi.IPb;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (ub.nWX() == 20) {
            return ub.XPd();
        }
        if (ub.mN() != null) {
            return ub.mN().tsL();
        }
        return null;
    }

    public static boolean QQ(UB ub) {
        return ((ub == null || ub.mN() == null) ? 0 : ub.mN().zF()) != 1;
    }

    public static boolean HX(UB ub) {
        com.bykv.vk.openvk.component.video.api.Td.mZx mzxMN = ub.mN();
        return mzxMN != null && mzxMN.zF() == 1;
    }

    public static int tp(UB ub) {
        zF zFVarUB = UB(ub);
        if (zFVarUB == null) {
            return 0;
        }
        return zFVarUB.VwS;
    }

    public static boolean MxO(UB ub) {
        return mZx(ub) && Uc(ub) == 1;
    }

    public static boolean tsL(UB ub) {
        return mZx(ub) && Uc(ub) == 0;
    }

    public int EYQ() {
        return this.QQ;
    }

    public int mZx() {
        return this.HX;
    }

    public boolean Td() {
        return this.tp;
    }

    public static long pi(UB ub) {
        return Math.max(nWX(ub), KO(ub));
    }

    public static long nWX(UB ub) {
        if (UB(ub) == null) {
            return 5L;
        }
        return r2.EYQ();
    }

    public static long KO(UB ub) {
        if (UB(ub) == null) {
            return 5L;
        }
        return r2.mZx();
    }

    public static boolean hu(UB ub) {
        zF zFVarUB = UB(ub);
        return zFVarUB != null && zFVarUB.Td();
    }
}
