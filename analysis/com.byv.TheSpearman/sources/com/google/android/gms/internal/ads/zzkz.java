package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.MediaPeriodQueue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzkz implements Handler.Callback, zzve, zzze, zzlw, zziw, zzlz {
    private boolean zzA;
    private boolean zzC;
    private boolean zzF;
    private int zzG;
    private zzky zzH;
    private long zzI;
    private int zzJ;
    private boolean zzK;
    private zziz zzL;
    private final zzjk zzN;
    private final zziu zzO;
    private final zzmf[] zza;
    private final Set zzb;
    private final zzmh[] zzc;
    private final zzzf zzd;
    private final zzzg zze;
    private final zzlc zzf;
    private final zzzn zzg;
    private final zzev zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzcw zzk;
    private final zzcu zzl;
    private final long zzm;
    private final zzix zzn;
    private final ArrayList zzo;
    private final zzel zzp;
    private final zzll zzq;
    private final zzlx zzr;
    private final long zzs;
    private final zzpb zzt;
    private zzmj zzu;
    private zzly zzv;
    private zzkx zzw;
    private boolean zzx;
    private boolean zzz;
    private int zzD = 0;
    private boolean zzE = false;
    private boolean zzy = false;
    private long zzM = -9223372036854775807L;
    private long zzB = -9223372036854775807L;

    public zzkz(zzmf[] zzmfVarArr, zzzf zzzfVar, zzzg zzzgVar, zzlc zzlcVar, zzzn zzznVar, int i, boolean z, zzmp zzmpVar, zzmj zzmjVar, zziu zziuVar, long j, boolean z2, Looper looper, zzel zzelVar, zzjk zzjkVar, zzpb zzpbVar, Looper looper2) {
        this.zzN = zzjkVar;
        this.zza = zzmfVarArr;
        this.zzd = zzzfVar;
        this.zze = zzzgVar;
        this.zzf = zzlcVar;
        this.zzg = zzznVar;
        int i2 = 0;
        this.zzu = zzmjVar;
        this.zzO = zziuVar;
        this.zzs = j;
        this.zzp = zzelVar;
        this.zzt = zzpbVar;
        this.zzm = zzlcVar.zza(zzpbVar);
        zzlcVar.zzf(zzpbVar);
        zzly zzlyVarZzg = zzly.zzg(zzzgVar);
        this.zzv = zzlyVarZzg;
        this.zzw = new zzkx(zzlyVarZzg);
        int length = zzmfVarArr.length;
        this.zzc = new zzmh[2];
        zzmg zzmgVarZze = zzzfVar.zze();
        while (true) {
            int length2 = zzmfVarArr.length;
            if (i2 >= 2) {
                this.zzn = new zzix(this, zzelVar);
                this.zzo = new ArrayList();
                this.zzb = Collections.newSetFromMap(new IdentityHashMap());
                this.zzk = new zzcw();
                this.zzl = new zzcu();
                zzzfVar.zzs(this, zzznVar);
                this.zzK = true;
                zzev zzevVarZzb = zzelVar.zzb(looper, null);
                this.zzq = new zzll(zzmpVar, zzevVarZzb, new zzkr(this));
                this.zzr = new zzlx(this, zzmpVar, zzevVarZzb, zzpbVar);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.zzi = handlerThread;
                handlerThread.start();
                Looper looper3 = handlerThread.getLooper();
                this.zzj = looper3;
                this.zzh = zzelVar.zzb(looper3, this);
                return;
            }
            zzmfVarArr[i2].zzu(i2, zzpbVar, zzelVar);
            this.zzc[i2] = zzmfVarArr[i2].zzl();
            this.zzc[i2].zzL(zzmgVarZze);
            i2++;
        }
    }

    private final void zzA(zzmf zzmfVar) throws zziz {
        if (zzaf(zzmfVar)) {
            this.zzn.zzd(zzmfVar);
            zzam(zzmfVar);
            zzmfVar.zzq();
            this.zzG--;
        }
    }

    private final void zzB() throws zziz {
        int length = this.zza.length;
        zzC(new boolean[2], this.zzq.zzf().zzf());
    }

    private final void zzC(boolean[] zArr, long j) throws zziz {
        zzli zzliVarZzf = this.zzq.zzf();
        zzzg zzzgVarZzi = zzliVarZzf.zzi();
        int i = 0;
        while (true) {
            int length = this.zza.length;
            if (i >= 2) {
                break;
            }
            if (!zzzgVarZzi.zzb(i) && this.zzb.remove(this.zza[i])) {
                this.zza[i].zzI();
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = this.zza.length;
            if (i2 >= 2) {
                zzliVarZzf.zzg = true;
                return;
            }
            if (zzzgVarZzi.zzb(i2)) {
                boolean z = zArr[i2];
                zzmf zzmfVar = this.zza[i2];
                if (!zzaf(zzmfVar)) {
                    zzll zzllVar = this.zzq;
                    zzli zzliVarZzf2 = zzllVar.zzf();
                    boolean z2 = zzliVarZzf2 == zzllVar.zze();
                    zzzg zzzgVarZzi2 = zzliVarZzf2.zzi();
                    zzmi zzmiVar = zzzgVarZzi2.zzb[i2];
                    zzam[] zzamVarArrZzak = zzak(zzzgVarZzi2.zzc[i2]);
                    boolean z3 = zzai() && this.zzv.zze == 3;
                    boolean z4 = !z && z3;
                    this.zzG++;
                    this.zzb.add(zzmfVar);
                    zzmfVar.zzr(zzmiVar, zzamVarArrZzak, zzliVarZzf2.zzc[i2], this.zzI, z4, z2, j, zzliVarZzf2.zze(), zzliVarZzf2.zzf.zza);
                    zzmfVar.zzt(11, new zzks(this));
                    this.zzn.zze(zzmfVar);
                    if (z3 && z2) {
                        zzmfVar.zzO();
                    }
                }
            }
            i2++;
        }
    }

    private final void zzD(IOException iOException, int i) {
        zzll zzllVar = this.zzq;
        zziz zzizVarZzc = zziz.zzc(iOException, i);
        zzli zzliVarZze = zzllVar.zze();
        if (zzliVarZze != null) {
            zzizVarZzc = zzizVarZzc.zza(zzliVarZze.zzf.zza);
        }
        zzfe.zzd("ExoPlayerImplInternal", "Playback error", zzizVarZzc);
        zzW(false, false);
        this.zzv = this.zzv.zzd(zzizVarZzc);
    }

    private final void zzE(boolean z) {
        zzli zzliVarZzd = this.zzq.zzd();
        zzvh zzvhVar = zzliVarZzd == null ? this.zzv.zzb : zzliVarZzd.zzf.zza;
        boolean z2 = !this.zzv.zzk.equals(zzvhVar);
        if (z2) {
            this.zzv = this.zzv.zza(zzvhVar);
        }
        zzly zzlyVar = this.zzv;
        zzlyVar.zzp = zzliVarZzd == null ? zzlyVar.zzr : zzliVarZzd.zzc();
        this.zzv.zzq = zzt();
        if ((z2 || z) && zzliVarZzd != null && zzliVarZzd.zzd) {
            zzZ(zzliVarZzd.zzf.zza, zzliVarZzd.zzh(), zzliVarZzd.zzi());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0385: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r19 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:192:0x0384 */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0260 A[PHI: r23
      0x0260: PHI (r23v15 long) = (r23v7 long), (r23v8 long) binds: [B:124:0x025e, B:128:0x0269] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02bf A[Catch: all -> 0x0383, TryCatch #0 {all -> 0x0383, blocks: (B:148:0x02b9, B:150:0x02bf, B:153:0x02c9, B:155:0x02d4, B:157:0x02dc, B:159:0x02e6, B:160:0x02f3, B:161:0x02f8), top: B:225:0x0252 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0411  */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82, types: [int] */
    /* JADX WARN: Type inference failed for: r1v98 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzF(com.google.android.gms.internal.ads.zzcx r29, boolean r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkz.zzF(com.google.android.gms.internal.ads.zzcx, boolean):void");
    }

    private final void zzG(zzcg zzcgVar, boolean z) throws zziz {
        zzH(zzcgVar, zzcgVar.zzc, true, z);
    }

    private final void zzH(zzcg zzcgVar, float f, boolean z, boolean z2) throws zziz {
        int i;
        zzkz zzkzVar = this;
        if (z) {
            if (z2) {
                zzkzVar.zzw.zza(1);
            }
            zzly zzlyVar = zzkzVar.zzv;
            zzcx zzcxVar = zzlyVar.zza;
            zzvh zzvhVar = zzlyVar.zzb;
            long j = zzlyVar.zzc;
            long j2 = zzlyVar.zzd;
            int i2 = zzlyVar.zze;
            zziz zzizVar = zzlyVar.zzf;
            boolean z3 = zzlyVar.zzg;
            zzxk zzxkVar = zzlyVar.zzh;
            zzzg zzzgVar = zzlyVar.zzi;
            List list = zzlyVar.zzj;
            zzvh zzvhVar2 = zzlyVar.zzk;
            boolean z4 = zzlyVar.zzl;
            int i3 = zzlyVar.zzm;
            long j3 = zzlyVar.zzp;
            long j4 = zzlyVar.zzq;
            long j5 = zzlyVar.zzr;
            long j6 = zzlyVar.zzs;
            boolean z5 = zzlyVar.zzo;
            zzkzVar = this;
            zzkzVar.zzv = new zzly(zzcxVar, zzvhVar, j, j2, i2, zzizVar, z3, zzxkVar, zzzgVar, list, zzvhVar2, z4, i3, zzcgVar, j3, j4, j5, j6, false);
        }
        float f2 = zzcgVar.zzc;
        zzli zzliVarZze = zzkzVar.zzq.zze();
        while (true) {
            i = 0;
            if (zzliVarZze == null) {
                break;
            }
            zzyz[] zzyzVarArr = zzliVarZze.zzi().zzc;
            int length = zzyzVarArr.length;
            while (i < length) {
                zzyz zzyzVar = zzyzVarArr[i];
                i++;
            }
            zzliVarZze = zzliVarZze.zzg();
        }
        zzmf[] zzmfVarArr = zzkzVar.zza;
        int length2 = zzmfVarArr.length;
        while (i < 2) {
            zzmf zzmfVar = zzmfVarArr[i];
            if (zzmfVar != null) {
                zzmfVar.zzM(f, zzcgVar.zzc);
            }
            i++;
        }
    }

    private final void zzI() {
        long jZze;
        long jZze2;
        boolean zZzg = false;
        if (zzae()) {
            zzli zzliVarZzd = this.zzq.zzd();
            long jZzu = zzu(zzliVarZzd.zzd());
            if (zzliVarZzd == this.zzq.zze()) {
                jZze = this.zzI;
                jZze2 = zzliVarZzd.zze();
            } else {
                jZze = this.zzI - zzliVarZzd.zze();
                jZze2 = zzliVarZzd.zzf.zzb;
            }
            long j = jZze - jZze2;
            boolean zZzg2 = this.zzf.zzg(this.zzt, this.zzv.zza, zzliVarZzd.zzf.zza, j, jZzu, this.zzn.zzc().zzc);
            if (zZzg2 || jZzu >= 500000 || this.zzm <= 0) {
                zZzg = zZzg2;
            } else {
                this.zzq.zze().zza.zzj(this.zzv.zzr, false);
                zZzg = this.zzf.zzg(this.zzt, this.zzv.zza, zzliVarZzd.zzf.zza, j, jZzu, this.zzn.zzc().zzc);
            }
        }
        this.zzC = zZzg;
        if (zZzg) {
            this.zzq.zzd().zzk(this.zzI, this.zzn.zzc().zzc, this.zzB);
        }
        zzY();
    }

    private final void zzJ() {
        this.zzw.zzc(this.zzv);
        if (this.zzw.zzg) {
            zzjk zzjkVar = this.zzN;
            zzjkVar.zza.zzT(this.zzw);
            this.zzw = new zzkx(this.zzv);
        }
    }

    private final void zzK() throws zziz {
        int i;
        float f = this.zzn.zzc().zzc;
        zzll zzllVar = this.zzq;
        zzli zzliVarZze = zzllVar.zze();
        zzli zzliVarZzf = zzllVar.zzf();
        zzzg zzzgVar = null;
        boolean z = true;
        while (zzliVarZze != null && zzliVarZze.zzd) {
            zzzg zzzgVarZzj = zzliVarZze.zzj(f, this.zzv.zza);
            zzzg zzzgVar2 = zzliVarZze == this.zzq.zze() ? zzzgVarZzj : zzzgVar;
            zzzg zzzgVarZzi = zzliVarZze.zzi();
            boolean z2 = false;
            if (zzzgVarZzi != null) {
                if (zzzgVarZzi.zzc.length == zzzgVarZzj.zzc.length) {
                    for (int i2 = 0; i2 < zzzgVarZzj.zzc.length; i2++) {
                        if (zzzgVarZzj.zza(zzzgVarZzi, i2)) {
                        }
                    }
                    if (zzliVarZze != zzliVarZzf) {
                        z2 = true;
                    }
                    z &= z2;
                    zzliVarZze = zzliVarZze.zzg();
                    zzzgVar = zzzgVar2;
                }
            }
            if (z) {
                zzll zzllVar2 = this.zzq;
                zzli zzliVarZze2 = zzllVar2.zze();
                boolean zZzn = zzllVar2.zzn(zzliVarZze2);
                int length = this.zza.length;
                boolean[] zArr = new boolean[2];
                Objects.requireNonNull(zzzgVar2);
                long jZzb = zzliVarZze2.zzb(zzzgVar2, this.zzv.zzr, zZzn, zArr);
                zzly zzlyVar = this.zzv;
                boolean z3 = (zzlyVar.zze == 4 || jZzb == zzlyVar.zzr) ? false : true;
                zzly zzlyVar2 = this.zzv;
                i = 2;
                this.zzv = zzz(zzlyVar2.zzb, jZzb, zzlyVar2.zzc, zzlyVar2.zzd, z3, 5);
                if (z3) {
                    zzO(jZzb);
                }
                int length2 = this.zza.length;
                boolean[] zArr2 = new boolean[2];
                int i3 = 0;
                while (true) {
                    zzmf[] zzmfVarArr = this.zza;
                    int length3 = zzmfVarArr.length;
                    if (i3 >= 2) {
                        break;
                    }
                    zzmf zzmfVar = zzmfVarArr[i3];
                    boolean zZzaf = zzaf(zzmfVar);
                    zArr2[i3] = zZzaf;
                    zzwy zzwyVar = zzliVarZze2.zzc[i3];
                    if (zZzaf) {
                        if (zzwyVar != zzmfVar.zzo()) {
                            zzA(zzmfVar);
                        } else if (zArr[i3]) {
                            zzmfVar.zzJ(this.zzI);
                        }
                    }
                    i3++;
                }
                zzC(zArr2, this.zzI);
            } else {
                i = 2;
                this.zzq.zzn(zzliVarZze);
                if (zzliVarZze.zzd) {
                    zzliVarZze.zza(zzzgVarZzj, Math.max(zzliVarZze.zzf.zzb, this.zzI - zzliVarZze.zze()), false);
                }
            }
            zzE(true);
            if (this.zzv.zze != 4) {
                zzI();
                zzaa();
                this.zzh.zzi(i);
                return;
            }
            return;
        }
    }

    private final void zzL() throws zziz {
        zzK();
        zzR(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3 A[PHI: r0
      0x00f3: PHI (r0v11 com.google.android.gms.internal.ads.zzcx) = 
      (r0v10 com.google.android.gms.internal.ads.zzcx)
      (r0v10 com.google.android.gms.internal.ads.zzcx)
      (r0v15 com.google.android.gms.internal.ads.zzcx)
      (r0v15 com.google.android.gms.internal.ads.zzcx)
     binds: [B:39:0x00b7, B:41:0x00bb, B:43:0x00cc, B:45:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzM(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkz.zzM(boolean, boolean, boolean, boolean):void");
    }

    private final void zzN() {
        zzli zzliVarZze = this.zzq.zze();
        boolean z = false;
        if (zzliVarZze != null && zzliVarZze.zzf.zzh && this.zzy) {
            z = true;
        }
        this.zzz = z;
    }

    private final void zzO(long j) throws zziz {
        zzli zzliVarZze = this.zzq.zze();
        long jZze = j + (zzliVarZze == null ? MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : zzliVarZze.zze());
        this.zzI = jZze;
        this.zzn.zzf(jZze);
        zzmf[] zzmfVarArr = this.zza;
        int length = zzmfVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzmf zzmfVar = zzmfVarArr[i];
            if (zzaf(zzmfVar)) {
                zzmfVar.zzJ(this.zzI);
            }
        }
        for (zzli zzliVarZze2 = this.zzq.zze(); zzliVarZze2 != null; zzliVarZze2 = zzliVarZze2.zzg()) {
            for (zzyz zzyzVar : zzliVarZze2.zzi().zzc) {
            }
        }
    }

    private final void zzP(zzcx zzcxVar, zzcx zzcxVar2) {
        if (zzcxVar.zzo() && zzcxVar2.zzo()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
            return;
        }
        zzkw zzkwVar = (zzkw) this.zzo.get(size);
        Object obj = zzkwVar.zzb;
        zzmb zzmbVar = zzkwVar.zza;
        int i = zzfx.zza;
        zzmb zzmbVar2 = zzkwVar.zza;
        throw null;
    }

    private final void zzQ(long j, long j2) {
        this.zzh.zzj(2, j + j2);
    }

    private final void zzR(boolean z) throws zziz {
        zzvh zzvhVar = this.zzq.zze().zzf.zza;
        long jZzw = zzw(zzvhVar, this.zzv.zzr, true, false);
        if (jZzw != this.zzv.zzr) {
            zzly zzlyVar = this.zzv;
            this.zzv = zzz(zzvhVar, jZzw, zzlyVar.zzc, zzlyVar.zzd, z, 5);
        }
    }

    private final void zzS(zzcg zzcgVar) {
        this.zzh.zzf(16);
        this.zzn.zzg(zzcgVar);
    }

    private final void zzT(boolean z, int i, boolean z2, int i2) throws zziz {
        this.zzw.zza(z2 ? 1 : 0);
        this.zzw.zzb(i2);
        this.zzv = this.zzv.zzc(z, i);
        zzac(false, false);
        for (zzli zzliVarZze = this.zzq.zze(); zzliVarZze != null; zzliVarZze = zzliVarZze.zzg()) {
            for (zzyz zzyzVar : zzliVarZze.zzi().zzc) {
            }
        }
        if (!zzai()) {
            zzX();
            zzaa();
            return;
        }
        int i3 = this.zzv.zze;
        if (i3 != 3) {
            if (i3 == 2) {
                this.zzh.zzi(2);
            }
        } else {
            zzac(false, false);
            this.zzn.zzh();
            zzV();
            this.zzh.zzi(2);
        }
    }

    private final void zzU(int i) {
        zzly zzlyVar = this.zzv;
        if (zzlyVar.zze != i) {
            if (i != 2) {
                this.zzM = -9223372036854775807L;
            }
            this.zzv = zzlyVar.zze(i);
        }
    }

    private final void zzV() throws zziz {
        zzli zzliVarZze = this.zzq.zze();
        if (zzliVarZze == null) {
            return;
        }
        zzzg zzzgVarZzi = zzliVarZze.zzi();
        int i = 0;
        while (true) {
            int length = this.zza.length;
            if (i >= 2) {
                return;
            }
            if (zzzgVarZzi.zzb(i) && this.zza[i].zzcU() == 1) {
                this.zza[i].zzO();
            }
            i++;
        }
    }

    private final void zzW(boolean z, boolean z2) {
        zzM(z || !this.zzF, false, true, false);
        this.zzw.zza(z2 ? 1 : 0);
        this.zzf.zzd(this.zzt);
        zzU(1);
    }

    private final void zzX() throws zziz {
        this.zzn.zzi();
        zzmf[] zzmfVarArr = this.zza;
        int length = zzmfVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzmf zzmfVar = zzmfVarArr[i];
            if (zzaf(zzmfVar)) {
                zzam(zzmfVar);
            }
        }
    }

    private final void zzY() {
        zzli zzliVarZzd = this.zzq.zzd();
        boolean z = this.zzC || (zzliVarZzd != null && zzliVarZzd.zza.zzp());
        zzly zzlyVar = this.zzv;
        if (z != zzlyVar.zzg) {
            zzcx zzcxVar = zzlyVar.zza;
            zzvh zzvhVar = zzlyVar.zzb;
            long j = zzlyVar.zzc;
            long j2 = zzlyVar.zzd;
            int i = zzlyVar.zze;
            zziz zzizVar = zzlyVar.zzf;
            zzxk zzxkVar = zzlyVar.zzh;
            zzzg zzzgVar = zzlyVar.zzi;
            List list = zzlyVar.zzj;
            zzvh zzvhVar2 = zzlyVar.zzk;
            boolean z2 = zzlyVar.zzl;
            int i2 = zzlyVar.zzm;
            zzcg zzcgVar = zzlyVar.zzn;
            long j3 = zzlyVar.zzp;
            long j4 = zzlyVar.zzq;
            long j5 = zzlyVar.zzr;
            long j6 = zzlyVar.zzs;
            boolean z3 = zzlyVar.zzo;
            this.zzv = new zzly(zzcxVar, zzvhVar, j, j2, i, zzizVar, z, zzxkVar, zzzgVar, list, zzvhVar2, z2, i2, zzcgVar, j3, j4, j5, j6, false);
        }
    }

    private final void zzZ(zzvh zzvhVar, zzxk zzxkVar, zzzg zzzgVar) {
        zzcx zzcxVar = this.zzv.zza;
        zzyz[] zzyzVarArr = zzzgVar.zzc;
        this.zzf.zze(this.zzt, zzcxVar, zzvhVar, this.zza, zzxkVar, zzyzVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ad, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzaa() throws com.google.android.gms.internal.ads.zziz {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkz.zzaa():void");
    }

    private final void zzab(zzcx zzcxVar, zzvh zzvhVar, zzcx zzcxVar2, zzvh zzvhVar2, long j, boolean z) throws zziz {
        if (!zzaj(zzcxVar, zzvhVar)) {
            zzcg zzcgVar = zzvhVar.zzb() ? zzcg.zza : this.zzv.zzn;
            if (this.zzn.zzc().equals(zzcgVar)) {
                return;
            }
            zzS(zzcgVar);
            zzH(this.zzv.zzn, zzcgVar.zzc, false, false);
            return;
        }
        zzcxVar.zze(zzcxVar.zzn(zzvhVar.zza, this.zzl).zzd, this.zzk, 0L);
        zziu zziuVar = this.zzO;
        zzbf zzbfVar = this.zzk.zzl;
        int i = zzfx.zza;
        zziuVar.zzd(zzbfVar);
        if (j != -9223372036854775807L) {
            this.zzO.zze(zzs(zzcxVar, zzvhVar.zza, j));
            return;
        }
        if (!zzfx.zzG(!zzcxVar2.zzo() ? zzcxVar2.zze(zzcxVar2.zzn(zzvhVar2.zza, this.zzl).zzd, this.zzk, 0L).zzc : null, this.zzk.zzc) || z) {
            this.zzO.zze(-9223372036854775807L);
        }
    }

    private final void zzac(boolean z, boolean z2) {
        this.zzA = z;
        this.zzB = z2 ? -9223372036854775807L : SystemClock.elapsedRealtime();
    }

    private final synchronized void zzad(zzfxh zzfxhVar, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!Boolean.valueOf(((zzkp) zzfxhVar).zza.zzx).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzae() {
        zzli zzliVarZzd = this.zzq.zzd();
        return (zzliVarZzd == null || zzliVarZzd.zzd() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean zzaf(zzmf zzmfVar) {
        return zzmfVar.zzcU() != 0;
    }

    private final boolean zzag() {
        zzli zzliVarZze = this.zzq.zze();
        long j = zzliVarZze.zzf.zze;
        if (!zzliVarZze.zzd) {
            return false;
        }
        if (j == -9223372036854775807L || this.zzv.zzr < j) {
            return true;
        }
        return !zzai();
    }

    private static boolean zzah(zzly zzlyVar, zzcu zzcuVar) {
        zzvh zzvhVar = zzlyVar.zzb;
        zzcx zzcxVar = zzlyVar.zza;
        return zzcxVar.zzo() || zzcxVar.zzn(zzvhVar.zza, zzcuVar).zzg;
    }

    private final boolean zzai() {
        zzly zzlyVar = this.zzv;
        return zzlyVar.zzl && zzlyVar.zzm == 0;
    }

    private final boolean zzaj(zzcx zzcxVar, zzvh zzvhVar) {
        if (!zzvhVar.zzb() && !zzcxVar.zzo()) {
            zzcxVar.zze(zzcxVar.zzn(zzvhVar.zza, this.zzl).zzd, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzcw zzcwVar = this.zzk;
                if (zzcwVar.zzj && zzcwVar.zzg != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzam[] zzak(zzyz zzyzVar) {
        int iZzc = zzyzVar != null ? zzyzVar.zzc() : 0;
        zzam[] zzamVarArr = new zzam[iZzc];
        for (int i = 0; i < iZzc; i++) {
            zzamVarArr[i] = zzyzVar.zzd(i);
        }
        return zzamVarArr;
    }

    private static final void zzal(zzmb zzmbVar) throws zziz {
        zzmbVar.zzj();
        try {
            zzmbVar.zzc().zzt(zzmbVar.zza(), zzmbVar.zzg());
        } finally {
            zzmbVar.zzh(true);
        }
    }

    private static final void zzam(zzmf zzmfVar) {
        if (zzmfVar.zzcU() == 2) {
            zzmfVar.zzP();
        }
    }

    private static final void zzan(zzmf zzmfVar, long j) {
        zzmfVar.zzK();
        if (zzmfVar instanceof zzxo) {
            throw null;
        }
    }

    public static /* synthetic */ zzli zzd(zzkz zzkzVar, zzlj zzljVar, long j) {
        zzlc zzlcVar = zzkzVar.zzf;
        zzzf zzzfVar = zzkzVar.zzd;
        zzzo zzzoVarZzi = zzlcVar.zzi();
        zzzg zzzgVar = zzkzVar.zze;
        return new zzli(zzkzVar.zzc, j, zzzfVar, zzzoVarZzi, zzkzVar.zzr, zzljVar, zzzgVar);
    }

    static Object zzf(zzcw zzcwVar, zzcu zzcuVar, int i, boolean z, Object obj, zzcx zzcxVar, zzcx zzcxVar2) {
        int iZza = zzcxVar.zza(obj);
        int iZzb = zzcxVar.zzb();
        int i2 = 0;
        int iZzi = iZza;
        int iZza2 = -1;
        while (true) {
            if (i2 >= iZzb || iZza2 != -1) {
                break;
            }
            iZzi = zzcxVar.zzi(iZzi, zzcuVar, zzcwVar, i, z);
            if (iZzi == -1) {
                iZza2 = -1;
                break;
            }
            iZza2 = zzcxVar2.zza(zzcxVar.zzf(iZzi));
            i2++;
        }
        if (iZza2 == -1) {
            return null;
        }
        return zzcxVar2.zzf(iZza2);
    }

    static final /* synthetic */ void zzr(zzmb zzmbVar) {
        try {
            zzal(zzmbVar);
        } catch (zziz e) {
            zzfe.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final long zzs(zzcx zzcxVar, Object obj, long j) {
        zzcxVar.zze(zzcxVar.zzn(obj, this.zzl).zzd, this.zzk, 0L);
        zzcw zzcwVar = this.zzk;
        if (zzcwVar.zzg != -9223372036854775807L && zzcwVar.zzb()) {
            zzcw zzcwVar2 = this.zzk;
            if (zzcwVar2.zzj) {
                long j2 = zzcwVar2.zzh;
                return zzfx.zzr((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - this.zzk.zzg) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzt() {
        return zzu(this.zzv.zzp);
    }

    private final long zzu(long j) {
        zzli zzliVarZzd = this.zzq.zzd();
        if (zzliVarZzd == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzI - zzliVarZzd.zze()));
    }

    private final long zzv(zzvh zzvhVar, long j, boolean z) throws zziz {
        zzll zzllVar = this.zzq;
        return zzw(zzvhVar, j, zzllVar.zze() != zzllVar.zzf(), z);
    }

    private final long zzw(zzvh zzvhVar, long j, boolean z, boolean z2) throws zziz {
        zzX();
        zzac(false, true);
        if (z2 || this.zzv.zze == 3) {
            zzU(2);
        }
        zzli zzliVarZze = this.zzq.zze();
        zzli zzliVarZzg = zzliVarZze;
        while (zzliVarZzg != null && !zzvhVar.equals(zzliVarZzg.zzf.zza)) {
            zzliVarZzg = zzliVarZzg.zzg();
        }
        if (z || zzliVarZze != zzliVarZzg || (zzliVarZzg != null && zzliVarZzg.zze() + j < 0)) {
            zzmf[] zzmfVarArr = this.zza;
            int length = zzmfVarArr.length;
            for (int i = 0; i < 2; i++) {
                zzA(zzmfVarArr[i]);
            }
            if (zzliVarZzg != null) {
                while (this.zzq.zze() != zzliVarZzg) {
                    this.zzq.zza();
                }
                this.zzq.zzn(zzliVarZzg);
                zzliVarZzg.zzp(MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);
                zzB();
            }
        }
        if (zzliVarZzg != null) {
            this.zzq.zzn(zzliVarZzg);
            if (!zzliVarZzg.zzd) {
                zzliVarZzg.zzf = zzliVarZzg.zzf.zzb(j);
            } else if (zzliVarZzg.zze) {
                j = zzliVarZzg.zza.zze(j);
                zzliVarZzg.zza.zzj(j - this.zzm, false);
            }
            zzO(j);
            zzI();
        } else {
            this.zzq.zzj();
            zzO(j);
        }
        zzE(false);
        this.zzh.zzi(2);
        return j;
    }

    private final Pair zzx(zzcx zzcxVar) {
        long j = 0;
        if (zzcxVar.zzo()) {
            return Pair.create(zzly.zzh(), 0L);
        }
        Pair pairZzl = zzcxVar.zzl(this.zzk, this.zzl, zzcxVar.zzg(this.zzE), -9223372036854775807L);
        zzvh zzvhVarZzi = this.zzq.zzi(zzcxVar, pairZzl.first, 0L);
        long jLongValue = ((Long) pairZzl.second).longValue();
        if (zzvhVarZzi.zzb()) {
            zzcxVar.zzn(zzvhVarZzi.zza, this.zzl);
            if (zzvhVarZzi.zzc == this.zzl.zze(zzvhVarZzi.zzb)) {
                this.zzl.zzj();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(zzvhVarZzi, Long.valueOf(j));
    }

    private static Pair zzy(zzcx zzcxVar, zzky zzkyVar, boolean z, int i, boolean z2, zzcw zzcwVar, zzcu zzcuVar) {
        Pair pairZzl;
        zzcx zzcxVar2 = zzkyVar.zza;
        if (zzcxVar.zzo()) {
            return null;
        }
        zzcx zzcxVar3 = true == zzcxVar2.zzo() ? zzcxVar : zzcxVar2;
        try {
            pairZzl = zzcxVar3.zzl(zzcwVar, zzcuVar, zzkyVar.zzb, zzkyVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzcxVar.equals(zzcxVar3)) {
            return pairZzl;
        }
        if (zzcxVar.zza(pairZzl.first) != -1) {
            return (zzcxVar3.zzn(pairZzl.first, zzcuVar).zzg && zzcxVar3.zze(zzcuVar.zzd, zzcwVar, 0L).zzp == zzcxVar3.zza(pairZzl.first)) ? zzcxVar.zzl(zzcwVar, zzcuVar, zzcxVar.zzn(pairZzl.first, zzcuVar).zzd, zzkyVar.zzc) : pairZzl;
        }
        Object objZzf = zzf(zzcwVar, zzcuVar, i, z2, pairZzl.first, zzcxVar3, zzcxVar);
        if (objZzf != null) {
            return zzcxVar.zzl(zzcwVar, zzcuVar, zzcxVar.zzn(objZzf, zzcuVar).zzd, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzly zzz(com.google.android.gms.internal.ads.zzvh r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkz.zzz(com.google.android.gms.internal.ads.zzvh, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzly");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06ef A[Catch: RuntimeException -> 0x09d4, IOException -> 0x09fe, zzui -> 0x0a06, zzgw -> 0x0a0e, zzcc -> 0x0a16, zzse -> 0x0a2d, zziz -> 0x0a37, TryCatch #10 {zzcc -> 0x0a16, zzgw -> 0x0a0e, zziz -> 0x0a37, zzse -> 0x0a2d, zzui -> 0x0a06, IOException -> 0x09fe, RuntimeException -> 0x09d4, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0048, B:18:0x0056, B:19:0x005e, B:20:0x0069, B:21:0x007d, B:22:0x0095, B:23:0x00b1, B:25:0x00c0, B:26:0x00c4, B:27:0x00d5, B:29:0x00e4, B:30:0x0100, B:31:0x0113, B:32:0x011c, B:34:0x012e, B:35:0x013a, B:36:0x014a, B:38:0x0156, B:41:0x0161, B:42:0x0168, B:43:0x0175, B:47:0x017c, B:49:0x0184, B:51:0x0188, B:53:0x018e, B:55:0x0196, B:57:0x019e, B:58:0x01a1, B:60:0x01a6, B:67:0x01b3, B:68:0x01b4, B:72:0x01bb, B:74:0x01c9, B:75:0x01cc, B:76:0x01d1, B:78:0x01e1, B:79:0x01e4, B:80:0x01e9, B:81:0x01ee, B:83:0x01fa, B:84:0x0206, B:86:0x0212, B:88:0x023e, B:89:0x025e, B:96:0x0286, B:98:0x028a, B:99:0x028d, B:106:0x0298, B:119:0x02ae, B:121:0x02b4, B:122:0x02bb, B:123:0x02cc, B:125:0x02f3, B:191:0x040a, B:175:0x03d7, B:174:0x03d3, B:200:0x041b, B:201:0x0428, B:126:0x0315, B:130:0x0328, B:132:0x0338, B:134:0x034f, B:136:0x0359, B:202:0x0429, B:204:0x043d, B:207:0x0447, B:209:0x0456, B:211:0x0462, B:213:0x0477, B:214:0x047c, B:215:0x0480, B:217:0x0484, B:219:0x0491, B:291:0x05ed, B:293:0x05f5, B:295:0x05fd, B:298:0x0602, B:299:0x060e, B:301:0x0614, B:303:0x061c, B:306:0x062c, B:308:0x0632, B:309:0x0652, B:311:0x0658, B:313:0x065d, B:315:0x0662, B:317:0x0666, B:319:0x066c, B:321:0x0670, B:323:0x0678, B:325:0x067e, B:327:0x0688, B:330:0x068e, B:331:0x0691, B:333:0x069a, B:335:0x06ac, B:337:0x06b5, B:339:0x06bd, B:344:0x06c7, B:346:0x06ef, B:347:0x06f2, B:348:0x06fd, B:350:0x0703, B:352:0x0709, B:353:0x0710, B:357:0x071f, B:361:0x072a, B:363:0x0734, B:364:0x0739, B:366:0x0745, B:367:0x075d, B:369:0x0763, B:371:0x076b, B:373:0x0772, B:377:0x077b, B:382:0x078a, B:388:0x0797, B:390:0x079d, B:400:0x07b0, B:401:0x07b3, B:403:0x07bd, B:405:0x07c3, B:409:0x07d0, B:411:0x07d8, B:413:0x07dc, B:414:0x07e7, B:416:0x07ed, B:469:0x08e8, B:472:0x08f0, B:474:0x08f5, B:476:0x08fd, B:478:0x090b, B:479:0x0912, B:480:0x0916, B:482:0x091c, B:484:0x0925, B:486:0x092b, B:488:0x0936, B:495:0x095a, B:497:0x0960, B:501:0x0969, B:513:0x098b, B:509:0x097c, B:511:0x0980, B:512:0x0986, B:489:0x093d, B:492:0x094b, B:493:0x0952, B:494:0x0953, B:417:0x07f5, B:419:0x07fc, B:421:0x0800, B:448:0x0888, B:450:0x0894, B:426:0x080c, B:428:0x0810, B:430:0x0824, B:432:0x0832, B:434:0x083e, B:438:0x0847, B:440:0x0851, B:446:0x085c, B:451:0x08a1, B:453:0x08a7, B:455:0x08ab, B:459:0x08b4, B:461:0x08c4, B:463:0x08cc, B:465:0x08d6, B:466:0x08db, B:467:0x08e0, B:468:0x08e5, B:402:0x07b6, B:222:0x04a0, B:224:0x04a6, B:227:0x04ac, B:230:0x04b7, B:232:0x04bc, B:235:0x04ca, B:237:0x04d0, B:238:0x04d8, B:239:0x04db, B:241:0x04e3, B:243:0x04f1, B:245:0x052d, B:247:0x0537, B:250:0x0542, B:252:0x054a, B:253:0x054d, B:254:0x0550, B:256:0x0556, B:258:0x0565, B:260:0x056b, B:262:0x0577, B:264:0x0581, B:266:0x0592, B:268:0x0598, B:269:0x05a3, B:270:0x05a8, B:272:0x05b3, B:275:0x05b8, B:277:0x05be, B:279:0x05c6, B:281:0x05cc, B:283:0x05d2, B:287:0x05e0, B:289:0x05e7, B:290:0x05ea, B:218:0x048e, B:515:0x0993, B:519:0x099a, B:520:0x09a2, B:524:0x09c2, B:108:0x029a, B:110:0x029f, B:111:0x02a2, B:114:0x02a9, B:118:0x02ad), top: B:602:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0703 A[Catch: RuntimeException -> 0x09d4, IOException -> 0x09fe, zzui -> 0x0a06, zzgw -> 0x0a0e, zzcc -> 0x0a16, zzse -> 0x0a2d, zziz -> 0x0a37, TryCatch #10 {zzcc -> 0x0a16, zzgw -> 0x0a0e, zziz -> 0x0a37, zzse -> 0x0a2d, zzui -> 0x0a06, IOException -> 0x09fe, RuntimeException -> 0x09d4, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0048, B:18:0x0056, B:19:0x005e, B:20:0x0069, B:21:0x007d, B:22:0x0095, B:23:0x00b1, B:25:0x00c0, B:26:0x00c4, B:27:0x00d5, B:29:0x00e4, B:30:0x0100, B:31:0x0113, B:32:0x011c, B:34:0x012e, B:35:0x013a, B:36:0x014a, B:38:0x0156, B:41:0x0161, B:42:0x0168, B:43:0x0175, B:47:0x017c, B:49:0x0184, B:51:0x0188, B:53:0x018e, B:55:0x0196, B:57:0x019e, B:58:0x01a1, B:60:0x01a6, B:67:0x01b3, B:68:0x01b4, B:72:0x01bb, B:74:0x01c9, B:75:0x01cc, B:76:0x01d1, B:78:0x01e1, B:79:0x01e4, B:80:0x01e9, B:81:0x01ee, B:83:0x01fa, B:84:0x0206, B:86:0x0212, B:88:0x023e, B:89:0x025e, B:96:0x0286, B:98:0x028a, B:99:0x028d, B:106:0x0298, B:119:0x02ae, B:121:0x02b4, B:122:0x02bb, B:123:0x02cc, B:125:0x02f3, B:191:0x040a, B:175:0x03d7, B:174:0x03d3, B:200:0x041b, B:201:0x0428, B:126:0x0315, B:130:0x0328, B:132:0x0338, B:134:0x034f, B:136:0x0359, B:202:0x0429, B:204:0x043d, B:207:0x0447, B:209:0x0456, B:211:0x0462, B:213:0x0477, B:214:0x047c, B:215:0x0480, B:217:0x0484, B:219:0x0491, B:291:0x05ed, B:293:0x05f5, B:295:0x05fd, B:298:0x0602, B:299:0x060e, B:301:0x0614, B:303:0x061c, B:306:0x062c, B:308:0x0632, B:309:0x0652, B:311:0x0658, B:313:0x065d, B:315:0x0662, B:317:0x0666, B:319:0x066c, B:321:0x0670, B:323:0x0678, B:325:0x067e, B:327:0x0688, B:330:0x068e, B:331:0x0691, B:333:0x069a, B:335:0x06ac, B:337:0x06b5, B:339:0x06bd, B:344:0x06c7, B:346:0x06ef, B:347:0x06f2, B:348:0x06fd, B:350:0x0703, B:352:0x0709, B:353:0x0710, B:357:0x071f, B:361:0x072a, B:363:0x0734, B:364:0x0739, B:366:0x0745, B:367:0x075d, B:369:0x0763, B:371:0x076b, B:373:0x0772, B:377:0x077b, B:382:0x078a, B:388:0x0797, B:390:0x079d, B:400:0x07b0, B:401:0x07b3, B:403:0x07bd, B:405:0x07c3, B:409:0x07d0, B:411:0x07d8, B:413:0x07dc, B:414:0x07e7, B:416:0x07ed, B:469:0x08e8, B:472:0x08f0, B:474:0x08f5, B:476:0x08fd, B:478:0x090b, B:479:0x0912, B:480:0x0916, B:482:0x091c, B:484:0x0925, B:486:0x092b, B:488:0x0936, B:495:0x095a, B:497:0x0960, B:501:0x0969, B:513:0x098b, B:509:0x097c, B:511:0x0980, B:512:0x0986, B:489:0x093d, B:492:0x094b, B:493:0x0952, B:494:0x0953, B:417:0x07f5, B:419:0x07fc, B:421:0x0800, B:448:0x0888, B:450:0x0894, B:426:0x080c, B:428:0x0810, B:430:0x0824, B:432:0x0832, B:434:0x083e, B:438:0x0847, B:440:0x0851, B:446:0x085c, B:451:0x08a1, B:453:0x08a7, B:455:0x08ab, B:459:0x08b4, B:461:0x08c4, B:463:0x08cc, B:465:0x08d6, B:466:0x08db, B:467:0x08e0, B:468:0x08e5, B:402:0x07b6, B:222:0x04a0, B:224:0x04a6, B:227:0x04ac, B:230:0x04b7, B:232:0x04bc, B:235:0x04ca, B:237:0x04d0, B:238:0x04d8, B:239:0x04db, B:241:0x04e3, B:243:0x04f1, B:245:0x052d, B:247:0x0537, B:250:0x0542, B:252:0x054a, B:253:0x054d, B:254:0x0550, B:256:0x0556, B:258:0x0565, B:260:0x056b, B:262:0x0577, B:264:0x0581, B:266:0x0592, B:268:0x0598, B:269:0x05a3, B:270:0x05a8, B:272:0x05b3, B:275:0x05b8, B:277:0x05be, B:279:0x05c6, B:281:0x05cc, B:283:0x05d2, B:287:0x05e0, B:289:0x05e7, B:290:0x05ea, B:218:0x048e, B:515:0x0993, B:519:0x099a, B:520:0x09a2, B:524:0x09c2, B:108:0x029a, B:110:0x029f, B:111:0x02a2, B:114:0x02a9, B:118:0x02ad), top: B:602:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x07f5 A[Catch: RuntimeException -> 0x09d4, IOException -> 0x09fe, zzui -> 0x0a06, zzgw -> 0x0a0e, zzcc -> 0x0a16, zzse -> 0x0a2d, zziz -> 0x0a37, TryCatch #10 {zzcc -> 0x0a16, zzgw -> 0x0a0e, zziz -> 0x0a37, zzse -> 0x0a2d, zzui -> 0x0a06, IOException -> 0x09fe, RuntimeException -> 0x09d4, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0048, B:18:0x0056, B:19:0x005e, B:20:0x0069, B:21:0x007d, B:22:0x0095, B:23:0x00b1, B:25:0x00c0, B:26:0x00c4, B:27:0x00d5, B:29:0x00e4, B:30:0x0100, B:31:0x0113, B:32:0x011c, B:34:0x012e, B:35:0x013a, B:36:0x014a, B:38:0x0156, B:41:0x0161, B:42:0x0168, B:43:0x0175, B:47:0x017c, B:49:0x0184, B:51:0x0188, B:53:0x018e, B:55:0x0196, B:57:0x019e, B:58:0x01a1, B:60:0x01a6, B:67:0x01b3, B:68:0x01b4, B:72:0x01bb, B:74:0x01c9, B:75:0x01cc, B:76:0x01d1, B:78:0x01e1, B:79:0x01e4, B:80:0x01e9, B:81:0x01ee, B:83:0x01fa, B:84:0x0206, B:86:0x0212, B:88:0x023e, B:89:0x025e, B:96:0x0286, B:98:0x028a, B:99:0x028d, B:106:0x0298, B:119:0x02ae, B:121:0x02b4, B:122:0x02bb, B:123:0x02cc, B:125:0x02f3, B:191:0x040a, B:175:0x03d7, B:174:0x03d3, B:200:0x041b, B:201:0x0428, B:126:0x0315, B:130:0x0328, B:132:0x0338, B:134:0x034f, B:136:0x0359, B:202:0x0429, B:204:0x043d, B:207:0x0447, B:209:0x0456, B:211:0x0462, B:213:0x0477, B:214:0x047c, B:215:0x0480, B:217:0x0484, B:219:0x0491, B:291:0x05ed, B:293:0x05f5, B:295:0x05fd, B:298:0x0602, B:299:0x060e, B:301:0x0614, B:303:0x061c, B:306:0x062c, B:308:0x0632, B:309:0x0652, B:311:0x0658, B:313:0x065d, B:315:0x0662, B:317:0x0666, B:319:0x066c, B:321:0x0670, B:323:0x0678, B:325:0x067e, B:327:0x0688, B:330:0x068e, B:331:0x0691, B:333:0x069a, B:335:0x06ac, B:337:0x06b5, B:339:0x06bd, B:344:0x06c7, B:346:0x06ef, B:347:0x06f2, B:348:0x06fd, B:350:0x0703, B:352:0x0709, B:353:0x0710, B:357:0x071f, B:361:0x072a, B:363:0x0734, B:364:0x0739, B:366:0x0745, B:367:0x075d, B:369:0x0763, B:371:0x076b, B:373:0x0772, B:377:0x077b, B:382:0x078a, B:388:0x0797, B:390:0x079d, B:400:0x07b0, B:401:0x07b3, B:403:0x07bd, B:405:0x07c3, B:409:0x07d0, B:411:0x07d8, B:413:0x07dc, B:414:0x07e7, B:416:0x07ed, B:469:0x08e8, B:472:0x08f0, B:474:0x08f5, B:476:0x08fd, B:478:0x090b, B:479:0x0912, B:480:0x0916, B:482:0x091c, B:484:0x0925, B:486:0x092b, B:488:0x0936, B:495:0x095a, B:497:0x0960, B:501:0x0969, B:513:0x098b, B:509:0x097c, B:511:0x0980, B:512:0x0986, B:489:0x093d, B:492:0x094b, B:493:0x0952, B:494:0x0953, B:417:0x07f5, B:419:0x07fc, B:421:0x0800, B:448:0x0888, B:450:0x0894, B:426:0x080c, B:428:0x0810, B:430:0x0824, B:432:0x0832, B:434:0x083e, B:438:0x0847, B:440:0x0851, B:446:0x085c, B:451:0x08a1, B:453:0x08a7, B:455:0x08ab, B:459:0x08b4, B:461:0x08c4, B:463:0x08cc, B:465:0x08d6, B:466:0x08db, B:467:0x08e0, B:468:0x08e5, B:402:0x07b6, B:222:0x04a0, B:224:0x04a6, B:227:0x04ac, B:230:0x04b7, B:232:0x04bc, B:235:0x04ca, B:237:0x04d0, B:238:0x04d8, B:239:0x04db, B:241:0x04e3, B:243:0x04f1, B:245:0x052d, B:247:0x0537, B:250:0x0542, B:252:0x054a, B:253:0x054d, B:254:0x0550, B:256:0x0556, B:258:0x0565, B:260:0x056b, B:262:0x0577, B:264:0x0581, B:266:0x0592, B:268:0x0598, B:269:0x05a3, B:270:0x05a8, B:272:0x05b3, B:275:0x05b8, B:277:0x05be, B:279:0x05c6, B:281:0x05cc, B:283:0x05d2, B:287:0x05e0, B:289:0x05e7, B:290:0x05ea, B:218:0x048e, B:515:0x0993, B:519:0x099a, B:520:0x09a2, B:524:0x09c2, B:108:0x029a, B:110:0x029f, B:111:0x02a2, B:114:0x02a9, B:118:0x02ad), top: B:602:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0894 A[Catch: RuntimeException -> 0x09d4, IOException -> 0x09fe, zzui -> 0x0a06, zzgw -> 0x0a0e, zzcc -> 0x0a16, zzse -> 0x0a2d, zziz -> 0x0a37, TryCatch #10 {zzcc -> 0x0a16, zzgw -> 0x0a0e, zziz -> 0x0a37, zzse -> 0x0a2d, zzui -> 0x0a06, IOException -> 0x09fe, RuntimeException -> 0x09d4, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0048, B:18:0x0056, B:19:0x005e, B:20:0x0069, B:21:0x007d, B:22:0x0095, B:23:0x00b1, B:25:0x00c0, B:26:0x00c4, B:27:0x00d5, B:29:0x00e4, B:30:0x0100, B:31:0x0113, B:32:0x011c, B:34:0x012e, B:35:0x013a, B:36:0x014a, B:38:0x0156, B:41:0x0161, B:42:0x0168, B:43:0x0175, B:47:0x017c, B:49:0x0184, B:51:0x0188, B:53:0x018e, B:55:0x0196, B:57:0x019e, B:58:0x01a1, B:60:0x01a6, B:67:0x01b3, B:68:0x01b4, B:72:0x01bb, B:74:0x01c9, B:75:0x01cc, B:76:0x01d1, B:78:0x01e1, B:79:0x01e4, B:80:0x01e9, B:81:0x01ee, B:83:0x01fa, B:84:0x0206, B:86:0x0212, B:88:0x023e, B:89:0x025e, B:96:0x0286, B:98:0x028a, B:99:0x028d, B:106:0x0298, B:119:0x02ae, B:121:0x02b4, B:122:0x02bb, B:123:0x02cc, B:125:0x02f3, B:191:0x040a, B:175:0x03d7, B:174:0x03d3, B:200:0x041b, B:201:0x0428, B:126:0x0315, B:130:0x0328, B:132:0x0338, B:134:0x034f, B:136:0x0359, B:202:0x0429, B:204:0x043d, B:207:0x0447, B:209:0x0456, B:211:0x0462, B:213:0x0477, B:214:0x047c, B:215:0x0480, B:217:0x0484, B:219:0x0491, B:291:0x05ed, B:293:0x05f5, B:295:0x05fd, B:298:0x0602, B:299:0x060e, B:301:0x0614, B:303:0x061c, B:306:0x062c, B:308:0x0632, B:309:0x0652, B:311:0x0658, B:313:0x065d, B:315:0x0662, B:317:0x0666, B:319:0x066c, B:321:0x0670, B:323:0x0678, B:325:0x067e, B:327:0x0688, B:330:0x068e, B:331:0x0691, B:333:0x069a, B:335:0x06ac, B:337:0x06b5, B:339:0x06bd, B:344:0x06c7, B:346:0x06ef, B:347:0x06f2, B:348:0x06fd, B:350:0x0703, B:352:0x0709, B:353:0x0710, B:357:0x071f, B:361:0x072a, B:363:0x0734, B:364:0x0739, B:366:0x0745, B:367:0x075d, B:369:0x0763, B:371:0x076b, B:373:0x0772, B:377:0x077b, B:382:0x078a, B:388:0x0797, B:390:0x079d, B:400:0x07b0, B:401:0x07b3, B:403:0x07bd, B:405:0x07c3, B:409:0x07d0, B:411:0x07d8, B:413:0x07dc, B:414:0x07e7, B:416:0x07ed, B:469:0x08e8, B:472:0x08f0, B:474:0x08f5, B:476:0x08fd, B:478:0x090b, B:479:0x0912, B:480:0x0916, B:482:0x091c, B:484:0x0925, B:486:0x092b, B:488:0x0936, B:495:0x095a, B:497:0x0960, B:501:0x0969, B:513:0x098b, B:509:0x097c, B:511:0x0980, B:512:0x0986, B:489:0x093d, B:492:0x094b, B:493:0x0952, B:494:0x0953, B:417:0x07f5, B:419:0x07fc, B:421:0x0800, B:448:0x0888, B:450:0x0894, B:426:0x080c, B:428:0x0810, B:430:0x0824, B:432:0x0832, B:434:0x083e, B:438:0x0847, B:440:0x0851, B:446:0x085c, B:451:0x08a1, B:453:0x08a7, B:455:0x08ab, B:459:0x08b4, B:461:0x08c4, B:463:0x08cc, B:465:0x08d6, B:466:0x08db, B:467:0x08e0, B:468:0x08e5, B:402:0x07b6, B:222:0x04a0, B:224:0x04a6, B:227:0x04ac, B:230:0x04b7, B:232:0x04bc, B:235:0x04ca, B:237:0x04d0, B:238:0x04d8, B:239:0x04db, B:241:0x04e3, B:243:0x04f1, B:245:0x052d, B:247:0x0537, B:250:0x0542, B:252:0x054a, B:253:0x054d, B:254:0x0550, B:256:0x0556, B:258:0x0565, B:260:0x056b, B:262:0x0577, B:264:0x0581, B:266:0x0592, B:268:0x0598, B:269:0x05a3, B:270:0x05a8, B:272:0x05b3, B:275:0x05b8, B:277:0x05be, B:279:0x05c6, B:281:0x05cc, B:283:0x05d2, B:287:0x05e0, B:289:0x05e7, B:290:0x05ea, B:218:0x048e, B:515:0x0993, B:519:0x099a, B:520:0x09a2, B:524:0x09c2, B:108:0x029a, B:110:0x029f, B:111:0x02a2, B:114:0x02a9, B:118:0x02ad), top: B:602:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x08a7 A[Catch: RuntimeException -> 0x09d4, IOException -> 0x09fe, zzui -> 0x0a06, zzgw -> 0x0a0e, zzcc -> 0x0a16, zzse -> 0x0a2d, zziz -> 0x0a37, TryCatch #10 {zzcc -> 0x0a16, zzgw -> 0x0a0e, zziz -> 0x0a37, zzse -> 0x0a2d, zzui -> 0x0a06, IOException -> 0x09fe, RuntimeException -> 0x09d4, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0048, B:18:0x0056, B:19:0x005e, B:20:0x0069, B:21:0x007d, B:22:0x0095, B:23:0x00b1, B:25:0x00c0, B:26:0x00c4, B:27:0x00d5, B:29:0x00e4, B:30:0x0100, B:31:0x0113, B:32:0x011c, B:34:0x012e, B:35:0x013a, B:36:0x014a, B:38:0x0156, B:41:0x0161, B:42:0x0168, B:43:0x0175, B:47:0x017c, B:49:0x0184, B:51:0x0188, B:53:0x018e, B:55:0x0196, B:57:0x019e, B:58:0x01a1, B:60:0x01a6, B:67:0x01b3, B:68:0x01b4, B:72:0x01bb, B:74:0x01c9, B:75:0x01cc, B:76:0x01d1, B:78:0x01e1, B:79:0x01e4, B:80:0x01e9, B:81:0x01ee, B:83:0x01fa, B:84:0x0206, B:86:0x0212, B:88:0x023e, B:89:0x025e, B:96:0x0286, B:98:0x028a, B:99:0x028d, B:106:0x0298, B:119:0x02ae, B:121:0x02b4, B:122:0x02bb, B:123:0x02cc, B:125:0x02f3, B:191:0x040a, B:175:0x03d7, B:174:0x03d3, B:200:0x041b, B:201:0x0428, B:126:0x0315, B:130:0x0328, B:132:0x0338, B:134:0x034f, B:136:0x0359, B:202:0x0429, B:204:0x043d, B:207:0x0447, B:209:0x0456, B:211:0x0462, B:213:0x0477, B:214:0x047c, B:215:0x0480, B:217:0x0484, B:219:0x0491, B:291:0x05ed, B:293:0x05f5, B:295:0x05fd, B:298:0x0602, B:299:0x060e, B:301:0x0614, B:303:0x061c, B:306:0x062c, B:308:0x0632, B:309:0x0652, B:311:0x0658, B:313:0x065d, B:315:0x0662, B:317:0x0666, B:319:0x066c, B:321:0x0670, B:323:0x0678, B:325:0x067e, B:327:0x0688, B:330:0x068e, B:331:0x0691, B:333:0x069a, B:335:0x06ac, B:337:0x06b5, B:339:0x06bd, B:344:0x06c7, B:346:0x06ef, B:347:0x06f2, B:348:0x06fd, B:350:0x0703, B:352:0x0709, B:353:0x0710, B:357:0x071f, B:361:0x072a, B:363:0x0734, B:364:0x0739, B:366:0x0745, B:367:0x075d, B:369:0x0763, B:371:0x076b, B:373:0x0772, B:377:0x077b, B:382:0x078a, B:388:0x0797, B:390:0x079d, B:400:0x07b0, B:401:0x07b3, B:403:0x07bd, B:405:0x07c3, B:409:0x07d0, B:411:0x07d8, B:413:0x07dc, B:414:0x07e7, B:416:0x07ed, B:469:0x08e8, B:472:0x08f0, B:474:0x08f5, B:476:0x08fd, B:478:0x090b, B:479:0x0912, B:480:0x0916, B:482:0x091c, B:484:0x0925, B:486:0x092b, B:488:0x0936, B:495:0x095a, B:497:0x0960, B:501:0x0969, B:513:0x098b, B:509:0x097c, B:511:0x0980, B:512:0x0986, B:489:0x093d, B:492:0x094b, B:493:0x0952, B:494:0x0953, B:417:0x07f5, B:419:0x07fc, B:421:0x0800, B:448:0x0888, B:450:0x0894, B:426:0x080c, B:428:0x0810, B:430:0x0824, B:432:0x0832, B:434:0x083e, B:438:0x0847, B:440:0x0851, B:446:0x085c, B:451:0x08a1, B:453:0x08a7, B:455:0x08ab, B:459:0x08b4, B:461:0x08c4, B:463:0x08cc, B:465:0x08d6, B:466:0x08db, B:467:0x08e0, B:468:0x08e5, B:402:0x07b6, B:222:0x04a0, B:224:0x04a6, B:227:0x04ac, B:230:0x04b7, B:232:0x04bc, B:235:0x04ca, B:237:0x04d0, B:238:0x04d8, B:239:0x04db, B:241:0x04e3, B:243:0x04f1, B:245:0x052d, B:247:0x0537, B:250:0x0542, B:252:0x054a, B:253:0x054d, B:254:0x0550, B:256:0x0556, B:258:0x0565, B:260:0x056b, B:262:0x0577, B:264:0x0581, B:266:0x0592, B:268:0x0598, B:269:0x05a3, B:270:0x05a8, B:272:0x05b3, B:275:0x05b8, B:277:0x05be, B:279:0x05c6, B:281:0x05cc, B:283:0x05d2, B:287:0x05e0, B:289:0x05e7, B:290:0x05ea, B:218:0x048e, B:515:0x0993, B:519:0x099a, B:520:0x09a2, B:524:0x09c2, B:108:0x029a, B:110:0x029f, B:111:0x02a2, B:114:0x02a9, B:118:0x02ad), top: B:602:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x08c4 A[Catch: RuntimeException -> 0x09d4, IOException -> 0x09fe, zzui -> 0x0a06, zzgw -> 0x0a0e, zzcc -> 0x0a16, zzse -> 0x0a2d, zziz -> 0x0a37, TryCatch #10 {zzcc -> 0x0a16, zzgw -> 0x0a0e, zziz -> 0x0a37, zzse -> 0x0a2d, zzui -> 0x0a06, IOException -> 0x09fe, RuntimeException -> 0x09d4, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0048, B:18:0x0056, B:19:0x005e, B:20:0x0069, B:21:0x007d, B:22:0x0095, B:23:0x00b1, B:25:0x00c0, B:26:0x00c4, B:27:0x00d5, B:29:0x00e4, B:30:0x0100, B:31:0x0113, B:32:0x011c, B:34:0x012e, B:35:0x013a, B:36:0x014a, B:38:0x0156, B:41:0x0161, B:42:0x0168, B:43:0x0175, B:47:0x017c, B:49:0x0184, B:51:0x0188, B:53:0x018e, B:55:0x0196, B:57:0x019e, B:58:0x01a1, B:60:0x01a6, B:67:0x01b3, B:68:0x01b4, B:72:0x01bb, B:74:0x01c9, B:75:0x01cc, B:76:0x01d1, B:78:0x01e1, B:79:0x01e4, B:80:0x01e9, B:81:0x01ee, B:83:0x01fa, B:84:0x0206, B:86:0x0212, B:88:0x023e, B:89:0x025e, B:96:0x0286, B:98:0x028a, B:99:0x028d, B:106:0x0298, B:119:0x02ae, B:121:0x02b4, B:122:0x02bb, B:123:0x02cc, B:125:0x02f3, B:191:0x040a, B:175:0x03d7, B:174:0x03d3, B:200:0x041b, B:201:0x0428, B:126:0x0315, B:130:0x0328, B:132:0x0338, B:134:0x034f, B:136:0x0359, B:202:0x0429, B:204:0x043d, B:207:0x0447, B:209:0x0456, B:211:0x0462, B:213:0x0477, B:214:0x047c, B:215:0x0480, B:217:0x0484, B:219:0x0491, B:291:0x05ed, B:293:0x05f5, B:295:0x05fd, B:298:0x0602, B:299:0x060e, B:301:0x0614, B:303:0x061c, B:306:0x062c, B:308:0x0632, B:309:0x0652, B:311:0x0658, B:313:0x065d, B:315:0x0662, B:317:0x0666, B:319:0x066c, B:321:0x0670, B:323:0x0678, B:325:0x067e, B:327:0x0688, B:330:0x068e, B:331:0x0691, B:333:0x069a, B:335:0x06ac, B:337:0x06b5, B:339:0x06bd, B:344:0x06c7, B:346:0x06ef, B:347:0x06f2, B:348:0x06fd, B:350:0x0703, B:352:0x0709, B:353:0x0710, B:357:0x071f, B:361:0x072a, B:363:0x0734, B:364:0x0739, B:366:0x0745, B:367:0x075d, B:369:0x0763, B:371:0x076b, B:373:0x0772, B:377:0x077b, B:382:0x078a, B:388:0x0797, B:390:0x079d, B:400:0x07b0, B:401:0x07b3, B:403:0x07bd, B:405:0x07c3, B:409:0x07d0, B:411:0x07d8, B:413:0x07dc, B:414:0x07e7, B:416:0x07ed, B:469:0x08e8, B:472:0x08f0, B:474:0x08f5, B:476:0x08fd, B:478:0x090b, B:479:0x0912, B:480:0x0916, B:482:0x091c, B:484:0x0925, B:486:0x092b, B:488:0x0936, B:495:0x095a, B:497:0x0960, B:501:0x0969, B:513:0x098b, B:509:0x097c, B:511:0x0980, B:512:0x0986, B:489:0x093d, B:492:0x094b, B:493:0x0952, B:494:0x0953, B:417:0x07f5, B:419:0x07fc, B:421:0x0800, B:448:0x0888, B:450:0x0894, B:426:0x080c, B:428:0x0810, B:430:0x0824, B:432:0x0832, B:434:0x083e, B:438:0x0847, B:440:0x0851, B:446:0x085c, B:451:0x08a1, B:453:0x08a7, B:455:0x08ab, B:459:0x08b4, B:461:0x08c4, B:463:0x08cc, B:465:0x08d6, B:466:0x08db, B:467:0x08e0, B:468:0x08e5, B:402:0x07b6, B:222:0x04a0, B:224:0x04a6, B:227:0x04ac, B:230:0x04b7, B:232:0x04bc, B:235:0x04ca, B:237:0x04d0, B:238:0x04d8, B:239:0x04db, B:241:0x04e3, B:243:0x04f1, B:245:0x052d, B:247:0x0537, B:250:0x0542, B:252:0x054a, B:253:0x054d, B:254:0x0550, B:256:0x0556, B:258:0x0565, B:260:0x056b, B:262:0x0577, B:264:0x0581, B:266:0x0592, B:268:0x0598, B:269:0x05a3, B:270:0x05a8, B:272:0x05b3, B:275:0x05b8, B:277:0x05be, B:279:0x05c6, B:281:0x05cc, B:283:0x05d2, B:287:0x05e0, B:289:0x05e7, B:290:0x05ea, B:218:0x048e, B:515:0x0993, B:519:0x099a, B:520:0x09a2, B:524:0x09c2, B:108:0x029a, B:110:0x029f, B:111:0x02a2, B:114:0x02a9, B:118:0x02ad), top: B:602:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0953 A[Catch: RuntimeException -> 0x09d4, IOException -> 0x09fe, zzui -> 0x0a06, zzgw -> 0x0a0e, zzcc -> 0x0a16, zzse -> 0x0a2d, zziz -> 0x0a37, TryCatch #10 {zzcc -> 0x0a16, zzgw -> 0x0a0e, zziz -> 0x0a37, zzse -> 0x0a2d, zzui -> 0x0a06, IOException -> 0x09fe, RuntimeException -> 0x09d4, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0048, B:18:0x0056, B:19:0x005e, B:20:0x0069, B:21:0x007d, B:22:0x0095, B:23:0x00b1, B:25:0x00c0, B:26:0x00c4, B:27:0x00d5, B:29:0x00e4, B:30:0x0100, B:31:0x0113, B:32:0x011c, B:34:0x012e, B:35:0x013a, B:36:0x014a, B:38:0x0156, B:41:0x0161, B:42:0x0168, B:43:0x0175, B:47:0x017c, B:49:0x0184, B:51:0x0188, B:53:0x018e, B:55:0x0196, B:57:0x019e, B:58:0x01a1, B:60:0x01a6, B:67:0x01b3, B:68:0x01b4, B:72:0x01bb, B:74:0x01c9, B:75:0x01cc, B:76:0x01d1, B:78:0x01e1, B:79:0x01e4, B:80:0x01e9, B:81:0x01ee, B:83:0x01fa, B:84:0x0206, B:86:0x0212, B:88:0x023e, B:89:0x025e, B:96:0x0286, B:98:0x028a, B:99:0x028d, B:106:0x0298, B:119:0x02ae, B:121:0x02b4, B:122:0x02bb, B:123:0x02cc, B:125:0x02f3, B:191:0x040a, B:175:0x03d7, B:174:0x03d3, B:200:0x041b, B:201:0x0428, B:126:0x0315, B:130:0x0328, B:132:0x0338, B:134:0x034f, B:136:0x0359, B:202:0x0429, B:204:0x043d, B:207:0x0447, B:209:0x0456, B:211:0x0462, B:213:0x0477, B:214:0x047c, B:215:0x0480, B:217:0x0484, B:219:0x0491, B:291:0x05ed, B:293:0x05f5, B:295:0x05fd, B:298:0x0602, B:299:0x060e, B:301:0x0614, B:303:0x061c, B:306:0x062c, B:308:0x0632, B:309:0x0652, B:311:0x0658, B:313:0x065d, B:315:0x0662, B:317:0x0666, B:319:0x066c, B:321:0x0670, B:323:0x0678, B:325:0x067e, B:327:0x0688, B:330:0x068e, B:331:0x0691, B:333:0x069a, B:335:0x06ac, B:337:0x06b5, B:339:0x06bd, B:344:0x06c7, B:346:0x06ef, B:347:0x06f2, B:348:0x06fd, B:350:0x0703, B:352:0x0709, B:353:0x0710, B:357:0x071f, B:361:0x072a, B:363:0x0734, B:364:0x0739, B:366:0x0745, B:367:0x075d, B:369:0x0763, B:371:0x076b, B:373:0x0772, B:377:0x077b, B:382:0x078a, B:388:0x0797, B:390:0x079d, B:400:0x07b0, B:401:0x07b3, B:403:0x07bd, B:405:0x07c3, B:409:0x07d0, B:411:0x07d8, B:413:0x07dc, B:414:0x07e7, B:416:0x07ed, B:469:0x08e8, B:472:0x08f0, B:474:0x08f5, B:476:0x08fd, B:478:0x090b, B:479:0x0912, B:480:0x0916, B:482:0x091c, B:484:0x0925, B:486:0x092b, B:488:0x0936, B:495:0x095a, B:497:0x0960, B:501:0x0969, B:513:0x098b, B:509:0x097c, B:511:0x0980, B:512:0x0986, B:489:0x093d, B:492:0x094b, B:493:0x0952, B:494:0x0953, B:417:0x07f5, B:419:0x07fc, B:421:0x0800, B:448:0x0888, B:450:0x0894, B:426:0x080c, B:428:0x0810, B:430:0x0824, B:432:0x0832, B:434:0x083e, B:438:0x0847, B:440:0x0851, B:446:0x085c, B:451:0x08a1, B:453:0x08a7, B:455:0x08ab, B:459:0x08b4, B:461:0x08c4, B:463:0x08cc, B:465:0x08d6, B:466:0x08db, B:467:0x08e0, B:468:0x08e5, B:402:0x07b6, B:222:0x04a0, B:224:0x04a6, B:227:0x04ac, B:230:0x04b7, B:232:0x04bc, B:235:0x04ca, B:237:0x04d0, B:238:0x04d8, B:239:0x04db, B:241:0x04e3, B:243:0x04f1, B:245:0x052d, B:247:0x0537, B:250:0x0542, B:252:0x054a, B:253:0x054d, B:254:0x0550, B:256:0x0556, B:258:0x0565, B:260:0x056b, B:262:0x0577, B:264:0x0581, B:266:0x0592, B:268:0x0598, B:269:0x05a3, B:270:0x05a8, B:272:0x05b3, B:275:0x05b8, B:277:0x05be, B:279:0x05c6, B:281:0x05cc, B:283:0x05d2, B:287:0x05e0, B:289:0x05e7, B:290:0x05ea, B:218:0x048e, B:515:0x0993, B:519:0x099a, B:520:0x09a2, B:524:0x09c2, B:108:0x029a, B:110:0x029f, B:111:0x02a2, B:114:0x02a9, B:118:0x02ad), top: B:602:0x0006 }] */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.google.android.gms.internal.ads.zzhy, com.google.android.gms.internal.ads.zzzn] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkz.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zza(zzcg zzcgVar) {
        this.zzh.zzc(16, zzcgVar).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final /* bridge */ /* synthetic */ void zzg(zzxa zzxaVar) {
        this.zzh.zzc(9, (zzvf) zzxaVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzh() {
        this.zzh.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzi(zzvf zzvfVar) {
        this.zzh.zzc(8, zzvfVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final void zzj() {
        this.zzh.zzi(10);
    }

    public final void zzk() {
        this.zzh.zzb(0).zza();
    }

    public final void zzl(zzcx zzcxVar, int i, long j) {
        this.zzh.zzc(3, new zzky(zzcxVar, i, j)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final synchronized void zzm(zzmb zzmbVar) {
        if (!this.zzx && this.zzj.getThread().isAlive()) {
            this.zzh.zzc(14, zzmbVar).zza();
            return;
        }
        zzfe.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzmbVar.zzh(false);
    }

    public final void zzn(boolean z, int i) {
        this.zzh.zzd(1, z ? 1 : 0, i).zza();
    }

    public final void zzo() {
        this.zzh.zzb(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzx && this.zzj.getThread().isAlive()) {
            this.zzh.zzi(7);
            zzad(new zzkp(this), this.zzs);
            return this.zzx;
        }
        return true;
    }

    public final void zzq(List list, int i, long j, zzxb zzxbVar) {
        this.zzh.zzc(17, new zzku(list, zzxbVar, i, j, null)).zza();
    }
}
