package com.json.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.json.MessageToNative;
import com.json.bb;
import com.json.f7;
import com.json.h3;
import com.json.i3;
import com.json.j3;
import com.json.sdk.controller.f;
import com.json.t3;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface l {

    public interface a {
        void a(f.CallbackToNative callbackToNative);
    }

    public interface b {
        void a(MessageToNative messageToNative);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(f.MessageToController messageToController, a aVar);

    void a(t3 t3Var);

    void a(t3 t3Var, Map<String, String> map, h3 h3Var);

    void a(t3 t3Var, Map<String, String> map, i3 i3Var);

    void a(String str, i3 i3Var);

    void a(String str, String str2, bb bbVar);

    void a(String str, String str2, t3 t3Var, h3 h3Var);

    void a(String str, String str2, t3 t3Var, i3 i3Var);

    void a(String str, String str2, t3 t3Var, j3 j3Var);

    void a(String str, String str2, Map<String, String> map, bb bbVar);

    void a(Map<String, String> map, bb bbVar);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, h3 h3Var);

    void a(JSONObject jSONObject, i3 i3Var);

    void a(JSONObject jSONObject, j3 j3Var);

    boolean a(String str);

    void b(Context context);

    void b(t3 t3Var);

    void b(t3 t3Var, Map<String, String> map, i3 i3Var);

    void b(JSONObject jSONObject);

    void d();

    void destroy();

    @Deprecated
    void e();

    void f();

    f7.c g();
}
