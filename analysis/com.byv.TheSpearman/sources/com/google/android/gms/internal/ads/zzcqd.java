package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.json.x6;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcqd implements zzbpj {
    private final Context zza;
    private final zzazu zzb;
    private final PowerManager zzc;

    public zzcqd(Context context, zzazu zzazuVar) {
        this.zza = context;
        this.zzb = zzazuVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcqg zzcqgVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzazx zzazxVar = zzcqgVar.zzf;
        if (zzazxVar == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.zzb.zzd() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzazxVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcqgVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false);
            boolean z2 = zzcqgVar.zzc;
            jSONObjectPut.put("isStopped", false).put("isPaused", zzcqgVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzu.zzr().zze()).put("appVolume", com.google.android.gms.ads.internal.zzu.zzr().zza()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzac.zzb(this.zza.getApplicationContext()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfK)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
                Integer numValueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (numValueOf != null) {
                    jSONObject3.put("audioMode", numValueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzazxVar.zzb).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzazxVar.zzc.top).put("bottom", zzazxVar.zzc.bottom).put("left", zzazxVar.zzc.left).put("right", zzazxVar.zzc.right)).put("adBox", new JSONObject().put("top", zzazxVar.zzd.top).put("bottom", zzazxVar.zzd.bottom).put("left", zzazxVar.zzd.left).put("right", zzazxVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzazxVar.zze.top).put("bottom", zzazxVar.zze.bottom).put("left", zzazxVar.zze.left).put("right", zzazxVar.zze.right)).put("globalVisibleBoxVisible", zzazxVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzazxVar.zzg.top).put("bottom", zzazxVar.zzg.bottom).put("left", zzazxVar.zzg.left).put("right", zzazxVar.zzg.right)).put("localVisibleBoxVisible", zzazxVar.zzh).put("hitBox", new JSONObject().put("top", zzazxVar.zzi.top).put("bottom", zzazxVar.zzi.bottom).put("left", zzazxVar.zzi.left).put("right", zzazxVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put(x6.k, zzcqgVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbp)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzazxVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcqgVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
