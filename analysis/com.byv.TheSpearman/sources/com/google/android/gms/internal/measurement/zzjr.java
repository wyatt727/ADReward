package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzjr extends zzic<Float> implements zzke<Float>, zzlu, RandomAccess {
    private static final zzjr zza = new zzjr(new float[0], 0, false);
    private float[] zzb;
    private int zzc;

    public final float zzb(int i) {
        zzd(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzic, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.zzc; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzb[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzb[i] == fFloatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final /* synthetic */ zzke<Float> zza(int i) {
        if (i < this.zzc) {
            throw new IllegalArgumentException();
        }
        return new zzjr(Arrays.copyOf(this.zzb, i), this.zzc, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Float.valueOf(zzb(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzic, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        zzd(i);
        float[] fArr = this.zzb;
        float f = fArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // com.google.android.gms.internal.measurement.zzic, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        zzd(i);
        float[] fArr = this.zzb;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    private final String zzc(int i) {
        return "Index:" + i + ", Size:" + this.zzc;
    }

    zzjr() {
        this(new float[10], 0, true);
    }

    private zzjr(float[] fArr, int i, boolean z) {
        super(z);
        this.zzb = fArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzic, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
        float[] fArr = this.zzb;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zzb, i, fArr2, i + 1, this.zzc - i);
            this.zzb = fArr2;
        }
        this.zzb[i] = fFloatValue;
        this.zzc++;
        this.modCount++;
    }

    public final void zza(float f) {
        zza();
        int i = this.zzc;
        float[] fArr = this.zzb;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        fArr3[i2] = f;
    }

    private final void zzd(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i2, fArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzic, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzic, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        zza();
        zzjy.zza(collection);
        if (!(collection instanceof zzjr)) {
            return super.addAll(collection);
        }
        zzjr zzjrVar = (zzjr) collection;
        int i = zzjrVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.zzb;
        if (i3 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(zzjrVar.zzb, 0, this.zzb, this.zzc, zzjrVar.zzc);
        this.zzc = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzic, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjr)) {
            return super.equals(obj);
        }
        zzjr zzjrVar = (zzjr) obj;
        if (this.zzc != zzjrVar.zzc) {
            return false;
        }
        float[] fArr = zzjrVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (Float.floatToIntBits(this.zzb[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }
}
