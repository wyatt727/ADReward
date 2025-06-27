package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.json.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgh implements zzbx {
    public static final Parcelable.Creator<zzgh> CREATOR = new zzgf();
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzgh(long j, long j2, long j3) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
    }

    /* synthetic */ zzgh(Parcel parcel, zzgg zzggVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgh)) {
            return false;
        }
        zzgh zzghVar = (zzgh) obj;
        return this.zza == zzghVar.zza && this.zzb == zzghVar.zzb && this.zzc == zzghVar.zzc;
    }

    public final int hashCode() {
        long j = this.zzc;
        long j2 = this.zza;
        int i = ((int) (j2 ^ (j2 >>> 32))) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        long j3 = j ^ (j >>> 32);
        long j4 = this.zzb;
        return (((i * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) j3);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
