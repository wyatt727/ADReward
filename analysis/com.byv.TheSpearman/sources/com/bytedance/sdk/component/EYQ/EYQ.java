package com.bytedance.sdk.component.EYQ;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.EYQ.VwS;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AbstractBridge.java */
/* loaded from: classes2.dex */
public abstract class EYQ {
    protected Context EYQ;
    protected String Kbd;
    protected QQ Td;
    VwS VwS;
    protected pi mZx;
    protected Handler Pm = new Handler(Looper.getMainLooper());
    protected volatile boolean IPb = false;
    private final Map<String, VwS> QQ = new HashMap();

    protected abstract Context EYQ(tp tpVar);

    protected abstract String EYQ();

    protected abstract void EYQ(String str);

    protected abstract void mZx(tp tpVar);

    protected EYQ() {
    }

    protected void invokeMethod(final String str) {
        if (this.IPb) {
            return;
        }
        this.Pm.post(new Runnable() { // from class: com.bytedance.sdk.component.EYQ.EYQ.1
            @Override // java.lang.Runnable
            public void run() {
                if (EYQ.this.IPb) {
                    return;
                }
                hu huVarEYQ = null;
                try {
                    huVarEYQ = EYQ.this.EYQ(new JSONObject(str));
                } catch (Exception unused) {
                }
                if (hu.EYQ(huVarEYQ)) {
                    Objects.toString(huVarEYQ);
                    if (huVarEYQ != null) {
                        EYQ.this.mZx(tPj.EYQ(new Uc(huVarEYQ.EYQ, "Failed to parse invocation.")), huVarEYQ);
                        return;
                    }
                    return;
                }
                EYQ.this.EYQ(huVarEYQ);
            }
        });
    }

    protected void EYQ(String str, hu huVar) {
        EYQ(str);
    }

    protected void mZx() {
        this.VwS.EYQ();
        Iterator<VwS> it = this.QQ.values().iterator();
        while (it.hasNext()) {
            it.next().EYQ();
        }
        this.Pm.removeCallbacksAndMessages(null);
        this.IPb = true;
    }

    protected final void EYQ(hu huVar) {
        String strEYQ;
        if (this.IPb || (strEYQ = EYQ()) == null) {
            return;
        }
        VwS vwSMZx = mZx(huVar.VwS);
        if (vwSMZx == null) {
            Objects.toString(huVar);
            if (this.mZx != null) {
                EYQ();
            }
            mZx(tPj.EYQ(new Uc(-4, "Namespace " + huVar.VwS + " unknown.")), huVar);
            return;
        }
        IPb iPb = new IPb();
        iPb.mZx = strEYQ;
        iPb.EYQ = this.EYQ;
        iPb.Td = vwSMZx;
        try {
            VwS.EYQ EYQ = vwSMZx.EYQ(huVar, iPb);
            if (EYQ == null) {
                Objects.toString(huVar);
                if (this.mZx != null) {
                    EYQ();
                }
                mZx(tPj.EYQ(new Uc(-2, "Function " + huVar.Pm + " is not registered.")), huVar);
                return;
            }
            if (EYQ.EYQ) {
                mZx(EYQ.mZx, huVar);
            }
            if (this.mZx != null) {
                EYQ();
            }
        } catch (Exception e) {
            Objects.toString(huVar);
            mZx(tPj.EYQ(e), huVar);
        }
    }

    final void EYQ(tp tpVar, WU wu) {
        this.EYQ = EYQ(tpVar);
        this.Td = tpVar.Pm;
        this.mZx = tpVar.HX;
        this.VwS = new VwS(tpVar, this, wu);
        this.Kbd = tpVar.MxO;
        mZx(tpVar);
    }

    final void mZx(String str, hu huVar) {
        JSONObject jSONObject;
        if (this.IPb || TextUtils.isEmpty(huVar.IPb)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            HX.EYQ(new IllegalArgumentException("Illegal callback data: ".concat(String.valueOf(str))));
        }
        String str2 = huVar.IPb;
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        EYQ(KO.EYQ().EYQ("__msg_type", "callback").EYQ("__callback_id", huVar.IPb).EYQ("__params", jSONObject).mZx(), huVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public hu EYQ(JSONObject jSONObject) throws JSONException {
        String strOptString;
        if (this.IPb) {
            return null;
        }
        String strOptString2 = jSONObject.optString("__callback_id");
        String strOptString3 = jSONObject.optString("func");
        if (EYQ() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String strValueOf = "";
            try {
                Object objOpt = jSONObject.opt("params");
                if (objOpt == null) {
                    strOptString = strValueOf;
                } else if (objOpt instanceof JSONObject) {
                    strOptString = String.valueOf((JSONObject) objOpt);
                } else {
                    if (objOpt instanceof String) {
                        strValueOf = (String) objOpt;
                    } else {
                        strValueOf = String.valueOf(objOpt);
                    }
                    strOptString = strValueOf;
                }
            } catch (Throwable unused) {
                strOptString = jSONObject.optString("params");
            }
            String string2 = jSONObject.getString("JSSDK");
            String strOptString4 = jSONObject.optString("namespace");
            return hu.EYQ().EYQ(string2).mZx(string).Td(strOptString3).Pm(strOptString).Kbd(strOptString2).IPb(strOptString4).VwS(jSONObject.optString("__iframe_url")).EYQ();
        } catch (JSONException unused2) {
            return hu.EYQ(strOptString2, -1);
        }
    }

    private VwS mZx(String str) {
        if (TextUtils.equals(str, this.Kbd) || TextUtils.isEmpty(str)) {
            return this.VwS;
        }
        return this.QQ.get(str);
    }
}
