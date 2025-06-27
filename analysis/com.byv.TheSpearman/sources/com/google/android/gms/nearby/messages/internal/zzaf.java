package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.messages.Message;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzaf implements Parcelable.Creator<zzae> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzae createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        Message message = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                message = (Message) SafeParcelReader.createParcelable(parcel, header, Message.CREATOR);
            } else if (fieldId != 1000) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                i = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzae(i, message);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzae[] newArray(int i) {
        return new zzae[i];
    }
}
