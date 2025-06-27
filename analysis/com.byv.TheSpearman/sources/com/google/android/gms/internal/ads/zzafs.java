package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzafs {
    protected final zzaem zza;

    protected zzafs(zzaem zzaemVar) {
        this.zza = zzaemVar;
    }

    protected abstract boolean zza(zzfo zzfoVar) throws zzcc;

    protected abstract boolean zzb(zzfo zzfoVar, long j) throws zzcc;

    public final boolean zzf(zzfo zzfoVar, long j) throws zzcc {
        return zza(zzfoVar) && zzb(zzfoVar, j);
    }
}
