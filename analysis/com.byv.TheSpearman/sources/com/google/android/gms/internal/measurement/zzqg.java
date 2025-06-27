package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzqg implements Supplier<zzqj> {
    private static zzqg zza = new zzqg();
    private final Supplier<zzqj> zzb = Suppliers.ofInstance(new zzqi());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzqj get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzqj) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzqj) zza.get()).zzb();
    }
}
