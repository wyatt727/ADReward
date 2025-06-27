package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcys extends zzdee implements zzcyt {
    public zzcys(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdB(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzcyr
            @Override // com.google.android.gms.internal.ads.zzded
            public final void zza(Object obj) {
                ((zzcyt) obj).zzdB(zzeVar);
            }
        });
    }
}
