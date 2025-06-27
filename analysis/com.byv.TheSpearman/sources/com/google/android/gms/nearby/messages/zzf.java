package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzf implements Parcelable.Creator<Strategy> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Strategy createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1000) {
                switch (fieldId) {
                    case 1:
                        i2 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 2:
                        i3 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 3:
                        i4 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 4:
                        z = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 5:
                        i5 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 6:
                        i6 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 7:
                        i7 = SafeParcelReader.readInt(parcel, header);
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
        return new Strategy(i, i2, i3, i4, z, i5, i6, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Strategy[] newArray(int i) {
        return new Strategy[i];
    }
}
