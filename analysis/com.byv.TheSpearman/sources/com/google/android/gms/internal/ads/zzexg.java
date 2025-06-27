package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzexg implements zzewr {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgep zzc;
    private final ScheduledExecutorService zzd;
    private final zzegh zze;
    private final zzfgi zzf;

    zzexg(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgep zzgepVar, ScheduledExecutorService scheduledExecutorService, zzegh zzeghVar, zzfgi zzfgiVar) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgepVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzeghVar;
        this.zzf = zzfgiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r5.zzf.zzd.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.zzewr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzkd
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8d
            com.google.android.gms.ads.internal.util.zzg r0 = r5.zza
            boolean r0 = r0.zzP()
            if (r0 == 0) goto L8d
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzkg
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzfgi r0 = r5.zzf
            com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r1 = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED
            int r1 = r1.getValue()
            com.google.android.gms.ads.internal.client.zzl r0 = r0.zzd
            int r0 = r0.zzy
            if (r0 == r1) goto L8d
        L3a:
            com.google.android.gms.internal.ads.zzegh r0 = r5.zze
            r1 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza(r1)
            com.google.android.gms.internal.ads.zzbdq r1 = com.google.android.gms.internal.ads.zzbdz.zzke
            com.google.android.gms.internal.ads.zzbdx r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.zzd
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgee.zzo(r0, r1, r4, r3)
            com.google.android.gms.internal.ads.zzgdv r0 = com.google.android.gms.internal.ads.zzgdv.zzu(r0)
            com.google.android.gms.internal.ads.zzgep r1 = r5.zzc
            com.google.android.gms.internal.ads.zzexe r2 = new com.google.android.gms.internal.ads.zzgdl() { // from class: com.google.android.gms.internal.ads.zzexe
                static {
                    /*
                        com.google.android.gms.internal.ads.zzexe r0 = new com.google.android.gms.internal.ads.zzexe
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.zzexe) com.google.android.gms.internal.ads.zzexe.zza com.google.android.gms.internal.ads.zzexe
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzexe.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzexe.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzgdl
                public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object r6) {
                    /*
                        r5 = this;
                        androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse r6 = (androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse) r6
                        com.google.android.gms.internal.ads.zzhdv r0 = com.google.android.gms.internal.ads.zzhdw.zzc()
                        java.util.List r6 = r6.getTopics()
                        java.util.Iterator r6 = r6.iterator()
                    Le:
                        boolean r1 = r6.hasNext()
                        if (r1 == 0) goto L3d
                        java.lang.Object r1 = r6.next()
                        androidx.privacysandbox.ads.adservices.topics.Topic r1 = (androidx.privacysandbox.ads.adservices.topics.Topic) r1
                        com.google.android.gms.internal.ads.zzhdt r2 = com.google.android.gms.internal.ads.zzhdu.zzc()
                        int r3 = r1.getTopicCode()
                        r2.zzc(r3)
                        long r3 = r1.getModelVersion()
                        r2.zza(r3)
                        long r3 = r1.getTaxonomyVersion()
                        r2.zzb(r3)
                        com.google.android.gms.internal.ads.zzgzv r1 = r2.zzbr()
                        com.google.android.gms.internal.ads.zzhdu r1 = (com.google.android.gms.internal.ads.zzhdu) r1
                        r0.zza(r1)
                        goto Le
                    L3d:
                        com.google.android.gms.internal.ads.zzgzv r6 = r0.zzbr()
                        com.google.android.gms.internal.ads.zzhdw r6 = (com.google.android.gms.internal.ads.zzhdw) r6
                        byte[] r6 = r6.zzaV()
                        r0 = 1
                        java.lang.String r6 = android.util.Base64.encodeToString(r6, r0)
                        com.google.android.gms.internal.ads.zzexi r1 = new com.google.android.gms.internal.ads.zzexi
                        r2 = 0
                        r1.<init>(r6, r0, r2)
                        com.google.common.util.concurrent.ListenableFuture r6 = com.google.android.gms.internal.ads.zzgee.zzh(r1)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzexe.zza(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                }
            }
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgee.zzn(r0, r2, r1)
            com.google.android.gms.internal.ads.zzexf r1 = new com.google.android.gms.internal.ads.zzexf
            r1.<init>()
            com.google.android.gms.internal.ads.zzgep r2 = r5.zzc
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgee.zzf(r0, r3, r1, r2)
            com.google.android.gms.internal.ads.zzbdq r1 = com.google.android.gms.internal.ads.zzbdz.zzke
            com.google.android.gms.internal.ads.zzbdx r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.zzd
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgee.zzo(r0, r1, r4, r3)
            return r0
        L8d:
            com.google.android.gms.internal.ads.zzexi r0 = new com.google.android.gms.internal.ads.zzexi
            r1 = -1
            r2 = 0
            java.lang.String r3 = ""
            r0.<init>(r3, r1, r2)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgee.zzh(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzexg.zzb():com.google.common.util.concurrent.ListenableFuture");
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) throws Exception {
        zzbvs.zza(this.zzb).zzg(th, "TopicsSignal.fetchTopicsSignal");
        return zzgee.zzh(th instanceof SecurityException ? new zzexi("", 2, null) : th instanceof IllegalStateException ? new zzexi("", 3, null) : th instanceof IllegalArgumentException ? new zzexi("", 4, null) : th instanceof TimeoutException ? new zzexi("", 5, null) : new zzexi("", 0, null));
    }
}
