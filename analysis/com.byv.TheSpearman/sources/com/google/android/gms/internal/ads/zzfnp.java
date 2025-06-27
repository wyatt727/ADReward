package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfnp extends zzfns {
    private static final zzfnp zzb = new zzfnp();

    private zzfnp() {
    }

    public static zzfnp zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfns
    public final void zzb(boolean z) {
        Iterator it = zzfnq.zza().zzc().iterator();
        while (it.hasNext()) {
            ((zzfnc) it.next()).zzg().zzk(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfns
    public final boolean zzc() {
        Iterator it = zzfnq.zza().zzb().iterator();
        while (it.hasNext()) {
            View viewZzf = ((zzfnc) it.next()).zzf();
            if (viewZzf != null && viewZzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
