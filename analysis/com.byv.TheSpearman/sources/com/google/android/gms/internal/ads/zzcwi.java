package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcwi implements zzdbl, zzdgz {
    private zzbwx zza;
    private final Context zzc;
    private final zzflk zzd;
    private final VersionInfoParcel zze;
    private boolean zzf = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    zzcwi(Context context, zzflk zzflkVar, VersionInfoParcel versionInfoParcel) {
        this.zzc = context;
        this.zzd = zzflkVar;
        this.zze = versionInfoParcel;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.zzb
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            goto La7
        Lb:
            com.google.android.gms.internal.ads.zzbff r0 = com.google.android.gms.internal.ads.zzbft.zzk
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 3
            r3 = 2
            if (r0 == 0) goto L1d
        L1b:
            r2 = r3
            goto L68
        L1d:
            com.google.android.gms.internal.ads.zzbff r0 = com.google.android.gms.internal.ads.zzbft.zzl
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2c
            goto L68
        L2c:
            com.google.android.gms.internal.ads.zzbff r0 = com.google.android.gms.internal.ads.zzbft.zzj
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
        L3a:
            r2 = r1
            goto L68
        L3c:
            com.google.android.gms.internal.ads.zzcbh r0 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()
            com.google.android.gms.internal.ads.zzcbb r0 = r0.zzg()
            java.lang.String r0 = r0.zzc()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r4.<init>(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "local_flag_write"
            java.lang.String r0 = r4.optString(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r4 = "client"
            boolean r4 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r4 == 0) goto L60
            goto L1b
        L60:
            java.lang.String r4 = "service"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r0 == 0) goto L3a
        L68:
            int r2 = r2 + (-1)
            if (r2 == r1) goto L80
            if (r2 == r3) goto L6f
            goto La7
        L6f:
            android.content.Context r0 = r5.zzc
            com.google.android.gms.internal.ads.zzflk r2 = r5.zzd
            com.google.android.gms.internal.ads.zzbph r3 = com.google.android.gms.ads.internal.zzu.zzf()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.zzbpq r0 = r3.zzb(r0, r4, r2)
            goto L90
        L80:
            android.content.Context r0 = r5.zzc
            com.google.android.gms.internal.ads.zzflk r2 = r5.zzd
            com.google.android.gms.internal.ads.zzbph r3 = com.google.android.gms.ads.internal.zzu.zzf()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.zzbpq r0 = r3.zza(r0, r4, r2)
        L90:
            com.google.android.gms.internal.ads.zzbpk r2 = com.google.android.gms.internal.ads.zzbpn.zza
            com.google.android.gms.internal.ads.zzbpk r3 = com.google.android.gms.internal.ads.zzbpn.zza
            java.lang.String r4 = "google.afma.sdkConstants.getSdkConstants"
            com.google.android.gms.internal.ads.zzbpg r0 = r0.zza(r4, r2, r3)
            android.content.Context r2 = r5.zzc
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r5.zze
            com.google.android.gms.internal.ads.zzbwz r4 = new com.google.android.gms.internal.ads.zzbwz
            r4.<init>(r2, r0, r3)
            r5.zza = r4
            r5.zzf = r1
        La7:
            boolean r0 = r5.zzf
            if (r0 != 0) goto Lac
            goto Lb9
        Lac:
            com.google.android.gms.internal.ads.zzbwx r0 = r5.zza
            if (r0 == 0) goto Lb9
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza()
            java.lang.String r1 = "persistFlagsClient"
            com.google.android.gms.internal.ads.zzcbu.zza(r0, r1)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcwi.zzc():void");
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdn(zzbxd zzbxdVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdo(zzffz zzffzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zze(String str) {
        zzc();
    }
}
