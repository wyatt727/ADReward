package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public class zzi implements Parcelable.Creator<PlayerEntity> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public PlayerEntity createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        String strCreateString = null;
        String strCreateString2 = null;
        Uri uri = null;
        Uri uri2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        PlayerLevelInfo playerLevelInfo = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        Uri uri3 = null;
        String strCreateString8 = null;
        Uri uri4 = null;
        String strCreateString9 = null;
        zzm zzmVar = null;
        zza zzaVar = null;
        long j3 = -1;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 29) {
                j3 = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 33) {
                zzmVar = (zzm) SafeParcelReader.createParcelable(parcel, header, zzm.CREATOR);
            } else if (fieldId != 35) {
                switch (fieldId) {
                    case 1:
                        strCreateString = SafeParcelReader.createString(parcel, header);
                        break;
                    case 2:
                        strCreateString2 = SafeParcelReader.createString(parcel, header);
                        break;
                    case 3:
                        uri = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
                        break;
                    case 4:
                        uri2 = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
                        break;
                    case 5:
                        j = SafeParcelReader.readLong(parcel, header);
                        break;
                    case 6:
                        i = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 7:
                        j2 = SafeParcelReader.readLong(parcel, header);
                        break;
                    case 8:
                        strCreateString3 = SafeParcelReader.createString(parcel, header);
                        break;
                    case 9:
                        strCreateString4 = SafeParcelReader.createString(parcel, header);
                        break;
                    default:
                        switch (fieldId) {
                            case 14:
                                strCreateString5 = SafeParcelReader.createString(parcel, header);
                                break;
                            case 15:
                                mostRecentGameInfoEntity = (MostRecentGameInfoEntity) SafeParcelReader.createParcelable(parcel, header, MostRecentGameInfoEntity.CREATOR);
                                break;
                            case 16:
                                playerLevelInfo = (PlayerLevelInfo) SafeParcelReader.createParcelable(parcel, header, PlayerLevelInfo.CREATOR);
                                break;
                            default:
                                switch (fieldId) {
                                    case 18:
                                        z = SafeParcelReader.readBoolean(parcel, header);
                                        break;
                                    case 19:
                                        z2 = SafeParcelReader.readBoolean(parcel, header);
                                        break;
                                    case 20:
                                        strCreateString6 = SafeParcelReader.createString(parcel, header);
                                        break;
                                    case 21:
                                        strCreateString7 = SafeParcelReader.createString(parcel, header);
                                        break;
                                    case 22:
                                        uri3 = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
                                        break;
                                    case 23:
                                        strCreateString8 = SafeParcelReader.createString(parcel, header);
                                        break;
                                    case 24:
                                        uri4 = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
                                        break;
                                    case 25:
                                        strCreateString9 = SafeParcelReader.createString(parcel, header);
                                        break;
                                    default:
                                        SafeParcelReader.skipUnknownField(parcel, header);
                                        break;
                                }
                        }
                }
            } else {
                zzaVar = (zza) SafeParcelReader.createParcelable(parcel, header, zza.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new PlayerEntity(strCreateString, strCreateString2, uri, uri2, j, i, j2, strCreateString3, strCreateString4, strCreateString5, mostRecentGameInfoEntity, playerLevelInfo, z, z2, strCreateString6, strCreateString7, uri3, strCreateString8, uri4, strCreateString9, j3, zzmVar, zzaVar);
    }

    @Override // android.os.Parcelable.Creator
    public /* synthetic */ PlayerEntity[] newArray(int i) {
        return new PlayerEntity[i];
    }
}
