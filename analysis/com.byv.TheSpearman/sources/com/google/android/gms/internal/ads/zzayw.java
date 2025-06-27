package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzayw extends zzazd {
    public zzayw(zzaxp zzaxpVar, String str, String str2, zzata zzataVar, int i, int i2) {
        super(zzaxpVar, "6JHAw9/xzu8LcH4q9f7Udi9sTntehS9dfukXhX8DEHhp54WYBhd6ZhWkqnOAMGmY", "bFK3lRg0oaTUwYDrSsMiLa/j4LG9nRlI5KKEyt63x08=", zzataVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zze) {
            zzaxk zzaxkVar = new zzaxk((String) this.zzf.invoke(null, new Object[0]));
            this.zze.zzq(zzaxkVar.zza.longValue());
            this.zze.zzr(zzaxkVar.zzb.longValue());
        }
    }
}
