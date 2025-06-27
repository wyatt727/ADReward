package com.mbridge.msdk.mbbid.common;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class BidResponsedEx extends BidResponsed {
    public static final String KEY_CID = "cid";
    public static final String KEY_MACORS = "macors";
    public static final String TAG = "BidResponsedEx";
    private String cid;

    public static String decodePrice(String str) {
        return str;
    }

    public void setLn(String str) {
        this.ln = str;
    }

    public void setWn(String str) {
        this.wn = str;
    }

    public String getCid() {
        return this.cid;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public static BidResponsedEx parseBidResponsedEx(JSONObject jSONObject, String str) {
        BidResponsedEx bidResponsedEx = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            BidResponsedEx bidResponsedEx2 = new BidResponsedEx();
            try {
                bidResponsedEx2.setBidId(jSONObject.optString("bid"));
                bidResponsedEx2.setCur(jSONObject.optString(BidResponsed.KEY_CUR));
                bidResponsedEx2.setPrice(jSONObject.optString("price"));
                bidResponsedEx2.setCid(jSONObject.optString("cid"));
                bidResponsedEx2.setBidToken(jSONObject.optString("token"));
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(KEY_MACORS);
                String strOptString = jSONObject.optString(BidResponsed.KEY_LN);
                String strOptString2 = jSONObject.optString(BidResponsed.KEY_WN);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string = jSONObjectOptJSONObject.getString(next);
                        strOptString = replaceUrl(strOptString, next, string);
                        strOptString2 = replaceUrl(strOptString2, next, string);
                    }
                }
                bidResponsedEx2.setLn(strOptString);
                bidResponsedEx2.setWn(strOptString2);
                return bidResponsedEx2;
            } catch (Throwable th) {
                th = th;
                bidResponsedEx = bidResponsedEx2;
                ad.b(TAG, th.getMessage());
                return bidResponsedEx;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String replaceUrl(String str, String str2, String str3) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return str;
            }
            return str.replaceAll("\\{" + str2 + "\\}", str3);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}
