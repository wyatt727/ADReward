package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbxj implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbxl zzb;

    zzbxj(zzbxl zzbxlVar, Context context) {
        this.zza = context;
        this.zzb = zzbxlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbxl r0 = r5.zzb
            java.util.WeakHashMap r0 = com.google.android.gms.internal.ads.zzbxl.zza(r0)
            android.content.Context r1 = r5.zza
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.zzbxk r0 = (com.google.android.gms.internal.ads.zzbxk) r0
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzbff r1 = com.google.android.gms.internal.ads.zzbfj.zza
            java.lang.Object r1 = r1.zze()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r3 = r0.zza
            long r3 = r3 + r1
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()
            long r1 = r1.currentTimeMillis()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L2c
            goto L3a
        L2c:
            android.content.Context r1 = r5.zza
            com.google.android.gms.internal.ads.zzbxi r0 = r0.zzb
            com.google.android.gms.internal.ads.zzbxh r2 = new com.google.android.gms.internal.ads.zzbxh
            r2.<init>(r1, r0)
            com.google.android.gms.internal.ads.zzbxi r0 = r2.zza()
            goto L45
        L3a:
            android.content.Context r0 = r5.zza
            com.google.android.gms.internal.ads.zzbxh r1 = new com.google.android.gms.internal.ads.zzbxh
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzbxi r0 = r1.zza()
        L45:
            com.google.android.gms.internal.ads.zzbxl r1 = r5.zzb
            android.content.Context r2 = r5.zza
            java.util.WeakHashMap r3 = com.google.android.gms.internal.ads.zzbxl.zza(r1)
            com.google.android.gms.internal.ads.zzbxk r4 = new com.google.android.gms.internal.ads.zzbxk
            r4.<init>(r1, r0)
            r3.put(r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxj.call():java.lang.Object");
    }
}
