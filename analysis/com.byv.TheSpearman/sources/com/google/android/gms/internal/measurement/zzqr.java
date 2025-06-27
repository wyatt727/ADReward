package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzqr implements Supplier<zzqq> {
    private static zzqr zza = new zzqr();
    private final Supplier<zzqq> zzb = Suppliers.ofInstance(new zzqt());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzqq get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzqq) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzqq) zza.get()).zzb();
    }

    @SideEffectFree
    public static boolean zzc() {
        return ((zzqq) zza.get()).zzc();
    }
}
