package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzegw implements zzdiu {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzffn zzc;
    private final zzcgm zzd;
    private final zzfgi zze;
    private final zzblb zzf;
    private final boolean zzg;
    private final zzefo zzh;

    zzegw(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzffn zzffnVar, zzcgm zzcgmVar, zzfgi zzfgiVar, boolean z, zzblb zzblbVar, zzefo zzefoVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzffnVar;
        this.zzd = zzcgmVar;
        this.zze = zzfgiVar;
        this.zzg = z;
        this.zzf = zzblbVar;
        this.zzh = zzefoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    @Override // com.google.android.gms.internal.ads.zzdiu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(boolean r19, android.content.Context r20, com.google.android.gms.internal.ads.zzczd r21) throws java.lang.NumberFormatException {
        /*
            r18 = this;
            r0 = r18
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zzb
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgee.zzq(r1)
            com.google.android.gms.internal.ads.zzcqx r1 = (com.google.android.gms.internal.ads.zzcqx) r1
            com.google.android.gms.internal.ads.zzcgm r2 = r0.zzd
            r3 = 1
            r2.zzao(r3)
            com.google.android.gms.ads.internal.zzk r2 = new com.google.android.gms.ads.internal.zzk
            boolean r4 = r0.zzg
            if (r4 == 0) goto L1e
            com.google.android.gms.internal.ads.zzblb r4 = r0.zzf
            boolean r4 = r4.zze(r3)
            r5 = r4
            goto L1f
        L1e:
            r5 = r3
        L1f:
            boolean r4 = r0.zzg
            if (r4 == 0) goto L2a
            com.google.android.gms.internal.ads.zzblb r6 = r0.zzf
            boolean r6 = r6.zzd()
            goto L2b
        L2a:
            r6 = 0
        L2b:
            r7 = r6
            if (r4 == 0) goto L35
            com.google.android.gms.internal.ads.zzblb r4 = r0.zzf
            float r4 = r4.zza()
            goto L36
        L35:
            r4 = 0
        L36:
            r8 = r4
            r6 = 1
            r9 = -1
            com.google.android.gms.internal.ads.zzffn r4 = r0.zzc
            boolean r11 = r4.zzP
            r12 = 0
            r4 = r2
            r10 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r21 == 0) goto L49
            r21.zzf()
        L49:
            com.google.android.gms.ads.internal.zzu.zzi()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r15 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzdij r6 = r1.zzg()
            com.google.android.gms.internal.ads.zzcgm r8 = r0.zzd
            com.google.android.gms.internal.ads.zzffn r1 = r0.zzc
            int r1 = r1.zzR
            r4 = -1
            if (r1 == r4) goto L5d
        L5b:
            r9 = r1
            goto L78
        L5d:
            com.google.android.gms.internal.ads.zzfgi r1 = r0.zze
            com.google.android.gms.ads.internal.client.zzw r1 = r1.zzj
            if (r1 == 0) goto L6e
            int r1 = r1.zza
            if (r1 != r3) goto L69
            r1 = 7
            goto L5b
        L69:
            r4 = 2
            if (r1 != r4) goto L6e
            r1 = 6
            goto L5b
        L6e:
            java.lang.String r1 = "Error setting app open orientation; no targeting orientation available."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)
            com.google.android.gms.internal.ads.zzffn r1 = r0.zzc
            int r1 = r1.zzR
            goto L5b
        L78:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r10 = r0.zza
            com.google.android.gms.internal.ads.zzffn r1 = r0.zzc
            java.lang.String r11 = r1.zzC
            com.google.android.gms.internal.ads.zzffs r4 = r1.zzt
            java.lang.String r13 = r4.zzb
            java.lang.String r14 = r4.zza
            com.google.android.gms.internal.ads.zzfgi r4 = r0.zze
            boolean r1 = r1.zzaj
            if (r1 == 0) goto L8d
            com.google.android.gms.internal.ads.zzefo r1 = r0.zzh
            goto L8e
        L8d:
            r1 = 0
        L8e:
            r17 = r1
            r5 = 0
            r7 = 0
            java.lang.String r1 = r4.zzf
            r4 = r15
            r12 = r2
            r2 = r15
            r15 = r1
            r16 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r20
            com.google.android.gms.ads.internal.overlay.zzn.zza(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegw.zza(boolean, android.content.Context, com.google.android.gms.internal.ads.zzczd):void");
    }
}
