package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.json.t2;
import java.util.Comparator;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes3.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;
    int zzb;
    int zzc;
    public static final Comparator<DetectedActivity> zza = new zzq();
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new zzr();

    public DetectedActivity(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.zzb == detectedActivity.zzb && this.zzc == detectedActivity.zzc) {
                return true;
            }
        }
        return false;
    }

    public int getConfidence() {
        return this.zzc;
    }

    public int getType() {
        int i = this.zzb;
        if (i > 22 || i < 0) {
            return 4;
        }
        return i;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public String toString() {
        int type = getType();
        String string = type != 0 ? type != 1 ? type != 2 ? type != 3 ? type != 4 ? type != 5 ? type != 7 ? type != 8 ? type != 16 ? type != 17 ? Integer.toString(type) : "IN_RAIL_VEHICLE" : "IN_ROAD_VEHICLE" : DebugCoroutineInfoImplKt.RUNNING : "WALKING" : "TILTING" : "UNKNOWN" : "STILL" : "ON_FOOT" : "ON_BICYCLE" : "IN_VEHICLE";
        int i = this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(string);
        sb.append(", confidence=");
        sb.append(i);
        sb.append(t2.i.e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
