package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdaz extends zzdee implements zzczk, zzdap {
    private final zzffn zzb;
    private final AtomicBoolean zzc;

    public zzdaz(Set set, zzffn zzffnVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzffnVar;
    }

    private final void zzb() {
        com.google.android.gms.ads.internal.client.zzs zzsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhM)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzsVar = this.zzb.zzaf) != null && zzsVar.zza == 3) {
            zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzday
                @Override // com.google.android.gms.internal.ads.zzded
                public final void zza(Object obj) throws Exception {
                    this.zza.zza((zzdbb) obj);
                }
            });
        }
    }

    final /* synthetic */ void zza(zzdbb zzdbbVar) throws Exception {
        zzdbbVar.zzh(this.zzb.zzaf);
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final void zzr() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
