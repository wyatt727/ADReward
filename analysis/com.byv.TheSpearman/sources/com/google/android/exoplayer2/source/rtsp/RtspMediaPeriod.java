package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import com.google.android.exoplayer2.source.rtsp.RtpDataLoadable;
import com.google.android.exoplayer2.source.rtsp.RtspClient;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.SocketFactory;

@Deprecated
/* loaded from: classes2.dex */
final class RtspMediaPeriod implements MediaPeriod {
    private static final int PORT_BINDING_MAX_RETRY_COUNT = 3;
    private final Allocator allocator;
    private MediaPeriod.Callback callback;
    private final Handler handler = Util.createHandlerForCurrentLooper();
    private final InternalListener internalListener;
    private boolean isUsingRtpTcp;
    private final Listener listener;
    private boolean loadingFinished;
    private boolean notifyDiscontinuity;
    private long pendingSeekPositionUs;
    private long pendingSeekPositionUsForTcpRetry;
    private RtspMediaSource.RtspPlaybackException playbackException;
    private int portBindingRetryCount;
    private IOException preparationError;
    private boolean prepared;
    private boolean released;
    private long requestedSeekPositionUs;
    private final RtpDataChannel.Factory rtpDataChannelFactory;
    private final RtspClient rtspClient;
    private final List<RtspLoaderWrapper> rtspLoaderWrappers;
    private final List<RtpLoadInfo> selectedLoadInfos;
    private ImmutableList<TrackGroup> trackGroups;
    private boolean trackSelected;

    interface Listener {

        /* renamed from: com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod$Listener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onSeekingUnsupported(Listener _this) {
            }
        }

        void onSeekingUnsupported();

        void onSourceInfoRefreshed(RtspSessionTiming rtspSessionTiming);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        return j;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return getStreamKeys((List<ExoTrackSelection>) list);
    }

    static /* synthetic */ int access$1108(RtspMediaPeriod rtspMediaPeriod) {
        int i = rtspMediaPeriod.portBindingRetryCount;
        rtspMediaPeriod.portBindingRetryCount = i + 1;
        return i;
    }

    public RtspMediaPeriod(Allocator allocator, RtpDataChannel.Factory factory, Uri uri, Listener listener, String str, SocketFactory socketFactory, boolean z) {
        this.allocator = allocator;
        this.rtpDataChannelFactory = factory;
        this.listener = listener;
        InternalListener internalListener = new InternalListener();
        this.internalListener = internalListener;
        this.rtspClient = new RtspClient(internalListener, internalListener, str, uri, socketFactory, z);
        this.rtspLoaderWrappers = new ArrayList();
        this.selectedLoadInfos = new ArrayList();
        this.pendingSeekPositionUs = -9223372036854775807L;
        this.requestedSeekPositionUs = -9223372036854775807L;
        this.pendingSeekPositionUsForTcpRetry = -9223372036854775807L;
    }

    public void release() {
        for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
            this.rtspLoaderWrappers.get(i).release();
        }
        Util.closeQuietly(this.rtspClient);
        this.released = true;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j) throws NumberFormatException, IOException {
        this.callback = callback;
        try {
            this.rtspClient.start();
        } catch (IOException e) {
            this.preparationError = e;
            Util.closeQuietly(this.rtspClient);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        IOException iOException = this.preparationError;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        Assertions.checkState(this.prepared);
        return new TrackGroupArray((TrackGroup[]) ((ImmutableList) Assertions.checkNotNull(this.trackGroups)).toArray(new TrackGroup[0]));
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public ImmutableList<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return ImmutableList.of();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) throws NumberFormatException {
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            if (sampleStreamArr[i] != null && (exoTrackSelectionArr[i] == null || !zArr[i])) {
                sampleStreamArr[i] = null;
            }
        }
        this.selectedLoadInfos.clear();
        for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
            if (exoTrackSelection != null) {
                TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                int iIndexOf = ((ImmutableList) Assertions.checkNotNull(this.trackGroups)).indexOf(trackGroup);
                this.selectedLoadInfos.add(((RtspLoaderWrapper) Assertions.checkNotNull(this.rtspLoaderWrappers.get(iIndexOf))).loadInfo);
                if (this.trackGroups.contains(trackGroup) && sampleStreamArr[i2] == null) {
                    sampleStreamArr[i2] = new SampleStreamImpl(iIndexOf);
                    zArr2[i2] = true;
                }
            }
        }
        for (int i3 = 0; i3 < this.rtspLoaderWrappers.size(); i3++) {
            RtspLoaderWrapper rtspLoaderWrapper = this.rtspLoaderWrappers.get(i3);
            if (!this.selectedLoadInfos.contains(rtspLoaderWrapper.loadInfo)) {
                rtspLoaderWrapper.cancelLoad();
            }
        }
        this.trackSelected = true;
        if (j != 0) {
            this.requestedSeekPositionUs = j;
            this.pendingSeekPositionUs = j;
            this.pendingSeekPositionUsForTcpRetry = j;
        }
        maybeSetupTracks();
        return j;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        if (isSeekPending()) {
            return;
        }
        for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
            RtspLoaderWrapper rtspLoaderWrapper = this.rtspLoaderWrappers.get(i);
            if (!rtspLoaderWrapper.canceled) {
                rtspLoaderWrapper.sampleQueue.discardTo(j, z, true);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        if (!this.notifyDiscontinuity) {
            return -9223372036854775807L;
        }
        this.notifyDiscontinuity = false;
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j) throws NumberFormatException {
        if (getBufferedPositionUs() == 0 && !this.isUsingRtpTcp) {
            this.pendingSeekPositionUsForTcpRetry = j;
            return j;
        }
        discardBuffer(j, false);
        this.requestedSeekPositionUs = j;
        if (isSeekPending()) {
            int state = this.rtspClient.getState();
            if (state == 1) {
                return j;
            }
            if (state == 2) {
                this.pendingSeekPositionUs = j;
                this.rtspClient.seekToUs(j);
                return j;
            }
            throw new IllegalStateException();
        }
        if (seekInsideBufferUs(j)) {
            return j;
        }
        this.pendingSeekPositionUs = j;
        if (this.loadingFinished) {
            for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
                this.rtspLoaderWrappers.get(i).resumeLoad();
            }
            if (this.isUsingRtpTcp) {
                this.rtspClient.startPlayback(Util.usToMs(j));
            } else {
                this.rtspClient.seekToUs(j);
            }
        } else {
            this.rtspClient.seekToUs(j);
        }
        for (int i2 = 0; i2 < this.rtspLoaderWrappers.size(); i2++) {
            this.rtspLoaderWrappers.get(i2).seekTo(j);
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.loadingFinished || this.rtspLoaderWrappers.isEmpty()) {
            return Long.MIN_VALUE;
        }
        long j = this.requestedSeekPositionUs;
        if (j != -9223372036854775807L) {
            return j;
        }
        long jMin = Long.MAX_VALUE;
        boolean z = true;
        for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
            RtspLoaderWrapper rtspLoaderWrapper = this.rtspLoaderWrappers.get(i);
            if (!rtspLoaderWrapper.canceled) {
                jMin = Math.min(jMin, rtspLoaderWrapper.getBufferedPositionUs());
                z = false;
            }
        }
        if (z || jMin == Long.MIN_VALUE) {
            return 0L;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j) {
        return isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return !this.loadingFinished;
    }

    boolean isReady(int i) {
        return !suppressRead() && this.rtspLoaderWrappers.get(i).isSampleQueueReady();
    }

    int readData(int i, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (suppressRead()) {
            return -3;
        }
        return this.rtspLoaderWrappers.get(i).read(formatHolder, decoderInputBuffer, i2);
    }

    int skipData(int i, long j) {
        if (suppressRead()) {
            return -3;
        }
        return this.rtspLoaderWrappers.get(i).skipData(j);
    }

    private boolean suppressRead() {
        return this.notifyDiscontinuity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RtpDataLoadable getLoadableByTrackUri(Uri uri) {
        for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
            if (!this.rtspLoaderWrappers.get(i).canceled) {
                RtpLoadInfo rtpLoadInfo = this.rtspLoaderWrappers.get(i).loadInfo;
                if (rtpLoadInfo.getTrackUri().equals(uri)) {
                    return rtpLoadInfo.loadable;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSeekPending() {
        return this.pendingSeekPositionUs != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (this.released || this.prepared) {
            return;
        }
        for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
            if (this.rtspLoaderWrappers.get(i).sampleQueue.getUpstreamFormat() == null) {
                return;
            }
        }
        this.prepared = true;
        this.trackGroups = buildTrackGroups(ImmutableList.copyOf((Collection) this.rtspLoaderWrappers));
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    private boolean seekInsideBufferUs(long j) {
        for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
            if (!this.rtspLoaderWrappers.get(i).sampleQueue.seekTo(j, false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeSetupTracks() throws NumberFormatException {
        boolean zIsTransportReady = true;
        for (int i = 0; i < this.selectedLoadInfos.size(); i++) {
            zIsTransportReady &= this.selectedLoadInfos.get(i).isTransportReady();
        }
        if (zIsTransportReady && this.trackSelected) {
            this.rtspClient.setupSelectedTracks(this.selectedLoadInfos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLoadingFinished() {
        this.loadingFinished = true;
        for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
            this.loadingFinished &= this.rtspLoaderWrappers.get(i).canceled;
        }
    }

    private static ImmutableList<TrackGroup> buildTrackGroups(ImmutableList<RtspLoaderWrapper> immutableList) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i = 0; i < immutableList.size(); i++) {
            builder.add((ImmutableList.Builder) new TrackGroup(Integer.toString(i), (Format) Assertions.checkNotNull(immutableList.get(i).sampleQueue.getUpstreamFormat())));
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class InternalListener implements ExtractorOutput, Loader.Callback<RtpDataLoadable>, SampleQueue.UpstreamFormatChangedListener, RtspClient.SessionInfoListener, RtspClient.PlaybackEventListener {
        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(RtpDataLoadable rtpDataLoadable, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
        }

        private InternalListener() {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public TrackOutput track(int i, int i2) {
            return ((RtspLoaderWrapper) Assertions.checkNotNull((RtspLoaderWrapper) RtspMediaPeriod.this.rtspLoaderWrappers.get(i))).sampleQueue;
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void endTracks() {
            Handler handler = RtspMediaPeriod.this.handler;
            final RtspMediaPeriod rtspMediaPeriod = RtspMediaPeriod.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod$InternalListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    rtspMediaPeriod.maybeFinishPrepare();
                }
            });
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(RtpDataLoadable rtpDataLoadable, long j, long j2) throws NumberFormatException {
            if (RtspMediaPeriod.this.getBufferedPositionUs() == 0) {
                if (RtspMediaPeriod.this.isUsingRtpTcp) {
                    return;
                }
                RtspMediaPeriod.this.retryWithRtpTcp();
                return;
            }
            int i = 0;
            while (true) {
                if (i >= RtspMediaPeriod.this.rtspLoaderWrappers.size()) {
                    break;
                }
                RtspLoaderWrapper rtspLoaderWrapper = (RtspLoaderWrapper) RtspMediaPeriod.this.rtspLoaderWrappers.get(i);
                if (rtspLoaderWrapper.loadInfo.loadable == rtpDataLoadable) {
                    rtspLoaderWrapper.cancelLoad();
                    break;
                }
                i++;
            }
            RtspMediaPeriod.this.rtspClient.signalPlaybackEnded();
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(RtpDataLoadable rtpDataLoadable, long j, long j2, IOException iOException, int i) {
            if (!RtspMediaPeriod.this.prepared) {
                RtspMediaPeriod.this.preparationError = iOException;
            } else if (iOException.getCause() instanceof BindException) {
                if (RtspMediaPeriod.access$1108(RtspMediaPeriod.this) < 3) {
                    return Loader.RETRY;
                }
            } else {
                RtspMediaPeriod.this.playbackException = new RtspMediaSource.RtspPlaybackException(rtpDataLoadable.rtspMediaTrack.uri.toString(), iOException);
            }
            return Loader.DONT_RETRY;
        }

        @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
        public void onUpstreamFormatChanged(Format format) {
            Handler handler = RtspMediaPeriod.this.handler;
            final RtspMediaPeriod rtspMediaPeriod = RtspMediaPeriod.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod$InternalListener$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    rtspMediaPeriod.maybeFinishPrepare();
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
        public void onRtspSetupCompleted() throws NumberFormatException {
            RtspMediaPeriod.this.rtspClient.startPlayback(RtspMediaPeriod.this.pendingSeekPositionUs != -9223372036854775807L ? Util.usToMs(RtspMediaPeriod.this.pendingSeekPositionUs) : RtspMediaPeriod.this.pendingSeekPositionUsForTcpRetry != -9223372036854775807L ? Util.usToMs(RtspMediaPeriod.this.pendingSeekPositionUsForTcpRetry) : 0L);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
        public void onPlaybackStarted(long j, ImmutableList<RtspTrackTiming> immutableList) throws NumberFormatException {
            ArrayList arrayList = new ArrayList(immutableList.size());
            for (int i = 0; i < immutableList.size(); i++) {
                arrayList.add((String) Assertions.checkNotNull(immutableList.get(i).uri.getPath()));
            }
            for (int i2 = 0; i2 < RtspMediaPeriod.this.selectedLoadInfos.size(); i2++) {
                if (!arrayList.contains(((RtpLoadInfo) RtspMediaPeriod.this.selectedLoadInfos.get(i2)).getTrackUri().getPath())) {
                    RtspMediaPeriod.this.listener.onSeekingUnsupported();
                    if (RtspMediaPeriod.this.isSeekPending()) {
                        RtspMediaPeriod.this.notifyDiscontinuity = true;
                        RtspMediaPeriod.this.pendingSeekPositionUs = -9223372036854775807L;
                        RtspMediaPeriod.this.requestedSeekPositionUs = -9223372036854775807L;
                        RtspMediaPeriod.this.pendingSeekPositionUsForTcpRetry = -9223372036854775807L;
                    }
                }
            }
            for (int i3 = 0; i3 < immutableList.size(); i3++) {
                RtspTrackTiming rtspTrackTiming = immutableList.get(i3);
                RtpDataLoadable loadableByTrackUri = RtspMediaPeriod.this.getLoadableByTrackUri(rtspTrackTiming.uri);
                if (loadableByTrackUri != null) {
                    loadableByTrackUri.setTimestamp(rtspTrackTiming.rtpTimestamp);
                    loadableByTrackUri.setSequenceNumber(rtspTrackTiming.sequenceNumber);
                    if (RtspMediaPeriod.this.isSeekPending() && RtspMediaPeriod.this.pendingSeekPositionUs == RtspMediaPeriod.this.requestedSeekPositionUs) {
                        loadableByTrackUri.seekToUs(j, rtspTrackTiming.rtpTimestamp);
                    }
                }
            }
            if (!RtspMediaPeriod.this.isSeekPending()) {
                if (RtspMediaPeriod.this.pendingSeekPositionUsForTcpRetry == -9223372036854775807L || !RtspMediaPeriod.this.isUsingRtpTcp) {
                    return;
                }
                RtspMediaPeriod rtspMediaPeriod = RtspMediaPeriod.this;
                rtspMediaPeriod.seekToUs(rtspMediaPeriod.pendingSeekPositionUsForTcpRetry);
                RtspMediaPeriod.this.pendingSeekPositionUsForTcpRetry = -9223372036854775807L;
                return;
            }
            if (RtspMediaPeriod.this.pendingSeekPositionUs == RtspMediaPeriod.this.requestedSeekPositionUs) {
                RtspMediaPeriod.this.pendingSeekPositionUs = -9223372036854775807L;
                RtspMediaPeriod.this.requestedSeekPositionUs = -9223372036854775807L;
            } else {
                RtspMediaPeriod.this.pendingSeekPositionUs = -9223372036854775807L;
                RtspMediaPeriod rtspMediaPeriod2 = RtspMediaPeriod.this;
                rtspMediaPeriod2.seekToUs(rtspMediaPeriod2.requestedSeekPositionUs);
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
        public void onPlaybackError(RtspMediaSource.RtspPlaybackException rtspPlaybackException) throws NumberFormatException {
            if (!(rtspPlaybackException instanceof RtspMediaSource.RtspUdpUnsupportedTransportException) || RtspMediaPeriod.this.isUsingRtpTcp) {
                RtspMediaPeriod.this.playbackException = rtspPlaybackException;
            } else {
                RtspMediaPeriod.this.retryWithRtpTcp();
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.SessionInfoListener
        public void onSessionTimelineUpdated(RtspSessionTiming rtspSessionTiming, ImmutableList<RtspMediaTrack> immutableList) {
            for (int i = 0; i < immutableList.size(); i++) {
                RtspMediaTrack rtspMediaTrack = immutableList.get(i);
                RtspMediaPeriod rtspMediaPeriod = RtspMediaPeriod.this;
                RtspLoaderWrapper rtspLoaderWrapper = rtspMediaPeriod.new RtspLoaderWrapper(rtspMediaTrack, i, rtspMediaPeriod.rtpDataChannelFactory);
                RtspMediaPeriod.this.rtspLoaderWrappers.add(rtspLoaderWrapper);
                rtspLoaderWrapper.startLoading();
            }
            RtspMediaPeriod.this.listener.onSourceInfoRefreshed(rtspSessionTiming);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.SessionInfoListener
        public void onSessionTimelineRequestFailed(String str, Throwable th) {
            RtspMediaPeriod.this.preparationError = th == null ? new IOException(str) : new IOException(str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void retryWithRtpTcp() throws NumberFormatException {
        this.isUsingRtpTcp = true;
        this.rtspClient.retryWithRtpTcp();
        RtpDataChannel.Factory factoryCreateFallbackDataChannelFactory = this.rtpDataChannelFactory.createFallbackDataChannelFactory();
        if (factoryCreateFallbackDataChannelFactory == null) {
            this.playbackException = new RtspMediaSource.RtspPlaybackException("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.rtspLoaderWrappers.size());
        ArrayList arrayList2 = new ArrayList(this.selectedLoadInfos.size());
        for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
            RtspLoaderWrapper rtspLoaderWrapper = this.rtspLoaderWrappers.get(i);
            if (!rtspLoaderWrapper.canceled) {
                RtspLoaderWrapper rtspLoaderWrapper2 = new RtspLoaderWrapper(rtspLoaderWrapper.loadInfo.mediaTrack, i, factoryCreateFallbackDataChannelFactory);
                arrayList.add(rtspLoaderWrapper2);
                rtspLoaderWrapper2.startLoading();
                if (this.selectedLoadInfos.contains(rtspLoaderWrapper.loadInfo)) {
                    arrayList2.add(rtspLoaderWrapper2.loadInfo);
                }
            } else {
                arrayList.add(rtspLoaderWrapper);
            }
        }
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.rtspLoaderWrappers);
        this.rtspLoaderWrappers.clear();
        this.rtspLoaderWrappers.addAll(arrayList);
        this.selectedLoadInfos.clear();
        this.selectedLoadInfos.addAll(arrayList2);
        for (int i2 = 0; i2 < immutableListCopyOf.size(); i2++) {
            ((RtspLoaderWrapper) immutableListCopyOf.get(i2)).cancelLoad();
        }
    }

    private final class SampleStreamImpl implements SampleStream {
        private final int track;

        public SampleStreamImpl(int i) {
            this.track = i;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return RtspMediaPeriod.this.isReady(this.track);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws RtspMediaSource.RtspPlaybackException {
            if (RtspMediaPeriod.this.playbackException != null) {
                throw RtspMediaPeriod.this.playbackException;
            }
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            return RtspMediaPeriod.this.readData(this.track, formatHolder, decoderInputBuffer, i);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j) {
            return RtspMediaPeriod.this.skipData(this.track, j);
        }
    }

    private final class RtspLoaderWrapper {
        private boolean canceled;
        public final RtpLoadInfo loadInfo;
        private final Loader loader;
        private boolean released;
        private final SampleQueue sampleQueue;

        public RtspLoaderWrapper(RtspMediaTrack rtspMediaTrack, int i, RtpDataChannel.Factory factory) {
            this.loadInfo = RtspMediaPeriod.this.new RtpLoadInfo(rtspMediaTrack, i, factory);
            this.loader = new Loader("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper " + i);
            SampleQueue sampleQueueCreateWithoutDrm = SampleQueue.createWithoutDrm(RtspMediaPeriod.this.allocator);
            this.sampleQueue = sampleQueueCreateWithoutDrm;
            sampleQueueCreateWithoutDrm.setUpstreamFormatChangeListener(RtspMediaPeriod.this.internalListener);
        }

        public long getBufferedPositionUs() {
            return this.sampleQueue.getLargestQueuedTimestampUs();
        }

        public void startLoading() {
            this.loader.startLoading(this.loadInfo.loadable, RtspMediaPeriod.this.internalListener, 0);
        }

        public boolean isSampleQueueReady() {
            return this.sampleQueue.isReady(this.canceled);
        }

        public int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            return this.sampleQueue.read(formatHolder, decoderInputBuffer, i, this.canceled);
        }

        public int skipData(long j) {
            int skipCount = this.sampleQueue.getSkipCount(j, this.canceled);
            this.sampleQueue.skip(skipCount);
            return skipCount;
        }

        public void cancelLoad() {
            if (this.canceled) {
                return;
            }
            this.loadInfo.loadable.cancelLoad();
            this.canceled = true;
            RtspMediaPeriod.this.updateLoadingFinished();
        }

        public void resumeLoad() {
            Assertions.checkState(this.canceled);
            this.canceled = false;
            RtspMediaPeriod.this.updateLoadingFinished();
            startLoading();
        }

        public void seekTo(long j) {
            if (this.canceled) {
                return;
            }
            this.loadInfo.loadable.resetForSeek();
            this.sampleQueue.reset();
            this.sampleQueue.setStartTimeUs(j);
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.loader.release();
            this.sampleQueue.release();
            this.released = true;
        }
    }

    final class RtpLoadInfo {
        private final RtpDataLoadable loadable;
        public final RtspMediaTrack mediaTrack;
        private String transport;

        public RtpLoadInfo(RtspMediaTrack rtspMediaTrack, int i, RtpDataChannel.Factory factory) {
            this.mediaTrack = rtspMediaTrack;
            this.loadable = new RtpDataLoadable(i, rtspMediaTrack, new RtpDataLoadable.EventListener() { // from class: com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod$RtpLoadInfo$$ExternalSyntheticLambda0
                @Override // com.google.android.exoplayer2.source.rtsp.RtpDataLoadable.EventListener
                public final void onTransportReady(String str, RtpDataChannel rtpDataChannel) throws NumberFormatException {
                    this.f$0.m419x3d57be61(str, rtpDataChannel);
                }
            }, RtspMediaPeriod.this.internalListener, factory);
        }

        /* renamed from: lambda$new$0$com-google-android-exoplayer2-source-rtsp-RtspMediaPeriod$RtpLoadInfo, reason: not valid java name */
        public /* synthetic */ void m419x3d57be61(String str, RtpDataChannel rtpDataChannel) throws NumberFormatException {
            this.transport = str;
            RtspMessageChannel.InterleavedBinaryDataListener interleavedBinaryDataListener = rtpDataChannel.getInterleavedBinaryDataListener();
            if (interleavedBinaryDataListener != null) {
                RtspMediaPeriod.this.rtspClient.registerInterleavedDataChannel(rtpDataChannel.getLocalPort(), interleavedBinaryDataListener);
                RtspMediaPeriod.this.isUsingRtpTcp = true;
            }
            RtspMediaPeriod.this.maybeSetupTracks();
        }

        public boolean isTransportReady() {
            return this.transport != null;
        }

        public String getTransport() {
            Assertions.checkStateNotNull(this.transport);
            return this.transport;
        }

        public Uri getTrackUri() {
            return this.loadable.rtspMediaTrack.uri;
        }
    }
}
