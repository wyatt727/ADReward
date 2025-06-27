package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class StockProfileImageEntity extends com.google.android.gms.games.internal.zzb implements StockProfileImage {
    public static final Parcelable.Creator<StockProfileImageEntity> CREATOR = new zzf();
    private final String zzjl;
    private final Uri zzjm;

    public StockProfileImageEntity(String str, Uri uri) {
        this.zzjl = str;
        this.zzjm = uri;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ StockProfileImage freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    public final String getImageUrl() {
        return this.zzjl;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    public final Uri zzcd() {
        return this.zzjm;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzjl, this.zzjm);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StockProfileImage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        StockProfileImage stockProfileImage = (StockProfileImage) obj;
        return Objects.equal(this.zzjl, stockProfileImage.getImageUrl()) && Objects.equal(this.zzjm, stockProfileImage.zzcd());
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("ImageId", this.zzjl).add("ImageUri", this.zzjm).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getImageUrl(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzjm, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
