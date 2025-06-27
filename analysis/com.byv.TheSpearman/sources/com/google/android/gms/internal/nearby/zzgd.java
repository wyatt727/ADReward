package com.google.android.gms.internal.nearby;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzgd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgd> CREATOR = new zzge();
    private long zza;
    private int zzb;
    private byte[] zzc;
    private ParcelFileDescriptor zzd;
    private String zze;
    private long zzf;
    private ParcelFileDescriptor zzg;
    private Uri zzh;
    private long zzi;
    private boolean zzj;
    private zzfz zzk;

    private zzgd() {
        this.zzf = -1L;
        this.zzi = 0L;
        this.zzj = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgd) {
            zzgd zzgdVar = (zzgd) obj;
            if (Objects.equal(Long.valueOf(this.zza), Long.valueOf(zzgdVar.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzgdVar.zzb)) && Arrays.equals(this.zzc, zzgdVar.zzc) && Objects.equal(this.zzd, zzgdVar.zzd) && Objects.equal(this.zze, zzgdVar.zze) && Objects.equal(Long.valueOf(this.zzf), Long.valueOf(zzgdVar.zzf)) && Objects.equal(this.zzg, zzgdVar.zzg) && Objects.equal(this.zzh, zzgdVar.zzh) && Objects.equal(Long.valueOf(this.zzi), Long.valueOf(zzgdVar.zzi)) && Objects.equal(Boolean.valueOf(this.zzj), Boolean.valueOf(zzgdVar.zzj)) && Objects.equal(this.zzk, zzgdVar.zzk)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(Arrays.hashCode(this.zzc)), this.zzd, this.zze, Long.valueOf(this.zzf), this.zzg, this.zzh, Long.valueOf(this.zzi), Boolean.valueOf(this.zzj), this.zzk);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final long zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final byte[] zzc() {
        return this.zzc;
    }

    public final ParcelFileDescriptor zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zze;
    }

    public final long zzf() {
        return this.zzf;
    }

    public final ParcelFileDescriptor zzg() {
        return this.zzg;
    }

    public final Uri zzh() {
        return this.zzh;
    }

    public final zzfz zzi() {
        return this.zzk;
    }

    zzgd(long j, int i, byte[] bArr, ParcelFileDescriptor parcelFileDescriptor, String str, long j2, ParcelFileDescriptor parcelFileDescriptor2, Uri uri, long j3, boolean z, zzfz zzfzVar) {
        this.zza = j;
        this.zzb = i;
        this.zzc = bArr;
        this.zzd = parcelFileDescriptor;
        this.zze = str;
        this.zzf = j2;
        this.zzg = parcelFileDescriptor2;
        this.zzh = uri;
        this.zzi = j3;
        this.zzj = z;
        this.zzk = zzfzVar;
    }

    /* synthetic */ zzgd(zzgb zzgbVar) {
        this.zzf = -1L;
        this.zzi = 0L;
        this.zzj = false;
    }
}
