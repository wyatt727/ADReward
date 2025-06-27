package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzexm implements zzewr {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzcay zzg;

    zzexm(zzcay zzcayVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzcayVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaU)).booleanValue()) {
            return zzgee.zzg(new Exception("Did not ad Ad ID into query param."));
        }
        return zzgee.zze((zzgdv) zzgee.zzo(zzgee.zzm(zzgdv.zzu(this.zzg.zza(this.zza, this.zzd)), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzexk
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return this.zza.zzc((AdvertisingIdClient.Info) obj);
            }
        }, this.zzc), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaV)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzexl
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return this.zza.zzd((Throwable) obj);
            }
        }, this.zzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ com.google.android.gms.internal.ads.zzexn zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzfto r0 = new com.google.android.gms.internal.ads.zzfto
            r0.<init>()
            boolean r1 = r7.zze
            if (r1 != 0) goto L1b
            com.google.android.gms.internal.ads.zzbdq r1 = com.google.android.gms.internal.ads.zzbdz.zzcU
            com.google.android.gms.internal.ads.zzbdx r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31
        L1b:
            boolean r1 = r7.zze
            if (r1 == 0) goto L75
            com.google.android.gms.internal.ads.zzbdq r1 = com.google.android.gms.internal.ads.zzbdz.zzcV
            com.google.android.gms.internal.ads.zzbdx r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L75
        L31:
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            com.google.android.gms.internal.ads.zzftr r1 = com.google.android.gms.internal.ads.zzftr.zzj(r0)     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            r0 = r8
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r0     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            java.lang.String r2 = r8.getId()     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzdb     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            com.google.android.gms.internal.ads.zzbdx r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            java.lang.Object r0 = r4.zza(r0)     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            boolean r6 = r7.zzf     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            com.google.android.gms.internal.ads.zzfto r0 = r1.zzi(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L64 java.io.IOException -> L66
            goto L75
        L64:
            r0 = move-exception
            goto L67
        L66:
            r0 = move-exception
        L67:
            com.google.android.gms.internal.ads.zzcbh r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "AdIdInfoSignalSource.getPaidV1"
            r1.zzw(r0, r2)
            com.google.android.gms.internal.ads.zzfto r0 = new com.google.android.gms.internal.ads.zzfto
            r0.<init>()
        L75:
            com.google.android.gms.internal.ads.zzexn r1 = new com.google.android.gms.internal.ads.zzexn
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzexm.zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.google.android.gms.internal.ads.zzexn");
    }

    final /* synthetic */ zzexn zzd(Throwable th) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzexn(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfto());
    }
}
