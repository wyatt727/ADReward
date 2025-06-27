package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdoy extends zzbnk implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbgq {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzdkt zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdoy(zzdkt zzdktVar, zzdky zzdkyVar) {
        this.zza = zzdkyVar.zzf();
        this.zzb = zzdkyVar.zzj();
        this.zzc = zzdktVar;
        if (zzdkyVar.zzs() != null) {
            zzdkyVar.zzs().zzan(this);
        }
    }

    private final void zzg() {
        View view;
        zzdkt zzdktVar = this.zzc;
        if (zzdktVar == null || (view = this.zza) == null) {
            return;
        }
        zzdktVar.zzA(view, Collections.emptyMap(), Collections.emptyMap(), zzdkt.zzW(this.zza));
    }

    private final void zzh() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private static final void zzi(zzbno zzbnoVar, int i) {
        try {
            zzbnoVar.zze(i);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final com.google.android.gms.ads.internal.client.zzdq zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final zzbhb zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdkt zzdktVar = this.zzc;
        if (zzdktVar == null || zzdktVar.zzc() == null) {
            return null;
        }
        return zzdktVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdkt zzdktVar = this.zzc;
        if (zzdktVar != null) {
            zzdktVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdox(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzf(IObjectWrapper iObjectWrapper, zzbno zzbnoVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbnoVar, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            zzi(zzbnoVar, 0);
            return;
        }
        if (this.zze) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Instream ad should not be used again.");
            zzi(zzbnoVar, 1);
            return;
        }
        this.zze = true;
        zzh();
        ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
        com.google.android.gms.ads.internal.zzu.zzx();
        zzcce.zza(this.zza, this);
        com.google.android.gms.ads.internal.zzu.zzx();
        zzcce.zzb(this.zza, this);
        zzg();
        try {
            zzbnoVar.zzf();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }
}
