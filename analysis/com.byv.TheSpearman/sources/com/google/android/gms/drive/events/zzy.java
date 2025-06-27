package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.drive.DriveSpace;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzy implements Parcelable.Creator<zzx> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzx[] newArray(int i) {
        return new zzx[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzx createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayListCreateTypedList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(header) == 2) {
                arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, DriveSpace.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzx(arrayListCreateTypedList);
    }
}
