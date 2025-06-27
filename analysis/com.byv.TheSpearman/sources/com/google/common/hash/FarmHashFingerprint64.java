package com.google.common.hash;

import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {
    static final HashFunction FARMHASH_FINGERPRINT_64 = new FarmHashFingerprint64();
    private static final long K0 = -4348849565147123417L;
    private static final long K1 = -5435081209227447693L;
    private static final long K2 = -7286425919675154353L;

    private static long hashLength16(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long shiftMix(long j) {
        return j ^ (j >>> 47);
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }

    FarmHashFingerprint64() {
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        return HashCode.fromLong(fingerprint(bArr, i, i2));
    }

    static long fingerprint(byte[] bArr, int i, int i2) {
        if (i2 <= 32) {
            if (i2 <= 16) {
                return hashLength0to16(bArr, i, i2);
            }
            return hashLength17to32(bArr, i, i2);
        }
        if (i2 <= 64) {
            return hashLength33To64(bArr, i, i2);
        }
        return hashLength65Plus(bArr, i, i2);
    }

    private static void weakHashLength32WithSeeds(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jLoad64 = LittleEndianByteArray.load64(bArr, i);
        long jLoad642 = LittleEndianByteArray.load64(bArr, i + 8);
        long jLoad643 = LittleEndianByteArray.load64(bArr, i + 16);
        long jLoad644 = LittleEndianByteArray.load64(bArr, i + 24);
        long j3 = j + jLoad64;
        long j4 = jLoad642 + j3 + jLoad643;
        long jRotateRight = Long.rotateRight(j2 + j3 + jLoad644, 21) + Long.rotateRight(j4, 44);
        jArr[0] = j4 + jLoad644;
        jArr[1] = jRotateRight + j3;
    }

    private static long hashLength0to16(byte[] bArr, int i, int i2) {
        if (i2 >= 8) {
            long j = (i2 * 2) + K2;
            long jLoad64 = LittleEndianByteArray.load64(bArr, i) + K2;
            long jLoad642 = LittleEndianByteArray.load64(bArr, (i + i2) - 8);
            return hashLength16((Long.rotateRight(jLoad642, 37) * j) + jLoad64, (Long.rotateRight(jLoad64, 25) + jLoad642) * j, j);
        }
        if (i2 >= 4) {
            return hashLength16(i2 + ((LittleEndianByteArray.load32(bArr, i) & 4294967295L) << 3), LittleEndianByteArray.load32(bArr, (i + i2) - 4) & 4294967295L, (i2 * 2) + K2);
        }
        if (i2 <= 0) {
            return K2;
        }
        return shiftMix((((bArr[i] & 255) + ((bArr[(i2 >> 1) + i] & 255) << 8)) * K2) ^ ((i2 + ((bArr[i + (i2 - 1)] & 255) << 2)) * K0)) * K2;
    }

    private static long hashLength17to32(byte[] bArr, int i, int i2) {
        long j = (i2 * 2) + K2;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i) * K1;
        long jLoad642 = LittleEndianByteArray.load64(bArr, i + 8);
        int i3 = i + i2;
        long jLoad643 = LittleEndianByteArray.load64(bArr, i3 - 8) * j;
        return hashLength16((LittleEndianByteArray.load64(bArr, i3 - 16) * K2) + Long.rotateRight(jLoad64 + jLoad642, 43) + Long.rotateRight(jLoad643, 30), jLoad64 + Long.rotateRight(jLoad642 + K2, 18) + jLoad643, j);
    }

    private static long hashLength33To64(byte[] bArr, int i, int i2) {
        long j = (i2 * 2) + K2;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i) * K2;
        long jLoad642 = LittleEndianByteArray.load64(bArr, i + 8);
        int i3 = i + i2;
        long jLoad643 = LittleEndianByteArray.load64(bArr, i3 - 8) * j;
        long jRotateRight = Long.rotateRight(jLoad64 + jLoad642, 43) + Long.rotateRight(jLoad643, 30) + (LittleEndianByteArray.load64(bArr, i3 - 16) * K2);
        long jHashLength16 = hashLength16(jRotateRight, jLoad643 + Long.rotateRight(jLoad642 + K2, 18) + jLoad64, j);
        long jLoad644 = LittleEndianByteArray.load64(bArr, i + 16) * j;
        long jLoad645 = LittleEndianByteArray.load64(bArr, i + 24);
        long jLoad646 = (jRotateRight + LittleEndianByteArray.load64(bArr, i3 - 32)) * j;
        return hashLength16(((jHashLength16 + LittleEndianByteArray.load64(bArr, i3 - 24)) * j) + Long.rotateRight(jLoad644 + jLoad645, 43) + Long.rotateRight(jLoad646, 30), jLoad644 + Long.rotateRight(jLoad645 + jLoad64, 18) + jLoad646, j);
    }

    private static long hashLength65Plus(byte[] bArr, int i, int i2) {
        long j = 81;
        long j2 = (j * K1) + 113;
        long jShiftMix = shiftMix((j2 * K2) + 113) * K2;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jLoad64 = (j * K2) + LittleEndianByteArray.load64(bArr, i);
        int i3 = i2 - 1;
        int i4 = i + ((i3 / 64) * 64);
        int i5 = i3 & 63;
        int i6 = (i4 + i5) - 63;
        int i7 = i;
        while (true) {
            long jRotateRight = Long.rotateRight(jLoad64 + j2 + jArr[0] + LittleEndianByteArray.load64(bArr, i7 + 8), 37) * K1;
            long jRotateRight2 = Long.rotateRight(j2 + jArr[1] + LittleEndianByteArray.load64(bArr, i7 + 48), 42) * K1;
            long j3 = jRotateRight ^ jArr2[1];
            long jLoad642 = jRotateRight2 + jArr[0] + LittleEndianByteArray.load64(bArr, i7 + 40);
            long jRotateRight3 = Long.rotateRight(jShiftMix + jArr2[0], 33) * K1;
            weakHashLength32WithSeeds(bArr, i7, jArr[1] * K1, j3 + jArr2[0], jArr);
            weakHashLength32WithSeeds(bArr, i7 + 32, jRotateRight3 + jArr2[1], jLoad642 + LittleEndianByteArray.load64(bArr, i7 + 16), jArr2);
            int i8 = i7 + 64;
            if (i8 == i4) {
                long j4 = K1 + ((j3 & 255) << 1);
                jArr2[0] = jArr2[0] + i5;
                jArr[0] = jArr[0] + jArr2[0];
                jArr2[0] = jArr2[0] + jArr[0];
                long jRotateRight4 = Long.rotateRight(jRotateRight3 + jLoad642 + jArr[0] + LittleEndianByteArray.load64(bArr, i6 + 8), 37) * j4;
                long jRotateRight5 = Long.rotateRight(jLoad642 + jArr[1] + LittleEndianByteArray.load64(bArr, i6 + 48), 42) * j4;
                long j5 = jRotateRight4 ^ (jArr2[1] * 9);
                long jLoad643 = jRotateRight5 + (jArr[0] * 9) + LittleEndianByteArray.load64(bArr, i6 + 40);
                long jRotateRight6 = Long.rotateRight(j3 + jArr2[0], 33) * j4;
                weakHashLength32WithSeeds(bArr, i6, jArr[1] * j4, j5 + jArr2[0], jArr);
                weakHashLength32WithSeeds(bArr, i6 + 32, jRotateRight6 + jArr2[1], jLoad643 + LittleEndianByteArray.load64(bArr, i6 + 16), jArr2);
                return hashLength16(hashLength16(jArr[0], jArr2[0], j4) + (shiftMix(jLoad643) * K0) + j5, hashLength16(jArr[1], jArr2[1], j4) + jRotateRight6, j4);
            }
            i7 = i8;
            jShiftMix = j3;
            j2 = jLoad642;
            jLoad64 = jRotateRight3;
        }
    }
}
