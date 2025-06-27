package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzflk implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdrv zzj;
    private final List zzk;
    private final zzedj zzm;
    private final zzbxm zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzflz zzg = zzfmc.zzc();
    private String zzh = "";
    private boolean zzl = false;

    public zzflk(Context context, VersionInfoParcel versionInfoParcel, zzdrv zzdrvVar, zzedj zzedjVar, zzbxm zzbxmVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdrvVar;
        this.zzm = zzedjVar;
        this.zzn = zzbxmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziK)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzt.zzd();
        } else {
            this.zzk = zzfzn.zzm();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            if (zzb == null) {
                if (((Boolean) zzbfm.zzb.zze()).booleanValue()) {
                    zzb = Boolean.valueOf(Math.random() < ((Double) zzbfm.zza.zze()).doubleValue());
                } else {
                    zzb = false;
                }
            }
            zBooleanValue = zzb.booleanValue();
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        bArrZzaV = ((zzfmc) this.zzg.zzbr()).zzaV();
                        this.zzg.zzc();
                    }
                    new zzedi(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid()).zza(new zzedg((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziE), MBridgeCommon.DEFAULT_LOAD_TIMEOUT, new HashMap(), bArrZzaV, "application/x-protobuf", false));
                } catch (Exception e) {
                    if ((e instanceof zzdyi) && ((zzdyi) e).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(final zzfla zzflaVar) {
        zzcbr.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzflj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zzflaVar);
            }
        });
    }

    final /* synthetic */ void zzc(zzfla zzflaVar) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    try {
                        com.google.android.gms.ads.internal.zzu.zzp();
                        this.zzh = com.google.android.gms.ads.internal.util.zzt.zzp(this.zze);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziF)).intValue();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzly)).booleanValue()) {
                        long j = iIntValue;
                        zzcbr.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                    } else {
                        long j2 = iIntValue;
                        zzcbr.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        if (zza() && zzflaVar != null) {
            synchronized (zzc) {
                if (this.zzg.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziG)).intValue()) {
                    return;
                }
                zzflm zzflmVarZza = zzflx.zza();
                zzflmVarZza.zzk(zzflaVar.zzd());
                zzflmVarZza.zzt(zzflaVar.zzn());
                zzflmVarZza.zzh(zzflaVar.zzb());
                zzflmVarZza.zzn(zzflu.OS_ANDROID);
                zzflmVarZza.zzq(this.zzf.afmaVersion);
                zzflmVarZza.zzb(this.zzh);
                zzflmVarZza.zzo(Build.VERSION.RELEASE);
                zzflmVarZza.zzu(Build.VERSION.SDK_INT);
                zzflmVarZza.zzm(zzflaVar.zzf());
                zzflmVarZza.zzl(zzflaVar.zza());
                zzflmVarZza.zzf(this.zzi);
                zzflmVarZza.zze(zzflaVar.zze());
                zzflmVarZza.zzc(zzflaVar.zzg());
                zzflmVarZza.zzg(zzflaVar.zzi());
                zzflmVarZza.zzi(zzflaVar.zzj());
                zzflmVarZza.zzj(this.zzj.zzb(zzflaVar.zzj()));
                zzflmVarZza.zzp(zzflaVar.zzk());
                zzflmVarZza.zzd(zzflaVar.zzh());
                zzflmVarZza.zzv(zzflaVar.zzm());
                zzflmVarZza.zzr(zzflaVar.zzl());
                zzflmVarZza.zzs(zzflaVar.zzc());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziK)).booleanValue()) {
                    zzflmVarZza.zza(this.zzk);
                }
                zzflz zzflzVar = this.zzg;
                zzfma zzfmaVarZza = zzfmb.zza();
                zzfmaVarZza.zza(zzflmVarZza);
                zzflzVar.zzb(zzfmaVarZza);
            }
        }
    }
}
