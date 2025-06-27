package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzfg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfg> CREATOR = new zzfh();
    private String zza;
    private int zzb;
    private com.google.android.gms.nearby.connection.zzt zzc;

    private zzfg() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfg) {
            zzfg zzfgVar = (zzfg) obj;
            if (Objects.equal(this.zza, zzfgVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzfgVar.zzb)) && Objects.equal(this.zzc, zzfgVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.nearby.connection.zzt zzc() {
        return this.zzc;
    }

    zzfg(String str, int i, com.google.android.gms.nearby.connection.zzt zztVar) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zztVar;
    }
}
