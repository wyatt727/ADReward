package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzcw extends zzdl {
    final /* synthetic */ String zza;
    final /* synthetic */ byte[] zzb;
    final /* synthetic */ ListenerHolder zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcw(zzdm zzdmVar, GoogleApiClient googleApiClient, String str, byte[] bArr, ListenerHolder listenerHolder) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = bArr;
        this.zzc = listenerHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzbf zzbfVar = (zzbf) anyClient;
        String str = this.zza;
        byte[] bArr = this.zzb;
        ListenerHolder listenerHolder = this.zzc;
        zzeh zzehVar = (zzeh) zzbfVar.getService();
        zzq zzqVar = new zzq();
        zzqVar.zza(new zzbc(this));
        zzqVar.zzc(str);
        zzqVar.zzd(bArr);
        zzqVar.zzb(new zzav(zzbfVar.getContext(), listenerHolder));
        zzehVar.zzi(zzqVar.zzf());
    }
}
