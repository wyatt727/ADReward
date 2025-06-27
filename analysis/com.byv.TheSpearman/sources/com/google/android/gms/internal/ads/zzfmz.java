package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfmz {
    private final zzfnh zza;
    private final zzfnh zzb;
    private final zzfnd zzc;
    private final zzfng zzd;

    private zzfmz(zzfnd zzfndVar, zzfng zzfngVar, zzfnh zzfnhVar, zzfnh zzfnhVar2, boolean z) {
        this.zzc = zzfndVar;
        this.zzd = zzfngVar;
        this.zza = zzfnhVar;
        if (zzfnhVar2 == null) {
            this.zzb = zzfnh.NONE;
        } else {
            this.zzb = zzfnhVar2;
        }
    }

    public static zzfmz zza(zzfnd zzfndVar, zzfng zzfngVar, zzfnh zzfnhVar, zzfnh zzfnhVar2, boolean z) {
        zzfop.zzb(zzfngVar, "ImpressionType is null");
        zzfop.zzb(zzfnhVar, "Impression owner is null");
        if (zzfnhVar == zzfnh.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzfndVar == zzfnd.DEFINED_BY_JAVASCRIPT && zzfnhVar == zzfnh.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfngVar == zzfng.DEFINED_BY_JAVASCRIPT && zzfnhVar == zzfnh.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzfmz(zzfndVar, zzfngVar, zzfnhVar, zzfnhVar2, true);
    }

    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        zzfok.zze(jSONObject, "impressionOwner", this.zza);
        zzfok.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzfok.zze(jSONObject, "creativeType", this.zzc);
        zzfok.zze(jSONObject, "impressionType", this.zzd);
        zzfok.zze(jSONObject, "isolateVerificationScripts", true);
        return jSONObject;
    }
}
