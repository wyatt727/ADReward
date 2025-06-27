package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfzt {
    public static Object zza(Iterable iterable, Object obj) {
        zzgbi zzgbiVar = new zzgbi((zzgbj) iterable);
        return zzgbiVar.hasNext() ? zzgbiVar.next() : obj;
    }

    public static boolean zzb(Iterable iterable, zzfws zzfwsVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            Objects.requireNonNull(zzfwsVar);
            return zzd((List) iterable, zzfwsVar);
        }
        Iterator it = iterable.iterator();
        Objects.requireNonNull(zzfwsVar);
        boolean z = false;
        while (it.hasNext()) {
            if (zzfwsVar.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    private static void zzc(List list, zzfws zzfwsVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzfwsVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    private static boolean zzd(List list, zzfws zzfwsVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzfwsVar.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        zzc(list, zzfwsVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzc(list, zzfwsVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
