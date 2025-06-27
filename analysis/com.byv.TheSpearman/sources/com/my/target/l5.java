package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.tracker.ads.AdFormat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class l5 {

    /* renamed from: a, reason: collision with root package name */
    public final a f4042a;
    public final s b;
    public final j c;
    public final Context d;
    public final y9 e;

    public interface a {
        q a(JSONObject jSONObject, s sVar, j jVar, n nVar, Context context);
    }

    public l5(a aVar, s sVar, j jVar, Context context) {
        this.f4042a = aVar;
        this.b = sVar;
        this.c = jVar;
        this.d = context;
        this.e = y9.a(sVar, jVar, context);
    }

    public static l5 a(a aVar, s sVar, j jVar, Context context) {
        return new l5(aVar, sVar, jVar, context);
    }

    public final f5 a(JSONObject jSONObject, n nVar) {
        JSONObject jSONObjectOptJSONObject;
        StringBuilder sb;
        String str;
        String string;
        String strOptString = jSONObject.optString("name");
        if (TextUtils.isEmpty(strOptString)) {
            string = "no name in mediationAdNetwork";
        } else {
            String strOptString2 = jSONObject.optString(com.json.t2.k);
            if (TextUtils.isEmpty(strOptString2)) {
                sb = new StringBuilder();
                str = "no placementId for ";
            } else {
                String strOptString3 = jSONObject.optString("adapter");
                if (!TextUtils.isEmpty(strOptString3)) {
                    f5 f5VarA = f5.a(strOptString, strOptString2, strOptString3);
                    if ("myTarget".equals(strOptString) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(AdFormat.BANNER)) != null) {
                        f5VarA.a(this.f4042a.a(jSONObjectOptJSONObject, this.b, this.c, nVar, this.d));
                    }
                    String strOptString4 = jSONObject.optString("payload");
                    if (!TextUtils.isEmpty(strOptString4)) {
                        f5VarA.a(strOptString4);
                    }
                    int iOptInt = jSONObject.optInt("timeout", f5VarA.i());
                    if (iOptInt > 0) {
                        f5VarA.a(iOptInt);
                    } else {
                        a("Bad value", "timeout <= 0 for " + strOptString + " mediationAdNetwork");
                    }
                    f5VarA.a((float) jSONObject.optDouble(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, f5VarA.f()));
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("params");
                    if (jSONObjectOptJSONObject2 != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (!TextUtils.isEmpty(next)) {
                                f5VarA.a(next, jSONObjectOptJSONObject2.optString(next));
                            }
                        }
                    }
                    this.e.a(f5VarA.h(), jSONObject, strOptString, -1.0f);
                    return f5VarA;
                }
                sb = new StringBuilder();
                str = "no adapter for ";
            }
            sb.append(str);
            sb.append(strOptString);
            sb.append(" mediationAdNetwork");
            string = sb.toString();
        }
        a("Required field", string);
        return null;
    }

    public final void a(String str, String str2) {
        String str3 = this.b.f4116a;
        z4 z4VarA = z4.a(str).e(str2).a(this.c.getSlotId());
        if (str3 == null) {
            str3 = this.b.b;
        }
        z4VarA.b(str3).b(this.d);
    }

    public e5 b(JSONObject jSONObject, n nVar) {
        f5 f5VarA;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("networks");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            e5 e5VarC = e5.c();
            int iOptInt = jSONObject.optInt("refreshTimeout", e5VarC.a());
            if (iOptInt >= 0) {
                e5VarC.a(iOptInt);
            } else {
                a("Bad value", "refreshTimeout < 0");
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (f5VarA = a(jSONObjectOptJSONObject, nVar)) != null) {
                    e5VarC.a(f5VarA);
                }
            }
            if (e5VarC.b()) {
                return e5VarC;
            }
        }
        nVar.a(m.u);
        return null;
    }
}
