package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zztm extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzti zzc;
    public final String zzd;
    public final zztm zze;

    public zztm(zzam zzamVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + zzamVar.toString(), th, zzamVar.zzm, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i), null);
    }

    static /* bridge */ /* synthetic */ zztm zza(zztm zztmVar, zztm zztmVar2) {
        return new zztm(zztmVar.getMessage(), zztmVar.getCause(), zztmVar.zza, false, zztmVar.zzc, zztmVar.zzd, zztmVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zztm(zzam zzamVar, Throwable th, boolean z, zzti zztiVar) {
        String str = "Decoder init failed: " + zztiVar.zza + ", " + zzamVar.toString();
        String str2 = zzamVar.zzm;
        int i = zzfx.zza;
        this(str, th, str2, false, zztiVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zztm(String str, Throwable th, String str2, boolean z, zzti zztiVar, String str3, zztm zztmVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zztiVar;
        this.zzd = str3;
        this.zze = zztmVar;
    }
}
