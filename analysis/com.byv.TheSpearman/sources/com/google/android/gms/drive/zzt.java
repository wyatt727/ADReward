package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzt implements Parcelable.Creator<UserMetadata> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UserMetadata[] newArray(int i) {
        return new UserMetadata[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UserMetadata createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                strCreateString = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                strCreateString2 = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 4) {
                strCreateString3 = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 5) {
                z = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 6) {
                strCreateString4 = SafeParcelReader.createString(parcel, header);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new UserMetadata(strCreateString, strCreateString2, strCreateString3, z, strCreateString4);
    }
}
