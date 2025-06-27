package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbti implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbtj zza;

    zzbti(zzbtj zzbtjVar) {
        this.zza = zzbtjVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        this.zza.zzh("Operation denied by user.");
    }
}
