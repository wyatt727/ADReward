package com.applovin.impl;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public class ed extends m5 {

    /* renamed from: a, reason: collision with root package name */
    public final fd f384a;
    public final String b;

    public ed(Throwable th, fd fdVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        sb.append(fdVar == null ? null : fdVar.f425a);
        super(sb.toString(), th);
        this.f384a = fdVar;
        this.b = yp.f1214a >= 21 ? a(th) : null;
    }

    private static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
