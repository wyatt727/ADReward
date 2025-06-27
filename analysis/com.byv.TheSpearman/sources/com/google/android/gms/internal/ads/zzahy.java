package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.json.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzahy implements zzbx {
    public static final Parcelable.Creator<zzahy> CREATOR = new zzahw();
    public final float zza;
    public final int zzb;

    public zzahy(float f, int i) {
        this.zza = f;
        this.zzb = i;
    }

    /* synthetic */ zzahy(Parcel parcel, zzahx zzahxVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
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
            zzahy zzahyVar = (zzahy) obj;
            if (this.zza == zzahyVar.zza && this.zzb == zzahyVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
