package com.my.target;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.video.VideoSize;
import com.my.target.w;
import java.util.List;

/* loaded from: classes4.dex */
public final class o1 implements Player.Listener, w {

    /* renamed from: a, reason: collision with root package name */
    public final q8 f4078a = q8.a(200);
    public final ExoPlayer b;
    public final a c;
    public w.a d;
    public MediaSource e;
    public Uri f;
    public boolean g;
    public boolean h;

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f4079a;
        public final ExoPlayer b;
        public w.a c;
        public int d;
        public float e;

        public a(int i, ExoPlayer exoPlayer) {
            this.f4079a = i;
            this.b = exoPlayer;
        }

        public void a(w.a aVar) {
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                float currentPosition = this.b.getCurrentPosition() / 1000.0f;
                float duration = this.b.getDuration() / 1000.0f;
                if (this.e == currentPosition) {
                    this.d++;
                } else {
                    w.a aVar = this.c;
                    if (aVar != null) {
                        aVar.a(currentPosition, duration);
                    }
                    this.e = currentPosition;
                    if (this.d > 0) {
                        this.d = 0;
                    }
                }
                if (this.d > this.f4079a) {
                    w.a aVar2 = this.c;
                    if (aVar2 != null) {
                        aVar2.h();
                    }
                    this.d = 0;
                }
            } catch (Throwable th) {
                String str = "ExoVideoPlayer: Error - " + th.getMessage();
                ba.a(str);
                w.a aVar3 = this.c;
                if (aVar3 != null) {
                    aVar3.a(str);
                }
            }
        }
    }

    public o1(Context context) {
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
        this.b = exoPlayerBuild;
        exoPlayerBuild.addListener(this);
        this.c = new a(50, exoPlayerBuild);
    }

    public static o1 a(Context context) {
        return new o1(context);
    }

    @Override // com.my.target.w
    public void a() {
        try {
            if (this.g) {
                this.b.setPlayWhenReady(true);
            } else {
                MediaSource mediaSource = this.e;
                if (mediaSource != null) {
                    this.b.setMediaSource(mediaSource, true);
                    this.b.prepare();
                }
            }
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // com.my.target.w
    public void a(Uri uri, Context context) {
        ba.a("ExoVideoPlayer: prepare to play video in ExoPlayer");
        this.f = uri;
        this.h = false;
        w.a aVar = this.d;
        if (aVar != null) {
            aVar.e();
        }
        try {
            this.f4078a.a(this.c);
            this.b.setPlayWhenReady(true);
            if (this.g) {
                ba.b("ExoVideoPlayer: New source url not set! Will play previous video! started = true");
                return;
            }
            MediaSource mediaSourceA = a6.a(uri, context);
            this.e = mediaSourceA;
            this.b.setMediaSource(mediaSourceA);
            this.b.prepare();
            ba.a("ExoVideoPlayer: Play new video in ExoPlayer");
        } catch (Throwable th) {
            String str = "ExoVideoPlayer: Error - " + th.getMessage();
            ba.a(str);
            w.a aVar2 = this.d;
            if (aVar2 != null) {
                aVar2.a(str);
            }
        }
    }

    @Override // com.my.target.w
    public void a(Uri uri, x xVar) {
        a(xVar);
        a(uri, xVar.getContext());
    }

    @Override // com.my.target.w
    public void a(w.a aVar) {
        this.d = aVar;
        this.c.a(aVar);
    }

    @Override // com.my.target.w
    public void a(x xVar) {
        try {
            if (xVar != null) {
                xVar.setExoPlayer(this.b);
            } else {
                this.b.setVideoTextureView(null);
            }
        } catch (Throwable th) {
            a(th);
        }
    }

    public final void a(Throwable th) {
        String str = "ExoVideoPlayer: Error - " + th.getMessage();
        ba.a(str);
        w.a aVar = this.d;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // com.my.target.w
    public void b() {
        try {
            setVolume(((double) this.b.getVolume()) == 1.0d ? 0.0f : 1.0f);
        } catch (Throwable th) {
            ba.a("ExoVideoPlayer: error - " + th.getMessage());
        }
    }

    @Override // com.my.target.w
    public boolean c() {
        return this.g && this.h;
    }

    @Override // com.my.target.w
    public void d() {
        try {
            this.b.seekTo(0L);
            this.b.setPlayWhenReady(true);
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // com.my.target.w
    public void destroy() {
        this.f = null;
        this.g = false;
        this.h = false;
        this.d = null;
        this.f4078a.b(this.c);
        try {
            this.b.setVideoTextureView(null);
            this.b.stop();
            this.b.release();
            this.b.removeListener(this);
        } catch (Throwable unused) {
        }
    }

    @Override // com.my.target.w
    public boolean e() {
        try {
            return this.b.getVolume() == 0.0f;
        } catch (Throwable th) {
            ba.a("ExoVideoPlayer: Error - " + th.getMessage());
            return false;
        }
    }

    @Override // com.my.target.w
    public void f() {
        try {
            this.b.setVolume(1.0f);
        } catch (Throwable th) {
            ba.a("ExoVideoPlayer: Error - " + th.getMessage());
        }
        w.a aVar = this.d;
        if (aVar != null) {
            aVar.a(1.0f);
        }
    }

    @Override // com.my.target.w
    public void g() {
        try {
            this.b.setVolume(0.2f);
        } catch (Throwable th) {
            ba.a("ExoVideoPlayer: Error - " + th.getMessage());
        }
    }

    @Override // com.my.target.w
    public float getDuration() {
        try {
            return this.b.getDuration() / 1000.0f;
        } catch (Throwable th) {
            ba.a("ExoVideoPlayer: Error - " + th.getMessage());
            return 0.0f;
        }
    }

    @Override // com.my.target.w
    public long getPosition() {
        try {
            return this.b.getCurrentPosition();
        } catch (Throwable th) {
            ba.a("ExoVideoPlayer: Error - " + th.getMessage());
            return 0L;
        }
    }

    @Override // com.my.target.w
    public Uri getUri() {
        return this.f;
    }

    @Override // com.my.target.w
    public void h() {
        try {
            this.b.setVolume(0.0f);
        } catch (Throwable th) {
            ba.a("ExoVideoPlayer: Error - " + th.getMessage());
        }
        w.a aVar = this.d;
        if (aVar != null) {
            aVar.a(0.0f);
        }
    }

    @Override // com.my.target.w
    public boolean i() {
        return this.g;
    }

    @Override // com.my.target.w
    public boolean isPlaying() {
        return this.g && !this.h;
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        Player.Listener.CC.$default$onAudioAttributesChanged(this, audioAttributes);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onAudioSessionIdChanged(int i) {
        Player.Listener.CC.$default$onAudioSessionIdChanged(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        Player.Listener.CC.$default$onAvailableCommandsChanged(this, commands);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onCues(CueGroup cueGroup) {
        Player.Listener.CC.$default$onCues(this, cueGroup);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onCues(List list) {
        Player.Listener.CC.$default$onCues(this, list);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        Player.Listener.CC.$default$onDeviceInfoChanged(this, deviceInfo);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
        Player.Listener.CC.$default$onDeviceVolumeChanged(this, i, z);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onEvents(Player player, Player.Events events) {
        Player.Listener.CC.$default$onEvents(this, player, events);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onIsLoadingChanged(boolean z) {
        Player.Listener.CC.$default$onIsLoadingChanged(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onIsPlayingChanged(boolean z) {
        Player.Listener.CC.$default$onIsPlayingChanged(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onLoadingChanged(boolean z) {
        Player.Listener.CC.$default$onLoadingChanged(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
        Player.Listener.CC.$default$onMaxSeekToPreviousPositionChanged(this, j);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
        Player.Listener.CC.$default$onMediaItemTransition(this, mediaItem, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        Player.Listener.CC.$default$onMediaMetadataChanged(this, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onMetadata(Metadata metadata) {
        Player.Listener.CC.$default$onMetadata(this, metadata);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        Player.Listener.CC.$default$onPlayWhenReadyChanged(this, z, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        Player.Listener.CC.$default$onPlaybackParametersChanged(this, playbackParameters);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlaybackStateChanged(int i) {
        Player.Listener.CC.$default$onPlaybackStateChanged(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayerError(PlaybackException playbackException) {
        this.h = false;
        this.g = false;
        if (this.d != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ExoVideoPlayer: Error - ");
            sb.append(playbackException != null ? playbackException.getMessage() : "unknown video error");
            this.d.a(sb.toString());
        }
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        Player.Listener.CC.$default$onPlayerErrorChanged(this, playbackException);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayerStateChanged(boolean z, int i) {
        if (i != 1) {
            if (i == 2) {
                ba.a("ExoVideoPlayer: Player state is changed to BUFFERING");
                if (!z || this.g) {
                    return;
                }
            } else if (i == 3) {
                ba.a("ExoVideoPlayer: Player state is changed to READY");
                if (z) {
                    w.a aVar = this.d;
                    if (aVar != null) {
                        aVar.i();
                    }
                    if (!this.g) {
                        this.g = true;
                    } else if (this.h) {
                        this.h = false;
                        w.a aVar2 = this.d;
                        if (aVar2 != null) {
                            aVar2.f();
                        }
                    }
                } else if (!this.h) {
                    this.h = true;
                    w.a aVar3 = this.d;
                    if (aVar3 != null) {
                        aVar3.d();
                    }
                }
            } else {
                if (i != 4) {
                    return;
                }
                ba.a("ExoVideoPlayer: Player state is changed to ENDED");
                this.h = false;
                this.g = false;
                float duration = getDuration();
                w.a aVar4 = this.d;
                if (aVar4 != null) {
                    aVar4.a(duration, duration);
                }
                w.a aVar5 = this.d;
                if (aVar5 != null) {
                    aVar5.onVideoCompleted();
                }
            }
            this.f4078a.a(this.c);
            return;
        }
        ba.a("ExoVideoPlayer: Player state is changed to IDLE");
        if (this.g) {
            this.g = false;
            w.a aVar6 = this.d;
            if (aVar6 != null) {
                aVar6.n();
            }
        }
        this.f4078a.b(this.c);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        Player.Listener.CC.$default$onPlaylistMetadataChanged(this, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPositionDiscontinuity(int i) {
        Player.Listener.CC.$default$onPositionDiscontinuity(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        Player.Listener.CC.$default$onPositionDiscontinuity(this, positionInfo, positionInfo2, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onRenderedFirstFrame() {
        Player.Listener.CC.$default$onRenderedFirstFrame(this);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onRepeatModeChanged(int i) {
        Player.Listener.CC.$default$onRepeatModeChanged(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onSeekBackIncrementChanged(long j) {
        Player.Listener.CC.$default$onSeekBackIncrementChanged(this, j);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        Player.Listener.CC.$default$onSeekForwardIncrementChanged(this, j);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        Player.Listener.CC.$default$onShuffleModeEnabledChanged(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        Player.Listener.CC.$default$onSkipSilenceEnabledChanged(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        Player.Listener.CC.$default$onSurfaceSizeChanged(this, i, i2);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
        Player.Listener.CC.$default$onTimelineChanged(this, timeline, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        Player.Listener.CC.$default$onTrackSelectionParametersChanged(this, trackSelectionParameters);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onTracksChanged(Tracks tracks) {
        Player.Listener.CC.$default$onTracksChanged(this, tracks);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
        Player.Listener.CC.$default$onVideoSizeChanged(this, videoSize);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onVolumeChanged(float f) {
        Player.Listener.CC.$default$onVolumeChanged(this, f);
    }

    @Override // com.my.target.w
    public void pause() {
        if (!this.g || this.h) {
            return;
        }
        try {
            this.b.setPlayWhenReady(false);
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // com.my.target.w
    public void seekTo(long j) {
        try {
            this.b.seekTo(j);
        } catch (Throwable th) {
            ba.a("ExoVideoPlayer: Error - " + th.getMessage());
        }
    }

    @Override // com.my.target.w
    public void setVolume(float f) {
        try {
            this.b.setVolume(f);
        } catch (Throwable th) {
            ba.a("ExoVideoPlayer: Error - " + th.getMessage());
        }
        w.a aVar = this.d;
        if (aVar != null) {
            aVar.a(f);
        }
    }

    @Override // com.my.target.w
    public void stop() {
        try {
            this.b.stop();
            this.b.clearMediaItems();
        } catch (Throwable th) {
            a(th);
        }
    }
}
