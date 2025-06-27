package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.json.t2;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzerj implements zzewq {
    private final double zza;
    private final boolean zzb;

    public zzerj(double d, boolean z) {
        this.zza = d;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzewq
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleZza = zzfgw.zza(bundle, t2.h.G);
        bundle.putBundle(t2.h.G, bundleZza);
        Bundle bundleZza2 = zzfgw.zza(bundleZza, "battery");
        bundleZza.putBundle("battery", bundleZza2);
        bundleZza2.putBoolean("is_charging", this.zzb);
        bundleZza2.putDouble("battery_level", this.zza);
    }
}
