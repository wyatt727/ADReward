package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgim {

    @Nullable
    private zzgix zza = null;

    @Nullable
    private zzgxn zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgim() {
    }

    /* synthetic */ zzgim(zzgil zzgilVar) {
    }

    public final zzgim zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgim zzb(zzgxn zzgxnVar) {
        this.zzb = zzgxnVar;
        return this;
    }

    public final zzgim zzc(zzgix zzgixVar) {
        this.zza = zzgixVar;
        return this;
    }

    public final zzgio zzd() throws GeneralSecurityException {
        zzgxn zzgxnVar;
        zzgxm zzgxmVarZzb;
        zzgix zzgixVar = this.zza;
        if (zzgixVar == null || (zzgxnVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgixVar.zzb() != zzgxnVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgixVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgiv.zzc) {
            zzgxmVarZzb = zzgxm.zzb(new byte[0]);
        } else if (this.zza.zzd() == zzgiv.zzb) {
            zzgxmVarZzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzd() != zzgiv.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzd()))));
            }
            zzgxmVarZzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzgio(this.zza, this.zzb, zzgxmVarZzb, this.zzc, null);
    }
}
