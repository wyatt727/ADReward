package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class PlayerRef extends zzh implements Player {
    private final PlayerLevelInfo zzbg;
    private final com.google.android.gms.games.internal.player.zzb zzby;
    private final zzn zzbz;
    private final zzb zzca;
    private final com.google.android.gms.games.internal.player.zzd zzg;

    public PlayerRef(DataHolder dataHolder, int i) {
        this(dataHolder, i, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private PlayerRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i);
        com.google.android.gms.games.internal.player.zzd zzdVar = new com.google.android.gms.games.internal.player.zzd(null);
        this.zzg = zzdVar;
        this.zzby = new com.google.android.gms.games.internal.player.zzb(dataHolder, i, zzdVar);
        this.zzbz = new zzn(dataHolder, i, zzdVar);
        this.zzca = new zzb(dataHolder, i, zzdVar);
        if ((hasNull(zzdVar.zzii) || getLong(zzdVar.zzii) == -1) ? false : true) {
            int integer = getInteger(zzdVar.zzij);
            int integer2 = getInteger(zzdVar.zzim);
            PlayerLevel playerLevel = new PlayerLevel(integer, getLong(zzdVar.zzik), getLong(zzdVar.zzil));
            this.zzbg = new PlayerLevelInfo(getLong(zzdVar.zzii), getLong(zzdVar.zzio), playerLevel, integer != integer2 ? new PlayerLevel(integer2, getLong(zzdVar.zzil), getLong(zzdVar.zzin)) : playerLevel);
            return;
        }
        this.zzbg = null;
    }

    @Override // com.google.android.gms.games.Player
    public final String getPlayerId() {
        return getString(this.zzg.zzhz);
    }

    @Override // com.google.android.gms.games.Player
    public final String getDisplayName() {
        return getString(this.zzg.zzia);
    }

    @Override // com.google.android.gms.games.Player
    public final void getDisplayName(CharArrayBuffer charArrayBuffer) {
        copyToBuffer(this.zzg.zzia, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    public final String zzk() {
        return getString(this.zzg.zzbj);
    }

    @Override // com.google.android.gms.games.Player
    public final String getName() {
        return getString(this.zzg.name);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzl() {
        return getBoolean(this.zzg.zzix);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean hasIconImage() {
        return getIconImageUri() != null;
    }

    @Override // com.google.android.gms.games.Player
    public final Uri getIconImageUri() {
        return parseUri(this.zzg.zzib);
    }

    @Override // com.google.android.gms.games.Player
    public final String getIconImageUrl() {
        return getString(this.zzg.zzic);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean hasHiResImage() {
        return getHiResImageUri() != null;
    }

    @Override // com.google.android.gms.games.Player
    public final Uri getHiResImageUri() {
        return parseUri(this.zzg.zzid);
    }

    @Override // com.google.android.gms.games.Player
    public final String getHiResImageUrl() {
        return getString(this.zzg.zzie);
    }

    @Override // com.google.android.gms.games.Player
    public final long getRetrievedTimestamp() {
        return getLong(this.zzg.zzif);
    }

    @Override // com.google.android.gms.games.Player
    public final long getLastPlayedWithTimestamp() {
        if (!hasColumn(this.zzg.zzih) || hasNull(this.zzg.zzih)) {
            return -1L;
        }
        return getLong(this.zzg.zzih);
    }

    @Override // com.google.android.gms.games.Player
    public final CurrentPlayerInfo getCurrentPlayerInfo() {
        if (this.zzca.zzb()) {
            return this.zzca;
        }
        return null;
    }

    @Override // com.google.android.gms.games.Player
    public final int zzm() {
        return getInteger(this.zzg.zzig);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzn() {
        return getBoolean(this.zzg.zziq);
    }

    @Override // com.google.android.gms.games.Player
    public final String getTitle() {
        return getString(this.zzg.zzbe);
    }

    @Override // com.google.android.gms.games.Player
    public final void getTitle(CharArrayBuffer charArrayBuffer) {
        copyToBuffer(this.zzg.zzbe, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    public final PlayerLevelInfo getLevelInfo() {
        return this.zzbg;
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzo() {
        if (hasNull(this.zzg.zzir)) {
            return null;
        }
        return this.zzby;
    }

    @Override // com.google.android.gms.games.Player
    public final Uri getBannerImageLandscapeUri() {
        return parseUri(this.zzg.zziy);
    }

    @Override // com.google.android.gms.games.Player
    public final String getBannerImageLandscapeUrl() {
        return getString(this.zzg.zziz);
    }

    @Override // com.google.android.gms.games.Player
    public final Uri getBannerImagePortraitUri() {
        return parseUri(this.zzg.zzja);
    }

    @Override // com.google.android.gms.games.Player
    public final String getBannerImagePortraitUrl() {
        return getString(this.zzg.zzjb);
    }

    @Override // com.google.android.gms.games.Player
    public final long zzp() {
        String str = this.zzg.zzjf;
        if (!hasColumn(str) || hasNull(str)) {
            return -1L;
        }
        return getLong(str);
    }

    @Override // com.google.android.gms.games.Player
    public final PlayerRelationshipInfo getRelationshipInfo() {
        zzn zznVar = this.zzbz;
        if ((zznVar.getFriendStatus() == -1 && zznVar.zzq() == null && zznVar.zzr() == null) ? false : true) {
            return this.zzbz;
        }
        return null;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return PlayerEntity.zza(this);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(Object obj) {
        return PlayerEntity.zza(this, obj);
    }

    public final String toString() {
        return PlayerEntity.zzb(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ((PlayerEntity) ((Player) freeze())).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ Player freeze() {
        return new PlayerEntity(this);
    }
}
