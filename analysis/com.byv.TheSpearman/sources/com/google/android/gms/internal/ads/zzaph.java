package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaph implements zzapg {
    private final zzadi zza;
    private final zzaem zzb;
    private final zzapj zzc;
    private final zzam zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaph(zzadi zzadiVar, zzaem zzaemVar, zzapj zzapjVar, String str, int i) throws zzcc {
        this.zza = zzadiVar;
        this.zzb = zzaemVar;
        this.zzc = zzapjVar;
        int i2 = zzapjVar.zzb * zzapjVar.zze;
        int i3 = zzapjVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw zzcc.zza("Expected block size: " + i4 + "; got: " + i3, null);
        }
        int i5 = zzapjVar.zzc * i4;
        int i6 = i5 * 8;
        int iMax = Math.max(i4, i5 / 10);
        this.zze = iMax;
        zzak zzakVar = new zzak();
        zzakVar.zzW(str);
        zzakVar.zzx(i6);
        zzakVar.zzR(i6);
        zzakVar.zzO(iMax);
        zzakVar.zzy(zzapjVar.zzb);
        zzakVar.zzX(zzapjVar.zzc);
        zzakVar.zzQ(i);
        this.zzd = zzakVar.zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zza(int i, long j) {
        this.zza.zzO(new zzapm(this.zzc, 1, i, j));
        this.zzb.zzl(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final boolean zzc(zzadg zzadgVar, long j) throws IOException {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int iZza = zzaek.zza(this.zzb, zzadgVar, (int) Math.min(i2 - i, j2), true);
            if (iZza == -1) {
                j2 = 0;
            } else {
                this.zzg += iZza;
                j2 -= iZza;
            }
        }
        zzapj zzapjVar = this.zzc;
        int i3 = this.zzg;
        int i4 = zzapjVar.zzd;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jZzt = this.zzf + zzfx.zzt(this.zzh, 1000000L, zzapjVar.zzc, RoundingMode.FLOOR);
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zzs(jZzt, 1, i6, i7, null);
            this.zzh += i5;
            this.zzg = i7;
        }
        return j2 <= 0;
    }
}
