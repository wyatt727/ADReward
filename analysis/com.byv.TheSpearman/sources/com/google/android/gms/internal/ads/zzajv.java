package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzajv implements zzadf, zzaef {

    @Deprecated
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzajt
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzajv.zza;
            return new zzadf[]{new zzajv(zzalf.zza, 16)};
        }
    };
    private int zzA;
    private zzahq zzB;
    private final zzalf zzb;
    private final int zzc;
    private final zzfo zzd;
    private final zzfo zze;
    private final zzfo zzf;
    private final zzfo zzg;
    private final ArrayDeque zzh;
    private final zzajz zzi;
    private final List zzj;
    private zzfzn zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private zzfo zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private zzadi zzv;
    private zzaju[] zzw;
    private long[][] zzx;
    private int zzy;
    private long zzz;

    @Deprecated
    public zzajv() {
        this(zzalf.zza, 16);
    }

    private static int zzi(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzj(zzake zzakeVar, long j) {
        int iZza = zzakeVar.zza(j);
        return iZza == -1 ? zzakeVar.zzb(j) : iZza;
    }

    private static long zzk(zzake zzakeVar, long j, long j2) {
        int iZzj = zzj(zzakeVar, j);
        return iZzj == -1 ? j2 : Math.min(zzakeVar.zzc[iZzj], j2);
    }

    private final void zzl() {
        this.zzl = 0;
        this.zzo = 0;
    }

    private final void zzm(long j) throws zzcc {
        zzby zzbyVar;
        long j2;
        List list;
        zzby zzbyVar2;
        int i;
        int i2;
        while (!this.zzh.isEmpty() && ((zzaiy) this.zzh.peek()).zza == j) {
            zzaiy zzaiyVar = (zzaiy) this.zzh.pop();
            if (zzaiyVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i3 = this.zzA;
                zzadv zzadvVar = new zzadv();
                zzaiz zzaizVarZzb = zzaiyVar.zzb(Atom.TYPE_udta);
                if (zzaizVarZzb != null) {
                    zzby zzbyVarZzb = zzaji.zzb(zzaizVarZzb);
                    zzadvVar.zzb(zzbyVarZzb);
                    zzbyVar = zzbyVarZzb;
                } else {
                    zzbyVar = null;
                }
                zzaiy zzaiyVarZza = zzaiyVar.zza(Atom.TYPE_meta);
                zzby zzbyVarZza = zzaiyVarZza != null ? zzaji.zza(zzaiyVarZza) : null;
                zzbx[] zzbxVarArr = new zzbx[1];
                zzaiz zzaizVarZzb2 = zzaiyVar.zzb(Atom.TYPE_mvhd);
                Objects.requireNonNull(zzaizVarZzb2);
                boolean z = i3 == 1;
                zzbxVarArr[0] = zzaji.zzc(zzaizVarZzb2.zza);
                zzby zzbyVar3 = new zzby(-9223372036854775807L, zzbxVarArr);
                zzby zzbyVar4 = zzbyVar;
                long j3 = -9223372036854775807L;
                List listZzd = zzaji.zzd(zzaiyVar, zzadvVar, -9223372036854775807L, null, 1 == (this.zzc & 1), z, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzajs
                    @Override // com.google.android.gms.internal.ads.zzfwf
                    public final Object apply(Object obj) {
                        zzakb zzakbVar = (zzakb) obj;
                        zzadm zzadmVar = zzajv.zza;
                        return zzakbVar;
                    }
                });
                long j4 = -9223372036854775807L;
                int i4 = 0;
                int size = -1;
                int i5 = 0;
                while (true) {
                    j2 = 0;
                    if (i5 >= listZzd.size()) {
                        break;
                    }
                    zzake zzakeVar = (zzake) listZzd.get(i5);
                    if (zzakeVar.zzb == 0) {
                        list = listZzd;
                    } else {
                        zzakb zzakbVar = zzakeVar.zza;
                        list = listZzd;
                        long j5 = zzakbVar.zze;
                        if (j5 == j3) {
                            j5 = zzakeVar.zzh;
                        }
                        long jMax = Math.max(j4, j5);
                        int i6 = i4 + 1;
                        zzaju zzajuVar = new zzaju(zzakbVar, zzakeVar, this.zzv.zzw(i4, zzakbVar.zzb));
                        int i7 = "audio/true-hd".equals(zzakbVar.zzf.zzm) ? zzakeVar.zze * 16 : zzakeVar.zze + 30;
                        zzak zzakVarZzb = zzakbVar.zzf.zzb();
                        zzakVarZzb.zzO(i7);
                        if (zzakbVar.zzb == 2) {
                            if ((this.zzc & 8) != 0) {
                                zzakVarZzb.zzU(zzakbVar.zzf.zzf | (size == -1 ? 1 : 2));
                            }
                            if (j5 > 0 && (i2 = zzakeVar.zzb) > 0) {
                                zzakVarZzb.zzH(i2 / (j5 / 1000000.0f));
                            }
                        }
                        int i8 = zzakbVar.zzb;
                        int i9 = zzajr.zzb;
                        if (i8 == 1 && zzadvVar.zza()) {
                            zzakVarZzb.zzF(zzadvVar.zza);
                            zzakVarZzb.zzG(zzadvVar.zzb);
                        }
                        int i10 = zzakbVar.zzb;
                        zzby[] zzbyVarArr = new zzby[3];
                        if (this.zzj.isEmpty()) {
                            i = 0;
                            zzbyVar2 = null;
                        } else {
                            zzbyVar2 = new zzby(this.zzj);
                            i = 0;
                        }
                        zzbyVarArr[i] = zzbyVar2;
                        zzbyVarArr[1] = zzbyVar4;
                        zzbyVarArr[2] = zzbyVar3;
                        int i11 = size;
                        zzby zzbyVar5 = new zzby(-9223372036854775807L, new zzbx[i]);
                        if (zzbyVarZza != null) {
                            for (int i12 = 0; i12 < zzbyVarZza.zza(); i12++) {
                                zzbx zzbxVarZzb = zzbyVarZza.zzb(i12);
                                if (zzbxVarZzb instanceof zzgb) {
                                    zzgb zzgbVar = (zzgb) zzbxVarZzb;
                                    if (!zzgbVar.zza.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                                        zzbyVar5 = zzbyVar5.zzc(zzgbVar);
                                    } else if (i10 == 2) {
                                        zzbyVar5 = zzbyVar5.zzc(zzgbVar);
                                    }
                                }
                            }
                        }
                        for (int i13 = 0; i13 < 3; i13++) {
                            zzbyVar5 = zzbyVar5.zzd(zzbyVarArr[i13]);
                        }
                        if (zzbyVar5.zza() > 0) {
                            zzakVarZzb.zzP(zzbyVar5);
                        }
                        zzajuVar.zzc.zzl(zzakVarZzb.zzac());
                        size = (zzakbVar.zzb == 2 && i11 == -1) ? arrayList.size() : i11;
                        arrayList.add(zzajuVar);
                        i4 = i6;
                        j4 = jMax;
                    }
                    i5++;
                    listZzd = list;
                    j3 = -9223372036854775807L;
                }
                this.zzy = size;
                this.zzz = j4;
                zzaju[] zzajuVarArr = (zzaju[]) arrayList.toArray(new zzaju[0]);
                this.zzw = zzajuVarArr;
                int length = zzajuVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i14 = 0; i14 < zzajuVarArr.length; i14++) {
                    jArr[i14] = new long[zzajuVarArr[i14].zzb.zzb];
                    jArr2[i14] = zzajuVarArr[i14].zzb.zzf[0];
                }
                int i15 = 0;
                while (i15 < zzajuVarArr.length) {
                    int i16 = -1;
                    long j6 = Long.MAX_VALUE;
                    for (int i17 = 0; i17 < zzajuVarArr.length; i17++) {
                        if (!zArr[i17]) {
                            long j7 = jArr2[i17];
                            if (j7 <= j6) {
                                i16 = i17;
                                j6 = j7;
                            }
                        }
                    }
                    int i18 = iArr[i16];
                    long[] jArr3 = jArr[i16];
                    jArr3[i18] = j2;
                    zzake zzakeVar2 = zzajuVarArr[i16].zzb;
                    j2 += zzakeVar2.zzd[i18];
                    int i19 = i18 + 1;
                    iArr[i16] = i19;
                    if (i19 < jArr3.length) {
                        jArr2[i16] = zzakeVar2.zzf[i19];
                    } else {
                        zArr[i16] = true;
                        i15++;
                    }
                }
                this.zzx = jArr;
                this.zzv.zzD();
                this.zzv.zzO(this);
                this.zzh.clear();
                this.zzl = 2;
            } else if (!this.zzh.isEmpty()) {
                ((zzaiy) this.zzh.peek()).zzc(zzaiyVar);
            }
        }
        if (this.zzl != 2) {
            zzl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        if ((this.zzc & 16) == 0) {
            zzadiVar = new zzali(zzadiVar, this.zzb);
        }
        this.zzv = zzadiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        if (j == 0) {
            if (this.zzl != 3) {
                zzl();
                return;
            } else {
                this.zzi.zzb();
                this.zzj.clear();
                return;
            }
        }
        for (zzaju zzajuVar : this.zzw) {
            zzake zzakeVar = zzajuVar.zzb;
            int iZza = zzakeVar.zza(j2);
            if (iZza == -1) {
                iZza = zzakeVar.zzb(j2);
            }
            zzajuVar.zze = iZza;
            zzaen zzaenVar = zzajuVar.zzd;
            if (zzaenVar != null) {
                zzaenVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        zzaej zzaejVarZzb = zzaka.zzb(zzadgVar, (this.zzc & 2) != 0);
        this.zzk = zzaejVarZzb != null ? zzfzn.zzn(zzaejVarZzb) : zzfzn.zzm();
        return zzaejVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        long j2;
        long j3;
        int iZzb;
        zzaju[] zzajuVarArr = this.zzw;
        if (zzajuVarArr.length == 0) {
            zzaeg zzaegVar = zzaeg.zza;
            return new zzaed(zzaegVar, zzaegVar);
        }
        int i = this.zzy;
        long jZzk = -1;
        if (i != -1) {
            zzake zzakeVar = zzajuVarArr[i].zzb;
            int iZzj = zzj(zzakeVar, j);
            if (iZzj == -1) {
                zzaeg zzaegVar2 = zzaeg.zza;
                return new zzaed(zzaegVar2, zzaegVar2);
            }
            long j4 = zzakeVar.zzf[iZzj];
            j2 = zzakeVar.zzc[iZzj];
            if (j4 >= j || iZzj >= zzakeVar.zzb - 1 || (iZzb = zzakeVar.zzb(j)) == -1 || iZzb == iZzj) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzakeVar.zzf[iZzb];
                jZzk = zzakeVar.zzc[iZzb];
            }
            j = j4;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzaju[] zzajuVarArr2 = this.zzw;
            if (i2 >= zzajuVarArr2.length) {
                break;
            }
            if (i2 != this.zzy) {
                zzake zzakeVar2 = zzajuVarArr2[i2].zzb;
                long jZzk2 = zzk(zzakeVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    jZzk = zzk(zzakeVar2, j3, jZzk);
                }
                j2 = jZzk2;
            }
            i2++;
        }
        zzaeg zzaegVar3 = new zzaeg(j, j2);
        return j3 == -9223372036854775807L ? new zzaed(zzaegVar3, zzaegVar3) : new zzaed(zzaegVar3, new zzaeg(j3, jZzk));
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return true;
    }

    public zzajv(zzalf zzalfVar, int i) {
        this.zzb = zzalfVar;
        this.zzc = i;
        this.zzk = zzfzn.zzm();
        this.zzl = (i & 4) != 0 ? 3 : 0;
        this.zzi = new zzajz();
        this.zzj = new ArrayList();
        this.zzg = new zzfo(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzfo(zzgl.zza);
        this.zze = new zzfo(4);
        this.zzf = new zzfo();
        this.zzq = -1;
        this.zzv = zzadi.zza;
        this.zzw = new zzaju[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:278:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    @Override // com.google.android.gms.internal.ads.zzadf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadg r33, com.google.android.gms.internal.ads.zzaec r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajv.zzb(com.google.android.gms.internal.ads.zzadg, com.google.android.gms.internal.ads.zzaec):int");
    }
}
