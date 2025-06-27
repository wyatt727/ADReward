package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zzcm;
import com.google.android.gms.ads.internal.util.zzv;
import com.google.android.gms.ads.internal.util.zzw;
import com.google.android.gms.ads.internal.util.zzy;
import com.google.android.gms.ads.internal.util.zzz;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzbas;
import com.google.android.gms.internal.ads.zzbcf;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbqj;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcbh;
import com.google.android.gms.internal.ads.zzcbx;
import com.google.android.gms.internal.ads.zzcce;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzegb;
import com.google.android.gms.internal.ads.zzegc;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzu {
    private static final zzu zza = new zzu();
    private final zzcad zzA;
    private final zzcm zzB;
    private final zzcer zzC;
    private final zzcce zzD;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzn zzc;
    private final com.google.android.gms.ads.internal.util.zzt zzd;
    private final zzcgz zze;
    private final zzab zzf;
    private final zzbas zzg;
    private final zzcbh zzh;
    private final zzac zzi;
    private final zzbcf zzj;
    private final Clock zzk;
    private final zzf zzl;
    private final zzbef zzm;
    private final zzay zzn;
    private final zzbxl zzo;
    private final zzbnw zzp;
    private final zzcbx zzq;
    private final zzbph zzr;
    private final zzx zzs;
    private final zzbx zzt;
    private final com.google.android.gms.ads.internal.overlay.zzab zzu;
    private final com.google.android.gms.ads.internal.overlay.zzac zzv;
    private final zzbqj zzw;
    private final zzby zzx;
    private final zzegc zzy;
    private final zzbcu zzz;

    protected zzu() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzn zznVar = new com.google.android.gms.ads.internal.overlay.zzn();
        com.google.android.gms.ads.internal.util.zzt zztVar = new com.google.android.gms.ads.internal.util.zzt();
        zzcgz zzcgzVar = new zzcgz();
        int i = Build.VERSION.SDK_INT;
        zzab zzzVar = i >= 30 ? new zzz() : i >= 28 ? new zzy() : i >= 26 ? new zzw() : i >= 24 ? new zzv() : new com.google.android.gms.ads.internal.util.zzu();
        zzbas zzbasVar = new zzbas();
        zzcbh zzcbhVar = new zzcbh();
        zzac zzacVar = new zzac();
        zzbcf zzbcfVar = new zzbcf();
        Clock defaultClock = DefaultClock.getInstance();
        zzf zzfVar = new zzf();
        zzbef zzbefVar = new zzbef();
        zzay zzayVar = new zzay();
        zzbxl zzbxlVar = new zzbxl();
        zzbnw zzbnwVar = new zzbnw();
        zzcbx zzcbxVar = new zzcbx();
        zzbph zzbphVar = new zzbph();
        zzx zzxVar = new zzx();
        zzbx zzbxVar = new zzbx();
        com.google.android.gms.ads.internal.overlay.zzab zzabVar = new com.google.android.gms.ads.internal.overlay.zzab();
        com.google.android.gms.ads.internal.overlay.zzac zzacVar2 = new com.google.android.gms.ads.internal.overlay.zzac();
        zzbqj zzbqjVar = new zzbqj();
        zzby zzbyVar = new zzby();
        zzegb zzegbVar = new zzegb();
        zzbcu zzbcuVar = new zzbcu();
        zzcad zzcadVar = new zzcad();
        zzcm zzcmVar = new zzcm();
        zzcer zzcerVar = new zzcer();
        zzcce zzcceVar = new zzcce();
        this.zzb = zzaVar;
        this.zzc = zznVar;
        this.zzd = zztVar;
        this.zze = zzcgzVar;
        this.zzf = zzzVar;
        this.zzg = zzbasVar;
        this.zzh = zzcbhVar;
        this.zzi = zzacVar;
        this.zzj = zzbcfVar;
        this.zzk = defaultClock;
        this.zzl = zzfVar;
        this.zzm = zzbefVar;
        this.zzn = zzayVar;
        this.zzo = zzbxlVar;
        this.zzp = zzbnwVar;
        this.zzq = zzcbxVar;
        this.zzr = zzbphVar;
        this.zzt = zzbxVar;
        this.zzs = zzxVar;
        this.zzu = zzabVar;
        this.zzv = zzacVar2;
        this.zzw = zzbqjVar;
        this.zzx = zzbyVar;
        this.zzy = zzegbVar;
        this.zzz = zzbcuVar;
        this.zzA = zzcadVar;
        this.zzB = zzcmVar;
        this.zzC = zzcerVar;
        this.zzD = zzcceVar;
    }

    public static zzegc zzA() {
        return zza.zzy;
    }

    public static Clock zzB() {
        return zza.zzk;
    }

    public static zzf zza() {
        return zza.zzl;
    }

    public static zzbas zzb() {
        return zza.zzg;
    }

    public static zzbcf zzc() {
        return zza.zzj;
    }

    public static zzbcu zzd() {
        return zza.zzz;
    }

    public static zzbef zze() {
        return zza.zzm;
    }

    public static zzbph zzf() {
        return zza.zzr;
    }

    public static zzbqj zzg() {
        return zza.zzw;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzh() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzn zzi() {
        return zza.zzc;
    }

    public static zzx zzj() {
        return zza.zzs;
    }

    public static com.google.android.gms.ads.internal.overlay.zzab zzk() {
        return zza.zzu;
    }

    public static com.google.android.gms.ads.internal.overlay.zzac zzl() {
        return zza.zzv;
    }

    public static zzbxl zzm() {
        return zza.zzo;
    }

    public static zzcad zzn() {
        return zza.zzA;
    }

    public static zzcbh zzo() {
        return zza.zzh;
    }

    public static com.google.android.gms.ads.internal.util.zzt zzp() {
        return zza.zzd;
    }

    public static zzab zzq() {
        return zza.zzf;
    }

    public static zzac zzr() {
        return zza.zzi;
    }

    public static zzay zzs() {
        return zza.zzn;
    }

    public static zzbx zzt() {
        return zza.zzt;
    }

    public static zzby zzu() {
        return zza.zzx;
    }

    public static zzcm zzv() {
        return zza.zzB;
    }

    public static zzcbx zzw() {
        return zza.zzq;
    }

    public static zzcce zzx() {
        return zza.zzD;
    }

    public static zzcer zzy() {
        return zza.zzC;
    }

    public static zzcgz zzz() {
        return zza.zze;
    }
}
