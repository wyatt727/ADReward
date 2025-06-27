package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgbp {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static zzgbo zzb(Set set, Set set2) {
        zzfwr.zzc(set, "set1");
        zzfwr.zzc(set2, "set2");
        return new zzgbj(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzc(Set set, zzfws zzfwsVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzgbk)) {
                Objects.requireNonNull(set);
                return new zzgbk(set, zzfwsVar);
            }
            zzgbk zzgbkVar = (zzgbk) set;
            return new zzgbk(zzgbkVar.zza, zzfwv.zza(zzgbkVar.zzb, zzfwsVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof zzgbk)) {
            Objects.requireNonNull(sortedSet);
            return new zzgbl(sortedSet, zzfwsVar);
        }
        zzgbk zzgbkVar2 = (zzgbk) sortedSet;
        return new zzgbl((SortedSet) zzgbkVar2.zza, zzfwv.zza(zzgbkVar2.zzb, zzfwsVar));
    }

    static boolean zzd(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean zzf(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    static boolean zze(Set set, Collection collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof zzgav) {
            collection = ((zzgav) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zzf(set, collection.iterator());
        }
        Iterator it = set.iterator();
        Objects.requireNonNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
