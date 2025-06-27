package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.games.VideosClient;
import com.google.android.gms.games.internal.zzf;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
final class zzn extends zzf.zzw<VideosClient.OnCaptureOverlayStateListener> {
    zzn(ListenerHolder listenerHolder) {
        super(listenerHolder);
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
    public final void onCaptureOverlayStateChanged(final int i) {
        zzc(new zzf.zzar(i) { // from class: com.google.android.gms.games.internal.zzm
            private final int zzdr;

            {
                this.zzdr = i;
            }

            @Override // com.google.android.gms.games.internal.zzf.zzar
            public final void accept(Object obj) {
                ((VideosClient.OnCaptureOverlayStateListener) obj).onCaptureOverlayStateChanged(this.zzdr);
            }
        });
    }
}
