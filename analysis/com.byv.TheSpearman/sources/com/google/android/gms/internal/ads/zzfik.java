package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfik {
    private final HashMap zza = new HashMap();

    public final zzfij zza(zzfia zzfiaVar, Context context, zzfhs zzfhsVar, zzfiq zzfiqVar) {
        zzfij zzfijVar = (zzfij) this.zza.get(zzfiaVar);
        if (zzfijVar != null) {
            return zzfijVar;
        }
        zzfhx zzfhxVar = new zzfhx(zzfid.zza(zzfiaVar, context));
        zzfij zzfijVar2 = new zzfij(zzfhxVar, new zzfis(zzfhxVar, zzfhsVar, zzfiqVar));
        this.zza.put(zzfiaVar, zzfijVar2);
        return zzfijVar2;
    }
}
