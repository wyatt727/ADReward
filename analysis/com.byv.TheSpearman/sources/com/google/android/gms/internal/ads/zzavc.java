package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzavc implements Runnable {
    private zzavc() {
    }

    /* synthetic */ zzavc(zzavb zzavbVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzavd.zzd = MessageDigest.getInstance(SameMD5.TAG);
            countDownLatch = zzavd.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzavd.zzb;
        } catch (Throwable th) {
            zzavd.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
