package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class ConnectionOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionOptions> CREATOR = new zzk();
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private byte[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static final class Builder {
        private final ConnectionOptions zza;

        public Builder() {
            this.zza = new ConnectionOptions(null);
        }

        public ConnectionOptions build() {
            return this.zza;
        }

        public Builder setDisruptiveUpgrade(boolean z) {
            this.zza.zzl = z;
            return this;
        }

        public Builder setLowPower(boolean z) {
            this.zza.zza = z;
            return this;
        }

        public Builder(ConnectionOptions connectionOptions) {
            ConnectionOptions connectionOptions2 = new ConnectionOptions(null);
            this.zza = connectionOptions2;
            connectionOptions2.zza = connectionOptions.zza;
            connectionOptions2.zzb = connectionOptions.zzb;
            connectionOptions2.zzc = connectionOptions.zzc;
            connectionOptions2.zzd = connectionOptions.zzd;
            connectionOptions2.zze = connectionOptions.zze;
            connectionOptions2.zzf = connectionOptions.zzf;
            connectionOptions2.zzg = connectionOptions.zzg;
            connectionOptions2.zzh = connectionOptions.zzh;
            connectionOptions2.zzi = connectionOptions.zzi;
            connectionOptions2.zzj = connectionOptions.zzj;
            connectionOptions2.zzk = connectionOptions.zzk;
            connectionOptions2.zzl = connectionOptions.zzl;
        }
    }

    private ConnectionOptions() {
        this.zza = false;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
        this.zzh = true;
        this.zzj = false;
        this.zzk = true;
        this.zzl = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionOptions) {
            ConnectionOptions connectionOptions = (ConnectionOptions) obj;
            if (Objects.equal(Boolean.valueOf(this.zza), Boolean.valueOf(connectionOptions.zza)) && Objects.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(connectionOptions.zzb)) && Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(connectionOptions.zzc)) && Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(connectionOptions.zzd)) && Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(connectionOptions.zze)) && Objects.equal(Boolean.valueOf(this.zzf), Boolean.valueOf(connectionOptions.zzf)) && Objects.equal(Boolean.valueOf(this.zzg), Boolean.valueOf(connectionOptions.zzg)) && Objects.equal(Boolean.valueOf(this.zzh), Boolean.valueOf(connectionOptions.zzh)) && Arrays.equals(this.zzi, connectionOptions.zzi) && Objects.equal(Boolean.valueOf(this.zzj), Boolean.valueOf(connectionOptions.zzj)) && Objects.equal(Boolean.valueOf(this.zzk), Boolean.valueOf(connectionOptions.zzk)) && Objects.equal(Boolean.valueOf(this.zzl), Boolean.valueOf(connectionOptions.zzl))) {
                return true;
            }
        }
        return false;
    }

    public boolean getDisruptiveUpgrade() {
        return this.zzl;
    }

    public boolean getLowPower() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), Boolean.valueOf(this.zzf), Boolean.valueOf(this.zzg), Boolean.valueOf(this.zzh), Integer.valueOf(Arrays.hashCode(this.zzi)), Boolean.valueOf(this.zzj), Boolean.valueOf(this.zzk), Boolean.valueOf(this.zzl));
    }

    public String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[12];
        objArr[0] = Boolean.valueOf(this.zza);
        objArr[1] = Boolean.valueOf(this.zzb);
        objArr[2] = Boolean.valueOf(this.zzc);
        objArr[3] = Boolean.valueOf(this.zzd);
        objArr[4] = Boolean.valueOf(this.zze);
        objArr[5] = Boolean.valueOf(this.zzf);
        objArr[6] = Boolean.valueOf(this.zzg);
        objArr[7] = Boolean.valueOf(this.zzh);
        byte[] bArr = this.zzi;
        objArr[8] = bArr == null ? null : com.google.android.gms.nearby.messages.internal.zzc.zza(bArr);
        objArr[9] = Boolean.valueOf(this.zzj);
        objArr[10] = Boolean.valueOf(this.zzk);
        objArr[11] = Boolean.valueOf(this.zzl);
        return String.format(locale, "ConnectionOptions{lowPower: %s, enableBluetooth: %s, enableBle: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableWifiHotspot: %s, enableWifiDirect: %s, remoteBluetoothMacAddress: %s, enableWebRtc: %s, enforceTopologyConstraints: %s, disruptiveUpgrade: %s}", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getLowPower());
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeByteArray(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 12, getDisruptiveUpgrade());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* synthetic */ ConnectionOptions(zzj zzjVar) {
        this.zza = false;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
        this.zzh = true;
        this.zzj = false;
        this.zzk = true;
        this.zzl = true;
    }

    ConnectionOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, byte[] bArr, boolean z9, boolean z10, boolean z11) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
        this.zze = z5;
        this.zzf = z6;
        this.zzg = z7;
        this.zzh = z8;
        this.zzi = bArr;
        this.zzj = z9;
        this.zzk = z10;
        this.zzl = z11;
    }
}
