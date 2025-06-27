package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaaz extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzaax zzd;
    private boolean zze;

    /* synthetic */ zzaaz(zzaax zzaaxVar, SurfaceTexture surfaceTexture, boolean z, zzaay zzaayVar) {
        super(surfaceTexture);
        this.zzd = zzaaxVar;
        this.zza = z;
    }

    public static zzaaz zza(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzek.zzf(z2);
        return new zzaax().zza(z ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        if (!zzc) {
            zzb = zzet.zzb(context) ? zzet.zzc() ? 1 : 2 : 0;
            zzc = true;
        }
        return zzb != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
