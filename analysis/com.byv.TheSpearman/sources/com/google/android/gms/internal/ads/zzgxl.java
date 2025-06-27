package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgxl implements zzgfj {
    private final zzgma zza;
    private final byte[] zzb;

    private zzgxl(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.zza = new zzgma(bArr);
        this.zzb = bArr2;
    }

    public static zzgfj zzb(zzgkp zzgkpVar) throws GeneralSecurityException {
        return new zzgxl(zzgkpVar.zzd().zzd(zzgfs.zza()), zzgkpVar.zzc().zzc());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.zza.zzb(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzgfj
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (!zzgpi.zzb(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.zzb;
        return zzc(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
