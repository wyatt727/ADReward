package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzpz implements Supplier<zzpy> {
    private static zzpz zza = new zzpz();
    private final Supplier<zzpy> zzb = Suppliers.ofInstance(new zzqb());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzpy get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzpy) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzpy) zza.get()).zzb();
    }

    @SideEffectFree
    public static boolean zzc() {
        return ((zzpy) zza.get()).zzc();
    }

    @SideEffectFree
    public static boolean zzd() {
        return ((zzpy) zza.get()).zzd();
    }

    @SideEffectFree
    public static boolean zze() {
        return ((zzpy) zza.get()).zze();
    }

    @SideEffectFree
    public static boolean zzf() {
        return ((zzpy) zza.get()).zzf();
    }

    @SideEffectFree
    public static boolean zzg() {
        return ((zzpy) zza.get()).zzg();
    }

    @SideEffectFree
    public static boolean zzh() {
        return ((zzpy) zza.get()).zzh();
    }

    @SideEffectFree
    public static boolean zzi() {
        return ((zzpy) zza.get()).zzi();
    }
}
