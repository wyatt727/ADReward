package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzqm implements Supplier<zzqp> {
    private static zzqm zza = new zzqm();
    private final Supplier<zzqp> zzb = Suppliers.ofInstance(new zzqo());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzqp get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzqp) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzqp) zza.get()).zzb();
    }
}
