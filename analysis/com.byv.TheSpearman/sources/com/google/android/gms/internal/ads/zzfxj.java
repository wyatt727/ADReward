package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfxj implements zzfxh {
    private static final zzfxh zza = new zzfxh() { // from class: com.google.android.gms.internal.ads.zzfxi
        @Override // com.google.android.gms.internal.ads.zzfxh
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzfxh zzb;

    @CheckForNull
    private Object zzc;

    zzfxj(zzfxh zzfxhVar) {
        this.zzb = zzfxhVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final Object zza() {
        zzfxh zzfxhVar = this.zzb;
        zzfxh zzfxhVar2 = zza;
        if (zzfxhVar != zzfxhVar2) {
            synchronized (this) {
                if (this.zzb != zzfxhVar2) {
                    Object objZza = this.zzb.zza();
                    this.zzc = objZza;
                    this.zzb = zzfxhVar2;
                    return objZza;
                }
            }
        }
        return this.zzc;
    }
}
