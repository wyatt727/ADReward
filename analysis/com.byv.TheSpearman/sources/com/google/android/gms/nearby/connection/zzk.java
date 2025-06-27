package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzk implements Parcelable.Creator<ConnectionOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConnectionOptions createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = true;
        boolean z10 = true;
        boolean z11 = true;
        byte[] bArrCreateByteArray = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 2:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    z7 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    z8 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 8:
                    z9 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 10:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 12:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ConnectionOptions(z, z3, z4, z5, z6, z7, z8, z9, bArrCreateByteArray, z2, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConnectionOptions[] newArray(int i) {
        return new ConnectionOptions[i];
    }
}
