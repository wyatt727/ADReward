package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzekk implements zzgdl {
    private final zzfkn zza;
    private final zzcys zzb;
    private final zzfmp zzc;
    private final zzfmt zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcty zzg;
    private final zzekd zzh;
    private final zzego zzi;
    private final Context zzj;
    private final zzflh zzk;
    private final zzejn zzl;
    private final zzduc zzm;

    zzekk(Context context, zzfkn zzfknVar, zzekd zzekdVar, zzcys zzcysVar, zzfmp zzfmpVar, zzfmt zzfmtVar, zzcty zzctyVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzego zzegoVar, zzflh zzflhVar, zzejn zzejnVar, zzduc zzducVar) {
        this.zzj = context;
        this.zza = zzfknVar;
        this.zzh = zzekdVar;
        this.zzb = zzcysVar;
        this.zzc = zzfmpVar;
        this.zzd = zzfmtVar;
        this.zzg = zzctyVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzegoVar;
        this.zzk = zzflhVar;
        this.zzl = zzejnVar;
        this.zzm = zzducVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String zzc(com.google.android.gms.internal.ads.zzffz r5) {
        /*
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzfw
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.zzffy r2 = r5.zzb
            com.google.android.gms.internal.ads.zzffq r2 = r2.zzb
            int r2 = r2.zze
            if (r2 == 0) goto L57
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.zzbdq r2 = com.google.android.gms.internal.ads.zzbdz.zzfv
            com.google.android.gms.internal.ads.zzbdx r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L57
            goto L58
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L58
        L45:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Received error HTTP response code: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            goto L58
        L57:
            r1 = r0
        L58:
            com.google.android.gms.internal.ads.zzffy r5 = r5.zzb
            com.google.android.gms.internal.ads.zzffq r5 = r5.zzb
            com.google.android.gms.internal.ads.zzffp r5 = r5.zzi
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.zza()
            return r5
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekk.zzc(com.google.android.gms.internal.ads.zzffz):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    @Override // com.google.android.gms.internal.ads.zzgdl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekk.zza(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
    }

    final /* synthetic */ ListenableFuture zzb(zzffn zzffnVar, zzffz zzffzVar, zzegj zzegjVar, Throwable th) throws Exception {
        zzfkw zzfkwVarZza = zzfkv.zza(this.zzj, zzflo.CUI_NAME_ADREQUEST_MEDIATION_ADAPTER);
        zzfkwVarZza.zze(zzffnVar.zzF);
        zzfkwVarZza.zzi();
        ListenableFuture listenableFutureZzo = zzgee.zzo(zzegjVar.zza(zzffzVar, zzffnVar), zzffnVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zzf(zzffzVar, zzffnVar, listenableFutureZzo, this.zzc);
        zzflg.zzb(listenableFutureZzo, this.zzk, zzfkwVarZza);
        return listenableFutureZzo;
    }
}
