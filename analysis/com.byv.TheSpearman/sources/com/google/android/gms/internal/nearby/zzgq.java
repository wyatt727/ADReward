package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzgq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgq> CREATOR = new zzgr();
    private zzen zza;
    private String[] zzb;
    private zzgd zzc;
    private boolean zzd;

    private zzgq() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgq) {
            zzgq zzgqVar = (zzgq) obj;
            if (Objects.equal(this.zza, zzgqVar.zza) && Arrays.equals(this.zzb, zzgqVar.zzb) && Objects.equal(this.zzc, zzgqVar.zzc) && Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(zzgqVar.zzd))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(Arrays.hashCode(this.zzb)), this.zzc, Boolean.valueOf(this.zzd));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzen zzenVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzenVar == null ? null : zzenVar.asBinder(), false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzgq(IBinder iBinder, String[] strArr, zzgd zzgdVar, boolean z) {
        zzen zzelVar;
        if (iBinder == null) {
            zzelVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzelVar = iInterfaceQueryLocalInterface instanceof zzen ? (zzen) iInterfaceQueryLocalInterface : new zzel(iBinder);
        }
        this.zza = zzelVar;
        this.zzb = strArr;
        this.zzc = zzgdVar;
        this.zzd = z;
    }

    /* synthetic */ zzgq(zzgo zzgoVar) {
    }
}
