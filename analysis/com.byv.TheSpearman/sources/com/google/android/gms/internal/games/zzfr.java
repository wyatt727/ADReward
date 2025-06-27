package com.google.android.gms.internal.games;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
class zzfr<E> extends zzfu<E> {
    boolean zzmq;
    Object[] zzmp = new Object[4];
    int size = 0;

    zzfr(int i) {
    }

    private final void zzq(int i) {
        Object[] objArr = this.zzmp;
        if (objArr.length < i) {
            int length = objArr.length;
            if (i < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = length + (length >> 1) + 1;
            if (iHighestOneBit < i) {
                iHighestOneBit = Integer.highestOneBit(i - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                iHighestOneBit = Integer.MAX_VALUE;
            }
            this.zzmp = Arrays.copyOf(objArr, iHighestOneBit);
            this.zzmq = false;
            return;
        }
        if (this.zzmq) {
            this.zzmp = (Object[]) objArr.clone();
            this.zzmq = false;
        }
    }

    @Override // com.google.android.gms.internal.games.zzfu
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public zzfr<E> zzc(E e) {
        zzfo.checkNotNull(e);
        zzq(this.size + 1);
        Object[] objArr = this.zzmp;
        int i = this.size;
        this.size = i + 1;
        objArr[i] = e;
        return this;
    }

    @Override // com.google.android.gms.internal.games.zzfu
    public zzfu<E> zza(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzq(this.size + collection.size());
            if (collection instanceof zzfs) {
                this.size = ((zzfs) collection).zza(this.zzmp, this.size);
                return this;
            }
        }
        super.zza(iterable);
        return this;
    }
}
