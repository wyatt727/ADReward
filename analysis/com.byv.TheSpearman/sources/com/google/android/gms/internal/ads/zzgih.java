package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgih {

    @Nullable
    private Integer zza = null;

    @Nullable
    private Integer zzb = null;

    @Nullable
    private Integer zzc = null;
    private zzgii zzd = zzgii.zzc;

    private zzgih() {
    }

    /* synthetic */ zzgih(zzgig zzgigVar) {
    }

    public final zzgih zza(int i) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzgih zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgih zzd(zzgii zzgiiVar) {
        this.zzd = zzgiiVar;
        return this;
    }

    public final zzgik zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.zzb.intValue();
        this.zzc.intValue();
        return new zzgik(iIntValue, 12, 16, this.zzd, null);
    }

    public final zzgih zzb(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }
}
