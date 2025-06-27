package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgkp extends zzggs {
    private final zzgkv zza;
    private final zzgxn zzb;
    private final zzgxm zzc;

    @Nullable
    private final Integer zzd;

    private zzgkp(zzgkv zzgkvVar, zzgxn zzgxnVar, zzgxm zzgxmVar, @Nullable Integer num) {
        this.zza = zzgkvVar;
        this.zzb = zzgxnVar;
        this.zzc = zzgxmVar;
        this.zzd = num;
    }

    public static zzgkp zza(zzgku zzgkuVar, zzgxn zzgxnVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgxm zzgxmVarZzb;
        zzgku zzgkuVar2 = zzgku.zzc;
        if (zzgkuVar != zzgkuVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + zzgkuVar.toString() + " the value of idRequirement must be non-null");
        }
        if (zzgkuVar == zzgkuVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgxnVar.zza() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgxnVar.zza());
        }
        zzgkv zzgkvVarZzc = zzgkv.zzc(zzgkuVar);
        if (zzgkvVarZzc.zzb() == zzgkuVar2) {
            zzgxmVarZzb = zzgxm.zzb(new byte[0]);
        } else if (zzgkvVarZzc.zzb() == zzgku.zzb) {
            zzgxmVarZzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (zzgkvVarZzc.zzb() != zzgku.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgkvVarZzc.zzb().toString()));
            }
            zzgxmVarZzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new zzgkp(zzgkvVarZzc, zzgxnVar, zzgxmVarZzb, num);
    }

    public final zzgkv zzb() {
        return this.zza;
    }

    public final zzgxm zzc() {
        return this.zzc;
    }

    public final zzgxn zzd() {
        return this.zzb;
    }

    @Nullable
    public final Integer zze() {
        return this.zzd;
    }
}
