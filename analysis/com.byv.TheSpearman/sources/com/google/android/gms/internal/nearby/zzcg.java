package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzcg implements OnFailureListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcn zzb;

    zzcg(zzcn zzcnVar, String str) {
        this.zzb = zzcnVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        if ((exc instanceof ApiException) && ((ApiException) exc).getStatusCode() == 8003) {
            return;
        }
        this.zzb.zzg(this.zza);
    }
}
