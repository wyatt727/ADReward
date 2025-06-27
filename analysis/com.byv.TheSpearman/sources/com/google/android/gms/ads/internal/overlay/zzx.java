package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzcgm;
import com.google.android.gms.internal.ads.zzfuo;
import com.google.android.gms.internal.ads.zzfup;
import com.google.android.gms.internal.ads.zzfuq;
import com.google.android.gms.internal.ads.zzfur;
import com.google.android.gms.internal.ads.zzfva;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvd;
import com.google.android.gms.internal.ads.zzfve;
import com.google.android.gms.internal.ads.zzfvf;
import com.google.android.gms.internal.ads.zzfvu;
import com.json.t2;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzx {
    private zzfvd zzf;
    private zzcgm zzc = null;
    private boolean zze = false;
    private String zza = null;
    private zzfuq zzd = null;
    private String zzb = null;

    private final zzfvf zzl() {
        zzfve zzfveVarZzc = zzfvf.zzc();
        if (!((Boolean) zzba.zzc().zza(zzbdz.zzlg)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzfveVarZzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfveVarZzc.zza(this.zzb);
        }
        return zzfveVarZzc.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzw(this);
        }
    }

    public final synchronized void zza(zzcgm zzcgmVar, Context context) {
        this.zzc = zzcgmVar;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put(t2.h.h, "fetch_completed");
        zze("on_play_store_bind", map);
    }

    public final void zzb() {
        zzfuq zzfuqVar;
        if (!this.zze || (zzfuqVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfuqVar.zza(zzl(), this.zzf);
            zzd("onLMDOverlayCollapse");
        }
    }

    public final void zzc() {
        zzfuq zzfuqVar;
        if (!this.zze || (zzfuqVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfuo zzfuoVarZzc = zzfup.zzc();
        if (!((Boolean) zzba.zzc().zza(zzbdz.zzlg)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzfuoVarZzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfuoVarZzc.zza(this.zzb);
        }
        zzfuqVar.zzb(zzfuoVarZzc.zzc(), this.zzf);
    }

    final void zzd(String str) {
        zze(str, new HashMap());
    }

    final void zze(final String str, final Map map) {
        zzcbr.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(str, map);
            }
        });
    }

    final void zzf(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put(t2.h.h, str2);
            zze("onError", map);
        }
    }

    public final void zzg() {
        zzfuq zzfuqVar;
        if (!this.zze || (zzfuqVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfuqVar.zzc(zzl(), this.zzf);
            zzd("onLMDOverlayExpand");
        }
    }

    final /* synthetic */ void zzh(String str, Map map) {
        zzcgm zzcgmVar = this.zzc;
        if (zzcgmVar != null) {
            zzcgmVar.zzd(str, map);
        }
    }

    final void zzi(zzfvc zzfvcVar) {
        if (!TextUtils.isEmpty(zzfvcVar.zzb())) {
            if (!((Boolean) zzba.zzc().zza(zzbdz.zzlg)).booleanValue()) {
                this.zza = zzfvcVar.zzb();
            }
        }
        switch (zzfvcVar.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                break;
            case 8153:
                zzd("onLMDOverlayClicked");
                break;
            case 8155:
                zzd("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(zzfvcVar.zza()));
                zze("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    public final void zzj(zzcgm zzcgmVar, zzfva zzfvaVar) {
        if (zzcgmVar == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcgmVar;
        if (!this.zze && !zzk(zzcgmVar.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().zza(zzbdz.zzlg)).booleanValue()) {
            this.zzb = zzfvaVar.zzh();
        }
        zzm();
        zzfuq zzfuqVar = this.zzd;
        if (zzfuqVar != null) {
            zzfuqVar.zzd(zzfvaVar, this.zzf);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzfvu.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzfur.zza(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
