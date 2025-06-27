package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzod implements Supplier<zzoc> {
    private static zzod zza = new zzod();
    private final Supplier<zzoc> zzb = Suppliers.ofInstance(new zzof());

    @SideEffectFree
    public static long zza() {
        return ((zzoc) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzoc get() {
        return this.zzb.get();
    }
}
