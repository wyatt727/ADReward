package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfcw implements zzfwf {
    final /* synthetic */ zzfda zza;

    zzfcw(zzfda zzfdaVar) {
        this.zza = zzfdaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        com.google.android.gms.ads.internal.util.client.zzm.zzh("", (zzeal) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfda zzfdaVar = this.zza;
        zzfdaVar.zzd = new zzfcz(null, zzfdaVar.zze(), null);
        return this.zza.zzd;
    }
}
