package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeqx implements zzewr {
    private static final Object zzb = new Object();
    final Context zza;
    private final String zzc;
    private final String zzd;
    private final long zze;
    private final zzcvp zzf;
    private final zzfhq zzg;
    private final zzfgi zzh;
    private final com.google.android.gms.ads.internal.util.zzg zzi = com.google.android.gms.ads.internal.zzu.zzo().zzi();
    private final zzduc zzj;
    private final zzcwc zzk;

    public zzeqx(Context context, String str, String str2, zzcvp zzcvpVar, zzfhq zzfhqVar, zzfgi zzfgiVar, zzduc zzducVar, zzcwc zzcwcVar, long j) {
        this.zza = context;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = zzcvpVar;
        this.zzg = zzfhqVar;
        this.zzh = zzfgiVar;
        this.zzj = zzducVar;
        this.zzk = zzcwcVar;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        final Bundle bundle = new Bundle();
        this.zzj.zzb().put("seq_num", this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue()) {
            this.zzj.zzc("tsacc", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - this.zze));
            zzduc zzducVar = this.zzj;
            com.google.android.gms.ads.internal.zzu.zzp();
            zzducVar.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzt.zzG(this.zza) ? "1" : "0");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfC)).booleanValue()) {
            this.zzf.zzk(this.zzh.zzd);
            bundle.putAll(this.zzg.zzb());
        }
        return zzgee.zzh(new zzewq() { // from class: com.google.android.gms.internal.ads.zzeqw
            @Override // com.google.android.gms.internal.ads.zzewq
            public final void zzj(Object obj) {
                this.zza.zzc(bundle, (Bundle) obj);
            }
        });
    }

    final /* synthetic */ void zzc(Bundle bundle, Bundle bundle2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfC)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfB)).booleanValue()) {
                synchronized (zzb) {
                    this.zzf.zzk(this.zzh.zzd);
                    bundle2.putBundle("quality_signals", this.zzg.zzb());
                }
            } else {
                this.zzf.zzk(this.zzh.zzd);
                bundle2.putBundle("quality_signals", this.zzg.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzc);
        if (!this.zzi.zzO()) {
            bundle2.putString("session_id", this.zzd);
        }
        bundle2.putBoolean("client_purpose_one", !this.zzi.zzO());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfD)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzu.zzp();
                bundle2.putString("_app_id", com.google.android.gms.ads.internal.util.zzt.zzp(this.zza));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AppStatsSignal_AppId");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfE)).booleanValue() && this.zzh.zzf != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("dload", this.zzk.zzb(this.zzh.zzf));
            bundle3.putInt("pcc", this.zzk.zza(this.zzh.zzf));
            bundle2.putBundle("ad_unit_quality_signals", bundle3);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjE)).booleanValue() || com.google.android.gms.ads.internal.zzu.zzo().zza() <= 0) {
            return;
        }
        bundle2.putInt("nrwv", com.google.android.gms.ads.internal.zzu.zzo().zza());
    }
}
