package com.google.android.gms.internal.nearby;

import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzfx {
    private final ExecutorService zza;
    private volatile InputStream zzb;
    private volatile boolean zzc;
    private final SimpleArrayMap<Long, OutputStream> zzd;
    private final SimpleArrayMap<Long, zzgd> zze;

    public zzfx() {
        zzg.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zzb = null;
        this.zzc = false;
        this.zzd = new SimpleArrayMap<>();
        this.zze = new SimpleArrayMap<>();
    }

    static /* synthetic */ void zzf(zzfx zzfxVar, OutputStream outputStream, boolean z, long j) throws IOException {
        try {
            outputStream.write(z ? 1 : 0);
        } catch (IOException e) {
            Log.w("NearbyConnections", String.format("Unable to deliver status for Payload %d", Long.valueOf(j)), e);
        } finally {
            IOUtils.closeQuietly(outputStream);
        }
    }

    final synchronized void zza(InputStream inputStream, OutputStream outputStream, OutputStream outputStream2, zzgd zzgdVar, long j) {
        SimpleArrayMap<Long, OutputStream> simpleArrayMap = this.zzd;
        Long lValueOf = Long.valueOf(j);
        simpleArrayMap.put(lValueOf, outputStream);
        this.zze.put(lValueOf, zzgdVar);
        this.zza.execute(new zzfw(this, inputStream, outputStream, j, outputStream2));
    }

    final synchronized void zzb(long j) {
        SimpleArrayMap<Long, OutputStream> simpleArrayMap = this.zzd;
        Long lValueOf = Long.valueOf(j);
        IOUtils.closeQuietly(simpleArrayMap.get(lValueOf));
        this.zzd.remove(lValueOf);
        zzgd zzgdVarRemove = this.zze.remove(lValueOf);
        if (zzgdVarRemove != null) {
            IOUtils.closeQuietly(zzgdVarRemove.zzd());
            IOUtils.closeQuietly(zzgdVarRemove.zzg());
        }
    }

    final synchronized void zzc() {
        this.zzc = true;
        this.zza.shutdownNow();
        IOUtils.closeQuietly(this.zzb);
        for (int i = 0; i < this.zzd.size(); i++) {
            IOUtils.closeQuietly(this.zzd.valueAt(i));
        }
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zze.size(); i2++) {
            zzgd zzgdVarValueAt = this.zze.valueAt(i2);
            IOUtils.closeQuietly(zzgdVarValueAt.zzd());
            IOUtils.closeQuietly(zzgdVarValueAt.zzg());
        }
        this.zze.clear();
    }
}
