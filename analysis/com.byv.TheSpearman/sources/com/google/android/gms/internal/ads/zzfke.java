package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfke {
    final /* synthetic */ zzfkf zza;
    private final Object zzb;
    private final String zzc;
    private final ListenableFuture zzd;
    private final List zze;
    private final ListenableFuture zzf;

    private zzfke(zzfkf zzfkfVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        this.zza = zzfkfVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = listenableFuture;
        this.zze = list;
        this.zzf = listenableFuture2;
    }

    public final zzfjs zza() {
        Object obj = this.zzb;
        String strZzf = this.zzc;
        if (strZzf == null) {
            strZzf = this.zza.zzf(obj);
        }
        final zzfjs zzfjsVar = new zzfjs(obj, strZzf, this.zzf);
        this.zza.zzd.zza(zzfjsVar);
        this.zzd.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkb
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.zzd.zzc(zzfjsVar);
            }
        }, zzcbr.zzf);
        zzgee.zzr(zzfjsVar, new zzfkc(this, zzfjsVar), zzcbr.zzf);
        return zzfjsVar;
    }

    public final zzfke zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfke zzc(Class cls, zzgdl zzgdlVar) {
        return new zzfke(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgee.zzf(this.zzf, cls, zzgdlVar, this.zza.zzb));
    }

    public final zzfke zzd(final ListenableFuture listenableFuture) {
        return zzg(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfka
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return listenableFuture;
            }
        }, zzcbr.zzf);
    }

    public final zzfke zze(final zzfjq zzfjqVar) {
        return zzf(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfjz
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzgee.zzh(zzfjqVar.zza(obj));
            }
        });
    }

    public final zzfke zzf(zzgdl zzgdlVar) {
        return zzg(zzgdlVar, this.zza.zzb);
    }

    public final zzfke zzg(zzgdl zzgdlVar, Executor executor) {
        return new zzfke(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgee.zzn(this.zzf, zzgdlVar, executor));
    }

    public final zzfke zzh(String str) {
        return new zzfke(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfke zzi(long j, TimeUnit timeUnit) {
        return new zzfke(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgee.zzo(this.zzf, j, timeUnit, this.zza.zzc));
    }
}
