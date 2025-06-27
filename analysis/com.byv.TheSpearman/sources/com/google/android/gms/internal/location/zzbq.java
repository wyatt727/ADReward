package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes3.dex */
final class zzbq<E> extends zzbo<E> {
    private final zzbs<E> zza;

    zzbq(zzbs<E> zzbsVar, int i) {
        super(zzbsVar.size(), i);
        this.zza = zzbsVar;
    }

    @Override // com.google.android.gms.internal.location.zzbo
    protected final E zza(int i) {
        return this.zza.get(i);
    }
}
