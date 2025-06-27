package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzdee {
    protected final Map zza = new HashMap();

    protected zzdee(Set set) {
        zzp(set);
    }

    public final synchronized void zzk(zzdgf zzdgfVar) {
        zzo(zzdgfVar.zza, zzdgfVar.zzb);
    }

    public final synchronized void zzo(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzp(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzk((zzdgf) it.next());
        }
    }

    protected final synchronized void zzq(final zzded zzdedVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdec
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdedVar.zza(key);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
