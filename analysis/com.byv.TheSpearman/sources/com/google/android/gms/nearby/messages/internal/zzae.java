package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.messages.Message;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzaf();
    final int zza;
    public final Message zzb;

    zzae(int i, Message message) {
        this.zza = i;
        this.zzb = (Message) Preconditions.checkNotNull(message);
    }

    public static final zzae zza(Message message) {
        return new zzae(1, message);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzae) {
            return Objects.equal(this.zzb, ((zzae) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 24);
        sb.append("MessageWrapper{message=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
