package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzb extends DataBufferRef implements zza {
    private final zzd zzg;

    public zzb(DataHolder dataHolder, int i, zzd zzdVar) {
        super(dataHolder, i);
        this.zzg = zzdVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final String zzbx() {
        return getString(this.zzg.zzir);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final String zzby() {
        return getString(this.zzg.zzis);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final long zzbz() {
        return getLong(this.zzg.zzit);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final Uri zzca() {
        return parseUri(this.zzg.zziu);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final Uri zzcb() {
        return parseUri(this.zzg.zziv);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final Uri zzcc() {
        return parseUri(this.zzg.zziw);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return MostRecentGameInfoEntity.zza(this);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(Object obj) {
        return MostRecentGameInfoEntity.zza(this, obj);
    }

    public final String toString() {
        return MostRecentGameInfoEntity.zzb(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ((MostRecentGameInfoEntity) ((zza) freeze())).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ zza freeze() {
        return new MostRecentGameInfoEntity(this);
    }
}
