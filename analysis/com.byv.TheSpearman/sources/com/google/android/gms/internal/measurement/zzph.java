package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzph implements Supplier<zzpg> {
    private static zzph zza = new zzph();
    private final Supplier<zzpg> zzb = Suppliers.ofInstance(new zzpj());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzpg get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzpg) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzpg) zza.get()).zzb();
    }
}
