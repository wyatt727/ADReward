package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdrv {
    private final Map zza = new HashMap();

    zzdrv() {
    }

    @Nullable
    public final synchronized zzdru zza(String str) {
        return (zzdru) this.zza.get(str);
    }

    public final String zzb(String str) {
        zzbtc zzbtcVar;
        zzdru zzdruVarZza = zza(str);
        return (zzdruVarZza == null || (zzbtcVar = zzdruVarZza.zzb) == null) ? "" : zzbtcVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized void zzc(java.lang.String r7, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzfhg r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map r0 = r6.zza     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.containsKey(r7)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto Lb
            monitor-exit(r6)
            return
        Lb:
            com.google.android.gms.internal.ads.zzdru r0 = new com.google.android.gms.internal.ads.zzdru     // Catch: java.lang.Throwable -> L44
            r1 = 0
            if (r8 != 0) goto L12
        L10:
            r2 = r1
            goto L16
        L12:
            com.google.android.gms.internal.ads.zzbtc r2 = r8.zze()     // Catch: com.google.android.gms.internal.ads.zzfgp -> L10 java.lang.Throwable -> L44
        L16:
            if (r8 != 0) goto L19
            goto L1d
        L19:
            com.google.android.gms.internal.ads.zzbtc r1 = r8.zzf()     // Catch: com.google.android.gms.internal.ads.zzfgp -> L1d java.lang.Throwable -> L44
        L1d:
            com.google.android.gms.internal.ads.zzbdq r3 = com.google.android.gms.internal.ads.zzbdz.zzjl     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.zzbdx r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L44
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L44
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L33
        L31:
            r4 = r5
            goto L3a
        L33:
            if (r8 != 0) goto L36
            goto L3a
        L36:
            r8.zzC()     // Catch: com.google.android.gms.internal.ads.zzfgp -> L3a java.lang.Throwable -> L44
            goto L31
        L3a:
            r0.<init>(r7, r2, r1, r4)     // Catch: java.lang.Throwable -> L44
            java.util.Map r8 = r6.zza     // Catch: java.lang.Throwable -> L44
            r8.put(r7, r0)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r6)
            return
        L44:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrv.zzc(java.lang.String, com.google.android.gms.internal.ads.zzfhg):void");
    }

    final synchronized void zzd(String str, zzbsn zzbsnVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdru(str, zzbsnVar.zzf(), zzbsnVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
