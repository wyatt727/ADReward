package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaxq {
    private long zza = -1;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;

    private static DisplayMetrics zzl(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private static boolean zzm(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", new Class[0]).invoke(view, new Object[0]);
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, Integer.valueOf(((Integer) objInvoke.getClass().getField("adType").get(objInvoke)).intValue()));
            if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                if (!str.contains("REWARDED")) {
                    return false;
                }
            }
            return true;
        } catch (ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzb() {
        return this.zze;
    }

    public final long zzc() {
        return this.zza;
    }

    public final long zzd() {
        return this.zzc;
    }

    public final long zze() {
        return this.zzh;
    }

    public final long zzf() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zzb;
    }

    public final long zzh() {
        return this.zzd;
    }

    public final void zzi() {
        this.zzh = this.zzg;
        this.zzg = SystemClock.uptimeMillis();
    }

    public final void zzj() {
        this.zzb = this.zza;
        this.zza = SystemClock.uptimeMillis();
    }

    public final void zzk(Context context, View view) {
        this.zzd = this.zzc;
        this.zzc = SystemClock.uptimeMillis();
        long j = this.zze;
        if (j != -1) {
            this.zzf = j;
        }
        DisplayMetrics displayMetricsZzl = zzl(context);
        int i = displayMetricsZzl.widthPixels * displayMetricsZzl.heightPixels;
        if (view != null) {
            int iMin = Math.min(view.getWidth(), displayMetricsZzl.widthPixels) * Math.min(view.getHeight(), displayMetricsZzl.heightPixels);
            if (iMin + iMin >= i || (iMin == 0 && zzm(view))) {
                this.zze = this.zzc;
                return;
            }
        }
        this.zze = -1L;
    }
}
