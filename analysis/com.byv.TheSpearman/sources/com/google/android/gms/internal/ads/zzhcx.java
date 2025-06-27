package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzhcx {
    zzhcx() {
    }

    abstract int zza(Object obj);

    abstract int zzb(Object obj);

    abstract Object zzc(Object obj);

    abstract Object zzd(Object obj);

    abstract Object zze(Object obj, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i, int i2);

    abstract void zzi(Object obj, int i, long j);

    abstract void zzj(Object obj, int i, Object obj2);

    abstract void zzk(Object obj, int i, zzgyj zzgyjVar);

    abstract void zzl(Object obj, int i, long j);

    abstract void zzm(Object obj);

    abstract void zzn(Object obj, Object obj2);

    abstract void zzo(Object obj, Object obj2);

    abstract boolean zzq(zzhby zzhbyVar);

    abstract void zzr(Object obj, zzgzb zzgzbVar) throws IOException;

    abstract void zzs(Object obj, zzgzb zzgzbVar) throws IOException;

    final boolean zzp(Object obj, zzhby zzhbyVar) throws IOException {
        int iZzd = zzhbyVar.zzd();
        int i = iZzd >>> 3;
        int i2 = iZzd & 7;
        if (i2 == 0) {
            zzl(obj, i, zzhbyVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zzi(obj, i, zzhbyVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zzk(obj, i, zzhbyVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhak.zza();
            }
            zzh(obj, i, zzhbyVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        int i3 = i << 3;
        while (zzhbyVar.zzc() != Integer.MAX_VALUE && zzp(objZzf, zzhbyVar)) {
        }
        if ((4 | i3) != zzhbyVar.zzd()) {
            throw zzhak.zzb();
        }
        zzg(objZzf);
        zzj(obj, i, objZzf);
        return true;
    }
}
