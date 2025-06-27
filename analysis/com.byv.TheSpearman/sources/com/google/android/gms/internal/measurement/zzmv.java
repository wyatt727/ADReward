package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
abstract class zzmv<T, B> {
    zzmv() {
    }

    abstract int zza(T t);

    abstract B zza();

    abstract T zza(T t, T t2);

    abstract void zza(B b, int i, int i2);

    abstract void zza(B b, int i, long j);

    abstract void zza(B b, int i, zzii zziiVar);

    abstract void zza(B b, int i, T t);

    abstract void zza(T t, zznv zznvVar) throws IOException;

    abstract boolean zza(zzlx zzlxVar);

    abstract int zzb(T t);

    abstract void zzb(B b, int i, long j);

    abstract void zzb(T t, zznv zznvVar) throws IOException;

    abstract void zzb(Object obj, B b);

    abstract B zzc(Object obj);

    abstract void zzc(Object obj, T t);

    abstract T zzd(Object obj);

    abstract T zze(B b);

    abstract void zzf(Object obj);

    final boolean zza(B b, zzlx zzlxVar) throws IOException {
        int iZzd = zzlxVar.zzd();
        int i = iZzd >>> 3;
        int i2 = iZzd & 7;
        if (i2 == 0) {
            zzb(b, i, zzlxVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zza((zzmv<T, B>) b, i, zzlxVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zza((zzmv<T, B>) b, i, zzlxVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzkd.zza();
            }
            zza((zzmv<T, B>) b, i, zzlxVar.zzf());
            return true;
        }
        B bZza = zza();
        int i3 = 4 | (i << 3);
        while (zzlxVar.zzc() != Integer.MAX_VALUE && zza((zzmv<T, B>) bZza, zzlxVar)) {
        }
        if (i3 != zzlxVar.zzd()) {
            throw zzkd.zzb();
        }
        zza((zzmv<T, B>) b, i, (int) zze(bZza));
        return true;
    }
}
