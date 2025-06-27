package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzyl extends zzdg {
    public static final zzyl zzF;

    @Deprecated
    public static final zzyl zzG;

    @Deprecated
    public static final zzn zzH;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;
    private static final String zzai;
    private static final String zzaj;
    private static final String zzak;
    private static final String zzal;
    private static final String zzam;
    private static final String zzan;
    private static final String zzao;
    private static final String zzap;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;
    private final SparseArray zzaq;
    private final SparseBooleanArray zzar;

    static {
        zzyl zzylVar = new zzyl(new zzyj());
        zzF = zzylVar;
        zzG = zzylVar;
        zzX = Integer.toString(1000, 36);
        zzY = Integer.toString(1001, 36);
        zzZ = Integer.toString(1002, 36);
        zzaa = Integer.toString(1003, 36);
        zzab = Integer.toString(1004, 36);
        zzac = Integer.toString(1005, 36);
        zzad = Integer.toString(1006, 36);
        zzae = Integer.toString(1007, 36);
        zzaf = Integer.toString(1008, 36);
        zzag = Integer.toString(1009, 36);
        zzah = Integer.toString(1010, 36);
        zzai = Integer.toString(1011, 36);
        zzaj = Integer.toString(1012, 36);
        zzak = Integer.toString(1013, 36);
        zzal = Integer.toString(1014, 36);
        zzam = Integer.toString(1015, 36);
        zzan = Integer.toString(1016, 36);
        zzao = Integer.toString(1017, 36);
        zzap = Integer.toString(1018, 36);
        zzH = new zzn() { // from class: com.google.android.gms.internal.ads.zzyh
        };
    }

    private zzyl(zzyj zzyjVar) {
        super(zzyjVar);
        this.zzI = zzyjVar.zza;
        this.zzJ = false;
        this.zzK = zzyjVar.zzb;
        this.zzL = false;
        this.zzM = zzyjVar.zzc;
        this.zzN = false;
        this.zzO = false;
        this.zzP = false;
        this.zzQ = false;
        this.zzR = zzyjVar.zzd;
        this.zzS = zzyjVar.zze;
        this.zzT = zzyjVar.zzf;
        this.zzU = false;
        this.zzV = zzyjVar.zzg;
        this.zzW = false;
        this.zzaq = zzyjVar.zzh;
        this.zzar = zzyjVar.zzi;
    }

    public static zzyl zzd(Context context) {
        return new zzyl(new zzyj(context));
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzyl zzylVar = (zzyl) obj;
            if (super.equals(zzylVar) && this.zzI == zzylVar.zzI && this.zzK == zzylVar.zzK && this.zzM == zzylVar.zzM && this.zzR == zzylVar.zzR && this.zzS == zzylVar.zzS && this.zzT == zzylVar.zzT && this.zzV == zzylVar.zzV) {
                SparseBooleanArray sparseBooleanArray = this.zzar;
                SparseBooleanArray sparseBooleanArray2 = zzylVar.zzar;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.zzaq;
                            SparseArray sparseArray2 = zzylVar.zzaq;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzxk zzxkVar = (zzxk) entry.getKey();
                                                if (!map2.containsKey(zzxkVar) || !zzfx.zzG(entry.getValue(), map2.get(zzxkVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 28629151) + (this.zzR ? 1 : 0)) * 31) + (this.zzS ? 1 : 0)) * 31) + (this.zzT ? 1 : 0)) * 961) + (this.zzV ? 1 : 0)) * 31;
    }

    public final zzyj zzc() {
        return new zzyj(this, null);
    }

    @Deprecated
    public final zzyn zze(int i, zzxk zzxkVar) {
        Map map = (Map) this.zzaq.get(i);
        if (map != null) {
            return (zzyn) map.get(zzxkVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzar.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzxk zzxkVar) {
        Map map = (Map) this.zzaq.get(i);
        return map != null && map.containsKey(zzxkVar);
    }
}
