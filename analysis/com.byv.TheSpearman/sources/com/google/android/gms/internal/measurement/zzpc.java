package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzpc implements Supplier<zzpf> {
    private static zzpc zza = new zzpc();
    private final Supplier<zzpf> zzb = Suppliers.ofInstance(new zzpe());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzpf get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzpf) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzpf) zza.get()).zzb();
    }

    @SideEffectFree
    public static boolean zzc() {
        return ((zzpf) zza.get()).zzc();
    }
}
