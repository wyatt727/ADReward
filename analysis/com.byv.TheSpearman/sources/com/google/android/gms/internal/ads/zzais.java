package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzais implements zzadf {
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzaiq
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzais.zza;
            return new zzadf[]{new zzais(0)};
        }
    };
    private static final zzaha zzb = new zzaha() { // from class: com.google.android.gms.internal.ads.zzair
    };
    private final zzfo zzc;
    private final zzadz zzd;
    private final zzadv zze;
    private final zzadx zzf;
    private final zzaem zzg;
    private zzadi zzh;
    private zzaem zzi;
    private zzaem zzj;
    private int zzk;
    private zzby zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzaiu zzq;
    private boolean zzr;

    public zzais() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013d  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzg(com.google.android.gms.internal.ads.zzadg r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzais.zzg(com.google.android.gms.internal.ads.zzadg):int");
    }

    private final long zzh(long j) {
        return this.zzm + ((j * 1000000) / this.zzd.zzd);
    }

    private final zzaiu zzi(zzadg zzadgVar, long j, boolean z) throws IOException {
        ((zzact) zzadgVar).zzm(this.zzc.zzM(), 0, 4, false);
        this.zzc.zzK(0);
        this.zzd.zza(this.zzc.zzg());
        if (zzadgVar.zzd() != -1) {
            j = zzadgVar.zzd();
        }
        return new zzain(j, zzadgVar.zzf(), this.zzd, false);
    }

    private static boolean zzj(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzk(zzadg zzadgVar) throws IOException {
        zzaiu zzaiuVar = this.zzq;
        if (zzaiuVar != null) {
            long jZzc = zzaiuVar.zzc();
            if (jZzc != -1 && zzadgVar.zze() > jZzc - 4) {
                return true;
            }
        }
        try {
            return !zzadgVar.zzm(this.zzc.zzM(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzl(zzadg zzadgVar, boolean z) throws IOException {
        int iZze;
        int i;
        int iZzb;
        zzadgVar.zzj();
        if (zzadgVar.zzf() == 0) {
            zzby zzbyVarZza = this.zzf.zza(zzadgVar, null);
            this.zzl = zzbyVarZza;
            if (zzbyVarZza != null) {
                this.zze.zzb(zzbyVarZza);
            }
            iZze = (int) zzadgVar.zze();
            if (!z) {
                ((zzact) zzadgVar).zzo(iZze, false);
            }
            i = 0;
        } else {
            iZze = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (!zzk(zzadgVar)) {
                this.zzc.zzK(0);
                int iZzg = this.zzc.zzg();
                if ((i == 0 || zzj(iZzg, i)) && (iZzb = zzaea.zzb(iZzg)) != -1) {
                    i2++;
                    if (i2 != 1) {
                        if (i2 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(iZzg);
                        i = iZzg;
                    }
                    ((zzact) zzadgVar).zzl(iZzb - 4, false);
                } else {
                    int i4 = i3 + 1;
                    if (i3 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        throw zzcc.zza("Searched too many bytes.", null);
                    }
                    if (z) {
                        zzadgVar.zzj();
                        ((zzact) zzadgVar).zzl(iZze + i4, false);
                    } else {
                        ((zzact) zzadgVar).zzo(1, false);
                    }
                    i = 0;
                    i3 = i4;
                    i2 = 0;
                }
            } else if (i2 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzact) zzadgVar).zzo(iZze + i3, false);
        } else {
            zzadgVar.zzj();
        }
        this.zzk = i;
        return true;
    }

    public final void zza() {
        this.zzr = true;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final int zzb(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        zzek.zzb(this.zzi);
        int i = zzfx.zza;
        int iZzg = zzg(zzadgVar);
        if (iZzg == -1 && (this.zzq instanceof zzaio)) {
            if (this.zzq.zza() != zzh(this.zzn)) {
                throw null;
            }
        }
        return iZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zzh = zzadiVar;
        zzaem zzaemVarZzw = zzadiVar.zzw(0, 1);
        this.zzi = zzaemVarZzw;
        this.zzj = zzaemVarZzw;
        this.zzh.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzaiu zzaiuVar = this.zzq;
        if (zzaiuVar instanceof zzaio) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        return zzl(zzadgVar, true);
    }

    public zzais(int i) {
        this.zzc = new zzfo(10);
        this.zzd = new zzadz();
        this.zze = new zzadv();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzadx();
        zzade zzadeVar = new zzade();
        this.zzg = zzadeVar;
        this.zzj = zzadeVar;
    }
}
