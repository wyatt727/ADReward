package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzpn implements Supplier<zzpm> {
    private static zzpn zza = new zzpn();
    private final Supplier<zzpm> zzb = Suppliers.ofInstance(new zzpp());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzpm get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzpm) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzpm) zza.get()).zzb();
    }

    @SideEffectFree
    public static boolean zzc() {
        return ((zzpm) zza.get()).zzc();
    }
}
