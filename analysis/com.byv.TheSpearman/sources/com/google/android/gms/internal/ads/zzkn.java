package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzkn implements zzlm {
    private final Object zza;
    private final zzvj zzb;
    private zzcx zzc;

    public zzkn(Object obj, zzvc zzvcVar) {
        this.zza = obj;
        this.zzb = zzvcVar;
        this.zzc = zzvcVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final zzcx zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final Object zzb() {
        return this.zza;
    }

    public final void zzc(zzcx zzcxVar) {
        this.zzc = zzcxVar;
    }
}
