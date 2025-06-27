package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class BaseMediaSource implements MediaSource {
    private Object manifest;
    private ExoPlayer player;
    private Timeline timeline;
    private final ArrayList<MediaSource.SourceInfoRefreshListener> sourceInfoListeners = new ArrayList<>(1);
    private final MediaSourceEventListener.EventDispatcher eventDispatcher = new MediaSourceEventListener.EventDispatcher();

    protected abstract void prepareSourceInternal(ExoPlayer exoPlayer, boolean z);

    protected abstract void releaseSourceInternal();

    protected final void refreshSourceInfo(Timeline timeline, Object obj) {
        this.timeline = timeline;
        this.manifest = obj;
        Iterator<MediaSource.SourceInfoRefreshListener> it = this.sourceInfoListeners.iterator();
        while (it.hasNext()) {
            it.next().onSourceInfoRefreshed(this, timeline, obj);
        }
    }

    protected final MediaSourceEventListener.EventDispatcher createEventDispatcher(MediaSource.MediaPeriodId mediaPeriodId) {
        return this.eventDispatcher.withParameters(0, mediaPeriodId, 0L);
    }

    protected final MediaSourceEventListener.EventDispatcher createEventDispatcher(MediaSource.MediaPeriodId mediaPeriodId, long j) {
        Assertions.checkArgument(mediaPeriodId != null);
        return this.eventDispatcher.withParameters(0, mediaPeriodId, j);
    }

    protected final MediaSourceEventListener.EventDispatcher createEventDispatcher(int i, MediaSource.MediaPeriodId mediaPeriodId, long j) {
        return this.eventDispatcher.withParameters(i, mediaPeriodId, j);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
        this.eventDispatcher.addEventListener(handler, mediaSourceEventListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
        this.eventDispatcher.removeEventListener(mediaSourceEventListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void prepareSource(ExoPlayer exoPlayer, boolean z, MediaSource.SourceInfoRefreshListener sourceInfoRefreshListener) {
        ExoPlayer exoPlayer2 = this.player;
        Assertions.checkArgument(exoPlayer2 == null || exoPlayer2 == exoPlayer);
        this.sourceInfoListeners.add(sourceInfoRefreshListener);
        if (this.player == null) {
            this.player = exoPlayer;
            prepareSourceInternal(exoPlayer, z);
        } else {
            Timeline timeline = this.timeline;
            if (timeline != null) {
                sourceInfoRefreshListener.onSourceInfoRefreshed(this, timeline, this.manifest);
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void releaseSource(MediaSource.SourceInfoRefreshListener sourceInfoRefreshListener) {
        this.sourceInfoListeners.remove(sourceInfoRefreshListener);
        if (this.sourceInfoListeners.isEmpty()) {
            this.player = null;
            this.timeline = null;
            this.manifest = null;
            releaseSourceInternal();
        }
    }
}
