package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterTocFrame;

/* renamed from: com.facebook.ads.redexgen.X.Df, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0676Df implements Parcelable.Creator<ChapterTocFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final ChapterTocFrame createFromParcel(Parcel parcel) {
        return new ChapterTocFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final ChapterTocFrame[] newArray(int i) {
        return new ChapterTocFrame[i];
    }
}
