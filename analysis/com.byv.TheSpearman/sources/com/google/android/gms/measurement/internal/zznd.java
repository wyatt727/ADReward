package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
abstract class zznd extends zzne {
    private boolean zza;

    zznd(zzni zzniVar) {
        super(zzniVar);
        this.zzf.zzu();
    }

    protected abstract boolean zzc();

    protected final void zzak() {
        if (!zzam()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzal() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzc();
        this.zzf.zzt();
        this.zza = true;
    }

    final boolean zzam() {
        return this.zza;
    }
}
