package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzvc extends zzxm {
    private final boolean zzb;
    private final zzcw zzc;
    private final zzcu zzd;
    private zzva zze;
    private zzuz zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzvc(zzvj zzvjVar, boolean z) {
        boolean z2;
        super(zzvjVar);
        if (z) {
            zzvjVar.zzv();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzcw();
        this.zzd = new zzcu();
        zzvjVar.zzM();
        this.zze = zzva.zzq(zzvjVar.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zzf == null || !obj.equals(zzva.zzd)) ? obj : this.zze.zzf;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final void zzL(long j) {
        zzuz zzuzVar = this.zzf;
        int iZza = this.zze.zza(zzuzVar.zza.zza);
        if (iZza == -1) {
            return;
        }
        zzva zzvaVar = this.zze;
        zzcu zzcuVar = this.zzd;
        zzvaVar.zzd(iZza, zzcuVar, false);
        long j2 = zzcuVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzuzVar.zzs(j);
    }

    public final zzcx zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    protected final zzvh zzD(zzvh zzvhVar) {
        Object obj = this.zze.zzf;
        Object obj2 = zzvhVar.zza;
        if (obj != null && this.zze.zzf.equals(obj2)) {
            obj2 = zzva.zzd;
        }
        return zzvhVar.zza(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.zzxm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzE(com.google.android.gms.internal.ads.zzcx r15) {
        /*
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzva r0 = r14.zze
            com.google.android.gms.internal.ads.zzva r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zzuz r15 = r14.zzf
            if (r15 == 0) goto L9b
            long r2 = r15.zzn()
            r14.zzL(r2)
            goto L9b
        L1a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L36
            boolean r0 = r14.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzva r0 = r14.zze
            com.google.android.gms.internal.ads.zzva r15 = r0.zzp(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzcw.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzva.zzd
            com.google.android.gms.internal.ads.zzva r15 = com.google.android.gms.internal.ads.zzva.zzr(r15, r0, r2)
        L33:
            r14.zze = r15
            goto L9b
        L36:
            com.google.android.gms.internal.ads.zzcw r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzcw r0 = r14.zzc
            java.lang.Object r0 = r0.zzc
            com.google.android.gms.internal.ads.zzuz r5 = r14.zzf
            if (r5 == 0) goto L62
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zzva r8 = r14.zze
            com.google.android.gms.internal.ads.zzcu r9 = r14.zzd
            com.google.android.gms.internal.ads.zzvh r5 = r5.zza
            java.lang.Object r5 = r5.zza
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zzva r5 = r14.zze
            com.google.android.gms.internal.ads.zzcw r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.zzcw r9 = r14.zzc
            com.google.android.gms.internal.ads.zzcu r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.zzva r0 = r14.zze
            com.google.android.gms.internal.ads.zzva r15 = r0.zzp(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.zzva r15 = com.google.android.gms.internal.ads.zzva.zzr(r15, r0, r3)
        L86:
            r14.zze = r15
            com.google.android.gms.internal.ads.zzuz r15 = r14.zzf
            if (r15 == 0) goto L9b
            r14.zzL(r4)
            com.google.android.gms.internal.ads.zzvh r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzK(r0)
            com.google.android.gms.internal.ads.zzvh r1 = r15.zza(r0)
        L9b:
            r15 = 1
            r14.zzi = r15
            r14.zzh = r15
            com.google.android.gms.internal.ads.zzva r15 = r14.zze
            r14.zzo(r15)
            if (r1 == 0) goto Laf
            com.google.android.gms.internal.ads.zzuz r15 = r14.zzf
            java.util.Objects.requireNonNull(r15)
            r15.zzr(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvc.zzE(com.google.android.gms.internal.ads.zzcx):void");
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzF() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzB(null, ((zzxm) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzvj
    public final void zzG(zzvf zzvfVar) {
        ((zzuz) zzvfVar).zzt();
        if (zzvfVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzvj
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final zzuz zzI(zzvh zzvhVar, zzzo zzzoVar, long j) {
        zzuz zzuzVar = new zzuz(zzvhVar, zzzoVar, j);
        zzuzVar.zzu(this.zza);
        if (this.zzh) {
            zzuzVar.zzr(zzvhVar.zza(zzK(zzvhVar.zza)));
        } else {
            this.zzf = zzuzVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzxm) this).zza);
            }
        }
        return zzuzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzuh
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzuh, com.google.android.gms.internal.ads.zzvj
    public final void zzt(zzbp zzbpVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzxh(this.zze.zzc, zzbpVar));
        } else {
            this.zze = zzva.zzq(zzbpVar);
        }
        this.zza.zzt(zzbpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzvj
    public final void zzz() {
    }
}
