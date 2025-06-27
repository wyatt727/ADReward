package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzggw implements zzgfj {
    private final zzgos zza;
    private final zzgrt zzb;
    private final zzgrt zzc;

    /* synthetic */ zzggw(zzgos zzgosVar, zzggv zzggvVar) {
        zzgrt zzgrtVarZza;
        this.zza = zzgosVar;
        if (zzgosVar.zzg()) {
            zzgru zzgruVarZzb = zzgnp.zza().zzb();
            zzgrz zzgrzVarZza = zzgnh.zza(zzgosVar);
            this.zzb = zzgruVarZzb.zza(zzgrzVarZza, "aead", "encrypt");
            zzgrtVarZza = zzgruVarZzb.zza(zzgrzVarZza, "aead", "decrypt");
        } else {
            zzgrtVarZza = zzgnh.zza;
            this.zzb = zzgrtVarZza;
        }
        this.zzc = zzgrtVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfj
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (zzgoq zzgoqVar : this.zza.zzf(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] bArrZza = ((zzgfj) zzgoqVar.zze()).zza(bArr, bArr2);
                    zzgoqVar.zza();
                    int length = bArr.length;
                    return bArrZza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzgoq zzgoqVar2 : this.zza.zzf(zzgfo.zza)) {
            try {
                byte[] bArrZza2 = ((zzgfj) zzgoqVar2.zze()).zza(bArr, bArr2);
                zzgoqVar2.zza();
                int length2 = bArr.length;
                return bArrZza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
