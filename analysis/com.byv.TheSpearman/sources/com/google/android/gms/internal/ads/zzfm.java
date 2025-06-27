package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfm {
    private static zzfm zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzfm(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzfl(this, null), intentFilter);
    }

    public static synchronized zzfm zzb(Context context) {
        if (zza == null) {
            zza = new zzfm(context);
        }
        return zza;
    }

    static /* synthetic */ void zzc(zzfm zzfmVar, int i) {
        synchronized (zzfmVar.zzd) {
            if (zzfmVar.zze == i) {
                return;
            }
            zzfmVar.zze = i;
            Iterator it = zzfmVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zzzp zzzpVar = (zzzp) weakReference.get();
                if (zzzpVar != null) {
                    zzzpVar.zza.zzk(i);
                } else {
                    zzfmVar.zzc.remove(weakReference);
                }
            }
        }
    }

    public final int zza() {
        int i;
        synchronized (this.zzd) {
            i = this.zze;
        }
        return i;
    }

    public final void zzd(final zzzp zzzpVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzzpVar));
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfi
            @Override // java.lang.Runnable
            public final void run() {
                zzzpVar.zza.zzk(this.zza.zza());
            }
        });
    }
}
