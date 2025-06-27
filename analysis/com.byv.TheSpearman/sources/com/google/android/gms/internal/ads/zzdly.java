package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdly {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfgi zzc;
    private final zzdld zzd;
    private final zzdky zze;
    private final zzdmk zzf;
    private final zzdms zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbgt zzj;
    private final zzdkv zzk;

    public zzdly(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfgi zzfgiVar, zzdld zzdldVar, zzdky zzdkyVar, zzdmk zzdmkVar, zzdms zzdmsVar, Executor executor, Executor executor2, zzdkv zzdkvVar) {
        this.zzb = zzgVar;
        this.zzc = zzfgiVar;
        this.zzj = zzfgiVar.zzi;
        this.zzd = zzdldVar;
        this.zze = zzdkyVar;
        this.zzf = zzdmkVar;
        this.zzg = zzdmsVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdkvVar;
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z) {
        View viewZzf = z ? this.zze.zzf() : this.zze.zzg();
        if (viewZzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzf.getParent()).removeView(viewZzf);
        }
        viewGroup.addView(viewZzf, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdL)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdky zzdkyVar = this.zze;
        if (zzdkyVar.zzf() != null) {
            boolean z = viewGroup != null;
            if (zzdkyVar.zzc() == 2 || zzdkyVar.zzc() == 1) {
                this.zzb.zzH(this.zzc.zzf, String.valueOf(zzdkyVar.zzc()), z);
            } else if (zzdkyVar.zzc() == 6) {
                this.zzb.zzH(this.zzc.zzf, "2", z);
                this.zzb.zzH(this.zzc.zzf, "1", z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzdmu r10) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdly.zzb(com.google.android.gms.internal.ads.zzdmu):void");
    }

    public final void zzc(zzdmu zzdmuVar) {
        if (zzdmuVar == null || this.zzf == null || zzdmuVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdmuVar.zzh().addView(this.zzf.zza());
        } catch (zzcgy e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(zzdmu zzdmuVar) {
        if (zzdmuVar == null) {
            return;
        }
        Context context = zzdmuVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbz.zzh(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Activity context is needed for policy validator.");
                return;
            }
            if (this.zzg == null || zzdmuVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzg.zza(zzdmuVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbz.zzb());
            } catch (zzcgy e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zze(final zzdmu zzdmuVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzdmuVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }
}
