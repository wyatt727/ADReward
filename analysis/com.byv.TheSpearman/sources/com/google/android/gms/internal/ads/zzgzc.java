package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgzc extends zzgxt implements RandomAccess, zzgzy, zzhbu {
    private static final zzgzc zza = new zzgzc(new double[0], 0, false);
    private double[] zzb;
    private int zzc;

    zzgzc() {
        this(new double[10], 0, true);
    }

    public static zzgzc zzd() {
        return zza;
    }

    private final String zzh(int i) {
        return "Index:" + i + ", Size:" + this.zzc;
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        zzdJ();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
        int i3 = i + 1;
        double[] dArr = this.zzb;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.zzb, i, dArr2, i3, this.zzc - i);
            this.zzb = dArr2;
        }
        this.zzb[i] = dDoubleValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdJ();
        byte[] bArr = zzhai.zzd;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzgzc)) {
            return super.addAll(collection);
        }
        zzgzc zzgzcVar = (zzgzc) collection;
        int i = zzgzcVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.zzb;
        if (i3 > dArr.length) {
            this.zzb = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(zzgzcVar.zzb, 0, this.zzb, this.zzc, zzgzcVar.zzc);
        this.zzc = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgzc)) {
            return super.equals(obj);
        }
        zzgzc zzgzcVar = (zzgzc) obj;
        if (this.zzc != zzgzcVar.zzc) {
            return false;
        }
        double[] dArr = zzgzcVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (Double.doubleToLongBits(this.zzb[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzi(i);
        return Double.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zzb[i2]);
            byte[] bArr = zzhai.zzd;
            i = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzb[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzdJ();
        zzi(i);
        double[] dArr = this.zzb;
        double d = dArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzdJ();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i2, dArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zzdJ();
        zzi(i);
        double[] dArr = this.zzb;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzgzy zzf(int i) {
        if (i >= this.zzc) {
            return new zzgzc(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzg(double d) {
        zzdJ();
        int i = this.zzc;
        double[] dArr = this.zzb;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        dArr3[i2] = d;
    }

    private zzgzc(double[] dArr, int i, boolean z) {
        super(z);
        this.zzb = dArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Double) obj).doubleValue());
        return true;
    }
}
