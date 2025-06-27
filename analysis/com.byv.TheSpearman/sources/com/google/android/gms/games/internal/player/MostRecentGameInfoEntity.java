package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class MostRecentGameInfoEntity extends com.google.android.gms.games.internal.zzb implements zza {
    public static final Parcelable.Creator<MostRecentGameInfoEntity> CREATOR = new zzc();
    private final String zzhj;
    private final String zzhk;
    private final long zzhl;
    private final Uri zzhm;
    private final Uri zzhn;
    private final Uri zzho;

    public MostRecentGameInfoEntity(zza zzaVar) {
        this.zzhj = zzaVar.zzbx();
        this.zzhk = zzaVar.zzby();
        this.zzhl = zzaVar.zzbz();
        this.zzhm = zzaVar.zzca();
        this.zzhn = zzaVar.zzcb();
        this.zzho = zzaVar.zzcc();
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ zza freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    MostRecentGameInfoEntity(String str, String str2, long j, Uri uri, Uri uri2, Uri uri3) {
        this.zzhj = str;
        this.zzhk = str2;
        this.zzhl = j;
        this.zzhm = uri;
        this.zzhn = uri2;
        this.zzho = uri3;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final String zzbx() {
        return this.zzhj;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final String zzby() {
        return this.zzhk;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final long zzbz() {
        return this.zzhl;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final Uri zzca() {
        return this.zzhm;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final Uri zzcb() {
        return this.zzhn;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final Uri zzcc() {
        return this.zzho;
    }

    public final int hashCode() {
        return zza(this);
    }

    static int zza(zza zzaVar) {
        return Objects.hashCode(zzaVar.zzbx(), zzaVar.zzby(), Long.valueOf(zzaVar.zzbz()), zzaVar.zzca(), zzaVar.zzcb(), zzaVar.zzcc());
    }

    public final boolean equals(Object obj) {
        return zza(this, obj);
    }

    static boolean zza(zza zzaVar, Object obj) {
        if (!(obj instanceof zza)) {
            return false;
        }
        if (zzaVar == obj) {
            return true;
        }
        zza zzaVar2 = (zza) obj;
        return Objects.equal(zzaVar2.zzbx(), zzaVar.zzbx()) && Objects.equal(zzaVar2.zzby(), zzaVar.zzby()) && Objects.equal(Long.valueOf(zzaVar2.zzbz()), Long.valueOf(zzaVar.zzbz())) && Objects.equal(zzaVar2.zzca(), zzaVar.zzca()) && Objects.equal(zzaVar2.zzcb(), zzaVar.zzcb()) && Objects.equal(zzaVar2.zzcc(), zzaVar.zzcc());
    }

    public final String toString() {
        return zzb(this);
    }

    static String zzb(zza zzaVar) {
        return Objects.toStringHelper(zzaVar).add("GameId", zzaVar.zzbx()).add("GameName", zzaVar.zzby()).add("ActivityTimestampMillis", Long.valueOf(zzaVar.zzbz())).add("GameIconUri", zzaVar.zzca()).add("GameHiResUri", zzaVar.zzcb()).add("GameFeaturedUri", zzaVar.zzcc()).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzhj, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzhk, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzhl);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzhm, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzhn, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzho, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
