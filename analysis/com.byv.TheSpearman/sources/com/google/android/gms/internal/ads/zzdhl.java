package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdhl extends zzctv {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdfr zze;
    private final zzdiu zzf;
    private final zzcuq zzg;
    private final zzfqa zzh;
    private final zzczd zzi;
    private final zzcbl zzj;
    private boolean zzk;

    zzdhl(zzctu zzctuVar, Context context, @Nullable zzcgm zzcgmVar, zzdfr zzdfrVar, zzdiu zzdiuVar, zzcuq zzcuqVar, zzfqa zzfqaVar, zzczd zzczdVar, zzcbl zzcblVar) {
        super(zzctuVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcgmVar);
        this.zze = zzdfrVar;
        this.zzf = zzdiuVar;
        this.zzg = zzcuqVar;
        this.zzh = zzfqaVar;
        this.zzi = zzczdVar;
        this.zzj = zzcblVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcgm zzcgmVar = (zzcgm) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgO)).booleanValue()) {
                if (!this.zzk && zzcgmVar != null) {
                    zzgep zzgepVar = zzcbr.zze;
                    Objects.requireNonNull(zzcgmVar);
                    zzgepVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhk
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcgmVar.destroy();
                        }
                    });
                }
            } else if (zzcgmVar != null) {
                zzcgmVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(boolean r5, @javax.annotation.Nullable android.app.Activity r6) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzdfr r0 = r4.zze
            r0.zzb()
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzaB
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L4e
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r4.zzc
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzG(r0)
            if (r0 == 0) goto L4e
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)
            com.google.android.gms.internal.ads.zzczd r5 = r4.zzi
            r5.zzb()
            com.google.android.gms.internal.ads.zzbdq r5 = com.google.android.gms.internal.ads.zzbdz.zzaC
            com.google.android.gms.internal.ads.zzbdx r6 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lc4
            com.google.android.gms.internal.ads.zzfqa r5 = r4.zzh
            com.google.android.gms.internal.ads.zzffz r6 = r4.zza
            com.google.android.gms.internal.ads.zzffy r6 = r6.zzb
            com.google.android.gms.internal.ads.zzffq r6 = r6.zzb
            java.lang.String r6 = r6.zzb
            r5.zza(r6)
            goto Lc4
        L4e:
            java.lang.ref.WeakReference r0 = r4.zzd
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzcgm r0 = (com.google.android.gms.internal.ads.zzcgm) r0
            com.google.android.gms.internal.ads.zzbdq r2 = com.google.android.gms.internal.ads.zzbdz.zzlz
            com.google.android.gms.internal.ads.zzbdx r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L92
            if (r0 == 0) goto L92
            com.google.android.gms.internal.ads.zzffn r0 = r0.zzD()
            if (r0 == 0) goto L92
            boolean r2 = r0.zzar
            if (r2 == 0) goto L92
            int r0 = r0.zzas
            com.google.android.gms.internal.ads.zzcbl r2 = r4.zzj
            int r2 = r2.zzb()
            if (r0 == r2) goto L92
            java.lang.String r5 = "The interstitial consent form has been shown."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)
            com.google.android.gms.internal.ads.zzczd r5 = r4.zzi
            r6 = 12
            java.lang.String r0 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.zze r6 = com.google.android.gms.internal.ads.zzfhk.zzd(r6, r0, r3)
            r5.zza(r6)
            goto Lc4
        L92:
            boolean r0 = r4.zzk
            if (r0 == 0) goto La6
            java.lang.String r0 = "The interstitial ad has been shown."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            com.google.android.gms.internal.ads.zzczd r0 = r4.zzi
            r2 = 10
            com.google.android.gms.ads.internal.client.zze r2 = com.google.android.gms.internal.ads.zzfhk.zzd(r2, r3, r3)
            r0.zza(r2)
        La6:
            boolean r0 = r4.zzk
            if (r0 != 0) goto Lc4
            if (r6 != 0) goto Lae
            android.content.Context r6 = r4.zzc
        Lae:
            com.google.android.gms.internal.ads.zzdiu r0 = r4.zzf     // Catch: com.google.android.gms.internal.ads.zzdit -> Lbe
            com.google.android.gms.internal.ads.zzczd r2 = r4.zzi     // Catch: com.google.android.gms.internal.ads.zzdit -> Lbe
            r0.zza(r5, r6, r2)     // Catch: com.google.android.gms.internal.ads.zzdit -> Lbe
            com.google.android.gms.internal.ads.zzdfr r5 = r4.zze     // Catch: com.google.android.gms.internal.ads.zzdit -> Lbe
            r5.zza()     // Catch: com.google.android.gms.internal.ads.zzdit -> Lbe
            r5 = 1
            r4.zzk = r5
            return r5
        Lbe:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzczd r6 = r4.zzi
            r6.zzc(r5)
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdhl.zzc(boolean, android.app.Activity):boolean");
    }
}
