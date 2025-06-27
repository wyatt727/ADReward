package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzfu implements Parcelable.Creator<zzft> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzft[] newArray(int i) {
        return new zzft[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzft createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        DataHolder dataHolder = null;
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                dataHolder = (DataHolder) SafeParcelReader.createParcelable(parcel, header, DataHolder.CREATOR);
            } else if (fieldId == 3) {
                z = SafeParcelReader.readBoolean(parcel, header);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzft(dataHolder, z);
    }
}
