package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzk implements Parcelable.Creator<ActivityRecognitionResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityRecognitionResult createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        ArrayList arrayListCreateTypedList = null;
        Bundle bundleCreateBundle = null;
        int i = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, DetectedActivity.CREATOR);
            } else if (fieldId == 2) {
                j = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 3) {
                j2 = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 4) {
                i = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ActivityRecognitionResult(arrayListCreateTypedList, j, j2, i, bundleCreateBundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityRecognitionResult[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
