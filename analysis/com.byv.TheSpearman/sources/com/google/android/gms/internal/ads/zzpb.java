package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzpb {
    public static final zzpb zza;
    public final String zzb;
    private final zzpa zzc;
    private final Object zzd;

    static {
        zza = zzfx.zza < 31 ? new zzpb("") : new zzpb(zzpa.zza, "");
    }

    public zzpb(LogSessionId logSessionId, String str) {
        this(new zzpa(logSessionId), str);
    }

    private zzpb(zzpa zzpaVar, String str) {
        this.zzc = zzpaVar;
        this.zzb = str;
        this.zzd = new Object();
    }

    public zzpb(String str) {
        zzek.zzf(zzfx.zza < 31);
        this.zzb = str;
        this.zzc = null;
        this.zzd = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpb)) {
            return false;
        }
        zzpb zzpbVar = (zzpb) obj;
        return Objects.equals(this.zzb, zzpbVar.zzb) && Objects.equals(this.zzc, zzpbVar.zzc) && Objects.equals(this.zzd, zzpbVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, this.zzc, this.zzd);
    }

    public final LogSessionId zza() {
        zzpa zzpaVar = this.zzc;
        Objects.requireNonNull(zzpaVar);
        return zzpaVar.zzb;
    }
}
