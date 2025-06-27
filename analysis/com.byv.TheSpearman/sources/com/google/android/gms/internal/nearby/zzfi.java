package com.google.android.gms.internal.nearby;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzfi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfi> CREATOR = new zzfj();
    private String zza;
    private String zzb;
    private String zzc;
    private BluetoothDevice zzd;
    private byte[] zze;

    private zzfi() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfi) {
            zzfi zzfiVar = (zzfi) obj;
            if (Objects.equal(this.zza, zzfiVar.zza) && Objects.equal(this.zzb, zzfiVar.zzb) && Objects.equal(this.zzc, zzfiVar.zzc) && Objects.equal(this.zzd, zzfiVar.zzd) && Arrays.equals(this.zze, zzfiVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, Integer.valueOf(Arrays.hashCode(this.zze)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final BluetoothDevice zzd() {
        return this.zzd;
    }

    public final byte[] zze() {
        return this.zze;
    }

    zzfi(String str, String str2, String str3, BluetoothDevice bluetoothDevice, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bluetoothDevice;
        this.zze = bArr;
    }
}
