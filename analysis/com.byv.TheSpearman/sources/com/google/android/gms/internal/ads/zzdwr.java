package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.mbridge.msdk.foundation.entity.b;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdwr extends zzftn {

    @Nullable
    private final SensorManager zzb;

    @Nullable
    private final Sensor zzc;
    private float zzd;
    private Float zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;

    @Nullable
    private zzdwq zzj;
    private boolean zzk;

    zzdwr(Context context) {
        super("FlickDetector", b.JSON_KEY_ADS);
        this.zzd = 0.0f;
        this.zze = Float.valueOf(0.0f);
        this.zzf = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        this.zzg = 0;
        this.zzh = false;
        this.zzi = false;
        this.zzj = null;
        this.zzk = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zzb = sensorManager;
        if (sensorManager != null) {
            this.zzc = sensorManager.getDefaultSensor(4);
        } else {
            this.zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    public final void zza(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziX)).booleanValue()) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            if (this.zzf + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziZ)).intValue() < jCurrentTimeMillis) {
                this.zzg = 0;
                this.zzf = jCurrentTimeMillis;
                this.zzh = false;
                this.zzi = false;
                this.zzd = this.zze.floatValue();
            }
            Float fValueOf = Float.valueOf(this.zze.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zze = fValueOf;
            if (fValueOf.floatValue() > this.zzd + ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziY)).floatValue()) {
                this.zzd = this.zze.floatValue();
                this.zzi = true;
            } else {
                if (this.zze.floatValue() < this.zzd - ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziY)).floatValue()) {
                    this.zzd = this.zze.floatValue();
                    this.zzh = true;
                }
            }
            if (this.zze.isInfinite()) {
                this.zze = Float.valueOf(0.0f);
                this.zzd = 0.0f;
            }
            if (this.zzh && this.zzi) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.zzf = jCurrentTimeMillis;
                int i = this.zzg + 1;
                this.zzg = i;
                this.zzh = false;
                this.zzi = false;
                zzdwq zzdwqVar = this.zzj;
                if (zzdwqVar != null) {
                    if (i == ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzja)).intValue()) {
                        zzdxf zzdxfVar = (zzdxf) zzdwqVar;
                        zzdxfVar.zzh(new zzdxd(zzdxfVar), zzdxe.GESTURE);
                    }
                }
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.zzk && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.zzk = false;
                com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziX)).booleanValue()) {
                if (!this.zzk && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzk = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
                }
                if (this.zzb == null || this.zzc == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    public final void zzd(zzdwq zzdwqVar) {
        this.zzj = zzdwqVar;
    }
}
