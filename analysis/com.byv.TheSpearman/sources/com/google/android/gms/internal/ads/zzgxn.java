package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgxn {
    private final zzgxm zza;

    private zzgxn(zzgxm zzgxmVar) {
        this.zza = zzgxmVar;
    }

    public static zzgxn zzb(byte[] bArr, zzggn zzggnVar) {
        return new zzgxn(zzgxm.zzb(bArr));
    }

    public static zzgxn zzc(int i) {
        return new zzgxn(zzgxm.zzb(zzgow.zzb(i)));
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zzd(zzggn zzggnVar) {
        return this.zza.zzc();
    }
}
