package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzhw implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzhq zze;

    zzhw(zzhq zzhqVar, String str, String str2, String str3, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
        this.zze = zzhqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza == null) {
            this.zze.zza.zza(this.zzb, (zzkv) null);
        } else {
            this.zze.zza.zza(this.zzb, new zzkv(this.zzc, this.zza, this.zzd));
        }
    }
}
