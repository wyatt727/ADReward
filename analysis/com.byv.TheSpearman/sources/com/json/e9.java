package com.json;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.json.f7;
import com.json.t2;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class e9 {
    private static final String b = "e9";
    private static final String c = "supersonic_shared_preferen";
    private static final String d = "version";
    private static final String e = "back_button_state";
    private static final String f = "search_keys";
    private static final String g = "^\\d+_\\d+$";
    private static e9 h;

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f1754a;

    private e9(Context context) {
        this.f1754a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized e9 a(Context context) {
        if (h == null) {
            h = new e9(context);
        }
        return h;
    }

    private boolean b(String str) {
        return str.matches(g);
    }

    public static synchronized e9 e() {
        return h;
    }

    public String a(String str) {
        String string = this.f1754a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.f1754a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor editorEdit = this.f1754a.edit();
        for (String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
        return arrayList;
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f1754a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public boolean a(String str, String str2, String str3) throws JSONException {
        String string = this.f1754a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor editorEdit = this.f1754a.edit();
            editorEdit.putString("ssaUserData", jSONObject.toString());
            editorEdit.apply();
            return true;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public f7.a b() throws NumberFormatException {
        int i = Integer.parseInt(this.f1754a.getString(e, "2"));
        return i == 0 ? f7.a.None : i == 1 ? f7.a.Device : i == 2 ? f7.a.Controller : f7.a.Controller;
    }

    public String c() {
        return this.f1754a.getString("version", "-1");
    }

    public void c(String str) {
        SharedPreferences.Editor editorEdit = this.f1754a.edit();
        editorEdit.putString(e, str);
        editorEdit.apply();
    }

    public List<String> d() {
        String string = this.f1754a.getString(f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            ic icVar = new ic(string);
            if (icVar.a(t2.h.R)) {
                try {
                    arrayList.addAll(icVar.a((JSONArray) icVar.b(t2.h.R)));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f1754a.edit();
        editorEdit.putString("version", str);
        editorEdit.apply();
    }

    public void e(String str) {
        SharedPreferences.Editor editorEdit = this.f1754a.edit();
        editorEdit.putString(f, str);
        editorEdit.apply();
    }
}
