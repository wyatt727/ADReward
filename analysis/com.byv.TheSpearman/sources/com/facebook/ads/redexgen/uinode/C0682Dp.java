package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceInsertCommand;

/* renamed from: com.facebook.ads.redexgen.X.Dp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0682Dp implements Parcelable.Creator<SpliceInsertCommand> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final SpliceInsertCommand createFromParcel(Parcel parcel) {
        return new SpliceInsertCommand(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final SpliceInsertCommand[] newArray(int i) {
        return new SpliceInsertCommand[i];
    }
}
