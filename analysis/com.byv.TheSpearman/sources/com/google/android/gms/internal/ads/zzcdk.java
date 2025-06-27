package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import com.mbridge.msdk.foundation.entity.b;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcdk extends zzftn {
    private final SensorManager zzb;
    private final Object zzc;
    private final Display zzd;
    private final float[] zze;
    private final float[] zzf;
    private float[] zzg;
    private Handler zzh;
    private zzcdj zzi;

    zzcdk(Context context) {
        super("OrientationMonitor", b.JSON_KEY_ADS);
        this.zzb = (SensorManager) context.getSystemService("sensor");
        this.zzd = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.zze = new float[9];
        this.zzf = new float[9];
        this.zzc = new Object();
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    public final void zza(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zzg == null) {
                this.zzg = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.zze, fArr);
        int rotation = this.zzd.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.zze, 2, 129, this.zzf);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.zze, 129, 130, this.zzf);
        } else if (rotation != 3) {
            System.arraycopy(this.zze, 0, this.zzf, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.zze, 130, 1, this.zzf);
        }
        float[] fArr2 = this.zzf;
        float f = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f;
        float f2 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f2;
        float f3 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f3;
        synchronized (this.zzc) {
            System.arraycopy(this.zzf, 0, this.zzg, 0, 9);
        }
        zzcdj zzcdjVar = this.zzi;
        if (zzcdjVar != null) {
            zzcdjVar.zza();
        }
    }

    final void zzb(zzcdj zzcdjVar) {
        this.zzi = zzcdjVar;
    }

    final void zzc() {
        if (this.zzh != null) {
            return;
        }
        Sensor defaultSensor = this.zzb.getDefaultSensor(11);
        if (defaultSensor == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        zzftg zzftgVar = new zzftg(handlerThread.getLooper());
        this.zzh = zzftgVar;
        if (this.zzb.registerListener(this, defaultSensor, 0, zzftgVar)) {
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzg("SensorManager.registerListener failed.");
        zzd();
    }

    final void zzd() {
        if (this.zzh == null) {
            return;
        }
        this.zzb.unregisterListener(this);
        this.zzh.post(new zzcdi(this));
        this.zzh = null;
    }

    final boolean zze(float[] fArr) {
        synchronized (this.zzc) {
            float[] fArr2 = this.zzg;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }
}
