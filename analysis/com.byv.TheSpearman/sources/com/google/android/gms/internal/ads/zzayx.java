package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzayx extends zzazd {
    private final zzaxw zzi;
    private long zzj;

    public zzayx(zzaxp zzaxpVar, String str, String str2, zzata zzataVar, int i, int i2, zzaxw zzaxwVar) {
        super(zzaxpVar, "1LUIVO6lhWmBJfHw9DMAIriIU/Yodc7yYpCjENKu6ENqSuhgH3MJrJCpj/jKq6Pa", "V8P78mWO+MxnWR283vMX+BSDXEvrm8XlQCYXMpvUe5w=", zzataVar, i, 53);
        this.zzi = zzaxwVar;
        if (zzaxwVar != null) {
            this.zzj = zzaxwVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            this.zze.zzV(((Long) this.zzf.invoke(null, Long.valueOf(this.zzj))).longValue());
        }
    }
}
