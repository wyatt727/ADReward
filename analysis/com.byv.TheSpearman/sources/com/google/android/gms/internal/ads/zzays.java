package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzays extends zzazd {
    public zzays(zzaxp zzaxpVar, String str, String str2, zzata zzataVar, int i, int i2) {
        super(zzaxpVar, "0njjbCFUq6vJ1UgnErUI7KEtLgZLN7V9IJ5yZ3QtzXmjMaTjzKInpeDNakYTgh0P", "C8NIMy/t/HZjKrbJt0Xe/Cv+czK1jvEhHHQsIVfXSJE=", zzataVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            this.zze.zzI(((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue() ? zzaun.ENUM_TRUE : zzaun.ENUM_FALSE);
        } catch (InvocationTargetException unused) {
            this.zze.zzI(zzaun.ENUM_FAILURE);
        }
    }
}
