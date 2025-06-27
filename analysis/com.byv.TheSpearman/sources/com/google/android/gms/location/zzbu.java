package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzbu implements Parcelable.Creator<SleepClassifyEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepClassifyEvent createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        int i8 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    i4 = SafeParcelReader.readInt(parcel, header);
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
                case 8:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    i8 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new SleepClassifyEvent(i, i2, i3, i4, i5, i6, i7, z, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepClassifyEvent[] newArray(int i) {
        return new SleepClassifyEvent[i];
    }
}
