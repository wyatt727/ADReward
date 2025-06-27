package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class PlayerLevel extends com.google.android.gms.games.internal.zzb {
    public static final Parcelable.Creator<PlayerLevel> CREATOR = new zzj();
    private final int zzbr;
    private final long zzbs;
    private final long zzbt;

    public PlayerLevel(int i, long j, long j2) {
        Preconditions.checkState(j >= 0, "Min XP must be positive!");
        Preconditions.checkState(j2 > j, "Max XP must be more than min XP!");
        this.zzbr = i;
        this.zzbs = j;
        this.zzbt = j2;
    }

    public final int getLevelNumber() {
        return this.zzbr;
    }

    public final long getMinXp() {
        return this.zzbs;
    }

    public final long getMaxXp() {
        return this.zzbt;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzbr), Long.valueOf(this.zzbs), Long.valueOf(this.zzbt));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevel)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PlayerLevel playerLevel = (PlayerLevel) obj;
        return Objects.equal(Integer.valueOf(playerLevel.getLevelNumber()), Integer.valueOf(getLevelNumber())) && Objects.equal(Long.valueOf(playerLevel.getMinXp()), Long.valueOf(getMinXp())) && Objects.equal(Long.valueOf(playerLevel.getMaxXp()), Long.valueOf(getMaxXp()));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("LevelNumber", Integer.valueOf(getLevelNumber())).add("MinXp", Long.valueOf(getMinXp())).add("MaxXp", Long.valueOf(getMaxXp())).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getLevelNumber());
        SafeParcelWriter.writeLong(parcel, 2, getMinXp());
        SafeParcelWriter.writeLong(parcel, 3, getMaxXp());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
