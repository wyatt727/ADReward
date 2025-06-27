package com.google.android.gms.nearby.connection;

import android.bluetooth.BluetoothDevice;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class DiscoveredEndpointInfo {
    private final String zza;
    private final String zzb;
    private final BluetoothDevice zzc;
    private final byte[] zzd;

    @Deprecated
    public DiscoveredEndpointInfo(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = str2.getBytes();
        this.zzc = null;
    }

    /* synthetic */ DiscoveredEndpointInfo(String str, String str2, BluetoothDevice bluetoothDevice, byte[] bArr, zzm zzmVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bluetoothDevice;
        this.zzd = bArr;
    }

    public byte[] getEndpointInfo() {
        return this.zzd;
    }

    public String getEndpointName() {
        return this.zzb;
    }

    public String getServiceId() {
        return this.zza;
    }
}
