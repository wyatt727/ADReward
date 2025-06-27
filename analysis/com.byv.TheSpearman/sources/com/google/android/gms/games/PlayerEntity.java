package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {
    public static final Parcelable.Creator<PlayerEntity> CREATOR = new zza();
    private final String name;
    private String zzba;
    private final long zzbb;
    private final int zzbc;
    private final long zzbd;
    private final String zzbe;
    private final MostRecentGameInfoEntity zzbf;
    private final PlayerLevelInfo zzbg;
    private final boolean zzbh;
    private final boolean zzbi;
    private final String zzbj;
    private final Uri zzbk;
    private final String zzbl;
    private final Uri zzbm;
    private final String zzbn;
    private long zzbo;
    private final zzm zzbp;
    private final com.google.android.gms.games.zza zzbq;
    private String zzi;
    private final Uri zzm;
    private final Uri zzn;
    private final String zzx;
    private final String zzy;

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    static final class zza extends zzi {
        zza() {
        }

        @Override // com.google.android.gms.games.zzi
        /* renamed from: zzc */
        public final PlayerEntity createFromParcel(Parcel parcel) {
            if (PlayerEntity.zzb(PlayerEntity.getUnparcelClientVersion()) || PlayerEntity.canUnparcelSafely(PlayerEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            return new PlayerEntity(string, string2, string3 == null ? null : Uri.parse(string3), string4 == null ? null : Uri.parse(string4), parcel.readLong(), -1, -1L, null, null, null, null, null, true, false, parcel.readString(), parcel.readString(), null, null, null, null, -1L, null, null);
        }

        @Override // com.google.android.gms.games.zzi, android.os.Parcelable.Creator
        public final /* synthetic */ PlayerEntity createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }

    public PlayerEntity(Player player) {
        this.zzba = player.getPlayerId();
        this.zzi = player.getDisplayName();
        this.zzm = player.getIconImageUri();
        this.zzx = player.getIconImageUrl();
        this.zzn = player.getHiResImageUri();
        this.zzy = player.getHiResImageUrl();
        long retrievedTimestamp = player.getRetrievedTimestamp();
        this.zzbb = retrievedTimestamp;
        this.zzbc = player.zzm();
        this.zzbd = player.getLastPlayedWithTimestamp();
        this.zzbe = player.getTitle();
        this.zzbh = player.zzn();
        com.google.android.gms.games.internal.player.zza zzaVarZzo = player.zzo();
        this.zzbf = zzaVarZzo == null ? null : new MostRecentGameInfoEntity(zzaVarZzo);
        this.zzbg = player.getLevelInfo();
        this.zzbi = player.zzl();
        this.zzbj = player.zzk();
        this.name = player.getName();
        this.zzbk = player.getBannerImageLandscapeUri();
        this.zzbl = player.getBannerImageLandscapeUrl();
        this.zzbm = player.getBannerImagePortraitUri();
        this.zzbn = player.getBannerImagePortraitUrl();
        this.zzbo = player.zzp();
        PlayerRelationshipInfo relationshipInfo = player.getRelationshipInfo();
        this.zzbp = relationshipInfo == null ? null : new zzm(relationshipInfo.freeze());
        CurrentPlayerInfo currentPlayerInfo = player.getCurrentPlayerInfo();
        this.zzbq = currentPlayerInfo != null ? (com.google.android.gms.games.zza) currentPlayerInfo.freeze() : null;
        Asserts.checkNotNull(this.zzba);
        Asserts.checkNotNull(this.zzi);
        Asserts.checkState(retrievedTimestamp > 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public final Player freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    PlayerEntity(String str, String str2, Uri uri, Uri uri2, long j, int i, long j2, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, PlayerLevelInfo playerLevelInfo, boolean z, boolean z2, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, long j3, zzm zzmVar, com.google.android.gms.games.zza zzaVar) {
        this.zzba = str;
        this.zzi = str2;
        this.zzm = uri;
        this.zzx = str3;
        this.zzn = uri2;
        this.zzy = str4;
        this.zzbb = j;
        this.zzbc = i;
        this.zzbd = j2;
        this.zzbe = str5;
        this.zzbh = z;
        this.zzbf = mostRecentGameInfoEntity;
        this.zzbg = playerLevelInfo;
        this.zzbi = z2;
        this.zzbj = str6;
        this.name = str7;
        this.zzbk = uri3;
        this.zzbl = str8;
        this.zzbm = uri4;
        this.zzbn = str9;
        this.zzbo = j3;
        this.zzbp = zzmVar;
        this.zzbq = zzaVar;
    }

    @Override // com.google.android.gms.games.Player
    public final String getPlayerId() {
        return this.zzba;
    }

    @Override // com.google.android.gms.games.Player
    public final String getDisplayName() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.Player
    public final void getDisplayName(CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.zzi, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    public final String zzk() {
        return this.zzbj;
    }

    @Override // com.google.android.gms.games.Player
    public final String getName() {
        return this.name;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzl() {
        return this.zzbi;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean hasIconImage() {
        return getIconImageUri() != null;
    }

    @Override // com.google.android.gms.games.Player
    public final Uri getIconImageUri() {
        return this.zzm;
    }

    @Override // com.google.android.gms.games.Player
    public final String getIconImageUrl() {
        return this.zzx;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean hasHiResImage() {
        return getHiResImageUri() != null;
    }

    @Override // com.google.android.gms.games.Player
    public final Uri getHiResImageUri() {
        return this.zzn;
    }

    @Override // com.google.android.gms.games.Player
    public final String getHiResImageUrl() {
        return this.zzy;
    }

    @Override // com.google.android.gms.games.Player
    public final long getRetrievedTimestamp() {
        return this.zzbb;
    }

    @Override // com.google.android.gms.games.Player
    public final long getLastPlayedWithTimestamp() {
        return this.zzbd;
    }

    @Override // com.google.android.gms.games.Player
    public final int zzm() {
        return this.zzbc;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzn() {
        return this.zzbh;
    }

    @Override // com.google.android.gms.games.Player
    public final String getTitle() {
        return this.zzbe;
    }

    @Override // com.google.android.gms.games.Player
    public final void getTitle(CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.zzbe, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    public final PlayerLevelInfo getLevelInfo() {
        return this.zzbg;
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzo() {
        return this.zzbf;
    }

    @Override // com.google.android.gms.games.Player
    public final Uri getBannerImageLandscapeUri() {
        return this.zzbk;
    }

    @Override // com.google.android.gms.games.Player
    public final String getBannerImageLandscapeUrl() {
        return this.zzbl;
    }

    @Override // com.google.android.gms.games.Player
    public final Uri getBannerImagePortraitUri() {
        return this.zzbm;
    }

    @Override // com.google.android.gms.games.Player
    public final String getBannerImagePortraitUrl() {
        return this.zzbn;
    }

    @Override // com.google.android.gms.games.Player
    public final long zzp() {
        return this.zzbo;
    }

    @Override // com.google.android.gms.games.Player
    public final PlayerRelationshipInfo getRelationshipInfo() {
        return this.zzbp;
    }

    @Override // com.google.android.gms.games.Player
    public final CurrentPlayerInfo getCurrentPlayerInfo() {
        return this.zzbq;
    }

    public final int hashCode() {
        return zza(this);
    }

    static int zza(Player player) {
        return Objects.hashCode(player.getPlayerId(), player.getDisplayName(), Boolean.valueOf(player.zzl()), player.getIconImageUri(), player.getHiResImageUri(), Long.valueOf(player.getRetrievedTimestamp()), player.getTitle(), player.getLevelInfo(), player.zzk(), player.getName(), player.getBannerImageLandscapeUri(), player.getBannerImagePortraitUri(), Long.valueOf(player.zzp()), player.getRelationshipInfo(), player.getCurrentPlayerInfo());
    }

    public final boolean equals(Object obj) {
        return zza(this, obj);
    }

    static boolean zza(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return Objects.equal(player2.getPlayerId(), player.getPlayerId()) && Objects.equal(player2.getDisplayName(), player.getDisplayName()) && Objects.equal(Boolean.valueOf(player2.zzl()), Boolean.valueOf(player.zzl())) && Objects.equal(player2.getIconImageUri(), player.getIconImageUri()) && Objects.equal(player2.getHiResImageUri(), player.getHiResImageUri()) && Objects.equal(Long.valueOf(player2.getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp())) && Objects.equal(player2.getTitle(), player.getTitle()) && Objects.equal(player2.getLevelInfo(), player.getLevelInfo()) && Objects.equal(player2.zzk(), player.zzk()) && Objects.equal(player2.getName(), player.getName()) && Objects.equal(player2.getBannerImageLandscapeUri(), player.getBannerImageLandscapeUri()) && Objects.equal(player2.getBannerImagePortraitUri(), player.getBannerImagePortraitUri()) && Objects.equal(Long.valueOf(player2.zzp()), Long.valueOf(player.zzp())) && Objects.equal(player2.getCurrentPlayerInfo(), player.getCurrentPlayerInfo()) && Objects.equal(player2.getRelationshipInfo(), player.getRelationshipInfo());
    }

    public final String toString() {
        return zzb(this);
    }

    static String zzb(Player player) {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(player).add("PlayerId", player.getPlayerId()).add("DisplayName", player.getDisplayName()).add("HasDebugAccess", Boolean.valueOf(player.zzl())).add("IconImageUri", player.getIconImageUri()).add("IconImageUrl", player.getIconImageUrl()).add("HiResImageUri", player.getHiResImageUri()).add("HiResImageUrl", player.getHiResImageUrl()).add("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).add("Title", player.getTitle()).add("LevelInfo", player.getLevelInfo()).add("GamerTag", player.zzk()).add("Name", player.getName()).add("BannerImageLandscapeUri", player.getBannerImageLandscapeUri()).add("BannerImageLandscapeUrl", player.getBannerImageLandscapeUrl()).add("BannerImagePortraitUri", player.getBannerImagePortraitUri()).add("BannerImagePortraitUrl", player.getBannerImagePortraitUrl()).add("CurrentPlayerInfo", player.getCurrentPlayerInfo()).add("totalUnlockedAchievement", Long.valueOf(player.zzp()));
        if (player.getRelationshipInfo() != null) {
            toStringHelperAdd.add("RelationshipInfo", player.getRelationshipInfo());
        }
        return toStringHelperAdd.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (!shouldDowngrade()) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeString(parcel, 1, getPlayerId(), false);
            SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
            SafeParcelWriter.writeParcelable(parcel, 3, getIconImageUri(), i, false);
            SafeParcelWriter.writeParcelable(parcel, 4, getHiResImageUri(), i, false);
            SafeParcelWriter.writeLong(parcel, 5, getRetrievedTimestamp());
            SafeParcelWriter.writeInt(parcel, 6, this.zzbc);
            SafeParcelWriter.writeLong(parcel, 7, getLastPlayedWithTimestamp());
            SafeParcelWriter.writeString(parcel, 8, getIconImageUrl(), false);
            SafeParcelWriter.writeString(parcel, 9, getHiResImageUrl(), false);
            SafeParcelWriter.writeString(parcel, 14, getTitle(), false);
            SafeParcelWriter.writeParcelable(parcel, 15, this.zzbf, i, false);
            SafeParcelWriter.writeParcelable(parcel, 16, getLevelInfo(), i, false);
            SafeParcelWriter.writeBoolean(parcel, 18, this.zzbh);
            SafeParcelWriter.writeBoolean(parcel, 19, this.zzbi);
            SafeParcelWriter.writeString(parcel, 20, this.zzbj, false);
            SafeParcelWriter.writeString(parcel, 21, this.name, false);
            SafeParcelWriter.writeParcelable(parcel, 22, getBannerImageLandscapeUri(), i, false);
            SafeParcelWriter.writeString(parcel, 23, getBannerImageLandscapeUrl(), false);
            SafeParcelWriter.writeParcelable(parcel, 24, getBannerImagePortraitUri(), i, false);
            SafeParcelWriter.writeString(parcel, 25, getBannerImagePortraitUrl(), false);
            SafeParcelWriter.writeLong(parcel, 29, this.zzbo);
            SafeParcelWriter.writeParcelable(parcel, 33, getRelationshipInfo(), i, false);
            SafeParcelWriter.writeParcelable(parcel, 35, getCurrentPlayerInfo(), i, false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
            return;
        }
        parcel.writeString(this.zzba);
        parcel.writeString(this.zzi);
        Uri uri = this.zzm;
        parcel.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.zzn;
        parcel.writeString(uri2 != null ? uri2.toString() : null);
        parcel.writeLong(this.zzbb);
    }
}
