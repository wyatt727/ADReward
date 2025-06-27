package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzayg extends zzazd {
    private final long zzi;

    public zzayg(zzaxp zzaxpVar, String str, String str2, zzata zzataVar, long j, int i, int i2) {
        super(zzaxpVar, "Rx5KxmHu63h8QT7T4cYR2mu7F4LQnYkocG/Azb9HP8ZHyjUHnRxxCuB99BIp3kbl", "3fysZeGzwX+hqd2f4+qtlSho+oF+DeFl9kzKrTFOSWo=", zzataVar, i, 25);
        this.zzi = j;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zzf.invoke(null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzv(jLongValue);
            long j = this.zzi;
            if (j != 0) {
                this.zze.zzZ(jLongValue - j);
                this.zze.zzab(this.zzi);
            }
        }
    }
}
