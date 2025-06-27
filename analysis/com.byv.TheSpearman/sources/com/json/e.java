package com.json;

import android.text.TextUtils;
import com.json.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f1739a = "eventId";
    private final String b = "timestamp";
    private final String c = "InterstitialEvents";
    private final String d = "events";
    private final String e = "events";
    JSONObject f;
    int g;
    private String h;

    e() {
    }

    private String a(int i) {
        return i != 2 ? "events" : "InterstitialEvents";
    }

    protected abstract String a();

    public abstract String a(ArrayList<l4> arrayList, JSONObject jSONObject);

    String a(JSONArray jSONArray) throws JSONException {
        try {
            if (this.f != null) {
                JSONObject jSONObject = new JSONObject(this.f.toString());
                jSONObject.put("timestamp", IronSourceUtils.getTimestamp());
                jSONObject.put(a(this.g), jSONArray);
                return jSONObject.toString();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    JSONObject a(l4 l4Var) throws JSONException {
        try {
            JSONObject jSONObject = !TextUtils.isEmpty(l4Var.a()) ? new JSONObject(l4Var.a()) : new JSONObject();
            jSONObject.put("eventId", l4Var.c());
            jSONObject.put("timestamp", l4Var.d());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    void a(String str) {
        this.h = str;
    }

    String b() {
        return TextUtils.isEmpty(this.h) ? a() : this.h;
    }

    public abstract String c();
}
