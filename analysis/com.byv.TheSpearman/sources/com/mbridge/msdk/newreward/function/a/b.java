package com.mbridge.msdk.newreward.function.a;

import java.util.ArrayList;
import java.util.List;

/* compiled from: CandidateResult.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f3304a = 1;
    public static int b = 0;
    public static int c = 3;
    public static int d = 2;
    public static int e = 4;
    private com.mbridge.msdk.newreward.function.d.a.b f;
    private String g;
    private int h = 21;
    private int i = b;
    private ArrayList<String> j = new ArrayList<>();
    private List<String> k = new ArrayList();
    private List<String> l = new ArrayList();
    private List<String> m = new ArrayList();

    public final com.mbridge.msdk.newreward.function.d.a.b a() {
        return this.f;
    }

    public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        this.f = bVar;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        ArrayList<String> arrayList = this.j;
        return arrayList == null ? "" : arrayList.toString();
    }

    public final String d() {
        List<String> list = this.k;
        return list == null ? "" : list.toString();
    }

    public final String e() {
        List<String> list = this.l;
        return list == null ? "" : list.toString();
    }

    public final String f() {
        List<String> list = this.m;
        return list == null ? "" : list.toString();
    }

    public final void a(String str) {
        try {
            ArrayList<String> arrayList = this.j;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void b(String str) {
        try {
            List<String> list = this.k;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void c(String str) {
        try {
            List<String> list = this.l;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void d(String str) {
        this.g = str;
    }

    public final int g() {
        return this.h;
    }

    public final int h() {
        return this.i;
    }

    public final void a(int i) {
        this.i = i;
    }
}
