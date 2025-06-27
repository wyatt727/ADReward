package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgfl {
    private final OutputStream zza;

    private zzgfl(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgfl zzb(OutputStream outputStream) {
        return new zzgfl(outputStream);
    }

    public final void zza(zzgvc zzgvcVar) throws IOException {
        try {
            zzgvcVar.zzaU(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
