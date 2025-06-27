package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgot implements zzgoy {
    private final String zza;
    private final zzgxm zzb;
    private final zzgyj zzc;
    private final zzguo zzd;
    private final zzgvv zze;

    @Nullable
    private final Integer zzf;

    private zzgot(String str, zzgyj zzgyjVar, zzguo zzguoVar, zzgvv zzgvvVar, @Nullable Integer num) {
        this.zza = str;
        this.zzb = zzgpi.zza(str);
        this.zzc = zzgyjVar;
        this.zzd = zzguoVar;
        this.zze = zzgvvVar;
        this.zzf = num;
    }

    public static zzgot zza(String str, zzgyj zzgyjVar, zzguo zzguoVar, zzgvv zzgvvVar, @Nullable Integer num) throws GeneralSecurityException {
        if (zzgvvVar == zzgvv.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgot(str, zzgyjVar, zzguoVar, zzgvvVar, num);
    }

    public final zzguo zzb() {
        return this.zzd;
    }

    public final zzgvv zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgoy
    public final zzgxm zzd() {
        return this.zzb;
    }

    public final zzgyj zze() {
        return this.zzc;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
