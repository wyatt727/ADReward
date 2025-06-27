package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeuv implements zzewr {
    private final zzgep zza;
    private final Context zzb;
    private final Set zzc;

    public zzeuv(zzgep zzgepVar, Context context, Set set) {
        this.zza = zzgepVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r0.contains(com.my.tracker.ads.AdFormat.BANNER) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ com.google.android.gms.internal.ads.zzeuw zzc() throws java.lang.Exception {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzeW
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzfe
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L46
            java.util.Set r0 = r3.zzc
            java.lang.String r1 = "rewarded"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "interstitial"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "native"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "banner"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L56
        L46:
            android.content.Context r0 = r3.zzb
            com.google.android.gms.internal.ads.zzeuw r1 = new com.google.android.gms.internal.ads.zzeuw
            com.google.android.gms.internal.ads.zzegc r2 = com.google.android.gms.ads.internal.zzu.zzA()
            java.lang.String r0 = r2.zze(r0)
            r1.<init>(r0)
            return r1
        L56:
            com.google.android.gms.internal.ads.zzeuw r0 = new com.google.android.gms.internal.ads.zzeuw
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuv.zzc():com.google.android.gms.internal.ads.zzeuw");
    }
}
