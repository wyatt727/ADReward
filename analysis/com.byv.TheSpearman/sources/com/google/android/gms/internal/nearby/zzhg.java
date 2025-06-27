package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzhg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhg> CREATOR = new zzhh();
    private final int zza;
    private final ParcelUuid zzb;
    private final ParcelUuid zzc;
    private final ParcelUuid zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final int zzg;
    private final byte[] zzh;
    private final byte[] zzi;

    zzhg(int i, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        this.zza = i;
        this.zzb = parcelUuid;
        this.zzc = parcelUuid2;
        this.zzd = parcelUuid3;
        this.zze = bArr;
        this.zzf = bArr2;
        this.zzg = i2;
        this.zzh = bArr3;
        this.zzi = bArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzhg zzhgVar = (zzhg) obj;
            if (this.zzg == zzhgVar.zzg && Arrays.equals(this.zzh, zzhgVar.zzh) && Arrays.equals(this.zzi, zzhgVar.zzi) && Objects.equal(this.zzd, zzhgVar.zzd) && Arrays.equals(this.zze, zzhgVar.zze) && Arrays.equals(this.zzf, zzhgVar.zzf) && Objects.equal(this.zzb, zzhgVar.zzb) && Objects.equal(this.zzc, zzhgVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzg), Integer.valueOf(Arrays.hashCode(this.zzh)), Integer.valueOf(Arrays.hashCode(this.zzi)), this.zzd, Integer.valueOf(Arrays.hashCode(this.zze)), Integer.valueOf(Arrays.hashCode(this.zzf)), this.zzb, this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzd, i, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.zze, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 9, this.zzg);
        SafeParcelWriter.writeByteArray(parcel, 10, this.zzh, false);
        SafeParcelWriter.writeByteArray(parcel, 11, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
