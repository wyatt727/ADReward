package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbpc {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzflk zze;
    private final com.google.android.gms.ads.internal.util.zzbd zzf;
    private final com.google.android.gms.ads.internal.util.zzbd zzg;
    private zzbpb zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbpc(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbd zzbdVar, com.google.android.gms.ads.internal.util.zzbd zzbdVar2, zzflk zzflkVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzflkVar;
        this.zzf = zzbdVar;
        this.zzg = zzbdVar2;
    }

    public final zzbow zzb(zzawo zzawoVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
            com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
            synchronized (this.zza) {
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                zzbpb zzbpbVar = this.zzh;
                if (zzbpbVar != null && this.zzi == 0) {
                    zzbpbVar.zzj(new zzcca() { // from class: com.google.android.gms.internal.ads.zzboi
                        @Override // com.google.android.gms.internal.ads.zzcca
                        public final void zza(Object obj) {
                            this.zza.zzk((zzbnx) obj);
                        }
                    }, new zzcby() { // from class: com.google.android.gms.internal.ads.zzboj
                        @Override // com.google.android.gms.internal.ads.zzcby
                        public final void zza() {
                        }
                    });
                }
            }
            com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
            zzbpb zzbpbVar2 = this.zzh;
            if (zzbpbVar2 != null && zzbpbVar2.zze() != -1) {
                int i = this.zzi;
                if (i == 0) {
                    com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                    return this.zzh.zza();
                }
                if (i != 1) {
                    com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                    return this.zzh.zza();
                }
                this.zzi = 2;
                zzd(null);
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            this.zzh = zzd(null);
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
            return this.zzh.zza();
        }
    }

    protected final zzbpb zzd(zzawo zzawoVar) {
        zzfkw zzfkwVarZza = zzfkv.zza(this.zzb, zzflo.CUI_NAME_SDKINIT_SDKCORE);
        zzfkwVarZza.zzi();
        final zzbpb zzbpbVar = new zzbpb(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzawo zzawoVar2 = null;
        zzcbr.zze.execute(new Runnable(zzawoVar2, zzbpbVar) { // from class: com.google.android.gms.internal.ads.zzbom
            public final /* synthetic */ zzbpb zzb;

            {
                this.zzb = zzbpbVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbpbVar.zzj(new zzbor(this, zzbpbVar, zzfkwVarZza), new zzbos(this, zzbpbVar, zzfkwVarZza));
        return zzbpbVar;
    }

    final /* synthetic */ void zzi(zzbpb zzbpbVar, final zzbnx zzbnxVar, ArrayList arrayList, long j) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (zzbpbVar.zze() != -1 && zzbpbVar.zze() != 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhI)).booleanValue()) {
                    zzbpbVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                } else {
                    zzbpbVar.zzg();
                }
                zzgep zzgepVar = zzcbr.zze;
                Objects.requireNonNull(zzbnxVar);
                zzgepVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbok
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbnxVar.zzc();
                    }
                });
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive /jsLoaded in " + String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzc)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zzbpbVar.zze() + ". Update status(onEngLoadedTimeout) is " + this.zzi + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - j) + " ms. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    final /* synthetic */ void zzj(zzawo zzawoVar, zzbpb zzbpbVar) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            zzbof zzbofVar = new zzbof(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbofVar.zzk(new zzbol(this, arrayList, jCurrentTimeMillis, zzbpbVar, zzbofVar));
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbofVar.zzq("/jsLoaded", new zzbon(this, jCurrentTimeMillis, zzbpbVar, zzbofVar));
            com.google.android.gms.ads.internal.util.zzcc zzccVar = new com.google.android.gms.ads.internal.util.zzcc();
            zzboo zzbooVar = new zzboo(this, null, zzbofVar, zzccVar);
            zzccVar.zzb(zzbooVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbofVar.zzq("/requestReload", zzbooVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.zzc)));
            if (this.zzc.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbofVar.zzh(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.zzc.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbofVar.zzf(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbofVar.zzg(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new zzboq(this, zzbpbVar, zzbofVar, arrayList, jCurrentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzd)).intValue());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating webview.", th);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhI)).booleanValue()) {
                zzbpbVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
            } else {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbpbVar.zzg();
            }
        }
    }

    final /* synthetic */ void zzk(zzbnx zzbnxVar) {
        if (zzbnxVar.zzi()) {
            this.zzi = 1;
        }
    }
}
