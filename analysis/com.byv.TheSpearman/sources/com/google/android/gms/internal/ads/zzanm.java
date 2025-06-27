package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzanm implements zzano {
    private final zzfo zza;
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzaem zzf;
    private int zzh;
    private int zzi;
    private long zzj;
    private zzam zzk;
    private int zzl;
    private int zzm;
    private int zzg = 0;
    private long zzp = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzn = -1;
    private int zzo = -1;

    public zzanm(String str, int i, int i2) {
        this.zza = new zzfo(new byte[i2]);
        this.zzc = str;
        this.zzd = i;
    }

    @RequiresNonNull({AgentOptions.OUTPUT})
    private final void zzf(zzadb zzadbVar) {
        int i;
        int i2 = zzadbVar.zzb;
        if (i2 == -2147483647 || (i = zzadbVar.zzc) == -1) {
            return;
        }
        zzam zzamVar = this.zzk;
        if (zzamVar != null && i == zzamVar.zzz && i2 == zzamVar.zzA && zzfx.zzG(zzadbVar.zza, zzamVar.zzm)) {
            return;
        }
        zzam zzamVar2 = this.zzk;
        zzak zzakVar = zzamVar2 == null ? new zzak() : zzamVar2.zzb();
        zzakVar.zzK(this.zze);
        zzakVar.zzW(zzadbVar.zza);
        zzakVar.zzy(zzadbVar.zzc);
        zzakVar.zzX(zzadbVar.zzb);
        zzakVar.zzN(this.zzc);
        zzakVar.zzU(this.zzd);
        zzam zzamVarZzac = zzakVar.zzac();
        this.zzk = zzamVarZzac;
        this.zzf.zzl(zzamVarZzac);
    }

    private final boolean zzg(zzfo zzfoVar, byte[] bArr, int i) {
        int iMin = Math.min(zzfoVar.zzb(), i - this.zzh);
        zzfoVar.zzG(bArr, this.zzh, iMin);
        int i2 = this.zzh + iMin;
        this.zzh = i2;
        return i2 == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db  */
    @Override // com.google.android.gms.internal.ads.zzano
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzfo r17) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanm.zza(com.google.android.gms.internal.ads.zzfo):void");
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        zzapaVar.zzc();
        this.zze = zzapaVar.zzb();
        this.zzf = zzadiVar.zzw(zzapaVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzd(long j, int i) {
        this.zzp = j;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zzp = -9223372036854775807L;
        this.zzb.set(0);
    }
}
