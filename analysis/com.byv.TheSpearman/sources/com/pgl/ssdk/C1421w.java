package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.view.MotionEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pgl.ssdk.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1421w {

    /* renamed from: a, reason: collision with root package name */
    private static int f4324a = 0;
    private static int b = 0;
    private static int c = 0;
    private static int d = 0;
    private static int e = 0;
    private static int f = 0;
    private static boolean g = false;
    private static InputManager h;

    static /* synthetic */ int a() {
        int i = c;
        c = i + 1;
        return i;
    }

    static InputManager a(Context context) {
        if (h == null) {
            h = (InputManager) context.getSystemService("input");
        }
        return h;
    }

    public static void a(MotionEvent motionEvent, Context context) {
        if (motionEvent == null || context == null) {
            return;
        }
        if (motionEvent.getRawX() > 0.0f || motionEvent.getRawY() > 0.0f) {
            AbstractC1403d.a(new RunnableC1420v(context, motionEvent.getDeviceId()));
        }
    }

    public static void a(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("vihc", d);
            jSONObject.put("eihc", e);
            jSONObject.put("nihc", f);
            jSONObject.put("vic", f4324a);
            jSONObject.put("nic", c);
            jSONObject.put("eic", b);
        } catch (JSONException unused) {
        }
    }

    static /* synthetic */ int b() {
        int i = f;
        f = i + 1;
        return i;
    }

    static /* synthetic */ int c() {
        int i = f4324a;
        f4324a = i + 1;
        return i;
    }

    static /* synthetic */ int d() {
        int i = d;
        d = i + 1;
        return i;
    }

    static /* synthetic */ int e() {
        int i = b;
        b = i + 1;
        return i;
    }

    static /* synthetic */ int f() {
        int i = e;
        e = i + 1;
        return i;
    }

    public static void g() {
        if (g) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesA = T.a(C1423y.b());
            if (sharedPreferencesA != null) {
                f = sharedPreferencesA.getInt("nihc", 0);
                e = sharedPreferencesA.getInt("eihc", 0);
                d = sharedPreferencesA.getInt("vihc", 0);
                g = true;
            }
        } catch (Throwable unused) {
        }
    }

    static void a(String str) {
        try {
            SharedPreferences sharedPreferencesA = T.a(C1423y.b());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt(str, sharedPreferencesA.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }
}
