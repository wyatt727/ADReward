package com.google.android.gms.games;

import android.content.Intent;
import com.google.android.gms.games.video.CaptureState;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.games.video.Videos;
import com.google.android.gms.tasks.Task;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public interface VideosClient {
    public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STARTED = 2;
    public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STOPPED = 3;
    public static final int CAPTURE_OVERLAY_STATE_DISMISSED = 4;
    public static final int CAPTURE_OVERLAY_STATE_SHOWN = 1;

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CaptureOverlayState {
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    public interface OnCaptureOverlayStateListener extends Videos.CaptureOverlayStateListener {
        @Override // com.google.android.gms.games.video.Videos.CaptureOverlayStateListener
        void onCaptureOverlayStateChanged(int i);
    }

    Task<VideoCapabilities> getCaptureCapabilities();

    Task<Intent> getCaptureOverlayIntent();

    Task<CaptureState> getCaptureState();

    Task<Boolean> isCaptureAvailable(int i);

    Task<Boolean> isCaptureSupported();

    Task<Void> registerOnCaptureOverlayStateChangedListener(OnCaptureOverlayStateListener onCaptureOverlayStateListener);

    Task<Boolean> unregisterOnCaptureOverlayStateChangedListener(OnCaptureOverlayStateListener onCaptureOverlayStateListener);
}
