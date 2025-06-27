package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbth implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbtj zza;

    zzbth(zzbtj zzbtjVar) {
        this.zza = zzbtjVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbtj zzbtjVar = this.zza;
        Intent intentZzb = zzbtjVar.zzb();
        com.google.android.gms.ads.internal.zzu.zzp();
        com.google.android.gms.ads.internal.util.zzt.zzT(zzbtjVar.zzb, intentZzb);
    }
}
