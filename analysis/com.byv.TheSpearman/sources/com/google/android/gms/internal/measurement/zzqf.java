package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzqf implements Supplier<zzqe> {
    private static zzqf zza = new zzqf();
    private final Supplier<zzqe> zzb = Suppliers.ofInstance(new zzqh());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzqe get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzqe) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzqe) zza.get()).zzb();
    }
}
