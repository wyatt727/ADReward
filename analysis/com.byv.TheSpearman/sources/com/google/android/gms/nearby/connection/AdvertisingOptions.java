package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class AdvertisingOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdvertisingOptions> CREATOR = new zzb();
    private Strategy zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private byte[] zzf;
    private boolean zzg;
    private ParcelUuid zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private byte[] zzq;
    private long zzr;
    private zzv[] zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static final class Builder {
        private final AdvertisingOptions zza;

        public Builder() {
            this.zza = new AdvertisingOptions((zza) null);
        }

        public AdvertisingOptions build() {
            return this.zza;
        }

        public Builder setDisruptiveUpgrade(boolean z) {
            this.zza.zzu = z;
            return this;
        }

        public Builder setLowPower(boolean z) {
            this.zza.zzg = z;
            return this;
        }

        public Builder setStrategy(Strategy strategy) {
            this.zza.zza = strategy;
            return this;
        }

        public Builder(AdvertisingOptions advertisingOptions) {
            AdvertisingOptions advertisingOptions2 = new AdvertisingOptions((zza) null);
            this.zza = advertisingOptions2;
            advertisingOptions2.zza = advertisingOptions.zza;
            advertisingOptions2.zzb = advertisingOptions.zzb;
            advertisingOptions2.zzc = advertisingOptions.zzc;
            advertisingOptions2.zzd = advertisingOptions.zzd;
            advertisingOptions2.zze = advertisingOptions.zze;
            advertisingOptions2.zzf = advertisingOptions.zzf;
            advertisingOptions2.zzg = advertisingOptions.zzg;
            advertisingOptions2.zzh = advertisingOptions.zzh;
            advertisingOptions2.zzi = advertisingOptions.zzi;
            advertisingOptions2.zzj = advertisingOptions.zzj;
            advertisingOptions2.zzk = advertisingOptions.zzk;
            advertisingOptions2.zzl = advertisingOptions.zzl;
            advertisingOptions2.zzm = advertisingOptions.zzm;
            advertisingOptions2.zzn = advertisingOptions.zzn;
            advertisingOptions2.zzo = advertisingOptions.zzo;
            advertisingOptions2.zzp = advertisingOptions.zzp;
            advertisingOptions2.zzq = advertisingOptions.zzq;
            advertisingOptions2.zzr = advertisingOptions.zzr;
            advertisingOptions2.zzs = advertisingOptions.zzs;
            advertisingOptions2.zzt = advertisingOptions.zzt;
            advertisingOptions2.zzu = advertisingOptions.zzu;
            advertisingOptions2.zzv = advertisingOptions.zzv;
        }
    }

    private AdvertisingOptions() {
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzg = false;
        this.zzi = true;
        this.zzj = true;
        this.zzk = true;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = 0L;
        this.zzt = false;
        this.zzu = true;
        this.zzv = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdvertisingOptions) {
            AdvertisingOptions advertisingOptions = (AdvertisingOptions) obj;
            if (Objects.equal(this.zza, advertisingOptions.zza) && Objects.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(advertisingOptions.zzb)) && Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(advertisingOptions.zzc)) && Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(advertisingOptions.zzd)) && Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(advertisingOptions.zze)) && Arrays.equals(this.zzf, advertisingOptions.zzf) && Objects.equal(Boolean.valueOf(this.zzg), Boolean.valueOf(advertisingOptions.zzg)) && Objects.equal(this.zzh, advertisingOptions.zzh) && Objects.equal(Boolean.valueOf(this.zzi), Boolean.valueOf(advertisingOptions.zzi)) && Objects.equal(Boolean.valueOf(this.zzj), Boolean.valueOf(advertisingOptions.zzj)) && Objects.equal(Boolean.valueOf(this.zzk), Boolean.valueOf(advertisingOptions.zzk)) && Objects.equal(Boolean.valueOf(this.zzl), Boolean.valueOf(advertisingOptions.zzl)) && Objects.equal(Boolean.valueOf(this.zzm), Boolean.valueOf(advertisingOptions.zzm)) && Objects.equal(Boolean.valueOf(this.zzn), Boolean.valueOf(advertisingOptions.zzn)) && Objects.equal(Integer.valueOf(this.zzo), Integer.valueOf(advertisingOptions.zzo)) && Objects.equal(Integer.valueOf(this.zzp), Integer.valueOf(advertisingOptions.zzp)) && Arrays.equals(this.zzq, advertisingOptions.zzq) && Objects.equal(Long.valueOf(this.zzr), Long.valueOf(advertisingOptions.zzr)) && Arrays.equals(this.zzs, advertisingOptions.zzs) && Objects.equal(Boolean.valueOf(this.zzt), Boolean.valueOf(advertisingOptions.zzt)) && Objects.equal(Boolean.valueOf(this.zzu), Boolean.valueOf(advertisingOptions.zzu)) && Objects.equal(Boolean.valueOf(this.zzv), Boolean.valueOf(advertisingOptions.zzv))) {
                return true;
            }
        }
        return false;
    }

    public boolean getDisruptiveUpgrade() {
        return this.zzu;
    }

    public boolean getLowPower() {
        return this.zzg;
    }

    public Strategy getStrategy() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), Integer.valueOf(Arrays.hashCode(this.zzf)), Boolean.valueOf(this.zzg), this.zzh, Boolean.valueOf(this.zzi), Boolean.valueOf(this.zzj), Boolean.valueOf(this.zzk), Boolean.valueOf(this.zzl), Boolean.valueOf(this.zzm), Boolean.valueOf(this.zzn), Integer.valueOf(this.zzo), Integer.valueOf(this.zzp), Integer.valueOf(Arrays.hashCode(this.zzq)), Long.valueOf(this.zzr), Integer.valueOf(Arrays.hashCode(this.zzs)), Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
    }

    public String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[21];
        objArr[0] = this.zza;
        objArr[1] = Boolean.valueOf(this.zzb);
        objArr[2] = Boolean.valueOf(this.zzc);
        objArr[3] = Boolean.valueOf(this.zzd);
        objArr[4] = Boolean.valueOf(this.zze);
        byte[] bArr = this.zzf;
        objArr[5] = bArr == null ? null : com.google.android.gms.nearby.messages.internal.zzc.zza(bArr);
        objArr[6] = Boolean.valueOf(this.zzg);
        objArr[7] = this.zzh;
        objArr[8] = Boolean.valueOf(this.zzi);
        objArr[9] = Boolean.valueOf(this.zzj);
        objArr[10] = Boolean.valueOf(this.zzk);
        objArr[11] = Boolean.valueOf(this.zzl);
        objArr[12] = Boolean.valueOf(this.zzm);
        objArr[13] = Boolean.valueOf(this.zzn);
        objArr[14] = Integer.valueOf(this.zzo);
        objArr[15] = Integer.valueOf(this.zzp);
        byte[] bArr2 = this.zzq;
        objArr[16] = bArr2 == null ? AbstractJsonLexerKt.NULL : com.google.android.gms.nearby.messages.internal.zzc.zza(bArr2);
        objArr[17] = Long.valueOf(this.zzr);
        objArr[18] = Arrays.toString(this.zzs);
        objArr[19] = Boolean.valueOf(this.zzt);
        objArr[20] = Boolean.valueOf(this.zzu);
        return String.format(locale, "AdvertisingOptions{strategy: %s, autoUpgradeBandwidth: %s, enforceTopologyConstraints: %s, enableBluetooth: %s, enableBle: %s, nearbyNotificationsBeaconData: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableBluetoothListening: %s, enableWebRtcListening: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, remoteUwbAddress: %s, flowId: %d, uwbSenderInfo: %s, enableOutOfBandConnection: %s, disruptiveUpgrade: %s}", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStrategy(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeByteArray(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 7, getLowPower());
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzn);
        SafeParcelWriter.writeInt(parcel, 15, this.zzo);
        SafeParcelWriter.writeInt(parcel, 16, this.zzp);
        SafeParcelWriter.writeByteArray(parcel, 17, this.zzq, false);
        SafeParcelWriter.writeLong(parcel, 18, this.zzr);
        SafeParcelWriter.writeTypedArray(parcel, 19, this.zzs, i, false);
        SafeParcelWriter.writeBoolean(parcel, 20, this.zzt);
        SafeParcelWriter.writeBoolean(parcel, 21, getDisruptiveUpgrade());
        SafeParcelWriter.writeBoolean(parcel, 22, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* synthetic */ AdvertisingOptions(zza zzaVar) {
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzg = false;
        this.zzi = true;
        this.zzj = true;
        this.zzk = true;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = 0L;
        this.zzt = false;
        this.zzu = true;
        this.zzv = false;
    }

    @Deprecated
    public AdvertisingOptions(Strategy strategy) {
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzg = false;
        this.zzi = true;
        this.zzj = true;
        this.zzk = true;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = 0L;
        this.zzt = false;
        this.zzu = true;
        this.zzv = false;
        this.zza = strategy;
    }

    AdvertisingOptions(Strategy strategy, boolean z, boolean z2, boolean z3, boolean z4, byte[] bArr, boolean z5, ParcelUuid parcelUuid, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, int i2, byte[] bArr2, long j, zzv[] zzvVarArr, boolean z12, boolean z13, boolean z14) {
        this.zza = strategy;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = z3;
        this.zze = z4;
        this.zzf = bArr;
        this.zzg = z5;
        this.zzh = parcelUuid;
        this.zzi = z6;
        this.zzj = z7;
        this.zzk = z8;
        this.zzl = z9;
        this.zzm = z10;
        this.zzn = z11;
        this.zzo = i;
        this.zzp = i2;
        this.zzq = bArr2;
        this.zzr = j;
        this.zzs = zzvVarArr;
        this.zzt = z12;
        this.zzu = z13;
        this.zzv = z14;
    }
}
