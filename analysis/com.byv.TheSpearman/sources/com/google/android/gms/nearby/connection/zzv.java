package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzw();
    private byte[] zza;
    private int zzb;
    private int zzc;

    private zzv() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzv) {
            zzv zzvVar = (zzv) obj;
            if (Arrays.equals(this.zza, zzvVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzvVar.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zzvVar.zzc))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        String string = Arrays.toString(this.zza);
        int i = this.zzb;
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 71);
        sb.append("UwbSenderInfo{address=");
        sb.append(string);
        sb.append(", channel=");
        sb.append(i);
        sb.append(", preambleIndex=");
        sb.append(i2);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzv(byte[] bArr, int i, int i2) {
        this.zza = bArr;
        this.zzb = i;
        this.zzc = i2;
    }
}
