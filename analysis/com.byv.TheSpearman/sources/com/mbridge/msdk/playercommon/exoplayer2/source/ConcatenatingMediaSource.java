package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ConcatenatingMediaSource extends CompositeMediaSource<MediaSourceHolder> implements PlayerMessage.Target {
    private static final int MSG_ADD = 0;
    private static final int MSG_ADD_MULTIPLE = 1;
    private static final int MSG_CLEAR = 4;
    private static final int MSG_MOVE = 3;
    private static final int MSG_NOTIFY_LISTENER = 5;
    private static final int MSG_ON_COMPLETION = 6;
    private static final int MSG_REMOVE = 2;
    private final boolean isAtomic;
    private boolean listenerNotificationScheduled;
    private final Map<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final List<MediaSourceHolder> mediaSourceHolders;
    private final List<MediaSourceHolder> mediaSourcesPublic;
    private final List<EventDispatcher> pendingOnCompletionActions;
    private int periodCount;
    private ExoPlayer player;
    private final MediaSourceHolder query;
    private ShuffleOrder shuffleOrder;
    private final Timeline.Window window;
    private int windowCount;

    public ConcatenatingMediaSource() {
        this(false, (ShuffleOrder) new ShuffleOrder.DefaultShuffleOrder(0));
    }

    public ConcatenatingMediaSource(boolean z) {
        this(z, new ShuffleOrder.DefaultShuffleOrder(0));
    }

    public ConcatenatingMediaSource(boolean z, ShuffleOrder shuffleOrder) {
        this(z, shuffleOrder, new MediaSource[0]);
    }

    public ConcatenatingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, MediaSource... mediaSourceArr) {
        this(z, new ShuffleOrder.DefaultShuffleOrder(0), mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        for (MediaSource mediaSource : mediaSourceArr) {
            Assertions.checkNotNull(mediaSource);
        }
        this.shuffleOrder = shuffleOrder.getLength() > 0 ? shuffleOrder.cloneAndClear() : shuffleOrder;
        this.mediaSourceByMediaPeriod = new IdentityHashMap();
        this.mediaSourcesPublic = new ArrayList();
        this.mediaSourceHolders = new ArrayList();
        this.pendingOnCompletionActions = new ArrayList();
        this.query = new MediaSourceHolder(null);
        this.isAtomic = z;
        this.window = new Timeline.Window();
        addMediaSources(Arrays.asList(mediaSourceArr));
    }

    public final synchronized void addMediaSource(MediaSource mediaSource) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, null);
    }

    public final synchronized void addMediaSource(MediaSource mediaSource, Runnable runnable) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, runnable);
    }

    public final synchronized void addMediaSource(int i, MediaSource mediaSource) {
        addMediaSource(i, mediaSource, null);
    }

    public final synchronized void addMediaSource(int i, MediaSource mediaSource, Runnable runnable) {
        Assertions.checkNotNull(mediaSource);
        MediaSourceHolder mediaSourceHolder = new MediaSourceHolder(mediaSource);
        this.mediaSourcesPublic.add(i, mediaSourceHolder);
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.createMessage(this).setType(0).setPayload(new MessageData(i, mediaSourceHolder, runnable)).send();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final synchronized void addMediaSources(Collection<MediaSource> collection) {
        addMediaSources(this.mediaSourcesPublic.size(), collection, null);
    }

    public final synchronized void addMediaSources(Collection<MediaSource> collection, Runnable runnable) {
        addMediaSources(this.mediaSourcesPublic.size(), collection, runnable);
    }

    public final synchronized void addMediaSources(int i, Collection<MediaSource> collection) {
        addMediaSources(i, collection, null);
    }

    public final synchronized void addMediaSources(int i, Collection<MediaSource> collection, Runnable runnable) {
        Iterator<MediaSource> it = collection.iterator();
        while (it.hasNext()) {
            Assertions.checkNotNull(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<MediaSource> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new MediaSourceHolder(it2.next()));
        }
        this.mediaSourcesPublic.addAll(i, arrayList);
        if (this.player != null && !collection.isEmpty()) {
            this.player.createMessage(this).setType(1).setPayload(new MessageData(i, arrayList, runnable)).send();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final synchronized void removeMediaSource(int i) {
        removeMediaSource(i, null);
    }

    public final synchronized void removeMediaSource(int i, Runnable runnable) {
        this.mediaSourcesPublic.remove(i);
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.createMessage(this).setType(2).setPayload(new MessageData(i, null, runnable)).send();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final synchronized void moveMediaSource(int i, int i2) {
        moveMediaSource(i, i2, null);
    }

    public final synchronized void moveMediaSource(int i, int i2, Runnable runnable) {
        if (i == i2) {
            return;
        }
        List<MediaSourceHolder> list = this.mediaSourcesPublic;
        list.add(i2, list.remove(i));
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.createMessage(this).setType(3).setPayload(new MessageData(i, Integer.valueOf(i2), runnable)).send();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final synchronized void clear() {
        clear(null);
    }

    public final synchronized void clear(Runnable runnable) {
        this.mediaSourcesPublic.clear();
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.createMessage(this).setType(4).setPayload(runnable != null ? new EventDispatcher(runnable) : null).send();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final synchronized int getSize() {
        return this.mediaSourcesPublic.size();
    }

    public final synchronized MediaSource getMediaSource(int i) {
        return this.mediaSourcesPublic.get(i).mediaSource;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final synchronized void prepareSourceInternal(ExoPlayer exoPlayer, boolean z) {
        super.prepareSourceInternal(exoPlayer, z);
        this.player = exoPlayer;
        if (this.mediaSourcesPublic.isEmpty()) {
            notifyListener();
        } else {
            this.shuffleOrder = this.shuffleOrder.cloneAndInsert(0, this.mediaSourcesPublic.size());
            addMediaSourcesInternal(0, this.mediaSourcesPublic);
            scheduleListenerNotification(null);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(findMediaSourceHolderByPeriodIndex(mediaPeriodId.periodIndex));
        DeferredMediaPeriod deferredMediaPeriod = new DeferredMediaPeriod(mediaSourceHolder.mediaSource, mediaPeriodId.copyWithPeriodIndex(mediaPeriodId.periodIndex - mediaSourceHolder.firstPeriodIndexInChild), allocator);
        this.mediaSourceByMediaPeriod.put(deferredMediaPeriod, mediaSourceHolder);
        mediaSourceHolder.activeMediaPeriods.add(deferredMediaPeriod);
        if (mediaSourceHolder.isPrepared) {
            deferredMediaPeriod.createPeriod();
        }
        return deferredMediaPeriod;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void releasePeriod(MediaPeriod mediaPeriod) {
        MediaSourceHolder mediaSourceHolderRemove = this.mediaSourceByMediaPeriod.remove(mediaPeriod);
        ((DeferredMediaPeriod) mediaPeriod).releasePeriod();
        mediaSourceHolderRemove.activeMediaPeriods.remove(mediaPeriod);
        if (mediaSourceHolderRemove.activeMediaPeriods.isEmpty() && mediaSourceHolderRemove.isRemoved) {
            releaseChildSource(mediaSourceHolderRemove);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.mediaSourceHolders.clear();
        this.player = null;
        this.shuffleOrder = this.shuffleOrder.cloneAndClear();
        this.windowCount = 0;
        this.periodCount = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(MediaSourceHolder mediaSourceHolder, MediaSource mediaSource, Timeline timeline, Object obj) {
        updateMediaSourceInternal(mediaSourceHolder, timeline);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i = 0; i < mediaSourceHolder.activeMediaPeriods.size(); i++) {
            if (mediaSourceHolder.activeMediaPeriods.get(i).id.windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodIndex(mediaPeriodId.periodIndex + mediaSourceHolder.firstPeriodIndexInChild);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(MediaSourceHolder mediaSourceHolder, int i) {
        return i + mediaSourceHolder.firstWindowIndexInChild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage.Target
    public final void handleMessage(int i, Object obj) throws ExoPlaybackException {
        switch (i) {
            case 0:
                MessageData messageData = (MessageData) obj;
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(messageData.index, 1);
                addMediaSourceInternal(messageData.index, (MediaSourceHolder) messageData.customData);
                scheduleListenerNotification(messageData.actionOnCompletion);
                return;
            case 1:
                MessageData messageData2 = (MessageData) obj;
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(messageData2.index, ((Collection) messageData2.customData).size());
                addMediaSourcesInternal(messageData2.index, (Collection) messageData2.customData);
                scheduleListenerNotification(messageData2.actionOnCompletion);
                return;
            case 2:
                MessageData messageData3 = (MessageData) obj;
                this.shuffleOrder = this.shuffleOrder.cloneAndRemove(messageData3.index);
                removeMediaSourceInternal(messageData3.index);
                scheduleListenerNotification(messageData3.actionOnCompletion);
                return;
            case 3:
                MessageData messageData4 = (MessageData) obj;
                ShuffleOrder shuffleOrderCloneAndRemove = this.shuffleOrder.cloneAndRemove(messageData4.index);
                this.shuffleOrder = shuffleOrderCloneAndRemove;
                this.shuffleOrder = shuffleOrderCloneAndRemove.cloneAndInsert(((Integer) messageData4.customData).intValue(), 1);
                moveMediaSourceInternal(messageData4.index, ((Integer) messageData4.customData).intValue());
                scheduleListenerNotification(messageData4.actionOnCompletion);
                return;
            case 4:
                clearInternal();
                scheduleListenerNotification((EventDispatcher) obj);
                return;
            case 5:
                notifyListener();
                return;
            case 6:
                List list = (List) obj;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    ((EventDispatcher) list.get(i2)).dispatchEvent();
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    private void scheduleListenerNotification(EventDispatcher eventDispatcher) {
        if (!this.listenerNotificationScheduled) {
            this.player.createMessage(this).setType(5).send();
            this.listenerNotificationScheduled = true;
        }
        if (eventDispatcher != null) {
            this.pendingOnCompletionActions.add(eventDispatcher);
        }
    }

    private void notifyListener() {
        List arrayList;
        this.listenerNotificationScheduled = false;
        if (this.pendingOnCompletionActions.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(this.pendingOnCompletionActions);
        }
        this.pendingOnCompletionActions.clear();
        refreshSourceInfo(new ConcatenatedTimeline(this.mediaSourceHolders, this.windowCount, this.periodCount, this.shuffleOrder, this.isAtomic), null);
        if (arrayList.isEmpty()) {
            return;
        }
        this.player.createMessage(this).setType(6).setPayload(arrayList).send();
    }

    private void addMediaSourceInternal(int i, MediaSourceHolder mediaSourceHolder) {
        if (i > 0) {
            MediaSourceHolder mediaSourceHolder2 = this.mediaSourceHolders.get(i - 1);
            mediaSourceHolder.reset(i, mediaSourceHolder2.firstWindowIndexInChild + mediaSourceHolder2.timeline.getWindowCount(), mediaSourceHolder2.firstPeriodIndexInChild + mediaSourceHolder2.timeline.getPeriodCount());
        } else {
            mediaSourceHolder.reset(i, 0, 0);
        }
        correctOffsets(i, 1, mediaSourceHolder.timeline.getWindowCount(), mediaSourceHolder.timeline.getPeriodCount());
        this.mediaSourceHolders.add(i, mediaSourceHolder);
        prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
    }

    private void addMediaSourcesInternal(int i, Collection<MediaSourceHolder> collection) {
        Iterator<MediaSourceHolder> it = collection.iterator();
        while (it.hasNext()) {
            addMediaSourceInternal(i, it.next());
            i++;
        }
    }

    private void updateMediaSourceInternal(MediaSourceHolder mediaSourceHolder, Timeline timeline) {
        if (mediaSourceHolder == null) {
            throw new IllegalArgumentException();
        }
        DeferredTimeline deferredTimeline = mediaSourceHolder.timeline;
        if (deferredTimeline.getTimeline() == timeline) {
            return;
        }
        int windowCount = timeline.getWindowCount() - deferredTimeline.getWindowCount();
        int periodCount = timeline.getPeriodCount() - deferredTimeline.getPeriodCount();
        if (windowCount != 0 || periodCount != 0) {
            correctOffsets(mediaSourceHolder.childIndex + 1, 0, windowCount, periodCount);
        }
        mediaSourceHolder.timeline = deferredTimeline.cloneWithNewTimeline(timeline);
        if (!mediaSourceHolder.isPrepared && !timeline.isEmpty()) {
            timeline.getWindow(0, this.window);
            long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs() + this.window.getDefaultPositionUs();
            for (int i = 0; i < mediaSourceHolder.activeMediaPeriods.size(); i++) {
                DeferredMediaPeriod deferredMediaPeriod = mediaSourceHolder.activeMediaPeriods.get(i);
                deferredMediaPeriod.setDefaultPreparePositionUs(positionInFirstPeriodUs);
                deferredMediaPeriod.createPeriod();
            }
            mediaSourceHolder.isPrepared = true;
        }
        scheduleListenerNotification(null);
    }

    private void clearInternal() {
        for (int size = this.mediaSourceHolders.size() - 1; size >= 0; size--) {
            removeMediaSourceInternal(size);
        }
    }

    private void removeMediaSourceInternal(int i) {
        MediaSourceHolder mediaSourceHolderRemove = this.mediaSourceHolders.remove(i);
        DeferredTimeline deferredTimeline = mediaSourceHolderRemove.timeline;
        correctOffsets(i, -1, -deferredTimeline.getWindowCount(), -deferredTimeline.getPeriodCount());
        mediaSourceHolderRemove.isRemoved = true;
        if (mediaSourceHolderRemove.activeMediaPeriods.isEmpty()) {
            releaseChildSource(mediaSourceHolderRemove);
        }
    }

    private void moveMediaSourceInternal(int i, int i2) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int windowCount = this.mediaSourceHolders.get(iMin).firstWindowIndexInChild;
        int periodCount = this.mediaSourceHolders.get(iMin).firstPeriodIndexInChild;
        List<MediaSourceHolder> list = this.mediaSourceHolders;
        list.add(i2, list.remove(i));
        while (iMin <= iMax) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(iMin);
            mediaSourceHolder.firstWindowIndexInChild = windowCount;
            mediaSourceHolder.firstPeriodIndexInChild = periodCount;
            windowCount += mediaSourceHolder.timeline.getWindowCount();
            periodCount += mediaSourceHolder.timeline.getPeriodCount();
            iMin++;
        }
    }

    private void correctOffsets(int i, int i2, int i3, int i4) {
        this.windowCount += i3;
        this.periodCount += i4;
        while (i < this.mediaSourceHolders.size()) {
            this.mediaSourceHolders.get(i).childIndex += i2;
            this.mediaSourceHolders.get(i).firstWindowIndexInChild += i3;
            this.mediaSourceHolders.get(i).firstPeriodIndexInChild += i4;
            i++;
        }
    }

    private int findMediaSourceHolderByPeriodIndex(int i) {
        this.query.firstPeriodIndexInChild = i;
        int iBinarySearch = Collections.binarySearch(this.mediaSourceHolders, this.query);
        if (iBinarySearch < 0) {
            return (-iBinarySearch) - 2;
        }
        while (iBinarySearch < this.mediaSourceHolders.size() - 1) {
            int i2 = iBinarySearch + 1;
            if (this.mediaSourceHolders.get(i2).firstPeriodIndexInChild != i) {
                break;
            }
            iBinarySearch = i2;
        }
        return iBinarySearch;
    }

    static final class MediaSourceHolder implements Comparable<MediaSourceHolder> {
        public int childIndex;
        public int firstPeriodIndexInChild;
        public int firstWindowIndexInChild;
        public boolean isPrepared;
        public boolean isRemoved;
        public final MediaSource mediaSource;
        public DeferredTimeline timeline = new DeferredTimeline();
        public List<DeferredMediaPeriod> activeMediaPeriods = new ArrayList();
        public final Object uid = new Object();

        public MediaSourceHolder(MediaSource mediaSource) {
            this.mediaSource = mediaSource;
        }

        public final void reset(int i, int i2, int i3) {
            this.childIndex = i;
            this.firstWindowIndexInChild = i2;
            this.firstPeriodIndexInChild = i3;
            this.isPrepared = false;
            this.isRemoved = false;
            this.activeMediaPeriods.clear();
        }

        @Override // java.lang.Comparable
        public final int compareTo(MediaSourceHolder mediaSourceHolder) {
            return this.firstPeriodIndexInChild - mediaSourceHolder.firstPeriodIndexInChild;
        }
    }

    private static final class EventDispatcher {
        public final Handler eventHandler;
        public final Runnable runnable;

        public EventDispatcher(Runnable runnable) {
            this.runnable = runnable;
            this.eventHandler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        }

        public final void dispatchEvent() {
            this.eventHandler.post(this.runnable);
        }
    }

    private static final class MessageData<T> {
        public final EventDispatcher actionOnCompletion;
        public final T customData;
        public final int index;

        public MessageData(int i, T t, Runnable runnable) {
            this.index = i;
            this.actionOnCompletion = runnable != null ? new EventDispatcher(runnable) : null;
            this.customData = t;
        }
    }

    private static final class ConcatenatedTimeline extends AbstractConcatenatedTimeline {
        private final HashMap<Object, Integer> childIndexByUid;
        private final int[] firstPeriodInChildIndices;
        private final int[] firstWindowInChildIndices;
        private final int periodCount;
        private final Timeline[] timelines;
        private final Object[] uids;
        private final int windowCount;

        public ConcatenatedTimeline(Collection<MediaSourceHolder> collection, int i, int i2, ShuffleOrder shuffleOrder, boolean z) {
            super(z, shuffleOrder);
            this.windowCount = i;
            this.periodCount = i2;
            int size = collection.size();
            this.firstPeriodInChildIndices = new int[size];
            this.firstWindowInChildIndices = new int[size];
            this.timelines = new Timeline[size];
            this.uids = new Object[size];
            this.childIndexByUid = new HashMap<>();
            int i3 = 0;
            for (MediaSourceHolder mediaSourceHolder : collection) {
                this.timelines[i3] = mediaSourceHolder.timeline;
                this.firstPeriodInChildIndices[i3] = mediaSourceHolder.firstPeriodIndexInChild;
                this.firstWindowInChildIndices[i3] = mediaSourceHolder.firstWindowIndexInChild;
                this.uids[i3] = mediaSourceHolder.uid;
                this.childIndexByUid.put(this.uids[i3], Integer.valueOf(i3));
                i3++;
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        protected final int getChildIndexByPeriodIndex(int i) {
            return Util.binarySearchFloor(this.firstPeriodInChildIndices, i + 1, false, false);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        protected final int getChildIndexByWindowIndex(int i) {
            return Util.binarySearchFloor(this.firstWindowInChildIndices, i + 1, false, false);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        protected final int getChildIndexByChildUid(Object obj) {
            Integer num = this.childIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        protected final Timeline getTimelineByChildIndex(int i) {
            return this.timelines[i];
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        protected final int getFirstPeriodIndexByChildIndex(int i) {
            return this.firstPeriodInChildIndices[i];
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        protected final int getFirstWindowIndexByChildIndex(int i) {
            return this.firstWindowInChildIndices[i];
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.AbstractConcatenatedTimeline
        protected final Object getChildUidByChildIndex(int i) {
            return this.uids[i];
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getWindowCount() {
            return this.windowCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getPeriodCount() {
            return this.periodCount;
        }
    }

    private static final class DeferredTimeline extends ForwardingTimeline {
        private final Object replacedId;
        private static final Object DUMMY_ID = new Object();
        private static final Timeline.Period period = new Timeline.Period();
        private static final DummyTimeline dummyTimeline = new DummyTimeline();

        public DeferredTimeline() {
            this(dummyTimeline, null);
        }

        private DeferredTimeline(Timeline timeline, Object obj) {
            super(timeline);
            this.replacedId = obj;
        }

        public final DeferredTimeline cloneWithNewTimeline(Timeline timeline) {
            Object obj;
            if (this.replacedId == null && timeline.getPeriodCount() > 0) {
                obj = timeline.getPeriod(0, period, true).uid;
            } else {
                obj = this.replacedId;
            }
            return new DeferredTimeline(timeline, obj);
        }

        public final Timeline getTimeline() {
            return this.timeline;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ForwardingTimeline, com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final Timeline.Period getPeriod(int i, Timeline.Period period2, boolean z) {
            this.timeline.getPeriod(i, period2, z);
            if (Util.areEqual(period2.uid, this.replacedId)) {
                period2.uid = DUMMY_ID;
            }
            return period2;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ForwardingTimeline, com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getIndexOfPeriod(Object obj) {
            Timeline timeline = this.timeline;
            if (DUMMY_ID.equals(obj)) {
                obj = this.replacedId;
            }
            return timeline.getIndexOfPeriod(obj);
        }
    }

    private static final class DummyTimeline extends Timeline {
        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getIndexOfPeriod(Object obj) {
            return obj == null ? 0 : -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getPeriodCount() {
            return 1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final int getWindowCount() {
            return 1;
        }

        private DummyTimeline() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final Timeline.Window getWindow(int i, Timeline.Window window, boolean z, long j) {
            return window.set(null, -9223372036854775807L, -9223372036854775807L, false, true, j > 0 ? -9223372036854775807L : 0L, -9223372036854775807L, 0, 0, 0L);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            return period.set(null, null, 0, -9223372036854775807L, 0L);
        }
    }
}
