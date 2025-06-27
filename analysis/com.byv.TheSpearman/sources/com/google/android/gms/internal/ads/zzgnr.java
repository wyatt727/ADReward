package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgnr {
    private static final zzgnr zza = new zzgnr();
    private final AtomicReference zzb = new AtomicReference(new zzgom(new zzgoi(null), null));

    zzgnr() {
    }

    public static zzgnr zza() {
        return zza;
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        return ((zzgom) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzgft zzgftVar, Class cls) throws GeneralSecurityException {
        return ((zzgom) this.zzb.get()).zzb(zzgftVar, cls);
    }

    public final Object zzd(zzgos zzgosVar, Class cls) throws GeneralSecurityException {
        return ((zzgom) this.zzb.get()).zzc(zzgosVar, cls);
    }

    public final synchronized void zze(zzgog zzgogVar) throws GeneralSecurityException {
        zzgoi zzgoiVar = new zzgoi((zzgom) this.zzb.get(), null);
        zzgoiVar.zza(zzgogVar);
        this.zzb.set(new zzgom(zzgoiVar, null));
    }

    public final synchronized void zzf(zzggj zzggjVar) throws GeneralSecurityException {
        zzgoi zzgoiVar = new zzgoi((zzgom) this.zzb.get(), null);
        zzgoiVar.zzb(zzggjVar);
        this.zzb.set(new zzgom(zzgoiVar, null));
    }
}
