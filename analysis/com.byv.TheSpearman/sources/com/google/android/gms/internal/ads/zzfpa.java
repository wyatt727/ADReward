package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfpa extends zzfpb {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfpa(zzfot zzfotVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfotVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
