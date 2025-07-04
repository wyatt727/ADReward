package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@Deprecated
/* loaded from: classes2.dex */
public class DefaultAnalyticsCollector implements AnalyticsCollector {
    private final Clock clock;
    private final SparseArray<AnalyticsListener.EventTime> eventTimes;
    private HandlerWrapper handler;
    private boolean isSeeking;
    private ListenerSet<AnalyticsListener> listeners;
    private final MediaPeriodQueueTracker mediaPeriodQueueTracker;
    private final Timeline.Period period;
    private Player player;
    private final Timeline.Window window;

    static /* synthetic */ void lambda$new$0(AnalyticsListener analyticsListener, FlagSet flagSet) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public /* synthetic */ void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        DrmSessionEventListener.CC.$default$onDrmSessionAcquired(this, i, mediaPeriodId);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onEvents(Player player, Player.Events events) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPositionDiscontinuity(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onRenderedFirstFrame() {
    }

    public DefaultAnalyticsCollector(Clock clock) {
        this.clock = (Clock) Assertions.checkNotNull(clock);
        this.listeners = new ListenerSet<>(Util.getCurrentOrMainLooper(), clock, new ListenerSet.IterationFinishedEvent() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda63
            @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                DefaultAnalyticsCollector.lambda$new$0((AnalyticsListener) obj, flagSet);
            }
        });
        Timeline.Period period = new Timeline.Period();
        this.period = period;
        this.window = new Timeline.Window();
        this.mediaPeriodQueueTracker = new MediaPeriodQueueTracker(period);
        this.eventTimes = new SparseArray<>();
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z) {
        this.listeners.setThrowsWhenUsingWrongThread(z);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public void addListener(AnalyticsListener analyticsListener) {
        Assertions.checkNotNull(analyticsListener);
        this.listeners.add(analyticsListener);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public void removeListener(AnalyticsListener analyticsListener) {
        this.listeners.remove(analyticsListener);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public void setPlayer(final Player player, Looper looper) {
        Assertions.checkState(this.player == null || this.mediaPeriodQueueTracker.mediaPeriodQueue.isEmpty());
        this.player = (Player) Assertions.checkNotNull(player);
        this.handler = this.clock.createHandler(looper, null);
        this.listeners = this.listeners.copy(looper, new ListenerSet.IterationFinishedEvent() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda62
            @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                this.f$0.m358xd6963fe(player, (AnalyticsListener) obj, flagSet);
            }
        });
    }

    /* renamed from: lambda$setPlayer$1$com-google-android-exoplayer2-analytics-DefaultAnalyticsCollector, reason: not valid java name */
    public /* synthetic */ void m358xd6963fe(Player player, AnalyticsListener analyticsListener, FlagSet flagSet) {
        analyticsListener.onEvents(player, new AnalyticsListener.Events(flagSet, this.eventTimes));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public void release() {
        ((HandlerWrapper) Assertions.checkStateNotNull(this.handler)).post(new Runnable() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda64
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.releaseInternal();
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void updateMediaPeriodQueueInfo(List<MediaSource.MediaPeriodId> list, MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onQueueUpdated(list, mediaPeriodId, (Player) Assertions.checkNotNull(this.player));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void notifySeekStarted() {
        if (this.isSeeking) {
            return;
        }
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.isSeeking = true;
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekStarted(eventTimeGenerateCurrentPlayerMediaPeriodEventTime);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioEnabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1007, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda30
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioEnabled(eventTimeGenerateReadingMediaPeriodEventTime, decoderCounters);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDecoderInitialized(final String str, final long j, final long j2) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1008, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda52
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.lambda$onAudioDecoderInitialized$4(eventTimeGenerateReadingMediaPeriodEventTime, str, j2, j, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onAudioDecoderInitialized$4(AnalyticsListener.EventTime eventTime, String str, long j, long j2, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j);
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j2, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioInputFormatChanged(final Format format, final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1009, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda17
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.lambda$onAudioInputFormatChanged$5(eventTimeGenerateReadingMediaPeriodEventTime, format, decoderReuseEvaluation, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onAudioInputFormatChanged$5(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioInputFormatChanged(eventTime, format);
        analyticsListener.onAudioInputFormatChanged(eventTime, format, decoderReuseEvaluation);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioPositionAdvancing(final long j) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1010, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda10
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioPositionAdvancing(eventTimeGenerateReadingMediaPeriodEventTime, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioUnderrun(final int i, final long j, final long j2) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1011, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda6
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioUnderrun(eventTimeGenerateReadingMediaPeriodEventTime, i, j, j2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDecoderReleased(final String str) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1012, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda50
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioDecoderReleased(eventTimeGenerateReadingMediaPeriodEventTime, str);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDisabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1013, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda29
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioDisabled(eventTimeGeneratePlayingMediaPeriodEventTime, decoderCounters);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioSinkError(final Exception exc) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1014, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda46
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioSinkError(eventTimeGenerateReadingMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioCodecError(final Exception exc) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1029, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda45
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioCodecError(eventTimeGenerateReadingMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onVolumeChanged(final float f) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 22, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda65
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVolumeChanged(eventTimeGenerateReadingMediaPeriodEventTime, f);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoEnabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1015, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda32
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoEnabled(eventTimeGenerateReadingMediaPeriodEventTime, decoderCounters);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDecoderInitialized(final String str, final long j, final long j2) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1016, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda53
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.lambda$onVideoDecoderInitialized$14(eventTimeGenerateReadingMediaPeriodEventTime, str, j2, j, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVideoDecoderInitialized$14(AnalyticsListener.EventTime eventTime, String str, long j, long j2, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j);
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j2, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoInputFormatChanged(final Format format, final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1017, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda18
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.lambda$onVideoInputFormatChanged$15(eventTimeGenerateReadingMediaPeriodEventTime, format, decoderReuseEvaluation, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVideoInputFormatChanged$15(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoInputFormatChanged(eventTime, format);
        analyticsListener.onVideoInputFormatChanged(eventTime, format, decoderReuseEvaluation);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onDroppedFrames(final int i, final long j) {
        final AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1018, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda5
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDroppedVideoFrames(eventTimeGeneratePlayingMediaPeriodEventTime, i, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDecoderReleased(final String str) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1019, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda51
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoDecoderReleased(eventTimeGenerateReadingMediaPeriodEventTime, str);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDisabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1020, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda31
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoDisabled(eventTimeGeneratePlayingMediaPeriodEventTime, decoderCounters);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onRenderedFirstFrame(final Object obj, final long j) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 26, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda49
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj2) {
                ((AnalyticsListener) obj2).onRenderedFirstFrame(eventTimeGenerateReadingMediaPeriodEventTime, obj, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoFrameProcessingOffset(final long j, final int i) {
        final AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1021, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda15
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoFrameProcessingOffset(eventTimeGeneratePlayingMediaPeriodEventTime, j, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoCodecError(final Exception exc) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1030, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda48
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoCodecError(eventTimeGenerateReadingMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSurfaceSizeChanged(final int i, final int i2) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 24, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda4
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSurfaceSizeChanged(eventTimeGenerateReadingMediaPeriodEventTime, i, i2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadStarted(int i, MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1000, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda37
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadStarted(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCompleted(int i, MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1001, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda36
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadCompleted(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCanceled(int i, MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1002, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda35
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadCanceled(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadError(int i, MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1003, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda38
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadError(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, iOException, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1005, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda40
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onUpstreamDiscarded(eventTimeGenerateMediaPeriodEventTime, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i, MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1004, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda39
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDownstreamFormatChanged(eventTimeGenerateMediaPeriodEventTime, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onTimelineChanged(Timeline timeline, final int i) {
        this.mediaPeriodQueueTracker.onTimelineChanged((Player) Assertions.checkNotNull(this.player));
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTimelineChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onMediaItemTransition(final MediaItem mediaItem, final int i) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda19
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMediaItemTransition(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaItem, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onTracksChanged(final Tracks tracks) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 2, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda27
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTracksChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, tracks);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onIsLoadingChanged(final boolean z) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda56
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.lambda$onIsLoadingChanged$32(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, z, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onIsLoadingChanged$32(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
        analyticsListener.onLoadingChanged(eventTime, z);
        analyticsListener.onIsLoadingChanged(eventTime, z);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onAvailableCommandsChanged(final Player.Commands commands) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 13, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda26
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAvailableCommandsChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, commands);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayerStateChanged(final boolean z, final int i) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda61
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerStateChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, z, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackStateChanged(final int i) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 4, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda68
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackStateChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayWhenReadyChanged(final boolean z, final int i) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 5, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda60
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayWhenReadyChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, z, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 6, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onIsPlayingChanged(final boolean z) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 7, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda57
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onIsPlayingChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onRepeatModeChanged(final int i) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 8, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda2
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRepeatModeChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onShuffleModeEnabledChanged(final boolean z) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 9, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda58
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onShuffleModeChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayerError(final PlaybackException playbackException) {
        final AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda23
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerError(eventTimeForErrorEvent, playbackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayerErrorChanged(final PlaybackException playbackException) {
        final AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda24
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerErrorChanged(eventTimeForErrorEvent, playbackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPositionDiscontinuity(final Player.PositionInfo positionInfo, final Player.PositionInfo positionInfo2, final int i) {
        if (i == 1) {
            this.isSeeking = false;
        }
        this.mediaPeriodQueueTracker.onPositionDiscontinuity((Player) Assertions.checkNotNull(this.player));
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 11, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda8
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.lambda$onPositionDiscontinuity$43(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, positionInfo, positionInfo2, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onPositionDiscontinuity$43(AnalyticsListener.EventTime eventTime, int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener analyticsListener) {
        analyticsListener.onPositionDiscontinuity(eventTime, i);
        analyticsListener.onPositionDiscontinuity(eventTime, positionInfo, positionInfo2, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackParametersChanged(final PlaybackParameters playbackParameters) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 12, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda25
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackParametersChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, playbackParameters);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onSeekBackIncrementChanged(final long j) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 16, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda13
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekBackIncrementChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onSeekForwardIncrementChanged(final long j) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 17, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda14
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekForwardIncrementChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onMaxSeekToPreviousPositionChanged(final long j) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 18, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda12
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMaxSeekToPreviousPositionChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onMediaMetadataChanged(final MediaMetadata mediaMetadata) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 14, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda20
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMediaMetadataChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaMetadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlaylistMetadataChanged(final MediaMetadata mediaMetadata) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 15, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda21
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaylistMetadataChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaMetadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onMetadata(final Metadata metadata) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 28, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda34
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMetadata(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, metadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onCues(final List<Cue> list) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 27, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda54
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onCues(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, (List<Cue>) list);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onCues(final CueGroup cueGroup) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 27, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda41
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onCues(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, cueGroup);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSkipSilenceEnabledChanged(final boolean z) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 23, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda59
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSkipSilenceEnabledChanged(eventTimeGenerateReadingMediaPeriodEventTime, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onAudioSessionIdChanged(final int i) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 21, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda66
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioSessionIdChanged(eventTimeGenerateReadingMediaPeriodEventTime, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onAudioAttributesChanged(final AudioAttributes audioAttributes) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 20, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda28
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioAttributesChanged(eventTimeGenerateReadingMediaPeriodEventTime, audioAttributes);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onVideoSizeChanged(final VideoSize videoSize) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 25, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda43
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.lambda$onVideoSizeChanged$56(eventTimeGenerateReadingMediaPeriodEventTime, videoSize, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVideoSizeChanged$56(AnalyticsListener.EventTime eventTime, VideoSize videoSize, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoSizeChanged(eventTime, videoSize);
        analyticsListener.onVideoSizeChanged(eventTime, videoSize.width, videoSize.height, videoSize.unappliedRotationDegrees, videoSize.pixelWidthHeightRatio);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onTrackSelectionParametersChanged(final TrackSelectionParameters trackSelectionParameters) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 19, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda42
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTrackSelectionParametersChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, trackSelectionParameters);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onDeviceInfoChanged(final DeviceInfo deviceInfo) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 29, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda16
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDeviceInfoChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, deviceInfo);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onDeviceVolumeChanged(final int i, final boolean z) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 30, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda9
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDeviceVolumeChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(final int i, final long j, final long j2) {
        final AnalyticsListener.EventTime eventTimeGenerateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateLoadingMediaPeriodEventTime, 1006, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda7
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onBandwidthEstimate(eventTimeGenerateLoadingMediaPeriodEventTime, i, j, j2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId, final int i2) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1022, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda67
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.lambda$onDrmSessionAcquired$61(eventTimeGenerateMediaPeriodEventTime, i2, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onDrmSessionAcquired$61(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
        analyticsListener.onDrmSessionAcquired(eventTime);
        analyticsListener.onDrmSessionAcquired(eventTime, i);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1023, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda11
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysLoaded(eventTimeGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, final Exception exc) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1024, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda47
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionManagerError(eventTimeGenerateMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1025, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda33
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysRestored(eventTimeGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1026, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda22
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysRemoved(eventTimeGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1027, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda44
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionReleased(eventTimeGenerateMediaPeriodEventTime);
            }
        });
    }

    protected final void sendEvent(AnalyticsListener.EventTime eventTime, int i, ListenerSet.Event<AnalyticsListener> event) {
        this.eventTimes.put(i, eventTime);
        this.listeners.sendEvent(i, event);
    }

    protected final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod());
    }

    @RequiresNonNull({"player"})
    protected final AnalyticsListener.EventTime generateEventTime(Timeline timeline, int i, MediaSource.MediaPeriodId mediaPeriodId) {
        long contentPosition;
        MediaSource.MediaPeriodId mediaPeriodId2 = timeline.isEmpty() ? null : mediaPeriodId;
        long jElapsedRealtime = this.clock.elapsedRealtime();
        boolean z = timeline.equals(this.player.getCurrentTimeline()) && i == this.player.getCurrentMediaItemIndex();
        long defaultPositionMs = 0;
        if (mediaPeriodId2 != null && mediaPeriodId2.isAd()) {
            if (z && this.player.getCurrentAdGroupIndex() == mediaPeriodId2.adGroupIndex && this.player.getCurrentAdIndexInAdGroup() == mediaPeriodId2.adIndexInAdGroup) {
                defaultPositionMs = this.player.getCurrentPosition();
            }
        } else {
            if (z) {
                contentPosition = this.player.getContentPosition();
                return new AnalyticsListener.EventTime(jElapsedRealtime, timeline, i, mediaPeriodId2, contentPosition, this.player.getCurrentTimeline(), this.player.getCurrentMediaItemIndex(), this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod(), this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
            }
            if (!timeline.isEmpty()) {
                defaultPositionMs = timeline.getWindow(i, this.window).getDefaultPositionMs();
            }
        }
        contentPosition = defaultPositionMs;
        return new AnalyticsListener.EventTime(jElapsedRealtime, timeline, i, mediaPeriodId2, contentPosition, this.player.getCurrentTimeline(), this.player.getCurrentMediaItemIndex(), this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod(), this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseInternal() {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 1028, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda55
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerReleased(eventTimeGenerateCurrentPlayerMediaPeriodEventTime);
            }
        });
        this.listeners.release();
    }

    private AnalyticsListener.EventTime generateEventTime(MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.checkNotNull(this.player);
        Timeline mediaPeriodIdTimeline = mediaPeriodId == null ? null : this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId);
        if (mediaPeriodId == null || mediaPeriodIdTimeline == null) {
            int currentMediaItemIndex = this.player.getCurrentMediaItemIndex();
            Timeline currentTimeline = this.player.getCurrentTimeline();
            if (!(currentMediaItemIndex < currentTimeline.getWindowCount())) {
                currentTimeline = Timeline.EMPTY;
            }
            return generateEventTime(currentTimeline, currentMediaItemIndex, null);
        }
        return generateEventTime(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId);
    }

    private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateMediaPeriodEventTime(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.checkNotNull(this.player);
        if (mediaPeriodId != null) {
            if (this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId) != null) {
                return generateEventTime(mediaPeriodId);
            }
            return generateEventTime(Timeline.EMPTY, i, mediaPeriodId);
        }
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (!(i < currentTimeline.getWindowCount())) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, i, null);
    }

    private AnalyticsListener.EventTime getEventTimeForErrorEvent(PlaybackException playbackException) {
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            if (exoPlaybackException.mediaPeriodId != null) {
                return generateEventTime(new MediaSource.MediaPeriodId(exoPlaybackException.mediaPeriodId));
            }
        }
        return generateCurrentPlayerMediaPeriodEventTime();
    }

    private static final class MediaPeriodQueueTracker {
        private MediaSource.MediaPeriodId currentPlayerMediaPeriod;
        private ImmutableList<MediaSource.MediaPeriodId> mediaPeriodQueue = ImmutableList.of();
        private ImmutableMap<MediaSource.MediaPeriodId, Timeline> mediaPeriodTimelines = ImmutableMap.of();
        private final Timeline.Period period;
        private MediaSource.MediaPeriodId playingMediaPeriod;
        private MediaSource.MediaPeriodId readingMediaPeriod;

        public MediaPeriodQueueTracker(Timeline.Period period) {
            this.period = period;
        }

        public MediaSource.MediaPeriodId getCurrentPlayerMediaPeriod() {
            return this.currentPlayerMediaPeriod;
        }

        public MediaSource.MediaPeriodId getPlayingMediaPeriod() {
            return this.playingMediaPeriod;
        }

        public MediaSource.MediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public MediaSource.MediaPeriodId getLoadingMediaPeriod() {
            if (this.mediaPeriodQueue.isEmpty()) {
                return null;
            }
            return (MediaSource.MediaPeriodId) Iterables.getLast(this.mediaPeriodQueue);
        }

        public Timeline getMediaPeriodIdTimeline(MediaSource.MediaPeriodId mediaPeriodId) {
            return this.mediaPeriodTimelines.get(mediaPeriodId);
        }

        public void onPositionDiscontinuity(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
        }

        public void onTimelineChanged(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }

        public void onQueueUpdated(List<MediaSource.MediaPeriodId> list, MediaSource.MediaPeriodId mediaPeriodId, Player player) {
            this.mediaPeriodQueue = ImmutableList.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.playingMediaPeriod = list.get(0);
                this.readingMediaPeriod = (MediaSource.MediaPeriodId) Assertions.checkNotNull(mediaPeriodId);
            }
            if (this.currentPlayerMediaPeriod == null) {
                this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            }
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }

        private void updateMediaPeriodTimelines(Timeline timeline) {
            ImmutableMap.Builder<MediaSource.MediaPeriodId, Timeline> builder = ImmutableMap.builder();
            if (this.mediaPeriodQueue.isEmpty()) {
                addTimelineForMediaPeriodId(builder, this.playingMediaPeriod, timeline);
                if (!Objects.equal(this.readingMediaPeriod, this.playingMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.readingMediaPeriod, timeline);
                }
                if (!Objects.equal(this.currentPlayerMediaPeriod, this.playingMediaPeriod) && !Objects.equal(this.currentPlayerMediaPeriod, this.readingMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.currentPlayerMediaPeriod, timeline);
                }
            } else {
                for (int i = 0; i < this.mediaPeriodQueue.size(); i++) {
                    addTimelineForMediaPeriodId(builder, this.mediaPeriodQueue.get(i), timeline);
                }
                if (!this.mediaPeriodQueue.contains(this.currentPlayerMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.currentPlayerMediaPeriod, timeline);
                }
            }
            this.mediaPeriodTimelines = builder.buildOrThrow();
        }

        private void addTimelineForMediaPeriodId(ImmutableMap.Builder<MediaSource.MediaPeriodId, Timeline> builder, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            if (mediaPeriodId == null) {
                return;
            }
            if (timeline.getIndexOfPeriod(mediaPeriodId.periodUid) != -1) {
                builder.put(mediaPeriodId, timeline);
                return;
            }
            Timeline timeline2 = this.mediaPeriodTimelines.get(mediaPeriodId);
            if (timeline2 != null) {
                builder.put(mediaPeriodId, timeline2);
            }
        }

        private static MediaSource.MediaPeriodId findCurrentPlayerMediaPeriodInQueue(Player player, ImmutableList<MediaSource.MediaPeriodId> immutableList, MediaSource.MediaPeriodId mediaPeriodId, Timeline.Period period) {
            Timeline currentTimeline = player.getCurrentTimeline();
            int currentPeriodIndex = player.getCurrentPeriodIndex();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (player.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, period).getAdGroupIndexAfterPositionUs(Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs());
            for (int i = 0; i < immutableList.size(); i++) {
                MediaSource.MediaPeriodId mediaPeriodId2 = immutableList.get(i);
                if (isMatchingMediaPeriod(mediaPeriodId2, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return mediaPeriodId2;
                }
            }
            if (immutableList.isEmpty() && mediaPeriodId != null) {
                if (isMatchingMediaPeriod(mediaPeriodId, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return mediaPeriodId;
                }
            }
            return null;
        }

        private static boolean isMatchingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Object obj, boolean z, int i, int i2, int i3) {
            if (mediaPeriodId.periodUid.equals(obj)) {
                return (z && mediaPeriodId.adGroupIndex == i && mediaPeriodId.adIndexInAdGroup == i2) || (!z && mediaPeriodId.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex == i3);
            }
            return false;
        }
    }
}
