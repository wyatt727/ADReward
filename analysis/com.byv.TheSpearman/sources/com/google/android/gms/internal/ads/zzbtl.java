package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbtl implements View.OnClickListener {
    final /* synthetic */ zzbtm zza;

    zzbtl(zzbtm zzbtmVar) {
        this.zza = zzbtmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}
