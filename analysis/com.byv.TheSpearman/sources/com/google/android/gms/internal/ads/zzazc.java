package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzazc {
    protected static final String zza = "zzazc";
    private final zzaxp zzb;
    private final String zzc;
    private final String zzd;
    private final Class[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzazc(zzaxp zzaxpVar, String str, String str2, Class... clsArr) {
        this.zzb = zzaxpVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzaxpVar.zzk().submit(new zzazb(this));
    }

    static /* bridge */ /* synthetic */ void zzb(zzazc zzazcVar) {
        try {
            zzaxp zzaxpVar = zzazcVar.zzb;
            Class clsLoadClass = zzaxpVar.zzi().loadClass(zzazcVar.zzc(zzaxpVar.zzu(), zzazcVar.zzc));
            if (clsLoadClass != null) {
                zzazcVar.zze = clsLoadClass.getMethod(zzazcVar.zzc(zzazcVar.zzb.zzu(), zzazcVar.zzd), zzazcVar.zzf);
                Method method = zzazcVar.zze;
            }
        } catch (zzawt | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            zzazcVar.zzg.countDown();
            throw th;
        }
        zzazcVar.zzg.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzawt, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), C.UTF8_NAME);
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (this.zzg.await(2L, TimeUnit.SECONDS)) {
                return this.zze;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
