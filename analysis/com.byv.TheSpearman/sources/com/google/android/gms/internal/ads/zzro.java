package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzro extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzrr zza;
    final /* synthetic */ zzrp zzb;

    zzro(zzrp zzrpVar, zzrr zzrrVar) {
        this.zza = zzrrVar;
        this.zzb = zzrpVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(this.zzb.zza.zzu)) {
            zzrr zzrrVar = this.zzb.zza;
            if (zzrrVar.zzq == null || !zzrrVar.zzR) {
                return;
            }
            zzrrVar.zzq.zzb();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.zzb.zza.zzu)) {
            zzrr zzrrVar = this.zzb.zza;
            if (zzrrVar.zzq == null || !zzrrVar.zzR) {
                return;
            }
            zzrrVar.zzq.zzb();
        }
    }
}
