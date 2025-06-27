package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.json.t2;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzblo implements zzbky {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get(t2.f.e);
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            zzbln zzblnVar = (zzbln) this.zzb.remove(str);
            if (zzblnVar == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                zzblnVar.zza(str3 + strConcat);
                return;
            }
            if (str5 == null) {
                zzblnVar.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                }
                zzblnVar.zzb(jSONObject);
            } catch (JSONException e) {
                zzblnVar.zza(e.getMessage());
            }
        }
    }

    public final ListenableFuture zzb(zzbog zzbogVar, String str, JSONObject jSONObject) throws JSONException {
        zzcbw zzcbwVar = new zzcbw();
        com.google.android.gms.ads.internal.zzu.zzp();
        String string = UUID.randomUUID().toString();
        zzc(string, new zzblm(this, zzcbwVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzbogVar.zzl(str, jSONObject2);
        } catch (Exception e) {
            zzcbwVar.zzd(e);
        }
        return zzcbwVar;
    }

    public final void zzc(String str, zzbln zzblnVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzblnVar);
        }
    }
}
