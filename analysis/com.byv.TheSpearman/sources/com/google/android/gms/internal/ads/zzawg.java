package com.google.android.gms.internal.ads;

import com.json.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzawg implements Runnable {
    final /* synthetic */ zzawh zza;

    zzawg(zzawh zzawhVar) {
        this.zza = zzawhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzp) {
            if (this.zza.zzq) {
                return;
            }
            this.zza.zzq = true;
            try {
                zzawh.zzj(this.zza);
            } catch (Exception e) {
                this.zza.zzh.zzc(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, -1L, e);
            }
            synchronized (this.zza.zzp) {
                this.zza.zzq = false;
            }
        }
    }
}
