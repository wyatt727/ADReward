package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
class zzim implements zzio {
    protected final zzhm zzu;

    @Override // com.google.android.gms.measurement.internal.zzio
    @Pure
    public Context zza() {
        return this.zzu.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    @Pure
    public Clock zzb() {
        return this.zzu.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    @Pure
    public zzab zzd() {
        return this.zzu.zzd();
    }

    @Pure
    public zzag zze() {
        return this.zzu.zzf();
    }

    @Pure
    public zzax zzf() {
        return this.zzu.zzg();
    }

    @Pure
    public zzfy zzi() {
        return this.zzu.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    @Pure
    public zzfz zzj() {
        return this.zzu.zzj();
    }

    @Pure
    public zzgo zzk() {
        return this.zzu.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    @Pure
    public zzhj zzl() {
        return this.zzu.zzl();
    }

    @Pure
    public zzny zzq() {
        return this.zzu.zzt();
    }

    zzim(zzhm zzhmVar) {
        Preconditions.checkNotNull(zzhmVar);
        this.zzu = zzhmVar;
    }

    public void zzr() {
        this.zzu.zzl().zzr();
    }

    public void zzs() {
        this.zzu.zzy();
    }

    public void zzt() {
        this.zzu.zzl().zzt();
    }
}
