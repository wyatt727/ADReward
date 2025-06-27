package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzanx implements zzano {
    private final zzaop zza;
    private long zze;
    private String zzg;
    private zzaem zzh;
    private zzanw zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaod zzb = new zzaod(7, 128);
    private final zzaod zzc = new zzaod(8, 128);
    private final zzaod zzd = new zzaod(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzfo zzm = new zzfo();

    public zzanx(zzaop zzaopVar, boolean z, boolean z2) {
        this.zza = zzaopVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i, i2);
            this.zzc.zza(bArr, i, i2);
        }
        this.zzd.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    @Override // com.google.android.gms.internal.ads.zzano
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzfo r19) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanx.zza(com.google.android.gms.internal.ads.zzfo):void");
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        zzapaVar.zzc();
        this.zzg = zzapaVar.zzb();
        zzaem zzaemVarZzw = zzadiVar.zzw(zzapaVar.zza(), 2);
        this.zzh = zzaemVarZzw;
        this.zzi = new zzanw(zzaemVarZzw, false, false);
        this.zza.zzb(zzadiVar, zzapaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzc(boolean z) {
        zzek.zzb(this.zzh);
        int i = zzfx.zza;
        if (z) {
            this.zzi.zza(this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzd(long j, int i) {
        this.zzk = j;
        int i2 = i & 2;
        this.zzl = (i2 != 0) | this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzgl.zzf(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzanw zzanwVar = this.zzi;
        if (zzanwVar != null) {
            zzanwVar.zzd();
        }
    }
}
