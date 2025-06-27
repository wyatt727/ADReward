package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzdx extends zzec {
    private final /* synthetic */ SnapshotMetadataChange zzgo;
    private final /* synthetic */ String zzgp;
    private final /* synthetic */ String zzgq;
    private final /* synthetic */ SnapshotContents zzgr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdx(zzdq zzdqVar, GoogleApiClient googleApiClient, String str, String str2, SnapshotMetadataChange snapshotMetadataChange, SnapshotContents snapshotContents) {
        super(googleApiClient, null);
        this.zzgp = str;
        this.zzgq = str2;
        this.zzgo = snapshotMetadataChange;
        this.zzgr = snapshotContents;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzf) anyClient).zza(this, this.zzgp, this.zzgq, this.zzgo, this.zzgr);
    }
}
