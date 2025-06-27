package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcxq implements zzdae, zzczl {
    private final Context zza;
    private final zzffn zzb;
    private final zzbuu zzc;

    public zzcxq(Context context, zzffn zzffnVar, zzbuu zzbuuVar) {
        this.zza = context;
        this.zzb = zzffnVar;
        this.zzc = zzbuuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzdj(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzdl(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzdm(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdae
    public final void zzs() {
        zzbuv zzbuvVar = this.zzb.zzae;
        if (zzbuvVar == null || !zzbuvVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zzb.zzae.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zzb.zzae.zzb);
    }
}
