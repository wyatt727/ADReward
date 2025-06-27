package com.google.android.gms.internal.ads;

import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.t2;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzhiq {
    final LinkedHashMap zza;

    zzhiq(int i) {
        this.zza = zzhis.zzb(i);
    }

    final zzhiq zza(Object obj, zzhje zzhjeVar) {
        zzhjd.zza(obj, t2.h.W);
        zzhjd.zza(zzhjeVar, IronSourceConstants.EVENTS_PROVIDER);
        this.zza.put(obj, zzhjeVar);
        return this;
    }
}
