package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzanw {
    private final zzaem zza;
    private final zzgm zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final zzanv zzi = new zzanv(null);
    private final zzanv zzj = new zzanv(null);
    private boolean zzk = false;

    public zzanw(zzaem zzaemVar, boolean z, boolean z2) {
        this.zza = zzaemVar;
        byte[] bArr = new byte[128];
        this.zze = bArr;
        this.zzd = new zzgm(bArr, 0, 0);
    }

    private final void zzg(int i) {
        long j = this.zzm;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.zzn;
        long j2 = this.zzg - this.zzl;
        this.zza.zzs(j, z ? 1 : 0, (int) j2, i, null);
    }

    public final void zza(long j) {
        this.zzg = j;
        zzg(0);
        this.zzk = false;
    }

    public final void zzb(zzgj zzgjVar) {
        this.zzc.append(zzgjVar.zza, zzgjVar);
    }

    public final void zzc(zzgk zzgkVar) {
        this.zzb.append(zzgkVar.zzd, zzgkVar);
    }

    public final void zzd() {
        this.zzk = false;
    }

    public final void zze(long j, int i, long j2, boolean z) {
        this.zzf = i;
        this.zzh = j2;
        this.zzg = j;
        this.zzo = z;
    }

    public final boolean zzf(long j, int i, boolean z) {
        boolean z2 = false;
        if (this.zzf == 9) {
            if (z && this.zzk) {
                zzg(i + ((int) (j - this.zzg)));
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z3 = this.zzo;
        boolean z4 = this.zzn;
        int i2 = this.zzf;
        if (i2 == 5 || (z3 && i2 == 1)) {
            z2 = true;
        }
        boolean z5 = z4 | z2;
        this.zzn = z5;
        return z5;
    }
}
