package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgpf {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    /* synthetic */ zzgpf(zzgoz zzgozVar, zzgpe zzgpeVar) {
        this.zza = new HashMap(zzgozVar.zza);
        this.zzb = new HashMap(zzgozVar.zzb);
        this.zzc = new HashMap(zzgozVar.zzc);
        this.zzd = new HashMap(zzgozVar.zzd);
    }

    public final zzgft zza(zzgoy zzgoyVar, @Nullable zzggn zzggnVar) throws GeneralSecurityException {
        zzgpb zzgpbVar = new zzgpb(zzgoyVar.getClass(), zzgoyVar.zzd(), null);
        if (this.zzb.containsKey(zzgpbVar)) {
            return ((zzgmw) this.zzb.get(zzgpbVar)).zza(zzgoyVar, zzggnVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + zzgpbVar.toString() + " available");
    }

    public final zzggi zzb(zzgoy zzgoyVar) throws GeneralSecurityException {
        zzgpb zzgpbVar = new zzgpb(zzgoyVar.getClass(), zzgoyVar.zzd(), null);
        if (this.zzd.containsKey(zzgpbVar)) {
            return ((zzgny) this.zzd.get(zzgpbVar)).zza(zzgoyVar);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + zzgpbVar.toString() + " available");
    }

    public final zzgoy zzc(zzgft zzgftVar, Class cls, @Nullable zzggn zzggnVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzgftVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgpdVar)) {
            return ((zzgna) this.zza.get(zzgpdVar)).zza(zzgftVar, zzggnVar);
        }
        throw new GeneralSecurityException("No Key serializer for " + zzgpdVar.toString() + " available");
    }

    public final zzgoy zzd(zzggi zzggiVar, Class cls) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzggiVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzgpdVar)) {
            return ((zzgoc) this.zzc.get(zzgpdVar)).zza(zzggiVar);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + zzgpdVar.toString() + " available");
    }

    public final boolean zzi(zzgoy zzgoyVar) {
        return this.zzb.containsKey(new zzgpb(zzgoyVar.getClass(), zzgoyVar.zzd(), null));
    }

    public final boolean zzj(zzgoy zzgoyVar) {
        return this.zzd.containsKey(new zzgpb(zzgoyVar.getClass(), zzgoyVar.zzd(), null));
    }
}
