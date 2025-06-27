package com.applovin.impl;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes.dex */
abstract class g3 {
    private static String a(String str) {
        return str.replace(SignatureVisitor.EXTENDS, SignatureVisitor.SUPER).replace('/', '_');
    }

    public static byte[] a(byte[] bArr) {
        return yp.f1214a >= 27 ? bArr : yp.c(a(yp.a(bArr)));
    }

    private static String b(String str) {
        return str.replace(SignatureVisitor.SUPER, SignatureVisitor.EXTENDS).replace('_', '/');
    }

    public static byte[] b(byte[] bArr) throws JSONException {
        if (yp.f1214a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(yp.a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(b(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K)));
                sb.append("\",\"kid\":\"");
                sb.append(b(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return yp.c(sb.toString());
        } catch (JSONException e) {
            kc.a("ClearKeyUtil", "Failed to adjust response data: " + yp.a(bArr), e);
            return bArr;
        }
    }
}
