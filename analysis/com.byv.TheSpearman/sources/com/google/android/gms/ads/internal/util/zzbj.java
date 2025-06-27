package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaqu;
import com.google.android.gms.internal.ads.zzaqz;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
final class zzbj implements zzaqu {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbn zzb;

    zzbj(zzbq zzbqVar, String str, zzbn zzbnVar) {
        this.zza = str;
        this.zzb = zzbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    public final void zza(zzaqz zzaqzVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to load URL: " + this.zza + "\n" + zzaqzVar.toString());
        this.zzb.zza((Object) null);
    }
}
