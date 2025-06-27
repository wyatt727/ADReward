package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzewc implements zzewr {
    private final zzcad zza;
    private final zzgep zzb;
    private final Context zzc;

    public zzewc(zzcad zzcadVar, zzgep zzgepVar, Context context) {
        this.zza = zzcadVar;
        this.zzb = zzgepVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzewd zzc() throws Exception {
        if (!this.zza.zzp(this.zzc)) {
            return new zzewd(null, null, null, null, null);
        }
        String strZzd = this.zza.zzd(this.zzc);
        String str = strZzd == null ? "" : strZzd;
        String strZzb = this.zza.zzb(this.zzc);
        String str2 = strZzb == null ? "" : strZzb;
        String strZza = this.zza.zza(this.zzc);
        String str3 = strZza == null ? "" : strZza;
        String str4 = true != this.zza.zzp(this.zzc) ? null : "fa";
        return new zzewd(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaf) : null);
    }
}
