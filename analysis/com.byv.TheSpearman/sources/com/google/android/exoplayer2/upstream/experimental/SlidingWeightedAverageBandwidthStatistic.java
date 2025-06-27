package com.google.android.exoplayer2.upstream.experimental;

import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayDeque;
import java.util.Deque;

@Deprecated
/* loaded from: classes2.dex */
public class SlidingWeightedAverageBandwidthStatistic implements BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    private double bitrateWeightProductSum;
    private final Clock clock;
    private final SampleEvictionFunction sampleEvictionFunction;
    private final ArrayDeque<Sample> samples;
    private double weightSum;

    public interface SampleEvictionFunction {
        boolean shouldEvictSample(Deque<Sample> deque);
    }

    public static class Sample {
        public final long bitrate;
        public final long timeAddedMs;
        public final double weight;

        public Sample(long j, double d, long j2) {
            this.bitrate = j;
            this.weight = d;
            this.timeAddedMs = j2;
        }
    }

    public static SampleEvictionFunction getMaxCountEvictionFunction(final long j) {
        return new SampleEvictionFunction() { // from class: com.google.android.exoplayer2.upstream.experimental.SlidingWeightedAverageBandwidthStatistic$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
            public final boolean shouldEvictSample(Deque deque) {
                return SlidingWeightedAverageBandwidthStatistic.lambda$getMaxCountEvictionFunction$0(j, deque);
            }
        };
    }

    static /* synthetic */ boolean lambda$getMaxCountEvictionFunction$0(long j, Deque deque) {
        return ((long) deque.size()) >= j;
    }

    public static SampleEvictionFunction getAgeBasedEvictionFunction(long j) {
        return getAgeBasedEvictionFunction(j, Clock.DEFAULT);
    }

    static SampleEvictionFunction getAgeBasedEvictionFunction(final long j, final Clock clock) {
        return new SampleEvictionFunction() { // from class: com.google.android.exoplayer2.upstream.experimental.SlidingWeightedAverageBandwidthStatistic$$ExternalSyntheticLambda1
            @Override // com.google.android.exoplayer2.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
            public final boolean shouldEvictSample(Deque deque) {
                return SlidingWeightedAverageBandwidthStatistic.lambda$getAgeBasedEvictionFunction$1(j, clock, deque);
            }
        };
    }

    static /* synthetic */ boolean lambda$getAgeBasedEvictionFunction$1(long j, Clock clock, Deque deque) {
        return !deque.isEmpty() && ((Sample) Util.castNonNull((Sample) deque.peek())).timeAddedMs + j < clock.elapsedRealtime();
    }

    public SlidingWeightedAverageBandwidthStatistic() {
        this(getMaxCountEvictionFunction(10L));
    }

    public SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction) {
        this(sampleEvictionFunction, Clock.DEFAULT);
    }

    SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction, Clock clock) {
        this.samples = new ArrayDeque<>();
        this.sampleEvictionFunction = sampleEvictionFunction;
        this.clock = clock;
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthStatistic
    public void addSample(long j, long j2) {
        while (this.sampleEvictionFunction.shouldEvictSample(this.samples)) {
            Sample sampleRemove = this.samples.remove();
            this.bitrateWeightProductSum -= sampleRemove.bitrate * sampleRemove.weight;
            this.weightSum -= sampleRemove.weight;
        }
        Sample sample = new Sample((j * 8000000) / j2, Math.sqrt(j), this.clock.elapsedRealtime());
        this.samples.add(sample);
        this.bitrateWeightProductSum += sample.bitrate * sample.weight;
        this.weightSum += sample.weight;
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.bitrateWeightProductSum / this.weightSum);
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.bitrateWeightProductSum = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.weightSum = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }
}
