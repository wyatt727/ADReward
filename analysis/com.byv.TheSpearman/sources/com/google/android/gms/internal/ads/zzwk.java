package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzwk implements zzvf, zzadi, zzzt, zzzy, zzww {
    private static final Map zzb;
    private static final zzam zzc;
    private long zzA;
    private boolean zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private int zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private boolean zzJ;
    private int zzK;
    private boolean zzL;
    private boolean zzM;
    private final zzzs zzN;
    private final zzzo zzO;
    private final Uri zzd;
    private final zzgv zze;
    private final zzsm zzf;
    private final zzvq zzg;
    private final zzsg zzh;
    private final zzwg zzi;
    private final long zzj;
    private final zzaab zzk = new zzaab("ProgressiveMediaPeriod");
    private final zzvz zzl;
    private final zzeo zzm;
    private final Runnable zzn;
    private final Runnable zzo;
    private final Handler zzp;
    private final boolean zzq;
    private zzve zzr;
    private zzagm zzs;
    private zzwx[] zzt;
    private zzwi[] zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private zzwj zzy;
    private zzaef zzz;

    static {
        HashMap map = new HashMap();
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        zzb = Collections.unmodifiableMap(map);
        zzak zzakVar = new zzak();
        zzakVar.zzK("icy");
        zzakVar.zzW(MimeTypes.APPLICATION_ICY);
        zzc = zzakVar.zzac();
    }

    public zzwk(Uri uri, zzgv zzgvVar, zzvz zzvzVar, zzsm zzsmVar, zzsg zzsgVar, zzzs zzzsVar, zzvq zzvqVar, zzwg zzwgVar, zzzo zzzoVar, String str, int i, long j) {
        this.zzd = uri;
        this.zze = zzgvVar;
        this.zzf = zzsmVar;
        this.zzh = zzsgVar;
        this.zzN = zzzsVar;
        this.zzg = zzvqVar;
        this.zzi = zzwgVar;
        this.zzO = zzzoVar;
        this.zzj = i;
        this.zzl = zzvzVar;
        this.zzA = j;
        this.zzq = j != -9223372036854775807L;
        this.zzm = new zzeo(zzel.zza);
        this.zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zzwb
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzU();
            }
        };
        this.zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzwc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzE();
            }
        };
        this.zzp = zzfx.zzx(null);
        this.zzu = new zzwi[0];
        this.zzt = new zzwx[0];
        this.zzI = -9223372036854775807L;
        this.zzC = 1;
    }

    static /* bridge */ /* synthetic */ void zzC(final zzwk zzwkVar) {
        zzwkVar.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzwa
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzF();
            }
        });
    }

    private final int zzQ() {
        int iZzd = 0;
        for (zzwx zzwxVar : this.zzt) {
            iZzd += zzwxVar.zzd();
        }
        return iZzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzR(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.zzwx[] r3 = r5.zzt
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.google.android.gms.internal.ads.zzwj r4 = r5.zzy
            java.util.Objects.requireNonNull(r4)
            boolean[] r4 = r4.zzc
            boolean r4 = r4[r0]
            if (r4 == 0) goto L1f
        L15:
            r3 = r3[r0]
            long r3 = r3.zzh()
            long r1 = java.lang.Math.max(r1, r3)
        L1f:
            int r0 = r0 + 1
            goto L3
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwk.zzR(boolean):long");
    }

    private final zzaem zzS(zzwi zzwiVar) {
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            if (zzwiVar.equals(this.zzu[i])) {
                return this.zzt[i];
            }
        }
        zzwx zzwxVar = new zzwx(this.zzO, this.zzf, this.zzh);
        zzwxVar.zzu(this);
        int i2 = length + 1;
        zzwi[] zzwiVarArr = (zzwi[]) Arrays.copyOf(this.zzu, i2);
        zzwiVarArr[length] = zzwiVar;
        int i3 = zzfx.zza;
        this.zzu = zzwiVarArr;
        zzwx[] zzwxVarArr = (zzwx[]) Arrays.copyOf(this.zzt, i2);
        zzwxVarArr[length] = zzwxVar;
        this.zzt = zzwxVarArr;
        return zzwxVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzT() {
        zzek.zzf(this.zzw);
        Objects.requireNonNull(this.zzy);
        Objects.requireNonNull(this.zzz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU() {
        int i;
        if (this.zzM || this.zzw || !this.zzv || this.zzz == null) {
            return;
        }
        for (zzwx zzwxVar : this.zzt) {
            if (zzwxVar.zzi() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzt.length;
        zzcz[] zzczVarArr = new zzcz[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzam zzamVarZzi = this.zzt[i2].zzi();
            Objects.requireNonNull(zzamVarZzi);
            String str = zzamVarZzi.zzm;
            boolean zZzg = zzcb.zzg(str);
            boolean z = zZzg || zzcb.zzh(str);
            zArr[i2] = z;
            this.zzx = z | this.zzx;
            zzagm zzagmVar = this.zzs;
            if (zzagmVar != null) {
                if (zZzg || this.zzu[i2].zzb) {
                    zzby zzbyVar = zzamVarZzi.zzk;
                    zzby zzbyVar2 = zzbyVar == null ? new zzby(-9223372036854775807L, zzagmVar) : zzbyVar.zzc(zzagmVar);
                    zzak zzakVarZzb = zzamVarZzi.zzb();
                    zzakVarZzb.zzP(zzbyVar2);
                    zzamVarZzi = zzakVarZzb.zzac();
                }
                if (zZzg && zzamVarZzi.zzg == -1 && zzamVarZzi.zzh == -1 && (i = zzagmVar.zza) != -1) {
                    zzak zzakVarZzb2 = zzamVarZzi.zzb();
                    zzakVarZzb2.zzx(i);
                    zzamVarZzi = zzakVarZzb2.zzac();
                }
            }
            zzczVarArr[i2] = new zzcz(Integer.toString(i2), zzamVarZzi.zzc(this.zzf.zza(zzamVarZzi)));
        }
        this.zzy = new zzwj(new zzxk(zzczVarArr), zArr);
        this.zzw = true;
        zzve zzveVar = this.zzr;
        Objects.requireNonNull(zzveVar);
        zzveVar.zzi(this);
    }

    private final void zzV(int i) {
        zzT();
        zzwj zzwjVar = this.zzy;
        boolean[] zArr = zzwjVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzam zzamVarZzb = zzwjVar.zza.zzb(i).zzb(0);
        this.zzg.zzc(new zzvd(1, zzcb.zzb(zzamVarZzb.zzm), zzamVarZzb, 0, null, zzfx.zzu(this.zzH), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void zzW(int i) {
        zzT();
        boolean[] zArr = this.zzy.zzb;
        if (this.zzJ && zArr[i] && !this.zzt[i].zzx(false)) {
            this.zzI = 0L;
            this.zzJ = false;
            this.zzE = true;
            this.zzH = 0L;
            this.zzK = 0;
            for (zzwx zzwxVar : this.zzt) {
                zzwxVar.zzp(false);
            }
            zzve zzveVar = this.zzr;
            Objects.requireNonNull(zzveVar);
            zzveVar.zzg(this);
        }
    }

    private final void zzX() {
        zzwf zzwfVar = new zzwf(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzw) {
            zzek.zzf(zzY());
            long j = this.zzA;
            if (j != -9223372036854775807L && this.zzI > j) {
                this.zzL = true;
                this.zzI = -9223372036854775807L;
                return;
            }
            zzaef zzaefVar = this.zzz;
            Objects.requireNonNull(zzaefVar);
            zzwf.zzf(zzwfVar, zzaefVar.zzg(this.zzI).zza.zzc, this.zzI);
            for (zzwx zzwxVar : this.zzt) {
                zzwxVar.zzt(this.zzI);
            }
            this.zzI = -9223372036854775807L;
        }
        this.zzK = zzQ();
        long jZza = this.zzk.zza(zzwfVar, this, zzzs.zza(this.zzC));
        zzhb zzhbVar = zzwfVar.zzl;
        this.zzg.zzg(new zzuy(zzwfVar.zzb, zzhbVar, zzhbVar.zza, Collections.emptyMap(), jZza, 0L, 0L), new zzvd(1, -1, null, 0, null, zzfx.zzu(zzwfVar.zzk), zzfx.zzu(this.zzA)));
    }

    private final boolean zzY() {
        return this.zzI != -9223372036854775807L;
    }

    private final boolean zzZ() {
        return this.zzE || zzY();
    }

    static /* bridge */ /* synthetic */ long zzr(zzwk zzwkVar, boolean z) {
        return zzwkVar.zzR(true);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final void zzD() {
        this.zzv = true;
        this.zzp.post(this.zzn);
    }

    final /* synthetic */ void zzF() {
        this.zzG = true;
    }

    final void zzH() throws IOException {
        this.zzk.zzi(zzzs.zza(this.zzC));
    }

    final void zzI(int i) throws IOException {
        this.zzt[i].zzm();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzzt
    public final /* bridge */ /* synthetic */ void zzJ(zzzx zzzxVar, long j, long j2, boolean z) {
        zzwf zzwfVar = (zzwf) zzzxVar;
        zzhx zzhxVar = zzwfVar.zzd;
        zzuy zzuyVar = new zzuy(zzwfVar.zzb, zzwfVar.zzl, zzhxVar.zzh(), zzhxVar.zzi(), j, j2, zzhxVar.zzg());
        long unused = zzwfVar.zzb;
        this.zzg.zzd(zzuyVar, new zzvd(1, -1, null, 0, null, zzfx.zzu(zzwfVar.zzk), zzfx.zzu(this.zzA)));
        if (z) {
            return;
        }
        for (zzwx zzwxVar : this.zzt) {
            zzwxVar.zzp(false);
        }
        if (this.zzF > 0) {
            zzve zzveVar = this.zzr;
            Objects.requireNonNull(zzveVar);
            zzveVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzt
    public final /* bridge */ /* synthetic */ void zzK(zzzx zzzxVar, long j, long j2) {
        zzaef zzaefVar;
        if (this.zzA == -9223372036854775807L && (zzaefVar = this.zzz) != null) {
            boolean zZzh = zzaefVar.zzh();
            long jZzR = zzR(true);
            long j3 = jZzR == Long.MIN_VALUE ? 0L : jZzR + 10000;
            this.zzA = j3;
            this.zzi.zza(j3, zZzh, this.zzB);
        }
        zzwf zzwfVar = (zzwf) zzzxVar;
        zzhx zzhxVar = zzwfVar.zzd;
        zzuy zzuyVar = new zzuy(zzwfVar.zzb, zzwfVar.zzl, zzhxVar.zzh(), zzhxVar.zzi(), j, j2, zzhxVar.zzg());
        long unused = zzwfVar.zzb;
        this.zzg.zze(zzuyVar, new zzvd(1, -1, null, 0, null, zzfx.zzu(zzwfVar.zzk), zzfx.zzu(this.zzA)));
        this.zzL = true;
        zzve zzveVar = this.zzr;
        Objects.requireNonNull(zzveVar);
        zzveVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final void zzL() {
        for (zzwx zzwxVar : this.zzt) {
            zzwxVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzww
    public final void zzM(zzam zzamVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzN() {
        if (this.zzw) {
            for (zzwx zzwxVar : this.zzt) {
                zzwxVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzM = true;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final void zzO(final zzaef zzaefVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzwd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzG(zzaefVar);
            }
        });
    }

    final boolean zzP(int i) {
        return !zzZ() && this.zzt[i].zzx(this.zzL);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zza(long j, zzmj zzmjVar) {
        zzT();
        if (!this.zzz.zzh()) {
            return 0L;
        }
        zzaed zzaedVarZzg = this.zzz.zzg(j);
        zzaeg zzaegVar = zzaedVarZzg.zza;
        zzaeg zzaegVar2 = zzaedVarZzg.zzb;
        long j2 = zzmjVar.zzf;
        if (j2 == 0) {
            if (zzmjVar.zzg == 0) {
                return j;
            }
            j2 = 0;
        }
        long j3 = zzaegVar.zzb;
        int i = zzfx.zza;
        long j4 = j - j2;
        long j5 = zzmjVar.zzg;
        long j6 = j + j5;
        long j7 = j ^ j6;
        long j8 = j5 ^ j6;
        if (((j ^ j2) & (j ^ j4)) < 0) {
            j4 = Long.MIN_VALUE;
        }
        if ((j7 & j8) < 0) {
            j6 = Long.MAX_VALUE;
        }
        boolean z = j4 <= j3 && j3 <= j6;
        long j9 = zzaegVar2.zzb;
        boolean z2 = j4 <= j9 && j9 <= j6;
        if (z && z2) {
            if (Math.abs(j3 - j) > Math.abs(j9 - j)) {
                return j9;
            }
        } else if (!z) {
            return z2 ? j9 : j4;
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final long zzb() {
        long jZzR;
        zzT();
        if (this.zzL || this.zzF == 0) {
            return Long.MIN_VALUE;
        }
        if (zzY()) {
            return this.zzI;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            jZzR = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzwj zzwjVar = this.zzy;
                if (zzwjVar.zzb[i] && zzwjVar.zzc[i] && !this.zzt[i].zzw()) {
                    jZzR = Math.min(jZzR, this.zzt[i].zzh());
                }
            }
        } else {
            jZzR = Long.MAX_VALUE;
        }
        if (jZzR == Long.MAX_VALUE) {
            jZzR = zzR(false);
        }
        return jZzR == Long.MIN_VALUE ? this.zzH : jZzR;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzd() {
        if (!this.zzE) {
            return -9223372036854775807L;
        }
        if (!this.zzL && zzQ() <= this.zzK) {
            return -9223372036854775807L;
        }
        this.zzE = false;
        return this.zzH;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    @Override // com.google.android.gms.internal.ads.zzvf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zze(long r7) {
        /*
            r6 = this;
            r6.zzT()
            com.google.android.gms.internal.ads.zzwj r0 = r6.zzy
            boolean[] r0 = r0.zzb
            com.google.android.gms.internal.ads.zzaef r1 = r6.zzz
            boolean r1 = r1.zzh()
            r2 = 1
            if (r2 == r1) goto L12
            r7 = 0
        L12:
            r1 = 0
            r6.zzE = r1
            r6.zzH = r7
            boolean r2 = r6.zzY()
            if (r2 == 0) goto L20
            r6.zzI = r7
            return r7
        L20:
            int r2 = r6.zzC
            r3 = 7
            if (r2 == r3) goto L4e
            com.google.android.gms.internal.ads.zzwx[] r2 = r6.zzt
            int r2 = r2.length
            r3 = r1
        L29:
            if (r3 >= r2) goto L80
            com.google.android.gms.internal.ads.zzwx[] r4 = r6.zzt
            r4 = r4[r3]
            boolean r5 = r6.zzq
            if (r5 == 0) goto L3c
            int r5 = r4.zza()
            boolean r4 = r4.zzy(r5)
            goto L40
        L3c:
            boolean r4 = r4.zzz(r7, r1)
        L40:
            if (r4 != 0) goto L4b
            boolean r4 = r0[r3]
            if (r4 != 0) goto L4e
            boolean r4 = r6.zzx
            if (r4 != 0) goto L4b
            goto L4e
        L4b:
            int r3 = r3 + 1
            goto L29
        L4e:
            r6.zzJ = r1
            r6.zzI = r7
            r6.zzL = r1
            com.google.android.gms.internal.ads.zzaab r0 = r6.zzk
            boolean r2 = r0.zzl()
            if (r2 == 0) goto L6f
            com.google.android.gms.internal.ads.zzwx[] r0 = r6.zzt
            int r2 = r0.length
        L5f:
            if (r1 >= r2) goto L69
            r3 = r0[r1]
            r3.zzk()
            int r1 = r1 + 1
            goto L5f
        L69:
            com.google.android.gms.internal.ads.zzaab r0 = r6.zzk
            r0.zzg()
            goto L80
        L6f:
            r0.zzh()
            com.google.android.gms.internal.ads.zzwx[] r0 = r6.zzt
            int r2 = r0.length
            r3 = r1
        L76:
            if (r3 >= r2) goto L80
            r4 = r0[r3]
            r4.zzp(r1)
            int r3 = r3 + 1
            goto L76
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwk.zze(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    @Override // com.google.android.gms.internal.ads.zzvf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzf(com.google.android.gms.internal.ads.zzyz[] r8, boolean[] r9, com.google.android.gms.internal.ads.zzwy[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwk.zzf(com.google.android.gms.internal.ads.zzyz[], boolean[], com.google.android.gms.internal.ads.zzwy[], boolean[], long):long");
    }

    final int zzg(int i, zzlb zzlbVar, zzih zzihVar, int i2) {
        if (zzZ()) {
            return -3;
        }
        zzV(i);
        int iZze = this.zzt[i].zze(zzlbVar, zzihVar, i2, this.zzL);
        if (iZze == -3) {
            zzW(i);
        }
        return iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final zzxk zzh() {
        zzT();
        return this.zzy.zza;
    }

    final int zzi(int i, long j) {
        if (zzZ()) {
            return 0;
        }
        zzV(i);
        zzwx zzwxVar = this.zzt[i];
        int iZzc = zzwxVar.zzc(j, this.zzL);
        zzwxVar.zzv(iZzc);
        if (iZzc != 0) {
            return iZzc;
        }
        zzW(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzj(long j, boolean z) {
        if (this.zzq) {
            return;
        }
        zzT();
        if (zzY()) {
            return;
        }
        boolean[] zArr = this.zzy.zzc;
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            this.zzt[i].zzj(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzk() throws IOException {
        zzH();
        if (this.zzL && !this.zzw) {
            throw zzcc.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzl(zzve zzveVar, long j) {
        this.zzr = zzveVar;
        this.zzm.zze();
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final boolean zzo(zzlg zzlgVar) {
        if (this.zzL) {
            return false;
        }
        zzaab zzaabVar = this.zzk;
        if (zzaabVar.zzk() || this.zzJ) {
            return false;
        }
        if (this.zzw && this.zzF == 0) {
            return false;
        }
        boolean zZze = this.zzm.zze();
        if (zzaabVar.zzl()) {
            return zZze;
        }
        zzX();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzzt
    public final /* bridge */ /* synthetic */ zzzv zzu(zzzx zzzxVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        zzzv zzzvVarZzb;
        zzaef zzaefVar;
        zzwf zzwfVar = (zzwf) zzzxVar;
        zzhx zzhxVar = zzwfVar.zzd;
        zzuy zzuyVar = new zzuy(zzwfVar.zzb, zzwfVar.zzl, zzhxVar.zzh(), zzhxVar.zzi(), j, j2, zzhxVar.zzg());
        long unused = zzwfVar.zzk;
        int i2 = zzfx.zza;
        if ((iOException instanceof zzcc) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzho) || (iOException instanceof zzaaa)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof zzgw) && ((zzgw) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            zzzvVarZzb = zzaab.zzd;
        } else {
            int iZzQ = zzQ();
            boolean z = iZzQ > this.zzK;
            if (this.zzG || !((zzaefVar = this.zzz) == null || zzaefVar.zza() == -9223372036854775807L)) {
                this.zzK = iZzQ;
            } else {
                boolean z2 = this.zzw;
                if (!z2 || zzZ()) {
                    this.zzE = z2;
                    this.zzH = 0L;
                    this.zzK = 0;
                    for (zzwx zzwxVar : this.zzt) {
                        zzwxVar.zzp(false);
                    }
                    zzwf.zzf(zzwfVar, 0L, 0L);
                } else {
                    this.zzJ = true;
                    zzzvVarZzb = zzaab.zzc;
                }
            }
            zzzvVarZzb = zzaab.zzb(z, jMin);
        }
        boolean z3 = !zzzvVarZzb.zzc();
        this.zzg.zzf(zzuyVar, new zzvd(1, -1, null, 0, null, zzfx.zzu(zzwfVar.zzk), zzfx.zzu(this.zzA)), iOException, z3);
        if (z3) {
            long unused2 = zzwfVar.zzb;
        }
        return zzzvVarZzb;
    }

    final zzaem zzv() {
        return zzS(new zzwi(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzaem zzw(int i, int i2) {
        return zzS(new zzwi(i, false));
    }

    final /* synthetic */ void zzE() {
        if (this.zzM) {
            return;
        }
        zzve zzveVar = this.zzr;
        Objects.requireNonNull(zzveVar);
        zzveVar.zzg(this);
    }

    final /* synthetic */ void zzG(zzaef zzaefVar) {
        this.zzz = this.zzs == null ? zzaefVar : new zzaee(-9223372036854775807L, 0L);
        if (zzaefVar.zza() == -9223372036854775807L && this.zzA != -9223372036854775807L) {
            this.zzz = new zzwe(this, this.zzz);
        }
        this.zzA = this.zzz.zza();
        boolean z = false;
        if (!this.zzG && zzaefVar.zza() == -9223372036854775807L) {
            z = true;
        }
        this.zzB = z;
        this.zzC = true == z ? 7 : 1;
        this.zzi.zza(this.zzA, zzaefVar.zzh(), this.zzB);
        if (this.zzw) {
            return;
        }
        zzU();
    }
}
