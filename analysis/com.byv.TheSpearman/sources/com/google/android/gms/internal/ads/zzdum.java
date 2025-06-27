package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdum extends zzdup {
    private final CsiParamDefaults zzg;

    public zzdum(Executor executor, com.google.android.gms.ads.internal.util.client.zzr zzrVar, CsiParamDefaults csiParamDefaults, CsiUrlBuilder csiUrlBuilder, Context context) {
        super(executor, zzrVar, csiUrlBuilder, context);
        this.zzg = csiParamDefaults;
        csiParamDefaults.set(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}
