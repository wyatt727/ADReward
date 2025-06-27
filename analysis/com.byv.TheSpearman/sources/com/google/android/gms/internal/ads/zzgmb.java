package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgmb implements zzgfj {
    private final zzgfj zza;
    private final zzgvv zzb;
    private final byte[] zzc;

    private zzgmb(zzgfj zzgfjVar, zzgvv zzgvvVar, byte[] bArr) {
        this.zza = zzgfjVar;
        this.zzb = zzgvvVar;
        this.zzc = bArr;
    }

    public static zzgfj zzb(zzgnd zzgndVar) throws GeneralSecurityException {
        byte[] bArrArray;
        zzgot zzgotVarZza = zzgndVar.zza(zzgfs.zza());
        zzgum zzgumVarZza = zzgup.zza();
        zzgumVarZza.zzb(zzgotVarZza.zzg());
        zzgumVarZza.zzc(zzgotVarZza.zze());
        zzgumVarZza.zza(zzgotVarZza.zzb());
        zzgfj zzgfjVar = (zzgfj) zzggm.zzb((zzgup) zzgumVarZza.zzbr(), zzgfj.class);
        zzgvv zzgvvVarZzc = zzgotVarZza.zzc();
        zzgvv zzgvvVar = zzgvv.UNKNOWN_PREFIX;
        int iOrdinal = zzgvvVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgndVar.zzb().intValue()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgndVar.zzb().intValue()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(zzgvvVarZzc))));
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgndVar.zzb().intValue()).array();
        } else {
            bArrArray = new byte[0];
        }
        return new zzgmb(zzgfjVar, zzgvvVarZzc, bArrArray);
    }

    @Override // com.google.android.gms.internal.ads.zzgfj
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.zzb == zzgvv.RAW) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgpi.zzb(this.zzc, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
