package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();
    private int zza;
    private int zzb;
    private int zzc;
    private boolean zzd;

    private zzt() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzt) {
            zzt zztVar = (zzt) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zztVar.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zztVar.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zztVar.zzc)) && Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(zztVar.zzd))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Boolean.valueOf(this.zzd));
    }

    public final String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        boolean z = this.zzd;
        StringBuilder sb = new StringBuilder(Opcodes.I2C);
        sb.append("UwbRangingData{rawDistance=");
        sb.append(i);
        sb.append(", rawAngleOfArrivalAzimuth=");
        sb.append(i2);
        sb.append(", rawAngleOfArrivalPolar=");
        sb.append(i3);
        sb.append(", isValidAngleOfArrivalData=");
        sb.append(z);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzt(int i, int i2, int i3, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = z;
    }
}
