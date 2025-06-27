package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzayz extends zzazd {
    public zzayz(zzaxp zzaxpVar, String str, String str2, zzata zzataVar, int i, int i2) {
        super(zzaxpVar, "5HcA415u1KU8m2yVlDZBhQQK+0IFNRmmWPxuAq0DnfPzSdJ/uWlnYMD1kKfkH6cZ", "u7Ufq5yuXkEXg69T8jpWuOOX55Q9g2DSVI1gtbNUvY8=", zzataVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzaa(zzaun.ENUM_FAILURE);
        boolean zBooleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
        synchronized (this.zze) {
            if (zBooleanValue) {
                this.zze.zzaa(zzaun.ENUM_TRUE);
            } else {
                this.zze.zzaa(zzaun.ENUM_FALSE);
            }
        }
    }
}
