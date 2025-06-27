package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzfw<E> extends zzfq<E> {
    private final zzft<E> zzmu;

    zzfw(zzft<E> zzftVar, int i) {
        super(zzftVar.size(), i);
        this.zzmu = zzftVar;
    }

    @Override // com.google.android.gms.internal.games.zzfq
    protected final E get(int i) {
        return this.zzmu.get(i);
    }
}
