package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfmy {
    public abstract void zzb(View view, zzfnf zzfnfVar, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();

    public static zzfmy zza(zzfmz zzfmzVar, zzfna zzfnaVar) {
        if (zzfmw.zzb()) {
            return new zzfnc(zzfmzVar, zzfnaVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
