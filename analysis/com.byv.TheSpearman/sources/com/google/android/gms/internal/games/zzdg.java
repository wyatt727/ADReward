package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.SnapshotsClient;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzdg extends zzac implements SnapshotsClient {
    public zzdg(Context context, Games.GamesOptions gamesOptions) {
        super(context, gamesOptions);
    }

    public zzdg(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, gamesOptions);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<Integer> getMaxDataSize() {
        return zza(zzdj.zzev);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<Integer> getMaxCoverImageSize() {
        return zza(zzdi.zzev);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<Intent> getSelectSnapshotIntent(final String str, final boolean z, final boolean z2, final int i) {
        return zza(new RemoteCall(str, z, z2, i) { // from class: com.google.android.gms.internal.games.zzdl
            private final String zzew;
            private final boolean zzfn;
            private final int zzfo;
            private final boolean zzgb;

            {
                this.zzew = str;
                this.zzfn = z;
                this.zzgb = z2;
                this.zzfo = i;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzf) obj).zza(this.zzew, this.zzfn, this.zzgb, this.zzfo));
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<AnnotatedData<SnapshotMetadataBuffer>> load(final boolean z) {
        return zza(new RemoteCall(z) { // from class: com.google.android.gms.internal.games.zzdk
            private final boolean zzex;

            {
                this.zzex = z;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zzf((TaskCompletionSource<AnnotatedData<SnapshotMetadataBuffer>>) obj2, this.zzex);
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<SnapshotsClient.DataOrConflict<Snapshot>> open(SnapshotMetadata snapshotMetadata) {
        return open(snapshotMetadata, -1);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<SnapshotsClient.DataOrConflict<Snapshot>> open(SnapshotMetadata snapshotMetadata, int i) {
        return open(snapshotMetadata.getUniqueName(), false, i);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<SnapshotsClient.DataOrConflict<Snapshot>> open(String str, boolean z) {
        return open(str, z, -1);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<SnapshotsClient.DataOrConflict<Snapshot>> open(final String str, final boolean z, final int i) {
        return zzb(new RemoteCall(str, z, i) { // from class: com.google.android.gms.internal.games.zzdn
            private final String zzew;
            private final int zzfl;
            private final boolean zzfn;

            {
                this.zzew = str;
                this.zzfn = z;
                this.zzfl = i;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<SnapshotsClient.DataOrConflict<Snapshot>>) obj2, this.zzew, this.zzfn, this.zzfl);
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<SnapshotMetadata> commitAndClose(final Snapshot snapshot, final SnapshotMetadataChange snapshotMetadataChange) {
        return zzb(new RemoteCall(snapshot, snapshotMetadataChange) { // from class: com.google.android.gms.internal.games.zzdm
            private final Snapshot zzge;
            private final SnapshotMetadataChange zzgf;

            {
                this.zzge = snapshot;
                this.zzgf = snapshotMetadataChange;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<SnapshotMetadata>) obj2, this.zzge, this.zzgf);
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<Void> discardAndClose(final Snapshot snapshot) {
        return zzb(new RemoteCall(snapshot) { // from class: com.google.android.gms.internal.games.zzdp
            private final Snapshot zzge;

            {
                this.zzge = snapshot;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza(this.zzge);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<String> delete(final SnapshotMetadata snapshotMetadata) {
        return zzb(new RemoteCall(snapshotMetadata) { // from class: com.google.android.gms.internal.games.zzdo
            private final SnapshotMetadata zzgg;

            {
                this.zzgg = snapshotMetadata;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zzc((TaskCompletionSource<String>) obj2, this.zzgg.getSnapshotId());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<SnapshotsClient.DataOrConflict<Snapshot>> resolveConflict(String str, Snapshot snapshot) {
        SnapshotMetadata metadata = snapshot.getMetadata();
        return resolveConflict(str, metadata.getSnapshotId(), new SnapshotMetadataChange.Builder().fromMetadata(metadata).build(), snapshot.getSnapshotContents());
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<SnapshotsClient.DataOrConflict<Snapshot>> resolveConflict(final String str, final String str2, final SnapshotMetadataChange snapshotMetadataChange, final SnapshotContents snapshotContents) {
        return zzb(new RemoteCall(str, str2, snapshotMetadataChange, snapshotContents) { // from class: com.google.android.gms.internal.games.zzdr
            private final String zzew;
            private final String zzfz;
            private final SnapshotMetadataChange zzgh;
            private final SnapshotContents zzgi;

            {
                this.zzew = str;
                this.zzfz = str2;
                this.zzgh = snapshotMetadataChange;
                this.zzgi = snapshotContents;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<SnapshotsClient.DataOrConflict<Snapshot>>) obj2, this.zzew, this.zzfz, this.zzgh, this.zzgi);
            }
        });
    }
}
