package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaez implements zzadf {
    private final zzfo zza;
    private final zzaey zzb;
    private final zzalf zzc;
    private int zzd;
    private zzadi zze;
    private zzafa zzf;
    private long zzg;
    private zzafc[] zzh;
    private long zzi;
    private zzafc zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private boolean zzo;

    @Deprecated
    public zzaez() {
        this(1, zzalf.zza);
    }

    private final zzafc zzg(int i) {
        for (zzafc zzafcVar : this.zzh) {
            if (zzafcVar.zzg(i)) {
                return zzafcVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zzd = 0;
        this.zze = zzadiVar;
        this.zzi = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        this.zzi = -1L;
        this.zzj = null;
        for (zzafc zzafcVar : this.zzh) {
            zzafcVar.zzf(j);
        }
        if (j == 0) {
            this.zzd = this.zzh.length != 0 ? 3 : 0;
        } else {
            this.zzd = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        ((zzact) zzadgVar).zzm(this.zza.zzM(), 0, 12, false);
        this.zza.zzK(0);
        if (this.zza.zzi() != 1179011410) {
            return false;
        }
        this.zza.zzL(4);
        return this.zza.zzi() == 541677121;
    }

    public zzaez(int i, zzalf zzalfVar) {
        this.zzc = zzalfVar;
        this.zza = new zzfo(12);
        this.zzb = new zzaey(null);
        this.zze = new zzadd();
        this.zzh = new zzafc[0];
        this.zzl = -1L;
        this.zzm = -1L;
        this.zzk = -1;
        this.zzg = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x030b  */
    @Override // com.google.android.gms.internal.ads.zzadf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadg r28, com.google.android.gms.internal.ads.zzaec r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaez.zzb(com.google.android.gms.internal.ads.zzadg, com.google.android.gms.internal.ads.zzaec):int");
    }
}
