package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzayq extends zzazd {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzayq(zzaxp zzaxpVar, String str, String str2, zzata zzataVar, int i, int i2) {
        super(zzaxpVar, "+pOuZc4XP/KXmz3ZcR0Th/zrptiqFMKeADXdr6ffDtBODTAlpCvFIUU/DK0sXoAh", "l4qa5EABhdRHJHltXD4U8dy0wNZl4oyoZ9TbFONnMI4=", zzataVar, i, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzG("E");
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (String) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzG(zzi);
        }
    }
}
