package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzb;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class AchievementEntity extends zzb implements Achievement {
    public static final Parcelable.Creator<AchievementEntity> CREATOR = new zza();
    private final String description;
    private final String name;
    private final int state;
    private final int type;
    private final String zzck;
    private final Uri zzcl;
    private final String zzcm;
    private final Uri zzcn;
    private final String zzco;
    private final int zzcp;
    private final String zzcq;
    private final PlayerEntity zzcr;
    private final int zzcs;
    private final String zzct;
    private final long zzcu;
    private final long zzcv;
    private final float zzcw;
    private final String zzh;

    public AchievementEntity(Achievement achievement) {
        String achievementId = achievement.getAchievementId();
        this.zzck = achievementId;
        this.type = achievement.getType();
        this.name = achievement.getName();
        String description = achievement.getDescription();
        this.description = description;
        this.zzcl = achievement.getUnlockedImageUri();
        this.zzcm = achievement.getUnlockedImageUrl();
        this.zzcn = achievement.getRevealedImageUri();
        this.zzco = achievement.getRevealedImageUrl();
        if (achievement.zzad() != null) {
            this.zzcr = (PlayerEntity) achievement.zzad().freeze();
        } else {
            this.zzcr = null;
        }
        this.state = achievement.getState();
        this.zzcu = achievement.getLastUpdatedTimestamp();
        this.zzcv = achievement.getXpValue();
        this.zzcw = achievement.zzae();
        this.zzh = achievement.getApplicationId();
        if (achievement.getType() == 1) {
            this.zzcp = achievement.getTotalSteps();
            this.zzcq = achievement.getFormattedTotalSteps();
            this.zzcs = achievement.getCurrentSteps();
            this.zzct = achievement.getFormattedCurrentSteps();
        } else {
            this.zzcp = 0;
            this.zzcq = null;
            this.zzcs = 0;
            this.zzct = null;
        }
        Asserts.checkNotNull(achievementId);
        Asserts.checkNotNull(description);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public final Achievement freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    AchievementEntity(String str, int i, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i2, String str6, PlayerEntity playerEntity, int i3, int i4, String str7, long j, long j2, float f, String str8) {
        this.zzck = str;
        this.type = i;
        this.name = str2;
        this.description = str3;
        this.zzcl = uri;
        this.zzcm = str4;
        this.zzcn = uri2;
        this.zzco = str5;
        this.zzcp = i2;
        this.zzcq = str6;
        this.zzcr = playerEntity;
        this.state = i3;
        this.zzcs = i4;
        this.zzct = str7;
        this.zzcu = j;
        this.zzcv = j2;
        this.zzcw = f;
        this.zzh = str8;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final String getAchievementId() {
        return this.zzck;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final String getApplicationId() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getType() {
        return this.type;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final String getName() {
        return this.name;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final void getName(CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.name, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final String getDescription() {
        return this.description;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final void getDescription(CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.description, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final Uri getUnlockedImageUri() {
        return this.zzcl;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final String getUnlockedImageUrl() {
        return this.zzcm;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final Uri getRevealedImageUri() {
        return this.zzcn;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final String getRevealedImageUrl() {
        return this.zzco;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getTotalSteps() {
        Asserts.checkState(getType() == 1);
        return this.zzcp;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final String getFormattedTotalSteps() {
        Asserts.checkState(getType() == 1);
        return this.zzcq;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final void getFormattedTotalSteps(CharArrayBuffer charArrayBuffer) {
        Asserts.checkState(getType() == 1);
        DataUtils.copyStringToBuffer(this.zzcq, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final Player getPlayer() {
        return (Player) Preconditions.checkNotNull(this.zzcr);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final Player zzad() {
        return this.zzcr;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getState() {
        return this.state;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getCurrentSteps() {
        Asserts.checkState(getType() == 1);
        return this.zzcs;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final String getFormattedCurrentSteps() {
        Asserts.checkState(getType() == 1);
        return this.zzct;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final void getFormattedCurrentSteps(CharArrayBuffer charArrayBuffer) {
        Asserts.checkState(getType() == 1);
        DataUtils.copyStringToBuffer(this.zzct, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final long getLastUpdatedTimestamp() {
        return this.zzcu;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final long getXpValue() {
        return this.zzcv;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final float zzae() {
        return this.zzcw;
    }

    public final int hashCode() {
        return zza(this);
    }

    static int zza(Achievement achievement) {
        int currentSteps;
        int totalSteps;
        if (achievement.getType() == 1) {
            currentSteps = achievement.getCurrentSteps();
            totalSteps = achievement.getTotalSteps();
        } else {
            currentSteps = 0;
            totalSteps = 0;
        }
        return Objects.hashCode(achievement.getAchievementId(), achievement.getApplicationId(), achievement.getName(), Integer.valueOf(achievement.getType()), achievement.getDescription(), Long.valueOf(achievement.getXpValue()), Integer.valueOf(achievement.getState()), Long.valueOf(achievement.getLastUpdatedTimestamp()), achievement.zzad(), Integer.valueOf(currentSteps), Integer.valueOf(totalSteps));
    }

    public final boolean equals(Object obj) {
        return zza(this, obj);
    }

    static boolean zza(Achievement achievement, Object obj) {
        if (!(obj instanceof Achievement)) {
            return false;
        }
        if (achievement == obj) {
            return true;
        }
        Achievement achievement2 = (Achievement) obj;
        if (achievement2.getType() != achievement.getType()) {
            return false;
        }
        return (achievement.getType() != 1 || (achievement2.getCurrentSteps() == achievement.getCurrentSteps() && achievement2.getTotalSteps() == achievement.getTotalSteps())) && achievement2.getXpValue() == achievement.getXpValue() && achievement2.getState() == achievement.getState() && achievement2.getLastUpdatedTimestamp() == achievement.getLastUpdatedTimestamp() && Objects.equal(achievement2.getAchievementId(), achievement.getAchievementId()) && Objects.equal(achievement2.getApplicationId(), achievement.getApplicationId()) && Objects.equal(achievement2.getName(), achievement.getName()) && Objects.equal(achievement2.getDescription(), achievement.getDescription()) && Objects.equal(achievement2.zzad(), achievement.zzad()) && achievement2.zzae() == achievement.zzae();
    }

    public final String toString() {
        return zzb(this);
    }

    static String zzb(Achievement achievement) {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(achievement).add("Id", achievement.getAchievementId()).add("Game Id", achievement.getApplicationId()).add("Type", Integer.valueOf(achievement.getType())).add("Name", achievement.getName()).add("Description", achievement.getDescription()).add("Player", achievement.zzad()).add("State", Integer.valueOf(achievement.getState())).add("Rarity Percent", Float.valueOf(achievement.zzae()));
        if (achievement.getType() == 1) {
            toStringHelperAdd.add("CurrentSteps", Integer.valueOf(achievement.getCurrentSteps()));
            toStringHelperAdd.add("TotalSteps", Integer.valueOf(achievement.getTotalSteps()));
        }
        return toStringHelperAdd.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getAchievementId(), false);
        SafeParcelWriter.writeInt(parcel, 2, getType());
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeString(parcel, 4, getDescription(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, getUnlockedImageUri(), i, false);
        SafeParcelWriter.writeString(parcel, 6, getUnlockedImageUrl(), false);
        SafeParcelWriter.writeParcelable(parcel, 7, getRevealedImageUri(), i, false);
        SafeParcelWriter.writeString(parcel, 8, getRevealedImageUrl(), false);
        SafeParcelWriter.writeInt(parcel, 9, this.zzcp);
        SafeParcelWriter.writeString(parcel, 10, this.zzcq, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzcr, i, false);
        SafeParcelWriter.writeInt(parcel, 12, getState());
        SafeParcelWriter.writeInt(parcel, 13, this.zzcs);
        SafeParcelWriter.writeString(parcel, 14, this.zzct, false);
        SafeParcelWriter.writeLong(parcel, 15, getLastUpdatedTimestamp());
        SafeParcelWriter.writeLong(parcel, 16, getXpValue());
        SafeParcelWriter.writeFloat(parcel, 17, this.zzcw);
        SafeParcelWriter.writeString(parcel, 18, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
