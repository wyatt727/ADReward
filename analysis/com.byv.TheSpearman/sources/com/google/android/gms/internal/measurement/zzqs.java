package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzqs implements Supplier<zzqv> {
    private static zzqs zza = new zzqs();
    private final Supplier<zzqv> zzb = Suppliers.ofInstance(new zzqu());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzqv get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzqv) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzqv) zza.get()).zzb();
    }

    @SideEffectFree
    public static boolean zzc() {
        return ((zzqv) zza.get()).zzc();
    }
}
