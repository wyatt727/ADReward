package com.google.android.gms.internal.games;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzgj {
    private final ConcurrentHashMap<zzgm, List<Throwable>> zznj = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> zznk = new ReferenceQueue<>();

    zzgj() {
    }

    public final List<Throwable> zza(Throwable th, boolean z) {
        Reference<? extends Throwable> referencePoll = this.zznk.poll();
        while (referencePoll != null) {
            this.zznj.remove(referencePoll);
            referencePoll = this.zznk.poll();
        }
        List<Throwable> list = this.zznj.get(new zzgm(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.zznj.putIfAbsent(new zzgm(th, this.zznk), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}
