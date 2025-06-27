package com.json;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    private String f2040a;
    private boolean b;
    private String c;
    private h6 d;
    private boolean e;
    private ArrayList<Pair<String, String>> f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f2041a;
        private h6 d;
        private boolean b = false;
        private String c = "POST";
        private boolean e = false;
        private ArrayList<Pair<String, String>> f = new ArrayList<>();

        public a(String str) {
            this.f2041a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f2041a = str;
        }

        public a a(Pair<String, String> pair) {
            this.f.add(pair);
            return this;
        }

        public a a(h6 h6Var) {
            this.d = h6Var;
            return this;
        }

        public a a(List<Pair<String, String>> list) {
            this.f.addAll(list);
            return this;
        }

        public a a(boolean z) {
            this.e = z;
            return this;
        }

        public o4 a() {
            return new o4(this);
        }

        public a b() {
            this.c = "GET";
            return this;
        }

        public a b(boolean z) {
            this.b = z;
            return this;
        }

        public a c() {
            this.c = "POST";
            return this;
        }
    }

    o4(a aVar) {
        this.e = false;
        this.f2040a = aVar.f2041a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        if (aVar.f != null) {
            this.f = new ArrayList<>(aVar.f);
        }
    }

    public boolean a() {
        return this.b;
    }

    public String b() {
        return this.f2040a;
    }

    public h6 c() {
        return this.d;
    }

    public ArrayList<Pair<String, String>> d() {
        return new ArrayList<>(this.f);
    }

    public String e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }
}
