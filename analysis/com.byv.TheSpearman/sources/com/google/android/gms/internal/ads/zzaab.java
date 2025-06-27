package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaab {
    public static final zzzv zza = new zzzv(0, -9223372036854775807L, null);
    public static final zzzv zzb = new zzzv(1, -9223372036854775807L, null);
    public static final zzzv zzc = new zzzv(2, -9223372036854775807L, null);
    public static final zzzv zzd = new zzzv(3, -9223372036854775807L, null);
    private final ExecutorService zze = zzfx.zzE("ExoPlayer:Loader:ProgressiveMediaPeriod");
    private zzzw zzf;
    private IOException zzg;

    public zzaab(String str) {
    }

    public static zzzv zzb(boolean z, long j) {
        return new zzzv(z ? 1 : 0, j, null);
    }

    public final long zza(zzzx zzzxVar, zzzt zzztVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        zzek.zzb(looperMyLooper);
        this.zzg = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzzw(this, looperMyLooper, zzzxVar, zzztVar, i, jElapsedRealtime).zzc(0L);
        return jElapsedRealtime;
    }

    public final void zzg() {
        zzzw zzzwVar = this.zzf;
        zzek.zzb(zzzwVar);
        zzzwVar.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zzg;
        if (iOException != null) {
            throw iOException;
        }
        zzzw zzzwVar = this.zzf;
        if (zzzwVar != null) {
            zzzwVar.zzb(i);
        }
    }

    public final void zzj(zzzy zzzyVar) {
        zzzw zzzwVar = this.zzf;
        if (zzzwVar != null) {
            zzzwVar.zza(true);
        }
        this.zze.execute(new zzzz(zzzyVar));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
