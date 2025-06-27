package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfno implements zzfnr {
    private static final zzfno zzb = new zzfno(new zzfns());
    protected final zzfoo zza = new zzfoo();
    private Date zzc;
    private boolean zzd;
    private final zzfns zze;
    private boolean zzf;

    private zzfno(zzfns zzfnsVar) {
        this.zze = zzfnsVar;
    }

    public static zzfno zza() {
        return zzb;
    }

    public final Date zzb() {
        Date date = this.zzc;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfnr
    public final void zzc(boolean z) {
        if (!this.zzf && z) {
            Date date = new Date();
            Date date2 = this.zzc;
            if (date2 == null || date.after(date2)) {
                this.zzc = date;
                if (this.zzd) {
                    Iterator it = zzfnq.zza().zzb().iterator();
                    while (it.hasNext()) {
                        ((zzfnc) it.next()).zzg().zzg(zzb());
                    }
                }
            }
        }
        this.zzf = z;
    }

    public final void zzd(Context context) {
        if (this.zzd) {
            return;
        }
        this.zze.zzd(context);
        this.zze.zze(this);
        this.zze.zzf();
        this.zzf = this.zze.zza;
        this.zzd = true;
    }
}
