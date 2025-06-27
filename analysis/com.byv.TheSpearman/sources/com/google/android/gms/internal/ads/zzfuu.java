package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfuu extends zzfvh {
    final /* synthetic */ zzfva zza;
    final /* synthetic */ zzfvd zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfuy zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfuu(zzfuy zzfuyVar, TaskCompletionSource taskCompletionSource, zzfva zzfvaVar, zzfvd zzfvdVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = zzfvaVar;
        this.zzb = zzfvdVar;
        this.zzc = taskCompletionSource2;
        this.zzd = zzfuyVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzftz] */
    @Override // com.google.android.gms.internal.ads.zzfvh
    protected final void zza() {
        try {
            ?? Zze = this.zzd.zza.zze();
            if (Zze == 0) {
                return;
            }
            zzfuy zzfuyVar = this.zzd;
            String str = zzfuyVar.zzd;
            zzfva zzfvaVar = this.zza;
            String str2 = zzfuyVar.zzd;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzfvaVar.zzf());
            bundle.putString("adFieldEnifd", zzfvaVar.zzg());
            bundle.putInt("layoutGravity", zzfvaVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfvaVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzfvaVar.zze());
            bundle.putString("deeplinkUrl", null);
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str2);
            if (zzfvaVar.zzh() != null) {
                bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, zzfvaVar.zzh());
            }
            Zze.zzf(str, bundle, new zzfux(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfuy.zzb.zzb(e, "show overlay display from: %s", this.zzd.zzd);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
