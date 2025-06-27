package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzctb extends zzcrm {
    private final zzbiv zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzctb(zzctu zzctuVar, zzbiv zzbivVar, Runnable runnable, Executor executor) {
        super(zzctuVar);
        this.zzc = zzbivVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    static /* synthetic */ void zzi(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrm
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcrm
    public final View zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcrm
    public final com.google.android.gms.ads.internal.client.zzdq zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcrm
    public final zzffo zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcrm
    public final zzffo zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcrm
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcrm
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    public final void zzj() {
        final zzcsz zzcszVar = new zzcsz(new AtomicReference(this.zzd));
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcta
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk(zzcszVar);
            }
        });
    }

    final /* synthetic */ void zzk(Runnable runnable) {
        try {
            if (this.zzc.zze(ObjectWrapper.wrap(runnable))) {
                return;
            }
            zzi(((zzcsz) runnable).zza);
        } catch (RemoteException unused) {
            zzi(((zzcsz) runnable).zza);
        }
    }
}
