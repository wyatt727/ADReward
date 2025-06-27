package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzir {
    private final zzjc zza;
    private final byte[] zzb;

    public final zzii zza() {
        this.zza.zzb();
        return new zziv(this.zzb);
    }

    public final zzjc zzb() {
        return this.zza;
    }

    private zzir(int i) {
        byte[] bArr = new byte[i];
        this.zzb = bArr;
        this.zza = zzjc.zzb(bArr);
    }
}
