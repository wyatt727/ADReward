package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.json.t2;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeuf implements zzewq {
    public final Bundle zza;

    public zzeuf(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzewq
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleZza = zzfgw.zza(bundle, t2.h.G);
        bundleZza.putBundle("android_mem_info", this.zza);
        bundle.putBundle(t2.h.G, bundleZza);
    }
}
