package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzft implements zzev {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzft(Handler handler) {
        this.zzb = handler;
    }

    static /* bridge */ /* synthetic */ void zzl(zzfs zzfsVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzfsVar);
            }
        }
    }

    private static zzfs zzm() {
        zzfs zzfsVar;
        List list = zza;
        synchronized (list) {
            zzfsVar = list.isEmpty() ? new zzfs(null) : (zzfs) list.remove(list.size() - 1);
        }
        return zzfsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final zzeu zzb(int i) {
        Handler handler = this.zzb;
        zzfs zzfsVarZzm = zzm();
        zzfsVarZzm.zzb(handler.obtainMessage(i), this);
        return zzfsVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final zzeu zzc(int i, Object obj) {
        Handler handler = this.zzb;
        zzfs zzfsVarZzm = zzm();
        zzfsVarZzm.zzb(handler.obtainMessage(i, obj), this);
        return zzfsVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final zzeu zzd(int i, int i2, int i3) {
        Handler handler = this.zzb;
        zzfs zzfsVarZzm = zzm();
        zzfsVarZzm.zzb(handler.obtainMessage(1, i2, i3), this);
        return zzfsVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zze(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzf(int i) {
        this.zzb.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final boolean zzg(int i) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final boolean zzi(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final boolean zzj(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final boolean zzk(zzeu zzeuVar) {
        return ((zzfs) zzeuVar).zzc(this.zzb);
    }
}
