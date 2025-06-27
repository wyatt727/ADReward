package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.2.0 */
/* loaded from: classes3.dex */
final class zzl {
    private final Application zza;
    private final zzap zzb;

    zzl(Application application, zzap zzapVar) {
        this.zza = application;
        this.zzb = zzapVar;
    }

    final zzci zzc(Activity activity, ConsentRequestParameters consentRequestParameters) throws zzg {
        ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
        if (consentDebugSettings == null) {
            consentDebugSettings = new ConsentDebugSettings.Builder(this.zza).build();
        }
        return zzn.zza(new zzn(this, activity, consentDebugSettings, consentRequestParameters, null));
    }
}
