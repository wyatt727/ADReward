package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcdc {
    private final Context zza;
    private final zzcdn zzb;
    private final ViewGroup zzc;
    private zzcdb zzd;

    public zzcdc(Context context, ViewGroup viewGroup, zzcgm zzcgmVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcgmVar;
        this.zzd = null;
    }

    public final zzcdb zza() {
        return this.zzd;
    }

    public final Integer zzb() {
        zzcdb zzcdbVar = this.zzd;
        if (zzcdbVar != null) {
            return zzcdbVar.zzl();
        }
        return null;
    }

    public final void zzc(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcdb zzcdbVar = this.zzd;
        if (zzcdbVar != null) {
            zzcdbVar.zzF(i, i2, i3, i4);
        }
    }

    public final void zzd(int i, int i2, int i3, int i4, int i5, boolean z, zzcdm zzcdmVar) {
        if (this.zzd != null) {
            return;
        }
        zzbeg.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzcdn zzcdnVar = this.zzb;
        zzcdb zzcdbVar = new zzcdb(context, zzcdnVar, i5, z, zzcdnVar.zzm().zza(), zzcdmVar);
        this.zzd = zzcdbVar;
        this.zzc.addView(zzcdbVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i, i2, i3, i4);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcdb zzcdbVar = this.zzd;
        if (zzcdbVar != null) {
            zzcdbVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcdb zzcdbVar = this.zzd;
        if (zzcdbVar != null) {
            zzcdbVar.zzu();
        }
    }

    public final void zzg(int i) {
        zzcdb zzcdbVar = this.zzd;
        if (zzcdbVar != null) {
            zzcdbVar.zzC(i);
        }
    }
}
