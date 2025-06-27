package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdwi implements zzgea {
    final /* synthetic */ zzdwk zza;

    zzdwi(zzdwk zzdwkVar) {
        this.zza = zzdwkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zza.zzd));
            this.zza.zze.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zza.zzd));
            this.zza.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwh
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    zzdwk.zzj(this.zza.zza, str);
                }
            });
        }
    }
}
