package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.MediaPeriodQueue;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzll {
    private final zzcu zza = new zzcu();
    private final zzcw zzb = new zzcw();
    private final zzmp zzc;
    private final zzev zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzli zzh;
    private zzli zzi;
    private zzli zzj;
    private int zzk;
    private Object zzl;
    private long zzm;
    private final zzkr zzn;

    public zzll(zzmp zzmpVar, zzev zzevVar, zzkr zzkrVar) {
        this.zzc = zzmpVar;
        this.zzd = zzevVar;
        this.zzn = zzkrVar;
    }

    private final boolean zzA(zzcx zzcxVar, zzvh zzvhVar) {
        if (zzC(zzvhVar)) {
            return zzcxVar.zze(zzcxVar.zzn(zzvhVar.zza, this.zza).zzd, this.zzb, 0L).zzq == zzcxVar.zza(zzvhVar.zza);
        }
        return false;
    }

    private final boolean zzB(zzcx zzcxVar) {
        zzli zzliVarZzg = this.zzh;
        if (zzliVarZzg == null) {
            return true;
        }
        int iZza = zzcxVar.zza(zzliVarZzg.zzb);
        while (true) {
            iZza = zzcxVar.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                Objects.requireNonNull(zzliVarZzg);
                if (zzliVarZzg.zzg() == null || zzliVarZzg.zzf.zzg) {
                    break;
                }
                zzliVarZzg = zzliVarZzg.zzg();
            }
            zzli zzliVarZzg2 = zzliVarZzg.zzg();
            if (iZza == -1 || zzliVarZzg2 == null || zzcxVar.zza(zzliVarZzg2.zzb) != iZza) {
                break;
            }
            zzliVarZzg = zzliVarZzg2;
        }
        boolean zZzn = zzn(zzliVarZzg);
        zzliVarZzg.zzf = zzh(zzcxVar, zzliVarZzg.zzf);
        return !zZzn;
    }

    private static final boolean zzC(zzvh zzvhVar) {
        return !zzvhVar.zzb() && zzvhVar.zze == -1;
    }

    private final long zzs(zzcx zzcxVar, Object obj, int i) {
        zzcxVar.zzn(obj, this.zza);
        this.zza.zzi(i);
        this.zza.zzk(i);
        return 0L;
    }

    private final zzlj zzt(zzcx zzcxVar, zzli zzliVar, long j) {
        long j2;
        zzlj zzljVar = zzliVar.zzf;
        long jZze = (zzliVar.zze() + zzljVar.zze) - j;
        if (zzljVar.zzg) {
            long j3 = 0;
            int iZzi = zzcxVar.zzi(zzcxVar.zza(zzljVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (iZzi != -1) {
                int i = zzcxVar.zzd(iZzi, this.zza, true).zzd;
                Object obj = this.zza.zzc;
                Objects.requireNonNull(obj);
                long j4 = zzljVar.zza.zzd;
                if (zzcxVar.zze(i, this.zzb, 0L).zzp == iZzi) {
                    Pair pairZzm = zzcxVar.zzm(this.zzb, this.zza, i, -9223372036854775807L, Math.max(0L, jZze));
                    if (pairZzm != null) {
                        obj = pairZzm.first;
                        long jLongValue = ((Long) pairZzm.second).longValue();
                        zzli zzliVarZzg = zzliVar.zzg();
                        if (zzliVarZzg == null || !zzliVarZzg.zzb.equals(obj)) {
                            j4 = this.zze;
                            this.zze = 1 + j4;
                        } else {
                            j4 = zzliVarZzg.zzf.zza.zzd;
                        }
                        j2 = jLongValue;
                        j3 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                }
                zzvh zzvhVarZzx = zzx(zzcxVar, obj, j2, j4, this.zzb, this.zza);
                if (j3 != -9223372036854775807L && zzljVar.zzc != -9223372036854775807L) {
                    zzcxVar.zzn(zzljVar.zza.zza, this.zza).zzb();
                    this.zza.zzg();
                }
                return zzu(zzcxVar, zzvhVarZzx, j3, j2);
            }
        } else {
            zzvh zzvhVar = zzljVar.zza;
            zzcxVar.zzn(zzvhVar.zza, this.zza);
            if (!zzvhVar.zzb()) {
                int i2 = zzvhVar.zze;
                if (i2 != -1) {
                    this.zza.zzm(i2);
                }
                zzcu zzcuVar = this.zza;
                int i3 = zzvhVar.zze;
                int iZze = zzcuVar.zze(i3);
                zzcuVar.zzn(i3);
                if (iZze != this.zza.zza(zzvhVar.zze)) {
                    return zzv(zzcxVar, zzvhVar.zza, zzvhVar.zze, iZze, zzljVar.zze, zzvhVar.zzd);
                }
                zzs(zzcxVar, zzvhVar.zza, zzvhVar.zze);
                return zzw(zzcxVar, zzvhVar.zza, 0L, zzljVar.zze, zzvhVar.zzd);
            }
            int i4 = zzvhVar.zzb;
            if (this.zza.zza(i4) != -1) {
                int iZzf = this.zza.zzf(i4, zzvhVar.zzc);
                if (iZzf < 0) {
                    return zzv(zzcxVar, zzvhVar.zza, i4, iZzf, zzljVar.zzc, zzvhVar.zzd);
                }
                long jLongValue2 = zzljVar.zzc;
                if (jLongValue2 == -9223372036854775807L) {
                    zzcw zzcwVar = this.zzb;
                    zzcu zzcuVar2 = this.zza;
                    Pair pairZzm2 = zzcxVar.zzm(zzcwVar, zzcuVar2, zzcuVar2.zzd, -9223372036854775807L, Math.max(0L, jZze));
                    if (pairZzm2 != null) {
                        jLongValue2 = ((Long) pairZzm2.second).longValue();
                    }
                }
                zzs(zzcxVar, zzvhVar.zza, zzvhVar.zzb);
                return zzw(zzcxVar, zzvhVar.zza, Math.max(0L, jLongValue2), zzljVar.zzc, zzvhVar.zzd);
            }
        }
        return null;
    }

    private final zzlj zzu(zzcx zzcxVar, zzvh zzvhVar, long j, long j2) {
        zzcxVar.zzn(zzvhVar.zza, this.zza);
        return zzvhVar.zzb() ? zzv(zzcxVar, zzvhVar.zza, zzvhVar.zzb, zzvhVar.zzc, j, zzvhVar.zzd) : zzw(zzcxVar, zzvhVar.zza, j2, j, zzvhVar.zzd);
    }

    private final zzlj zzv(zzcx zzcxVar, Object obj, int i, int i2, long j, long j2) {
        zzvh zzvhVar = new zzvh(obj, i, i2, j2);
        long jZzh = zzcxVar.zzn(zzvhVar.zza, this.zza).zzh(zzvhVar.zzb, zzvhVar.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzj();
        }
        this.zza.zzn(zzvhVar.zzb);
        return new zzlj(zzvhVar, (jZzh == -9223372036854775807L || jZzh > 0) ? 0L : Math.max(0L, (-1) + jZzh), j, -9223372036854775807L, jZzh, false, false, false, false);
    }

    private final zzlj zzw(zzcx zzcxVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long jMax = j;
        zzcxVar.zzn(obj, this.zza);
        int iZzc = this.zza.zzc(jMax);
        if (iZzc != -1) {
            this.zza.zzm(iZzc);
        }
        if (iZzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzn(iZzc);
        }
        zzvh zzvhVar = new zzvh(obj, j3, iZzc);
        boolean zZzC = zzC(zzvhVar);
        boolean zZzA = zzA(zzcxVar, zzvhVar);
        boolean zZzz = zzz(zzcxVar, zzvhVar, zZzC);
        if (iZzc != -1) {
            this.zza.zzn(iZzc);
        }
        if (iZzc != -1) {
            this.zza.zzi(iZzc);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j5 = 0;
            j6 = 0;
        } else {
            j5 = j4;
            j6 = this.zza.zze;
        }
        if (j6 != -9223372036854775807L && jMax >= j6) {
            jMax = Math.max(0L, j6 - 1);
        }
        return new zzlj(zzvhVar, jMax, j2, j5, j6, false, zZzC, zZzA, zZzz);
    }

    private static zzvh zzx(zzcx zzcxVar, Object obj, long j, long j2, zzcw zzcwVar, zzcu zzcuVar) {
        zzcxVar.zzn(obj, zzcuVar);
        zzcxVar.zze(zzcuVar.zzd, zzcwVar, 0L);
        zzcxVar.zza(obj);
        zzcuVar.zzb();
        zzcxVar.zzn(obj, zzcuVar);
        int iZzd = zzcuVar.zzd(j);
        return iZzd == -1 ? new zzvh(obj, j2, zzcuVar.zzc(j)) : new zzvh(obj, iZzd, zzcuVar.zze(iZzd), j2);
    }

    private final void zzy() {
        final zzfzk zzfzkVar = new zzfzk();
        for (zzli zzliVarZzg = this.zzh; zzliVarZzg != null; zzliVarZzg = zzliVarZzg.zzg()) {
            zzfzkVar.zzf(zzliVarZzg.zzf.zza);
        }
        zzli zzliVar = this.zzi;
        final zzvh zzvhVar = zzliVar == null ? null : zzliVar.zzf.zza;
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlk
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk(zzfzkVar, zzvhVar);
            }
        });
    }

    private final boolean zzz(zzcx zzcxVar, zzvh zzvhVar, boolean z) {
        int iZza = zzcxVar.zza(zzvhVar.zza);
        return !zzcxVar.zze(zzcxVar.zzd(iZza, this.zza, false).zzd, this.zzb, 0L).zzj && zzcxVar.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    public final zzli zza() {
        zzli zzliVar = this.zzh;
        if (zzliVar == null) {
            return null;
        }
        if (zzliVar == this.zzi) {
            this.zzi = zzliVar.zzg();
        }
        zzliVar.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzli zzliVar2 = this.zzh;
            this.zzl = zzliVar2.zzb;
            this.zzm = zzliVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzli zzb() {
        zzli zzliVar = this.zzi;
        zzek.zzb(zzliVar);
        this.zzi = zzliVar.zzg();
        zzy();
        zzli zzliVar2 = this.zzi;
        zzek.zzb(zzliVar2);
        return zzliVar2;
    }

    public final zzli zzd() {
        return this.zzj;
    }

    public final zzli zze() {
        return this.zzh;
    }

    public final zzli zzf() {
        return this.zzi;
    }

    public final zzlj zzg(long j, zzly zzlyVar) {
        zzli zzliVar = this.zzj;
        return zzliVar == null ? zzu(zzlyVar.zza, zzlyVar.zzb, zzlyVar.zzc, zzlyVar.zzr) : zzt(zzlyVar.zza, zzliVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzlj zzh(com.google.android.gms.internal.ads.zzcx r19, com.google.android.gms.internal.ads.zzlj r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzvh r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzA(r1, r3)
            boolean r14 = r0.zzz(r1, r3, r12)
            com.google.android.gms.internal.ads.zzvh r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzcu r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.zze
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.google.android.gms.internal.ads.zzcu r9 = r0.zza
            r9.zzi(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzcu r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzh(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.google.android.gms.internal.ads.zzcu r1 = r0.zza
            long r5 = r1.zze
            goto L48
        L57:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.zzcu r1 = r0.zza
            int r4 = r3.zzb
            r1.zzn(r4)
            goto L6e
        L65:
            int r1 = r3.zze
            if (r1 == r4) goto L6e
            com.google.android.gms.internal.ads.zzcu r4 = r0.zza
            r4.zzn(r1)
        L6e:
            com.google.android.gms.internal.ads.zzlj r15 = new com.google.android.gms.internal.ads.zzlj
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzll.zzh(com.google.android.gms.internal.ads.zzcx, com.google.android.gms.internal.ads.zzlj):com.google.android.gms.internal.ads.zzlj");
    }

    public final zzvh zzi(zzcx zzcxVar, Object obj, long j) {
        long j2;
        int iZza;
        int i = zzcxVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (iZza = zzcxVar.zza(obj2)) == -1 || zzcxVar.zzd(iZza, this.zza, false).zzd != i) {
            zzli zzliVarZzg = this.zzh;
            while (true) {
                if (zzliVarZzg == null) {
                    zzli zzliVarZzg2 = this.zzh;
                    while (true) {
                        if (zzliVarZzg2 != null) {
                            int iZza2 = zzcxVar.zza(zzliVarZzg2.zzb);
                            if (iZza2 != -1 && zzcxVar.zzd(iZza2, this.zza, false).zzd == i) {
                                j2 = zzliVarZzg2.zzf.zza.zzd;
                                break;
                            }
                            zzliVarZzg2 = zzliVarZzg2.zzg();
                        } else {
                            j2 = this.zze;
                            this.zze = 1 + j2;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j2;
                            }
                        }
                    }
                } else {
                    if (zzliVarZzg.zzb.equals(obj)) {
                        j2 = zzliVarZzg.zzf.zza.zzd;
                        break;
                    }
                    zzliVarZzg = zzliVarZzg.zzg();
                }
            }
        } else {
            j2 = this.zzm;
        }
        long j3 = j2;
        zzcxVar.zzn(obj, this.zza);
        zzcxVar.zze(this.zza.zzd, this.zzb, 0L);
        int iZza3 = zzcxVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcw zzcwVar = this.zzb;
            if (iZza3 < zzcwVar.zzp) {
                return zzx(zzcxVar, obj3, j, j3, zzcwVar, this.zza);
            }
            zzcxVar.zzd(iZza3, this.zza, true);
            this.zza.zzb();
            zzcu zzcuVar = this.zza;
            if (zzcuVar.zzd(zzcuVar.zze) != -1) {
                obj3 = this.zza.zzc;
                Objects.requireNonNull(obj3);
            }
            iZza3--;
        }
    }

    public final void zzj() {
        if (this.zzk == 0) {
            return;
        }
        zzli zzliVarZzg = this.zzh;
        zzek.zzb(zzliVarZzg);
        this.zzl = zzliVarZzg.zzb;
        this.zzm = zzliVarZzg.zzf.zza.zzd;
        while (zzliVarZzg != null) {
            zzliVarZzg.zzn();
            zzliVarZzg = zzliVarZzg.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    final /* synthetic */ void zzk(zzfzk zzfzkVar, zzvh zzvhVar) {
        this.zzc.zzS(zzfzkVar.zzi(), zzvhVar);
    }

    public final void zzl(long j) {
        zzli zzliVar = this.zzj;
        if (zzliVar != null) {
            zzliVar.zzm(j);
        }
    }

    public final boolean zzm(zzvf zzvfVar) {
        zzli zzliVar = this.zzj;
        return zzliVar != null && zzliVar.zza == zzvfVar;
    }

    public final boolean zzn(zzli zzliVar) {
        zzek.zzb(zzliVar);
        boolean z = false;
        if (zzliVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzliVar;
        while (zzliVar.zzg() != null) {
            zzliVar = zzliVar.zzg();
            Objects.requireNonNull(zzliVar);
            if (zzliVar == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzliVar.zzn();
            this.zzk--;
        }
        zzli zzliVar2 = this.zzj;
        Objects.requireNonNull(zzliVar2);
        zzliVar2.zzo(null);
        zzy();
        return z;
    }

    public final boolean zzo() {
        zzli zzliVar = this.zzj;
        if (zzliVar == null) {
            return true;
        }
        if (zzliVar.zzf.zzi || !zzliVar.zzr() || this.zzj.zzf.zze == -9223372036854775807L) {
            return false;
        }
        return this.zzk < 100;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzp(com.google.android.gms.internal.ads.zzcx r17, long r18, long r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.zzli r2 = r0.zzh
            r3 = 0
        L7:
            r4 = 1
            if (r2 == 0) goto L97
            com.google.android.gms.internal.ads.zzlj r5 = r2.zzf
            r6 = 0
            if (r3 != 0) goto L16
            com.google.android.gms.internal.ads.zzlj r3 = r0.zzh(r1, r5)
            r7 = r18
            goto L39
        L16:
            r7 = r18
            com.google.android.gms.internal.ads.zzlj r9 = r0.zzt(r1, r3, r7)
            if (r9 != 0) goto L26
            boolean r1 = r0.zzn(r3)
            if (r1 != 0) goto L25
            return r4
        L25:
            return r6
        L26:
            long r10 = r5.zzb
            long r12 = r9.zzb
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L8f
            com.google.android.gms.internal.ads.zzvh r10 = r5.zza
            com.google.android.gms.internal.ads.zzvh r11 = r9.zza
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L8f
            r3 = r9
        L39:
            long r9 = r5.zzc
            com.google.android.gms.internal.ads.zzlj r9 = r3.zza(r9)
            r2.zzf = r9
            long r9 = r5.zze
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            long r13 = r3.zze
            if (r5 == 0) goto L86
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L86
        L53:
            r2.zzq()
            long r7 = r3.zze
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 != 0) goto L62
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L67
        L62:
            long r9 = r2.zze()
            long r7 = r7 + r9
        L67:
            com.google.android.gms.internal.ads.zzli r1 = r0.zzi
            if (r2 != r1) goto L7b
            com.google.android.gms.internal.ads.zzlj r1 = r2.zzf
            boolean r1 = r1.zzf
            r9 = -9223372036854775808
            int r1 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r1 == 0) goto L79
            int r1 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r1 < 0) goto L7b
        L79:
            r1 = r4
            goto L7c
        L7b:
            r1 = r6
        L7c:
            boolean r2 = r0.zzn(r2)
            if (r2 != 0) goto L85
            if (r1 != 0) goto L85
            return r4
        L85:
            return r6
        L86:
            com.google.android.gms.internal.ads.zzli r3 = r2.zzg()
            r15 = r3
            r3 = r2
            r2 = r15
            goto L7
        L8f:
            boolean r1 = r0.zzn(r3)
            if (r1 != 0) goto L96
            return r4
        L96:
            return r6
        L97:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzll.zzp(com.google.android.gms.internal.ads.zzcx, long, long):boolean");
    }

    public final boolean zzq(zzcx zzcxVar, int i) {
        this.zzf = i;
        return zzB(zzcxVar);
    }

    public final boolean zzr(zzcx zzcxVar, boolean z) {
        this.zzg = z;
        return zzB(zzcxVar);
    }

    public final zzli zzc(zzlj zzljVar) {
        zzli zzliVar = this.zzj;
        zzli zzliVarZzd = zzkz.zzd(this.zzn.zza, zzljVar, zzliVar == null ? MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : (zzliVar.zze() + zzliVar.zzf.zze) - zzljVar.zzb);
        zzli zzliVar2 = this.zzj;
        if (zzliVar2 != null) {
            zzliVar2.zzo(zzliVarZzd);
        } else {
            this.zzh = zzliVarZzd;
            this.zzi = zzliVarZzd;
        }
        this.zzl = null;
        this.zzj = zzliVarZzd;
        this.zzk++;
        zzy();
        return zzliVarZzd;
    }
}
