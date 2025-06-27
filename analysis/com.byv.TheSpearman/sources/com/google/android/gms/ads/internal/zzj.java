package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzawh;
import com.google.android.gms.internal.ads.zzawk;
import com.google.android.gms.internal.ads.zzawn;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfqv;
import com.google.android.gms.internal.ads.zzfrp;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzj implements Runnable, zzawk {
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfpp zzi;
    private Context zzj;
    private final Context zzk;
    private VersionInfoParcel zzl;
    private final VersionInfoParcel zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzj(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = versionInfoParcel;
        this.zzm = versionInfoParcel;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzba.zzc().zza(zzbdz.zzcm)).booleanValue();
        this.zzn = zBooleanValue;
        this.zzi = zzfpp.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.zzf = ((Boolean) zzba.zzc().zza(zzbdz.zzci)).booleanValue();
        this.zzg = ((Boolean) zzba.zzc().zza(zzbdz.zzcn)).booleanValue();
        if (((Boolean) zzba.zzc().zza(zzbdz.zzcl)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzba.zzc().zza(zzbdz.zzdp)).booleanValue()) {
            this.zza = zzc();
        }
        if (((Boolean) zzba.zzc().zza(zzbdz.zzdi)).booleanValue()) {
            zzcbr.zza.execute(this);
            return;
        }
        zzay.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzv()) {
            zzcbr.zza.execute(this);
        } else {
            run();
        }
    }

    private final zzawk zzm() {
        return zzi() == 2 ? (zzawk) this.zze.get() : (zzawk) this.zzd.get();
    }

    private final void zzp() {
        List list = this.zzc;
        zzawk zzawkVarZzm = zzm();
        if (list.isEmpty() || zzawkVarZzm == null) {
            return;
        }
        for (Object[] objArr : this.zzc) {
            int length = objArr.length;
            if (length == 1) {
                zzawkVarZzm.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzawkVarZzm.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzc.clear();
    }

    private final void zzq(boolean z) {
        this.zzd.set(zzawn.zzu(this.zzl.afmaVersion, zzr(this.zzj), z, this.zzo));
    }

    private static final Context zzr(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().zza(zzbdz.zzdp)).booleanValue()) {
                this.zza = zzc();
            }
            boolean z = this.zzl.isClientJar;
            final boolean z2 = false;
            if (!((Boolean) zzba.zzc().zza(zzbdz.zzaW)).booleanValue() && z) {
                z2 = true;
            }
            if (zzi() == 1) {
                zzq(z2);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzh
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzb(z2);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    zzawh zzawhVarZza = zzawh.zza(this.zzl.afmaVersion, zzr(this.zzj), z2, this.zzn);
                    this.zze.set(zzawhVarZza);
                    if (this.zzg && !zzawhVarZza.zzr()) {
                        this.zzo = 1;
                        zzq(z2);
                    }
                } catch (NullPointerException e) {
                    this.zzo = 1;
                    zzq(z2);
                    this.zzi.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
        } finally {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    final /* synthetic */ void zzb(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zzawh.zza(this.zzm.afmaVersion, zzr(this.zzk), z, this.zzn).zzp();
        } catch (NullPointerException e) {
            this.zzi.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
        }
    }

    protected final boolean zzc() {
        Context context = this.zzj;
        zzi zziVar = new zzi(this);
        zzfpp zzfppVar = this.zzi;
        return new zzfrp(this.zzj, zzfqv.zzb(context, zzfppVar), zziVar, ((Boolean) zzba.zzc().zza(zzbdz.zzcj)).booleanValue()).zzd(1);
    }

    public final boolean zzd() throws InterruptedException {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zzd()) {
            return "";
        }
        zzawk zzawkVarZzm = zzm();
        if (((Boolean) zzba.zzc().zza(zzbdz.zzkq)).booleanValue()) {
            zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzJ(view, 4, null);
        }
        if (zzawkVarZzm == null) {
            return "";
        }
        zzp();
        return zzawkVarZzm.zzf(zzr(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zzg(Context context) {
        zzawk zzawkVarZzm;
        if (!zzd() || (zzawkVarZzm = zzm()) == null) {
            return "";
        }
        zzp();
        return zzawkVarZzm.zzg(zzr(context));
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzba.zzc().zza(zzbdz.zzkp)).booleanValue()) {
            zzawk zzawkVarZzm = zzm();
            if (((Boolean) zzba.zzc().zza(zzbdz.zzkq)).booleanValue()) {
                zzu.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzJ(view, 2, null);
            }
            return zzawkVarZzm != null ? zzawkVarZzm.zzh(context, view, activity) : "";
        }
        if (!zzd()) {
            return "";
        }
        zzawk zzawkVarZzm2 = zzm();
        if (((Boolean) zzba.zzc().zza(zzbdz.zzkq)).booleanValue()) {
            zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzJ(view, 2, null);
        }
        return zzawkVarZzm2 != null ? zzawkVarZzm2.zzh(context, view, activity) : "";
    }

    protected final int zzi() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    public final int zzj() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzk(MotionEvent motionEvent) {
        zzawk zzawkVarZzm = zzm();
        if (zzawkVarZzm == null) {
            this.zzc.add(new Object[]{motionEvent});
        } else {
            zzp();
            zzawkVarZzm.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzl(int i, int i2, int i3) {
        zzawk zzawkVarZzm = zzm();
        if (zzawkVarZzm == null) {
            this.zzc.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            zzp();
            zzawkVarZzm.zzl(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzawk zzawkVarZzm;
        if (!zzd() || (zzawkVarZzm = zzm()) == null) {
            return;
        }
        zzawkVarZzm.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzo(View view) {
        zzawk zzawkVarZzm = zzm();
        if (zzawkVarZzm != null) {
            zzawkVarZzm.zzo(view);
        }
    }
}
