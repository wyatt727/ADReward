package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzczc extends zzdee implements zzcyu {
    public zzczc(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzczb
            @Override // com.google.android.gms.internal.ads.zzded
            public final void zza(Object obj) {
                ((zzczg) obj).zzq(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzb() {
        zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzcza
            @Override // com.google.android.gms.internal.ads.zzded
            public final void zza(Object obj) {
                ((zzczg) obj).zzq(zzfhk.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzc(final zzdit zzditVar) {
        zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzcyz
            @Override // com.google.android.gms.internal.ads.zzded
            public final void zza(Object obj) {
                ((zzczg) obj).zzq(zzfhk.zzd(12, zzditVar.getMessage(), null));
            }
        });
    }
}
