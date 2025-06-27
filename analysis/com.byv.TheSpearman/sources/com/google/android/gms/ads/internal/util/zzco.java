package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzcce;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzco {
    private final View zza;
    private Activity zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final ViewTreeObserver.OnGlobalLayoutListener zzf;

    public zzco(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.zzb = activity;
        this.zza = view;
        this.zzf = onGlobalLayoutListener;
    }

    private static ViewTreeObserver zzf(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void zzg() {
        if (this.zzc) {
            return;
        }
        Activity activity = this.zzb;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzf;
            ViewTreeObserver viewTreeObserverZzf = zzf(activity);
            if (viewTreeObserverZzf != null) {
                viewTreeObserverZzf.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.zza;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.zzf;
        com.google.android.gms.ads.internal.zzu.zzx();
        zzcce.zza(view, onGlobalLayoutListener2);
        this.zzc = true;
    }

    private final void zzh() {
        Activity activity = this.zzb;
        if (activity != null && this.zzc) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzf;
            ViewTreeObserver viewTreeObserverZzf = zzf(activity);
            if (viewTreeObserverZzf != null) {
                viewTreeObserverZzf.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.zzc = false;
        }
    }

    public final void zza() {
        this.zze = false;
        zzh();
    }

    public final void zzb() {
        this.zze = true;
        if (this.zzd) {
            zzg();
        }
    }

    public final void zzc() {
        this.zzd = true;
        if (this.zze) {
            zzg();
        }
    }

    public final void zzd() {
        this.zzd = false;
        zzh();
    }

    public final void zze(Activity activity) {
        this.zzb = activity;
    }
}
