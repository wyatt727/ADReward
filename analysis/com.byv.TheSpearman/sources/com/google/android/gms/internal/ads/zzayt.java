package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzayt extends zzazd {
    private List zzi;
    private final Context zzj;

    public zzayt(zzaxp zzaxpVar, String str, String str2, zzata zzataVar, int i, int i2, Context context) {
        super(zzaxpVar, "/W2ZEuHT/JiI5/Zhh6jV6ATrrvF8IBtmITl+4IJczntAr46Ow/LitCqqOR0RyWN9", "0yxvRSsGg+/BBPRqwe1F54W0T+vv1NRnE+jebtT36Vo=", zzataVar, i, 31);
        this.zzi = null;
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzad(-1L);
        this.zze.zzY(-1L);
        Context contextZzb = this.zzj;
        if (contextZzb == null) {
            contextZzb = this.zzb.zzb();
        }
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke(null, contextZzb);
        }
        List list = this.zzi;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zze) {
            this.zze.zzad(((Long) this.zzi.get(0)).longValue());
            this.zze.zzY(((Long) this.zzi.get(1)).longValue());
        }
    }
}
