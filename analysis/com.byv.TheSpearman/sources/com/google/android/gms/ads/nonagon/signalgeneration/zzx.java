package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzflh;
import com.google.android.gms.internal.ads.zzgea;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
final class zzx implements zzgea {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzcat zzb;
    final /* synthetic */ zzcam zzc;
    final /* synthetic */ zzfkw zzd;
    final /* synthetic */ zzab zze;

    zzx(zzab zzabVar, ListenableFuture listenableFuture, zzcat zzcatVar, zzcam zzcamVar, zzfkw zzfkwVar) {
        this.zza = listenableFuture;
        this.zzb = zzcatVar;
        this.zzc = zzcamVar;
        this.zzd = zzfkwVar;
        this.zze = zzabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) zzba.zzc().zza(zzbdz.zzhJ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        zzflh zzflhVarZzr = zzab.zzr(this.zza, this.zzb);
        if (((Boolean) zzbfm.zze.zze()).booleanValue() && zzflhVarZzr != null) {
            zzfkw zzfkwVar = this.zzd;
            zzfkwVar.zzh(th);
            zzfkwVar.zzg(false);
            zzflhVarZzr.zza(zzfkwVar);
            zzflhVarZzr.zzh();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.zzc.zzb(message);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzap zzapVar = (zzap) obj;
        zzflh zzflhVarZzr = zzab.zzr(this.zza, this.zzb);
        this.zze.zzH.set(true);
        if (!((Boolean) zzba.zzc().zza(zzbdz.zzhE)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) zzbfm.zze.zze()).booleanValue() || zzflhVarZzr == null) {
                return;
            }
            zzfkw zzfkwVar = this.zzd;
            zzfkwVar.zzc("QueryInfo generation has been disabled.");
            zzfkwVar.zzg(false);
            zzflhVarZzr.zza(zzfkwVar);
            zzflhVarZzr.zzh();
            return;
        }
        try {
            try {
                if (zzapVar == null) {
                    this.zzc.zzc(null, null, null);
                    this.zzd.zzg(true);
                    if (!((Boolean) zzbfm.zze.zze()).booleanValue() || zzflhVarZzr == null) {
                        return;
                    }
                    zzflhVarZzr.zza(this.zzd);
                    zzflhVarZzr.zzh();
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(zzapVar.zzb).optString("request_id", ""))) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("The request ID is empty in request JSON.");
                        this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                        zzfkw zzfkwVar2 = this.zzd;
                        zzfkwVar2.zzc("Request ID empty");
                        zzfkwVar2.zzg(false);
                        if (!((Boolean) zzbfm.zze.zze()).booleanValue() || zzflhVarZzr == null) {
                            return;
                        }
                        zzflhVarZzr.zza(this.zzd);
                        zzflhVarZzr.zzh();
                        return;
                    }
                    Bundle bundle = zzapVar.zzd;
                    zzab zzabVar = this.zze;
                    if (zzabVar.zzv && bundle != null && bundle.getInt(zzabVar.zzx, -1) == -1) {
                        zzab zzabVar2 = this.zze;
                        bundle.putInt(zzabVar2.zzx, zzabVar2.zzy.get());
                    }
                    zzab zzabVar3 = this.zze;
                    if (zzabVar3.zzu && bundle != null && TextUtils.isEmpty(bundle.getString(zzabVar3.zzw))) {
                        if (TextUtils.isEmpty(this.zze.zzA)) {
                            zzab zzabVar4 = this.zze;
                            com.google.android.gms.ads.internal.util.zzt zztVarZzp = com.google.android.gms.ads.internal.zzu.zzp();
                            zzab zzabVar5 = this.zze;
                            zzabVar4.zzA = zztVarZzp.zzc(zzabVar5.zzg, zzabVar5.zzz.afmaVersion);
                        }
                        zzab zzabVar6 = this.zze;
                        bundle.putString(zzabVar6.zzw, zzabVar6.zzA);
                    }
                    this.zzc.zzc(zzapVar.zza, zzapVar.zzb, bundle);
                    this.zzd.zzg(true);
                    if (!((Boolean) zzbfm.zze.zze()).booleanValue() || zzflhVarZzr == null) {
                        return;
                    }
                    zzflhVarZzr.zza(this.zzd);
                    zzflhVarZzr.zzh();
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to create JSON object from the request string.");
                    this.zzc.zzb("Internal error for request JSON: " + e2.toString());
                    zzfkw zzfkwVar3 = this.zzd;
                    zzfkwVar3.zzh(e2);
                    zzfkwVar3.zzg(false);
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbfm.zze.zze()).booleanValue() || zzflhVarZzr == null) {
                        return;
                    }
                    zzflhVarZzr.zza(this.zzd);
                    zzflhVarZzr.zzh();
                }
            } catch (RemoteException e3) {
                zzfkw zzfkwVar4 = this.zzd;
                zzfkwVar4.zzh(e3);
                zzfkwVar4.zzg(false);
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e3);
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbfm.zze.zze()).booleanValue() || zzflhVarZzr == null) {
                    return;
                }
                zzflhVarZzr.zza(this.zzd);
                zzflhVarZzr.zzh();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbfm.zze.zze()).booleanValue() && zzflhVarZzr != null) {
                zzflhVarZzr.zza(this.zzd);
                zzflhVarZzr.zzh();
            }
            throw th;
        }
    }
}
