package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfvn extends zzfvh {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfvq zzb;

    zzfvn(zzfvq zzfvqVar, IBinder iBinder) {
        this.zza = iBinder;
        this.zzb = zzfvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void zza() throws RemoteException {
        this.zzb.zza.zzn = zzfty.zzb(this.zza);
        zzfvr.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        Iterator it = this.zzb.zza.zze.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.zzb.zza.zze.clear();
    }
}
