package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzn implements Parcelable.Creator<ParentDriveIdSet> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ParentDriveIdSet[] newArray(int i) {
        return new ParentDriveIdSet[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ParentDriveIdSet createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayListCreateTypedList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(header) == 2) {
                arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zzq.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ParentDriveIdSet(arrayListCreateTypedList);
    }
}
