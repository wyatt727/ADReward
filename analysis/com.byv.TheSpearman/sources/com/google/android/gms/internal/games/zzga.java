package com.google.android.gms.internal.games;

import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzga<T> extends zzgg<T> {
    private boolean zzmx;
    private final /* synthetic */ Object zzmy;

    zzga(Object obj) {
        this.zzmy = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzmx;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.zzmx) {
            throw new NoSuchElementException();
        }
        this.zzmx = true;
        return (T) this.zzmy;
    }
}
