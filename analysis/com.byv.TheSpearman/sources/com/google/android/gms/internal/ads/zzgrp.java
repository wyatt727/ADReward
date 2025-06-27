package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgrp implements zzggh {
    private final zzggh zza;
    private final zzgvv zzb;
    private final byte[] zzc;

    private zzgrp(zzggh zzgghVar, zzgvv zzgvvVar, byte[] bArr) {
        this.zza = zzgghVar;
        this.zzb = zzgvvVar;
        this.zzc = bArr;
    }

    public static zzggh zza(zzgnd zzgndVar) throws GeneralSecurityException {
        byte[] bArrArray;
        zzgot zzgotVarZza = zzgndVar.zza(zzgfs.zza());
        zzgum zzgumVarZza = zzgup.zza();
        zzgumVarZza.zzb(zzgotVarZza.zzg());
        zzgumVarZza.zzc(zzgotVarZza.zze());
        zzgumVarZza.zza(zzgotVarZza.zzb());
        zzggh zzgghVar = (zzggh) zzggm.zzb((zzgup) zzgumVarZza.zzbr(), zzggh.class);
        zzgvv zzgvvVarZzc = zzgotVarZza.zzc();
        zzgvv zzgvvVar = zzgvv.UNKNOWN_PREFIX;
        int iOrdinal = zzgvvVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgndVar.zzb().intValue()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgndVar.zzb().intValue()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgndVar.zzb().intValue()).array();
        } else {
            bArrArray = new byte[0];
        }
        return new zzgrp(zzgghVar, zzgvvVarZzc, bArrArray);
    }
}
