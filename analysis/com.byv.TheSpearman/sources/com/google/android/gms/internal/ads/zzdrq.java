package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdrq implements zzczl {
    private final zzcgm zza;

    zzdrq(zzcgm zzcgmVar) {
        this.zza = zzcgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzdj(Context context) {
        zzcgm zzcgmVar = this.zza;
        if (zzcgmVar != null) {
            zzcgmVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzdl(Context context) {
        zzcgm zzcgmVar = this.zza;
        if (zzcgmVar != null) {
            zzcgmVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzdm(Context context) {
        zzcgm zzcgmVar = this.zza;
        if (zzcgmVar != null) {
            zzcgmVar.onResume();
        }
    }
}
