package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzpc;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzko implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zzjc zza;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    static /* synthetic */ void zza(zzko zzkoVar, boolean z, Uri uri, String str, String str2) throws IllegalStateException {
        Bundle bundleZza;
        Uri uri2;
        boolean z2;
        zzkoVar.zza.zzt();
        try {
            zzny zznyVarZzq = zzkoVar.zza.zzq();
            boolean z3 = false;
            boolean z4 = zzpc.zza() && zzkoVar.zza.zze().zza(zzbf.zzcs);
            if (TextUtils.isEmpty(str2)) {
                bundleZza = null;
            } else if (str2.contains("gclid") || ((z4 && str2.contains("gbraid")) || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id"))) {
                bundleZza = zznyVarZzq.zza(Uri.parse("https://google.com/search?" + str2), z4);
                if (bundleZza != null) {
                    bundleZza.putString("_cis", "referrer");
                }
            } else {
                zznyVarZzq.zzj().zzc().zza("Activity created with data 'referrer' without required params");
                bundleZza = null;
            }
            if (z) {
                zzny zznyVarZzq2 = zzkoVar.zza.zzq();
                if (zzpc.zza() && zzkoVar.zza.zze().zza(zzbf.zzcs)) {
                    uri2 = uri;
                    z2 = true;
                } else {
                    uri2 = uri;
                    z2 = false;
                }
                Bundle bundleZza2 = zznyVarZzq2.zza(uri2, z2);
                if (bundleZza2 != null) {
                    bundleZza2.putString("_cis", "intent");
                    if (!bundleZza2.containsKey("gclid") && bundleZza != null && bundleZza.containsKey("gclid")) {
                        bundleZza2.putString("_cer", String.format("gclid=%s", bundleZza.getString("gclid")));
                    }
                    zzkoVar.zza.zzc(str, "_cmp", bundleZza2);
                    zzkoVar.zza.zzb.zza(str, bundleZza2);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            zzkoVar.zza.zzj().zzc().zza("Activity created with referrer", str2);
            if (zzkoVar.zza.zze().zza(zzbf.zzbk)) {
                if (bundleZza != null) {
                    zzkoVar.zza.zzc(str, "_cmp", bundleZza);
                    zzkoVar.zza.zzb.zza(str, bundleZza);
                } else {
                    zzkoVar.zza.zzj().zzc().zza("Referrer does not contain valid parameters", str2);
                }
                zzkoVar.zza.zza("auto", "_ldl", (Object) null, true);
                return;
            }
            if (str2.contains("gclid") && (str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_term") || str2.contains("utm_content"))) {
                z3 = true;
            }
            if (!z3) {
                zzkoVar.zza.zzj().zzc().zza("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                zzkoVar.zza.zza("auto", "_ldl", (Object) str2, true);
            }
        } catch (RuntimeException e) {
            zzkoVar.zza.zzj().zzg().zza("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }

    zzko(zzjc zzjcVar) {
        this.zza = zzjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.app.Activity r9, android.os.Bundle r10) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.zzjc r0 = r8.zza     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            com.google.android.gms.measurement.internal.zzfz r0 = r0.zzj()     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            com.google.android.gms.measurement.internal.zzgb r0 = r0.zzp()     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            java.lang.String r1 = "onActivityCreated"
            r0.zza(r1)     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            android.content.Intent r0 = r9.getIntent()     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            if (r0 != 0) goto L1f
            com.google.android.gms.measurement.internal.zzjc r0 = r8.zza
            com.google.android.gms.measurement.internal.zzky r0 = r0.zzn()
            r0.zza(r9, r10)
            return
        L1f:
            android.net.Uri r1 = r0.getData()     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            if (r1 == 0) goto L2c
            boolean r2 = r1.isHierarchical()     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            if (r2 == 0) goto L2c
            goto L44
        L2c:
            android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            if (r1 == 0) goto L43
            java.lang.String r2 = "com.android.vending.referral_url"
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            if (r2 != 0) goto L43
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            goto L44
        L43:
            r1 = 0
        L44:
            r5 = r1
            if (r5 == 0) goto L85
            boolean r1 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            if (r1 != 0) goto L4e
            goto L85
        L4e:
            com.google.android.gms.measurement.internal.zzjc r1 = r8.zza     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            r1.zzq()     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            boolean r0 = com.google.android.gms.measurement.internal.zzny.zza(r0)     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            if (r0 == 0) goto L5c
            java.lang.String r0 = "gs"
            goto L5e
        L5c:
            java.lang.String r0 = "auto"
        L5e:
            r6 = r0
            java.lang.String r0 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            if (r10 != 0) goto L69
            r0 = 1
            goto L6a
        L69:
            r0 = 0
        L6a:
            r4 = r0
            com.google.android.gms.measurement.internal.zzjc r0 = r8.zza     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            com.google.android.gms.measurement.internal.zzhj r0 = r0.zzl()     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            com.google.android.gms.measurement.internal.zzkn r1 = new com.google.android.gms.measurement.internal.zzkn     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            r2 = r1
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            r0.zzb(r1)     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91
            com.google.android.gms.measurement.internal.zzjc r0 = r8.zza
            com.google.android.gms.measurement.internal.zzky r0 = r0.zzn()
            r0.zza(r9, r10)
            return
        L85:
            com.google.android.gms.measurement.internal.zzjc r0 = r8.zza
            com.google.android.gms.measurement.internal.zzky r0 = r0.zzn()
            r0.zza(r9, r10)
            return
        L8f:
            r0 = move-exception
            goto Lab
        L91:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzjc r1 = r8.zza     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.zzfz r1 = r1.zzj()     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.zzgb r1 = r1.zzg()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r1.zza(r2, r0)     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.zzjc r0 = r8.zza
            com.google.android.gms.measurement.internal.zzky r0 = r0.zzn()
            r0.zza(r9, r10)
            return
        Lab:
            com.google.android.gms.measurement.internal.zzjc r1 = r8.zza
            com.google.android.gms.measurement.internal.zzky r1 = r1.zzn()
            r1.zza(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzko.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzn().zza(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) throws IllegalStateException {
        this.zza.zzn().zzb(activity);
        zzmn zzmnVarZzp = this.zza.zzp();
        zzmnVarZzp.zzl().zzb(new zzmp(zzmnVarZzp, zzmnVarZzp.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) throws IllegalStateException {
        zzmn zzmnVarZzp = this.zza.zzp();
        zzmnVarZzp.zzl().zzb(new zzmq(zzmnVarZzp, zzmnVarZzp.zzb().elapsedRealtime()));
        this.zza.zzn().zzc(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzn().zzb(activity, bundle);
    }
}
