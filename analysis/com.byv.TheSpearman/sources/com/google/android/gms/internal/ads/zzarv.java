package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzarv implements zzarl {
    final /* synthetic */ Context zza;
    private File zzb = null;

    zzarv(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzarl
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
