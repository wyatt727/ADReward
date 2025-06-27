package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import com.json.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzos implements zzmp {
    private final zzel zza;
    private final zzcu zzb;
    private final zzcw zzc;
    private final zzor zzd;
    private final SparseArray zze;
    private zzfb zzf;
    private zzco zzg;
    private zzev zzh;
    private boolean zzi;

    public static /* synthetic */ void zzV(zzos zzosVar) {
        final zzmq zzmqVarZzT = zzosVar.zzT();
        zzosVar.zzY(zzmqVarZzT, 1028, new zzey() { // from class: com.google.android.gms.internal.ads.zzmu
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
        zzosVar.zzf.zze();
    }

    private final zzmq zzaa(int i, zzvh zzvhVar) {
        zzco zzcoVar = this.zzg;
        Objects.requireNonNull(zzcoVar);
        if (zzvhVar != null) {
            return this.zzd.zza(zzvhVar) != null ? zzZ(zzvhVar) : zzU(zzcx.zza, i, zzvhVar);
        }
        zzcx zzcxVarZzn = zzcoVar.zzn();
        if (i >= zzcxVarZzn.zzc()) {
            zzcxVarZzn = zzcx.zza;
        }
        return zzU(zzcxVarZzn, i, null);
    }

    private final zzmq zzab() {
        return zzZ(this.zzd.zzd());
    }

    private final zzmq zzac() {
        return zzZ(this.zzd.zze());
    }

    private final zzmq zzad(zzce zzceVar) {
        zzvh zzvhVar;
        return (!(zzceVar instanceof zziz) || (zzvhVar = ((zziz) zzceVar).zzj) == null) ? zzT() : zzZ(zzvhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzA(final zzam zzamVar, final zzis zzisVar) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 1009, new zzey() { // from class: com.google.android.gms.internal.ads.zzog
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                ((zzms) obj).zze(zzmqVarZzac, zzamVar, zzisVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzB(final long j) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 1010, new zzey(j) { // from class: com.google.android.gms.internal.ads.zznk
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzC(final Exception exc) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 1014, new zzey() { // from class: com.google.android.gms.internal.ads.zzoo
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzD(final zzqh zzqhVar) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, new zzey() { // from class: com.google.android.gms.internal.ads.zzod
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzE(final zzqh zzqhVar) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, new zzey() { // from class: com.google.android.gms.internal.ads.zzon
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzF(final int i, final long j, final long j2) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 1011, new zzey(i, j, j2) { // from class: com.google.android.gms.internal.ads.zzng
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzG(final int i, final long j) {
        final zzmq zzmqVarZzab = zzab();
        zzY(zzmqVarZzab, 1018, new zzey() { // from class: com.google.android.gms.internal.ads.zznq
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                ((zzms) obj).zzh(zzmqVarZzab, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzH(final Object obj, final long j) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 26, new zzey() { // from class: com.google.android.gms.internal.ads.zzok
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj2) {
                ((zzms) obj2).zzn(zzmqVarZzac, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzI(final Exception exc) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 1030, new zzey() { // from class: com.google.android.gms.internal.ads.zznf
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzJ(final String str, final long j, final long j2) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 1016, new zzey(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzom
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzK(final String str) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 1019, new zzey() { // from class: com.google.android.gms.internal.ads.zznp
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzL(final zzir zzirVar) {
        final zzmq zzmqVarZzab = zzab();
        zzY(zzmqVarZzab, 1020, new zzey() { // from class: com.google.android.gms.internal.ads.zzoc
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                ((zzms) obj).zzo(zzmqVarZzab, zzirVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzM(final zzir zzirVar) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 1015, new zzey() { // from class: com.google.android.gms.internal.ads.zzoi
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzN(final long j, final int i) {
        final zzmq zzmqVarZzab = zzab();
        zzY(zzmqVarZzab, 1021, new zzey(j, i) { // from class: com.google.android.gms.internal.ads.zznu
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzO(final zzam zzamVar, final zzis zzisVar) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 1017, new zzey() { // from class: com.google.android.gms.internal.ads.zzob
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                ((zzms) obj).zzp(zzmqVarZzac, zzamVar, zzisVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzP() {
        zzev zzevVar = this.zzh;
        zzek.zzb(zzevVar);
        zzevVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoj
            @Override // java.lang.Runnable
            public final void run() {
                zzos.zzV(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzQ(zzms zzmsVar) {
        this.zzf.zzf(zzmsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzR(final zzco zzcoVar, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzb.isEmpty()) {
            z = false;
        }
        zzek.zzf(z);
        Objects.requireNonNull(zzcoVar);
        this.zzg = zzcoVar;
        this.zzh = this.zza.zzb(looper, null);
        this.zzf = this.zzf.zza(looper, new zzez() { // from class: com.google.android.gms.internal.ads.zzni
            @Override // com.google.android.gms.internal.ads.zzez
            public final void zza(Object obj, zzah zzahVar) {
                this.zza.zzW(zzcoVar, (zzms) obj, zzahVar);
            }
        });
    }

    protected final zzmq zzT() {
        return zzZ(this.zzd.zzb());
    }

    @RequiresNonNull({"player"})
    protected final zzmq zzU(zzcx zzcxVar, int i, zzvh zzvhVar) {
        zzvh zzvhVar2 = true == zzcxVar.zzo() ? null : zzvhVar;
        long jZza = this.zza.zza();
        boolean z = zzcxVar.equals(this.zzg.zzn()) && i == this.zzg.zzd();
        long jZzu = 0;
        if (zzvhVar2 == null || !zzvhVar2.zzb()) {
            if (z) {
                jZzu = this.zzg.zzj();
            } else if (!zzcxVar.zzo()) {
                long j = zzcxVar.zze(i, this.zzc, 0L).zzn;
                jZzu = zzfx.zzu(0L);
            }
        } else if (z && this.zzg.zzb() == zzvhVar2.zzb && this.zzg.zzc() == zzvhVar2.zzc) {
            jZzu = this.zzg.zzk();
        }
        return new zzmq(jZza, zzcxVar, i, zzvhVar2, jZzu, this.zzg.zzn(), this.zzg.zzd(), this.zzd.zzb(), this.zzg.zzk(), this.zzg.zzm());
    }

    final /* synthetic */ void zzW(zzco zzcoVar, zzms zzmsVar, zzah zzahVar) {
        zzmsVar.zzi(zzcoVar, new zzmr(zzahVar, this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final void zzX(final int i, final long j, final long j2) {
        final zzmq zzmqVarZzZ = zzZ(this.zzd.zzc());
        zzY(zzmqVarZzZ, 1006, new zzey() { // from class: com.google.android.gms.internal.ads.zznd
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                ((zzms) obj).zzf(zzmqVarZzZ, i, j, j2);
            }
        });
    }

    protected final void zzY(zzmq zzmqVar, int i, zzey zzeyVar) {
        this.zze.put(i, zzmqVar);
        zzfb zzfbVar = this.zzf;
        zzfbVar.zzd(i, zzeyVar);
        zzfbVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zza(final zzck zzckVar) {
        final zzmq zzmqVarZzT = zzT();
        zzY(zzmqVarZzT, 13, new zzey() { // from class: com.google.android.gms.internal.ads.zzmz
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzae(int i, zzvh zzvhVar, final zzvd zzvdVar) {
        final zzmq zzmqVarZzaa = zzaa(i, zzvhVar);
        zzY(zzmqVarZzaa, 1004, new zzey() { // from class: com.google.android.gms.internal.ads.zznv
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                ((zzms) obj).zzg(zzmqVarZzaa, zzvdVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzaf(int i, zzvh zzvhVar, final zzuy zzuyVar, final zzvd zzvdVar) {
        final zzmq zzmqVarZzaa = zzaa(i, zzvhVar);
        zzY(zzmqVarZzaa, 1002, new zzey() { // from class: com.google.android.gms.internal.ads.zznw
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzag(int i, zzvh zzvhVar, final zzuy zzuyVar, final zzvd zzvdVar) {
        final zzmq zzmqVarZzaa = zzaa(i, zzvhVar);
        zzY(zzmqVarZzaa, 1001, new zzey() { // from class: com.google.android.gms.internal.ads.zzoa
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzah(int i, zzvh zzvhVar, final zzuy zzuyVar, final zzvd zzvdVar, final IOException iOException, final boolean z) {
        final zzmq zzmqVarZzaa = zzaa(i, zzvhVar);
        zzY(zzmqVarZzaa, 1003, new zzey() { // from class: com.google.android.gms.internal.ads.zznh
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                ((zzms) obj).zzj(zzmqVarZzaa, zzuyVar, zzvdVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzai(int i, zzvh zzvhVar, final zzuy zzuyVar, final zzvd zzvdVar) {
        final zzmq zzmqVarZzaa = zzaa(i, zzvhVar);
        zzY(zzmqVarZzaa, 1000, new zzey() { // from class: com.google.android.gms.internal.ads.zzmy
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzb(final boolean z) {
        final zzmq zzmqVarZzT = zzT();
        zzY(zzmqVarZzT, 3, new zzey(z) { // from class: com.google.android.gms.internal.ads.zzmw
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzc(final boolean z) {
        final zzmq zzmqVarZzT = zzT();
        zzY(zzmqVarZzT, 7, new zzey(z) { // from class: com.google.android.gms.internal.ads.zznl
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzd(final zzbp zzbpVar, final int i) {
        final zzmq zzmqVarZzT = zzT();
        zzY(zzmqVarZzT, 1, new zzey(zzbpVar, i) { // from class: com.google.android.gms.internal.ads.zznb
            public final /* synthetic */ zzbp zzb;

            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zze(final zzbv zzbvVar) {
        final zzmq zzmqVarZzT = zzT();
        zzY(zzmqVarZzT, 14, new zzey() { // from class: com.google.android.gms.internal.ads.zzop
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzf(final boolean z, final int i) {
        final zzmq zzmqVarZzT = zzT();
        zzY(zzmqVarZzT, 5, new zzey(z, i) { // from class: com.google.android.gms.internal.ads.zzns
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzg(final zzcg zzcgVar) {
        final zzmq zzmqVarZzT = zzT();
        zzY(zzmqVarZzT, 12, new zzey() { // from class: com.google.android.gms.internal.ads.zzmt
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzh(final int i) {
        final zzmq zzmqVarZzT = zzT();
        zzY(zzmqVarZzT, 4, new zzey() { // from class: com.google.android.gms.internal.ads.zznz
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                ((zzms) obj).zzk(zzmqVarZzT, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzi(final int i) {
        final zzmq zzmqVarZzT = zzT();
        zzY(zzmqVarZzT, 6, new zzey(i) { // from class: com.google.android.gms.internal.ads.zzno
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzj(final zzce zzceVar) {
        final zzmq zzmqVarZzad = zzad(zzceVar);
        zzY(zzmqVarZzad, 10, new zzey() { // from class: com.google.android.gms.internal.ads.zznx
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                ((zzms) obj).zzl(zzmqVarZzad, zzceVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzk(final zzce zzceVar) {
        final zzmq zzmqVarZzad = zzad(zzceVar);
        zzY(zzmqVarZzad, 10, new zzey() { // from class: com.google.android.gms.internal.ads.zznr
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzl(final boolean z, final int i) {
        final zzmq zzmqVarZzT = zzT();
        zzY(zzmqVarZzT, -1, new zzey(z, i) { // from class: com.google.android.gms.internal.ads.zznj
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzn(final boolean z) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 23, new zzey(z) { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzo(final int i, final int i2) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 24, new zzey(i, i2) { // from class: com.google.android.gms.internal.ads.zzoq
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzq(final zzdk zzdkVar) {
        final zzmq zzmqVarZzT = zzT();
        zzY(zzmqVarZzT, 2, new zzey() { // from class: com.google.android.gms.internal.ads.zznm
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzr(final zzdp zzdpVar) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 25, new zzey() { // from class: com.google.android.gms.internal.ads.zzoe
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                zzmq zzmqVar = zzmqVarZzac;
                zzdp zzdpVar2 = zzdpVar;
                ((zzms) obj).zzq(zzmqVar, zzdpVar2);
                int i = zzdpVar2.zzc;
                int i2 = zzdpVar2.zzd;
                int i3 = zzdpVar2.zze;
                float f = zzdpVar2.zzf;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzs(final float f) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 22, new zzey(f) { // from class: com.google.android.gms.internal.ads.zzne
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzt(zzms zzmsVar) {
        this.zzf.zzb(zzmsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzu() {
        if (this.zzi) {
            return;
        }
        final zzmq zzmqVarZzT = zzT();
        this.zzi = true;
        zzY(zzmqVarZzT, -1, new zzey() { // from class: com.google.android.gms.internal.ads.zzof
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzv(final Exception exc) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 1029, new zzey() { // from class: com.google.android.gms.internal.ads.zzol
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzw(final String str, final long j, final long j2) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 1008, new zzey(str, j2, j) { // from class: com.google.android.gms.internal.ads.zznn
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzx(final String str) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 1012, new zzey() { // from class: com.google.android.gms.internal.ads.zzmx
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzy(final zzir zzirVar) {
        final zzmq zzmqVarZzab = zzab();
        zzY(zzmqVarZzab, 1013, new zzey() { // from class: com.google.android.gms.internal.ads.zzny
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzz(final zzir zzirVar) {
        final zzmq zzmqVarZzac = zzac();
        zzY(zzmqVarZzac, 1007, new zzey() { // from class: com.google.android.gms.internal.ads.zzmv
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    private final zzmq zzZ(zzvh zzvhVar) {
        Objects.requireNonNull(this.zzg);
        zzcx zzcxVarZza = zzvhVar == null ? null : this.zzd.zza(zzvhVar);
        if (zzvhVar != null && zzcxVarZza != null) {
            return zzU(zzcxVarZza, zzcxVarZza.zzn(zzvhVar.zza, this.zzb).zzd, zzvhVar);
        }
        int iZzd = this.zzg.zzd();
        zzcx zzcxVarZzn = this.zzg.zzn();
        if (iZzd >= zzcxVarZzn.zzc()) {
            zzcxVarZzn = zzcx.zza;
        }
        return zzU(zzcxVarZzn, iZzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzS(List list, zzvh zzvhVar) {
        zzco zzcoVar = this.zzg;
        Objects.requireNonNull(zzcoVar);
        this.zzd.zzh(list, zzvhVar, zzcoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzm(final zzcn zzcnVar, final zzcn zzcnVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzor zzorVar = this.zzd;
        zzco zzcoVar = this.zzg;
        Objects.requireNonNull(zzcoVar);
        zzorVar.zzg(zzcoVar);
        final zzmq zzmqVarZzT = zzT();
        zzY(zzmqVarZzT, 11, new zzey() { // from class: com.google.android.gms.internal.ads.zzoh
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                ((zzms) obj).zzm(zzmqVarZzT, zzcnVar, zzcnVar2, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcl
    public final void zzp(zzcx zzcxVar, final int i) {
        zzco zzcoVar = this.zzg;
        Objects.requireNonNull(zzcoVar);
        this.zzd.zzi(zzcoVar);
        final zzmq zzmqVarZzT = zzT();
        zzY(zzmqVarZzT, 0, new zzey(i) { // from class: com.google.android.gms.internal.ads.zzna
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
            }
        });
    }

    public zzos(zzel zzelVar) {
        Objects.requireNonNull(zzelVar);
        this.zza = zzelVar;
        this.zzf = new zzfb(zzfx.zzy(), zzelVar, new zzez() { // from class: com.google.android.gms.internal.ads.zznt
            @Override // com.google.android.gms.internal.ads.zzez
            public final void zza(Object obj, zzah zzahVar) {
            }
        });
        zzcu zzcuVar = new zzcu();
        this.zzb = zzcuVar;
        this.zzc = new zzcw();
        this.zzd = new zzor(zzcuVar);
        this.zze = new SparseArray();
    }
}
