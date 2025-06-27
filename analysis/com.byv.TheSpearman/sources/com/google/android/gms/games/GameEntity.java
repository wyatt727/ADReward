package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {
    public static final Parcelable.Creator<GameEntity> CREATOR = new zza();
    private final String description;
    private final boolean zzaa;
    private final boolean zzab;
    private final boolean zzac;
    private final String zzad;
    private final boolean zzae;
    private final String zzh;
    private final String zzi;
    private final String zzj;
    private final String zzk;
    private final String zzl;
    private final Uri zzm;
    private final Uri zzn;
    private final Uri zzo;
    private final boolean zzp;
    private final boolean zzq;
    private final String zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final String zzx;
    private final String zzy;
    private final String zzz;

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    static final class zza extends zzd {
        zza() {
        }

        @Override // com.google.android.gms.games.zzd
        /* renamed from: zzb */
        public final GameEntity createFromParcel(Parcel parcel) {
            if (GameEntity.zzb(GameEntity.getUnparcelClientVersion()) || GameEntity.canUnparcelSafely(GameEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Uri uri = string7 == null ? null : Uri.parse(string7);
            String string8 = parcel.readString();
            Uri uri2 = string8 == null ? null : Uri.parse(string8);
            String string9 = parcel.readString();
            return new GameEntity(string, string2, string3, string4, string5, string6, uri, uri2, string9 == null ? null : Uri.parse(string9), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false);
        }

        @Override // com.google.android.gms.games.zzd, android.os.Parcelable.Creator
        public final /* synthetic */ GameEntity createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }

    public GameEntity(Game game) {
        this.zzh = game.getApplicationId();
        this.zzj = game.getPrimaryCategory();
        this.zzk = game.getSecondaryCategory();
        this.description = game.getDescription();
        this.zzl = game.getDeveloperName();
        this.zzi = game.getDisplayName();
        this.zzm = game.getIconImageUri();
        this.zzx = game.getIconImageUrl();
        this.zzn = game.getHiResImageUri();
        this.zzy = game.getHiResImageUrl();
        this.zzo = game.getFeaturedImageUri();
        this.zzz = game.getFeaturedImageUrl();
        this.zzp = game.zzc();
        this.zzq = game.zze();
        this.zzr = game.zzf();
        this.zzs = 1;
        this.zzt = game.getAchievementTotalCount();
        this.zzu = game.getLeaderboardCount();
        this.zzv = game.zzg();
        this.zzw = game.zzh();
        this.zzaa = game.isMuted();
        this.zzab = game.zzd();
        this.zzac = game.areSnapshotsEnabled();
        this.zzad = game.getThemeColor();
        this.zzae = game.hasGamepadSupport();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public final Game freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    GameEntity(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i, int i2, int i3, boolean z3, boolean z4, String str8, String str9, String str10, boolean z5, boolean z6, boolean z7, String str11, boolean z8) {
        this.zzh = str;
        this.zzi = str2;
        this.zzj = str3;
        this.zzk = str4;
        this.description = str5;
        this.zzl = str6;
        this.zzm = uri;
        this.zzx = str8;
        this.zzn = uri2;
        this.zzy = str9;
        this.zzo = uri3;
        this.zzz = str10;
        this.zzp = z;
        this.zzq = z2;
        this.zzr = str7;
        this.zzs = i;
        this.zzt = i2;
        this.zzu = i3;
        this.zzv = z3;
        this.zzw = z4;
        this.zzaa = z5;
        this.zzab = z6;
        this.zzac = z7;
        this.zzad = str11;
        this.zzae = z8;
    }

    @Override // com.google.android.gms.games.Game
    public final String getApplicationId() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.Game
    public final String getDisplayName() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.Game
    public final void getDisplayName(CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.zzi, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Game
    public final String getPrimaryCategory() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.Game
    public final String getSecondaryCategory() {
        return this.zzk;
    }

    @Override // com.google.android.gms.games.Game
    public final String getDescription() {
        return this.description;
    }

    @Override // com.google.android.gms.games.Game
    public final void getDescription(CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.description, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Game
    public final String getDeveloperName() {
        return this.zzl;
    }

    @Override // com.google.android.gms.games.Game
    public final void getDeveloperName(CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.zzl, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Game
    public final Uri getIconImageUri() {
        return this.zzm;
    }

    @Override // com.google.android.gms.games.Game
    public final String getIconImageUrl() {
        return this.zzx;
    }

    @Override // com.google.android.gms.games.Game
    public final Uri getHiResImageUri() {
        return this.zzn;
    }

    @Override // com.google.android.gms.games.Game
    public final String getHiResImageUrl() {
        return this.zzy;
    }

    @Override // com.google.android.gms.games.Game
    public final Uri getFeaturedImageUri() {
        return this.zzo;
    }

    @Override // com.google.android.gms.games.Game
    public final String getFeaturedImageUrl() {
        return this.zzz;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean isMuted() {
        return this.zzaa;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzd() {
        return this.zzab;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzc() {
        return this.zzp;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.games.Game
    public final String zzf() {
        return this.zzr;
    }

    @Override // com.google.android.gms.games.Game
    public final int getAchievementTotalCount() {
        return this.zzt;
    }

    @Override // com.google.android.gms.games.Game
    public final int getLeaderboardCount() {
        return this.zzu;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzg() {
        return this.zzv;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzh() {
        return this.zzw;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean areSnapshotsEnabled() {
        return this.zzac;
    }

    @Override // com.google.android.gms.games.Game
    public final String getThemeColor() {
        return this.zzad;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean hasGamepadSupport() {
        return this.zzae;
    }

    public final int hashCode() {
        return zza(this);
    }

    static int zza(Game game) {
        return Objects.hashCode(game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), Boolean.valueOf(game.zzc()), Boolean.valueOf(game.zze()), game.zzf(), Integer.valueOf(game.getAchievementTotalCount()), Integer.valueOf(game.getLeaderboardCount()), Boolean.valueOf(game.zzg()), Boolean.valueOf(game.zzh()), Boolean.valueOf(game.isMuted()), Boolean.valueOf(game.zzd()), Boolean.valueOf(game.areSnapshotsEnabled()), game.getThemeColor(), Boolean.valueOf(game.hasGamepadSupport()));
    }

    public final boolean equals(Object obj) {
        return zza(this, obj);
    }

    static boolean zza(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        return Objects.equal(game2.getApplicationId(), game.getApplicationId()) && Objects.equal(game2.getDisplayName(), game.getDisplayName()) && Objects.equal(game2.getPrimaryCategory(), game.getPrimaryCategory()) && Objects.equal(game2.getSecondaryCategory(), game.getSecondaryCategory()) && Objects.equal(game2.getDescription(), game.getDescription()) && Objects.equal(game2.getDeveloperName(), game.getDeveloperName()) && Objects.equal(game2.getIconImageUri(), game.getIconImageUri()) && Objects.equal(game2.getHiResImageUri(), game.getHiResImageUri()) && Objects.equal(game2.getFeaturedImageUri(), game.getFeaturedImageUri()) && Objects.equal(Boolean.valueOf(game2.zzc()), Boolean.valueOf(game.zzc())) && Objects.equal(Boolean.valueOf(game2.zze()), Boolean.valueOf(game.zze())) && Objects.equal(game2.zzf(), game.zzf()) && Objects.equal(Integer.valueOf(game2.getAchievementTotalCount()), Integer.valueOf(game.getAchievementTotalCount())) && Objects.equal(Integer.valueOf(game2.getLeaderboardCount()), Integer.valueOf(game.getLeaderboardCount())) && Objects.equal(Boolean.valueOf(game2.zzg()), Boolean.valueOf(game.zzg())) && Objects.equal(Boolean.valueOf(game2.zzh()), Boolean.valueOf(game.zzh())) && Objects.equal(Boolean.valueOf(game2.isMuted()), Boolean.valueOf(game.isMuted())) && Objects.equal(Boolean.valueOf(game2.zzd()), Boolean.valueOf(game.zzd())) && Objects.equal(Boolean.valueOf(game2.areSnapshotsEnabled()), Boolean.valueOf(game.areSnapshotsEnabled())) && Objects.equal(game2.getThemeColor(), game.getThemeColor()) && Objects.equal(Boolean.valueOf(game2.hasGamepadSupport()), Boolean.valueOf(game.hasGamepadSupport()));
    }

    public final String toString() {
        return zzb(this);
    }

    static String zzb(Game game) {
        return Objects.toStringHelper(game).add("ApplicationId", game.getApplicationId()).add("DisplayName", game.getDisplayName()).add("PrimaryCategory", game.getPrimaryCategory()).add("SecondaryCategory", game.getSecondaryCategory()).add("Description", game.getDescription()).add("DeveloperName", game.getDeveloperName()).add("IconImageUri", game.getIconImageUri()).add("IconImageUrl", game.getIconImageUrl()).add("HiResImageUri", game.getHiResImageUri()).add("HiResImageUrl", game.getHiResImageUrl()).add("FeaturedImageUri", game.getFeaturedImageUri()).add("FeaturedImageUrl", game.getFeaturedImageUrl()).add("PlayEnabledGame", Boolean.valueOf(game.zzc())).add("InstanceInstalled", Boolean.valueOf(game.zze())).add("InstancePackageName", game.zzf()).add("AchievementTotalCount", Integer.valueOf(game.getAchievementTotalCount())).add("LeaderboardCount", Integer.valueOf(game.getLeaderboardCount())).add("AreSnapshotsEnabled", Boolean.valueOf(game.areSnapshotsEnabled())).add("ThemeColor", game.getThemeColor()).add("HasGamepadSupport", Boolean.valueOf(game.hasGamepadSupport())).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (!shouldDowngrade()) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeString(parcel, 1, getApplicationId(), false);
            SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
            SafeParcelWriter.writeString(parcel, 3, getPrimaryCategory(), false);
            SafeParcelWriter.writeString(parcel, 4, getSecondaryCategory(), false);
            SafeParcelWriter.writeString(parcel, 5, getDescription(), false);
            SafeParcelWriter.writeString(parcel, 6, getDeveloperName(), false);
            SafeParcelWriter.writeParcelable(parcel, 7, getIconImageUri(), i, false);
            SafeParcelWriter.writeParcelable(parcel, 8, getHiResImageUri(), i, false);
            SafeParcelWriter.writeParcelable(parcel, 9, getFeaturedImageUri(), i, false);
            SafeParcelWriter.writeBoolean(parcel, 10, this.zzp);
            SafeParcelWriter.writeBoolean(parcel, 11, this.zzq);
            SafeParcelWriter.writeString(parcel, 12, this.zzr, false);
            SafeParcelWriter.writeInt(parcel, 13, this.zzs);
            SafeParcelWriter.writeInt(parcel, 14, getAchievementTotalCount());
            SafeParcelWriter.writeInt(parcel, 15, getLeaderboardCount());
            SafeParcelWriter.writeBoolean(parcel, 16, this.zzv);
            SafeParcelWriter.writeBoolean(parcel, 17, this.zzw);
            SafeParcelWriter.writeString(parcel, 18, getIconImageUrl(), false);
            SafeParcelWriter.writeString(parcel, 19, getHiResImageUrl(), false);
            SafeParcelWriter.writeString(parcel, 20, getFeaturedImageUrl(), false);
            SafeParcelWriter.writeBoolean(parcel, 21, this.zzaa);
            SafeParcelWriter.writeBoolean(parcel, 22, this.zzab);
            SafeParcelWriter.writeBoolean(parcel, 23, areSnapshotsEnabled());
            SafeParcelWriter.writeString(parcel, 24, getThemeColor(), false);
            SafeParcelWriter.writeBoolean(parcel, 25, hasGamepadSupport());
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
            return;
        }
        parcel.writeString(this.zzh);
        parcel.writeString(this.zzi);
        parcel.writeString(this.zzj);
        parcel.writeString(this.zzk);
        parcel.writeString(this.description);
        parcel.writeString(this.zzl);
        Uri uri = this.zzm;
        parcel.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.zzn;
        parcel.writeString(uri2 == null ? null : uri2.toString());
        Uri uri3 = this.zzo;
        parcel.writeString(uri3 != null ? uri3.toString() : null);
        parcel.writeInt(this.zzp ? 1 : 0);
        parcel.writeInt(this.zzq ? 1 : 0);
        parcel.writeString(this.zzr);
        parcel.writeInt(this.zzs);
        parcel.writeInt(this.zzt);
        parcel.writeInt(this.zzu);
    }
}
