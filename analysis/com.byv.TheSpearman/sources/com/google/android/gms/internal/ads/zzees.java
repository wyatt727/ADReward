package com.google.android.gms.internal.ads;

import android.app.Activity;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzees extends zzefp {
    private Activity zza;
    private com.google.android.gms.ads.internal.overlay.zzm zzb;
    private String zzc;
    private String zzd;

    zzees() {
    }

    @Override // com.google.android.gms.internal.ads.zzefp
    public final zzefp zza(Activity activity) {
        Objects.requireNonNull(activity, "Null activity");
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzefp
    public final zzefp zzb(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzb = zzmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzefp
    public final zzefp zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzefp
    public final zzefp zzd(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzefp
    public final zzefq zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzeeu(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
