package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzop implements Supplier<zzoo> {
    private static zzop zza = new zzop();
    private final Supplier<zzoo> zzb = Suppliers.ofInstance(new zzor());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzoo get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzoo) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzoo) zza.get()).zzb();
    }

    @SideEffectFree
    public static boolean zzc() {
        return ((zzoo) zza.get()).zzc();
    }

    @SideEffectFree
    public static boolean zzd() {
        return ((zzoo) zza.get()).zzd();
    }
}
