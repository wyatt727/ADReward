package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzamv implements Comparable {
    public final int zza;
    public final zzamp zzb;

    public zzamv(int i, zzamp zzampVar) {
        this.zza = i;
        this.zzb = zzampVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzamv) obj).zza);
    }
}
