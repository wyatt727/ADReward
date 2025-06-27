package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfuv extends zzfvh {
    final /* synthetic */ zzfup zza;
    final /* synthetic */ zzfvd zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfuy zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfuv(zzfuy zzfuyVar, TaskCompletionSource taskCompletionSource, zzfup zzfupVar, zzfvd zzfvdVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = zzfupVar;
        this.zzb = zzfvdVar;
        this.zzc = taskCompletionSource2;
        this.zzd = zzfuyVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzftz] */
    @Override // com.google.android.gms.internal.ads.zzfvh
    protected final void zza() {
        try {
            ?? Zze = this.zzd.zza.zze();
            if (Zze == 0) {
                return;
            }
            zzfup zzfupVar = this.zza;
            String str = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfupVar.zzb());
            bundle.putString("callerPackage", str);
            bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, zzfupVar.zza());
            Zze.zze(bundle, new zzfux(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfuy.zzb.zzb(e, "dismiss overlay display from: %s", this.zzd.zzd);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
