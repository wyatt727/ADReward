package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzn extends zzh implements PlayerRelationshipInfo {
    private final com.google.android.gms.games.internal.player.zzd zzg;

    public zzn(DataHolder dataHolder, int i, com.google.android.gms.games.internal.player.zzd zzdVar) {
        super(dataHolder, i);
        this.zzg = zzdVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final int getFriendStatus() {
        return zza(this.zzg.zzjg, -1);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzq() {
        return zza(this.zzg.zzjh, (String) null);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzr() {
        return zza(this.zzg.zzji, (String) null);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzs() {
        return zza(this.zzg.zzce, (String) null);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return zzm.zza(this);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(Object obj) {
        return zzm.zza(this, obj);
    }

    public final String toString() {
        return zzm.zzb(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new zzm(this).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ PlayerRelationshipInfo freeze() {
        return new zzm(this);
    }
}
