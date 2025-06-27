package com.facebook.ads.internal.androidx.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;

/* loaded from: assets/audience_network.dex */
public class LinearLayoutManager$SavedState implements Parcelable {
    public static final Parcelable.Creator<LinearLayoutManager$SavedState> CREATOR = new Parcelable.Creator<LinearLayoutManager$SavedState>() { // from class: com.facebook.ads.redexgen.X.4U
        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.Parcelable.Creator
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final LinearLayoutManager$SavedState createFromParcel(Parcel parcel) {
            return new LinearLayoutManager$SavedState(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.Parcelable.Creator
        /* renamed from: A01, reason: merged with bridge method [inline-methods] */
        public final LinearLayoutManager$SavedState[] newArray(int i) {
            return new LinearLayoutManager$SavedState[i];
        }
    };
    public int A00;
    public int A01;
    public boolean A02;

    public LinearLayoutManager$SavedState() {
    }

    public LinearLayoutManager$SavedState(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt() == 1;
    }

    public LinearLayoutManager$SavedState(LinearLayoutManager$SavedState linearLayoutManager$SavedState) {
        this.A01 = linearLayoutManager$SavedState.A01;
        this.A00 = linearLayoutManager$SavedState.A00;
        this.A02 = linearLayoutManager$SavedState.A02;
    }

    public final void A00() {
        this.A01 = -1;
    }

    public final boolean A01() {
        return this.A01 >= 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
