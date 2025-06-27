package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfux extends zzfua {
    final /* synthetic */ zzfuy zza;
    private final zzfvd zzb;

    zzfux(zzfuy zzfuyVar, zzfvd zzfvdVar) {
        this.zza = zzfuyVar;
        this.zzb = zzfvdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfvb zzfvbVarZzc = zzfvc.zzc();
        zzfvbVarZzc.zzb(i);
        if (string != null) {
            zzfvbVarZzc.zza(string);
        }
        this.zzb.zza(zzfvbVarZzc.zzc());
        if (i == 8157) {
            this.zza.zzc();
        }
    }
}
