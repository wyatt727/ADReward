package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhbp implements zzhcg {
    private final zzhbl zza;
    private final zzhcx zzb;
    private final boolean zzc;
    private final zzgzg zzd;

    private zzhbp(zzhcx zzhcxVar, zzgzg zzgzgVar, zzhbl zzhblVar) {
        this.zzb = zzhcxVar;
        this.zzc = zzgzgVar.zzi(zzhblVar);
        this.zzd = zzgzgVar;
        this.zza = zzhblVar;
    }

    static zzhbp zzc(zzhcx zzhcxVar, zzgzg zzgzgVar, zzhbl zzhblVar) {
        return new zzhbp(zzhcxVar, zzgzgVar, zzhblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final int zza(Object obj) {
        zzhcx zzhcxVar = this.zzb;
        int iZzb = zzhcxVar.zzb(zzhcxVar.zzd(obj));
        return this.zzc ? iZzb + this.zzd.zzb(obj).zzd() : iZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzd(obj).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zzb(obj).zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final Object zze() {
        zzhbl zzhblVar = this.zza;
        return zzhblVar instanceof zzgzv ? ((zzgzv) zzhblVar).zzbj() : zzhblVar.zzcY().zzbs();
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final void zzg(Object obj, Object obj2) {
        zzhci.zzr(this.zzb, obj, obj2);
        if (this.zzc) {
            zzhci.zzq(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final void zzh(Object obj, zzhby zzhbyVar, zzgzf zzgzfVar) throws IOException {
        boolean zZzQ;
        zzhcx zzhcxVar = this.zzb;
        Object objZzc = zzhcxVar.zzc(obj);
        zzgzg zzgzgVar = this.zzd;
        zzgzk zzgzkVarZzc = zzgzgVar.zzc(obj);
        while (zzhbyVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzhbyVar.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZzd = zzgzgVar.zzd(zzgzfVar, this.zza, iZzd >>> 3);
                        if (objZzd != null) {
                            zzgzgVar.zzg(zzhbyVar, objZzd, zzgzfVar, zzgzkVarZzc);
                        } else {
                            zZzQ = zzhcxVar.zzp(objZzc, zzhbyVar);
                        }
                    } else {
                        zZzQ = zzhbyVar.zzQ();
                    }
                    if (!zZzQ) {
                        break;
                    }
                } else {
                    int iZzj = 0;
                    Object objZzd2 = null;
                    zzgyj zzgyjVarZzp = null;
                    while (zzhbyVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzhbyVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzhbyVar.zzj();
                            objZzd2 = zzgzgVar.zzd(zzgzfVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZzd2 != null) {
                                zzgzgVar.zzg(zzhbyVar, objZzd2, zzgzfVar, zzgzkVarZzc);
                            } else {
                                zzgyjVarZzp = zzhbyVar.zzp();
                            }
                        } else if (!zzhbyVar.zzQ()) {
                            break;
                        }
                    }
                    if (zzhbyVar.zzd() != 12) {
                        throw zzhak.zzb();
                    }
                    if (zzgyjVarZzp != null) {
                        if (objZzd2 != null) {
                            zzgzgVar.zzh(zzgyjVarZzp, objZzd2, zzgzfVar, zzgzkVarZzc);
                        } else {
                            zzhcxVar.zzk(objZzc, iZzj, zzgyjVarZzp);
                        }
                    }
                }
            } finally {
                zzhcxVar.zzn(obj, objZzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgxv zzgxvVar) throws IOException {
        zzgzv zzgzvVar = (zzgzv) obj;
        if (zzgzvVar.zzt == zzhcy.zzc()) {
            zzgzvVar.zzt = zzhcy.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final boolean zzj(Object obj, Object obj2) {
        zzhcx zzhcxVar = this.zzb;
        if (!zzhcxVar.zzd(obj).equals(zzhcxVar.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final boolean zzk(Object obj) {
        return this.zzd.zzb(obj).zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final void zzm(Object obj, zzgzb zzgzbVar) throws IOException {
        Iterator itZzg = this.zzd.zzb(obj).zzg();
        while (itZzg.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzg.next();
            zzgzj zzgzjVar = (zzgzj) entry.getKey();
            if (zzgzjVar.zze() != zzhdo.MESSAGE || zzgzjVar.zzg() || zzgzjVar.zzf()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzhao) {
                zzgzbVar.zzw(zzgzjVar.zza(), ((zzhao) entry).zza().zzb());
            } else {
                zzgzbVar.zzw(zzgzjVar.zza(), entry.getValue());
            }
        }
        zzhcx zzhcxVar = this.zzb;
        zzhcxVar.zzr(zzhcxVar.zzd(obj), zzgzbVar);
    }
}
