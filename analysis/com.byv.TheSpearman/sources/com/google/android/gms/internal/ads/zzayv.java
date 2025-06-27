package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzayv extends zzazd {
    private final StackTraceElement[] zzi;

    public zzayv(zzaxp zzaxpVar, String str, String str2, zzata zzataVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzaxpVar, "9douHjmTTjq3N4YYUdzzHaKyxIqsB5K92p8t26vKQB1HahpVak+32YHan4LmgLPE", "q6oLc2ULDKRAR1VDdX5lO9/kb0NHjx7PMACMr/7cZL8=", zzataVar, i, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzaxg zzaxgVar = new zzaxg((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                this.zze.zzL(zzaxgVar.zza.longValue());
                if (zzaxgVar.zzb.booleanValue()) {
                    this.zze.zzA(zzaxgVar.zzc.booleanValue() ? zzaun.ENUM_FALSE : zzaun.ENUM_TRUE);
                } else {
                    this.zze.zzA(zzaun.ENUM_FAILURE);
                }
            }
        }
    }
}
