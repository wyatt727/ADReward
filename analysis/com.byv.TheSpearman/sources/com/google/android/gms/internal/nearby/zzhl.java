package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzhl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhl> CREATOR = new zzhm();
    final int zza;
    final int zzb;
    final byte[] zzc;
    final boolean zzd;

    zzhl(int i, int i2, byte[] bArr, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = bArr;
        this.zzd = z;
    }

    public static zzhl zza(String str, String str2) {
        String strValueOf = String.valueOf(str);
        if (str2 == null) {
            str2 = "";
        }
        return new zzhl(2, new com.google.android.gms.nearby.messages.internal.zzg(com.google.android.gms.nearby.messages.internal.zzg.zzb(str2.length() != 0 ? strValueOf.concat(str2) : new String(strValueOf))).zzc());
    }

    public static zzhl zzb(UUID uuid, Short sh, Short sh2) {
        return new zzhl(3, new com.google.android.gms.nearby.messages.internal.zzl(uuid, sh, sh2).zzc());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzhl(int i, byte[] bArr) {
        this(1, i, bArr, false);
    }
}
