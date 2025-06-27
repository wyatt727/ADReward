package com.google.android.gms.internal.games;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzfy<E> extends zzfs<E> implements Set<E> {

    @NullableDecl
    private transient zzft<E> zzmw;

    public static <E> zzfy<E> zze(E e) {
        return new zzgd(e);
    }

    boolean zzcu() {
        return false;
    }

    public static <E> zzfy<E> zza(E e, E e2, E e3) {
        return zza(3, e, e2, e3);
    }

    @SafeVarargs
    public static <E> zzfy<E> zza(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        zzfo.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return zza(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> zzfy<E> zza(int i, Object... objArr) {
        while (i != 0) {
            if (i == 1) {
                return zze(objArr[0]);
            }
            int iZzr = zzr(i);
            Object[] objArr2 = new Object[iZzr];
            int i2 = iZzr - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object objZza = zzfz.zza(objArr[i5], i5);
                int iHashCode = objZza.hashCode();
                int iZzp = zzfp.zzp(iHashCode);
                while (true) {
                    int i6 = iZzp & i2;
                    Object obj = objArr2[i6];
                    if (obj == null) {
                        objArr[i4] = objZza;
                        objArr2[i6] = objZza;
                        i3 += iHashCode;
                        i4++;
                        break;
                    }
                    if (!obj.equals(objZza)) {
                        iZzp++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                return new zzgd(objArr[0], i3);
            }
            if (zzr(i4) >= iZzr / 2) {
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzgb(objArr, i3, objArr2, i2, i4);
            }
            i = i4;
        }
        return zzgb.zzmz;
    }

    private static int zzr(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (iHighestOneBit * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        zzfo.checkArgument(iMax < 1073741824, "collection too large");
        return 1073741824;
    }

    zzfy() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfy) && zzcu() && ((zzfy) obj).zzcu() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzge.zza(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            E next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    @Override // com.google.android.gms.internal.games.zzfs
    public final zzft<E> zzcr() {
        zzft<E> zzftVar = this.zzmw;
        if (zzftVar != null) {
            return zzftVar;
        }
        zzft<E> zzftVarZzcv = zzcv();
        this.zzmw = zzftVarZzcv;
        return zzftVarZzcv;
    }

    zzft<E> zzcv() {
        return zzft.zza(toArray());
    }

    @Override // com.google.android.gms.internal.games.zzfs, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
