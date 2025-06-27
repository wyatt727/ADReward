package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgyu implements zzhby {
    private final zzgyt zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgyu(zzgyt zzgytVar) {
        zzhai.zzc(zzgytVar, "input");
        this.zza = zzgytVar;
        zzgytVar.zzc = this;
    }

    private final Object zzR(zzhcg zzhcgVar, zzgzf zzgzfVar) throws IOException {
        Object objZze = zzhcgVar.zze();
        zzT(objZze, zzhcgVar, zzgzfVar);
        zzhcgVar.zzf(objZze);
        return objZze;
    }

    private final Object zzS(zzhcg zzhcgVar, zzgzf zzgzfVar) throws IOException {
        Object objZze = zzhcgVar.zze();
        zzU(objZze, zzhcgVar, zzgzfVar);
        zzhcgVar.zzf(objZze);
        return objZze;
    }

    private final void zzT(Object obj, zzhcg zzhcgVar, zzgzf zzgzfVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzhcgVar.zzh(obj, this, zzgzfVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzhak.zzg();
            }
        } finally {
            this.zzc = i;
        }
    }

    private final void zzU(Object obj, zzhcg zzhcgVar, zzgzf zzgzfVar) throws IOException {
        zzgyt zzgytVar = this.zza;
        int iZzn = zzgytVar.zzn();
        if (zzgytVar.zza >= zzgytVar.zzb) {
            throw new zzhak("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZze = this.zza.zze(iZzn);
        this.zza.zza++;
        zzhcgVar.zzh(obj, this, zzgzfVar);
        this.zza.zzz(0);
        r4.zza--;
        this.zza.zzA(iZze);
    }

    private final void zzV(int i) throws IOException {
        if (this.zza.zzd() != i) {
            throw zzhak.zzj();
        }
    }

    private final void zzW(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw zzhak.zza();
        }
    }

    private static final void zzX(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzhak.zzg();
        }
    }

    private static final void zzY(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzhak.zzg();
        }
    }

    public static zzgyu zzq(zzgyt zzgytVar) {
        zzgyu zzgyuVar = zzgytVar.zzc;
        return zzgyuVar != null ? zzgyuVar : new zzgyu(zzgytVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzA(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzgzw) {
            zzgzw zzgzwVar = (zzgzw) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar = this.zza;
                int iZzd = zzgytVar.zzd() + zzgytVar.zzn();
                do {
                    zzgzwVar.zzi(this.zza.zzf());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzgzwVar.zzi(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar2 = this.zza;
                int iZzd2 = zzgytVar2.zzd() + zzgytVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzB(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzgzw) {
            zzgzw zzgzwVar = (zzgzw) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzn = this.zza.zzn();
                zzX(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzgzwVar.zzi(this.zza.zzg());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i != 5) {
                throw zzhak.zza();
            }
            do {
                zzgzwVar.zzi(this.zza.zzg());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzn2 = this.zza.zzn();
                zzX(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i2 != 5) {
                throw zzhak.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzC(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzhak.zza();
                }
                int iZzn = this.zza.zzn();
                zzY(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzhbaVar.zzg(this.zza.zzo());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzhbaVar.zzg(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzhak.zza();
                }
                int iZzn2 = this.zza.zzn();
                zzY(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzD(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzgzm) {
            zzgzm zzgzmVar = (zzgzm) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzn = this.zza.zzn();
                zzX(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzgzmVar.zzg(this.zza.zzc());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i != 5) {
                throw zzhak.zza();
            }
            do {
                zzgzmVar.zzg(this.zza.zzc());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzn2 = this.zza.zzn();
                zzX(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i2 != 5) {
                throw zzhak.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    @Deprecated
    public final void zzE(List list, zzhcg zzhcgVar, zzgzf zzgzfVar) throws IOException {
        int iZzm;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw zzhak.zza();
        }
        do {
            list.add(zzR(zzhcgVar, zzgzfVar));
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzF(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzgzw) {
            zzgzw zzgzwVar = (zzgzw) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar = this.zza;
                int iZzd = zzgytVar.zzd() + zzgytVar.zzn();
                do {
                    zzgzwVar.zzi(this.zza.zzh());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzgzwVar.zzi(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar2 = this.zza;
                int iZzd2 = zzgytVar2.zzd() + zzgytVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzG(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar = this.zza;
                int iZzd = zzgytVar.zzd() + zzgytVar.zzn();
                do {
                    zzhbaVar.zzg(this.zza.zzp());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzhbaVar.zzg(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar2 = this.zza;
                int iZzd2 = zzgytVar2.zzd() + zzgytVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzH(List list, zzhcg zzhcgVar, zzgzf zzgzfVar) throws IOException {
        int iZzm;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw zzhak.zza();
        }
        do {
            list.add(zzS(zzhcgVar, zzgzfVar));
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzI(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzgzw) {
            zzgzw zzgzwVar = (zzgzw) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzn = this.zza.zzn();
                zzX(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzgzwVar.zzi(this.zza.zzk());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i != 5) {
                throw zzhak.zza();
            }
            do {
                zzgzwVar.zzi(this.zza.zzk());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzn2 = this.zza.zzn();
                zzX(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i2 != 5) {
                throw zzhak.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzJ(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzhak.zza();
                }
                int iZzn = this.zza.zzn();
                zzY(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzhbaVar.zzg(this.zza.zzt());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzhbaVar.zzg(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzhak.zza();
                }
                int iZzn2 = this.zza.zzn();
                zzY(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzK(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzgzw) {
            zzgzw zzgzwVar = (zzgzw) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar = this.zza;
                int iZzd = zzgytVar.zzd() + zzgytVar.zzn();
                do {
                    zzgzwVar.zzi(this.zza.zzl());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzgzwVar.zzi(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar2 = this.zza;
                int iZzd2 = zzgytVar2.zzd() + zzgytVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzL(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar = this.zza;
                int iZzd = zzgytVar.zzd() + zzgytVar.zzn();
                do {
                    zzhbaVar.zzg(this.zza.zzu());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzhbaVar.zzg(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar2 = this.zza;
                int iZzd2 = zzgytVar2.zzd() + zzgytVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    public final void zzM(List list, boolean z) throws IOException {
        int iZzm;
        int iZzm2;
        if ((this.zzb & 7) != 2) {
            throw zzhak.zza();
        }
        if ((list instanceof zzhat) && !z) {
            zzhat zzhatVar = (zzhat) list;
            do {
                zzhatVar.zzi(zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            do {
                list.add(z ? zzu() : zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzN(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzgzw) {
            zzgzw zzgzwVar = (zzgzw) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar = this.zza;
                int iZzd = zzgytVar.zzd() + zzgytVar.zzn();
                do {
                    zzgzwVar.zzi(this.zza.zzn());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzgzwVar.zzi(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar2 = this.zza;
                int iZzd2 = zzgytVar2.zzd() + zzgytVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzO(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar = this.zza;
                int iZzd = zzgytVar.zzd() + zzgytVar.zzn();
                do {
                    zzhbaVar.zzg(this.zza.zzv());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzhbaVar.zzg(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar2 = this.zza;
                int iZzd2 = zzgytVar2.zzd() + zzgytVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final boolean zzP() throws IOException {
        zzW(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final boolean zzQ() throws IOException {
        int i;
        if (this.zza.zzC() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i);
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final double zza() throws IOException {
        zzW(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final float zzb() throws IOException {
        zzW(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final int zzc() throws IOException {
        int iZzm = this.zzd;
        if (iZzm != 0) {
            this.zzb = iZzm;
            this.zzd = 0;
        } else {
            iZzm = this.zza.zzm();
            this.zzb = iZzm;
        }
        if (iZzm == 0 || iZzm == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return iZzm >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final int zze() throws IOException {
        zzW(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final int zzf() throws IOException {
        zzW(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final int zzg() throws IOException {
        zzW(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final int zzh() throws IOException {
        zzW(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final int zzi() throws IOException {
        zzW(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final int zzj() throws IOException {
        zzW(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final long zzk() throws IOException {
        zzW(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final long zzl() throws IOException {
        zzW(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final long zzm() throws IOException {
        zzW(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final long zzn() throws IOException {
        zzW(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final long zzo() throws IOException {
        zzW(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final zzgyj zzp() throws IOException {
        zzW(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    @Deprecated
    public final Object zzr(Class cls, zzgzf zzgzfVar) throws IOException {
        zzW(3);
        return zzR(zzhbv.zza().zzb(cls), zzgzfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final Object zzs(Class cls, zzgzf zzgzfVar) throws IOException {
        zzW(2);
        return zzS(zzhbv.zza().zzb(cls), zzgzfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final String zzt() throws IOException {
        zzW(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final String zzu() throws IOException {
        zzW(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzv(Object obj, zzhcg zzhcgVar, zzgzf zzgzfVar) throws IOException {
        zzW(3);
        zzT(obj, zzhcgVar, zzgzfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzw(Object obj, zzhcg zzhcgVar, zzgzf zzgzfVar) throws IOException {
        zzW(2);
        zzU(obj, zzhcgVar, zzgzfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzx(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzgxx) {
            zzgxx zzgxxVar = (zzgxx) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar = this.zza;
                int iZzd = zzgytVar.zzd() + zzgytVar.zzn();
                do {
                    zzgxxVar.zzg(this.zza.zzD());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzgxxVar.zzg(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhak.zza();
                }
                zzgyt zzgytVar2 = this.zza;
                int iZzd2 = zzgytVar2.zzd() + zzgytVar2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzy(List list) throws IOException {
        int iZzm;
        if ((this.zzb & 7) != 2) {
            throw zzhak.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == this.zzb);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzhby
    public final void zzz(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzgzc) {
            zzgzc zzgzcVar = (zzgzc) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzhak.zza();
                }
                int iZzn = this.zza.zzn();
                zzY(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzgzcVar.zzg(this.zza.zzb());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzgzcVar.zzg(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzhak.zza();
                }
                int iZzn2 = this.zza.zzn();
                zzY(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }
}
