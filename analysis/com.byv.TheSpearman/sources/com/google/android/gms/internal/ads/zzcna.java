package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcna extends com.google.android.gms.ads.internal.client.zzcn {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdry zzc;
    private final zzegl zzd;
    private final zzemw zze;
    private final zzdwk zzf;
    private final zzcad zzg;
    private final zzdsd zzh;
    private final zzdxf zzi;
    private final zzbgm zzj;
    private final zzflk zzk;
    private final zzfhe zzl;
    private final zzcwi zzm;
    private final zzduh zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime());

    zzcna(Context context, VersionInfoParcel versionInfoParcel, zzdry zzdryVar, zzegl zzeglVar, zzemw zzemwVar, zzdwk zzdwkVar, zzcad zzcadVar, zzdsd zzdsdVar, zzdxf zzdxfVar, zzbgm zzbgmVar, zzflk zzflkVar, zzfhe zzfheVar, zzcwi zzcwiVar, zzduh zzduhVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdryVar;
        this.zzd = zzeglVar;
        this.zze = zzemwVar;
        this.zzf = zzdwkVar;
        this.zzg = zzcadVar;
        this.zzh = zzdsdVar;
        this.zzi = zzdxfVar;
        this.zzj = zzbgmVar;
        this.zzk = zzflkVar;
        this.zzl = zzfheVar;
        this.zzm = zzcwiVar;
        this.zzn = zzduhVar;
    }

    final void zzb() {
        if (com.google.android.gms.ads.internal.zzu.zzo().zzi().zzN()) {
            String strZzk = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzk();
            if (com.google.android.gms.ads.internal.zzu.zzs().zzj(this.zza, strZzk, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzA(false);
            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzz("");
        }
    }

    final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map mapZze = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzg().zze();
        if (mapZze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzd()) {
            HashMap map = new HashMap();
            Iterator it = mapZze.values().iterator();
            while (it.hasNext()) {
                for (zzbqh zzbqhVar : ((zzbqi) it.next()).zza) {
                    String str = zzbqhVar.zzk;
                    for (String str2 : zzbqhVar.zzc) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzegm zzegmVarZza = this.zzd.zza(str3, jSONObject);
                    if (zzegmVarZza != null) {
                        zzfhg zzfhgVar = (zzfhg) zzegmVarZza.zzb;
                        if (!zzfhgVar.zzC() && zzfhgVar.zzB()) {
                            zzfhgVar.zzj(this.zza, (zzeig) zzegmVarZza.zzc, (List) entry.getValue());
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfgp e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                }
            }
        }
    }

    final /* synthetic */ void zzd() {
        zzfhn.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzu.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzk() {
        if (this.zzo) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbdz.zza(this.zza);
        com.google.android.gms.ads.internal.zzu.zzo().zzu(this.zza, this.zzb);
        this.zzm.zzc();
        com.google.android.gms.ads.internal.zzu.zzc().zzi(this.zza);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdV)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjd)).booleanValue()) {
            zzcbr.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmv
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkC)).booleanValue()) {
            zzcbr.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzw();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcJ)).booleanValue()) {
            zzcbr.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws JSONException {
        String strZzp;
        Runnable runnable;
        zzbdz.zza(this.zza);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdZ)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzu.zzp();
                strZzp = com.google.android.gms.ads.internal.util.zzt.zzp(this.zza);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "NonagonMobileAdsSettingManager_AppId");
            }
        } else {
            strZzp = "";
        }
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(strZzp) ? str : strZzp;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdT)).booleanValue() | ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaQ)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaQ)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmy
                @Override // java.lang.Runnable
                public final void run() {
                    zzgep zzgepVar = zzcbr.zze;
                    final zzcna zzcnaVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzgepVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmz
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcnaVar.zzc(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z = zBooleanValue;
        }
        Runnable runnable3 = runnable;
        if (z) {
            com.google.android.gms.ads.internal.zzu.zza().zza(this.zza, this.zzb, str2, runnable3, this.zzk, this.zzn, this.zzp);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(com.google.android.gms.ads.internal.client.zzda zzdaVar) throws RemoteException {
        this.zzi.zzh(zzdaVar, zzdxe.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
        zzauVar.zzn(str);
        zzauVar.zzo(this.zzb.afmaVersion);
        zzauVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbqo zzbqoVar) throws RemoteException {
        this.zzl.zzf(zzbqoVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzp(boolean z) {
        com.google.android.gms.ads.internal.zzu.zzr().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzq(float f) {
        com.google.android.gms.ads.internal.zzu.zzr().zzd(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzr(String str) {
        zzbdz.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdT)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zza().zza(this.zza, this.zzb, str, null, this.zzk, null, null);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbnd zzbndVar) throws RemoteException {
        this.zzf.zzs(zzbndVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjo)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzy(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(com.google.android.gms.ads.internal.client.zzff zzffVar) throws RemoteException {
        this.zzg.zzn(this.zza, zzffVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzu.zzr().zze();
    }

    final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbvx());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) throws RemoteException {
        try {
            zzfts.zzi(this.zza).zzn(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }
}
