package com.json;

import android.app.Activity;
import java.util.Map;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes4.dex */
public interface jc {
    void a(Activity activity);

    void a(Activity activity, Map<String, String> map);

    void a(String str, String str2, int i);

    void a(String str, String str2, bb bbVar);

    void a(String str, String str2, String str3, Map<String, String> map, eb ebVar);

    void a(String str, String str2, String str3, Map<String, String> map, ya yaVar);

    void a(String str, String str2, Map<String, String> map, bb bbVar);

    void a(JSONObject jSONObject);

    boolean a(String str);

    void b(JSONObject jSONObject);

    void c(JSONObject jSONObject);

    void d(JSONObject jSONObject);

    void onPause(Activity activity);

    void onResume(Activity activity);
}
