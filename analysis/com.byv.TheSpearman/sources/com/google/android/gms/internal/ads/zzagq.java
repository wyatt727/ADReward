package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzagq extends zzahd {
    public static final Parcelable.Creator<zzagq> CREATOR = new zzagp();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    zzagq(Parcel parcel) {
        String string = parcel.readString();
        int i = zzfx.zza;
        super(string);
        this.zza = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagq zzagqVar = (zzagq) obj;
            if (this.zzf.equals(zzagqVar.zzf) && Arrays.equals(this.zza, zzagqVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public zzagq(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}
