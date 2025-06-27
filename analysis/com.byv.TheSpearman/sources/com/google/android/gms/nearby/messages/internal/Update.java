package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.nearby.zzhi;
import com.google.android.gms.internal.nearby.zzhj;
import com.google.android.gms.nearby.messages.Message;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public class Update extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Update> CREATOR = new zzch();
    final int zza;
    final int zzb;
    public final Message zzc;
    public final zze zzd;
    public final zza zze;
    public final zzhj zzf;
    public final byte[] zzg;

    Update(int i, int i2, Message message, zze zzeVar, zza zzaVar, zzhj zzhjVar, byte[] bArr) {
        this.zza = i;
        boolean zZzb = zzb(i2, 2);
        bArr = true == zZzb ? null : bArr;
        zzhjVar = true == zZzb ? null : zzhjVar;
        zzaVar = true == zZzb ? null : zzaVar;
        zzeVar = true == zZzb ? null : zzeVar;
        this.zzb = true == zZzb ? 2 : i2;
        this.zzc = message;
        this.zzd = zzeVar;
        this.zze = zzaVar;
        this.zzf = zzhjVar;
        this.zzg = bArr;
    }

    public static boolean zzb(int i, int i2) {
        return (i & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Update)) {
            return false;
        }
        Update update = (Update) obj;
        return this.zzb == update.zzb && Objects.equal(this.zzc, update.zzc) && Objects.equal(this.zzd, update.zzd) && Objects.equal(this.zze, update.zze) && Objects.equal(this.zzf, update.zzf) && Arrays.equals(this.zzg, update.zzg);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    public final String toString() {
        ArraySet arraySet = new ArraySet();
        if (zzb(this.zzb, 1)) {
            arraySet.add("FOUND");
        }
        if (zzb(this.zzb, 2)) {
            arraySet.add("LOST");
        }
        if (zzb(this.zzb, 4)) {
            arraySet.add("DISTANCE");
        }
        if (zzb(this.zzb, 8)) {
            arraySet.add("BLE_SIGNAL");
        }
        if (zzb(this.zzb, 16)) {
            arraySet.add("DEVICE");
        }
        if (zzb(this.zzb, 32)) {
            arraySet.add("BLE_RECORD");
        }
        String strValueOf = String.valueOf(arraySet);
        String strValueOf2 = String.valueOf(this.zzc);
        String strValueOf3 = String.valueOf(this.zzd);
        String strValueOf4 = String.valueOf(this.zze);
        String strValueOf5 = String.valueOf(this.zzf);
        String strValueOf6 = String.valueOf(zzhi.zza(this.zzg));
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int length4 = String.valueOf(strValueOf4).length();
        StringBuilder sb = new StringBuilder(length + 68 + length2 + length3 + length4 + String.valueOf(strValueOf5).length() + String.valueOf(strValueOf6).length());
        sb.append("Update{types=");
        sb.append(strValueOf);
        sb.append(", message=");
        sb.append(strValueOf2);
        sb.append(", distance=");
        sb.append(strValueOf3);
        sb.append(", bleSignal=");
        sb.append(strValueOf4);
        sb.append(", device=");
        sb.append(strValueOf5);
        sb.append(", bleRecord=");
        sb.append(strValueOf6);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza(int i) {
        return zzb(this.zzb, i);
    }
}
