package com.json.mediationsdk.utils;

import android.text.TextUtils;
import com.json.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d {
    private NetworkSettings b;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f2007a = new ArrayList<>();
    private JSONObject c = null;
    private boolean d = false;
    private boolean e = true;

    d() {
    }

    public static d a() {
        return new d();
    }

    public void a(NetworkSettings networkSettings) {
        this.b = networkSettings;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f2007a.add(str);
    }

    public void a(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public JSONObject b() {
        return this.c;
    }

    public void b(boolean z) {
        this.d = z;
    }

    public NetworkSettings c() {
        return this.b;
    }

    public ArrayList<String> d() {
        return this.f2007a;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }
}
