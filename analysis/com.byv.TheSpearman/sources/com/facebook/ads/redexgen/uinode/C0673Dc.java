package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame;

/* renamed from: com.facebook.ads.redexgen.X.Dc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0673Dc implements Parcelable.Creator<ApicFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final ApicFrame createFromParcel(Parcel parcel) {
        return new ApicFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final ApicFrame[] newArray(int i) {
        return new ApicFrame[i];
    }
}
