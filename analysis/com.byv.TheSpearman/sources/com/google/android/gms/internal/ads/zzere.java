package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzere implements zzewr {
    private final zzgep zza;
    private final Context zzb;

    public zzere(zzgep zzgepVar, Context context) {
        this.zza = zzgepVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzerf zzc() throws Exception {
        int iZzj;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = -1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkE)).booleanValue()) {
            iZzj = com.google.android.gms.ads.internal.zzu.zzq().zzj(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
        } else {
            iZzj = -1;
        }
        return new zzerf(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, iZzj, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzu.zzr().zza(), com.google.android.gms.ads.internal.zzu.zzr().zze());
    }
}
