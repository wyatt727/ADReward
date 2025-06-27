package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzanz implements zzano {
    private final zzaop zza;
    private String zzb;
    private zzaem zzc;
    private zzany zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaod zzg = new zzaod(32, 128);
    private final zzaod zzh = new zzaod(33, 128);
    private final zzaod zzi = new zzaod(34, 128);
    private final zzaod zzj = new zzaod(39, 128);
    private final zzaod zzk = new zzaod(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzfo zzn = new zzfo();

    public zzanz(zzaop zzaopVar) {
        this.zza = zzaopVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i2);
            this.zzh.zza(bArr, i, i2);
            this.zzi.zza(bArr, i, i2);
        }
        this.zzj.zza(bArr, i, i2);
        this.zzk.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0139  */
    @Override // com.google.android.gms.internal.ads.zzano
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzfo r32) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanz.zza(com.google.android.gms.internal.ads.zzfo):void");
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        zzapaVar.zzc();
        this.zzb = zzapaVar.zzb();
        zzaem zzaemVarZzw = zzadiVar.zzw(zzapaVar.zza(), 2);
        this.zzc = zzaemVarZzw;
        this.zzd = new zzany(zzaemVarZzw);
        this.zza.zzb(zzadiVar, zzapaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzc(boolean z) {
        zzek.zzb(this.zzc);
        int i = zzfx.zza;
        if (z) {
            this.zzd.zza(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzgl.zzf(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzany zzanyVar = this.zzd;
        if (zzanyVar != null) {
            zzanyVar.zzd();
        }
    }
}
