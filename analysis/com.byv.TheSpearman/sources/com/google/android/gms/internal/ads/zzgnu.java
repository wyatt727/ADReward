package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgnu {
    private static final zzgnu zza = (zzgnu) zzgph.zza(new zzgpg() { // from class: com.google.android.gms.internal.ads.zzgns
        @Override // com.google.android.gms.internal.ads.zzgpg
        public final Object zza() throws GeneralSecurityException {
            zzgnu zzgnuVar = new zzgnu();
            zzgnuVar.zzg(new zzgmx(zzgnd.class, zzgot.class, new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgnt
                @Override // com.google.android.gms.internal.ads.zzgmy
                public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                    return ((zzgnd) zzgftVar).zza(zzggnVar);
                }
            }));
            return zzgnuVar;
        }
    });
    private final AtomicReference zzb = new AtomicReference(new zzgpf(new zzgoz(), null));

    public static zzgnu zzc() {
        return zza;
    }

    public final zzgft zza(zzgoy zzgoyVar, @Nullable zzggn zzggnVar) throws GeneralSecurityException {
        return ((zzgpf) this.zzb.get()).zza(zzgoyVar, zzggnVar);
    }

    public final zzggi zzb(zzgoy zzgoyVar) throws GeneralSecurityException {
        return ((zzgpf) this.zzb.get()).zzb(zzgoyVar);
    }

    public final zzgoy zzd(zzgft zzgftVar, Class cls, @Nullable zzggn zzggnVar) throws GeneralSecurityException {
        return ((zzgpf) this.zzb.get()).zzc(zzgftVar, cls, zzggnVar);
    }

    public final zzgoy zze(zzggi zzggiVar, Class cls) throws GeneralSecurityException {
        return ((zzgpf) this.zzb.get()).zzd(zzggiVar, cls);
    }

    public final synchronized void zzf(zzgmw zzgmwVar) throws GeneralSecurityException {
        zzgoz zzgozVar = new zzgoz((zzgpf) this.zzb.get());
        zzgozVar.zza(zzgmwVar);
        this.zzb.set(new zzgpf(zzgozVar, null));
    }

    public final synchronized void zzg(zzgna zzgnaVar) throws GeneralSecurityException {
        zzgoz zzgozVar = new zzgoz((zzgpf) this.zzb.get());
        zzgozVar.zzb(zzgnaVar);
        this.zzb.set(new zzgpf(zzgozVar, null));
    }

    public final synchronized void zzh(zzgny zzgnyVar) throws GeneralSecurityException {
        zzgoz zzgozVar = new zzgoz((zzgpf) this.zzb.get());
        zzgozVar.zzc(zzgnyVar);
        this.zzb.set(new zzgpf(zzgozVar, null));
    }

    public final synchronized void zzi(zzgoc zzgocVar) throws GeneralSecurityException {
        zzgoz zzgozVar = new zzgoz((zzgpf) this.zzb.get());
        zzgozVar.zzd(zzgocVar);
        this.zzb.set(new zzgpf(zzgozVar, null));
    }

    public final boolean zzj(zzgoy zzgoyVar) {
        return ((zzgpf) this.zzb.get()).zzi(zzgoyVar);
    }

    public final boolean zzk(zzgoy zzgoyVar) {
        return ((zzgpf) this.zzb.get()).zzj(zzgoyVar);
    }
}
