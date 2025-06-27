package com.mbridge.msdk.video.bt.a;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.bt.a.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: HandlerH5MessageManager.java */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    int f3566a;
    int b;
    private String c;

    private c() {
        this.c = "handlerNativeResult";
        this.f3566a = 0;
        this.b = 1;
    }

    /* compiled from: HandlerH5MessageManager.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static c f3567a = new c();
    }

    public static c a() {
        return a.f3567a;
    }

    public final void a(Object obj, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String strOptString = jSONObject.optString("uniqueIdentifier");
                    String strOptString2 = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                        int iOptInt = 0;
                        if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.toString())) {
                            iOptInt = jSONObjectOptJSONObject.optInt("type", 0);
                        }
                        a(this.f3566a, "receivedMessage", obj);
                        if (strOptString.equalsIgnoreCase("reporter")) {
                            com.mbridge.msdk.mbsignalcommon.a.a.a().a(obj, strOptString2, jSONArrayOptJSONArray, iOptInt);
                            return;
                        } else {
                            if (strOptString.equalsIgnoreCase("MediaPlayer")) {
                                b unused = b.a.f3565a;
                                return;
                            }
                            return;
                        }
                    }
                    a(this.b, "module or method is null", obj);
                    return;
                }
            } catch (Exception e) {
                ad.a("HandlerH5MessageManager", e.getMessage());
                a(this.b, e.getMessage(), obj);
                return;
            } catch (Throwable th) {
                ad.a("HandlerH5MessageManager", th.getMessage());
                a(this.b, th.getMessage(), obj);
                return;
            }
        }
        a(this.b, "params is null", obj);
    }

    private void a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("message", str);
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            ad.a("HandlerH5MessageManager", e.getMessage());
        } catch (Throwable th) {
            ad.a("HandlerH5MessageManager", th.getMessage());
        }
    }
}
