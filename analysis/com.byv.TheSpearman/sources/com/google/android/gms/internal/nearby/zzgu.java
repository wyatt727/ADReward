package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzgu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgu> CREATOR = new zzgv();
    private zzeq zza;
    private zzdt zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private AdvertisingOptions zzf;
    private zzdz zzg;
    private byte[] zzh;

    private zzgu() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgu) {
            zzgu zzguVar = (zzgu) obj;
            if (Objects.equal(this.zza, zzguVar.zza) && Objects.equal(this.zzb, zzguVar.zzb) && Objects.equal(this.zzc, zzguVar.zzc) && Objects.equal(this.zzd, zzguVar.zzd) && Objects.equal(Long.valueOf(this.zze), Long.valueOf(zzguVar.zze)) && Objects.equal(this.zzf, zzguVar.zzf) && Objects.equal(this.zzg, zzguVar.zzg) && Arrays.equals(this.zzh, zzguVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, Long.valueOf(this.zze), this.zzf, this.zzg, Integer.valueOf(Arrays.hashCode(this.zzh)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzeq zzeqVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzeqVar == null ? null : zzeqVar.asBinder(), false);
        zzdt zzdtVar = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, zzdtVar == null ? null : zzdtVar.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        zzdz zzdzVar = this.zzg;
        SafeParcelWriter.writeIBinder(parcel, 7, zzdzVar != null ? zzdzVar.asBinder() : null, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzgu(IBinder iBinder, IBinder iBinder2, String str, String str2, long j, AdvertisingOptions advertisingOptions, IBinder iBinder3, byte[] bArr) {
        zzeq zzeoVar;
        zzdt zzdrVar;
        zzdz zzdxVar = null;
        if (iBinder == null) {
            zzeoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
            zzeoVar = iInterfaceQueryLocalInterface instanceof zzeq ? (zzeq) iInterfaceQueryLocalInterface : new zzeo(iBinder);
        }
        if (iBinder2 == null) {
            zzdrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
            zzdrVar = iInterfaceQueryLocalInterface2 instanceof zzdt ? (zzdt) iInterfaceQueryLocalInterface2 : new zzdr(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            zzdxVar = iInterfaceQueryLocalInterface3 instanceof zzdz ? (zzdz) iInterfaceQueryLocalInterface3 : new zzdx(iBinder3);
        }
        this.zza = zzeoVar;
        this.zzb = zzdrVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = j;
        this.zzf = advertisingOptions;
        this.zzg = zzdxVar;
        this.zzh = bArr;
    }

    /* synthetic */ zzgu(zzgs zzgsVar) {
    }
}
