package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfny implements zzfnr {
    private static zzfny zza;
    private float zzb = 0.0f;
    private final zzfnn zzc;
    private final zzfnl zzd;
    private zzfnm zze;
    private zzfnq zzf;

    public zzfny(zzfnn zzfnnVar, zzfnl zzfnlVar) {
        this.zzc = zzfnnVar;
        this.zzd = zzfnlVar;
    }

    public static zzfny zzb() {
        if (zza == null) {
            zza = new zzfny(new zzfnn(), new zzfnl());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfnr
    public final void zzc(boolean z) {
        if (z) {
            zzfoz.zzd().zzi();
        } else {
            zzfoz.zzd().zzh();
        }
    }

    public final void zzd(Context context) {
        this.zze = new zzfnm(new Handler(), context, new zzfnk(), this);
    }

    public final void zze(float f) {
        this.zzb = f;
        if (this.zzf == null) {
            this.zzf = zzfnq.zza();
        }
        Iterator it = this.zzf.zzb().iterator();
        while (it.hasNext()) {
            ((zzfnc) it.next()).zzg().zzl(f);
        }
    }

    public final void zzf() {
        zzfnp.zza().zze(this);
        zzfnp.zza().zzf();
        zzfoz.zzd().zzi();
        this.zze.zza();
    }

    public final void zzg() {
        zzfoz.zzd().zzj();
        zzfnp.zza().zzg();
        this.zze.zzb();
    }
}
