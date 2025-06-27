package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbzp implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzcad zzd;
    private String zze = "-1";
    private int zzf = -1;

    zzbzp(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcad zzcadVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
        this.zzd = zzcadVar;
    }

    private final void zzb(String str, int i) {
        Context context;
        boolean z = false;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaw)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z = true;
        }
        this.zzc.zzF(z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgm)).booleanValue() && z && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "gad_has_consent_for_cookies"
            java.lang.String r1 = "-1"
            java.lang.String r2 = "IABTCF_PurposeConsents"
            com.google.android.gms.internal.ads.zzbdq r3 = com.google.android.gms.internal.ads.zzbdz.zzay     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbdx r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L92
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L92
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L92
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L92
            if (r3 == 0) goto L2d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r9.<init>()     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = "onSharedPreferenceChanged, key = "
            r9.append(r0)     // Catch: java.lang.Throwable -> L92
            r9.append(r10)     // Catch: java.lang.Throwable -> L92
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.ads.internal.util.zze.zza(r9)     // Catch: java.lang.Throwable -> L92
            return
        L2d:
            java.lang.String r3 = r9.getString(r2, r1)     // Catch: java.lang.Throwable -> L92
            r4 = -1
            int r9 = r9.getInt(r0, r4)     // Catch: java.lang.Throwable -> L92
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L92
            int r5 = r10.hashCode()     // Catch: java.lang.Throwable -> L92
            r6 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r7 = 1
            if (r5 == r6) goto L52
            r2 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r5 == r2) goto L4a
            goto L5a
        L4a:
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L5a
            r10 = r7
            goto L5b
        L52:
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L5a
            r10 = 0
            goto L5b
        L5a:
            r10 = r4
        L5b:
            if (r10 == 0) goto L7e
            if (r10 == r7) goto L60
            goto L91
        L60:
            com.google.android.gms.internal.ads.zzbdq r10 = com.google.android.gms.internal.ads.zzbdz.zzaw     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbdx r0 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L92
            java.lang.Object r10 = r0.zza(r10)     // Catch: java.lang.Throwable -> L92
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L92
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L92
            if (r10 == 0) goto L91
            if (r9 == r4) goto L91
            int r10 = r8.zzf     // Catch: java.lang.Throwable -> L92
            if (r10 == r9) goto L91
            r8.zzf = r9     // Catch: java.lang.Throwable -> L92
            r8.zzb(r3, r9)     // Catch: java.lang.Throwable -> L92
            return
        L7e:
            boolean r10 = r3.equals(r1)     // Catch: java.lang.Throwable -> L92
            if (r10 != 0) goto L91
            java.lang.String r10 = r8.zze     // Catch: java.lang.Throwable -> L92
            boolean r10 = r10.equals(r3)     // Catch: java.lang.Throwable -> L92
            if (r10 != 0) goto L91
            r8.zze = r3     // Catch: java.lang.Throwable -> L92
            r8.zzb(r3, r9)     // Catch: java.lang.Throwable -> L92
        L91:
            return
        L92:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzcbh r10 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "AdMobPlusIdlessListener.onSharedPreferenceChanged"
            r10.zzw(r9, r0)
            java.lang.String r10 = "onSharedPreferenceChanged, errorMessage = "
            com.google.android.gms.ads.internal.util.zze.zzb(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzp.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzay)).booleanValue()) {
            onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
        } else {
            onSharedPreferenceChanged(this.zzb, "IABTCF_gdprApplies");
            onSharedPreferenceChanged(this.zzb, "IABTCF_TCString");
        }
    }
}
