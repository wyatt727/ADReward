package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeri implements zzewr {
    private final zzgep zza;
    private final Context zzb;

    zzeri(zzgep zzgepVar, Context context) {
        this.zza = zzgepVar;
        this.zzb = context;
    }

    private final Intent zzd() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkF)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.zzb.registerReceiver(null, intentFilter) : this.zzb.registerReceiver(null, intentFilter, 4);
    }

    private static final boolean zze(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzerj zzc() throws Exception {
        double intExtra;
        boolean zZze;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlG)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.zzb.getSystemService("batterymanager");
            intExtra = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
            zZze = (Build.VERSION.SDK_INT < 23 || batteryManager == null) ? zze(zzd()) : batteryManager.isCharging();
        } else {
            Intent intentZzd = zzd();
            boolean zZze2 = zze(intentZzd);
            intExtra = intentZzd != null ? intentZzd.getIntExtra("level", -1) / intentZzd.getIntExtra("scale", -1) : -1.0d;
            zZze = zZze2;
        }
        return new zzerj(intExtra, zZze);
    }
}
