package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzahu implements Parcelable {
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzahs
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            zzahu zzahuVar = (zzahu) obj;
            zzahu zzahuVar2 = (zzahu) obj2;
            return zzfzc.zzk().zzc(zzahuVar.zzb, zzahuVar2.zzb).zzc(zzahuVar.zzc, zzahuVar2.zzc).zzb(zzahuVar.zzd, zzahuVar2.zzd).zza();
        }
    };
    public static final Parcelable.Creator<zzahu> CREATOR = new zzaht();

    public zzahu(long j, long j2, int i) {
        zzek.zzd(j < j2);
        this.zzb = j;
        this.zzc = j2;
        this.zzd = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahu zzahuVar = (zzahu) obj;
            if (this.zzb == zzahuVar.zzb && this.zzc == zzahuVar.zzc && this.zzd == zzahuVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeInt(this.zzd);
    }
}
