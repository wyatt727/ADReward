package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzn implements Parcelable.Creator<zzo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = true;
        boolean z2 = true;
        String strCreateString = "";
        String strCreateString2 = strCreateString;
        String strCreateString3 = strCreateString2;
        String strCreateString4 = strCreateString3;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i2 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        String strCreateString8 = null;
        String strCreateString9 = null;
        String strCreateString10 = null;
        String strCreateString11 = null;
        Boolean booleanObject = null;
        ArrayList<String> arrayListCreateStringList = null;
        String strCreateString12 = null;
        String strCreateString13 = null;
        String strCreateString14 = null;
        long j8 = -2147483648L;
        int i3 = 100;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    j = SafeParcelReader.readLong(parcel, header);
                    break;
                case 7:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 8:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 14:
                    j4 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 15:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 16:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 17:
                case 20:
                case 33:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 18:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 19:
                    strCreateString11 = SafeParcelReader.createString(parcel, header);
                    break;
                case 21:
                    booleanObject = SafeParcelReader.readBooleanObject(parcel, header);
                    break;
                case 22:
                    j5 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 23:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 24:
                    strCreateString12 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 26:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 27:
                    strCreateString13 = SafeParcelReader.createString(parcel, header);
                    break;
                case 28:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 29:
                    j6 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 30:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 31:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 32:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 34:
                    j7 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 35:
                    strCreateString14 = SafeParcelReader.createString(parcel, header);
                    break;
                case 36:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzo(strCreateString5, strCreateString6, strCreateString7, strCreateString8, j, j2, strCreateString9, z, z3, j8, strCreateString10, j3, j4, i, z2, z4, strCreateString11, booleanObject, j5, arrayListCreateStringList, strCreateString12, strCreateString, strCreateString2, strCreateString13, z5, j6, i3, strCreateString3, i2, j7, strCreateString14, strCreateString4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo[] newArray(int i) {
        return new zzo[i];
    }
}
