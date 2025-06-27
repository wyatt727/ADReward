package com.google.android.gms.internal.games;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzfd {
    private Handler zzgw;
    private boolean zzgx;
    private final Object zzgv = new Object();
    private HashMap<String, AtomicInteger> zzgy = new HashMap<>();
    private int zzgz = 1000;

    public zzfd(Looper looper, int i) {
        this.zzgw = new zzfk(looper);
    }

    protected abstract void zzc(String str, int i);

    public final void zze(String str, int i) {
        synchronized (this.zzgv) {
            if (!this.zzgx) {
                this.zzgx = true;
                this.zzgw.postDelayed(new zzfc(this), this.zzgz);
            }
            AtomicInteger atomicInteger = this.zzgy.get(str);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                this.zzgy.put(str, atomicInteger);
            }
            atomicInteger.addAndGet(i);
        }
    }

    public final void flush() {
        synchronized (this.zzgv) {
            for (Map.Entry<String, AtomicInteger> entry : this.zzgy.entrySet()) {
                zzc(entry.getKey(), entry.getValue().get());
            }
            this.zzgy.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbp() {
        synchronized (this.zzgv) {
            this.zzgx = false;
            flush();
        }
    }
}
