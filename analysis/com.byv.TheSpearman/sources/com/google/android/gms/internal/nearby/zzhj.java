package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzhj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhj> CREATOR = new zzhk();
    public static final zzhj zza = new zzhj(1, "", null);
    final int zzb;
    private final String zzc;
    private final String zzd;

    zzhj(int i, String str, String str2) {
        this.zzb = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
        this.zzc = str == null ? "" : str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhj)) {
            return false;
        }
        zzhj zzhjVar = (zzhj) obj;
        return Objects.equal(this.zzc, zzhjVar.zzc) && Objects.equal(this.zzd, zzhjVar.zzd);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzc, this.zzd);
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zzd;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(str2).length());
        sb.append("NearbyDevice{handle=");
        sb.append(str);
        sb.append(", bluetoothAddress=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
