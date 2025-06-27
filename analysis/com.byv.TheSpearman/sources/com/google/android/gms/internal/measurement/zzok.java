package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzok implements Supplier<zzon> {
    private static zzok zza = new zzok();
    private final Supplier<zzon> zzb = Suppliers.ofInstance(new zzom());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzon get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzon) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzon) zza.get()).zzb();
    }
}
