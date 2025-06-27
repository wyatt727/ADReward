package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzghn {

    @Nullable
    private zzghx zza = null;

    @Nullable
    private zzgxn zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzghn() {
    }

    /* synthetic */ zzghn(zzghm zzghmVar) {
    }

    public final zzghn zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzghn zzb(zzgxn zzgxnVar) {
        this.zzb = zzgxnVar;
        return this;
    }

    public final zzghn zzc(zzghx zzghxVar) {
        this.zza = zzghxVar;
        return this;
    }

    public final zzghp zzd() throws GeneralSecurityException {
        zzgxn zzgxnVar;
        zzgxm zzgxmVarZzb;
        zzghx zzghxVar = this.zza;
        if (zzghxVar == null || (zzgxnVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzghxVar.zzc() != zzgxnVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzghxVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzghv.zzc) {
            zzgxmVarZzb = zzgxm.zzb(new byte[0]);
        } else if (this.zza.zze() == zzghv.zzb) {
            zzgxmVarZzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zze() != zzghv.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zze()))));
            }
            zzgxmVarZzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzghp(this.zza, this.zzb, zzgxmVarZzb, this.zzc, null);
    }
}
