package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjn;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
abstract class zzjk<T extends zzjn<T>> {
    zzjk() {
    }

    abstract int zza(Map.Entry<?, ?> entry);

    abstract zzjl<T> zza(Object obj);

    abstract Object zza(zzji zzjiVar, zzli zzliVar, int i);

    abstract <UT, UB> UB zza(Object obj, zzlx zzlxVar, Object obj2, zzji zzjiVar, zzjl<T> zzjlVar, UB ub, zzmv<UT, UB> zzmvVar) throws IOException;

    abstract void zza(zzii zziiVar, Object obj, zzji zzjiVar, zzjl<T> zzjlVar) throws IOException;

    abstract void zza(zzlx zzlxVar, Object obj, zzji zzjiVar, zzjl<T> zzjlVar) throws IOException;

    abstract void zza(zznv zznvVar, Map.Entry<?, ?> entry) throws IOException;

    abstract boolean zza(zzli zzliVar);

    abstract zzjl<T> zzb(Object obj);

    abstract void zzc(Object obj);
}
