package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcqs implements zzhiv {
    private final zzhjm zza;

    public zzcqs(zzhjm zzhjmVar) {
        this.zza = zzhjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcum) this.zza).zza().zzA);
        } catch (JSONException unused) {
            return null;
        }
    }
}
