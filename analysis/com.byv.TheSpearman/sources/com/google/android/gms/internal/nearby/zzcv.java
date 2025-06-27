package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzcv extends zzdl {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ byte[] zzc;
    final /* synthetic */ ListenerHolder zzd;
    final /* synthetic */ ListenerHolder zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcv(zzdm zzdmVar, GoogleApiClient googleApiClient, String str, String str2, byte[] bArr, ListenerHolder listenerHolder, ListenerHolder listenerHolder2) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = listenerHolder;
        this.zze = listenerHolder2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzbf zzbfVar = (zzbf) anyClient;
        String str = this.zza;
        String str2 = this.zzb;
        byte[] bArr = this.zzc;
        ListenerHolder listenerHolder = this.zzd;
        ListenerHolder listenerHolder2 = this.zze;
        zzeh zzehVar = (zzeh) zzbfVar.getService();
        zzgl zzglVar = new zzgl();
        zzglVar.zza(new zzbc(this));
        zzglVar.zzd(str);
        zzglVar.zze(str2);
        zzglVar.zzf(bArr);
        zzglVar.zzb(new zzav(zzbfVar.getContext(), listenerHolder2));
        zzglVar.zzc(new zzak(listenerHolder));
        zzehVar.zzh(zzglVar.zzj());
    }
}
