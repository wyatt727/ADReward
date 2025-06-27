package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.my.target.o5;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class y6 extends o<a7> {
    public static o<a7> a() {
        return new y6();
    }

    public a7 a(String str, s sVar, a7 a7Var, j jVar, o5.a aVar, o5 o5Var, List<String> list, n nVar, Context context) {
        m mVar;
        int i;
        JSONObject jSONObjectA = o.a(str, aVar, o5Var, list, nVar);
        if (jSONObjectA == null) {
            mVar = m.j;
        } else {
            JSONArray jSONArrayNames = jSONObjectA.names();
            if (jSONArrayNames == null) {
                mVar = m.i;
            } else {
                b7 b7VarA = b7.a(sVar, jVar, context);
                boolean z = false;
                a7 a7VarA = a7Var;
                int i2 = 0;
                while (true) {
                    if (i2 >= jSONArrayNames.length()) {
                        break;
                    }
                    String strOptString = jSONArrayNames.optString(i2);
                    if ("appwall".equals(strOptString) || "showcaseApps".equals(strOptString) || "showcaseGames".equals(strOptString) || "showcase".equals(strOptString)) {
                        i = i2;
                        a7VarA = a(strOptString, jSONObjectA, b7VarA, sVar, jVar, context);
                        if (a7VarA != null && !a7VarA.c().isEmpty()) {
                            z = true;
                            break;
                        }
                    } else {
                        i = i2;
                    }
                    i2 = i + 1;
                }
                if (z) {
                    a7VarA.a(sVar.E());
                    a7VarA.a(jSONObjectA);
                    return a7VarA;
                }
                mVar = m.m;
            }
        }
        nVar.a(mVar);
        return null;
    }

    public final a7 a(String str, JSONObject jSONObject, b7 b7Var, s sVar, j jVar, Context context) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("banners")) == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        a7 a7VarB = a7.b(str);
        b7Var.a(jSONObjectOptJSONObject, a7VarB);
        v6 v6VarA = v6.a(a7VarB, sVar, jVar, context);
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject2 != null) {
                u6 u6VarNewBanner = u6.newBanner();
                v6VarA.a(jSONObjectOptJSONObject2, u6VarNewBanner);
                String bundleId = u6VarNewBanner.getBundleId();
                if (!TextUtils.isEmpty(bundleId)) {
                    u6VarNewBanner.setAppInstalled(a(context, bundleId));
                }
                a7VarB.a(u6VarNewBanner);
            }
        }
        return a7VarB;
    }

    @Override // com.my.target.o
    public /* bridge */ /* synthetic */ q a(String str, s sVar, q qVar, j jVar, o5.a aVar, o5 o5Var, List list, n nVar, Context context) {
        return a(str, sVar, (a7) qVar, jVar, aVar, o5Var, (List<String>) list, nVar, context);
    }

    public final boolean a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return false;
        }
        List<ResolveInfo> listQueryIntentActivities = null;
        try {
            listQueryIntentActivities = packageManager.queryIntentActivities(launchIntentForPackage, 65536);
        } catch (Throwable unused) {
        }
        return (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }
}
