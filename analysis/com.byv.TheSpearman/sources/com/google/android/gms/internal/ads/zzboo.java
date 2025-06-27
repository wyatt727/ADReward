package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzboo implements zzbky {
    final /* synthetic */ zzbnx zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzcc zzb;
    final /* synthetic */ zzbpc zzc;

    zzboo(zzbpc zzbpcVar, zzawo zzawoVar, zzbnx zzbnxVar, com.google.android.gms.ads.internal.util.zzcc zzccVar) {
        this.zza = zzbnxVar;
        this.zzb = zzccVar;
        this.zzc = zzbpcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbky, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        synchronized (this.zzc.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
            com.google.android.gms.ads.internal.util.client.zzm.zzi("JS Engine is requesting an update");
            if (this.zzc.zzi == 0) {
                com.google.android.gms.ads.internal.util.client.zzm.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", this.zzb.zza());
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
