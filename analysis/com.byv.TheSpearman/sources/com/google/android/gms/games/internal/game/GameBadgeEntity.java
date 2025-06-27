package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements com.google.android.gms.games.internal.game.zza {
    public static final Parcelable.Creator<GameBadgeEntity> CREATOR = new zza();
    private String description;
    private int type;
    private String zzbe;
    private Uri zzm;

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    static final class zza extends zzb {
        zza() {
        }

        @Override // com.google.android.gms.games.internal.game.zzb
        /* renamed from: zzd */
        public final GameBadgeEntity createFromParcel(Parcel parcel) {
            if (GameBadgeEntity.zzb(GameBadgeEntity.getUnparcelClientVersion()) || GameBadgeEntity.canUnparcelSafely(GameBadgeEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            return new GameBadgeEntity(i, string, string2, string3 == null ? null : Uri.parse(string3));
        }

        @Override // com.google.android.gms.games.internal.game.zzb, android.os.Parcelable.Creator
        public final /* synthetic */ GameBadgeEntity createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }

    GameBadgeEntity(int i, String str, String str2, Uri uri) {
        this.type = i;
        this.zzbe = str;
        this.description = str2;
        this.zzm = uri;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.internal.game.zza freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override // com.google.android.gms.games.internal.game.zza
    public final int getType() {
        return this.type;
    }

    @Override // com.google.android.gms.games.internal.game.zza
    public final String getTitle() {
        return this.zzbe;
    }

    @Override // com.google.android.gms.games.internal.game.zza
    public final String getDescription() {
        return this.description;
    }

    @Override // com.google.android.gms.games.internal.game.zza
    public final Uri getIconImageUri() {
        return this.zzm;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(getType()), getTitle(), getDescription(), getIconImageUri());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof com.google.android.gms.games.internal.game.zza)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        com.google.android.gms.games.internal.game.zza zzaVar = (com.google.android.gms.games.internal.game.zza) obj;
        return Objects.equal(Integer.valueOf(zzaVar.getType()), getTitle()) && Objects.equal(zzaVar.getDescription(), getIconImageUri());
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("Type", Integer.valueOf(getType())).add("Title", getTitle()).add("Description", getDescription()).add("IconImageUri", getIconImageUri()).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (!shouldDowngrade()) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.type);
            SafeParcelWriter.writeString(parcel, 2, this.zzbe, false);
            SafeParcelWriter.writeString(parcel, 3, this.description, false);
            SafeParcelWriter.writeParcelable(parcel, 4, this.zzm, i, false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
            return;
        }
        parcel.writeInt(this.type);
        parcel.writeString(this.zzbe);
        parcel.writeString(this.description);
        Uri uri = this.zzm;
        parcel.writeString(uri == null ? null : uri.toString());
    }
}
