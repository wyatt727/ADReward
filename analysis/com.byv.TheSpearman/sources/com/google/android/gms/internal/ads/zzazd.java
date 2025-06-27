package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzazd implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzaxp zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzata zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzazd(zzaxp zzaxpVar, String str, String str2, zzata zzataVar, int i, int i2) {
        this.zzb = zzaxpVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzataVar;
        this.zzg = i;
        this.zzh = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzl();
        return null;
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzl() throws Exception {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            Method methodZzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = methodZzj;
            if (methodZzj == null) {
                return null;
            }
            zza();
            zzawj zzawjVarZzd = this.zzb.zzd();
            if (zzawjVarZzd == null || (i = this.zzg) == Integer.MIN_VALUE) {
                return null;
            }
            zzawjVarZzd.zzc(this.zzh, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
