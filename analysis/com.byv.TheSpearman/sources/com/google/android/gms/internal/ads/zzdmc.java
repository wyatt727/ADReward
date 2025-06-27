package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdmc implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdpx zzd;
    private final Clock zze;
    private zzbiy zzf;
    private zzbky zzg;

    public zzdmc(zzdpx zzdpxVar, Clock clock) {
        this.zzd = zzdpxVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap map = new HashMap();
            map.put("id", this.zza);
            map.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.zzd.zzj("sendMessageToNativeJs", map);
        }
        zzd();
    }

    public final zzbiy zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzc(final zzbiy zzbiyVar) {
        this.zzf = zzbiyVar;
        zzbky zzbkyVar = this.zzg;
        if (zzbkyVar != null) {
            this.zzd.zzn("/unconfirmedClick", zzbkyVar);
        }
        zzbky zzbkyVar2 = new zzbky() { // from class: com.google.android.gms.internal.ads.zzdmb
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) {
                zzdmc zzdmcVar = this.zza;
                try {
                    zzdmcVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbiy zzbiyVar2 = zzbiyVar;
                zzdmcVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbiyVar2 == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbiyVar2.zzf(str);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzg = zzbkyVar2;
        this.zzd.zzl("/unconfirmedClick", zzbkyVar2);
    }
}
