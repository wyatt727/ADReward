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
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    private zzen zza;
    private zzdw zzb;
    private String zzc;
    private byte[] zzd;
    private zzek zze;

    private zzr() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzrVar = (zzr) obj;
            if (Objects.equal(this.zza, zzrVar.zza) && Objects.equal(this.zzb, zzrVar.zzb) && Objects.equal(this.zzc, zzrVar.zzc) && Arrays.equals(this.zzd, zzrVar.zzd) && Objects.equal(this.zze, zzrVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, Integer.valueOf(Arrays.hashCode(this.zzd)), this.zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzen zzenVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzenVar == null ? null : zzenVar.asBinder(), false);
        zzdw zzdwVar = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, zzdwVar == null ? null : zzdwVar.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzd, false);
        zzek zzekVar = this.zze;
        SafeParcelWriter.writeIBinder(parcel, 5, zzekVar != null ? zzekVar.asBinder() : null, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzr(IBinder iBinder, IBinder iBinder2, String str, byte[] bArr, IBinder iBinder3) {
        zzen zzelVar;
        zzdw zzduVar;
        zzek zzeiVar = null;
        if (iBinder == null) {
            zzelVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzelVar = iInterfaceQueryLocalInterface instanceof zzen ? (zzen) iInterfaceQueryLocalInterface : new zzel(iBinder);
        }
        if (iBinder2 == null) {
            zzduVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
            zzduVar = iInterfaceQueryLocalInterface2 instanceof zzdw ? (zzdw) iInterfaceQueryLocalInterface2 : new zzdu(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IPayloadListener");
            zzeiVar = iInterfaceQueryLocalInterface3 instanceof zzek ? (zzek) iInterfaceQueryLocalInterface3 : new zzei(iBinder3);
        }
        this.zza = zzelVar;
        this.zzb = zzduVar;
        this.zzc = str;
        this.zzd = bArr;
        this.zze = zzeiVar;
    }

    /* synthetic */ zzr(zzp zzpVar) {
    }
}
