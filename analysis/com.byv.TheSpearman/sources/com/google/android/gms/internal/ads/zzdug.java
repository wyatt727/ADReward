package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdug {
    final /* synthetic */ zzduh zza;
    private final Map zzb = new ConcurrentHashMap();

    zzdug(zzduh zzduhVar) {
        this.zza = zzduhVar;
    }

    static /* bridge */ /* synthetic */ zzdug zza(zzdug zzdugVar) {
        zzdugVar.zzb.putAll(zzdugVar.zza.zzc);
        return zzdugVar;
    }

    public final zzdug zzb(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdug zzc(zzffn zzffnVar) {
        zzb("aai", zzffnVar.zzx);
        zzb("request_id", zzffnVar.zzao);
        zzb(FirebaseAnalytics.Param.AD_FORMAT, zzffn.zza(zzffnVar.zzb));
        return this;
    }

    public final zzdug zzd(zzffq zzffqVar) {
        zzb("gqi", zzffqVar.zzb);
        return this;
    }

    public final String zze() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzf() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdue
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh();
            }
        });
    }

    public final void zzg() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi();
            }
        });
    }

    final /* synthetic */ void zzh() {
        this.zza.zza.zzf(this.zzb);
    }

    final /* synthetic */ void zzi() {
        this.zza.zza.zze(this.zzb);
    }
}
