package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcfn implements zzgv {
    private final zzgv zza;
    private final long zzb;
    private final zzgv zzc;
    private long zzd;
    private Uri zze;

    zzcfn(zzgv zzgvVar, int i, zzgv zzgvVar2) {
        this.zza = zzgvVar;
        this.zzb = i;
        this.zzc = zzgvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int iZza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + iZza;
            this.zzd = j3;
            i3 = iZza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.zzb) {
            return i3;
        }
        int iZza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
        int i4 = i3 + iZza2;
        this.zzd += iZza2;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final long zzb(zzhb zzhbVar) throws IOException {
        zzhb zzhbVar2;
        this.zze = zzhbVar.zza;
        long j = zzhbVar.zze;
        long j2 = this.zzb;
        zzhb zzhbVar3 = null;
        if (j >= j2) {
            zzhbVar2 = null;
        } else {
            long j3 = zzhbVar.zzf;
            long jMin = j2 - j;
            if (j3 != -1) {
                jMin = Math.min(j3, jMin);
            }
            zzhbVar2 = new zzhb(zzhbVar.zza, j, jMin, null);
        }
        long j4 = zzhbVar.zzf;
        if (j4 == -1 || zzhbVar.zze + j4 > this.zzb) {
            long jMax = Math.max(this.zzb, zzhbVar.zze);
            long j5 = zzhbVar.zzf;
            zzhbVar3 = new zzhb(zzhbVar.zza, jMax, j5 != -1 ? Math.min(j5, (zzhbVar.zze + j5) - this.zzb) : -1L, null);
        }
        long jZzb = zzhbVar2 != null ? this.zza.zzb(zzhbVar2) : 0L;
        long jZzb2 = zzhbVar3 != null ? this.zzc.zzb(zzhbVar3) : 0L;
        this.zzd = zzhbVar.zze;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final Map zze() {
        return zzfzq.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final void zzf(zzhy zzhyVar) {
    }
}
