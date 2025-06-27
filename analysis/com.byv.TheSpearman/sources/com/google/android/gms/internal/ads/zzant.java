package com.google.android.gms.internal.ads;

import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzant implements zzano {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzapd zzb;
    private final zzfo zzc;
    private final boolean[] zzd;
    private final zzanr zze;
    private final zzaod zzf;
    private zzans zzg;
    private long zzh;
    private String zzi;
    private zzaem zzj;
    private boolean zzk;
    private long zzl;

    public zzant() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    @Override // com.google.android.gms.internal.ads.zzano
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzfo r18) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzant.zza(com.google.android.gms.internal.ads.zzfo):void");
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        zzapaVar.zzc();
        this.zzi = zzapaVar.zzb();
        zzaem zzaemVarZzw = zzadiVar.zzw(zzapaVar.zza(), 2);
        this.zzj = zzaemVarZzw;
        this.zzg = new zzans(zzaemVarZzw);
        zzapd zzapdVar = this.zzb;
        if (zzapdVar != null) {
            zzapdVar.zzb(zzadiVar, zzapaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzc(boolean z) {
        zzek.zzb(this.zzg);
        if (z) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzd(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zze() {
        zzgl.zzf(this.zzd);
        this.zze.zzb();
        zzans zzansVar = this.zzg;
        if (zzansVar != null) {
            zzansVar.zzd();
        }
        zzaod zzaodVar = this.zzf;
        if (zzaodVar != null) {
            zzaodVar.zzb();
        }
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    zzant(zzapd zzapdVar) {
        zzfo zzfoVar;
        this.zzb = zzapdVar;
        this.zzd = new boolean[4];
        this.zze = new zzanr(128);
        this.zzl = -9223372036854775807L;
        if (zzapdVar != null) {
            this.zzf = new zzaod(Opcodes.GETSTATIC, 128);
            zzfoVar = new zzfo();
        } else {
            zzfoVar = null;
            this.zzf = null;
        }
        this.zzc = zzfoVar;
    }
}
