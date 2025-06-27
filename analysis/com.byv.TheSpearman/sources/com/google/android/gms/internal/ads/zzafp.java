package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzafp implements zzadf {
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzafo
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzafp.zza;
            return new zzadf[]{new zzafp()};
        }
    };
    private zzadi zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzafn zzp;
    private zzaft zzq;
    private final zzfo zzb = new zzfo(4);
    private final zzfo zzc = new zzfo(9);
    private final zzfo zzd = new zzfo(11);
    private final zzfo zze = new zzfo();
    private final zzafq zzf = new zzafq();
    private int zzh = 1;

    private final zzfo zza(zzadg zzadgVar) throws IOException {
        if (this.zzm > this.zze.zzc()) {
            zzfo zzfoVar = this.zze;
            int iZzc = zzfoVar.zzc();
            zzfoVar.zzI(new byte[Math.max(iZzc + iZzc, this.zzm)], 0);
        } else {
            this.zze.zzK(0);
        }
        this.zze.zzJ(this.zzm);
        ((zzact) zzadgVar).zzn(this.zze.zzM(), 0, this.zzm, false);
        return this.zze;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzg() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzO(new zzaee(-9223372036854775807L, 0L));
        this.zzo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzadf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadg r17, com.google.android.gms.internal.ads.zzaec r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafp.zzb(com.google.android.gms.internal.ads.zzadg, com.google.android.gms.internal.ads.zzaec):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zzg = zzadiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        zzact zzactVar = (zzact) zzadgVar;
        zzactVar.zzm(this.zzb.zzM(), 0, 3, false);
        this.zzb.zzK(0);
        if (this.zzb.zzo() != 4607062) {
            return false;
        }
        zzactVar.zzm(this.zzb.zzM(), 0, 2, false);
        this.zzb.zzK(0);
        if ((this.zzb.zzq() & 250) != 0) {
            return false;
        }
        zzactVar.zzm(this.zzb.zzM(), 0, 4, false);
        this.zzb.zzK(0);
        int iZzg = this.zzb.zzg();
        zzadgVar.zzj();
        zzactVar.zzl(iZzg, false);
        zzactVar.zzm(this.zzb.zzM(), 0, 4, false);
        this.zzb.zzK(0);
        return this.zzb.zzg() == 0;
    }
}
