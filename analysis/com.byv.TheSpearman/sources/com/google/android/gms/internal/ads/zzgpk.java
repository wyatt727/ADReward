package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgpk {

    @Nullable
    private zzgpv zza = null;

    @Nullable
    private zzgxn zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgpk() {
    }

    /* synthetic */ zzgpk(zzgpj zzgpjVar) {
    }

    public final zzgpk zza(zzgxn zzgxnVar) throws GeneralSecurityException {
        this.zzb = zzgxnVar;
        return this;
    }

    public final zzgpk zzb(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgpk zzc(zzgpv zzgpvVar) {
        this.zza = zzgpvVar;
        return this;
    }

    public final zzgpm zzd() throws GeneralSecurityException {
        zzgxn zzgxnVar;
        zzgxm zzgxmVarZzb;
        zzgpv zzgpvVar = this.zza;
        if (zzgpvVar == null || (zzgxnVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgpvVar.zzc() != zzgxnVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgpvVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzgpt.zzd) {
            zzgxmVarZzb = zzgxm.zzb(new byte[0]);
        } else if (this.zza.zzf() == zzgpt.zzc || this.zza.zzf() == zzgpt.zzb) {
            zzgxmVarZzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzf() != zzgpt.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzf()))));
            }
            zzgxmVarZzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzgpm(this.zza, this.zzb, zzgxmVarZzb, this.zzc, null);
    }
}
