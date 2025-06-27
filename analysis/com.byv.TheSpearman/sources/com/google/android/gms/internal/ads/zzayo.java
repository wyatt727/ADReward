package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzayo extends zzazd {
    private final zzaws zzi;
    private final long zzj;
    private final long zzk;

    public zzayo(zzaxp zzaxpVar, String str, String str2, zzata zzataVar, int i, int i2, zzaws zzawsVar, long j, long j2) {
        super(zzaxpVar, "gAg/p/cQzJRjYz9LhE8cRk72DVV1Cpozf/TbzvACqLcTgM3sRjMEb3DCmwYhMmhP", "avDZD6/xoSbFYvWCy23XLncB75oD5DxKdrTKFY2O0hY=", zzataVar, i, 11);
        this.zzi = zzawsVar;
        this.zzj = j;
        this.zzk = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaws zzawsVar = this.zzi;
        if (zzawsVar != null) {
            zzawq zzawqVar = new zzawq((String) this.zzf.invoke(null, zzawsVar.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)));
            synchronized (this.zze) {
                this.zze.zzE(zzawqVar.zza.longValue());
                if (zzawqVar.zzb.longValue() >= 0) {
                    this.zze.zzW(zzawqVar.zzb.longValue());
                }
                if (zzawqVar.zzc.longValue() >= 0) {
                    this.zze.zzg(zzawqVar.zzc.longValue());
                }
            }
        }
    }
}
