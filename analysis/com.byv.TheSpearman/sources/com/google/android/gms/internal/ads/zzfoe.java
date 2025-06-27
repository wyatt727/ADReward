package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.json.i5;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzfoe {
    private final String zza;
    private zzfph zzb;
    private long zzc;
    private int zzd;

    public zzfoe(String str) {
        zzb();
        this.zza = str;
        this.zzb = new zzfph(null);
    }

    public final WebView zza() {
        return (WebView) this.zzb.get();
    }

    public final void zzb() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }

    public void zzc() {
        this.zzb.clear();
    }

    public final void zzd(String str, long j) {
        if (j < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        zzfnx.zza().zzg(zza(), this.zza, str);
    }

    public final void zze() {
        zzfnx.zza().zzc(zza(), this.zza);
    }

    public final void zzf(zzfmz zzfmzVar) {
        zzfnx.zza().zzd(zza(), this.zza, zzfmzVar.zzb());
    }

    public final void zzg(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfok.zze(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfnx.zza().zzf(zza(), jSONObject);
    }

    public final void zzh(String str, long j) {
        if (j >= this.zzc) {
            this.zzd = 2;
            zzfnx.zza().zzg(zza(), this.zza, str);
        }
    }

    public void zzi(zzfnc zzfncVar, zzfna zzfnaVar) {
        zzj(zzfncVar, zzfnaVar, null);
    }

    protected final void zzj(zzfnc zzfncVar, zzfna zzfnaVar, JSONObject jSONObject) throws JSONException {
        String strZzh = zzfncVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfok.zze(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        zzfok.zze(jSONObject2, "adSessionType", zzfnaVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        zzfok.zze(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzfok.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfok.zze(jSONObject3, i5.x, t2.e);
        zzfok.zze(jSONObject2, "deviceInfo", jSONObject3);
        zzfok.zze(jSONObject2, "deviceCategory", zzfoj.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfok.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfok.zze(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, zzfnaVar.zze().zzb());
        zzfok.zze(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, zzfnaVar.zze().zzc());
        zzfok.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfok.zze(jSONObject5, "libraryVersion", "1.4.10-google_20240110");
        zzfok.zze(jSONObject5, RemoteConfigConstants.RequestFieldKey.APP_ID, zzfnv.zzb().zza().getApplicationContext().getPackageName());
        zzfok.zze(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject5);
        if (zzfnaVar.zzf() != null) {
            zzfok.zze(jSONObject2, "contentUrl", zzfnaVar.zzf());
        }
        zzfok.zze(jSONObject2, "customReferenceData", zzfnaVar.zzg());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfnaVar.zzh().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzfnx.zza().zzi(zza(), strZzh, jSONObject2, jSONObject6, jSONObject);
    }

    public final void zzk(boolean z) {
        if (this.zzb.get() != null) {
            zzfnx.zza().zzh(zza(), this.zza, true != z ? "backgrounded" : "foregrounded");
        }
    }

    public final void zzl(float f) {
        zzfnx.zza().zze(zza(), this.zza, f);
    }

    final void zzm(WebView webView) {
        this.zzb = new zzfph(webView);
    }

    public void zzn() {
    }
}
