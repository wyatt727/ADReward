package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaov implements zzaon {
    final /* synthetic */ zzaow zza;
    private final zzfn zzb = new zzfn(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzaov(zzaow zzaowVar, int i) {
        this.zza = zzaowVar;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza(zzfo zzfoVar) {
        zzfv zzfvVar;
        zzfv zzfvVar2;
        int i;
        if (zzfoVar.zzm() != 2) {
            return;
        }
        int i2 = 0;
        zzfv zzfvVar3 = (zzfv) this.zza.zzb.get(0);
        if ((zzfoVar.zzm() & 128) != 0) {
            zzfoVar.zzL(1);
            int iZzq = zzfoVar.zzq();
            int i3 = 3;
            zzfoVar.zzL(3);
            zzfoVar.zzF(this.zzb, 2);
            this.zzb.zzm(3);
            int i4 = 13;
            this.zza.zzr = this.zzb.zzd(13);
            zzfoVar.zzF(this.zzb, 2);
            this.zzb.zzm(4);
            int i5 = 12;
            zzfoVar.zzL(this.zzb.zzd(12));
            this.zzc.clear();
            this.zzd.clear();
            int iZzb = zzfoVar.zzb();
            while (iZzb > 0) {
                int i6 = 5;
                zzfoVar.zzF(this.zzb, 5);
                zzfn zzfnVar = this.zzb;
                int iZzd = zzfnVar.zzd(8);
                zzfnVar.zzm(i3);
                int iZzd2 = this.zzb.zzd(i4);
                this.zzb.zzm(4);
                int iZzd3 = this.zzb.zzd(i5);
                int iZzd4 = zzfoVar.zzd();
                int i7 = iZzd4 + iZzd3;
                int iZzm = i2;
                int i8 = -1;
                String str = null;
                ArrayList arrayList = null;
                while (zzfoVar.zzd() < i7) {
                    int iZzm2 = zzfoVar.zzm();
                    int iZzd5 = zzfoVar.zzd() + zzfoVar.zzm();
                    if (iZzd5 > i7) {
                        break;
                    }
                    if (iZzm2 == i6) {
                        long jZzu = zzfoVar.zzu();
                        if (jZzu != 1094921523) {
                            if (jZzu != 1161904947) {
                                if (jZzu != 1094921524) {
                                    if (jZzu == 1212503619) {
                                        i = 36;
                                        zzfvVar2 = zzfvVar3;
                                        i8 = i;
                                    }
                                    zzfvVar2 = zzfvVar3;
                                }
                                zzfvVar2 = zzfvVar3;
                                i8 = 172;
                            }
                            zzfvVar2 = zzfvVar3;
                            i8 = 135;
                        }
                        zzfvVar2 = zzfvVar3;
                        i8 = 129;
                    } else if (iZzm2 == 106) {
                        zzfvVar2 = zzfvVar3;
                        i8 = 129;
                    } else if (iZzm2 == 122) {
                        zzfvVar2 = zzfvVar3;
                        i8 = 135;
                    } else {
                        if (iZzm2 == 127) {
                            int iZzm3 = zzfoVar.zzm();
                            if (iZzm3 != 21) {
                                if (iZzm3 == 14) {
                                    i = 136;
                                } else {
                                    if (iZzm3 == 33) {
                                        i = Opcodes.F2I;
                                    }
                                    zzfvVar2 = zzfvVar3;
                                }
                            }
                            zzfvVar2 = zzfvVar3;
                            i8 = 172;
                        } else if (iZzm2 == 123) {
                            i = 138;
                        } else if (iZzm2 == 10) {
                            String strTrim = zzfoVar.zzA(i3, zzfwd.zzc).trim();
                            iZzm = zzfoVar.zzm();
                            zzfvVar2 = zzfvVar3;
                            str = strTrim;
                        } else if (iZzm2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (zzfoVar.zzd() < iZzd5) {
                                String strTrim2 = zzfoVar.zzA(i3, zzfwd.zzc).trim();
                                int iZzm4 = zzfoVar.zzm();
                                byte[] bArr = new byte[4];
                                zzfoVar.zzG(bArr, 0, 4);
                                arrayList2.add(new zzaox(strTrim2, iZzm4, bArr));
                                zzfvVar3 = zzfvVar3;
                                i3 = 3;
                            }
                            zzfvVar2 = zzfvVar3;
                            arrayList = arrayList2;
                            i8 = 89;
                        } else {
                            zzfvVar2 = zzfvVar3;
                            if (iZzm2 == 111) {
                                i8 = 257;
                            }
                        }
                        zzfvVar2 = zzfvVar3;
                        i8 = i;
                    }
                    zzfoVar.zzL(iZzd5 - zzfoVar.zzd());
                    zzfvVar3 = zzfvVar2;
                    i3 = 3;
                    i6 = 5;
                }
                zzfv zzfvVar4 = zzfvVar3;
                zzfoVar.zzK(i7);
                zzaoy zzaoyVar = new zzaoy(i8, str, iZzm, arrayList, Arrays.copyOfRange(zzfoVar.zzM(), iZzd4, i7));
                if (iZzd == 6 || iZzd == 5) {
                    iZzd = zzaoyVar.zza;
                }
                iZzb -= iZzd3 + 5;
                if (!this.zza.zzh.get(iZzd2)) {
                    zzapb zzapbVarZza = this.zza.zze.zza(iZzd, zzaoyVar);
                    this.zzd.put(iZzd2, iZzd2);
                    this.zzc.put(iZzd2, zzapbVarZza);
                }
                zzfvVar3 = zzfvVar4;
                i2 = 0;
                i3 = 3;
                i5 = 12;
                i4 = 13;
            }
            zzfv zzfvVar5 = zzfvVar3;
            int size = this.zzd.size();
            int i9 = 0;
            while (i9 < size) {
                SparseIntArray sparseIntArray = this.zzd;
                zzaow zzaowVar = this.zza;
                int iKeyAt = sparseIntArray.keyAt(i9);
                int iValueAt = sparseIntArray.valueAt(i9);
                zzaowVar.zzh.put(iKeyAt, true);
                this.zza.zzi.put(iValueAt, true);
                zzapb zzapbVar = (zzapb) this.zzc.valueAt(i9);
                if (zzapbVar != null) {
                    zzadi zzadiVar = this.zza.zzl;
                    zzapa zzapaVar = new zzapa(iZzq, iKeyAt, 8192);
                    zzfvVar = zzfvVar5;
                    zzapbVar.zzb(zzfvVar, zzadiVar, zzapaVar);
                    this.zza.zzg.put(iValueAt, zzapbVar);
                } else {
                    zzfvVar = zzfvVar5;
                }
                i9++;
                zzfvVar5 = zzfvVar;
            }
            this.zza.zzg.remove(this.zze);
            this.zza.zzm = 0;
            zzaow zzaowVar2 = this.zza;
            if (zzaowVar2.zzm == 0) {
                zzaowVar2.zzl.zzD();
                this.zza.zzn = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzfv zzfvVar, zzadi zzadiVar, zzapa zzapaVar) {
    }
}
