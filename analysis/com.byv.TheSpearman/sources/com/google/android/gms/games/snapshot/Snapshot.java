package com.google.android.gms.games.snapshot;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public interface Snapshot extends Parcelable, Freezable<Snapshot> {
    SnapshotMetadata getMetadata();

    SnapshotContents getSnapshotContents();
}
