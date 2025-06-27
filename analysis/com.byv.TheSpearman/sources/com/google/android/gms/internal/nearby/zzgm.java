package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzgm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgm> CREATOR = new zzgn();
    private zzen zza;
    private zzdw zzb;
    private zzec zzc;
    private String zzd;
    private String zze;
    private byte[] zzf;
    private zzdz zzg;
    private byte[] zzh;
    private ConnectionOptions zzi;

    private zzgm() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgm) {
            zzgm zzgmVar = (zzgm) obj;
            if (Objects.equal(this.zza, zzgmVar.zza) && Objects.equal(this.zzb, zzgmVar.zzb) && Objects.equal(this.zzc, zzgmVar.zzc) && Objects.equal(this.zzd, zzgmVar.zzd) && Objects.equal(this.zze, zzgmVar.zze) && Arrays.equals(this.zzf, zzgmVar.zzf) && Objects.equal(this.zzg, zzgmVar.zzg) && Arrays.equals(this.zzh, zzgmVar.zzh) && Objects.equal(this.zzi, zzgmVar.zzi)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, Integer.valueOf(Arrays.hashCode(this.zzf)), this.zzg, Integer.valueOf(Arrays.hashCode(this.zzh)), this.zzi);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzen zzenVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzenVar == null ? null : zzenVar.asBinder(), false);
        zzdw zzdwVar = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, zzdwVar == null ? null : zzdwVar.asBinder(), false);
        zzec zzecVar = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, zzecVar == null ? null : zzecVar.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeByteArray(parcel, 6, this.zzf, false);
        zzdz zzdzVar = this.zzg;
        SafeParcelWriter.writeIBinder(parcel, 7, zzdzVar != null ? zzdzVar.asBinder() : null, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzgm(IBinder iBinder, IBinder iBinder2, IBinder iBinder3, String str, String str2, byte[] bArr, IBinder iBinder4, byte[] bArr2, ConnectionOptions connectionOptions) {
        zzen zzelVar;
        zzdw zzduVar;
        zzec zzeaVar;
        zzdz zzdxVar = null;
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
        if (iBinder3 == null) {
            zzeaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
            zzeaVar = iInterfaceQueryLocalInterface3 instanceof zzec ? (zzec) iInterfaceQueryLocalInterface3 : new zzea(iBinder3);
        }
        if (iBinder4 != null) {
            IInterface iInterfaceQueryLocalInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            zzdxVar = iInterfaceQueryLocalInterface4 instanceof zzdz ? (zzdz) iInterfaceQueryLocalInterface4 : new zzdx(iBinder4);
        }
        this.zza = zzelVar;
        this.zzb = zzduVar;
        this.zzc = zzeaVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bArr;
        this.zzg = zzdxVar;
        this.zzh = bArr2;
        this.zzi = connectionOptions;
    }

    /* synthetic */ zzgm(zzgk zzgkVar) {
    }
}
