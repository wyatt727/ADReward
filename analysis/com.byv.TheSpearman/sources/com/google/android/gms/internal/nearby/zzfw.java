package com.google.android.gms.internal.nearby;

import android.util.Log;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzfw implements Runnable {
    final /* synthetic */ InputStream zza;
    final /* synthetic */ OutputStream zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ OutputStream zzd;
    final /* synthetic */ zzfx zze;

    zzfw(zzfx zzfxVar, InputStream inputStream, OutputStream outputStream, long j, OutputStream outputStream2) {
        this.zze = zzfxVar;
        this.zza = inputStream;
        this.zzb = outputStream;
        this.zzc = j;
        this.zzd = outputStream2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        this.zze.zzb = this.zza;
        boolean z = true;
        try {
            IOUtils.copyStream(this.zza, this.zzb, false, 65536);
            IOUtils.closeQuietly(this.zza);
            zzfx.zzf(this.zze, this.zzd, false, this.zzc);
        } catch (IOException e) {
            try {
                if (this.zze.zzc) {
                    Log.d("NearbyConnections", String.format("Terminating copying stream for Payload %d due to shutdown of OutgoingPayloadStreamer.", Long.valueOf(this.zzc)));
                } else {
                    Log.w("NearbyConnections", String.format("Exception copying stream for Payload %d", Long.valueOf(this.zzc)), e);
                }
                IOUtils.closeQuietly(this.zza);
                zzfx.zzf(this.zze, this.zzd, true, this.zzc);
            } catch (Throwable th2) {
                th = th2;
                IOUtils.closeQuietly(this.zza);
                zzfx.zzf(this.zze, this.zzd, z, this.zzc);
                IOUtils.closeQuietly(this.zzb);
                this.zze.zzb = null;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
            IOUtils.closeQuietly(this.zza);
            zzfx.zzf(this.zze, this.zzd, z, this.zzc);
            IOUtils.closeQuietly(this.zzb);
            this.zze.zzb = null;
            throw th;
        }
        IOUtils.closeQuietly(this.zzb);
        this.zze.zzb = null;
    }
}
