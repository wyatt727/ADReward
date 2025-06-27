package com.my.target;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a7 extends q {
    public final String b;
    public final ArrayList<u6> c = new ArrayList<>();
    public final ArrayList<Pair<String, String>> d = new ArrayList<>();
    public JSONObject e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;

    public a7(String str) {
        this.b = str;
    }

    public static a7 b(String str) {
        return new a7(str);
    }

    @Override // com.my.target.q
    public int a() {
        return this.c.size();
    }

    public String a(String str) {
        Iterator<Pair<String, String>> it = this.d.iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            if (str.equals(next.first)) {
                return (String) next.second;
            }
        }
        return null;
    }

    public void a(u6 u6Var) {
        this.c.add(u6Var);
    }

    public void a(JSONObject jSONObject) {
        this.e = jSONObject;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public List<u6> c() {
        return new ArrayList(this.c);
    }

    public void c(String str) {
        this.i = str;
    }

    public String d() {
        return this.i;
    }

    public void d(String str) {
        this.k = str;
    }

    public String e() {
        return this.k;
    }

    public void e(String str) {
        this.h = str;
    }

    public String f() {
        return this.h;
    }

    public void f(String str) {
        this.l = str;
    }

    public String g() {
        return this.l;
    }

    public void g(String str) {
        this.j = str;
    }

    public String h() {
        return this.j;
    }

    public void h(String str) {
        this.g = str;
    }

    public String i() {
        return this.b;
    }

    public JSONObject j() {
        return this.e;
    }

    public ArrayList<Pair<String, String>> k() {
        return this.d;
    }

    public String l() {
        return this.g;
    }

    public boolean m() {
        return this.f;
    }
}
