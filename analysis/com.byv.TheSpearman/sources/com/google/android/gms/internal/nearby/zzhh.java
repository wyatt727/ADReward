package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzhh implements Parcelable.Creator<zzhg> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzhg createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        ParcelUuid parcelUuid = null;
        ParcelUuid parcelUuid2 = null;
        ParcelUuid parcelUuid3 = null;
        byte[] bArrCreateByteArray = null;
        byte[] bArrCreateByteArray2 = null;
        byte[] bArrCreateByteArray3 = null;
        byte[] bArrCreateByteArray4 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                switch (fieldId) {
                    case 4:
                        parcelUuid = (ParcelUuid) SafeParcelReader.createParcelable(parcel, header, ParcelUuid.CREATOR);
                        break;
                    case 5:
                        parcelUuid2 = (ParcelUuid) SafeParcelReader.createParcelable(parcel, header, ParcelUuid.CREATOR);
                        break;
                    case 6:
                        parcelUuid3 = (ParcelUuid) SafeParcelReader.createParcelable(parcel, header, ParcelUuid.CREATOR);
                        break;
                    case 7:
                        bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                        break;
                    case 8:
                        bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                        break;
                    case 9:
                        i2 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 10:
                        bArrCreateByteArray3 = SafeParcelReader.createByteArray(parcel, header);
                        break;
                    case 11:
                        bArrCreateByteArray4 = SafeParcelReader.createByteArray(parcel, header);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                i = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzhg(i, parcelUuid, parcelUuid2, parcelUuid3, bArrCreateByteArray, bArrCreateByteArray2, i2, bArrCreateByteArray3, bArrCreateByteArray4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzhg[] newArray(int i) {
        return new zzhg[i];
    }
}
