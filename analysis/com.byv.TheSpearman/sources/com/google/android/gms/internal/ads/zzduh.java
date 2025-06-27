package com.google.android.gms.internal.ads;

import com.json.t2;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzduh {
    private final zzdum zza;
    private final Executor zzb;
    private final Map zzc;

    public zzduh(zzdum zzdumVar, Executor executor) {
        this.zza = zzdumVar;
        this.zzc = zzdumVar.zza();
        this.zzb = executor;
    }

    public final zzdug zza() {
        zzdug zzdugVar = new zzdug(this);
        zzdug.zza(zzdugVar);
        return zzdugVar;
    }

    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlp)).booleanValue()) {
            zzdug zzdugVarZza = zza();
            zzdugVarZza.zzb(t2.h.h, "pecr");
            zzdugVarZza.zzf();
        }
    }
}
