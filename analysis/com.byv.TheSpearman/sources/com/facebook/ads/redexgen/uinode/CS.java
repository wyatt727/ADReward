package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public abstract class CS {
    public static CR A00(int i, long[] jArr, int[] iArr, long j) {
        int chunkSamplesRemaining = 8192 / i;
        int iA04 = 0;
        for (int i2 : iArr) {
            iA04 += IF.A04(i2, chunkSamplesRemaining);
        }
        long[] jArr2 = new long[iA04];
        int[] iArr2 = new int[iA04];
        int originalSampleIndex = 0;
        long[] timestamps = new long[iA04];
        int[] flags = new int[iA04];
        int i3 = 0;
        int bufferSampleCount = 0;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int rechunkedSampleCount = iArr[i4];
            long j2 = jArr[i4];
            while (rechunkedSampleCount > 0) {
                int iMin = Math.min(chunkSamplesRemaining, rechunkedSampleCount);
                jArr2[bufferSampleCount] = j2;
                iArr2[bufferSampleCount] = i * iMin;
                originalSampleIndex = Math.max(originalSampleIndex, iArr2[bufferSampleCount]);
                timestamps[bufferSampleCount] = i3 * j;
                flags[bufferSampleCount] = 1;
                j2 += iArr2[bufferSampleCount];
                i3 += iMin;
                rechunkedSampleCount -= iMin;
                bufferSampleCount++;
            }
        }
        return new CR(jArr2, iArr2, originalSampleIndex, timestamps, flags, j * i3);
    }
}
