package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzayi implements Callable {
    private final zzaxp zza;
    private final zzata zzb;

    public zzayi(zzaxp zzaxpVar, zzata zzataVar) {
        this.zza = zzaxpVar;
        this.zzb = zzataVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzaud zzaudVarZzc = this.zza.zzc();
        if (zzaudVarZzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                this.zzb.zzaY(zzaudVarZzc.zzaV(), zzgzf.zza());
            }
            return null;
        } catch (zzhak | NullPointerException unused) {
            return null;
        }
    }
}
