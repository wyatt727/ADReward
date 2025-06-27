package com.bytedance.adsdk.lottie;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ArraySet.java */
/* loaded from: classes2.dex */
public final class EYQ<E> implements Collection<E>, Set<E> {
    private static int IPb;
    private static Object[] Kbd;
    private static int QQ;
    private static Object[] VwS;
    Object[] EYQ;
    private int[] HX;
    int mZx;
    private nWX<E, E> tp;
    private static final int[] Td = new int[0];
    private static final Object[] Pm = new Object[0];

    private int EYQ(Object obj, int i) {
        int i2 = this.mZx;
        if (i2 == 0) {
            return -1;
        }
        int iEYQ = mZx.EYQ(this.HX, i2, i);
        if (iEYQ < 0 || obj.equals(this.EYQ[iEYQ])) {
            return iEYQ;
        }
        int i3 = iEYQ + 1;
        while (i3 < i2 && this.HX[i3] == i) {
            if (obj.equals(this.EYQ[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iEYQ - 1; i4 >= 0 && this.HX[i4] == i; i4--) {
            if (obj.equals(this.EYQ[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    private int EYQ() {
        int i = this.mZx;
        if (i == 0) {
            return -1;
        }
        int iEYQ = mZx.EYQ(this.HX, i, 0);
        if (iEYQ < 0 || this.EYQ[iEYQ] == null) {
            return iEYQ;
        }
        int i2 = iEYQ + 1;
        while (i2 < i && this.HX[i2] == 0) {
            if (this.EYQ[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iEYQ - 1; i3 >= 0 && this.HX[i3] == 0; i3--) {
            if (this.EYQ[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    private void Pm(int i) {
        if (i == 8) {
            synchronized (EYQ.class) {
                Object[] objArr = VwS;
                if (objArr != null) {
                    this.EYQ = objArr;
                    VwS = (Object[]) objArr[0];
                    this.HX = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    QQ--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (EYQ.class) {
                Object[] objArr2 = Kbd;
                if (objArr2 != null) {
                    this.EYQ = objArr2;
                    Kbd = (Object[]) objArr2[0];
                    this.HX = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    IPb--;
                    return;
                }
            }
        }
        this.HX = new int[i];
        this.EYQ = new Object[i];
    }

    private static void EYQ(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (EYQ.class) {
                if (QQ < 10) {
                    objArr[0] = VwS;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    VwS = objArr;
                    QQ++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (EYQ.class) {
                if (IPb < 10) {
                    objArr[0] = Kbd;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    Kbd = objArr;
                    IPb++;
                }
            }
        }
    }

    public EYQ() {
        this(0);
    }

    public EYQ(int i) {
        if (i == 0) {
            this.HX = Td;
            this.EYQ = Pm;
        } else {
            Pm(i);
        }
        this.mZx = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.mZx;
        if (i != 0) {
            EYQ(this.HX, this.EYQ, i);
            this.HX = Td;
            this.EYQ = Pm;
            this.mZx = 0;
        }
    }

    public void EYQ(int i) {
        int[] iArr = this.HX;
        if (iArr.length < i) {
            Object[] objArr = this.EYQ;
            Pm(i);
            int i2 = this.mZx;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.HX, 0, i2);
                System.arraycopy(objArr, 0, this.EYQ, 0, this.mZx);
            }
            EYQ(iArr, objArr, this.mZx);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return EYQ(obj) >= 0;
    }

    public int EYQ(Object obj) {
        return obj == null ? EYQ() : EYQ(obj, obj.hashCode());
    }

    public E mZx(int i) {
        return (E) this.EYQ[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.mZx <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int iEYQ;
        if (e == null) {
            iEYQ = EYQ();
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iEYQ = EYQ(e, iHashCode);
        }
        if (iEYQ >= 0) {
            return false;
        }
        int i2 = ~iEYQ;
        int i3 = this.mZx;
        int[] iArr = this.HX;
        if (i3 >= iArr.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.EYQ;
            Pm(i4);
            int[] iArr2 = this.HX;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.EYQ, 0, objArr.length);
            }
            EYQ(iArr, objArr, this.mZx);
        }
        int i5 = this.mZx;
        if (i2 < i5) {
            int[] iArr3 = this.HX;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.EYQ;
            System.arraycopy(objArr2, i2, objArr2, i6, this.mZx - i2);
        }
        this.HX[i2] = i;
        this.EYQ[i2] = e;
        this.mZx++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iEYQ = EYQ(obj);
        if (iEYQ < 0) {
            return false;
        }
        Td(iEYQ);
        return true;
    }

    public E Td(int i) {
        Object[] objArr = this.EYQ;
        E e = (E) objArr[i];
        int i2 = this.mZx;
        if (i2 <= 1) {
            EYQ(this.HX, objArr, i2);
            this.HX = Td;
            this.EYQ = Pm;
            this.mZx = 0;
        } else {
            int[] iArr = this.HX;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                Pm(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.mZx--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.HX, 0, i);
                    System.arraycopy(objArr, 0, this.EYQ, 0, i);
                }
                int i3 = this.mZx;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, this.HX, i, i3 - i);
                    System.arraycopy(objArr, i4, this.EYQ, i, this.mZx - i);
                }
            } else {
                int i5 = i2 - 1;
                this.mZx = i5;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, iArr, i, i5 - i);
                    Object[] objArr2 = this.EYQ;
                    System.arraycopy(objArr2, i6, objArr2, i, this.mZx - i);
                }
                this.EYQ[this.mZx] = null;
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.mZx;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.mZx;
        Object[] objArr = new Object[i];
        System.arraycopy(this.EYQ, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.mZx) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.mZx));
        }
        System.arraycopy(this.EYQ, 0, tArr, 0, this.mZx);
        int length = tArr.length;
        int i = this.mZx;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.mZx; i++) {
                try {
                    if (!set.contains(mZx(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.HX;
        int i = this.mZx;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.mZx * 14);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i = 0; i < this.mZx; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eMZx = mZx(i);
            if (eMZx != this) {
                sb.append(eMZx);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    private nWX<E, E> mZx() {
        if (this.tp == null) {
            this.tp = new nWX<E, E>() { // from class: com.bytedance.adsdk.lottie.EYQ.1
                @Override // com.bytedance.adsdk.lottie.nWX
                protected int EYQ() {
                    return EYQ.this.mZx;
                }

                @Override // com.bytedance.adsdk.lottie.nWX
                protected Object EYQ(int i, int i2) {
                    return EYQ.this.EYQ[i];
                }

                @Override // com.bytedance.adsdk.lottie.nWX
                protected int EYQ(Object obj) {
                    return EYQ.this.EYQ(obj);
                }

                @Override // com.bytedance.adsdk.lottie.nWX
                protected Map<E, E> mZx() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.lottie.nWX
                protected void EYQ(int i) {
                    EYQ.this.Td(i);
                }

                @Override // com.bytedance.adsdk.lottie.nWX
                protected void Td() {
                    EYQ.this.clear();
                }
            };
        }
        return this.tp;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return mZx().Pm().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        EYQ(this.mZx + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.mZx - 1; i >= 0; i--) {
            if (!collection.contains(this.EYQ[i])) {
                Td(i);
                z = true;
            }
        }
        return z;
    }
}
