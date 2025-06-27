package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zza implements Parcelable.Creator<VideoCapabilities> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VideoCapabilities[] newArray(int i) {
        return new VideoCapabilities[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VideoCapabilities createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean[] zArrCreateBooleanArray = null;
        boolean[] zArrCreateBooleanArray2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                z = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 2) {
                z2 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 3) {
                z3 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 4) {
                zArrCreateBooleanArray = SafeParcelReader.createBooleanArray(parcel, header);
            } else if (fieldId == 5) {
                zArrCreateBooleanArray2 = SafeParcelReader.createBooleanArray(parcel, header);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new VideoCapabilities(z, z2, z3, zArrCreateBooleanArray, zArrCreateBooleanArray2);
    }
}
