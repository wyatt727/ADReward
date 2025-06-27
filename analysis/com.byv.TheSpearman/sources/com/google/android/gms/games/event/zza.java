package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.games.PlayerEntity;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zza implements Parcelable.Creator<EventEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ EventEntity[] newArray(int i) {
        return new EventEntity[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ EventEntity createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        Uri uri = null;
        String strCreateString4 = null;
        PlayerEntity playerEntity = null;
        String strCreateString5 = null;
        long j = 0;
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    uri = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
                    break;
                case 5:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    playerEntity = (PlayerEntity) SafeParcelReader.createParcelable(parcel, header, PlayerEntity.CREATOR);
                    break;
                case 7:
                    j = SafeParcelReader.readLong(parcel, header);
                    break;
                case 8:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new EventEntity(strCreateString, strCreateString2, strCreateString3, uri, strCreateString4, playerEntity, j, strCreateString5, z);
    }
}
