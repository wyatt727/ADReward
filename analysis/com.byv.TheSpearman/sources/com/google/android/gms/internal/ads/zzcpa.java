package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcpa implements zzczl {
    private final zzfhg zza;

    public zzcpa(zzfhg zzfhgVar) {
        this.zza = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzdj(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfgp e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzdl(Context context) {
        try {
            this.zza.zzt();
        } catch (zzfgp e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzdm(Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzfgp e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
