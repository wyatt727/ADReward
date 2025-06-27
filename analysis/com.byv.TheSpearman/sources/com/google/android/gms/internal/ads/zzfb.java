package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfb {
    private final zzel zza;
    private final zzev zzb;
    private final zzez zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzfb(Looper looper, zzel zzelVar, zzez zzezVar) {
        this(new CopyOnWriteArraySet(), looper, zzelVar, zzezVar, true);
    }

    public static /* synthetic */ boolean zzg(zzfb zzfbVar, Message message) {
        Iterator it = zzfbVar.zzd.iterator();
        while (it.hasNext()) {
            ((zzfa) it.next()).zzb(zzfbVar.zzc);
            if (zzfbVar.zzb.zzg(0)) {
                return true;
            }
        }
        return true;
    }

    private final void zzh() {
        if (this.zzi) {
            zzek.zzf(Thread.currentThread() == this.zzb.zza().getThread());
        }
    }

    public final zzfb zza(Looper looper, zzez zzezVar) {
        return new zzfb(this.zzd, looper, this.zza, zzezVar, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            if (this.zzh) {
                return;
            }
            this.zzd.add(new zzfa(obj));
        }
    }

    public final void zzc() {
        zzh();
        if (this.zzf.isEmpty()) {
            return;
        }
        if (!this.zzb.zzg(0)) {
            zzev zzevVar = this.zzb;
            zzevVar.zzk(zzevVar.zzb(0));
        }
        boolean z = !this.zze.isEmpty();
        this.zze.addAll(this.zzf);
        this.zzf.clear();
        if (z) {
            return;
        }
        while (!this.zze.isEmpty()) {
            ((Runnable) this.zze.peekFirst()).run();
            this.zze.removeFirst();
        }
    }

    public final void zzd(final int i, final zzey zzeyVar) {
        zzh();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzex
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    zzey zzeyVar2 = zzeyVar;
                    ((zzfa) it.next()).zza(i, zzeyVar2);
                }
            }
        });
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzfa) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            zzfa zzfaVar = (zzfa) it.next();
            if (zzfaVar.zza.equals(obj)) {
                zzfaVar.zzc(this.zzc);
                this.zzd.remove(zzfaVar);
            }
        }
    }

    private zzfb(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzel zzelVar, zzez zzezVar, boolean z) {
        this.zza = zzelVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzezVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzelVar.zzb(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzew
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzfb.zzg(this.zza, message);
                return true;
            }
        });
        this.zzi = z;
    }
}
