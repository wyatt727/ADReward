package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzpo implements Supplier<zzpr> {
    private static zzpo zza = new zzpo();
    private final Supplier<zzpr> zzb = Suppliers.ofInstance(new zzpq());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzpr get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzpr) zza.get()).zza();
    }
}
