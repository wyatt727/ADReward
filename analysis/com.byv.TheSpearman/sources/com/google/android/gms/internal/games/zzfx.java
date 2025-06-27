package com.google.android.gms.internal.games;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzfx<E> extends zzfr<E> {

    @NullableDecl
    private Object[] zzmv;

    public zzfx() {
        super(4);
    }

    public final zzfy<E> zzct() {
        int i = this.size;
        if (i == 0) {
            return zzgb.zzmz;
        }
        if (i == 1) {
            return zzfy.zze(this.zzmp[0]);
        }
        zzfy<E> zzfyVarZza = zzfy.zza(this.size, this.zzmp);
        this.size = zzfyVarZza.size();
        this.zzmq = true;
        this.zzmv = null;
        return zzfyVarZza;
    }

    @Override // com.google.android.gms.internal.games.zzfr, com.google.android.gms.internal.games.zzfu
    public final /* synthetic */ zzfu zza(Iterable iterable) {
        zzfo.checkNotNull(iterable);
        super.zza(iterable);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.games.zzfr
    /* renamed from: zzb */
    public final /* synthetic */ zzfr zzc(Object obj) {
        return (zzfx) zzc(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.games.zzfr, com.google.android.gms.internal.games.zzfu
    public final /* synthetic */ zzfu zzc(Object obj) {
        zzfo.checkNotNull(obj);
        this.zzmv = null;
        super.zzc(obj);
        return this;
    }
}
