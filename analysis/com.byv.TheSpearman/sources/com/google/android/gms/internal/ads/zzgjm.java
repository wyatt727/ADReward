package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgjm implements zzgfj {
    private static final byte[] zza = new byte[0];
    private static final Set zzb;
    private final String zzc;
    private final zzggi zzd;
    private final zzgfj zze;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    zzgjm(zzguu zzguuVar, zzgfj zzgfjVar) throws GeneralSecurityException {
        if (zzb.contains(zzguuVar.zzi())) {
            this.zzc = zzguuVar.zzi();
            zzgut zzgutVarZzc = zzguu.zzc(zzguuVar);
            zzgutVarZzc.zza(zzgvv.RAW);
            this.zzd = zzggp.zza(((zzguu) zzgutVarZzc.zzbr()).zzaV());
            this.zze = zzgfjVar;
            return;
        }
        throw new IllegalArgumentException("Unsupported DEK key type: " + zzguuVar.zzi() + ". Only Tink AEAD key types are supported.");
    }

    @Override // com.google.android.gms.internal.ads.zzgfj
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrZza = this.zze.zza(bArr3, zza);
            String str = this.zzc;
            zzgyj zzgyjVar = zzgyj.zzb;
            return ((zzgfj) zzgnr.zza().zzc(zzgnu.zzc().zza(zzgot.zza(str, zzgyj.zzv(bArrZza, 0, bArrZza.length), zzguo.SYMMETRIC, zzgvv.RAW, null), zzgfs.zza()), zzgfj.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
