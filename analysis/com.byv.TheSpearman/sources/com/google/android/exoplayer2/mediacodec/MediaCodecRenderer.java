package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.audio.OggOpusAudioPacketizer;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.FrameworkCryptoConfig;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
    private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
    private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
    private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
    protected static final float CODEC_OPERATING_RATE_UNSET = -1.0f;
    private static final int DRAIN_ACTION_FLUSH = 1;
    private static final int DRAIN_ACTION_FLUSH_AND_UPDATE_DRM_SESSION = 2;
    private static final int DRAIN_ACTION_NONE = 0;
    private static final int DRAIN_ACTION_REINITIALIZE = 3;
    private static final int DRAIN_STATE_NONE = 0;
    private static final int DRAIN_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int DRAIN_STATE_WAIT_END_OF_STREAM = 2;
    private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000;
    private static final int RECONFIGURATION_STATE_NONE = 0;
    private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
    private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
    private static final String TAG = "MediaCodecRenderer";
    private final float assumedMinimumCodecOperatingRate;
    private ArrayDeque<MediaCodecInfo> availableCodecInfos;
    private final DecoderInputBuffer buffer;
    private final BatchBuffer bypassBatchBuffer;
    private boolean bypassDrainAndReinitialize;
    private boolean bypassEnabled;
    private final DecoderInputBuffer bypassSampleBuffer;
    private boolean bypassSampleBufferPending;
    private C2Mp3TimestampTracker c2Mp3TimestampTracker;
    private MediaCodecAdapter codec;
    private int codecAdaptationWorkaroundMode;
    private final MediaCodecAdapter.Factory codecAdapterFactory;
    private int codecDrainAction;
    private int codecDrainState;
    private DrmSession codecDrmSession;
    private boolean codecHasOutputMediaFormat;
    private long codecHotswapDeadlineMs;
    private MediaCodecInfo codecInfo;
    private Format codecInputFormat;
    private boolean codecNeedsAdaptationWorkaroundBuffer;
    private boolean codecNeedsDiscardToSpsWorkaround;
    private boolean codecNeedsEosBufferTimestampWorkaround;
    private boolean codecNeedsEosFlushWorkaround;
    private boolean codecNeedsEosOutputExceptionWorkaround;
    private boolean codecNeedsEosPropagation;
    private boolean codecNeedsFlushWorkaround;
    private boolean codecNeedsMonoChannelCountWorkaround;
    private boolean codecNeedsSosFlushWorkaround;
    private float codecOperatingRate;
    private MediaFormat codecOutputMediaFormat;
    private boolean codecOutputMediaFormatChanged;
    private boolean codecReceivedBuffers;
    private boolean codecReceivedEos;
    private int codecReconfigurationState;
    private boolean codecReconfigured;
    private float currentPlaybackSpeed;
    private final ArrayList<Long> decodeOnlyPresentationTimestamps;
    protected DecoderCounters decoderCounters;
    private final boolean enableDecoderFallback;
    private Format inputFormat;
    private int inputIndex;
    private boolean inputStreamEnded;
    private boolean isDecodeOnlyOutputBuffer;
    private boolean isLastOutputBuffer;
    private long largestQueuedPresentationTimeUs;
    private long lastBufferInStreamPresentationTimeUs;
    private long lastProcessedOutputBufferTimeUs;
    private final MediaCodecSelector mediaCodecSelector;
    private MediaCrypto mediaCrypto;
    private boolean mediaCryptoRequiresSecureDecoder;
    private boolean needToNotifyOutputFormatChangeAfterStreamChange;
    private final DecoderInputBuffer noDataBuffer;
    private final OggOpusAudioPacketizer oggOpusAudioPacketizer;
    private ByteBuffer outputBuffer;
    private final MediaCodec.BufferInfo outputBufferInfo;
    private Format outputFormat;
    private int outputIndex;
    private boolean outputStreamEnded;
    private OutputStreamInfo outputStreamInfo;
    private boolean pendingOutputEndOfStream;
    private final ArrayDeque<OutputStreamInfo> pendingOutputStreamChanges;
    private ExoPlaybackException pendingPlaybackException;
    private DecoderInitializationException preferredDecoderInitializationException;
    private long renderTimeLimitMs;
    private boolean shouldSkipAdaptationWorkaroundOutputBuffer;
    private DrmSession sourceDrmSession;
    private float targetPlaybackSpeed;
    private boolean waitingForFirstSampleInFormat;

    protected boolean getCodecNeedsEosPropagation() {
        return false;
    }

    protected float getCodecOperatingRateV23(float f, Format format, Format[] formatArr) {
        return -1.0f;
    }

    protected abstract List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException;

    protected abstract MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto, float f);

    protected void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    protected void onCodecError(Exception exc) {
    }

    protected void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j, long j2) {
    }

    protected void onCodecReleased(String str) {
    }

    protected void onOutputFormatChanged(Format format, MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    protected void onOutputStreamOffsetUsChanged(long j) {
    }

    protected void onProcessedStreamChange() {
    }

    protected void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    protected void onReadyToInitializeCodec(Format format) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onStarted() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onStopped() {
    }

    protected abstract boolean processOutputBuffer(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException;

    protected void renderToEndOfStream() throws ExoPlaybackException {
    }

    protected boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    protected boolean shouldReinitCodec() {
        return false;
    }

    protected boolean shouldUseBypass(Format format) {
        return false;
    }

    protected abstract int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException;

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public static class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;
        public final MediaCodecInfo codecInfo;
        public final String diagnosticInfo;
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + format, th, format.sampleMimeType, z, null, buildCustomDiagnosticInfo(i), null);
        }

        public DecoderInitializationException(Format format, Throwable th, boolean z, MediaCodecInfo mediaCodecInfo) {
            this("Decoder init failed: " + mediaCodecInfo.name + ", " + format, th, format.sampleMimeType, z, mediaCodecInfo, Util.SDK_INT >= 21 ? getDiagnosticInfoV21(th) : null, null);
        }

        private DecoderInitializationException(String str, Throwable th, String str2, boolean z, MediaCodecInfo mediaCodecInfo, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = mediaCodecInfo;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DecoderInitializationException copyWithFallbackException(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        private static String getDiagnosticInfoV21(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        private static String buildCustomDiagnosticInfo(int i) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }
    }

    public MediaCodecRenderer(int i, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z, float f) {
        super(i);
        this.codecAdapterFactory = factory;
        this.mediaCodecSelector = (MediaCodecSelector) Assertions.checkNotNull(mediaCodecSelector);
        this.enableDecoderFallback = z;
        this.assumedMinimumCodecOperatingRate = f;
        this.noDataBuffer = DecoderInputBuffer.newNoDataInstance();
        this.buffer = new DecoderInputBuffer(0);
        this.bypassSampleBuffer = new DecoderInputBuffer(2);
        BatchBuffer batchBuffer = new BatchBuffer();
        this.bypassBatchBuffer = batchBuffer;
        this.decodeOnlyPresentationTimestamps = new ArrayList<>();
        this.outputBufferInfo = new MediaCodec.BufferInfo();
        this.currentPlaybackSpeed = 1.0f;
        this.targetPlaybackSpeed = 1.0f;
        this.renderTimeLimitMs = -9223372036854775807L;
        this.pendingOutputStreamChanges = new ArrayDeque<>();
        setOutputStreamInfo(OutputStreamInfo.UNSET);
        batchBuffer.ensureSpaceForWrite(0);
        batchBuffer.data.order(ByteOrder.nativeOrder());
        this.oggOpusAudioPacketizer = new OggOpusAudioPacketizer();
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecReconfigurationState = 0;
        this.inputIndex = -1;
        this.outputIndex = -1;
        this.codecHotswapDeadlineMs = -9223372036854775807L;
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        this.lastBufferInStreamPresentationTimeUs = -9223372036854775807L;
        this.lastProcessedOutputBufferTimeUs = -9223372036854775807L;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
    }

    public void setRenderTimeLimitMs(long j) {
        this.renderTimeLimitMs = j;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int supportsFormat(Format format) throws ExoPlaybackException {
        try {
            return supportsFormat(this.mediaCodecSelector, format);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw createRendererException(e, format, 4002);
        }
    }

    protected final void maybeInitCodecOrBypass() throws Exception {
        Format format;
        if (this.codec != null || this.bypassEnabled || (format = this.inputFormat) == null) {
            return;
        }
        if (isBypassPossible(format)) {
            initBypass(this.inputFormat);
            return;
        }
        setCodecDrmSession(this.sourceDrmSession);
        String str = this.inputFormat.sampleMimeType;
        DrmSession drmSession = this.codecDrmSession;
        if (drmSession != null) {
            CryptoConfig cryptoConfig = drmSession.getCryptoConfig();
            if (this.mediaCrypto == null) {
                if (cryptoConfig == null) {
                    if (this.codecDrmSession.getError() == null) {
                        return;
                    }
                } else if (cryptoConfig instanceof FrameworkCryptoConfig) {
                    FrameworkCryptoConfig frameworkCryptoConfig = (FrameworkCryptoConfig) cryptoConfig;
                    try {
                        this.mediaCrypto = new MediaCrypto(frameworkCryptoConfig.uuid, frameworkCryptoConfig.sessionId);
                        this.mediaCryptoRequiresSecureDecoder = !frameworkCryptoConfig.forceAllowInsecureDecoderComponents && this.mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e) {
                        throw createRendererException(e, this.inputFormat, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
                    }
                }
            }
            if (FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC && (cryptoConfig instanceof FrameworkCryptoConfig)) {
                int state = this.codecDrmSession.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) Assertions.checkNotNull(this.codecDrmSession.getError());
                    throw createRendererException(drmSessionException, this.inputFormat, drmSessionException.errorCode);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            maybeInitCodecWithFallback(this.mediaCrypto, this.mediaCryptoRequiresSecureDecoder);
        } catch (DecoderInitializationException e2) {
            throw createRendererException(e2, this.inputFormat, 4001);
        }
    }

    protected final boolean isBypassPossible(Format format) {
        return this.sourceDrmSession == null && shouldUseBypass(format);
    }

    protected final void setPendingPlaybackException(ExoPlaybackException exoPlaybackException) {
        this.pendingPlaybackException = exoPlaybackException;
    }

    protected final void updateOutputFormatForTime(long j) throws ExoPlaybackException {
        boolean z;
        Format formatPollFloor = this.outputStreamInfo.formatQueue.pollFloor(j);
        if (formatPollFloor == null && this.needToNotifyOutputFormatChangeAfterStreamChange && this.codecOutputMediaFormat != null) {
            formatPollFloor = this.outputStreamInfo.formatQueue.pollFirst();
        }
        if (formatPollFloor != null) {
            this.outputFormat = formatPollFloor;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.codecOutputMediaFormatChanged && this.outputFormat != null)) {
            onOutputFormatChanged(this.outputFormat, this.codecOutputMediaFormat);
            this.codecOutputMediaFormatChanged = false;
            this.needToNotifyOutputFormatChangeAfterStreamChange = false;
        }
    }

    protected final MediaCodecAdapter getCodec() {
        return this.codec;
    }

    protected final MediaFormat getCodecOutputMediaFormat() {
        return this.codecOutputMediaFormat;
    }

    protected final MediaCodecInfo getCodecInfo() {
        return this.codecInfo;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) throws ExoPlaybackException {
        this.decoderCounters = new DecoderCounters();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r5 >= r1) goto L13;
     */
    @Override // com.google.android.exoplayer2.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onStreamChanged(com.google.android.exoplayer2.Format[] r13, long r14, long r16) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r12 = this;
            r0 = r12
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r1 = r0.outputStreamInfo
            long r1 = r1.streamOffsetUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.setOutputStreamInfo(r1)
            goto L65
        L20:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo> r1 = r0.pendingOutputStreamChanges
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.largestQueuedPresentationTimeUs
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.lastProcessedOutputBufferTimeUs
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.setOutputStreamInfo(r1)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r1 = r0.outputStreamInfo
            long r1 = r1.streamOffsetUs
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L65
            r12.onProcessedStreamChange()
            goto L65
        L55:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo> r1 = r0.pendingOutputStreamChanges
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r9 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo
            long r3 = r0.largestQueuedPresentationTimeUs
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.onStreamChanged(com.google.android.exoplayer2.Format[], long, long):void");
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onPositionReset(long j, boolean z) throws Exception {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.pendingOutputEndOfStream = false;
        if (this.bypassEnabled) {
            this.bypassBatchBuffer.clear();
            this.bypassSampleBuffer.clear();
            this.bypassSampleBufferPending = false;
            this.oggOpusAudioPacketizer.reset();
        } else {
            flushOrReinitializeCodec();
        }
        if (this.outputStreamInfo.formatQueue.size() > 0) {
            this.waitingForFirstSampleInFormat = true;
        }
        this.outputStreamInfo.formatQueue.clear();
        this.pendingOutputStreamChanges.clear();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public void setPlaybackSpeed(float f, float f2) throws Exception {
        this.currentPlaybackSpeed = f;
        this.targetPlaybackSpeed = f2;
        updateCodecOperatingRate(this.codecInputFormat);
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onDisabled() throws MediaCryptoException {
        this.inputFormat = null;
        setOutputStreamInfo(OutputStreamInfo.UNSET);
        this.pendingOutputStreamChanges.clear();
        flushOrReleaseCodec();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onReset() {
        try {
            disableBypass();
            releaseCodec();
        } finally {
            setSourceDrmSession(null);
        }
    }

    private void disableBypass() {
        this.bypassDrainAndReinitialize = false;
        this.bypassBatchBuffer.clear();
        this.bypassSampleBuffer.clear();
        this.bypassSampleBufferPending = false;
        this.bypassEnabled = false;
        this.oggOpusAudioPacketizer.reset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void releaseCodec() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.release();
                this.decoderCounters.decoderReleaseCount++;
                onCodecReleased(this.codecInfo.name);
            }
            this.codec = null;
            try {
                MediaCrypto mediaCrypto = this.mediaCrypto;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.codec = null;
            try {
                MediaCrypto mediaCrypto2 = this.mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long j, long j2) throws Exception {
        boolean z = false;
        if (this.pendingOutputEndOfStream) {
            this.pendingOutputEndOfStream = false;
            processEndOfStream();
        }
        ExoPlaybackException exoPlaybackException = this.pendingPlaybackException;
        if (exoPlaybackException != null) {
            this.pendingPlaybackException = null;
            throw exoPlaybackException;
        }
        try {
            if (this.outputStreamEnded) {
                renderToEndOfStream();
                return;
            }
            if (this.inputFormat != null || readSourceOmittingSampleData(2)) {
                maybeInitCodecOrBypass();
                if (this.bypassEnabled) {
                    TraceUtil.beginSection("bypassRender");
                    while (bypassRender(j, j2)) {
                    }
                    TraceUtil.endSection();
                } else if (this.codec != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    TraceUtil.beginSection("drainAndFeed");
                    while (drainOutputBuffer(j, j2) && shouldContinueRendering(jElapsedRealtime)) {
                    }
                    while (feedInputBuffer() && shouldContinueRendering(jElapsedRealtime)) {
                    }
                    TraceUtil.endSection();
                } else {
                    this.decoderCounters.skippedInputBufferCount += skipSource(j);
                    readSourceOmittingSampleData(1);
                }
                this.decoderCounters.ensureUpdated();
            }
        } catch (IllegalStateException e) {
            if (isMediaCodecException(e)) {
                onCodecError(e);
                if (Util.SDK_INT >= 21 && isRecoverableMediaCodecExceptionV21(e)) {
                    z = true;
                }
                if (z) {
                    releaseCodec();
                }
                throw createRendererException(createDecoderException(e, getCodecInfo()), this.inputFormat, z, 4003);
            }
            throw e;
        }
    }

    protected final boolean flushOrReinitializeCodec() throws Exception {
        boolean zFlushOrReleaseCodec = flushOrReleaseCodec();
        if (zFlushOrReleaseCodec) {
            maybeInitCodecOrBypass();
        }
        return zFlushOrReleaseCodec;
    }

    protected boolean flushOrReleaseCodec() throws MediaCryptoException {
        if (this.codec == null) {
            return false;
        }
        int i = this.codecDrainAction;
        if (i == 3 || this.codecNeedsFlushWorkaround || ((this.codecNeedsSosFlushWorkaround && !this.codecHasOutputMediaFormat) || (this.codecNeedsEosFlushWorkaround && this.codecReceivedEos))) {
            releaseCodec();
            return true;
        }
        if (i == 2) {
            Assertions.checkState(Util.SDK_INT >= 23);
            if (Util.SDK_INT >= 23) {
                try {
                    updateDrmSessionV23();
                } catch (ExoPlaybackException e) {
                    Log.w(TAG, "Failed to update the DRM session, releasing the codec instead.", e);
                    releaseCodec();
                    return true;
                }
            }
        }
        flushCodec();
        return false;
    }

    private void flushCodec() {
        try {
            this.codec.flush();
        } finally {
            resetCodecStateForFlush();
        }
    }

    protected void resetCodecStateForFlush() {
        resetInputBuffer();
        resetOutputBuffer();
        this.codecHotswapDeadlineMs = -9223372036854775807L;
        this.codecReceivedEos = false;
        this.codecReceivedBuffers = false;
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        this.isDecodeOnlyOutputBuffer = false;
        this.isLastOutputBuffer = false;
        this.decodeOnlyPresentationTimestamps.clear();
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        this.lastBufferInStreamPresentationTimeUs = -9223372036854775807L;
        this.lastProcessedOutputBufferTimeUs = -9223372036854775807L;
        C2Mp3TimestampTracker c2Mp3TimestampTracker = this.c2Mp3TimestampTracker;
        if (c2Mp3TimestampTracker != null) {
            c2Mp3TimestampTracker.reset();
        }
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.codecReconfigurationState = this.codecReconfigured ? 1 : 0;
    }

    protected void resetCodecStateForRelease() {
        resetCodecStateForFlush();
        this.pendingPlaybackException = null;
        this.c2Mp3TimestampTracker = null;
        this.availableCodecInfos = null;
        this.codecInfo = null;
        this.codecInputFormat = null;
        this.codecOutputMediaFormat = null;
        this.codecOutputMediaFormatChanged = false;
        this.codecHasOutputMediaFormat = false;
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecNeedsDiscardToSpsWorkaround = false;
        this.codecNeedsFlushWorkaround = false;
        this.codecNeedsSosFlushWorkaround = false;
        this.codecNeedsEosFlushWorkaround = false;
        this.codecNeedsEosOutputExceptionWorkaround = false;
        this.codecNeedsEosBufferTimestampWorkaround = false;
        this.codecNeedsMonoChannelCountWorkaround = false;
        this.codecNeedsEosPropagation = false;
        this.codecReconfigured = false;
        this.codecReconfigurationState = 0;
        this.mediaCryptoRequiresSecureDecoder = false;
    }

    protected MediaCodecDecoderException createDecoderException(Throwable th, MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecDecoderException(th, mediaCodecInfo);
    }

    private boolean readSourceOmittingSampleData(int i) throws Exception {
        FormatHolder formatHolder = getFormatHolder();
        this.noDataBuffer.clear();
        int source = readSource(formatHolder, this.noDataBuffer, i | 4);
        if (source == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (source != -4 || !this.noDataBuffer.isEndOfStream()) {
            return false;
        }
        this.inputStreamEnded = true;
        processEndOfStream();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void maybeInitCodecWithFallback(android.media.MediaCrypto r8, boolean r9) throws java.lang.Exception {
        /*
            r7 = this;
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r0 = r7.availableCodecInfos
            r1 = 0
            if (r0 != 0) goto L39
            java.util.List r0 = r7.getAvailableCodecInfos(r9)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            r2.<init>()     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            r7.availableCodecInfos = r2     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            boolean r3 = r7.enableDecoderFallback     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            if (r3 == 0) goto L18
            r2.addAll(r0)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            goto L2a
        L18:
            boolean r2 = r0.isEmpty()     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            if (r2 != 0) goto L2a
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r2 = r7.availableCodecInfos     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r0     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            r2.add(r0)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
        L2a:
            r7.preferredDecoderInitializationException = r1     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            goto L39
        L2d:
            r8 = move-exception
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r0 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.Format r1 = r7.inputFormat
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r1, r8, r9, r2)
            throw r0
        L39:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r0 = r7.availableCodecInfos
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb4
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r0 = r7.availableCodecInfos
            java.lang.Object r0 = r0.peekFirst()
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r0
        L49:
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r2 = r7.codec
            if (r2 != 0) goto Lb1
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r2 = r7.availableCodecInfos
            java.lang.Object r2 = r2.peekFirst()
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r2 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r2
            boolean r3 = r7.shouldInitCodec(r2)
            if (r3 != 0) goto L5c
            return
        L5c:
            r7.initCodec(r2, r8)     // Catch: java.lang.Exception -> L60
            goto L49
        L60:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L73
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            com.google.android.exoplayer2.util.Log.w(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.initCodec(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L49
        L73:
            throw r3     // Catch: java.lang.Exception -> L74
        L74:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.google.android.exoplayer2.util.Log.w(r4, r5, r3)
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r4 = r7.availableCodecInfos
            r4.removeFirst()
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r4 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.Format r5 = r7.inputFormat
            r4.<init>(r5, r3, r9, r2)
            r7.onCodecError(r4)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = r7.preferredDecoderInitializationException
            if (r2 != 0) goto L9f
            r7.preferredDecoderInitializationException = r4
            goto La5
        L9f:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.access$000(r2, r4)
            r7.preferredDecoderInitializationException = r2
        La5:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r2 = r7.availableCodecInfos
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lae
            goto L49
        Lae:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r8 = r7.preferredDecoderInitializationException
            throw r8
        Lb1:
            r7.availableCodecInfos = r1
            return
        Lb4:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r8 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.Format r0 = r7.inputFormat
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r0, r1, r9, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.maybeInitCodecWithFallback(android.media.MediaCrypto, boolean):void");
    }

    private List<MediaCodecInfo> getAvailableCodecInfos(boolean z) throws MediaCodecUtil.DecoderQueryException {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(this.mediaCodecSelector, this.inputFormat, z);
        if (decoderInfos.isEmpty() && z) {
            decoderInfos = getDecoderInfos(this.mediaCodecSelector, this.inputFormat, false);
            if (!decoderInfos.isEmpty()) {
                Log.w(TAG, "Drm session requires secure decoder for " + this.inputFormat.sampleMimeType + ", but no secure decoder available. Trying to proceed with " + decoderInfos + ".");
            }
        }
        return decoderInfos;
    }

    private void initBypass(Format format) {
        disableBypass();
        String str = format.sampleMimeType;
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            this.bypassBatchBuffer.setMaxSampleCount(1);
        } else {
            this.bypassBatchBuffer.setMaxSampleCount(32);
        }
        this.bypassEnabled = true;
    }

    private void initCodec(MediaCodecInfo mediaCodecInfo, MediaCrypto mediaCrypto) throws Exception {
        String str = mediaCodecInfo.name;
        float codecOperatingRateV23 = Util.SDK_INT < 23 ? -1.0f : getCodecOperatingRateV23(this.targetPlaybackSpeed, this.inputFormat, getStreamFormats());
        float f = codecOperatingRateV23 > this.assumedMinimumCodecOperatingRate ? codecOperatingRateV23 : -1.0f;
        onReadyToInitializeCodec(this.inputFormat);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodecAdapter.Configuration mediaCodecConfiguration = getMediaCodecConfiguration(mediaCodecInfo, this.inputFormat, mediaCrypto, f);
        if (Util.SDK_INT >= 31) {
            Api31.setLogSessionIdToMediaCodecFormat(mediaCodecConfiguration, getPlayerId());
        }
        try {
            TraceUtil.beginSection("createCodec:" + str);
            this.codec = this.codecAdapterFactory.createAdapter(mediaCodecConfiguration);
            TraceUtil.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!mediaCodecInfo.isFormatSupported(this.inputFormat)) {
                Log.w(TAG, Util.formatInvariant("Format exceeds selected codec's capabilities [%s, %s]", Format.toLogString(this.inputFormat), str));
            }
            this.codecInfo = mediaCodecInfo;
            this.codecOperatingRate = f;
            this.codecInputFormat = this.inputFormat;
            this.codecAdaptationWorkaroundMode = codecAdaptationWorkaroundMode(str);
            this.codecNeedsDiscardToSpsWorkaround = codecNeedsDiscardToSpsWorkaround(str, this.codecInputFormat);
            this.codecNeedsFlushWorkaround = codecNeedsFlushWorkaround(str);
            this.codecNeedsSosFlushWorkaround = codecNeedsSosFlushWorkaround(str);
            this.codecNeedsEosFlushWorkaround = codecNeedsEosFlushWorkaround(str);
            this.codecNeedsEosOutputExceptionWorkaround = codecNeedsEosOutputExceptionWorkaround(str);
            this.codecNeedsEosBufferTimestampWorkaround = codecNeedsEosBufferTimestampWorkaround(str);
            this.codecNeedsMonoChannelCountWorkaround = codecNeedsMonoChannelCountWorkaround(str, this.codecInputFormat);
            this.codecNeedsEosPropagation = codecNeedsEosPropagationWorkaround(mediaCodecInfo) || getCodecNeedsEosPropagation();
            if (this.codec.needsReconfiguration()) {
                this.codecReconfigured = true;
                this.codecReconfigurationState = 1;
                this.codecNeedsAdaptationWorkaroundBuffer = this.codecAdaptationWorkaroundMode != 0;
            }
            if ("c2.android.mp3.decoder".equals(mediaCodecInfo.name)) {
                this.c2Mp3TimestampTracker = new C2Mp3TimestampTracker();
            }
            if (getState() == 2) {
                this.codecHotswapDeadlineMs = SystemClock.elapsedRealtime() + 1000;
            }
            this.decoderCounters.decoderInitCount++;
            onCodecInitialized(str, mediaCodecConfiguration, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            TraceUtil.endSection();
            throw th;
        }
    }

    private boolean shouldContinueRendering(long j) {
        return this.renderTimeLimitMs == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.renderTimeLimitMs;
    }

    private boolean hasOutputBuffer() {
        return this.outputIndex >= 0;
    }

    private void resetInputBuffer() {
        this.inputIndex = -1;
        this.buffer.data = null;
    }

    private void resetOutputBuffer() {
        this.outputIndex = -1;
        this.outputBuffer = null;
    }

    private void setSourceDrmSession(DrmSession drmSession) {
        DrmSession.CC.replaceSession(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private void setCodecDrmSession(DrmSession drmSession) {
        DrmSession.CC.replaceSession(this.codecDrmSession, drmSession);
        this.codecDrmSession = drmSession;
    }

    private boolean feedInputBuffer() throws Exception {
        int i;
        if (this.codec == null || (i = this.codecDrainState) == 2 || this.inputStreamEnded) {
            return false;
        }
        if (i == 0 && shouldReinitCodec()) {
            drainAndReinitializeCodec();
        }
        if (this.inputIndex < 0) {
            int iDequeueInputBufferIndex = this.codec.dequeueInputBufferIndex();
            this.inputIndex = iDequeueInputBufferIndex;
            if (iDequeueInputBufferIndex < 0) {
                return false;
            }
            this.buffer.data = this.codec.getInputBuffer(iDequeueInputBufferIndex);
            this.buffer.clear();
        }
        if (this.codecDrainState == 1) {
            if (!this.codecNeedsEosPropagation) {
                this.codecReceivedEos = true;
                this.codec.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                resetInputBuffer();
            }
            this.codecDrainState = 2;
            return false;
        }
        if (this.codecNeedsAdaptationWorkaroundBuffer) {
            this.codecNeedsAdaptationWorkaroundBuffer = false;
            ByteBuffer byteBuffer = this.buffer.data;
            byte[] bArr = ADAPTATION_WORKAROUND_BUFFER;
            byteBuffer.put(bArr);
            this.codec.queueInputBuffer(this.inputIndex, 0, bArr.length, 0L, 0);
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            return true;
        }
        if (this.codecReconfigurationState == 1) {
            for (int i2 = 0; i2 < this.codecInputFormat.initializationData.size(); i2++) {
                this.buffer.data.put(this.codecInputFormat.initializationData.get(i2));
            }
            this.codecReconfigurationState = 2;
        }
        int iPosition = this.buffer.data.position();
        FormatHolder formatHolder = getFormatHolder();
        try {
            int source = readSource(formatHolder, this.buffer, 0);
            if (hasReadStreamToEnd() || this.buffer.isLastSample()) {
                this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
            }
            if (source == -3) {
                return false;
            }
            if (source == -5) {
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                onInputFormatChanged(formatHolder);
                return true;
            }
            if (this.buffer.isEndOfStream()) {
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                this.inputStreamEnded = true;
                if (!this.codecReceivedBuffers) {
                    processEndOfStream();
                    return false;
                }
                try {
                    if (!this.codecNeedsEosPropagation) {
                        this.codecReceivedEos = true;
                        this.codec.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                        resetInputBuffer();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw createRendererException(e, this.inputFormat, Util.getErrorCodeForMediaDrmErrorCode(e.getErrorCode()));
                }
            }
            if (!this.codecReceivedBuffers && !this.buffer.isKeyFrame()) {
                this.buffer.clear();
                if (this.codecReconfigurationState == 2) {
                    this.codecReconfigurationState = 1;
                }
                return true;
            }
            boolean zIsEncrypted = this.buffer.isEncrypted();
            if (zIsEncrypted) {
                this.buffer.cryptoInfo.increaseClearDataFirstSubSampleBy(iPosition);
            }
            if (this.codecNeedsDiscardToSpsWorkaround && !zIsEncrypted) {
                NalUnitUtil.discardToSps(this.buffer.data);
                if (this.buffer.data.position() == 0) {
                    return true;
                }
                this.codecNeedsDiscardToSpsWorkaround = false;
            }
            long jUpdateAndGetPresentationTimeUs = this.buffer.timeUs;
            C2Mp3TimestampTracker c2Mp3TimestampTracker = this.c2Mp3TimestampTracker;
            if (c2Mp3TimestampTracker != null) {
                jUpdateAndGetPresentationTimeUs = c2Mp3TimestampTracker.updateAndGetPresentationTimeUs(this.inputFormat, this.buffer);
                this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, this.c2Mp3TimestampTracker.getLastOutputBufferPresentationTimeUs(this.inputFormat));
            }
            long j = jUpdateAndGetPresentationTimeUs;
            if (this.buffer.isDecodeOnly()) {
                this.decodeOnlyPresentationTimestamps.add(Long.valueOf(j));
            }
            if (this.waitingForFirstSampleInFormat) {
                if (!this.pendingOutputStreamChanges.isEmpty()) {
                    this.pendingOutputStreamChanges.peekLast().formatQueue.add(j, this.inputFormat);
                } else {
                    this.outputStreamInfo.formatQueue.add(j, this.inputFormat);
                }
                this.waitingForFirstSampleInFormat = false;
            }
            this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, j);
            this.buffer.flip();
            if (this.buffer.hasSupplementalData()) {
                handleInputBufferSupplementalData(this.buffer);
            }
            onQueueInputBuffer(this.buffer);
            try {
                if (zIsEncrypted) {
                    this.codec.queueSecureInputBuffer(this.inputIndex, 0, this.buffer.cryptoInfo, j, 0);
                } else {
                    this.codec.queueInputBuffer(this.inputIndex, 0, this.buffer.data.limit(), j, 0);
                }
                resetInputBuffer();
                this.codecReceivedBuffers = true;
                this.codecReconfigurationState = 0;
                this.decoderCounters.queuedInputBufferCount++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw createRendererException(e2, this.inputFormat, Util.getErrorCodeForMediaDrmErrorCode(e2.getErrorCode()));
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e3) {
            onCodecError(e3);
            readSourceOmittingSampleData(0);
            flushCodec();
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.google.android.exoplayer2.decoder.DecoderReuseEvaluation onInputFormatChanged(com.google.android.exoplayer2.FormatHolder r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.onInputFormatChanged(com.google.android.exoplayer2.FormatHolder):com.google.android.exoplayer2.decoder.DecoderReuseEvaluation");
    }

    protected void onProcessedOutputBuffer(long j) {
        this.lastProcessedOutputBufferTimeUs = j;
        while (!this.pendingOutputStreamChanges.isEmpty() && j >= this.pendingOutputStreamChanges.peek().previousStreamLastBufferTimeUs) {
            setOutputStreamInfo(this.pendingOutputStreamChanges.poll());
            onProcessedStreamChange();
        }
    }

    protected DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, 0, 1);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return this.inputFormat != null && (isSourceReady() || hasOutputBuffer() || (this.codecHotswapDeadlineMs != -9223372036854775807L && SystemClock.elapsedRealtime() < this.codecHotswapDeadlineMs));
    }

    protected float getPlaybackSpeed() {
        return this.currentPlaybackSpeed;
    }

    protected float getCodecOperatingRate() {
        return this.codecOperatingRate;
    }

    protected final boolean updateCodecOperatingRate() throws ExoPlaybackException {
        return updateCodecOperatingRate(this.codecInputFormat);
    }

    private boolean updateCodecOperatingRate(Format format) throws Exception {
        if (Util.SDK_INT >= 23 && this.codec != null && this.codecDrainAction != 3 && getState() != 0) {
            float codecOperatingRateV23 = getCodecOperatingRateV23(this.targetPlaybackSpeed, format, getStreamFormats());
            float f = this.codecOperatingRate;
            if (f == codecOperatingRateV23) {
                return true;
            }
            if (codecOperatingRateV23 == -1.0f) {
                drainAndReinitializeCodec();
                return false;
            }
            if (f == -1.0f && codecOperatingRateV23 <= this.assumedMinimumCodecOperatingRate) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", codecOperatingRateV23);
            this.codec.setParameters(bundle);
            this.codecOperatingRate = codecOperatingRateV23;
        }
        return true;
    }

    private boolean drainAndFlushCodec() {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsFlushWorkaround || this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 1;
        }
        return true;
    }

    private boolean drainAndUpdateCodecDrmSessionV23() throws ExoPlaybackException, MediaCryptoException {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsFlushWorkaround || this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 2;
        } else {
            updateDrmSessionV23();
        }
        return true;
    }

    private void drainAndReinitializeCodec() throws Exception {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            this.codecDrainAction = 3;
        } else {
            reinitializeCodec();
        }
    }

    private boolean drainOutputBuffer(long j, long j2) throws Exception {
        boolean z;
        boolean zProcessOutputBuffer;
        int iDequeueOutputBufferIndex;
        if (!hasOutputBuffer()) {
            if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
                try {
                    iDequeueOutputBufferIndex = this.codec.dequeueOutputBufferIndex(this.outputBufferInfo);
                } catch (IllegalStateException unused) {
                    processEndOfStream();
                    if (this.outputStreamEnded) {
                        releaseCodec();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBufferIndex = this.codec.dequeueOutputBufferIndex(this.outputBufferInfo);
            }
            if (iDequeueOutputBufferIndex < 0) {
                if (iDequeueOutputBufferIndex == -2) {
                    processOutputMediaFormatChanged();
                    return true;
                }
                if (this.codecNeedsEosPropagation && (this.inputStreamEnded || this.codecDrainState == 2)) {
                    processEndOfStream();
                }
                return false;
            }
            if (this.shouldSkipAdaptationWorkaroundOutputBuffer) {
                this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
                this.codec.releaseOutputBuffer(iDequeueOutputBufferIndex, false);
                return true;
            }
            if (this.outputBufferInfo.size == 0 && (this.outputBufferInfo.flags & 4) != 0) {
                processEndOfStream();
                return false;
            }
            this.outputIndex = iDequeueOutputBufferIndex;
            ByteBuffer outputBuffer = this.codec.getOutputBuffer(iDequeueOutputBufferIndex);
            this.outputBuffer = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.outputBufferInfo.offset);
                this.outputBuffer.limit(this.outputBufferInfo.offset + this.outputBufferInfo.size);
            }
            if (this.codecNeedsEosBufferTimestampWorkaround && this.outputBufferInfo.presentationTimeUs == 0 && (this.outputBufferInfo.flags & 4) != 0) {
                long j3 = this.largestQueuedPresentationTimeUs;
                if (j3 != -9223372036854775807L) {
                    this.outputBufferInfo.presentationTimeUs = j3;
                }
            }
            this.isDecodeOnlyOutputBuffer = isDecodeOnlyBuffer(this.outputBufferInfo.presentationTimeUs);
            this.isLastOutputBuffer = this.lastBufferInStreamPresentationTimeUs == this.outputBufferInfo.presentationTimeUs;
            updateOutputFormatForTime(this.outputBufferInfo.presentationTimeUs);
        }
        if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
            try {
                z = false;
                try {
                    zProcessOutputBuffer = processOutputBuffer(j, j2, this.codec, this.outputBuffer, this.outputIndex, this.outputBufferInfo.flags, 1, this.outputBufferInfo.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, this.outputFormat);
                } catch (IllegalStateException unused2) {
                    processEndOfStream();
                    if (this.outputStreamEnded) {
                        releaseCodec();
                    }
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            zProcessOutputBuffer = processOutputBuffer(j, j2, this.codec, this.outputBuffer, this.outputIndex, this.outputBufferInfo.flags, 1, this.outputBufferInfo.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, this.outputFormat);
        }
        if (zProcessOutputBuffer) {
            onProcessedOutputBuffer(this.outputBufferInfo.presentationTimeUs);
            boolean z2 = (this.outputBufferInfo.flags & 4) != 0 ? true : z;
            resetOutputBuffer();
            if (!z2) {
                return true;
            }
            processEndOfStream();
        }
        return z;
    }

    private void processOutputMediaFormatChanged() {
        this.codecHasOutputMediaFormat = true;
        MediaFormat outputFormat = this.codec.getOutputFormat();
        if (this.codecAdaptationWorkaroundMode != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.shouldSkipAdaptationWorkaroundOutputBuffer = true;
            return;
        }
        if (this.codecNeedsMonoChannelCountWorkaround) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.codecOutputMediaFormat = outputFormat;
        this.codecOutputMediaFormatChanged = true;
    }

    private void processEndOfStream() throws Exception {
        int i = this.codecDrainAction;
        if (i == 1) {
            flushCodec();
            return;
        }
        if (i == 2) {
            flushCodec();
            updateDrmSessionV23();
        } else if (i == 3) {
            reinitializeCodec();
        } else {
            this.outputStreamEnded = true;
            renderToEndOfStream();
        }
    }

    protected final void setPendingOutputEndOfStream() {
        this.pendingOutputEndOfStream = true;
    }

    protected final long getOutputStreamOffsetUs() {
        return this.outputStreamInfo.streamOffsetUs;
    }

    private void setOutputStreamInfo(OutputStreamInfo outputStreamInfo) {
        this.outputStreamInfo = outputStreamInfo;
        if (outputStreamInfo.streamOffsetUs != -9223372036854775807L) {
            this.needToNotifyOutputFormatChangeAfterStreamChange = true;
            onOutputStreamOffsetUsChanged(outputStreamInfo.streamOffsetUs);
        }
    }

    protected static boolean supportsFormatDrm(Format format) {
        return format.cryptoType == 0 || format.cryptoType == 2;
    }

    private boolean drmNeedsCodecReinitialization(MediaCodecInfo mediaCodecInfo, Format format, DrmSession drmSession, DrmSession drmSession2) throws ExoPlaybackException {
        CryptoConfig cryptoConfig;
        CryptoConfig cryptoConfig2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (cryptoConfig = drmSession2.getCryptoConfig()) != null && (cryptoConfig2 = drmSession.getCryptoConfig()) != null && cryptoConfig.getClass().equals(cryptoConfig2.getClass())) {
            if (!(cryptoConfig instanceof FrameworkCryptoConfig)) {
                return false;
            }
            FrameworkCryptoConfig frameworkCryptoConfig = (FrameworkCryptoConfig) cryptoConfig;
            if (drmSession2.getSchemeUuid().equals(drmSession.getSchemeUuid()) && Util.SDK_INT >= 23 && !C.PLAYREADY_UUID.equals(drmSession.getSchemeUuid()) && !C.PLAYREADY_UUID.equals(drmSession2.getSchemeUuid())) {
                return !mediaCodecInfo.secure && (frameworkCryptoConfig.forceAllowInsecureDecoderComponents ? false : drmSession2.requiresSecureDecoder(format.sampleMimeType));
            }
        }
        return true;
    }

    private void reinitializeCodec() throws Exception {
        releaseCodec();
        maybeInitCodecOrBypass();
    }

    private boolean isDecodeOnlyBuffer(long j) {
        int size = this.decodeOnlyPresentationTimestamps.size();
        for (int i = 0; i < size; i++) {
            if (this.decodeOnlyPresentationTimestamps.get(i).longValue() == j) {
                this.decodeOnlyPresentationTimestamps.remove(i);
                return true;
            }
        }
        return false;
    }

    private void updateDrmSessionV23() throws ExoPlaybackException, MediaCryptoException {
        CryptoConfig cryptoConfig = this.sourceDrmSession.getCryptoConfig();
        if (cryptoConfig instanceof FrameworkCryptoConfig) {
            try {
                this.mediaCrypto.setMediaDrmSession(((FrameworkCryptoConfig) cryptoConfig).sessionId);
            } catch (MediaCryptoException e) {
                throw createRendererException(e, this.inputFormat, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
            }
        }
        setCodecDrmSession(this.sourceDrmSession);
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
    }

    private boolean bypassRender(long j, long j2) throws Exception {
        boolean z;
        Assertions.checkState(!this.outputStreamEnded);
        if (!this.bypassBatchBuffer.hasSamples()) {
            z = false;
        } else {
            if (!processOutputBuffer(j, j2, null, this.bypassBatchBuffer.data, this.outputIndex, 0, this.bypassBatchBuffer.getSampleCount(), this.bypassBatchBuffer.getFirstSampleTimeUs(), this.bypassBatchBuffer.isDecodeOnly(), this.bypassBatchBuffer.isEndOfStream(), this.outputFormat)) {
                return false;
            }
            onProcessedOutputBuffer(this.bypassBatchBuffer.getLastSampleTimeUs());
            this.bypassBatchBuffer.clear();
            z = false;
        }
        if (this.inputStreamEnded) {
            this.outputStreamEnded = true;
            return z;
        }
        if (this.bypassSampleBufferPending) {
            Assertions.checkState(this.bypassBatchBuffer.append(this.bypassSampleBuffer));
            this.bypassSampleBufferPending = z;
        }
        if (this.bypassDrainAndReinitialize) {
            if (this.bypassBatchBuffer.hasSamples()) {
                return true;
            }
            disableBypass();
            this.bypassDrainAndReinitialize = z;
            maybeInitCodecOrBypass();
            if (!this.bypassEnabled) {
                return z;
            }
        }
        bypassRead();
        if (this.bypassBatchBuffer.hasSamples()) {
            this.bypassBatchBuffer.flip();
        }
        if (this.bypassBatchBuffer.hasSamples() || this.inputStreamEnded || this.bypassDrainAndReinitialize) {
            return true;
        }
        return z;
    }

    private void bypassRead() throws Exception {
        Assertions.checkState(!this.inputStreamEnded);
        FormatHolder formatHolder = getFormatHolder();
        this.bypassSampleBuffer.clear();
        do {
            this.bypassSampleBuffer.clear();
            int source = readSource(formatHolder, this.bypassSampleBuffer, 0);
            if (source == -5) {
                onInputFormatChanged(formatHolder);
                return;
            }
            if (source != -4) {
                if (source != -3) {
                    throw new IllegalStateException();
                }
                return;
            }
            if (this.bypassSampleBuffer.isEndOfStream()) {
                this.inputStreamEnded = true;
                return;
            }
            if (this.waitingForFirstSampleInFormat) {
                Format format = (Format) Assertions.checkNotNull(this.inputFormat);
                this.outputFormat = format;
                onOutputFormatChanged(format, null);
                this.waitingForFirstSampleInFormat = false;
            }
            this.bypassSampleBuffer.flip();
            Format format2 = this.inputFormat;
            if (format2 != null && format2.sampleMimeType != null && this.inputFormat.sampleMimeType.equals("audio/opus")) {
                this.oggOpusAudioPacketizer.packetize(this.bypassSampleBuffer, this.inputFormat.initializationData);
            }
        } while (this.bypassBatchBuffer.append(this.bypassSampleBuffer));
        this.bypassSampleBufferPending = true;
    }

    private static boolean isMediaCodecException(IllegalStateException illegalStateException) {
        if (Util.SDK_INT >= 21 && isMediaCodecExceptionV21(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private static boolean isMediaCodecExceptionV21(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean isRecoverableMediaCodecExceptionV21(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private static boolean codecNeedsFlushWorkaround(String str) {
        return Util.SDK_INT < 18 || (Util.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (Util.SDK_INT == 19 && Util.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private int codecAdaptationWorkaroundMode(String str) {
        if (Util.SDK_INT <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (Util.MODEL.startsWith("SM-T585") || Util.MODEL.startsWith("SM-A510") || Util.MODEL.startsWith("SM-A520") || Util.MODEL.startsWith("SM-J700"))) {
            return 2;
        }
        if (Util.SDK_INT >= 24) {
            return 0;
        }
        if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
            return ("flounder".equals(Util.DEVICE) || "flounder_lte".equals(Util.DEVICE) || "grouper".equals(Util.DEVICE) || "tilapia".equals(Util.DEVICE)) ? 1 : 0;
        }
        return 0;
    }

    private static boolean codecNeedsDiscardToSpsWorkaround(String str, Format format) {
        return Util.SDK_INT < 21 && format.initializationData.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static boolean codecNeedsSosFlushWorkaround(String str) {
        return Util.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private static boolean codecNeedsEosPropagationWorkaround(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        return (Util.SDK_INT <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (Util.SDK_INT <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((Util.SDK_INT <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(Util.MANUFACTURER) && "AFTS".equals(Util.MODEL) && mediaCodecInfo.secure));
    }

    private static boolean codecNeedsEosFlushWorkaround(String str) {
        return (Util.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (Util.SDK_INT <= 19 && (("hb2000".equals(Util.DEVICE) || "stvm8".equals(Util.DEVICE)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
    }

    private static boolean codecNeedsEosBufferTimestampWorkaround(String str) {
        return Util.SDK_INT < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(Util.MANUFACTURER) && (Util.DEVICE.startsWith("baffin") || Util.DEVICE.startsWith("grand") || Util.DEVICE.startsWith("fortuna") || Util.DEVICE.startsWith("gprimelte") || Util.DEVICE.startsWith("j2y18lte") || Util.DEVICE.startsWith("ms01"));
    }

    private static boolean codecNeedsEosOutputExceptionWorkaround(String str) {
        return Util.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean codecNeedsMonoChannelCountWorkaround(String str, Format format) {
        return Util.SDK_INT <= 18 && format.channelCount == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private static final class OutputStreamInfo {
        public static final OutputStreamInfo UNSET = new OutputStreamInfo(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
        public final TimedValueQueue<Format> formatQueue = new TimedValueQueue<>();
        public final long previousStreamLastBufferTimeUs;
        public final long startPositionUs;
        public final long streamOffsetUs;

        public OutputStreamInfo(long j, long j2, long j3) {
            this.previousStreamLastBufferTimeUs = j;
            this.startPositionUs = j2;
            this.streamOffsetUs = j3;
        }
    }

    private static final class Api31 {
        private Api31() {
        }

        public static void setLogSessionIdToMediaCodecFormat(MediaCodecAdapter.Configuration configuration, PlayerId playerId) {
            LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            configuration.mediaFormat.setString("log-session-id", logSessionId.getStringId());
        }
    }
}
