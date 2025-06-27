package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzagi implements zzbx {
    public static final Parcelable.Creator<zzagi> CREATOR = new zzagh();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzagi(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    zzagi(Parcel parcel) {
        this.zza = parcel.readInt();
        String string = parcel.readString();
        int i = zzfx.zza;
        this.zzb = string;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }

    public static zzagi zzb(zzfo zzfoVar) {
        int iZzg = zzfoVar.zzg();
        String strZze = zzcb.zze(zzfoVar.zzA(zzfoVar.zzg(), zzfwd.zza));
        String strZzA = zzfoVar.zzA(zzfoVar.zzg(), zzfwd.zzc);
        int iZzg2 = zzfoVar.zzg();
        int iZzg3 = zzfoVar.zzg();
        int iZzg4 = zzfoVar.zzg();
        int iZzg5 = zzfoVar.zzg();
        int iZzg6 = zzfoVar.zzg();
        byte[] bArr = new byte[iZzg6];
        zzfoVar.zzG(bArr, 0, iZzg6);
        return new zzagi(iZzg, strZze, strZzA, iZzg2, iZzg3, iZzg4, iZzg5, bArr);
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
            zzagi zzagiVar = (zzagi) obj;
            if (this.zza == zzagiVar.zza && this.zzb.equals(zzagiVar.zzb) && this.zzc.equals(zzagiVar.zzc) && this.zzd == zzagiVar.zzd && this.zze == zzagiVar.zze && this.zzf == zzagiVar.zzf && this.zzg == zzagiVar.zzg && Arrays.equals(this.zzh, zzagiVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final void zza(zzbt zzbtVar) {
        zzbtVar.zza(this.zzh, this.zza);
    }
}
