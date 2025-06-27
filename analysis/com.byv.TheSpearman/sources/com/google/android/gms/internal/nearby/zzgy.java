package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzgy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgy> CREATOR = new zzgz();
    private zzen zza;
    private String zzb;
    private long zzc;
    private DiscoveryOptions zzd;
    private zzeg zze;
    private zzed zzf;

    private zzgy() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgy) {
            zzgy zzgyVar = (zzgy) obj;
            if (Objects.equal(this.zza, zzgyVar.zza) && Objects.equal(this.zzf, zzgyVar.zzf) && Objects.equal(this.zzb, zzgyVar.zzb) && Objects.equal(Long.valueOf(this.zzc), Long.valueOf(zzgyVar.zzc)) && Objects.equal(this.zzd, zzgyVar.zzd) && Objects.equal(this.zze, zzgyVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzf, this.zzb, Long.valueOf(this.zzc), this.zzd, this.zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzen zzenVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzenVar == null ? null : zzenVar.asBinder(), false);
        zzed zzedVar = this.zzf;
        SafeParcelWriter.writeIBinder(parcel, 2, zzedVar == null ? null : zzedVar.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        zzeg zzegVar = this.zze;
        SafeParcelWriter.writeIBinder(parcel, 6, zzegVar != null ? zzegVar.asBinder() : null, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzgy(IBinder iBinder, IBinder iBinder2, String str, long j, DiscoveryOptions discoveryOptions, IBinder iBinder3) {
        zzen zzelVar;
        zzed zzedVar;
        zzeg zzeeVar = null;
        if (iBinder == null) {
            zzelVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzelVar = iInterfaceQueryLocalInterface instanceof zzen ? (zzen) iInterfaceQueryLocalInterface : new zzel(iBinder);
        }
        if (iBinder2 == null) {
            zzedVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
            zzedVar = iInterfaceQueryLocalInterface2 instanceof zzed ? (zzed) iInterfaceQueryLocalInterface2 : new zzed(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
            zzeeVar = iInterfaceQueryLocalInterface3 instanceof zzeg ? (zzeg) iInterfaceQueryLocalInterface3 : new zzee(iBinder3);
        }
        this.zza = zzelVar;
        this.zzf = zzedVar;
        this.zzb = str;
        this.zzc = j;
        this.zzd = discoveryOptions;
        this.zze = zzeeVar;
    }

    /* synthetic */ zzgy(zzgw zzgwVar) {
    }
}
