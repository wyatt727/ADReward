package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame;

/* renamed from: com.facebook.ads.redexgen.X.Dm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0679Dm implements Parcelable.Creator<TextInformationFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final TextInformationFrame createFromParcel(Parcel parcel) {
        return new TextInformationFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final TextInformationFrame[] newArray(int i) {
        return new TextInformationFrame[i];
    }
}
