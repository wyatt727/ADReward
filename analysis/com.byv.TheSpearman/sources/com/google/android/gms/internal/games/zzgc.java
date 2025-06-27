package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzgc<E> extends zzft<E> {
    static final zzft<Object> zznd = new zzgc(new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzne;

    zzgc(Object[] objArr, int i) {
        this.zzne = objArr;
        this.size = i;
    }

    @Override // com.google.android.gms.internal.games.zzfs
    final int zzcp() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.games.zzfs
    final Object[] zzco() {
        return this.zzne;
    }

    @Override // com.google.android.gms.internal.games.zzfs
    final int zzcq() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.games.zzft, com.google.android.gms.internal.games.zzfs
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzne, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzfo.zza(i, this.size);
        return (E) this.zzne[i];
    }
}
