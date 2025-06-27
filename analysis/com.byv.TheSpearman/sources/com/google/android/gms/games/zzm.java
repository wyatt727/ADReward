package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzm extends com.google.android.gms.games.internal.zzb implements PlayerRelationshipInfo {
    public static final Parcelable.Creator<zzm> CREATOR = new zzl();
    private int zzcb;
    private String zzcc;
    private String zzcd;
    private String zzce;

    public zzm(PlayerRelationshipInfo playerRelationshipInfo) {
        this.zzcb = playerRelationshipInfo.getFriendStatus();
        this.zzcc = playerRelationshipInfo.zzq();
        this.zzcd = playerRelationshipInfo.zzr();
        this.zzce = playerRelationshipInfo.zzs();
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ PlayerRelationshipInfo freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public zzm(int i, String str, String str2, String str3) {
        this.zzcb = i;
        this.zzcc = str;
        this.zzcd = str2;
        this.zzce = str3;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final int getFriendStatus() {
        return this.zzcb;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzq() {
        return this.zzcc;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzr() {
        return this.zzcd;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzs() {
        return this.zzce;
    }

    public final int hashCode() {
        return zza(this);
    }

    static int zza(PlayerRelationshipInfo playerRelationshipInfo) {
        return Objects.hashCode(Integer.valueOf(playerRelationshipInfo.getFriendStatus()), playerRelationshipInfo.zzq(), playerRelationshipInfo.zzr(), playerRelationshipInfo.zzs());
    }

    public final boolean equals(Object obj) {
        return zza(this, obj);
    }

    static boolean zza(PlayerRelationshipInfo playerRelationshipInfo, Object obj) {
        if (!(obj instanceof PlayerRelationshipInfo)) {
            return false;
        }
        if (obj == playerRelationshipInfo) {
            return true;
        }
        PlayerRelationshipInfo playerRelationshipInfo2 = (PlayerRelationshipInfo) obj;
        return playerRelationshipInfo2.getFriendStatus() == playerRelationshipInfo.getFriendStatus() && Objects.equal(playerRelationshipInfo2.zzq(), playerRelationshipInfo.zzq()) && Objects.equal(playerRelationshipInfo2.zzr(), playerRelationshipInfo.zzr()) && Objects.equal(playerRelationshipInfo2.zzs(), playerRelationshipInfo.zzs());
    }

    public final String toString() {
        return zzb(this);
    }

    static String zzb(PlayerRelationshipInfo playerRelationshipInfo) {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(playerRelationshipInfo);
        stringHelper.add("FriendStatus", Integer.valueOf(playerRelationshipInfo.getFriendStatus()));
        if (playerRelationshipInfo.zzq() != null) {
            stringHelper.add("Nickname", playerRelationshipInfo.zzq());
        }
        if (playerRelationshipInfo.zzr() != null) {
            stringHelper.add("InvitationNickname", playerRelationshipInfo.zzr());
        }
        if (playerRelationshipInfo.zzs() != null) {
            stringHelper.add("NicknameAbuseReportToken", playerRelationshipInfo.zzr());
        }
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getFriendStatus());
        SafeParcelWriter.writeString(parcel, 2, this.zzcc, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzcd, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzce, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
