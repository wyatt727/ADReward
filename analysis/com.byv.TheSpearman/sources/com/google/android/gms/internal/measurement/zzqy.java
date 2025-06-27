package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzqy implements Supplier<zzrb> {
    private static zzqy zza = new zzqy();
    private final Supplier<zzrb> zzb = Suppliers.ofInstance(new zzra());

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzrb get() {
        return this.zzb.get();
    }

    @SideEffectFree
    public static boolean zza() {
        return ((zzrb) zza.get()).zza();
    }
}
