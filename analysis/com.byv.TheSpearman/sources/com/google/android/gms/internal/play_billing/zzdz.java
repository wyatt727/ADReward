package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
final class zzdz extends zzbn implements RandomAccess, zzdk, zzer {
    private static final zzdz zza = new zzdz(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    zzdz() {
        this(new long[10], 0, true);
    }

    private final String zzg(int i) {
        return "Index:" + i + ", Size:" + this.zzc;
    }

    private final void zzh(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzbn, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
        int i3 = i + 1;
        long[] jArr = this.zzb;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzb, i, jArr2, i3, this.zzc - i);
            this.zzb = jArr2;
        }
        this.zzb[i] = jLongValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzdl.zzd;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzdz)) {
            return super.addAll(collection);
        }
        zzdz zzdzVar = (zzdz) collection;
        int i = zzdzVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zzb;
        if (i3 > jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(zzdzVar.zzb, 0, this.zzb, this.zzc, zzdzVar.zzc);
        this.zzc = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdz)) {
            return super.equals(obj);
        }
        zzdz zzdzVar = (zzdz) obj;
        if (this.zzc != zzdzVar.zzc) {
            return false;
        }
        long[] jArr = zzdzVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzh(i);
        return Long.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            long j = this.zzb[i2];
            byte[] bArr = zzdl.zzd;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzb[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzh(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i2, jArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        zzh(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final /* bridge */ /* synthetic */ zzdk zzd(int i) {
        if (i >= this.zzc) {
            return new zzdz(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i) {
        zzh(i);
        return this.zzb[i];
    }

    public final void zzf(long j) {
        zza();
        int i = this.zzc;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        jArr3[i2] = j;
    }

    private zzdz(long[] jArr, int i, boolean z) {
        super(z);
        this.zzb = jArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
