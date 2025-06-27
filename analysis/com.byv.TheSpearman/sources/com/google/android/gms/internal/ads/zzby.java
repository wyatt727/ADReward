package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzby implements Parcelable {
    public static final Parcelable.Creator<zzby> CREATOR = new zzbw();
    public final long zza;
    private final zzbx[] zzb;

    public zzby(long j, zzbx... zzbxVarArr) {
        this.zza = j;
        this.zzb = zzbxVarArr;
    }

    zzby(Parcel parcel) {
        this.zzb = new zzbx[parcel.readInt()];
        int i = 0;
        while (true) {
            zzbx[] zzbxVarArr = this.zzb;
            if (i >= zzbxVarArr.length) {
                this.zza = parcel.readLong();
                return;
            } else {
                zzbxVarArr[i] = (zzbx) parcel.readParcelable(zzbx.class.getClassLoader());
                i++;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzby zzbyVar = (zzby) obj;
            if (Arrays.equals(this.zzb, zzbyVar.zzb) && this.zza == zzbyVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.zzb) * 31;
        long j = this.zza;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        long j = this.zza;
        String string = Arrays.toString(this.zzb);
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + string + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb.length);
        for (zzbx zzbxVar : this.zzb) {
            parcel.writeParcelable(zzbxVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzbx zzb(int i) {
        return this.zzb[i];
    }

    public final zzby zzc(zzbx... zzbxVarArr) {
        int length = zzbxVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.zza;
        zzbx[] zzbxVarArr2 = this.zzb;
        int i = zzfx.zza;
        int length2 = zzbxVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzbxVarArr2, length2 + length);
        System.arraycopy(zzbxVarArr, 0, objArrCopyOf, length2, length);
        return new zzby(j, (zzbx[]) objArrCopyOf);
    }

    public final zzby zzd(zzby zzbyVar) {
        return zzbyVar == null ? this : zzc(zzbyVar.zzb);
    }

    public zzby(List list) {
        this(-9223372036854775807L, (zzbx[]) list.toArray(new zzbx[0]));
    }
}
