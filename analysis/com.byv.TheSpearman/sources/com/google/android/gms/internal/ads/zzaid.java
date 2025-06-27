package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaid implements zzaif {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzaim zzc = new zzaim();
    private zzaie zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzadg zzadgVar, int i) throws IOException {
        ((zzact) zzadgVar).zzn(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zza[i2] & 255);
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaif
    public final void zza(zzaie zzaieVar) {
        this.zzd = zzaieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaif
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2 A[LOOP:0: B:3:0x0005->B:36:0x00b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016b A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzadg r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaid.zzc(com.google.android.gms.internal.ads.zzadg):boolean");
    }
}
