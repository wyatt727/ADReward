package com.google.android.gms.internal.ads;

import com.json.t2;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaed {
    public final zzaeg zza;
    public final zzaeg zzb;

    public zzaed(zzaeg zzaegVar, zzaeg zzaegVar2) {
        this.zza = zzaegVar;
        this.zzb = zzaegVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaed zzaedVar = (zzaed) obj;
            if (this.zza.equals(zzaedVar.zza) && this.zzb.equals(zzaedVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzaeg zzaegVar = this.zza;
        zzaeg zzaegVar2 = this.zzb;
        return t2.i.d + zzaegVar.toString() + (zzaegVar.equals(zzaegVar2) ? "" : ", ".concat(this.zzb.toString())) + t2.i.e;
    }
}
