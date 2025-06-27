package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
abstract class zznh {
    zznh() {
    }

    abstract int zza(int i, byte[] bArr, int i2, int i3);

    abstract int zza(String str, byte[] bArr, int i, int i2);

    abstract String zza(byte[] bArr, int i, int i2) throws zzkd;

    final boolean zzb(byte[] bArr, int i, int i2) {
        return zza(0, bArr, i, i2) == 0;
    }
}
