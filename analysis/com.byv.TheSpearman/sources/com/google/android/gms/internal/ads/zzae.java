package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzae implements Comparator<zzad>, Parcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzab();
    public final String zza;
    public final int zzb;
    private final zzad[] zzc;
    private int zzd;

    zzae(Parcel parcel) {
        this.zza = parcel.readString();
        zzad[] zzadVarArr = (zzad[]) parcel.createTypedArray(zzad.CREATOR);
        int i = zzfx.zza;
        this.zzc = zzadVarArr;
        this.zzb = zzadVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzad zzadVar, zzad zzadVar2) {
        zzad zzadVar3 = zzadVar;
        zzad zzadVar4 = zzadVar2;
        return zzo.zza.equals(zzadVar3.zza) ? !zzo.zza.equals(zzadVar4.zza) ? 1 : 0 : zzadVar3.zza.compareTo(zzadVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzae zzaeVar = (zzae) obj;
            if (zzfx.zzG(this.zza, zzaeVar.zza) && Arrays.equals(this.zzc, zzaeVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzad zza(int i) {
        return this.zzc[i];
    }

    public final zzae zzb(String str) {
        return zzfx.zzG(this.zza, str) ? this : new zzae(str, false, this.zzc);
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
        this.zzd = iHashCode;
        return iHashCode;
    }

    private zzae(String str, boolean z, zzad... zzadVarArr) {
        this.zza = str;
        zzadVarArr = z ? (zzad[]) zzadVarArr.clone() : zzadVarArr;
        this.zzc = zzadVarArr;
        this.zzb = zzadVarArr.length;
        Arrays.sort(zzadVarArr, this);
    }

    public zzae(String str, zzad... zzadVarArr) {
        this(null, true, zzadVarArr);
    }

    public zzae(List list) {
        this(null, false, (zzad[]) list.toArray(new zzad[0]));
    }
}
