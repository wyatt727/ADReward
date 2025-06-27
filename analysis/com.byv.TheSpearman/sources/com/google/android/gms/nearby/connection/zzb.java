package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzb implements Parcelable.Creator<AdvertisingOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AdvertisingOptions createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Strategy strategy = null;
        byte[] bArrCreateByteArray = null;
        ParcelUuid parcelUuid = null;
        byte[] bArrCreateByteArray2 = null;
        zzv[] zzvVarArr = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i = 0;
        int i2 = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = true;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = true;
        boolean z13 = true;
        boolean z14 = true;
        long j = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strategy = (Strategy) SafeParcelReader.createParcelable(parcel, header, Strategy.CREATOR);
                    break;
                case 2:
                    z7 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    z8 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    z9 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 7:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 8:
                    parcelUuid = (ParcelUuid) SafeParcelReader.createParcelable(parcel, header, ParcelUuid.CREATOR);
                    break;
                case 9:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    z13 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 12:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 14:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 15:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 16:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 17:
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 18:
                    j = SafeParcelReader.readLong(parcel, header);
                    break;
                case 19:
                    zzvVarArr = (zzv[]) SafeParcelReader.createTypedArray(parcel, header, zzv.CREATOR);
                    break;
                case 20:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 21:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 22:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new AdvertisingOptions(strategy, z7, z8, z9, z10, bArrCreateByteArray, z, parcelUuid, z11, z12, z13, z2, z3, z4, i, i2, bArrCreateByteArray2, j, zzvVarArr, z5, z14, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AdvertisingOptions[] newArray(int i) {
        return new AdvertisingOptions[i];
    }
}
