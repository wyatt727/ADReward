package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzpt implements Supplier<zzps> {
    private static zzpt zza = new zzpt();
    private final Supplier<zzps> zzb = Suppliers.ofInstance(new zzpv());

    @SideEffectFree
    public static double zza() {
        return ((zzps) zza.get()).zza();
    }

    @SideEffectFree
    public static long zzb() {
        return ((zzps) zza.get()).zzb();
    }

    @SideEffectFree
    public static long zzc() {
        return ((zzps) zza.get()).zzc();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzps get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static String zzd() {
        return ((zzps) zza.get()).zzd();
    }

    @SideEffectFree
    public static boolean zze() {
        return ((zzps) zza.get()).zze();
    }
}
