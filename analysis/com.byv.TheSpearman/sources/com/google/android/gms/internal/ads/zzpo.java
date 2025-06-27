package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzpo {
    private final Context zza;
    private final Handler zzb;
    private final zzpk zzc;
    private final BroadcastReceiver zzd;
    private final zzpl zze;
    private zzph zzf;
    private zzpp zzg;
    private zzk zzh;
    private boolean zzi;
    private final zzqz zzj;

    /* JADX WARN: Multi-variable type inference failed */
    zzpo(Context context, zzqz zzqzVar, zzk zzkVar, zzpp zzppVar) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzj = zzqzVar;
        this.zzh = zzkVar;
        this.zzg = zzppVar;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Handler handler = new Handler(zzfx.zzy(), null);
        this.zzb = handler;
        this.zzc = zzfx.zza >= 23 ? new zzpk(this, objArr2 == true ? 1 : 0) : null;
        this.zzd = new zzpn(this, objArr == true ? 1 : 0);
        Uri uriZza = zzph.zza();
        this.zze = uriZza != null ? new zzpl(this, handler, applicationContext.getContentResolver(), uriZza) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(zzph zzphVar) {
        if (!this.zzi || zzphVar.equals(this.zzf)) {
            return;
        }
        this.zzf = zzphVar;
        this.zzj.zza.zzI(zzphVar);
    }

    public final zzph zzc() {
        zzpk zzpkVar;
        if (this.zzi) {
            zzph zzphVar = this.zzf;
            Objects.requireNonNull(zzphVar);
            return zzphVar;
        }
        this.zzi = true;
        zzpl zzplVar = this.zze;
        if (zzplVar != null) {
            zzplVar.zza();
        }
        if (zzfx.zza >= 23 && (zzpkVar = this.zzc) != null) {
            zzpi.zza(this.zza, zzpkVar, this.zzb);
        }
        zzph zzphVarZzd = zzph.zzd(this.zza, this.zzd != null ? this.zza.registerReceiver(this.zzd, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.zzb) : null, this.zzh, this.zzg);
        this.zzf = zzphVarZzd;
        return zzphVarZzd;
    }

    public final void zzg(zzk zzkVar) {
        this.zzh = zzkVar;
        zzj(zzph.zzc(this.zza, zzkVar, this.zzg));
    }

    public final void zzh(AudioDeviceInfo audioDeviceInfo) {
        zzpp zzppVar = this.zzg;
        if (zzfx.zzG(audioDeviceInfo, zzppVar == null ? null : zzppVar.zza)) {
            return;
        }
        zzpp zzppVar2 = audioDeviceInfo != null ? new zzpp(audioDeviceInfo) : null;
        this.zzg = zzppVar2;
        zzj(zzph.zzc(this.zza, this.zzh, zzppVar2));
    }

    public final void zzi() {
        zzpk zzpkVar;
        if (this.zzi) {
            this.zzf = null;
            if (zzfx.zza >= 23 && (zzpkVar = this.zzc) != null) {
                zzpi.zzb(this.zza, zzpkVar);
            }
            BroadcastReceiver broadcastReceiver = this.zzd;
            if (broadcastReceiver != null) {
                this.zza.unregisterReceiver(broadcastReceiver);
            }
            zzpl zzplVar = this.zze;
            if (zzplVar != null) {
                zzplVar.zzb();
            }
            this.zzi = false;
        }
    }
}
