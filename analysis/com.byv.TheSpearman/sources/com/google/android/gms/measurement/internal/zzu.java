package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzoe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzu extends zznd {
    private String zza;
    private Set<Integer> zzb;
    private Map<Integer, zzw> zzc;
    private Long zzd;
    private Long zze;

    private final zzw zza(Integer num) {
        if (this.zzc.containsKey(num)) {
            return this.zzc.get(num);
        }
        zzw zzwVar = new zzw(this, this.zza);
        this.zzc.put(num, zzwVar);
        return zzwVar;
    }

    @Override // com.google.android.gms.measurement.internal.zznd
    protected final boolean zzc() {
        return false;
    }

    final List<zzfu.zzc> zza(String str, List<zzfu.zze> list, List<zzfu.zzn> list2, Long l, Long l2) {
        return zza(str, list, list2, l, l2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x031c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List<com.google.android.gms.internal.measurement.zzfu.zzc> zza(java.lang.String r24, java.util.List<com.google.android.gms.internal.measurement.zzfu.zze> r25, java.util.List<com.google.android.gms.internal.measurement.zzfu.zzn> r26, java.lang.Long r27, java.lang.Long r28, boolean r29) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzu.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.List");
    }

    private final List<zzfu.zzc> zzu() throws IllegalStateException {
        ArrayList arrayList = new ArrayList();
        Set<Integer> setKeySet = this.zzc.keySet();
        setKeySet.removeAll(this.zzb);
        Iterator<Integer> it = setKeySet.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            zzw zzwVar = this.zzc.get(Integer.valueOf(iIntValue));
            Preconditions.checkNotNull(zzwVar);
            zzfu.zzc zzcVarZza = zzwVar.zza(iIntValue);
            arrayList.add(zzcVarZza);
            zzal zzalVarZzh = zzh();
            String str = this.zza;
            zzfu.zzl zzlVarZzd = zzcVarZza.zzd();
            zzalVarZzh.zzak();
            zzalVarZzh.zzt();
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotNull(zzlVarZzd);
            byte[] bArrZzbx = zzlVarZzd.zzbx();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(iIntValue));
            contentValues.put("current_results", bArrZzbx);
            try {
                if (zzalVarZzh.e_().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    zzalVarZzh.zzj().zzg().zza("Failed to insert filter results (got -1). appId", zzfz.zza(str));
                }
            } catch (SQLiteException e) {
                zzalVarZzh.zzj().zzg().zza("Error storing filter results. appId", zzfz.zza(str), e);
            }
        }
        return arrayList;
    }

    zzu(zzni zzniVar) {
        super(zzniVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(List<zzfu.zze> list, boolean z) throws IllegalStateException {
        zzaz zzazVar;
        int i;
        Map<Integer, List<zzfi.zzb>> map;
        long j;
        if (list.isEmpty()) {
            return;
        }
        String str = null;
        zzy zzyVar = new zzy(this);
        ArrayMap arrayMap = new ArrayMap();
        for (zzfu.zze zzeVar : list) {
            zzfu.zze zzeVarZza = zzyVar.zza(this.zza, zzeVar);
            if (zzeVarZza != null) {
                zzal zzalVarZzh = zzh();
                String str2 = this.zza;
                String strZzg = zzeVarZza.zzg();
                zzaz zzazVarZzd = zzalVarZzh.zzd(str2, zzeVar.zzg());
                if (zzazVarZzd == null) {
                    zzalVarZzh.zzj().zzu().zza("Event aggregate wasn't created during raw event logging. appId, event", zzfz.zza(str2), zzalVarZzh.zzi().zza(strZzg));
                    zzazVar = new zzaz(str2, zzeVar.zzg(), 1L, 1L, 1L, zzeVar.zzd(), 0L, null, null, null, null);
                } else {
                    zzazVar = new zzaz(zzazVarZzd.zza, zzazVarZzd.zzb, zzazVarZzd.zzc + 1, zzazVarZzd.zzd + 1, zzazVarZzd.zze + 1, zzazVarZzd.zzf, zzazVarZzd.zzg, zzazVarZzd.zzh, zzazVarZzd.zzi, zzazVarZzd.zzj, zzazVarZzd.zzk);
                }
                zzaz zzazVar2 = zzazVar;
                zzh().zza(zzazVar2);
                if (!zzoe.zza() || !zze().zzf(str, zzbf.zzdf) || !z) {
                    long j2 = zzazVar2.zzc;
                    String strZzg2 = zzeVarZza.zzg();
                    Map<Integer, List<zzfi.zzb>> mapZzf = (Map) arrayMap.get(strZzg2);
                    if (mapZzf == null) {
                        mapZzf = zzh().zzf(this.zza, strZzg2);
                        arrayMap.put(strZzg2, mapZzf);
                    }
                    Map<Integer, List<zzfi.zzb>> map2 = mapZzf;
                    Iterator<Integer> it = map2.keySet().iterator();
                    while (it.hasNext()) {
                        int iIntValue = it.next().intValue();
                        if (this.zzb.contains(Integer.valueOf(iIntValue))) {
                            zzj().zzp().zza("Skipping failed audience ID", Integer.valueOf(iIntValue));
                        } else {
                            boolean zZza = true;
                            Iterator<zzfi.zzb> it2 = map2.get(Integer.valueOf(iIntValue)).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    i = iIntValue;
                                    map = map2;
                                    j = j2;
                                    break;
                                }
                                zzfi.zzb next = it2.next();
                                zzaa zzaaVar = new zzaa(this, this.zza, iIntValue, next);
                                i = iIntValue;
                                map = map2;
                                j = j2;
                                zZza = zzaaVar.zza(this.zzd, this.zze, zzeVarZza, j2, zzazVar2, zza(iIntValue, next.zzb()));
                                if (zZza) {
                                    zza(Integer.valueOf(i)).zza(zzaaVar);
                                    iIntValue = i;
                                    map2 = map;
                                    j2 = j;
                                } else {
                                    this.zzb.add(Integer.valueOf(i));
                                    break;
                                }
                            }
                            if (!zZza) {
                                this.zzb.add(Integer.valueOf(i));
                            }
                            map2 = map;
                            j2 = j;
                            str = null;
                        }
                    }
                }
            }
        }
    }

    private final void zza(List<zzfu.zzn> list) throws IllegalStateException {
        zzfi.zze next;
        if (list.isEmpty()) {
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        for (zzfu.zzn zznVar : list) {
            String strZzg = zznVar.zzg();
            Map<Integer, List<zzfi.zze>> mapZzg = (Map) arrayMap.get(strZzg);
            if (mapZzg == null) {
                mapZzg = zzh().zzg(this.zza, strZzg);
                arrayMap.put(strZzg, mapZzg);
            }
            Iterator<Integer> it = mapZzg.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    if (this.zzb.contains(Integer.valueOf(iIntValue))) {
                        zzj().zzp().zza("Skipping failed audience ID", Integer.valueOf(iIntValue));
                        break;
                    }
                    boolean zZza = true;
                    Iterator<zzfi.zze> it2 = mapZzg.get(Integer.valueOf(iIntValue)).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        next = it2.next();
                        if (zzj().zza(2)) {
                            zzj().zzp().zza("Evaluating filter. audience, filter, property", Integer.valueOf(iIntValue), next.zzi() ? Integer.valueOf(next.zza()) : null, zzi().zzc(next.zze()));
                            zzj().zzp().zza("Filter definition", g_().zza(next));
                        }
                        if (!next.zzi() || next.zza() > 256) {
                            break;
                        }
                        zzac zzacVar = new zzac(this, this.zza, iIntValue, next);
                        zZza = zzacVar.zza(this.zzd, this.zze, zznVar, zza(iIntValue, next.zza()));
                        if (zZza) {
                            zza(Integer.valueOf(iIntValue)).zza(zzacVar);
                        } else {
                            this.zzb.add(Integer.valueOf(iIntValue));
                            break;
                        }
                    }
                    zzj().zzu().zza("Invalid property filter ID. appId, id", zzfz.zza(this.zza), String.valueOf(next.zzi() ? Integer.valueOf(next.zza()) : null));
                    zZza = false;
                    if (!zZza) {
                        this.zzb.add(Integer.valueOf(iIntValue));
                    }
                }
            }
        }
    }

    private final boolean zza(int i, int i2) {
        zzw zzwVar = this.zzc.get(Integer.valueOf(i));
        if (zzwVar == null) {
            return false;
        }
        return zzwVar.zzd.get(i2);
    }
}
