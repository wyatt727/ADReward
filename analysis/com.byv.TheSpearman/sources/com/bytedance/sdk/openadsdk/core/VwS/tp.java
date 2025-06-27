package com.bytedance.sdk.openadsdk.core.VwS;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ViewabilityVendor.java */
/* loaded from: classes2.dex */
public class tp {
    private final String EYQ;
    private final String Pm;
    private final String Td;
    private final URL mZx;

    private tp(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.EYQ = str2;
        this.mZx = new URL(str);
        this.Td = str3;
        this.Pm = str4;
    }

    public String EYQ() {
        return this.EYQ;
    }

    public String mZx() {
        return this.Td;
    }

    public URL Td() {
        return this.mZx;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp)) {
            return false;
        }
        tp tpVar = (tp) obj;
        if (EYQ(this.EYQ, tpVar.EYQ) && EYQ(this.mZx, tpVar.mZx) && EYQ(this.Td, tpVar.Td)) {
            return EYQ(this.Pm, tpVar.Pm);
        }
        return false;
    }

    public int hashCode() {
        String str = this.EYQ;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.mZx.hashCode()) * 31;
        String str2 = this.Td;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.Pm;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    private boolean EYQ(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public JSONObject Pm() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", CampaignEx.KEY_OMID);
            jSONObject.put("javascriptResourceUrl", this.mZx.toString());
            if (!TextUtils.isEmpty(this.EYQ)) {
                jSONObject.put("vendorKey", this.EYQ);
            }
            if (!TextUtils.isEmpty(this.Td)) {
                jSONObject.put("verificationParameters", this.Td);
            }
            if (!TextUtils.isEmpty(this.Pm)) {
                jSONObject.put("verificationNotExecuted", this.Pm);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static tp EYQ(String str, String str2, String str3, String str4, String str5) {
        if (CampaignEx.KEY_OMID.equalsIgnoreCase(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new tp(str2, str3, str4, str5);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static tp EYQ(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("apiFramework");
            String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new tp(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static Set<tp> EYQ(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray == null) {
            return hashSet;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                hashSet.add(EYQ(jSONArray.getJSONObject(i)));
            } catch (Throwable unused) {
            }
        }
        return hashSet;
    }
}
