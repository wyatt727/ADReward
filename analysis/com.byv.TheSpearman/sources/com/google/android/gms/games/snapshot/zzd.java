package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzd implements Parcelable.Creator<SnapshotMetadataEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SnapshotMetadataEntity[] newArray(int i) {
        return new SnapshotMetadataEntity[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SnapshotMetadataEntity createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        String strCreateString = null;
        Uri uri = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    gameEntity = (GameEntity) SafeParcelReader.createParcelable(parcel, header, GameEntity.CREATOR);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) SafeParcelReader.createParcelable(parcel, header, PlayerEntity.CREATOR);
                    break;
                case 3:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 5:
                    uri = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
                    break;
                case 6:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    j = SafeParcelReader.readLong(parcel, header);
                    break;
                case 10:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 11:
                    f = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 12:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 14:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 15:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new SnapshotMetadataEntity(gameEntity, playerEntity, strCreateString, uri, strCreateString2, strCreateString3, strCreateString4, j, j2, f, strCreateString5, z, j3, strCreateString6);
    }
}
