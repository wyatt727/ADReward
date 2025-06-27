package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdhi extends zzdee {
    private boolean zzb;

    protected zzdhi(Set set) {
        super(set);
    }

    public final void zza() {
        zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzdhf
            @Override // com.google.android.gms.internal.ads.zzded
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzdhe
            @Override // com.google.android.gms.internal.ads.zzded
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzq(zzdhg.zza);
            this.zzb = true;
        }
        zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzdhh
            @Override // com.google.android.gms.internal.ads.zzded
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
            }
        });
    }

    public final synchronized void zzd() {
        zzq(zzdhg.zza);
        this.zzb = true;
    }
}
