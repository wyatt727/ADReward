package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.Snapshots;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzdz implements Snapshots.CommitSnapshotResult {
    private final /* synthetic */ Status zzfc;

    zzdz(zzdw zzdwVar, Status status) {
        this.zzfc = status;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult
    public final SnapshotMetadata getSnapshotMetadata() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzfc;
    }
}
