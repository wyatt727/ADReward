package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzhk<V> extends FutureTask<V> implements Comparable<zzhk<V>> {
    final boolean zza;
    private final long zzb;
    private final String zzc;
    private final /* synthetic */ zzhj zzd;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) throws IllegalStateException {
        zzhk zzhkVar = (zzhk) obj;
        boolean z = this.zza;
        if (z != zzhkVar.zza) {
            return z ? -1 : 1;
        }
        long j = this.zzb;
        long j2 = zzhkVar.zzb;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.zzd.zzj().zzm().zza("Two tasks share the same index. index", Long.valueOf(this.zzb));
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhk(zzhj zzhjVar, Runnable runnable, boolean z, String str) throws IllegalStateException {
        super(com.google.android.gms.internal.measurement.zzcy.zza().zza(runnable), null);
        this.zzd = zzhjVar;
        Preconditions.checkNotNull(str);
        long andIncrement = zzhj.zza.getAndIncrement();
        this.zzb = andIncrement;
        this.zzc = str;
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzhjVar.zzj().zzg().zza("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhk(zzhj zzhjVar, Callable<V> callable, boolean z, String str) throws IllegalStateException {
        super(com.google.android.gms.internal.measurement.zzcy.zza().zza(callable));
        this.zzd = zzhjVar;
        Preconditions.checkNotNull(str);
        long andIncrement = zzhj.zza.getAndIncrement();
        this.zzb = andIncrement;
        this.zzc = str;
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzhjVar.zzj().zzg().zza("Tasks index overflow");
        }
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) throws IllegalStateException {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzd.zzj().zzg().zza(this.zzc, th);
        if ((th instanceof zzhi) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
