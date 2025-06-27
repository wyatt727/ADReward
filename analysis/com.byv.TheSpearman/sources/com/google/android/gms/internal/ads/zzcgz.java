package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzcgz {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzcgm, java.lang.Object] */
    public static final zzcgm zza(final Context context, final zzcie zzcieVar, final String str, final boolean z, final boolean z2, final zzawo zzawoVar, final zzbfc zzbfcVar, final VersionInfoParcel versionInfoParcel, zzbeo zzbeoVar, final com.google.android.gms.ads.internal.zzm zzmVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzbcx zzbcxVar, final zzffn zzffnVar, final zzffq zzffqVar, final zzefo zzefoVar, final zzfgm zzfgmVar) throws zzcgy {
        zzbdz.zza(context);
        try {
            final zzbeo zzbeoVar2 = null;
            zzfxh zzfxhVar = new zzfxh(context, zzcieVar, str, z, z2, zzawoVar, zzbfcVar, versionInfoParcel, zzbeoVar2, zzmVar, zzaVar, zzbcxVar, zzffnVar, zzffqVar, zzfgmVar, zzefoVar) { // from class: com.google.android.gms.internal.ads.zzcgv
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcie zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzawo zzf;
                public final /* synthetic */ zzbfc zzg;
                public final /* synthetic */ VersionInfoParcel zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzm zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzbcx zzk;
                public final /* synthetic */ zzffn zzl;
                public final /* synthetic */ zzffq zzm;
                public final /* synthetic */ zzfgm zzn;
                public final /* synthetic */ zzefo zzo;

                {
                    this.zzi = zzmVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbcxVar;
                    this.zzl = zzffnVar;
                    this.zzm = zzffqVar;
                    this.zzn = zzfgmVar;
                    this.zzo = zzefoVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfxh
                public final Object zza() {
                    zzcie zzcieVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    zzbcx zzbcxVar2 = this.zzk;
                    boolean z4 = this.zze;
                    zzawo zzawoVar2 = this.zzf;
                    zzffn zzffnVar2 = this.zzl;
                    zzbfc zzbfcVar2 = this.zzg;
                    com.google.android.gms.ads.internal.zzm zzmVar2 = this.zzi;
                    zzffq zzffqVar2 = this.zzm;
                    Context context2 = this.zza;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzfgm zzfgmVar2 = this.zzn;
                    zzefo zzefoVar2 = this.zzo;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzchj.zza;
                        zzchc zzchcVar = new zzchc(new zzchj(new zzcid(context2), zzcieVar2, str2, z3, z4, zzawoVar2, zzbfcVar2, versionInfoParcel2, null, zzmVar2, zzaVar2, zzbcxVar2, zzffnVar2, zzffqVar2, zzfgmVar2));
                        zzchcVar.setWebViewClient(com.google.android.gms.ads.internal.zzu.zzq().zzc(zzchcVar, zzbcxVar2, z4, zzefoVar2));
                        zzchcVar.setWebChromeClient(new zzcgl(zzchcVar));
                        return zzchcVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return zzfxhVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzcgy("Webview initialization failed.", th);
        }
    }
}
