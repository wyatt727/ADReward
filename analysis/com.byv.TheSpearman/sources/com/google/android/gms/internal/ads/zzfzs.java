package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfzs<E> extends zzfzi<E> implements Set<E> {

    @CheckForNull
    private transient zzfzn zza;

    zzfzs() {
    }

    static int zzh(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            zzfwr.zzf(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzfzr zzj(int i) {
        return new zzfzr(i);
    }

    public static zzfzs zzl(Collection collection) {
        if ((collection instanceof zzfzs) && !(collection instanceof SortedSet)) {
            zzfzs zzfzsVar = (zzfzs) collection;
            if (!zzfzsVar.zzf()) {
                return zzfzsVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzfzs zzm(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? zzv(length, (Object[]) objArr.clone()) : new zzgbq(objArr[0]) : zzgbf.zza;
    }

    public static zzfzs zzn() {
        return zzgbf.zza;
    }

    public static zzfzs zzo(Object obj) {
        return new zzgbq(obj);
    }

    public static zzfzs zzp(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzfzs zzq(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzfzs zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzfzs zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzv(12, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfzs) && zzu() && ((zzfzs) obj).zzu() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgbp.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgbp.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    public zzfzn zzd() {
        zzfzn zzfznVar = this.zza;
        if (zzfznVar != null) {
            return zzfznVar;
        }
        zzfzn zzfznVarZzi = zzi();
        this.zza = zzfznVarZzi;
        return zzfznVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzgbt iterator();

    zzfzn zzi() {
        Object[] array = toArray();
        int i = zzfzn.zzd;
        return zzfzn.zzj(array, array.length);
    }

    boolean zzu() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfzs zzv(int i, Object... objArr) {
        if (i == 0) {
            return zzgbf.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgbq(obj);
        }
        int iZzh = zzh(i);
        Object[] objArr2 = new Object[iZzh];
        int i2 = iZzh - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            zzgax.zza(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iZza = zzfzf.zza(iHashCode);
            while (true) {
                int i6 = iZza & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgbq(obj4);
        }
        if (zzh(i4) < iZzh / 2) {
            return zzv(i4, objArr);
        }
        if (zzw(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzgbf(objArr, i3, objArr2, i2, i4);
    }
}
