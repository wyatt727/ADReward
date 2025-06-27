package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzddk extends zzdee implements zzbjq {
    public zzddk(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final synchronized void zzb(final String str, final String str2) {
        zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzddj
            @Override // com.google.android.gms.internal.ads.zzded
            public final void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
