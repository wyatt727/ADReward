package com.my.target;

/* loaded from: classes4.dex */
public class u8 extends w5 {
    public int h;
    public int i;

    public u8(String str, float f, int i, boolean z) {
        super("playheadViewabilityValue", str, f, i, z);
    }

    public static u8 b(String str, float f, int i, boolean z) {
        return new u8(str, f, i, z);
    }

    public void a(int i) {
        this.i = i;
    }

    public void b(int i) {
        this.h = i;
    }

    public int e() {
        return this.i;
    }

    public int f() {
        return this.h;
    }
}
