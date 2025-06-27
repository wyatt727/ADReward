package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgz {
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public zzgz() {
        this.zzb = Collections.emptyMap();
        this.zzd = -1L;
    }

    /* synthetic */ zzgz(zzhb zzhbVar, zzgy zzgyVar) {
        this.zza = zzhbVar.zza;
        this.zzb = zzhbVar.zzd;
        this.zzc = zzhbVar.zze;
        this.zzd = zzhbVar.zzf;
        this.zze = zzhbVar.zzg;
    }

    public final zzgz zza(int i) {
        this.zze = 6;
        return this;
    }

    public final zzgz zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzgz zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzgz zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzhb zze() {
        if (this.zza != null) {
            return new zzhb(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
