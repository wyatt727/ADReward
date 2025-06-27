package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzoj implements Supplier<zzoi> {
    private static zzoj zza = new zzoj();
    private final Supplier<zzoi> zzb = Suppliers.ofInstance(new zzol());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzoi get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzoi) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzoi) zza.get()).zzb();
    }
}
