package com.mbridge.msdk.dycreator.b;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: DyError.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f2556a;
    private String b;

    public a(b bVar) {
        if (bVar != null) {
            this.f2556a = bVar.a();
            this.b = bVar.b();
        }
    }

    public a(int i, String str) {
        this.f2556a = i;
        this.b = str;
    }

    public final String toString() {
        return "DyError{errorCode=" + this.f2556a + AbstractJsonLexerKt.END_OBJ;
    }
}
