package com.applovin.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.q5;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i6 implements oi {

    /* renamed from: a, reason: collision with root package name */
    private final Context f518a;
    private boolean d;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int b = 0;
    private long c = 5000;
    private hd e = hd.f498a;

    protected void a(Context context, Handler handler, int i, ArrayList arrayList) {
    }

    public i6(Context context) {
        this.f518a = context;
    }

    protected void a(Context context, int i, hd hdVar, boolean z, q1 q1Var, Handler handler, p1 p1Var, ArrayList arrayList) {
        int i2;
        dd ddVar = new dd(context, hdVar, z, handler, p1Var, q1Var);
        ddVar.a(this.f);
        ddVar.b(this.g);
        ddVar.c(this.h);
        arrayList.add(ddVar);
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (li) Class.forName("com.applovin.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, p1.class, q1.class).newInstance(handler, p1Var, q1Var));
                    kc.c("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                    try {
                        int i3 = i2 + 1;
                        try {
                            arrayList.add(i2, (li) Class.forName("com.applovin.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, p1.class, q1.class).newInstance(handler, p1Var, q1Var));
                            kc.c("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused2) {
                            i2 = i3;
                            i3 = i2;
                            arrayList.add(i3, (li) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, p1.class, q1.class).newInstance(handler, p1Var, q1Var));
                            kc.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        }
                        arrayList.add(i3, (li) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, p1.class, q1.class).newInstance(handler, p1Var, q1Var));
                        kc.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating FLAC extension", e);
                    }
                }
            } catch (ClassNotFoundException unused3) {
            }
            try {
                int i32 = i2 + 1;
                arrayList.add(i2, (li) Class.forName("com.applovin.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, p1.class, q1.class).newInstance(handler, p1Var, q1Var));
                kc.c("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
            } catch (ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i32, (li) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, p1.class, q1.class).newInstance(handler, p1Var, q1Var));
                kc.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating Opus extension", e3);
        }
    }

    protected void a(Context context, int i, ArrayList arrayList) {
        arrayList.add(new u2());
    }

    protected void a(Context context, af afVar, Looper looper, int i, ArrayList arrayList) {
        arrayList.add(new bf(afVar, looper));
    }

    protected void a(Context context, bo boVar, Looper looper, int i, ArrayList arrayList) {
        arrayList.add(new co(boVar, looper));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:43|11)|41|18|19|38|20|(3:44|27|32)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c8, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d3, code lost:
    
        r8 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void a(android.content.Context r15, int r16, com.applovin.impl.hd r17, boolean r18, android.os.Handler r19, com.applovin.impl.xq r20, long r21, java.util.ArrayList r23) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i6.a(android.content.Context, int, com.applovin.impl.hd, boolean, android.os.Handler, com.applovin.impl.xq, long, java.util.ArrayList):void");
    }

    @Override // com.applovin.impl.oi
    public li[] a(Handler handler, xq xqVar, p1 p1Var, bo boVar, af afVar) {
        ArrayList arrayList = new ArrayList();
        a(this.f518a, this.b, this.e, this.d, handler, xqVar, this.c, arrayList);
        q1 q1VarA = a(this.f518a, this.i, this.j, this.k);
        if (q1VarA != null) {
            a(this.f518a, this.b, this.e, this.d, q1VarA, handler, p1Var, arrayList);
        }
        a(this.f518a, boVar, handler.getLooper(), this.b, arrayList);
        a(this.f518a, afVar, handler.getLooper(), this.b, arrayList);
        a(this.f518a, this.b, arrayList);
        a(this.f518a, handler, this.b, arrayList);
        return (li[]) arrayList.toArray(new li[0]);
    }

    protected q1 a(Context context, boolean z, boolean z2, boolean z3) {
        return new q5(m1.a(context), new q5.d(new o1[0]), z, z2, z3 ? 1 : 0);
    }
}
