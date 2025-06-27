package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;

@Deprecated
/* loaded from: classes2.dex */
public final class SinglePeriodTimeline extends Timeline {
    private final long elapsedRealtimeEpochOffsetMs;
    private final boolean isDynamic;
    private final boolean isSeekable;
    private final MediaItem.LiveConfiguration liveConfiguration;
    private final Object manifest;
    private final MediaItem mediaItem;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final boolean suppressPositionProjection;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;
    private static final Object UID = new Object();
    private static final MediaItem MEDIA_ITEM = new MediaItem.Builder().setMediaId("SinglePeriodTimeline").setUri(Uri.EMPTY).build();

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
        return 1;
    }

    @Deprecated
    public SinglePeriodTimeline(long j, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        this(j, j, 0L, 0L, z, z2, z3, obj, obj2);
    }

    public SinglePeriodTimeline(long j, boolean z, boolean z2, boolean z3, Object obj, MediaItem mediaItem) {
        this(j, j, 0L, 0L, z, z2, z3, obj, mediaItem);
    }

    @Deprecated
    public SinglePeriodTimeline(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, z3, obj, obj2);
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, MediaItem mediaItem) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, mediaItem, z3 ? mediaItem.liveConfiguration : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        MediaItem mediaItem = MEDIA_ITEM;
        this(j, j2, j3, j4, j5, j6, j7, z, z2, false, obj, mediaItem.buildUpon().setTag(obj2).build(), z3 ? mediaItem.liveConfiguration : null);
    }

    @Deprecated
    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, Object obj, MediaItem mediaItem, MediaItem.LiveConfiguration liveConfiguration) {
        this(j, j2, j3, j4, j5, j6, j7, z, z2, false, obj, mediaItem, liveConfiguration);
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, MediaItem mediaItem, MediaItem.LiveConfiguration liveConfiguration) {
        this.presentationStartTimeMs = j;
        this.windowStartTimeMs = j2;
        this.elapsedRealtimeEpochOffsetMs = j3;
        this.periodDurationUs = j4;
        this.windowDurationUs = j5;
        this.windowPositionInPeriodUs = j6;
        this.windowDefaultStartPositionUs = j7;
        this.isSeekable = z;
        this.isDynamic = z2;
        this.suppressPositionProjection = z3;
        this.manifest = obj;
        this.mediaItem = (MediaItem) Assertions.checkNotNull(mediaItem);
        this.liveConfiguration = liveConfiguration;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v9 long) binds: [B:3:0x0012, B:5:0x0016, B:7:0x001c, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.Timeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.exoplayer2.Timeline.Window getWindow(int r28, com.google.android.exoplayer2.Timeline.Window r29, long r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = 0
            r2 = 1
            r3 = r28
            com.google.android.exoplayer2.util.Assertions.checkIndex(r3, r1, r2)
            long r1 = r0.windowDefaultStartPositionUs
            boolean r3 = r0.isDynamic
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L2e
            boolean r3 = r0.suppressPositionProjection
            if (r3 != 0) goto L2e
            r6 = 0
            int r3 = (r30 > r6 ? 1 : (r30 == r6 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r6 = r0.windowDurationUs
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L27
        L24:
            r19 = r4
            goto L30
        L27:
            long r1 = r1 + r30
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L24
        L2e:
            r19 = r1
        L30:
            java.lang.Object r7 = com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID
            com.google.android.exoplayer2.MediaItem r8 = r0.mediaItem
            java.lang.Object r9 = r0.manifest
            long r10 = r0.presentationStartTimeMs
            long r12 = r0.windowStartTimeMs
            long r14 = r0.elapsedRealtimeEpochOffsetMs
            boolean r1 = r0.isSeekable
            r16 = r1
            boolean r1 = r0.isDynamic
            r17 = r1
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r0.liveConfiguration
            r18 = r1
            long r1 = r0.windowDurationUs
            r21 = r1
            r23 = 0
            r24 = 0
            long r1 = r0.windowPositionInPeriodUs
            r25 = r1
            r6 = r29
            com.google.android.exoplayer2.Timeline$Window r1 = r6.set(r7, r8, r9, r10, r12, r14, r16, r17, r18, r19, r21, r23, r24, r25)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.SinglePeriodTimeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window, long):com.google.android.exoplayer2.Timeline$Window");
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        Assertions.checkIndex(i, 0, 1);
        return period.set(null, z ? UID : null, 0, this.periodDurationUs, -this.windowPositionInPeriodUs);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getIndexOfPeriod(Object obj) {
        return UID.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Object getUidOfPeriod(int i) {
        Assertions.checkIndex(i, 0, 1);
        return UID;
    }
}
