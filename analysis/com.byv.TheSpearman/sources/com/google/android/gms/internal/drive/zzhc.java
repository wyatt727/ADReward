package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.drive.DriveId;

/* loaded from: classes3.dex */
public final class zzhc implements Parcelable.Creator<zzhb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzhb[] newArray(int i) {
        return new zzhb[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzhb createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        DriveId driveId = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(header) == 2) {
                driveId = (DriveId) SafeParcelReader.createParcelable(parcel, header, DriveId.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzhb(driveId);
    }
}
