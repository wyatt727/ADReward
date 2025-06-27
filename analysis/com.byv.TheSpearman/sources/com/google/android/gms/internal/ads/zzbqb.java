package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbqb implements zzbln {
    final /* synthetic */ zzbqc zza;
    private final zzcbw zzb;

    public zzbqb(zzbqc zzbqcVar, zzcbw zzcbwVar) {
        this.zza = zzbqcVar;
        this.zzb = zzcbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzb.zzd(new zzbpf());
            } else {
                this.zzb.zzd(new zzbpf(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzb.zzd(e);
        }
    }
}
