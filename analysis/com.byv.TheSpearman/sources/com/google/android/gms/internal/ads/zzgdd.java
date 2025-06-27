package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzgdd extends zzgdj {
    private static final zzgeo zza = new zzgeo(zzgdd.class);

    @CheckForNull
    private zzfzi zzb;
    private final boolean zzc;
    private final boolean zzf;

    zzgdd(zzfzi zzfziVar, boolean z, boolean z2) {
        super(zzfziVar.size());
        Objects.requireNonNull(zzfziVar);
        this.zzb = zzfziVar;
        this.zzc = z;
        this.zzf = z2;
    }

    private final void zzG(int i, Future future) {
        try {
            zzf(i, zzgee.zzp(future));
        } catch (ExecutionException e) {
            zzI(e.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzx(@CheckForNull zzfzi zzfziVar) {
        int iZzA = zzA();
        int i = 0;
        zzfwr.zzk(iZzA >= 0, "Less than 0 remaining futures");
        if (iZzA == 0) {
            if (zzfziVar != null) {
                zzgbt it = zzfziVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private static void zzJ(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    @CheckForNull
    protected final String zza() {
        zzfzi zzfziVar = this.zzb;
        return zzfziVar != null ? "futures=".concat(zzfziVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    protected final void zzb() {
        zzfzi zzfziVar = this.zzb;
        zzy(1);
        if ((zzfziVar != null) && isCancelled()) {
            boolean zZzt = zzt();
            zzgbt it = zzfziVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzt);
            }
        }
    }

    abstract void zzf(int i, Object obj);

    abstract void zzu();

    final void zzv() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzu();
            return;
        }
        if (!this.zzc) {
            final zzfzi zzfziVar = this.zzf ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx(zzfziVar);
                }
            };
            zzgbt it = this.zzb.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).addListener(runnable, zzgds.INSTANCE);
            }
            return;
        }
        zzgbt it2 = this.zzb.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it2.next();
            listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzw(listenableFuture, i);
                }
            }, zzgds.INSTANCE);
            i++;
        }
    }

    final /* synthetic */ void zzw(ListenableFuture listenableFuture, int i) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, listenableFuture);
            }
        } finally {
            zzx(null);
        }
    }

    void zzy(int i) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    final void zze(Set set) {
        Objects.requireNonNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        Objects.requireNonNull(thZzl);
        zzK(set, thZzl);
    }

    private final void zzI(Throwable th) {
        Objects.requireNonNull(th);
        if (this.zzc && !zzd(th) && zzK(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }
}
