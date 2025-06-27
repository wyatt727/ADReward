package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgnb implements zzgfu {
    final String zza;
    final Class zzb;
    final zzguo zzc;
    final zzhbt zzd;

    zzgnb(String str, Class cls, zzguo zzguoVar, zzhbt zzhbtVar) {
        this.zzd = zzhbtVar;
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzguoVar;
    }

    public static zzgfu zzd(String str, Class cls, zzguo zzguoVar, zzhbt zzhbtVar) {
        return new zzgnb(str, cls, zzguoVar, zzhbtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgfu
    public final zzgup zza(zzgyj zzgyjVar) throws GeneralSecurityException {
        zzgut zzgutVarZza = zzguu.zza();
        zzgutVarZza.zzb(this.zza);
        zzgutVarZza.zzc(zzgyjVar);
        zzgutVarZza.zza(zzgvv.RAW);
        zzgoy zzgoyVarZzd = zzgnu.zzc().zzd(zzgnk.zzb().zza(zzgnu.zzc().zzb(zzgou.zza((zzguu) zzgutVarZza.zzbr())), null), zzgot.class, zzgfs.zza());
        zzgum zzgumVarZza = zzgup.zza();
        zzgot zzgotVar = (zzgot) zzgoyVarZzd;
        zzgumVarZza.zzb(zzgotVar.zzg());
        zzgumVarZza.zzc(zzgotVar.zze());
        zzgumVarZza.zza(zzgotVar.zzb());
        return (zzgup) zzgumVarZza.zzbr();
    }

    @Override // com.google.android.gms.internal.ads.zzgfu
    public final Class zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgfu
    public final Object zzc(zzgyj zzgyjVar) throws GeneralSecurityException {
        return zzgnr.zza().zzc(zzgnu.zzc().zza(zzgot.zza(this.zza, zzgyjVar, this.zzc, zzgvv.RAW, null), zzgfs.zza()), this.zzb);
    }
}
