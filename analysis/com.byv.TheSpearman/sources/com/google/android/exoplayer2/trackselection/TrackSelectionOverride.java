package com.google.android.exoplayer2.trackselection;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public final class TrackSelectionOverride implements Bundleable {
    public final TrackGroup mediaTrackGroup;
    public final ImmutableList<Integer> trackIndices;
    private static final String FIELD_TRACK_GROUP = Util.intToStringMaxRadix(0);
    private static final String FIELD_TRACKS = Util.intToStringMaxRadix(1);
    public static final Bundleable.Creator<TrackSelectionOverride> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return TrackSelectionOverride.lambda$static$0(bundle);
        }
    };

    public TrackSelectionOverride(TrackGroup trackGroup, int i) {
        this(trackGroup, ImmutableList.of(Integer.valueOf(i)));
    }

    public TrackSelectionOverride(TrackGroup trackGroup, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= trackGroup.length)) {
            throw new IndexOutOfBoundsException();
        }
        this.mediaTrackGroup = trackGroup;
        this.trackIndices = ImmutableList.copyOf((Collection) list);
    }

    public int getType() {
        return this.mediaTrackGroup.type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) obj;
        return this.mediaTrackGroup.equals(trackSelectionOverride.mediaTrackGroup) && this.trackIndices.equals(trackSelectionOverride.trackIndices);
    }

    public int hashCode() {
        return this.mediaTrackGroup.hashCode() + (this.trackIndices.hashCode() * 31);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
        bundle.putIntArray(FIELD_TRACKS, Ints.toArray(this.trackIndices));
        return bundle;
    }

    static /* synthetic */ TrackSelectionOverride lambda$static$0(Bundle bundle) {
        return new TrackSelectionOverride((TrackGroup) TrackGroup.CREATOR.fromBundle((Bundle) Assertions.checkNotNull(bundle.getBundle(FIELD_TRACK_GROUP))), Ints.asList((int[]) Assertions.checkNotNull(bundle.getIntArray(FIELD_TRACKS))));
    }
}
