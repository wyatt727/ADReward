package com.json;

/* loaded from: classes4.dex */
public class g7 {
    public static final int c = 1001;

    /* renamed from: a, reason: collision with root package name */
    private String f1789a;
    private int b;

    public g7(int i, String str) {
        this.b = i;
        this.f1789a = str == null ? "" : str;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.f1789a;
    }

    public String toString() {
        return "error - code:" + this.b + ", message:" + this.f1789a;
    }
}
