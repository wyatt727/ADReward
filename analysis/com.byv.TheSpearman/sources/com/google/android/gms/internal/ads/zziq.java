package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zziq implements zzmf, zzmh {
    private final int zzb;
    private zzmi zzd;
    private int zze;
    private zzpb zzf;
    private zzel zzg;
    private int zzh;
    private zzwy zzi;
    private zzam[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzmg zzq;
    private final Object zza = new Object();
    private final zzlb zzc = new zzlb();
    private long zzm = Long.MIN_VALUE;
    private zzcx zzp = zzcx.zza;

    public zziq(int i) {
        this.zzb = i;
    }

    private final void zzZ(long j, boolean z) throws zziz {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        zzz(j, z);
    }

    protected void zzA() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzB() {
        zzmg zzmgVar;
        synchronized (this.zza) {
            zzmgVar = this.zzq;
        }
        if (zzmgVar != null) {
            zzmgVar.zza(this);
        }
    }

    protected void zzC() {
    }

    protected void zzD() throws zziz {
    }

    protected void zzE() {
    }

    protected void zzF(zzam[] zzamVarArr, long j, long j2, zzvh zzvhVar) throws zziz {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzG() {
        zzek.zzf(this.zzh == 0);
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzH(zzam[] zzamVarArr, zzwy zzwyVar, long j, long j2, zzvh zzvhVar) throws zziz {
        zzek.zzf(!this.zzn);
        this.zzi = zzwyVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzamVarArr;
        this.zzk = j2;
        zzF(zzamVarArr, j, j2, zzvhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzI() {
        zzek.zzf(this.zzh == 0);
        zzlb zzlbVar = this.zzc;
        zzlbVar.zzb = null;
        zzlbVar.zza = null;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzJ(long j) throws zziz {
        zzZ(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzK() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zzL(zzmg zzmgVar) {
        synchronized (this.zza) {
            this.zzq = zzmgVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public /* synthetic */ void zzM(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzN(zzcx zzcxVar) {
        if (zzfx.zzG(this.zzp, zzcxVar)) {
            return;
        }
        this.zzp = zzcxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzO() throws zziz {
        zzek.zzf(this.zzh == 1);
        this.zzh = 2;
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzP() {
        zzek.zzf(this.zzh == 2);
        this.zzh = 1;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final boolean zzQ() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final boolean zzR() {
        return this.zzn;
    }

    protected final zzam[] zzT() {
        zzam[] zzamVarArr = this.zzj;
        Objects.requireNonNull(zzamVarArr);
        return zzamVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzmf, com.google.android.gms.internal.ads.zzmh
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final int zzcU() {
        return this.zzh;
    }

    protected final int zzcV(zzlb zzlbVar, zzih zzihVar, int i) {
        zzwy zzwyVar = this.zzi;
        Objects.requireNonNull(zzwyVar);
        int iZza = zzwyVar.zza(zzlbVar, zzihVar, i);
        if (iZza == -4) {
            if (zzihVar.zzf()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j = zzihVar.zze + this.zzk;
            zzihVar.zze = j;
            this.zzm = Math.max(this.zzm, j);
        } else if (iZza == -5) {
            zzam zzamVar = zzlbVar.zza;
            Objects.requireNonNull(zzamVar);
            long j2 = zzamVar.zzq;
            if (j2 != Long.MAX_VALUE) {
                zzak zzakVarZzb = zzamVar.zzb();
                zzakVarZzb.zzaa(j2 + this.zzk);
                zzlbVar.zza = zzakVarZzb.zzac();
                return -5;
            }
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final long zzcW() {
        return this.zzm;
    }

    protected final zzlb zzcX() {
        zzlb zzlbVar = this.zzc;
        zzlbVar.zzb = null;
        zzlbVar.zza = null;
        return zzlbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public int zze() throws zziz {
        return 0;
    }

    protected final long zzf() {
        return this.zzl;
    }

    protected final zzel zzh() {
        zzel zzelVar = this.zzg;
        Objects.requireNonNull(zzelVar);
        return zzelVar;
    }

    protected final zziz zzi(Throwable th, zzam zzamVar, boolean z, int i) {
        int iZzY = 4;
        if (zzamVar != null && !this.zzo) {
            this.zzo = true;
            try {
                iZzY = zzY(zzamVar) & 7;
            } catch (zziz unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zziz.zzb(th, zzU(), this.zze, zzamVar, iZzY, z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public zzlh zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final zzmh zzl() {
        return this;
    }

    protected final zzmi zzm() {
        zzmi zzmiVar = this.zzd;
        Objects.requireNonNull(zzmiVar);
        return zzmiVar;
    }

    protected final zzpb zzn() {
        zzpb zzpbVar = this.zzf;
        Objects.requireNonNull(zzpbVar);
        return zzpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final zzwy zzo() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zzp() {
        synchronized (this.zza) {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzq() {
        zzek.zzf(this.zzh == 1);
        zzlb zzlbVar = this.zzc;
        zzlbVar.zzb = null;
        zzlbVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzr(zzmi zzmiVar, zzam[] zzamVarArr, zzwy zzwyVar, long j, boolean z, boolean z2, long j2, long j3, zzvh zzvhVar) throws zziz {
        zzek.zzf(this.zzh == 0);
        this.zzd = zzmiVar;
        this.zzh = 1;
        zzx(z, z2);
        zzH(zzamVarArr, zzwyVar, j2, j3, zzvhVar);
        zzZ(j2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public /* synthetic */ void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public void zzt(int i, Object obj) throws zziz {
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzu(int i, zzpb zzpbVar, zzel zzelVar) {
        this.zze = i;
        this.zzf = zzpbVar;
        this.zzg = zzelVar;
        zzy();
    }

    protected void zzw() {
        throw null;
    }

    protected void zzx(boolean z, boolean z2) throws zziz {
    }

    protected void zzy() {
    }

    protected void zzz(long j, boolean z) throws zziz {
        throw null;
    }

    protected final boolean zzS() {
        if (zzQ()) {
            return this.zzn;
        }
        zzwy zzwyVar = this.zzi;
        Objects.requireNonNull(zzwyVar);
        return zzwyVar.zze();
    }

    protected final int zzd(long j) {
        zzwy zzwyVar = this.zzi;
        Objects.requireNonNull(zzwyVar);
        return zzwyVar.zzb(j - this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzv() throws IOException {
        zzwy zzwyVar = this.zzi;
        Objects.requireNonNull(zzwyVar);
        zzwyVar.zzd();
    }
}
