package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class PlayerLevelInfo extends com.google.android.gms.games.internal.zzb {
    public static final Parcelable.Creator<PlayerLevelInfo> CREATOR = new zzk();
    private final long zzbu;
    private final long zzbv;
    private final PlayerLevel zzbw;
    private final PlayerLevel zzbx;

    public PlayerLevelInfo(long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
        Preconditions.checkState(j != -1);
        Preconditions.checkNotNull(playerLevel);
        Preconditions.checkNotNull(playerLevel2);
        this.zzbu = j;
        this.zzbv = j2;
        this.zzbw = playerLevel;
        this.zzbx = playerLevel2;
    }

    public final long getCurrentXpTotal() {
        return this.zzbu;
    }

    public final long getLastLevelUpTimestamp() {
        return this.zzbv;
    }

    public final PlayerLevel getCurrentLevel() {
        return this.zzbw;
    }

    public final PlayerLevel getNextLevel() {
        return this.zzbx;
    }

    public final boolean isMaxLevel() {
        return this.zzbw.equals(this.zzbx);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevelInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PlayerLevelInfo playerLevelInfo = (PlayerLevelInfo) obj;
        return Objects.equal(Long.valueOf(this.zzbu), Long.valueOf(playerLevelInfo.zzbu)) && Objects.equal(Long.valueOf(this.zzbv), Long.valueOf(playerLevelInfo.zzbv)) && Objects.equal(this.zzbw, playerLevelInfo.zzbw) && Objects.equal(this.zzbx, playerLevelInfo.zzbx);
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zzbu), Long.valueOf(this.zzbv), this.zzbw, this.zzbx);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getCurrentXpTotal());
        SafeParcelWriter.writeLong(parcel, 2, getLastLevelUpTimestamp());
        SafeParcelWriter.writeParcelable(parcel, 3, getCurrentLevel(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getNextLevel(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
