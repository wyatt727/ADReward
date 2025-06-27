package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdxq implements com.google.android.gms.ads.internal.overlay.zzp, zzcia {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private zzdxf zzc;
    private zzcgm zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private com.google.android.gms.ads.internal.client.zzda zzh;
    private boolean zzi;

    zzdxq(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = versionInfoParcel;
    }

    private final synchronized boolean zzl(com.google.android.gms.ads.internal.client.zzda zzdaVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziO)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Ad inspector had an internal error.");
            try {
                zzdaVar.zze(zzfhk.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Ad inspector had an internal error.");
            try {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdaVar.zze(zzfhk.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            if (com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() >= this.zzg + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziR)).intValue()) {
                return true;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Ad inspector cannot be opened because it is already open.");
        try {
            zzdaVar.zze(zzfhk.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcia
    public final synchronized void zza(boolean z, int i, String str, String str2) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzk("");
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Ad inspector failed to load.");
        try {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(new Exception("Failed to load UI. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            com.google.android.gms.ads.internal.client.zzda zzdaVar = this.zzh;
            if (zzdaVar != null) {
                zzdaVar.zze(zzfhk.zzd(17, null, null));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdr() {
        this.zzf = true;
        zzk("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdu(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzda zzdaVar = this.zzh;
            if (zzdaVar != null) {
                try {
                    zzdaVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    public final Activity zzg() {
        zzcgm zzcgmVar = this.zzd;
        if (zzcgmVar == null || zzcgmVar.zzaB()) {
            return null;
        }
        return this.zzd.zzi();
    }

    public final void zzh(zzdxf zzdxfVar) {
        this.zzc = zzdxfVar;
    }

    final /* synthetic */ void zzi(String str) throws JSONException {
        JSONObject jSONObjectZze = this.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectZze.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.zzd.zzb("window.inspectorInfo", jSONObjectZze.toString());
    }

    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zzda zzdaVar, zzbls zzblsVar, zzbll zzbllVar, zzbkz zzbkzVar) {
        if (zzl(zzdaVar)) {
            try {
                com.google.android.gms.ads.internal.zzu.zzz();
                zzcgm zzcgmVarZza = zzcgz.zza(this.zza, zzcie.zza(), "", false, false, null, null, this.zzb, null, null, null, zzbcx.zza(), null, null, null, null);
                this.zzd = zzcgmVarZza;
                zzcic zzcicVarZzN = zzcgmVarZza.zzN();
                if (zzcicVarZzN == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        com.google.android.gms.ads.internal.zzu.zzo().zzw(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        zzdaVar.zze(zzfhk.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.zzh = zzdaVar;
                zzcicVarZzN.zzR(null, null, null, null, null, false, null, null, null, null, null, null, null, zzblsVar, null, new zzblr(this.zza), zzbllVar, zzbkzVar, null);
                zzcicVarZzN.zzB(this);
                this.zzd.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziP));
                com.google.android.gms.ads.internal.zzu.zzi();
                com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true);
                this.zzg = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            } catch (zzcgy e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to obtain a web view for the ad inspector", e2);
                try {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e2, "InspectorUi.openInspector 0");
                    zzdaVar.zze(zzfhk.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e3) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e3, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzk(final String str) {
        if (this.zze && this.zzf) {
            zzcbr.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxp
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.zza.zzi(str);
                }
            });
        }
    }
}
