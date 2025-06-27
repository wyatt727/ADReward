package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfl extends BroadcastReceiver {
    final /* synthetic */ zzfm zza;

    /* synthetic */ zzfl(zzfm zzfmVar, zzfk zzfkVar) {
        this.zza = zzfmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            java.lang.String r10 = "connectivity"
            java.lang.Object r10 = r9.getSystemService(r10)
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            r0 = 2
            r1 = 9
            r2 = 6
            r3 = 4
            r4 = 1
            r5 = 0
            r6 = 5
            if (r10 != 0) goto L14
        L12:
            r0 = r5
            goto L4e
        L14:
            android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L12
            if (r10 == 0) goto L4d
            boolean r7 = r10.isConnected()
            if (r7 != 0) goto L21
            goto L4d
        L21:
            int r7 = r10.getType()
            if (r7 == 0) goto L38
            if (r7 == r4) goto L4e
            if (r7 == r3) goto L38
            if (r7 == r6) goto L38
            if (r7 == r2) goto L36
            if (r7 == r1) goto L34
            r0 = 8
            goto L4e
        L34:
            r0 = 7
            goto L4e
        L36:
            r0 = r6
            goto L4e
        L38:
            int r10 = r10.getSubtype()
            switch(r10) {
                case 1: goto L4b;
                case 2: goto L4b;
                case 3: goto L49;
                case 4: goto L49;
                case 5: goto L49;
                case 6: goto L49;
                case 7: goto L49;
                case 8: goto L49;
                case 9: goto L49;
                case 10: goto L49;
                case 11: goto L49;
                case 12: goto L49;
                case 13: goto L36;
                case 14: goto L49;
                case 15: goto L49;
                case 16: goto L3f;
                case 17: goto L49;
                case 18: goto L4e;
                case 19: goto L3f;
                case 20: goto L41;
                default: goto L3f;
            }
        L3f:
            r0 = r2
            goto L4e
        L41:
            int r10 = com.google.android.gms.internal.ads.zzfx.zza
            r0 = 29
            if (r10 < r0) goto L12
            r0 = r1
            goto L4e
        L49:
            r0 = r3
            goto L4e
        L4b:
            r0 = 3
            goto L4e
        L4d:
            r0 = r4
        L4e:
            int r10 = com.google.android.gms.internal.ads.zzfx.zza
            r1 = 31
            if (r10 < r1) goto L77
            if (r0 != r6) goto L77
            com.google.android.gms.internal.ads.zzfm r10 = r8.zza
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r9.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L73
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.RuntimeException -> L73
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzfj r1 = new com.google.android.gms.internal.ads.zzfj     // Catch: java.lang.RuntimeException -> L73
            r1.<init>(r10)     // Catch: java.lang.RuntimeException -> L73
            java.util.concurrent.Executor r9 = r9.getMainExecutor()     // Catch: java.lang.RuntimeException -> L73
            r0.registerTelephonyCallback(r9, r1)     // Catch: java.lang.RuntimeException -> L73
            r0.unregisterTelephonyCallback(r1)     // Catch: java.lang.RuntimeException -> L73
            return
        L73:
            com.google.android.gms.internal.ads.zzfm.zzc(r10, r6)
            return
        L77:
            com.google.android.gms.internal.ads.zzfm r9 = r8.zza
            com.google.android.gms.internal.ads.zzfm.zzc(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfl.onReceive(android.content.Context, android.content.Intent):void");
    }
}
