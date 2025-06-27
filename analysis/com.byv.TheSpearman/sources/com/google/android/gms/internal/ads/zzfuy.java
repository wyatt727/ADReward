package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfuy {
    private static final zzfvg zzb = new zzfvg("OverlayDisplayService");
    private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzfvr zza;
    private final String zzd;

    zzfuy(Context context) {
        if (zzfvu.zza(context)) {
            this.zza = new zzfvr(context.getApplicationContext(), zzb, "OverlayDisplayService", zzc, zzfut.zza, null);
        } else {
            this.zza = null;
        }
        this.zzd = context.getPackageName();
    }

    final void zzc() {
        if (this.zza == null) {
            return;
        }
        zzb.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzu();
    }

    final void zzd(zzfup zzfupVar, zzfvd zzfvdVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfuv(this, taskCompletionSource, zzfupVar, zzfvdVar, taskCompletionSource), taskCompletionSource);
        }
    }

    final void zze(zzfva zzfvaVar, zzfvd zzfvdVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        if (zzfvaVar.zzh() != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfuu(this, taskCompletionSource, zzfvaVar, zzfvdVar, taskCompletionSource), taskCompletionSource);
        } else {
            zzb.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfvb zzfvbVarZzc = zzfvc.zzc();
            zzfvbVarZzc.zzb(8160);
            zzfvdVar.zza(zzfvbVarZzc.zzc());
        }
    }

    final void zzf(zzfvf zzfvfVar, zzfvd zzfvdVar, int i) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfuw(this, taskCompletionSource, zzfvfVar, i, zzfvdVar, taskCompletionSource), taskCompletionSource);
        }
    }
}
