package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdgr {
    private final List zza;
    private final zzfmt zzb;
    private boolean zzc;

    public zzdgr(zzffn zzffnVar, zzfmt zzfmtVar) {
        this.zza = zzffnVar.zzq;
        this.zzb = zzfmtVar;
    }

    public final void zza() {
        if (this.zzc) {
            return;
        }
        this.zzb.zzd(this.zza);
        this.zzc = true;
    }
}
