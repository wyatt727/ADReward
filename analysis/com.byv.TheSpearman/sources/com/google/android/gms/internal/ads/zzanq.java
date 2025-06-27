package com.google.android.gms.internal.ads;

import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzanq implements zzano {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzaem zzc;
    private final zzapd zzd;
    private final zzfo zze;
    private final zzaod zzf;
    private final boolean[] zzg;
    private final zzanp zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzanq() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e0  */
    @Override // com.google.android.gms.internal.ads.zzano
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzfo r21) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanq.zza(com.google.android.gms.internal.ads.zzfo):void");
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        zzapaVar.zzc();
        this.zzb = zzapaVar.zzb();
        this.zzc = zzadiVar.zzw(zzapaVar.zza(), 2);
        zzapd zzapdVar = this.zzd;
        if (zzapdVar != null) {
            zzapdVar.zzb(zzadiVar, zzapaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzc(boolean z) {
        zzek.zzb(this.zzc);
        if (z) {
            boolean z2 = this.zzp;
            long j = this.zzi - this.zzn;
            this.zzc.zzs(this.zzo, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zze() {
        zzgl.zzf(this.zzg);
        this.zzh.zzb();
        zzaod zzaodVar = this.zzf;
        if (zzaodVar != null) {
            zzaodVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    zzanq(zzapd zzapdVar) {
        zzfo zzfoVar;
        this.zzd = zzapdVar;
        this.zzg = new boolean[4];
        this.zzh = new zzanp(128);
        if (zzapdVar != null) {
            this.zzf = new zzaod(Opcodes.GETSTATIC, 128);
            zzfoVar = new zzfo();
        } else {
            zzfoVar = null;
            this.zzf = null;
        }
        this.zze = zzfoVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
