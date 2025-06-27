package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.GeobFrame;

/* loaded from: assets/audience_network.dex */
public class Dh implements Parcelable.Creator<GeobFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final GeobFrame createFromParcel(Parcel parcel) {
        return new GeobFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final GeobFrame[] newArray(int i) {
        return new GeobFrame[i];
    }
}
