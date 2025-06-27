package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.VideosClient;
import com.google.android.gms.games.video.CaptureState;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzei extends zzac implements VideosClient {
    public zzei(Context context, Games.GamesOptions gamesOptions) {
        super(context, gamesOptions);
    }

    public zzei(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, gamesOptions);
    }

    @Override // com.google.android.gms.games.VideosClient
    public final Task<VideoCapabilities> getCaptureCapabilities() {
        return zza(zzel.zzev);
    }

    @Override // com.google.android.gms.games.VideosClient
    public final Task<Intent> getCaptureOverlayIntent() {
        return zza(zzek.zzev);
    }

    @Override // com.google.android.gms.games.VideosClient
    public final Task<CaptureState> getCaptureState() {
        return zza(zzen.zzev);
    }

    @Override // com.google.android.gms.games.VideosClient
    public final Task<Boolean> isCaptureAvailable(final int i) {
        return zza(new RemoteCall(i) { // from class: com.google.android.gms.internal.games.zzem
            private final int zzdr;

            {
                this.zzdr = i;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<Boolean>) obj2, this.zzdr);
            }
        });
    }

    @Override // com.google.android.gms.games.VideosClient
    public final Task<Boolean> isCaptureSupported() {
        return zza(zzep.zzev);
    }

    @Override // com.google.android.gms.games.VideosClient
    public final Task<Void> registerOnCaptureOverlayStateChangedListener(VideosClient.OnCaptureOverlayStateListener onCaptureOverlayStateListener) {
        final ListenerHolder<L> listenerHolderRegisterListener = registerListener(onCaptureOverlayStateListener, VideosClient.OnCaptureOverlayStateListener.class.getSimpleName());
        Preconditions.checkNotNull(listenerHolderRegisterListener.getListenerKey(), "Key must not be null");
        RemoteCall remoteCall = new RemoteCall(listenerHolderRegisterListener) { // from class: com.google.android.gms.internal.games.zzeo
            private final ListenerHolder zzgs;

            {
                this.zzgs = listenerHolderRegisterListener;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza(this.zzgs);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        };
        return doRegisterEventListener(RegistrationMethods.builder().register(remoteCall).unregister(zzer.zzev).withHolder(listenerHolderRegisterListener).build());
    }

    @Override // com.google.android.gms.games.VideosClient
    public final Task<Boolean> unregisterOnCaptureOverlayStateChangedListener(VideosClient.OnCaptureOverlayStateListener onCaptureOverlayStateListener) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(onCaptureOverlayStateListener, VideosClient.OnCaptureOverlayStateListener.class.getSimpleName()));
    }
}
