package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class PayloadTransferUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PayloadTransferUpdate> CREATOR = new zzr();
    private long zza;
    private int zzb;
    private long zzc;
    private long zzd;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static final class Builder {
        private final PayloadTransferUpdate zza;

        public Builder() {
            this.zza = new PayloadTransferUpdate(null);
        }

        public PayloadTransferUpdate build() {
            return this.zza;
        }

        public Builder setBytesTransferred(long j) {
            this.zza.zzd = j;
            return this;
        }

        public Builder setPayloadId(long j) {
            this.zza.zza = j;
            return this;
        }

        public Builder setStatus(int i) {
            this.zza.zzb = i;
            return this;
        }

        public Builder setTotalBytes(long j) {
            this.zza.zzc = j;
            return this;
        }

        public Builder(PayloadTransferUpdate payloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate2 = new PayloadTransferUpdate(null);
            this.zza = payloadTransferUpdate2;
            payloadTransferUpdate2.zza = payloadTransferUpdate.zza;
            payloadTransferUpdate2.zzb = payloadTransferUpdate.zzb;
            payloadTransferUpdate2.zzc = payloadTransferUpdate.zzc;
            payloadTransferUpdate2.zzd = payloadTransferUpdate.zzd;
        }
    }

    /* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
        public static final int CANCELED = 4;
        public static final int FAILURE = 2;
        public static final int IN_PROGRESS = 3;
        public static final int SUCCESS = 1;
    }

    private PayloadTransferUpdate() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate = (PayloadTransferUpdate) obj;
            if (Objects.equal(Long.valueOf(this.zza), Long.valueOf(payloadTransferUpdate.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(payloadTransferUpdate.zzb)) && Objects.equal(Long.valueOf(this.zzc), Long.valueOf(payloadTransferUpdate.zzc)) && Objects.equal(Long.valueOf(this.zzd), Long.valueOf(payloadTransferUpdate.zzd))) {
                return true;
            }
        }
        return false;
    }

    public long getBytesTransferred() {
        return this.zzd;
    }

    public long getPayloadId() {
        return this.zza;
    }

    public int getStatus() {
        return this.zzb;
    }

    public long getTotalBytes() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Long.valueOf(this.zzc), Long.valueOf(this.zzd));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getPayloadId());
        SafeParcelWriter.writeInt(parcel, 2, getStatus());
        SafeParcelWriter.writeLong(parcel, 3, getTotalBytes());
        SafeParcelWriter.writeLong(parcel, 4, getBytesTransferred());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    PayloadTransferUpdate(long j, int i, long j2, long j3) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = j3;
    }

    /* synthetic */ PayloadTransferUpdate(zzq zzqVar) {
    }
}
