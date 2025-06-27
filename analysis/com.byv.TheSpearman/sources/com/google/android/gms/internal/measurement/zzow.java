package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzow implements Supplier<zzoz> {
    private static zzow zza = new zzow();
    private final Supplier<zzoz> zzb = Suppliers.ofInstance(new zzoy());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzoz get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzoz) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzoz) zza.get()).zzb();
    }

    @SideEffectFree
    public static boolean zzc() {
        return ((zzoz) zza.get()).zzc();
    }

    @SideEffectFree
    public static boolean zzd() {
        return ((zzoz) zza.get()).zzd();
    }
}
