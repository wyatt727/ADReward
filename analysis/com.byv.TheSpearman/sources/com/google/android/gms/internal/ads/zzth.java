package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzth extends zzif {
    public final zzti zza;
    public final String zzb;

    public zzth(Throwable th, zzti zztiVar) {
        super("Decoder failed: ".concat(String.valueOf(zztiVar == null ? null : zztiVar.zza)), th);
        this.zza = zztiVar;
        int i = zzfx.zza;
        this.zzb = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
    }
}
