package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class zan implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
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
                    j = SafeParcelReader.readLong(parcel, header);
                    break;
                case 5:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 9:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new MethodInvocation(i, i2, i3, j, j2, strCreateString, strCreateString2, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
