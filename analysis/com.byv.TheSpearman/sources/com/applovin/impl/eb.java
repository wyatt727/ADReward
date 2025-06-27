package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class eb extends ya implements Set {
    private transient ab b;

    private static boolean a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public static eb h() {
        return ki.i;
    }

    boolean g() {
        return false;
    }

    @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public abstract qp iterator();

    eb() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof eb) && g() && ((eb) obj).g() && hashCode() != obj.hashCode()) {
            return false;
        }
        return nj.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return nj.a(this);
    }

    @Override // com.applovin.impl.ya
    public ab a() {
        ab abVar = this.b;
        if (abVar != null) {
            return abVar;
        }
        ab abVarF = f();
        this.b = abVarF;
        return abVarF;
    }

    ab f() {
        return ab.a(toArray());
    }

    static int a(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (iHighestOneBit * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        Preconditions.checkArgument(iMax < 1073741824, "collection too large");
        return 1073741824;
    }

    private static eb a(int i, Object... objArr) {
        if (i == 0) {
            return h();
        }
        if (i != 1) {
            int iA = a(i);
            Object[] objArr2 = new Object[iA];
            int i2 = iA - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object objA = cg.a(objArr[i5], i5);
                int iHashCode = objA.hashCode();
                int iA2 = ia.a(iHashCode);
                while (true) {
                    int i6 = iA2 & i2;
                    Object obj = objArr2[i6];
                    if (obj == null) {
                        objArr[i4] = objA;
                        objArr2[i6] = objA;
                        i3 += iHashCode;
                        i4++;
                        break;
                    }
                    if (obj.equals(objA)) {
                        break;
                    }
                    iA2++;
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                return new ek(objArr[0], i3);
            }
            if (a(i4) < iA / 2) {
                return a(i4, objArr);
            }
            if (a(i4, objArr.length)) {
                objArr = Arrays.copyOf(objArr, i4);
            }
            return new ki(objArr, i3, objArr2, i2, i4);
        }
        return a(objArr[0]);
    }

    public static eb a(Collection collection) {
        if ((collection instanceof eb) && !(collection instanceof SortedSet)) {
            eb ebVar = (eb) collection;
            if (!ebVar.e()) {
                return ebVar;
            }
        }
        Object[] array = collection.toArray();
        return a(array.length, array);
    }

    public static eb a(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return h();
        }
        if (length != 1) {
            return a(objArr.length, (Object[]) objArr.clone());
        }
        return a(objArr[0]);
    }

    public static eb a(Object obj, Object obj2) {
        return a(2, obj, obj2);
    }

    public static eb a(Object obj, Object obj2, Object obj3) {
        return a(3, obj, obj2, obj3);
    }

    public static eb a(Object obj) {
        return new ek(obj);
    }
}
