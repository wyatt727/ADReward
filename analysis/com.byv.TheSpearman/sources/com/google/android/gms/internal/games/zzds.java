package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzds extends zzec {
    private final /* synthetic */ String zzgj;
    private final /* synthetic */ boolean zzgk;
    private final /* synthetic */ int zzgl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzds(zzdq zzdqVar, GoogleApiClient googleApiClient, String str, boolean z, int i) {
        super(googleApiClient, null);
        this.zzgj = str;
        this.zzgk = z;
        this.zzgl = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzf) anyClient).zza(this, this.zzgj, this.zzgk, this.zzgl);
    }
}
