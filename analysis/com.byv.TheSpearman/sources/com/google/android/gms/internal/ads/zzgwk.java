package com.google.android.gms.internal.ads;

import android.os.Build;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgwk implements zzgfj {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzgwk(byte[] bArr, zzgxm zzgxmVar) throws GeneralSecurityException {
        if (!zzgml.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgxk.zza(bArr.length);
        this.zza = new SecretKeySpec(bArr, "AES");
        this.zzb = zzgxmVar.zzc();
    }

    public static zzgfj zzb(zzgib zzgibVar) throws GeneralSecurityException {
        return new zzgwk(zzgibVar.zzd().zzd(zzgfs.zza()), zzgibVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgfj
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Objects.requireNonNull(bArr, "ciphertext is null");
        byte[] bArr3 = this.zzb;
        if (bArr.length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgpi.zzb(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, this.zzb.length, bArr4, 0, 12);
        int i = zzglu.zza;
        Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
        if (numValueOf != null) {
            numValueOf.intValue();
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr4, 0, 12);
        SecretKey secretKey = this.zza;
        Cipher cipherZza = zzglu.zza();
        cipherZza.init(2, secretKey, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        return cipherZza.doFinal(bArr, this.zzb.length + 12, (r1 - r8) - 12);
    }
}
