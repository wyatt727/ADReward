package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcfh extends zzcey implements zzcdd {
    public static final /* synthetic */ int zzd = 0;
    private zzcde zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzceq zzi;
    private long zzj;
    private long zzk;

    public zzcfh(zzcdn zzcdnVar, zzcdm zzcdmVar) {
        super(zzcdnVar);
        zzcfz zzcfzVar = new zzcfz(zzcdnVar.getContext(), zzcdmVar, (zzcdn) this.zzc.get(), null);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcfzVar;
        zzcfzVar.zzL(this);
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private static String zzd(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j) {
        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfg
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.zza.zzb();
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcey, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcde zzcdeVar = this.zze;
        if (zzcdeVar != null) {
            zzcdeVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzD(int i, int i2) {
    }

    public final zzcde zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcde zzcdeVar = this.zze;
        this.zze = null;
        return zzcdeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.google.android.gms.internal.ads.zzcey, com.google.android.gms.internal.ads.zzcfh] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzcfh] */
    /* JADX WARN: Type inference failed for: r2v31 */
    final /* synthetic */ void zzb() throws Throwable {
        String str;
        zzcfh zzcfhVarBooleanValue;
        zzcfh zzcfhVar;
        zzbdx zzbdxVarZzc;
        long jLongValue;
        long jIntValue;
        zzcfh zzcfhVar2;
        long j;
        long j2;
        String str2;
        long j3;
        String strZzc = zzc(this.zzf);
        String str3 = "error";
        try {
            zzbdq zzbdqVar = zzbdz.zzx;
            zzbdxVarZzc = com.google.android.gms.ads.internal.client.zzba.zzc();
            jLongValue = ((Long) zzbdxVarZzc.zza(zzbdqVar)).longValue() * 1000;
            jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzw)).intValue();
            zzcfhVarBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            str = strZzc;
            zzcfhVarBooleanValue = this;
        }
        synchronized (this) {
            try {
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                long j4 = this.zzj;
                if (jCurrentTimeMillis - j4 <= jLongValue) {
                    try {
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzV()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzz = this.zze.zzz();
                            if (jZzz > 0) {
                                long jZzv = this.zze.zzv();
                                if (jZzv != this.zzk) {
                                    try {
                                        j2 = jIntValue;
                                        str2 = strZzc;
                                        try {
                                            zzo(this.zzf, strZzc, jZzv, jZzz, jZzv > 0, zzcfhVarBooleanValue != 0 ? this.zze.zzA() : -1L, zzcfhVarBooleanValue != 0 ? this.zze.zzx() : -1L, zzcfhVarBooleanValue != 0 ? this.zze.zzB() : -1L, zzcde.zzs(), zzcde.zzu());
                                            zzcfhVarBooleanValue = this;
                                            j = jZzv;
                                            try {
                                                zzcfhVarBooleanValue.zzk = j;
                                                j3 = jZzz;
                                                zzcfhVarBooleanValue = zzcfhVarBooleanValue;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str = str2;
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            zzcfhVarBooleanValue = this;
                                            str = str2;
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        zzcfhVarBooleanValue = this;
                                        str = strZzc;
                                    }
                                } else {
                                    j = jZzv;
                                    j2 = jIntValue;
                                    str2 = strZzc;
                                    zzcfhVarBooleanValue = this;
                                    j3 = jZzz;
                                }
                                if (j >= j3) {
                                    zzcfhVarBooleanValue.zzj(zzcfhVarBooleanValue.zzf, str2, j3);
                                    zzcfhVar = zzcfhVarBooleanValue;
                                } else {
                                    long jZzw = zzcfhVarBooleanValue.zze.zzw();
                                    zzcfhVar2 = zzcfhVarBooleanValue;
                                    if (jZzw >= j2) {
                                        zzcfhVar2 = zzcfhVarBooleanValue;
                                        if (j > 0) {
                                            zzcfhVar = zzcfhVarBooleanValue;
                                        }
                                    }
                                }
                            } else {
                                zzcfhVar2 = this;
                            }
                            zzcfhVar2.zzx(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzy)).longValue());
                            return;
                        }
                        zzcfhVar = this;
                        com.google.android.gms.ads.internal.zzu.zzy().zzc(zzcfhVar.zzi);
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = zzbdxVarZzc;
                        str = j4;
                    }
                } else {
                    str = strZzc;
                    zzcfhVarBooleanValue = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = strZzc;
                zzcfhVarBooleanValue = this;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                String str4 = str3;
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + zzcfhVarBooleanValue.zzf + " Exception: " + e.getMessage());
                com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzcfhVarBooleanValue.zzg(zzcfhVarBooleanValue.zzf, str, str4, zzd(str4, e));
                zzcfhVar = zzcfhVarBooleanValue;
                com.google.android.gms.ads.internal.zzu.zzy().zzc(zzcfhVar.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzi(final boolean z, final long j) {
        final zzcdn zzcdnVar = (zzcdn) this.zzc.get();
        if (zzcdnVar != null) {
            zzcbr.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzcfh.zzd;
                    zzcdnVar.zzv(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzk(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzl(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final void zzp(int i) {
        this.zze.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final void zzq(int i) {
        this.zze.zzK(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final void zzr(int i) {
        this.zze.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final void zzs(int i) {
        this.zze.zzN(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcey] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.zzcey
    public final boolean zzu(String str, String[] strArr) throws Throwable {
        ?? r6;
        String str2;
        ?? r5;
        long j;
        long j2;
        long j3;
        ?? r1;
        long j4;
        String str3;
        long j5;
        long j6;
        long j7;
        zzcfh zzcfhVar = this;
        String str4 = str;
        zzcfhVar.zzf = str4;
        String str5 = "error";
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzcfhVar.zze.zzF(uriArr, zzcfhVar.zzb);
            zzcdn zzcdnVar = (zzcdn) zzcfhVar.zzc.get();
            if (zzcdnVar != null) {
                zzcdnVar.zzt(strZzc, zzcfhVar);
            }
            Clock clockZzB = com.google.android.gms.ads.internal.zzu.zzB();
            long jCurrentTimeMillis = clockZzB.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzy)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzx)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzw)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue();
            long j8 = -1;
            long j9 = jIntValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (clockZzB.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (zzcfhVar.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (zzcfhVar.zzh) {
                            break;
                        }
                        if (!zzcfhVar.zze.zzV()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jZzz = zzcfhVar.zze.zzz();
                        if (jZzz > 0) {
                            long jZzv = zzcfhVar.zze.zzv();
                            if (jZzv != j8) {
                                try {
                                    j = j9;
                                    j7 = jZzz;
                                    j2 = jLongValue2;
                                    j4 = jLongValue;
                                    str3 = strZzc;
                                } catch (Throwable th) {
                                    th = th;
                                    r5 = this;
                                    r6 = str;
                                    str2 = strZzc;
                                }
                                try {
                                    zzo(str, strZzc, jZzv, j7, jZzv > 0, zBooleanValue ? zzcfhVar.zze.zzA() : -1L, zBooleanValue ? zzcfhVar.zze.zzx() : -1L, zBooleanValue ? zzcfhVar.zze.zzB() : -1L, zzcde.zzs(), zzcde.zzu());
                                    j6 = jZzv;
                                    j5 = jZzz;
                                    r6 = j7;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r5 = this;
                                    r6 = str;
                                    str2 = str3;
                                    try {
                                        throw th;
                                    } catch (Exception e) {
                                        e = e;
                                        String str6 = str5;
                                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + r6 + " Exception: " + e.getMessage());
                                        com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
                                        release();
                                        r5.zzg(r6, str2, str6, zzd(str6, e));
                                        return false;
                                    }
                                }
                            } else {
                                j = j9;
                                j2 = jLongValue2;
                                j4 = jLongValue;
                                str3 = strZzc;
                                j5 = jZzz;
                                j6 = j8;
                                r6 = j9;
                            }
                            r5 = (jZzv > j5 ? 1 : (jZzv == j5 ? 0 : -1));
                            if (r5 >= 0) {
                                zzj(str, str3, j5);
                            } else {
                                try {
                                    zzcfh zzcfhVar2 = this;
                                    r6 = str;
                                    str2 = str3;
                                    if (zzcfhVar2.zze.zzw() < j || jZzv <= 0) {
                                        j3 = j4;
                                        r1 = j6;
                                        r5 = zzcfhVar2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            }
                        } else {
                            j = j9;
                            j2 = jLongValue2;
                            r6 = str4;
                            str2 = strZzc;
                            r5 = zzcfhVar;
                            j3 = jLongValue;
                            r1 = j8;
                        }
                        try {
                            try {
                                r5.wait(j3);
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str5 = r1;
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r6 = str4;
                        str2 = strZzc;
                        r5 = zzcfhVar;
                    }
                }
                jLongValue = j3;
                zzcfhVar = r5;
                str4 = r6;
                strZzc = str2;
                j9 = j;
                jLongValue2 = j2;
                j8 = r1;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            r6 = str4;
            str2 = strZzc;
            r5 = zzcfhVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzv() {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final boolean zzw(String str, String[] strArr, zzceq zzceqVar) {
        this.zzf = str;
        this.zzi = zzceqVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcdn zzcdnVar = (zzcdn) this.zzc.get();
            if (zzcdnVar != null) {
                zzcdnVar.zzt(strZzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, strZzc, "error", zzd("error", e));
            return false;
        }
    }
}
