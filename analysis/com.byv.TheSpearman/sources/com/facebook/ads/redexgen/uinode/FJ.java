package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* loaded from: assets/audience_network.dex */
public class FJ implements Parcelable.Creator<TrackGroup> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final TrackGroup createFromParcel(Parcel parcel) {
        return new TrackGroup(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final TrackGroup[] newArray(int i) {
        return new TrackGroup[i];
    }
}
