package com.google.android.gms.internal.ads;

import com.json.t2;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaeg {
    public static final zzaeg zza = new zzaeg(0, 0);
    public final long zzb;
    public final long zzc;

    public zzaeg(long j, long j2) {
        this.zzb = j;
        this.zzc = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaeg zzaegVar = (zzaeg) obj;
            if (this.zzb == zzaegVar.zzb && this.zzc == zzaegVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        return "[timeUs=" + this.zzb + ", position=" + this.zzc + t2.i.e;
    }
}
