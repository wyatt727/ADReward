package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaao implements zzabx {
    private final Context zza;
    private final zzaaq zzb;

    public zzaao(Context context, zzaaq zzaaqVar, zzcq zzcqVar) throws zzdl {
        this.zza = context;
        this.zzb = zzaaqVar;
        if (zzfx.zza >= 29 && context.getApplicationInfo().targetSdkVersion >= 29 && zzfx.zza == 30 && !zzfvx.zzc(zzfx.zzd, "moto g(20)")) {
            zzfvx.zzc(zzfx.zzd, "rmx3231");
        }
        throw null;
    }
}
