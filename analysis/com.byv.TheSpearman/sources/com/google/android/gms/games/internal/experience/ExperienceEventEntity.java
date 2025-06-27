package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.zzb;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class ExperienceEventEntity extends zzb implements ExperienceEvent {
    public static final Parcelable.Creator<ExperienceEventEntity> CREATOR = new zza();
    private final int type;
    private final String zzhb;
    private final GameEntity zzhc;
    private final String zzhd;
    private final String zzhe;
    private final long zzhf;
    private final long zzhg;
    private final long zzhh;
    private final int zzhi;
    private final Uri zzm;
    private final String zzx;

    ExperienceEventEntity(String str, GameEntity gameEntity, String str2, String str3, String str4, Uri uri, long j, long j2, long j3, int i, int i2) {
        this.zzhb = str;
        this.zzhc = gameEntity;
        this.zzhd = str2;
        this.zzhe = str3;
        this.zzx = str4;
        this.zzm = uri;
        this.zzhf = j;
        this.zzhg = j2;
        this.zzhh = j3;
        this.type = i;
        this.zzhi = i2;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ ExperienceEvent freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String zzbq() {
        return this.zzhb;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final Game getGame() {
        return this.zzhc;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String zzbr() {
        return this.zzhd;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String zzbs() {
        return this.zzhe;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String getIconImageUrl() {
        return this.zzx;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final Uri getIconImageUri() {
        return this.zzm;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzbt() {
        return this.zzhf;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzbu() {
        return this.zzhg;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzbv() {
        return this.zzhh;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int getType() {
        return this.type;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int zzbw() {
        return this.zzhi;
    }

    public final int hashCode() {
        return Objects.hashCode(zzbq(), getGame(), zzbr(), zzbs(), getIconImageUrl(), getIconImageUri(), Long.valueOf(zzbt()), Long.valueOf(zzbu()), Long.valueOf(zzbv()), Integer.valueOf(getType()), Integer.valueOf(zzbw()));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExperienceEvent)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ExperienceEvent experienceEvent = (ExperienceEvent) obj;
        return Objects.equal(experienceEvent.zzbq(), zzbq()) && Objects.equal(experienceEvent.getGame(), getGame()) && Objects.equal(experienceEvent.zzbr(), zzbr()) && Objects.equal(experienceEvent.zzbs(), zzbs()) && Objects.equal(experienceEvent.getIconImageUrl(), getIconImageUrl()) && Objects.equal(experienceEvent.getIconImageUri(), getIconImageUri()) && Objects.equal(Long.valueOf(experienceEvent.zzbt()), Long.valueOf(zzbt())) && Objects.equal(Long.valueOf(experienceEvent.zzbu()), Long.valueOf(zzbu())) && Objects.equal(Long.valueOf(experienceEvent.zzbv()), Long.valueOf(zzbv())) && Objects.equal(Integer.valueOf(experienceEvent.getType()), Integer.valueOf(getType())) && Objects.equal(Integer.valueOf(experienceEvent.zzbw()), Integer.valueOf(zzbw()));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("ExperienceId", zzbq()).add("Game", getGame()).add("DisplayTitle", zzbr()).add("DisplayDescription", zzbs()).add("IconImageUrl", getIconImageUrl()).add("IconImageUri", getIconImageUri()).add("CreatedTimestamp", Long.valueOf(zzbt())).add("XpEarned", Long.valueOf(zzbu())).add("CurrentXp", Long.valueOf(zzbv())).add("Type", Integer.valueOf(getType())).add("NewLevel", Integer.valueOf(zzbw())).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzhb, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzhc, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzhd, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzhe, false);
        SafeParcelWriter.writeString(parcel, 5, getIconImageUrl(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzm, i, false);
        SafeParcelWriter.writeLong(parcel, 7, this.zzhf);
        SafeParcelWriter.writeLong(parcel, 8, this.zzhg);
        SafeParcelWriter.writeLong(parcel, 9, this.zzhh);
        SafeParcelWriter.writeInt(parcel, 10, this.type);
        SafeParcelWriter.writeInt(parcel, 11, this.zzhi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
