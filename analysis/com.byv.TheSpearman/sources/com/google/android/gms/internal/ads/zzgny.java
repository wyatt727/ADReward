package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzgny {
    private final zzgxm zza;
    private final Class zzb;

    /* synthetic */ zzgny(zzgxm zzgxmVar, Class cls, zzgnx zzgnxVar) {
        this.zza = zzgxmVar;
        this.zzb = cls;
    }

    public static zzgny zzb(zzgnw zzgnwVar, zzgxm zzgxmVar, Class cls) {
        return new zzgnv(zzgxmVar, cls, zzgnwVar);
    }

    public abstract zzggi zza(zzgoy zzgoyVar) throws GeneralSecurityException;

    public final zzgxm zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
