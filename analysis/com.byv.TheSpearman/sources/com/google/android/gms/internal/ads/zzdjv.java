package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzdjv implements zzdlg {
    private com.google.android.gms.ads.internal.client.zzcs zzC;
    private final Context zza;
    private final zzdlj zzb;
    private final JSONObject zzc;
    private final zzdpx zzd;
    private final zzdky zze;
    private final zzawo zzf;
    private final zzczi zzg;
    private final zzcyo zzh;
    private final zzdgl zzi;
    private final zzffn zzj;
    private final VersionInfoParcel zzk;
    private final zzfgi zzl;
    private final zzcqh zzm;
    private final zzdmc zzn;
    private final Clock zzo;
    private final zzdgh zzp;
    private final zzfmt zzq;
    private final zzdrn zzr;
    private final zzflh zzs;
    private final zzefo zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdjv(Context context, zzdlj zzdljVar, JSONObject jSONObject, zzdpx zzdpxVar, zzdky zzdkyVar, zzawo zzawoVar, zzczi zzcziVar, zzcyo zzcyoVar, zzdgl zzdglVar, zzffn zzffnVar, VersionInfoParcel versionInfoParcel, zzfgi zzfgiVar, zzcqh zzcqhVar, zzdmc zzdmcVar, Clock clock, zzdgh zzdghVar, zzfmt zzfmtVar, zzflh zzflhVar, zzefo zzefoVar, zzdrn zzdrnVar) {
        this.zza = context;
        this.zzb = zzdljVar;
        this.zzc = jSONObject;
        this.zzd = zzdpxVar;
        this.zze = zzdkyVar;
        this.zzf = zzawoVar;
        this.zzg = zzcziVar;
        this.zzh = zzcyoVar;
        this.zzi = zzdglVar;
        this.zzj = zzffnVar;
        this.zzk = versionInfoParcel;
        this.zzl = zzfgiVar;
        this.zzm = zzcqhVar;
        this.zzn = zzdmcVar;
        this.zzo = clock;
        this.zzp = zzdghVar;
        this.zzq = zzfmtVar;
        this.zzs = zzflhVar;
        this.zzt = zzefoVar;
        this.zzr = zzdrnVar;
    }

    private final String zzD(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzds)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzc().zzh(this.zza, view, null);
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Exception getting data.");
            return null;
        }
    }

    private final String zzE(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iZzc = this.zze.zzc();
        if (iZzc == 1) {
            return "1099";
        }
        if (iZzc == 2) {
            return "2099";
        }
        if (iZzc != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzF(String str) {
        JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final boolean zzG() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zzH(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) throws JSONException {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzds)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            com.google.android.gms.ads.internal.zzu.zzp();
            DisplayMetrics displayMetricsZzt = com.google.android.gms.ads.internal.util.zzt.zzt((WindowManager) context.getSystemService("window"));
            zzdjr zzdjrVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            try {
                jSONObject7.put("width", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, displayMetricsZzt.widthPixels));
                jSONObject7.put("height", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, displayMetricsZzt.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziy)).booleanValue()) {
                this.zzd.zzl("/clickRecorded", new zzdjs(this, zzdjrVar));
            } else {
                this.zzd.zzl("/logScionEvent", new zzdjq(this, objArr == true ? 1 : 0));
            }
            this.zzd.zzl("/nativeImpression", new zzdju(this, objArr2 == true ? 1 : 0));
            zzcbu.zza(this.zzd.zzg("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzu) {
                return true;
            }
            this.zzu = com.google.android.gms.ads.internal.zzu.zzs().zzn(this.zza, this.zzk.afmaVersion, this.zzj.zzD.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final boolean zzA() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlj)).booleanValue()) {
            return this.zzl.zzi.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final boolean zzB() {
        return zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final boolean zzC(Bundle bundle) {
        if (zzF("impression_reporting")) {
            return zzH(null, null, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzle)).booleanValue() ? zzD(null) : null, com.google.android.gms.ads.internal.client.zzay.zzb().zzk(bundle, null), false);
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final int zza() {
        if (this.zzl.zzi == null) {
            return 0;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlj)).booleanValue()) {
            return this.zzl.zzi.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbz.zzd(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbz.zzg(context, view);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbz.zzf(view);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbz.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZzd);
            jSONObject.put("ad_view_signal", jSONObjectZzg);
            jSONObject.put("scroll_view_signal", jSONObjectZzf);
            jSONObject.put("lock_screen_signal", jSONObjectZze);
            return jSONObject;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectZze = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzG()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectZze != null) {
                jSONObject.put("nas", jSONObjectZze);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzg() {
        try {
            com.google.android.gms.ads.internal.client.zzcs zzcsVar = this.zzC;
            if (zzcsVar != null) {
                zzcsVar.zze();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzh() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzi() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzk(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbz.zzd(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbz.zzg(context, view2);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbz.zzf(view2);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbz.zze(context, view2);
        String strZzE = zzE(view, map);
        zzn(true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdz)).booleanValue() ? view2 : view, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strZzE, com.google.android.gms.ads.internal.util.zzbz.zzc(strZzE, context, this.zzz, this.zzy), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzl(String str) throws JSONException {
        zzn(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzm(Bundle bundle) throws JSONException {
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Click data is null. No click is reported.");
        } else if (!zzF("click_reporting")) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzn(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzay.zzb().zzk(bundle, null), false, false);
        }
    }

    protected final void zzn(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) throws JSONException {
        String strZze;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z);
            zzbgt zzbgtVar = this.zzl.zzi;
            jSONObject8.put("custom_mute_requested", zzbgtVar != null && zzbgtVar.zzg);
            jSONObject8.put("custom_mute_enabled", (this.zze.zzH().isEmpty() || this.zze.zzk() == null) ? false : true);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzx && zzG()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZze = this.zzf.zzc().zze(this.zza, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception obtaining click signals", e);
                strZze = null;
            }
            jSONObject8.put("click_signals", strZze);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeB)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziC)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziD)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put(CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long jCurrentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", jCurrentTimeMillis - this.zzA);
            jSONObject9.put("time_from_last_touch", jCurrentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.zzj.zzaj) {
                JSONObject jSONObject10 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzp(string, this.zze);
                }
            }
            zzcbu.zza(this.zzd.zzg("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to create click JSON.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzo(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) throws JSONException {
        JSONObject jSONObject;
        boolean z2 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlj)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.zzx) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzG()) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbz.zzd(this.zza, map, map2, view2, scaleType);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbz.zzg(this.zza, view2);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbz.zzf(view2);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbz.zze(this.zza, view2);
        String strZzE = zzE(view, map);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbz.zzc(strZzE, this.zza, this.zzz, this.zzy);
        if (z2) {
            try {
                JSONObject jSONObject2 = this.zzc;
                Point point = this.zzz;
                Point point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
                } catch (Exception e) {
                    e = e;
                    jSONObject = null;
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    if (point != null) {
                        jSONObject3.put("x", point.x);
                        jSONObject3.put("y", point.y);
                    }
                    if (point2 != null) {
                        jSONObject4.put("x", point2.x);
                        jSONObject4.put("y", point2.y);
                    }
                    jSONObject.put("start_point", jSONObject3);
                    jSONObject.put("end_point", jSONObject4);
                    jSONObject.put("duration_ms", i);
                } catch (Exception e2) {
                    e = e2;
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while grabbing custom click gesture signals.", e);
                    jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    zzn(view2, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strZzE, jSONObjectZzc, null, z, true);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzn(view2, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strZzE, jSONObjectZzc, null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzp() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcbu.zza(this.zzd.zzg("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        zzH(com.google.android.gms.ads.internal.util.zzbz.zzg(context, view), com.google.android.gms.ads.internal.util.zzbz.zzd(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbz.zzf(view), com.google.android.gms.ads.internal.util.zzbz.zze(context, view), zzD(view), null, com.google.android.gms.ads.internal.util.zzbz.zzh(context, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzr() throws JSONException {
        zzH(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
        this.zzy = com.google.android.gms.ads.internal.util.zzbz.zza(motionEvent, view2);
        long jCurrentTimeMillis = this.zzo.currentTimeMillis();
        this.zzB = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
            this.zzA = jCurrentTimeMillis;
            this.zzz = this.zzy;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(this.zzy.x, this.zzy.y);
        this.zzf.zzd(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzt(Bundle bundle) {
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!zzF("touch_reporting")) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzu(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdmc zzdmcVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdmcVar);
        view.setClickable(true);
        zzdmcVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzv() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzC = zzcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzx(zzbiy zzbiyVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc(zzbiyVar);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zZzi = com.google.android.gms.ads.internal.util.zzbz.zzi(this.zzk.clientJarVersion);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zZzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zZzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzz(View view, Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        try {
            if (this.zzw) {
                return;
            }
            if (zzcwVar == null) {
                zzdky zzdkyVar = this.zze;
                if (zzdkyVar.zzk() != null) {
                    this.zzw = true;
                    this.zzq.zzc(zzdkyVar.zzk().zzf(), this.zzs);
                    zzg();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzc(zzcwVar.zzf(), this.zzs);
            zzg();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }
}
