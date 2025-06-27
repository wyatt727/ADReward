package com.google.android.gms.internal.ads;

import androidx.constraintlayout.motion.widget.Key;
import com.json.t2;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzbts {
    private final zzcgm zza;
    private final String zzb;

    public zzbts(zzcgm zzcgmVar, String str) {
        this.zza = zzcgmVar;
        this.zzb = str;
    }

    public final void zzg(int i, int i2, int i3, int i4) throws JSONException {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzh(String str) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put(t2.h.h, this.zzb);
            zzcgm zzcgmVar = this.zza;
            if (zzcgmVar != null) {
                zzcgmVar.zze("onError", jSONObjectPut);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzi(String str) throws JSONException {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzj(int i, int i2, int i3, int i4, float f, int i5) throws JSONException {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put(Key.ROTATION, i5));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while obtaining screen information.", e);
        }
    }

    public final void zzk(int i, int i2, int i3, int i4) throws JSONException {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzl(String str) throws JSONException {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching state change.", e);
        }
    }
}
