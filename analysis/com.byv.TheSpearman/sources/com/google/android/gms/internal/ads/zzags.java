package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzags extends zzahd {
    public static final Parcelable.Creator<zzags> CREATOR = new zzagr();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzahd[] zzg;

    zzags(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = zzfx.zza;
        this.zza = string;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int i2 = parcel.readInt();
        this.zzg = new zzahd[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zzg[i3] = (zzahd) parcel.readParcelable(zzahd.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahd, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzags zzagsVar = (zzags) obj;
            if (this.zzb == zzagsVar.zzb && this.zzc == zzagsVar.zzc && this.zzd == zzagsVar.zzd && this.zze == zzagsVar.zze && zzfx.zzG(this.zza, zzagsVar.zza) && Arrays.equals(this.zzg, zzagsVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return ((((((((this.zzb + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzahd zzahdVar : this.zzg) {
            parcel.writeParcelable(zzahdVar, 0);
        }
    }

    public zzags(String str, int i, int i2, long j, long j2, zzahd[] zzahdVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzahdVarArr;
    }
}
