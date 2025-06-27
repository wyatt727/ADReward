package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfzn<E> extends zzfzi<E> implements List<E>, RandomAccess {
    private static final zzgbu zza = new zzfzl(zzgaz.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzfzn() {
    }

    public static zzfzk zzi(int i) {
        return new zzfzk(i);
    }

    static zzfzn zzj(Object[] objArr, int i) {
        return i == 0 ? zzgaz.zza : new zzgaz(objArr, i);
    }

    public static zzfzn zzk(Collection collection) {
        if (!(collection instanceof zzfzi)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzgax.zzb(array, length);
            return zzj(array, length);
        }
        zzfzn zzfznVarZzd = ((zzfzi) collection).zzd();
        if (!zzfznVarZzd.zzf()) {
            return zzfznVarZzd;
        }
        Object[] array2 = zzfznVarZzd.toArray();
        return zzj(array2, array2.length);
    }

    public static zzfzn zzl(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgaz.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgax.zzb(objArr2, length);
        return zzj(objArr2, length);
    }

    public static zzfzn zzm() {
        return zzgaz.zza;
    }

    public static zzfzn zzn(Object obj) {
        Object[] objArr = {obj};
        zzgax.zzb(objArr, 1);
        return zzj(objArr, 1);
    }

    public static zzfzn zzo(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgax.zzb(objArr, 2);
        return zzj(objArr, 2);
    }

    public static zzfzn zzp(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzgax.zzb(objArr, 3);
        return zzj(objArr, 3);
    }

    public static zzfzn zzq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzgax.zzb(objArr, 5);
        return zzj(objArr, 5);
    }

    public static zzfzn zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzgax.zzb(objArr, 6);
        return zzj(objArr, 6);
    }

    public static zzfzn zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9};
        zzgax.zzb(objArr, 9);
        return zzj(objArr, 9);
    }

    public static zzfzn zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10};
        zzgax.zzb(objArr, 10);
        return zzj(objArr, 10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfzi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzfwl.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzfwl.zza(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    @Deprecated
    public final zzfzn zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    /* renamed from: zze */
    public final zzgbt iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzfzn subList(int i, int i2) {
        zzfwr.zzi(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzgaz.zza : new zzfzm(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzgbu listIterator(int i) {
        zzfwr.zzb(i, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new zzfzl(this, i);
    }
}
