package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.2.0 */
/* loaded from: classes3.dex */
final class zzai {
    private Application zza;

    private zzai() {
    }

    /* synthetic */ zzai(zzah zzahVar) {
    }

    public final zza zza() {
        zzdp.zzb(this.zza, Application.class);
        return new zzag(this.zza, null);
    }

    public final zzai zzb(Application application) {
        Objects.requireNonNull(application);
        this.zza = application;
        return this;
    }
}
