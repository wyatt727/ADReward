package com.google.android.exoplayer2.source.chunk;

import java.util.NoSuchElementException;

@Deprecated
/* loaded from: classes2.dex */
public abstract class BaseMediaChunkIterator implements MediaChunkIterator {
    private long currentIndex;
    private final long fromIndex;
    private final long toIndex;

    public BaseMediaChunkIterator(long j, long j2) {
        this.fromIndex = j;
        this.toIndex = j2;
        reset();
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public boolean isEnded() {
        return this.currentIndex > this.toIndex;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public boolean next() {
        this.currentIndex++;
        return !isEnded();
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public void reset() {
        this.currentIndex = this.fromIndex - 1;
    }

    protected final void checkInBounds() {
        long j = this.currentIndex;
        if (j < this.fromIndex || j > this.toIndex) {
            throw new NoSuchElementException();
        }
    }

    protected final long getCurrentIndex() {
        return this.currentIndex;
    }
}
