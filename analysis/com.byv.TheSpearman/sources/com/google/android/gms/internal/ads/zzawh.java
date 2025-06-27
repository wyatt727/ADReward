package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzawh implements zzawk {
    private static zzawh zzb;
    private final Context zzc;
    private final zzfri zzd;
    private final zzfrp zze;
    private final zzfrr zzf;
    private final zzaxj zzg;
    private final zzfpp zzh;
    private final Executor zzi;
    private final zzazh zzj;
    private final zzfro zzk;
    private final zzaxy zzm;
    private final zzaxq zzn;
    private final zzaxh zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    zzawh(Context context, zzfpp zzfppVar, zzfri zzfriVar, zzfrp zzfrpVar, zzfrr zzfrrVar, zzaxj zzaxjVar, Executor executor, zzfpi zzfpiVar, zzazh zzazhVar, zzaxy zzaxyVar, zzaxq zzaxqVar, zzaxh zzaxhVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfppVar;
        this.zzd = zzfriVar;
        this.zze = zzfrpVar;
        this.zzf = zzfrrVar;
        this.zzg = zzaxjVar;
        this.zzi = executor;
        this.zzj = zzazhVar;
        this.zzm = zzaxyVar;
        this.zzn = zzaxqVar;
        this.zzo = zzaxhVar;
        this.zzr = false;
        this.zzk = new zzawf(this, zzfpiVar);
    }

    public static synchronized zzawh zza(String str, Context context, boolean z, boolean z2) {
        return zzb(str, context, Executors.newCachedThreadPool(), z, z2);
    }

    @Deprecated
    public static synchronized zzawh zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        if (zzb == null) {
            zzfpq zzfpqVarZza = zzfpr.zza();
            zzfpqVarZza.zza(str);
            zzfpqVarZza.zzc(z);
            zzfpr zzfprVarZzd = zzfpqVarZza.zzd();
            zzfpp zzfppVarZza = zzfpp.zza(context, executor, z2);
            zzaws zzawsVarZzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdl)).booleanValue() ? zzaws.zzc(context) : null;
            zzaxy zzaxyVarZzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdm)).booleanValue() ? zzaxy.zzd(context, executor) : null;
            zzaxq zzaxqVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcA)).booleanValue() ? new zzaxq() : null;
            zzaxh zzaxhVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcC)).booleanValue() ? new zzaxh() : null;
            zzfqi zzfqiVarZze = zzfqi.zze(context, executor, zzfppVarZza, zzfprVarZzd);
            zzaxi zzaxiVar = new zzaxi(context);
            zzaxj zzaxjVar = new zzaxj(zzfprVarZzd, zzfqiVarZze, new zzaxw(context, zzaxiVar), zzaxiVar, zzawsVarZzc, zzaxyVarZzd, zzaxqVar, zzaxhVar);
            zzazh zzazhVarZzb = zzfqv.zzb(context, zzfppVarZza);
            zzfpi zzfpiVar = new zzfpi();
            zzawh zzawhVar = new zzawh(context, zzfppVarZza, new zzfri(context, zzazhVarZzb), new zzfrp(context, zzazhVarZzb, new zzawe(zzfppVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcj)).booleanValue()), new zzfrr(context, zzaxjVar, zzfppVarZza, zzfpiVar), zzaxjVar, executor, zzfpiVar, zzazhVarZzb, zzaxyVarZzd, zzaxqVar, zzaxhVar);
            zzb = zzawhVar;
            zzawhVar.zzm();
            zzb.zzp();
        }
        return zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5 A[Catch: all -> 0x011c, zzhak -> 0x011e, TryCatch #0 {zzhak -> 0x011e, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:27:0x009c, B:31:0x00b5, B:37:0x00ce, B:38:0x00db, B:40:0x00e1, B:42:0x00e9, B:43:0x00eb, B:34:0x00bf, B:35:0x00c6, B:23:0x0074, B:25:0x008a, B:44:0x00f5, B:45:0x0102, B:46:0x010f), top: B:56:0x0021, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzawh r12) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawh.zzj(com.google.android.gms.internal.ads.zzawh):void");
    }

    private final void zzs() {
        zzaxy zzaxyVar = this.zzm;
        if (zzaxyVar != null) {
            zzaxyVar.zzh();
        }
    }

    private final zzfrh zzt(int i) {
        if (zzfqv.zza(this.zzj)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzch)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcA)).booleanValue()) {
            this.zzn.zzi();
        }
        zzp();
        zzfps zzfpsVarZza = this.zzf.zza();
        if (zzfpsVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfpsVarZza.zza(context, null, str, view, activity);
        this.zzh.zzf(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zzg(Context context) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcA)).booleanValue()) {
            this.zzn.zzj();
        }
        zzp();
        zzfps zzfpsVarZza = this.zzf.zza();
        if (zzfpsVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfpsVarZza.zzc(context, null);
        this.zzh.zzf(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zzh(Context context, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcA)).booleanValue()) {
            this.zzn.zzk(context, view);
        }
        zzp();
        zzfps zzfpsVarZza = this.zzf.zza();
        if (zzfpsVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfpsVarZza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzk(MotionEvent motionEvent) {
        zzfps zzfpsVarZza = this.zzf.zza();
        if (zzfpsVarZza != null) {
            try {
                zzfpsVarZza.zzd(null, motionEvent);
            } catch (zzfrq e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzl(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlD)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = i2;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, displayMetrics.density * f, displayMetrics.density * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain);
        motionEventObtain.recycle();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain2);
        motionEventObtain2.recycle();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i3, 1, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    final synchronized void zzm() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfrh zzfrhVarZzt = zzt(1);
        if (zzfrhVarZzt == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zzc(zzfrhVarZzt)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaxh zzaxhVar = this.zzo;
        if (zzaxhVar != null) {
            zzaxhVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            if (!this.zzq) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfrh zzfrhVarZzb = this.zzf.zzb();
                if ((zzfrhVarZzb == null || zzfrhVarZzb.zzd(3600L)) && zzfqv.zza(this.zzj)) {
                    this.zzi.execute(new zzawg(this));
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzr;
    }
}
