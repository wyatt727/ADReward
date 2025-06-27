package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzvw implements zzvf, zzve {
    private final zzvf[] zza;
    private zzve zze;
    private zzxk zzf;
    private final zzus zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzxa zzh = new zzur(zzfzn.zzm(), zzfzn.zzm());
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzvf[] zzg = new zzvf[0];

    public zzvw(zzus zzusVar, long[] jArr, zzvf... zzvfVarArr) {
        this.zzi = zzusVar;
        this.zza = zzvfVarArr;
        for (int i = 0; i < zzvfVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzxg(zzvfVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zza(long j, zzmj zzmjVar) {
        zzvf[] zzvfVarArr = this.zzg;
        return (zzvfVarArr.length > 0 ? zzvfVarArr[0] : this.zza[0]).zza(j, zzmjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzvf zzvfVar : this.zzg) {
            long jZzd = zzvfVar.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j != -9223372036854775807L && zzvfVar.zze(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (zzvf zzvfVar2 : this.zzg) {
                    if (zzvfVar2 == zzvfVar) {
                        break;
                    }
                    if (zzvfVar2.zze(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZzd;
            } else if (jZzd != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zze(long j) {
        long jZze = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zzvf[] zzvfVarArr = this.zzg;
            if (i >= zzvfVarArr.length) {
                return jZze;
            }
            if (zzvfVarArr[i].zze(jZze) != jZze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzf(zzyz[] zzyzVarArr, boolean[] zArr, zzwy[] zzwyVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = zzyzVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzyzVarArr.length;
            if (i2 >= length) {
                break;
            }
            zzwy zzwyVar = zzwyVarArr[i2];
            Integer num = zzwyVar != null ? (Integer) this.zzb.get(zzwyVar) : null;
            iArr[i2] = num == null ? -1 : num.intValue();
            zzyz zzyzVar = zzyzVarArr[i2];
            if (zzyzVar != null) {
                String str = zzyzVar.zze().zzc;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.zzb.clear();
        zzwy[] zzwyVarArr2 = new zzwy[length];
        zzwy[] zzwyVarArr3 = new zzwy[length];
        zzyz[] zzyzVarArr2 = new zzyz[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zza.length) {
            for (int i4 = i; i4 < zzyzVarArr.length; i4++) {
                zzwyVarArr3[i4] = iArr[i4] == i3 ? zzwyVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    zzyz zzyzVar2 = zzyzVarArr[i4];
                    Objects.requireNonNull(zzyzVar2);
                    zzcz zzczVar = (zzcz) this.zzd.get(zzyzVar2.zze());
                    Objects.requireNonNull(zzczVar);
                    zzyzVarArr2[i4] = new zzvv(zzyzVar2, zzczVar);
                } else {
                    zzyzVarArr2[i4] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            zzyz[] zzyzVarArr3 = zzyzVarArr2;
            zzwy[] zzwyVarArr4 = zzwyVarArr3;
            long jZzf = this.zza[i3].zzf(zzyzVarArr2, zArr, zzwyVarArr3, zArr2, j2);
            if (i3 == 0) {
                j2 = jZzf;
            } else if (jZzf != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < zzyzVarArr.length; i5++) {
                if (iArr2[i5] == i3) {
                    zzwy zzwyVar2 = zzwyVarArr4[i5];
                    Objects.requireNonNull(zzwyVar2);
                    zzwyVarArr2[i5] = zzwyVar2;
                    this.zzb.put(zzwyVar2, Integer.valueOf(i3));
                    z = true;
                } else if (iArr[i5] == i3) {
                    zzek.zzf(zzwyVarArr4[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i3]);
            }
            i3++;
            arrayList = arrayList2;
            zzyzVarArr2 = zzyzVarArr3;
            zzwyVarArr3 = zzwyVarArr4;
            i = 0;
        }
        int i6 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzwyVarArr2, i6, zzwyVarArr, i6, length);
        this.zzg = (zzvf[]) arrayList3.toArray(new zzvf[i6]);
        this.zzh = new zzur(arrayList3, zzgad.zzb(arrayList3, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzvu
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return ((zzvf) obj).zzh().zzc();
            }
        }));
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final /* bridge */ /* synthetic */ void zzg(zzxa zzxaVar) {
        zzve zzveVar = this.zze;
        Objects.requireNonNull(zzveVar);
        zzveVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final zzxk zzh() {
        zzxk zzxkVar = this.zzf;
        Objects.requireNonNull(zzxkVar);
        return zzxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzi(zzvf zzvfVar) {
        this.zzc.remove(zzvfVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i = 0;
        for (zzvf zzvfVar2 : this.zza) {
            i += zzvfVar2.zzh().zzc;
        }
        zzcz[] zzczVarArr = new zzcz[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzvf[] zzvfVarArr = this.zza;
            if (i2 >= zzvfVarArr.length) {
                this.zzf = new zzxk(zzczVarArr);
                zzve zzveVar = this.zze;
                Objects.requireNonNull(zzveVar);
                zzveVar.zzi(this);
                return;
            }
            zzxk zzxkVarZzh = zzvfVarArr[i2].zzh();
            int i4 = zzxkVarZzh.zzc;
            int i5 = 0;
            while (i5 < i4) {
                zzcz zzczVarZzb = zzxkVarZzh.zzb(i5);
                zzam[] zzamVarArr = new zzam[zzczVarZzb.zzb];
                for (int i6 = 0; i6 < zzczVarZzb.zzb; i6++) {
                    zzam zzamVarZzb = zzczVarZzb.zzb(i6);
                    zzak zzakVarZzb = zzamVarZzb.zzb();
                    String str = zzamVarZzb.zzb;
                    if (str == null) {
                        str = "";
                    }
                    zzakVarZzb.zzK(i2 + ":" + str);
                    zzamVarArr[i6] = zzakVarZzb.zzac();
                }
                zzcz zzczVar = new zzcz(i2 + ":" + zzczVarZzb.zzc, zzamVarArr);
                this.zzd.put(zzczVar, zzczVarZzb);
                zzczVarArr[i3] = zzczVar;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzj(long j, boolean z) {
        for (zzvf zzvfVar : this.zzg) {
            zzvfVar.zzj(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzk() throws IOException {
        int i = 0;
        while (true) {
            zzvf[] zzvfVarArr = this.zza;
            if (i >= zzvfVarArr.length) {
                return;
            }
            zzvfVarArr[i].zzk();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzl(zzve zzveVar, long j) {
        this.zze = zzveVar;
        Collections.addAll(this.zzc, this.zza);
        int i = 0;
        while (true) {
            zzvf[] zzvfVarArr = this.zza;
            if (i >= zzvfVarArr.length) {
                return;
            }
            zzvfVarArr[i].zzl(this, j);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzvf zzn(int i) {
        zzvf zzvfVar = this.zza[i];
        return zzvfVar instanceof zzxg ? ((zzxg) zzvfVar).zzn() : zzvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final boolean zzo(zzlg zzlgVar) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(zzlgVar);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((zzvf) this.zzc.get(i)).zzo(zzlgVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
