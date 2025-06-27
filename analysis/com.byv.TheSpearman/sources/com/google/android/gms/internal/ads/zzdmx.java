package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdmx implements zzczk {
    private final zzdky zza;
    private final zzdld zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdmx(zzdky zzdkyVar, zzdld zzdldVar, Executor executor, Executor executor2) {
        this.zza = zzdkyVar;
        this.zzb = zzdldVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final zzcgm zzcgmVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmv
            @Override // java.lang.Runnable
            public final void run() {
                zzcgmVar.zzd("onSdkImpression", new ArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final void zzr() {
        if (this.zzb.zzd()) {
            zzdky zzdkyVar = this.zza;
            zzfmy zzfmyVarZzu = zzdkyVar.zzu();
            if (zzfmyVarZzu == null && zzdkyVar.zzw() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfc)).booleanValue()) {
                zzdky zzdkyVar2 = this.zza;
                ListenableFuture listenableFutureZzw = zzdkyVar2.zzw();
                zzcbw zzcbwVarZzp = zzdkyVar2.zzp();
                if (listenableFutureZzw == null || zzcbwVarZzp == null) {
                    return;
                }
                zzgee.zzr(zzgee.zzl(listenableFutureZzw, zzcbwVarZzp), new zzdmw(this), this.zzd);
                return;
            }
            if (zzfmyVarZzu != null) {
                zzdky zzdkyVar3 = this.zza;
                zzcgm zzcgmVarZzr = zzdkyVar3.zzr();
                zzcgm zzcgmVarZzs = zzdkyVar3.zzs();
                if (zzcgmVarZzr == null) {
                    zzcgmVarZzr = zzcgmVarZzs != null ? zzcgmVarZzs : null;
                }
                if (zzcgmVarZzr != null) {
                    zzb(zzcgmVarZzr);
                }
            }
        }
    }
}
