package com.json;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class ub {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f2333a = new ArrayList<>();
    private final ArrayList<String> b = new ArrayList<>();
    private final ArrayList<String> c = new ArrayList<>();
    private final ArrayList<String> d = new ArrayList<>();

    public ArrayList<String> a() {
        return this.c;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c.add(str);
    }

    public ArrayList<String> b() {
        return this.b;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.add(str);
    }

    public ArrayList<String> c() {
        return this.d;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d.add(str);
    }

    public ArrayList<String> d() {
        return this.f2333a;
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f2333a.add(str);
    }
}
