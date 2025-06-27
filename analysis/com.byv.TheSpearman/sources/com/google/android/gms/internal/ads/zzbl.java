package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbl {
    public final Uri zzc = null;
    public final String zzd = null;
    public final Bundle zze = null;
    public static final zzbl zza = new zzbl(new zzbk());
    private static final String zzf = Integer.toString(0, 36);
    private static final String zzg = Integer.toString(1, 36);
    private static final String zzh = Integer.toString(2, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbj
    };

    private zzbl(zzbk zzbkVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbl)) {
            return false;
        }
        zzbl zzblVar = (zzbl) obj;
        Uri uri = zzblVar.zzc;
        if (zzfx.zzG(null, null)) {
            String str = zzblVar.zzd;
            if (zzfx.zzG(null, null)) {
                Bundle bundle = zzblVar.zze;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
