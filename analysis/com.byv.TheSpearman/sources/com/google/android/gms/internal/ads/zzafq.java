package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzafq extends zzafs {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzafq() {
        super(new zzade());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzfo zzfoVar) {
        return Double.valueOf(Double.longBitsToDouble(zzfoVar.zzt()));
    }

    private static String zzi(zzfo zzfoVar) {
        int iZzq = zzfoVar.zzq();
        int iZzd = zzfoVar.zzd();
        zzfoVar.zzL(iZzq);
        return new String(zzfoVar.zzM(), iZzd, iZzq);
    }

    private static HashMap zzj(zzfo zzfoVar) {
        int iZzp = zzfoVar.zzp();
        HashMap map = new HashMap(iZzp);
        for (int i = 0; i < iZzp; i++) {
            String strZzi = zzi(zzfoVar);
            Object objZzh = zzh(zzfoVar, zzfoVar.zzm());
            if (objZzh != null) {
                map.put(strZzi, objZzh);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    protected final boolean zza(zzfo zzfoVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    protected final boolean zzb(zzfo zzfoVar, long j) {
        if (zzfoVar.zzm() == 2 && "onMetaData".equals(zzi(zzfoVar)) && zzfoVar.zzb() != 0 && zzfoVar.zzm() == 8) {
            HashMap mapZzj = zzj(zzfoVar);
            Object obj = mapZzj.get("duration");
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    this.zzb = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapZzj.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }

    private static Object zzh(zzfo zzfoVar, int i) {
        if (i == 0) {
            return zzg(zzfoVar);
        }
        if (i == 1) {
            return Boolean.valueOf(zzfoVar.zzm() == 1);
        }
        if (i == 2) {
            return zzi(zzfoVar);
        }
        if (i != 3) {
            if (i == 8) {
                return zzj(zzfoVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzfoVar).doubleValue());
                zzfoVar.zzL(2);
                return date;
            }
            int iZzp = zzfoVar.zzp();
            ArrayList arrayList = new ArrayList(iZzp);
            for (int i2 = 0; i2 < iZzp; i2++) {
                Object objZzh = zzh(zzfoVar, zzfoVar.zzm());
                if (objZzh != null) {
                    arrayList.add(objZzh);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strZzi = zzi(zzfoVar);
            int iZzm = zzfoVar.zzm();
            if (iZzm == 9) {
                return map;
            }
            Object objZzh2 = zzh(zzfoVar, iZzm);
            if (objZzh2 != null) {
                map.put(strZzi, objZzh2);
            }
        }
    }
}
