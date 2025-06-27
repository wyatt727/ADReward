package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdhc extends zzdee {
    zzdhc(Set set) {
        super(set);
    }

    public final synchronized void zza(final com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar) {
        zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzdha
            @Override // com.google.android.gms.internal.ads.zzded
            public final void zza(Object obj) {
                ((zzdgz) obj).zzd(zzapVar);
            }
        });
    }

    public final synchronized void zzb(final String str) {
        zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzdhb
            @Override // com.google.android.gms.internal.ads.zzded
            public final void zza(Object obj) {
                ((zzdgz) obj).zze(str);
            }
        });
    }
}
