package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfqa {
    private final Context zza;
    private final Looper zzb;

    public zzfqa(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfqq zzfqqVarZza = zzfqu.zza();
        zzfqqVarZza.zza(this.zza.getPackageName());
        zzfqqVarZza.zzc(zzfqt.BLOCKED_IMPRESSION);
        zzfqn zzfqnVarZza = zzfqo.zza();
        zzfqnVarZza.zzb(str);
        zzfqnVarZza.zza(zzfqm.BLOCKED_REASON_BACKGROUND);
        zzfqqVarZza.zzb(zzfqnVarZza);
        new zzfqb(this.zza, this.zzb, (zzfqu) zzfqqVarZza.zzbr()).zza();
    }
}
