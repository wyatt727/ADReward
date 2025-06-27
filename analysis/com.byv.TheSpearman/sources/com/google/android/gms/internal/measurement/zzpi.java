package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzpi implements Supplier<zzpl> {
    private static zzpi zza = new zzpi();
    private final Supplier<zzpl> zzb = Suppliers.ofInstance(new zzpk());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzpl get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzpl) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzpl) zza.get()).zzb();
    }
}
