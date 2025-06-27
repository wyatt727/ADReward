package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzezc implements zzewr {
    private final JSONObject zza;

    zzezc(Context context) {
        this.zza = zzbwz.zzc(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlC)).booleanValue() ? zzgee.zzh(new zzewq() { // from class: com.google.android.gms.internal.ads.zzeza
            @Override // com.google.android.gms.internal.ads.zzewq
            public final void zzj(Object obj) {
            }
        }) : zzgee.zzh(new zzewq() { // from class: com.google.android.gms.internal.ads.zzezb
            @Override // com.google.android.gms.internal.ads.zzewq
            public final void zzj(Object obj) throws JSONException {
                this.zza.zzc((JSONObject) obj);
            }
        });
    }

    final /* synthetic */ void zzc(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
