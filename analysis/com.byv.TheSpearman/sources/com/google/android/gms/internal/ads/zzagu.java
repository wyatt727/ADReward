package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzagu extends zzahd {
    public static final Parcelable.Creator<zzagu> CREATOR = new zzagt();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzahd[] zze;

    zzagu(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = zzfx.zza;
        this.zza = string;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.zze = new zzahd[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zze[i3] = (zzahd) parcel.readParcelable(zzahd.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagu zzaguVar = (zzagu) obj;
            if (this.zzb == zzaguVar.zzb && this.zzc == zzaguVar.zzc && zzfx.zzG(this.zza, zzaguVar.zza) && Arrays.equals(this.zzd, zzaguVar.zzd) && Arrays.equals(this.zze, zzaguVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((((this.zzb ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.zzc ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzahd zzahdVar : this.zze) {
            parcel.writeParcelable(zzahdVar, 0);
        }
    }

    public zzagu(String str, boolean z, boolean z2, String[] strArr, zzahd[] zzahdVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzahdVarArr;
    }
}
