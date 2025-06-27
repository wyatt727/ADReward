package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfcj implements zzfir {
    public final zzfdd zza;
    public final zzfdf zzb;
    public final com.google.android.gms.ads.internal.client.zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzw zzf;
    public final zzfig zzg;

    public zzfcj(zzfdd zzfddVar, zzfdf zzfdfVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzw zzwVar, zzfig zzfigVar) {
        this.zza = zzfddVar;
        this.zzb = zzfdfVar;
        this.zzc = zzlVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzwVar;
        this.zzg = zzfigVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final zzfig zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final Executor zzb() {
        return this.zze;
    }
}
