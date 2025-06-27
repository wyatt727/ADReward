package com.mbridge.msdk.click.entity;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ClickResponseHeader.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f2530a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public String g;
    public String h;

    public final String toString() {
        return "ClickResponseHeader{location='" + this.f2530a + "', contentType='" + this.b + "', contentEncoding='" + this.c + "', referer='" + this.d + "', contentLength=" + this.e + ", statusCode=" + this.f + ", url='" + this.g + "', exception='" + this.h + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public final String a() {
        return "statusCode=" + this.f + ", location=" + this.f2530a + ", contentType=" + this.b + ", contentLength=" + this.e + ", contentEncoding=" + this.c + ", referer=" + this.d;
    }
}
