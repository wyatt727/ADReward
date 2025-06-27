package com.applovin.impl;

import com.applovin.mediation.MaxError;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class vj {

    /* renamed from: a, reason: collision with root package name */
    private final wj f1099a;
    private final String b;
    private final String c;
    private final String d;
    private final MaxError e;
    private final long f;
    private final long g;
    private final boolean h;

    public interface a {
        void a(vj vjVar);
    }

    public long b() {
        return this.g;
    }

    public boolean g() {
        return this.h;
    }

    public static vj a(wj wjVar, com.applovin.impl.mediation.g gVar, MaxError maxError, long j, long j2) {
        if (wjVar != null) {
            return new vj(wjVar, gVar, null, maxError, j, j2);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    private vj(wj wjVar, com.applovin.impl.mediation.g gVar, String str, MaxError maxError, long j, long j2) {
        this(wjVar, str, maxError, j, j2, gVar != null ? gVar.i() : null, gVar != null ? gVar.b() : null, false);
    }

    public wj f() {
        return this.f1099a;
    }

    public String d() {
        return this.b;
    }

    public static vj a(wj wjVar, MaxError maxError) {
        return a(wjVar, (com.applovin.impl.mediation.g) null, maxError, -1L, -1L);
    }

    public String e() {
        return this.d;
    }

    public MaxError c() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f1099a);
        sb.append(", mSdkVersion='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", mAdapterVersion='");
        sb.append(this.c);
        sb.append('\'');
        sb.append(", mSignalDataLength='");
        String str = this.d;
        sb.append(str != null ? str.length() : 0);
        sb.append('\'');
        sb.append(", mErrorMessage=");
        MaxError maxError = this.e;
        sb.append(maxError != null ? maxError.getMessage() : "");
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public static vj a(wj wjVar, com.applovin.impl.mediation.g gVar, String str, long j, long j2) {
        if (wjVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (gVar != null) {
            return new vj(wjVar, gVar, str, null, j, j2);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    private vj(wj wjVar, String str, MaxError maxError, long j, long j2, String str2, String str3, boolean z) {
        this.f1099a = wjVar;
        this.d = str;
        this.e = maxError;
        this.f = j;
        this.g = j2;
        this.b = str2;
        this.c = str3;
        this.h = z;
    }

    public String a() {
        return this.c;
    }

    public static vj a(vj vjVar) {
        return new vj(vjVar.f(), vjVar.e(), vjVar.c(), vjVar.f, vjVar.g, vjVar.d(), vjVar.a(), true);
    }
}
