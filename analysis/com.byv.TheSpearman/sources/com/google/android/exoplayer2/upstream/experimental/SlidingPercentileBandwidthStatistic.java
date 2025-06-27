package com.google.android.exoplayer2.upstream.experimental;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.TreeSet;

@Deprecated
/* loaded from: classes2.dex */
public class SlidingPercentileBandwidthStatistic implements BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    public static final double DEFAULT_PERCENTILE = 0.5d;
    private long bitrateEstimate;
    private final int maxSampleCount;
    private final double percentile;
    private final ArrayDeque<Sample> samples;
    private final TreeSet<Sample> sortedSamples;
    private double weightSum;

    public SlidingPercentileBandwidthStatistic() {
        this(10, 0.5d);
    }

    public SlidingPercentileBandwidthStatistic(int i, double d) {
        Assertions.checkArgument(d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d <= 1.0d);
        this.maxSampleCount = i;
        this.percentile = d;
        this.samples = new ArrayDeque<>();
        this.sortedSamples = new TreeSet<>();
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthStatistic
    public void addSample(long j, long j2) {
        while (this.samples.size() >= this.maxSampleCount) {
            Sample sampleRemove = this.samples.remove();
            this.sortedSamples.remove(sampleRemove);
            this.weightSum -= sampleRemove.weight;
        }
        double dSqrt = Math.sqrt(j);
        Sample sample = new Sample((j * 8000000) / j2, dSqrt);
        this.samples.add(sample);
        this.sortedSamples.add(sample);
        this.weightSum += dSqrt;
        this.bitrateEstimate = calculateBitrateEstimate();
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        return this.bitrateEstimate;
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.sortedSamples.clear();
        this.weightSum = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    private long calculateBitrateEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        double d = this.weightSum * this.percentile;
        Iterator<Sample> it = this.sortedSamples.iterator();
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        long j = 0;
        double d3 = 0.0d;
        while (it.hasNext()) {
            Sample next = it.next();
            double d4 = d2 + (next.weight / 2.0d);
            if (d4 >= d) {
                return j == 0 ? next.bitrate : j + ((long) (((next.bitrate - j) * (d - d3)) / (d4 - d3)));
            }
            j = next.bitrate;
            d2 = (next.weight / 2.0d) + d4;
            d3 = d4;
        }
        return j;
    }

    private static class Sample implements Comparable<Sample> {
        private final long bitrate;
        private final double weight;

        public Sample(long j, double d) {
            this.bitrate = j;
            this.weight = d;
        }

        @Override // java.lang.Comparable
        public int compareTo(Sample sample) {
            return Util.compareLong(this.bitrate, sample.bitrate);
        }
    }
}
