package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdpx {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final zzcgz zzc;
    private final Context zzd;
    private final zzduh zze;
    private final Executor zzf;
    private final zzawo zzg;
    private final VersionInfoParcel zzh;
    private final zzefd zzj;
    private final zzfmt zzk;
    private final zzefo zzl;
    private final zzfgm zzm;
    private ListenableFuture zzn;
    private final zzdpk zza = new zzdpk();
    private final zzblo zzi = new zzblo();

    zzdpx(zzdpu zzdpuVar) {
        this.zzd = zzdpuVar.zzc;
        this.zzf = zzdpuVar.zzf;
        this.zzg = zzdpuVar.zzg;
        this.zzh = zzdpuVar.zzh;
        this.zzb = zzdpuVar.zza;
        this.zzc = zzdpuVar.zzb;
        this.zzj = zzdpuVar.zze;
        this.zzk = zzdpuVar.zzi;
        this.zze = zzdpuVar.zzd;
        this.zzl = zzdpuVar.zzj;
        this.zzm = zzdpuVar.zzk;
    }

    final /* synthetic */ zzcgm zza(zzcgm zzcgmVar) {
        zzcgmVar.zzae("/result", this.zzi);
        zzcic zzcicVarZzN = zzcgmVar.zzN();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzd, null, null);
        zzefd zzefdVar = this.zzj;
        zzfmt zzfmtVar = this.zzk;
        zzduh zzduhVar = this.zze;
        zzdpk zzdpkVar = this.zza;
        zzcicVarZzN.zzR(null, zzdpkVar, zzdpkVar, zzdpkVar, zzdpkVar, false, null, zzbVar, null, null, zzefdVar, zzfmtVar, zzduhVar, null, null, null, null, null, null);
        return zzcgmVar;
    }

    final /* synthetic */ ListenableFuture zzf(String str, JSONObject jSONObject, zzcgm zzcgmVar) throws Exception {
        return this.zzi.zzb(zzcgmVar, str, jSONObject);
    }

    public final synchronized ListenableFuture zzg(final String str, final JSONObject jSONObject) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return zzgee.zzh(null);
        }
        return zzgee.zzn(listenableFuture, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdpl
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzf(str, jSONObject, (zzcgm) obj);
            }
        }, this.zzf);
    }

    public final synchronized void zzh(zzffn zzffnVar, zzffq zzffqVar, zzcpk zzcpkVar) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzgee.zzr(listenableFuture, new zzdpr(this, zzffnVar, zzffqVar, zzcpkVar), this.zzf);
    }

    public final synchronized void zzi() {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzgee.zzr(listenableFuture, new zzdpn(this), this.zzf);
        this.zzn = null;
    }

    public final synchronized void zzj(String str, Map map) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzgee.zzr(listenableFuture, new zzdpq(this, "sendMessageToNativeJs", map), this.zzf);
    }

    public final synchronized void zzk() {
        final String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdG);
        final Context context = this.zzd;
        final zzawo zzawoVar = this.zzg;
        final VersionInfoParcel versionInfoParcel = this.zzh;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        final zzefo zzefoVar = this.zzl;
        final zzfgm zzfgmVar = this.zzm;
        ListenableFuture listenableFutureZzm = zzgee.zzm(zzgee.zzk(new zzgdk() { // from class: com.google.android.gms.internal.ads.zzcgx
            @Override // com.google.android.gms.internal.ads.zzgdk
            public final ListenableFuture zza() throws zzcgy {
                com.google.android.gms.ads.internal.zzu.zzz();
                Context context2 = context;
                zzcie zzcieVarZza = zzcie.zza();
                zzawo zzawoVar2 = zzawoVar;
                zzefo zzefoVar2 = zzefoVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzcgm zzcgmVarZza = zzcgz.zza(context2, zzcieVarZza, "", false, false, zzawoVar2, null, versionInfoParcel, null, null, zzaVar2, zzbcx.zza(), null, null, zzefoVar2, zzfgmVar);
                final zzcbv zzcbvVarZza = zzcbv.zza(zzcgmVarZza);
                zzcgmVarZza.zzN().zzB(new zzcia() { // from class: com.google.android.gms.internal.ads.zzcgw
                    @Override // com.google.android.gms.internal.ads.zzcia
                    public final void zza(boolean z, int i, String str2, String str3) {
                        zzcbvVarZza.zzb();
                    }
                });
                zzcgmVarZza.loadUrl(str);
                return zzcbvVarZza;
            }
        }, zzcbr.zze), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzdpm
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                zzcgm zzcgmVar = (zzcgm) obj;
                this.zza.zza(zzcgmVar);
                return zzcgmVar;
            }
        }, this.zzf);
        this.zzn = listenableFutureZzm;
        zzcbu.zza(listenableFutureZzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(String str, zzbky zzbkyVar) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzgee.zzr(listenableFuture, new zzdpo(this, str, zzbkyVar), this.zzf);
    }

    public final void zzm(WeakReference weakReference, String str, zzbky zzbkyVar) {
        zzl(str, new zzdpw(this, weakReference, str, zzbkyVar, null));
    }

    public final synchronized void zzn(String str, zzbky zzbkyVar) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzgee.zzr(listenableFuture, new zzdpp(this, str, zzbkyVar), this.zzf);
    }
}
