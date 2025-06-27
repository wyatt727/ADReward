package com.json;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class jb {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1828a = "com.google.market";
    public static final String b = "com.android.vending";
    public static final String c = "isInstalled";
    private static final String d = "jb";
    private static final ArrayList<String> e = new a();

    class a extends ArrayList<String> {
        a() {
            add(jb.f1828a);
            add("com.android.vending");
        }
    }

    class b extends JSONObject {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f1829a;

        b(boolean z) throws JSONException {
            this.f1829a = z;
            put("isInstalled", z);
        }
    }

    private enum c {
        GOOGLE_PLAY(2, new String[]{"com.android.vending"}),
        GOOGLE_MARKET(4, new String[]{jb.f1828a}),
        SAMSUNG(5, new String[]{"com.sec.android.app.samsungapps"}),
        AMAZON(6, new String[]{"com.amazon.venezia"}),
        HUAWEI(7, new String[]{"com.huawei.appmarket"});

        private static final Map<String, c> h = new HashMap();

        /* renamed from: a, reason: collision with root package name */
        private final int f1830a;
        private final String[] b;

        static {
            for (c cVar : values()) {
                for (String str : cVar.d()) {
                    h.put(str, cVar);
                }
            }
        }

        c(int i2, String[] strArr) {
            this.f1830a = i2;
            this.b = strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<String> b() {
            return new ArrayList<>(h.keySet());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.f1830a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String[] d() {
            return this.b;
        }
    }

    private static JSONObject a(Context context) {
        return a(context, e);
    }

    private static JSONObject a(Context context, ArrayList<String> arrayList) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> arrayListB = b(context);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                jSONObject.put(next, a(arrayListB.contains(next.trim().toLowerCase(Locale.getDefault()))));
            }
        } catch (Exception unused) {
            Log.d(d, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    private static JSONObject a(boolean z) throws JSONException {
        return new b(z);
    }

    private static ArrayList<String> b(Context context) {
        List<ApplicationInfo> listO = ca.h().c().o(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo applicationInfo : listO) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase(Locale.getDefault()));
            }
        }
        return arrayList;
    }

    public static Integer c(Context context) throws JSONException {
        JSONObject jSONObjectA = a(context, c.b());
        int iPow = 0;
        for (c cVar : c.values()) {
            String[] strArrD = cVar.d();
            int length = strArrD.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(strArrD[i]);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                    iPow = (int) (iPow + Math.pow(2.0d, r5.c() - 1));
                    break;
                }
                i++;
            }
        }
        return Integer.valueOf(iPow);
    }

    public static boolean d(Context context) {
        JSONObject jSONObjectA = a(context);
        Iterator<String> itKeys = jSONObjectA.keys();
        while (itKeys.hasNext()) {
            JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(itKeys.next());
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }
}
