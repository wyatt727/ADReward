package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfsp implements Closeable {
    public static zzftb zza() {
        return new zzftb();
    }

    public static zzftb zzb(final int i, zzfta zzftaVar) {
        return new zzftb(new zzfxh() { // from class: com.google.android.gms.internal.ads.zzfsn
            @Override // com.google.android.gms.internal.ads.zzfxh
            public final Object zza() {
                return Integer.valueOf(i);
            }
        }, new zzfxh() { // from class: com.google.android.gms.internal.ads.zzfso
            @Override // com.google.android.gms.internal.ads.zzfxh
            public final Object zza() {
                return zzfsp.zze();
            }
        }, zzftaVar);
    }

    public static zzftb zzc(zzfxh<Integer> zzfxhVar, zzfxh<Integer> zzfxhVar2, zzfta zzftaVar) {
        return new zzftb(zzfxhVar, zzfxhVar2, zzftaVar);
    }

    static /* synthetic */ Integer zze() {
        return -1;
    }
}
