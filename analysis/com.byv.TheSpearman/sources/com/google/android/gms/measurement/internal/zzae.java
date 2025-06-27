package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzad();
    public String zza;
    public String zzb;
    public zznt zzc;
    public long zzd;
    public boolean zze;
    public String zzf;
    public zzbd zzg;
    public long zzh;
    public zzbd zzi;
    public long zzj;
    public zzbd zzk;

    zzae(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        this.zza = zzaeVar.zza;
        this.zzb = zzaeVar.zzb;
        this.zzc = zzaeVar.zzc;
        this.zzd = zzaeVar.zzd;
        this.zze = zzaeVar.zze;
        this.zzf = zzaeVar.zzf;
        this.zzg = zzaeVar.zzg;
        this.zzh = zzaeVar.zzh;
        this.zzi = zzaeVar.zzi;
        this.zzj = zzaeVar.zzj;
        this.zzk = zzaeVar.zzk;
    }

    zzae(String str, String str2, zznt zzntVar, long j, boolean z, String str3, zzbd zzbdVar, long j2, zzbd zzbdVar2, long j3, zzbd zzbdVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzntVar;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzbdVar;
        this.zzh = j2;
        this.zzi = zzbdVar2;
        this.zzj = j3;
        this.zzk = zzbdVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
