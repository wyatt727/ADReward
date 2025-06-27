package com.my.target;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class t7 extends u9 {
    public float d;
    public float e;

    public t7(String str) {
        super("playheadReachedValue", str);
        this.d = -1.0f;
        this.e = -1.0f;
    }

    public static t7 a(String str) {
        return new t7(str);
    }

    public void a(float f) {
        this.e = f;
    }

    public void b(float f) {
        this.d = f;
    }

    public float d() {
        return this.e;
    }

    public float e() {
        return this.d;
    }

    public String toString() {
        return "ProgressStat{value=" + this.d + ", pvalue=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }
}
