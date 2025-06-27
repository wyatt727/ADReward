package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfuw extends zzfvh {
    final /* synthetic */ zzfvf zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfvd zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzfuy zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfuw(zzfuy zzfuyVar, TaskCompletionSource taskCompletionSource, zzfvf zzfvfVar, int i, zzfvd zzfvdVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = zzfvfVar;
        this.zzb = i;
        this.zzc = zzfvdVar;
        this.zzd = taskCompletionSource2;
        this.zze = zzfuyVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzftz] */
    @Override // com.google.android.gms.internal.ads.zzfvh
    protected final void zza() {
        try {
            ?? Zze = this.zze.zza.zze();
            if (Zze == 0) {
                return;
            }
            zzfvf zzfvfVar = this.zza;
            String str = this.zze.zzd;
            int i = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfvfVar.zzb());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str);
            bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, zzfvfVar.zza());
            Zze.zzg(bundle, new zzfux(this.zze, this.zzc));
        } catch (RemoteException e) {
            zzfuy.zzb.zzb(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.zzb), this.zze.zzd);
            this.zzd.trySetException(new RuntimeException(e));
        }
    }
}
