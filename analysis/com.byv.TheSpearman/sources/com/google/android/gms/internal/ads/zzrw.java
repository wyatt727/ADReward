package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzrw implements zzqk {
    final /* synthetic */ zzrx zza;

    /* synthetic */ zzrw(zzrx zzrxVar, zzrv zzrvVar) {
        this.zza = zzrxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqk
    public final void zza(Exception exc) {
        zzfe.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqk
    public final void zzb() {
        zzrx zzrxVar = this.zza;
        if (zzrxVar.zzm != null) {
            zzrxVar.zzm.zzb();
        }
    }
}
