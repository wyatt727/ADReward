package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzvq {
    public final int zza;
    public final zzvh zzb;
    private final CopyOnWriteArrayList zzc;

    public zzvq() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzvq(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzvh zzvhVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzvhVar;
    }

    public final zzvq zza(int i, zzvh zzvhVar) {
        return new zzvq(this.zzc, 0, zzvhVar);
    }

    public final void zzb(Handler handler, zzvr zzvrVar) {
        this.zzc.add(new zzvp(handler, zzvrVar));
    }

    public final void zzc(final zzvd zzvdVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvp zzvpVar = (zzvp) it.next();
            final zzvr zzvrVar = zzvpVar.zzb;
            zzfx.zzN(zzvpVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvk
                @Override // java.lang.Runnable
                public final void run() {
                    zzvrVar.zzae(0, this.zza.zzb, zzvdVar);
                }
            });
        }
    }

    public final void zzd(final zzuy zzuyVar, final zzvd zzvdVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvp zzvpVar = (zzvp) it.next();
            final zzvr zzvrVar = zzvpVar.zzb;
            zzfx.zzN(zzvpVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvo
                @Override // java.lang.Runnable
                public final void run() {
                    zzvrVar.zzaf(0, this.zza.zzb, zzuyVar, zzvdVar);
                }
            });
        }
    }

    public final void zze(final zzuy zzuyVar, final zzvd zzvdVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvp zzvpVar = (zzvp) it.next();
            final zzvr zzvrVar = zzvpVar.zzb;
            zzfx.zzN(zzvpVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvm
                @Override // java.lang.Runnable
                public final void run() {
                    zzvrVar.zzag(0, this.zza.zzb, zzuyVar, zzvdVar);
                }
            });
        }
    }

    public final void zzf(final zzuy zzuyVar, final zzvd zzvdVar, final IOException iOException, final boolean z) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvp zzvpVar = (zzvp) it.next();
            final zzvr zzvrVar = zzvpVar.zzb;
            zzfx.zzN(zzvpVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvn
                @Override // java.lang.Runnable
                public final void run() {
                    zzvrVar.zzah(0, this.zza.zzb, zzuyVar, zzvdVar, iOException, z);
                }
            });
        }
    }

    public final void zzg(final zzuy zzuyVar, final zzvd zzvdVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvp zzvpVar = (zzvp) it.next();
            final zzvr zzvrVar = zzvpVar.zzb;
            zzfx.zzN(zzvpVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvl
                @Override // java.lang.Runnable
                public final void run() {
                    zzvrVar.zzai(0, this.zza.zzb, zzuyVar, zzvdVar);
                }
            });
        }
    }

    public final void zzh(zzvr zzvrVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvp zzvpVar = (zzvp) it.next();
            if (zzvpVar.zzb == zzvrVar) {
                this.zzc.remove(zzvpVar);
            }
        }
    }
}
