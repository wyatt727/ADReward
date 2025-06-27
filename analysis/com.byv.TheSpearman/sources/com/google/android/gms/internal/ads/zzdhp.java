package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzdhp {
    private final zzdiu zza;
    private final zzcgm zzb;

    public zzdhp(zzdiu zzdiuVar, zzcgm zzcgmVar) {
        this.zza = zzdiuVar;
        this.zzb = zzcgmVar;
    }

    public static final zzdgf zzh(zzfkt zzfktVar) {
        return new zzdgf(zzfktVar, zzcbr.zzf);
    }

    public static final zzdgf zzi(zzdiz zzdizVar) {
        return new zzdgf(zzdizVar, zzcbr.zzf);
    }

    public final View zza() {
        zzcgm zzcgmVar = this.zzb;
        if (zzcgmVar == null) {
            return null;
        }
        return zzcgmVar.zzG();
    }

    public final View zzb() {
        zzcgm zzcgmVar = this.zzb;
        if (zzcgmVar != null) {
            return zzcgmVar.zzG();
        }
        return null;
    }

    public final zzcgm zzc() {
        return this.zzb;
    }

    public final zzdgf zzd(Executor executor) {
        final zzcgm zzcgmVar = this.zzb;
        return new zzdgf(new zzddd() { // from class: com.google.android.gms.internal.ads.zzdho
            @Override // com.google.android.gms.internal.ads.zzddd
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL;
                zzcgm zzcgmVar2 = zzcgmVar;
                if (zzcgmVar2 == null || (zzmVarZzL = zzcgmVar2.zzL()) == null) {
                    return;
                }
                zzmVarZzL.zzb();
            }
        }, executor);
    }

    public final zzdiu zze() {
        return this.zza;
    }

    public Set zzf(zzcxn zzcxnVar) {
        return Collections.singleton(new zzdgf(zzcxnVar, zzcbr.zzf));
    }

    public Set zzg(zzcxn zzcxnVar) {
        return Collections.singleton(new zzdgf(zzcxnVar, zzcbr.zzf));
    }
}
