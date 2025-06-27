package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzeht extends zzbsa {
    final /* synthetic */ zzehu zza;
    private final zzegm zzb;

    /* synthetic */ zzeht(zzehu zzehuVar, zzegm zzegmVar, zzehs zzehsVar) {
        this.zza = zzehuVar;
        this.zzb = zzegmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsb
    public final void zze(String str) throws RemoteException {
        ((zzeif) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsb
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeif) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsb
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzc = (View) ObjectWrapper.unwrap(iObjectWrapper);
        ((zzeif) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbsb
    public final void zzh(zzbqx zzbqxVar) throws RemoteException {
        this.zza.zzd = zzbqxVar;
        ((zzeif) this.zzb.zzc).zzo();
    }
}
