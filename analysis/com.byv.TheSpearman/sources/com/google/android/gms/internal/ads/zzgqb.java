package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgqb {

    @Nullable
    private zzgqo zza = null;

    @Nullable
    private zzgxn zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgqb() {
    }

    /* synthetic */ zzgqb(zzgqa zzgqaVar) {
    }

    public final zzgqb zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgqb zzb(zzgxn zzgxnVar) {
        this.zzb = zzgxnVar;
        return this;
    }

    public final zzgqb zzc(zzgqo zzgqoVar) {
        this.zza = zzgqoVar;
        return this;
    }

    public final zzgqd zzd() throws GeneralSecurityException {
        zzgxn zzgxnVar;
        zzgxm zzgxmVarZzb;
        zzgqo zzgqoVar = this.zza;
        if (zzgqoVar == null || (zzgxnVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgqoVar.zzc() != zzgxnVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgqoVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzgqm.zzd) {
            zzgxmVarZzb = zzgxm.zzb(new byte[0]);
        } else if (this.zza.zzg() == zzgqm.zzc || this.zza.zzg() == zzgqm.zzb) {
            zzgxmVarZzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzg() != zzgqm.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzg()))));
            }
            zzgxmVarZzb = zzgxm.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzgqd(this.zza, this.zzb, zzgxmVarZzb, this.zzc, null);
    }
}
