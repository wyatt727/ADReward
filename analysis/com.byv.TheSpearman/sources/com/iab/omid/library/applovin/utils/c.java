package com.iab.omid.library.applovin.utils;

import android.content.Context;
import android.content.res.Resources;
import android.view.WindowManager;
import com.iab.omid.library.applovin.adsession.OutputDeviceStatus;
import com.iab.omid.library.applovin.walking.a;
import com.json.t2;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static WindowManager f1471a;
    private static String[] b = {"x", "y", "width", "height"};
    static float c = Resources.getSystem().getDisplayMetrics().density;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1472a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f1472a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final float f1473a;
        final float b;

        b(float f, float f2) {
            this.f1473a = f;
            this.b = f2;
        }
    }

    static float a(int i) {
        return i / c;
    }

    public static void b(JSONObject jSONObject) throws JSONException {
        b bVarA = a(jSONObject);
        try {
            jSONObject.put("width", bVarA.f1473a);
            jSONObject.put("height", bVarA.b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!jSONArrayOptJSONArray.optString(i, "").equals(jSONArrayOptJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.iab.omid.library.applovin.utils.c.b a(org.json.JSONObject r13) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 0
            r3 = 17
            if (r0 < r3) goto L27
            android.view.WindowManager r13 = com.iab.omid.library.applovin.utils.c.f1471a
            if (r13 == 0) goto L66
            android.graphics.Point r13 = new android.graphics.Point
            r13.<init>(r2, r2)
            android.view.WindowManager r0 = com.iab.omid.library.applovin.utils.c.f1471a
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getRealSize(r13)
            int r0 = r13.x
            float r1 = a(r0)
            int r13 = r13.y
            float r13 = a(r13)
            goto L67
        L27:
            java.lang.String r0 = "childViews"
            org.json.JSONArray r13 = r13.optJSONArray(r0)
            if (r13 == 0) goto L66
            int r0 = r13.length()
            r3 = r2
            r2 = r1
        L35:
            if (r3 >= r0) goto L64
            org.json.JSONObject r4 = r13.optJSONObject(r3)
            if (r4 == 0) goto L61
            java.lang.String r5 = "x"
            double r5 = r4.optDouble(r5)
            java.lang.String r7 = "y"
            double r7 = r4.optDouble(r7)
            java.lang.String r9 = "width"
            double r9 = r4.optDouble(r9)
            java.lang.String r11 = "height"
            double r11 = r4.optDouble(r11)
            double r5 = r5 + r9
            float r4 = (float) r5
            float r1 = java.lang.Math.max(r1, r4)
            double r7 = r7 + r11
            float r4 = (float) r7
            float r2 = java.lang.Math.max(r2, r4)
        L61:
            int r3 = r3 + 1
            goto L35
        L64:
            r13 = r2
            goto L67
        L66:
            r13 = r1
        L67:
            com.iab.omid.library.applovin.utils.c$b r0 = new com.iab.omid.library.applovin.utils.c$b
            r0.<init>(r1, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iab.omid.library.applovin.utils.c.a(org.json.JSONObject):com.iab.omid.library.applovin.utils.c$b");
    }

    public static void b(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            d.a("Error with setting not visible reason", e);
        }
    }

    public static JSONObject a(int i, int i2, int i3, int i4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i));
            jSONObject.put("y", a(i2));
            jSONObject.put("width", a(i3));
            jSONObject.put("height", a(i4));
        } catch (JSONException e) {
            d.a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!h(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    public static void a(Context context) {
        if (context != null) {
            c = context.getResources().getDisplayMetrics().density;
            f1471a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) throws JSONException {
        try {
            jSONObject.put("noOutputDevice", a(outputDeviceStatus));
        } catch (JSONException e) {
            d.a("Error with setting output device status", e);
        }
    }

    public static void a(JSONObject jSONObject, a.C0210a c0210a) throws JSONException {
        com.iab.omid.library.applovin.internal.e eVarA = c0210a.a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = c0210a.b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", eVarA.d());
            jSONObject.put("friendlyObstructionPurpose", eVarA.b());
            jSONObject.put("friendlyObstructionReason", eVarA.a());
        } catch (JSONException e) {
            d.a("Error with setting friendly obstruction", e);
        }
    }

    public static void a(JSONObject jSONObject, Boolean bool) throws JSONException {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            d.a("Error with setting has window focus", e);
        }
    }

    public static void a(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            d.a("Error with setting ad session id", e);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            d.a("JSONException during JSONObject.put for name [" + str + t2.i.e, e);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static boolean a(OutputDeviceStatus outputDeviceStatus) {
        return a.f1472a[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
