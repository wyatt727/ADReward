package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaaj {
    private final Context zza;
    private zzdm zzb;
    private zzcp zzc;
    private boolean zzd;

    public zzaaj(Context context) {
        this.zza = context.getApplicationContext();
    }

    public final zzaaq zzc() {
        zzek.zzf(!this.zzd);
        zzaap zzaapVar = null;
        if (this.zzc == null) {
            if (this.zzb == null) {
                this.zzb = new zzaam(null);
            }
            this.zzc = new zzaan(this.zzb);
        }
        zzaaq zzaaqVar = new zzaaq(this, zzaapVar);
        this.zzd = true;
        return zzaaqVar;
    }
}
