package com.facebook.ads.redexgen.uinode;

import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.Xu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1188Xu implements InterfaceC0602Ab {
    public static String[] A0E = {"fmVPqkFD1cgVEf5yEceID3qk2mv0y9jV", "b0qKN8vCZijgotAYoetPmKMmgBOh17e", "g7TZXYRzX5Z2yGc3Q7ZfgtgqT", "qnhKgbP1LxOTukF1AVGitzUWI170z7Sc", "gLdsa9A", "GaZA", "7VW9", "auyYkXCiGRTQJpd2YduJgHCR"};
    public int A00;
    public int A02;
    public int A03;
    public int A05;
    public long A06;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public ByteBuffer A07 = InterfaceC0602Ab.A00;
    public ByteBuffer A08 = InterfaceC0602Ab.A00;
    public int A01 = -1;
    public int A04 = -1;
    public byte[] A0C = new byte[0];
    public byte[] A0D = new byte[0];

    private int A00(long j) {
        return (int) ((this.A04 * j) / 1000000);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            int r0 = r5.limit()
            int r3 = r0 + (-1)
        L6:
            int r0 = r5.position()
            if (r3 < r0) goto L44
            byte r0 = r5.get(r3)
            int r1 = java.lang.Math.abs(r0)
            r0 = 4
            if (r1 <= r0) goto L3b
            int r0 = r4.A00
            int r3 = r3 / r0
            int r3 = r3 * r0
            int r3 = r3 + r0
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C1188Xu.A0E
            r0 = 4
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L3e
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C1188Xu.A0E
            java.lang.String r1 = "SOTn58r"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "mEuLJiBevsWuJD71nrz4KbfWqLj7leU"
            r0 = 1
            r2[r0] = r1
            return r3
        L3b:
            int r3 = r3 + (-2)
            goto L6
        L3e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L44:
            int r0 = r5.position()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C1188Xu.A01(java.nio.ByteBuffer):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A02(java.nio.ByteBuffer r4) {
        /*
            r3 = this;
            int r0 = r4.position()
            int r2 = r0 + 1
        L6:
            int r0 = r4.limit()
            if (r2 >= r0) goto L1f
            byte r0 = r4.get(r2)
            int r1 = java.lang.Math.abs(r0)
            r0 = 4
            if (r1 <= r0) goto L1c
            int r0 = r3.A00
            int r2 = r2 / r0
            int r0 = r0 * r2
            return r0
        L1c:
            int r2 = r2 + 2
            goto L6
        L1f:
            int r0 = r4.limit()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C1188Xu.A02(java.nio.ByteBuffer):int");
    }

    private void A03(int i) {
        if (this.A07.capacity() < i) {
            this.A07 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A07.clear();
        }
        if (i > 0) {
            this.A0A = true;
        }
    }

    private void A04(ByteBuffer byteBuffer) {
        A03(byteBuffer.remaining());
        this.A07.put(byteBuffer);
        this.A07.flip();
        this.A08 = this.A07;
    }

    private void A05(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iA02 = A02(byteBuffer);
        int iPosition = iA02 - byteBuffer.position();
        byte[] bArr = this.A0C;
        int noisePosition = bArr.length;
        int limit = this.A02;
        int noisePosition2 = noisePosition - limit;
        if (iA02 < iLimit && iPosition < noisePosition2) {
            A09(bArr, limit);
            this.A02 = 0;
            String[] strArr = A0E;
            String str = strArr[7];
            String str2 = strArr[2];
            int noisePosition3 = str.length();
            if (noisePosition3 == str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "O6VD7siumNrk7CVoottqf9Wd";
            strArr2[2] = "eko4kK9cp1fEhg6H4c3WRP0k0";
            this.A05 = 0;
            return;
        }
        int maybeSilenceInputSize = Math.min(iPosition, noisePosition2);
        byteBuffer.limit(byteBuffer.position() + maybeSilenceInputSize);
        byteBuffer.get(this.A0C, this.A02, maybeSilenceInputSize);
        int i = this.A02 + maybeSilenceInputSize;
        this.A02 = i;
        byte[] bArr2 = this.A0C;
        if (i == bArr2.length) {
            if (this.A0A) {
                A09(bArr2, this.A03);
                long j = this.A06;
                int noisePosition4 = this.A02;
                this.A06 = j + ((noisePosition4 - (this.A03 * 2)) / this.A00);
            } else {
                this.A06 += (i - this.A03) / this.A00;
            }
            A08(byteBuffer, this.A0C, this.A02);
            this.A02 = 0;
            this.A05 = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private void A06(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int limit = this.A0C.length;
        byteBuffer.limit(Math.min(iLimit, iPosition + limit));
        int noiseLimit = A01(byteBuffer);
        int limit2 = byteBuffer.position();
        if (noiseLimit == limit2) {
            this.A05 = 1;
        } else {
            byteBuffer.limit(noiseLimit);
            A04(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void A07(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iA02 = A02(byteBuffer);
        byteBuffer.limit(iA02);
        long j = this.A06;
        int noisyPosition = byteBuffer.remaining();
        int limit = this.A00;
        this.A06 = j + (noisyPosition / limit);
        byte[] bArr = this.A0D;
        int limit2 = this.A03;
        A08(byteBuffer, bArr, limit2);
        if (iA02 < iLimit) {
            byte[] bArr2 = this.A0D;
            int limit3 = this.A03;
            A09(bArr2, limit3);
            this.A05 = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void A08(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.A03);
        int i2 = this.A03 - iMin;
        System.arraycopy(bArr, i - i2, this.A0D, 0, i2);
        int fromInputSize = byteBuffer.limit();
        byteBuffer.position(fromInputSize - iMin);
        byteBuffer.get(this.A0D, i2, iMin);
    }

    private void A09(byte[] bArr, int i) {
        A03(i);
        this.A07.put(bArr, 0, i);
        this.A07.flip();
        this.A08 = this.A07;
    }

    public final long A0A() {
        return this.A06;
    }

    public final void A0B(boolean z) {
        this.A09 = z;
        flush();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final boolean A4Q(int i, int i2, int i3) throws C0601Aa {
        if (i3 == 2) {
            if (this.A04 == i && this.A01 == i2) {
                return false;
            }
            this.A04 = i;
            this.A01 = i2;
            this.A00 = i2 * 2;
            return true;
        }
        throw new C0601Aa(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final ByteBuffer A7W() {
        ByteBuffer byteBuffer = this.A08;
        ByteBuffer outputBuffer = InterfaceC0602Ab.A00;
        this.A08 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final int A7X() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final int A7Y() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final int A7Z() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final boolean A8w() {
        return this.A04 != -1 && this.A09;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final boolean A91() {
        return this.A0B && this.A08 == InterfaceC0602Ab.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final void AEE() {
        this.A0B = true;
        int i = this.A02;
        if (i > 0) {
            A09(this.A0C, i);
        }
        if (!this.A0A) {
            long j = this.A06;
            int i2 = this.A03 / this.A00;
            String[] strArr = A0E;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[0] = "We9PvBsbdasK7tn9VyyhVUkeOk007ymd";
            strArr2[3] = "bdBvwmZlOtVUMyUHuHiUMKijb9L0xmkD";
            this.A06 = j + i2;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final void AEF(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.A08.hasRemaining()) {
            switch (this.A05) {
                case 0:
                    A06(byteBuffer);
                    break;
                case 1:
                    A05(byteBuffer);
                    break;
                case 2:
                    A07(byteBuffer);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final void flush() {
        if (A8w()) {
            int iA00 = A00(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) * this.A00;
            int maybeSilenceBufferSize = this.A0C.length;
            if (maybeSilenceBufferSize != iA00) {
                this.A0C = new byte[iA00];
            }
            int iA002 = A00(20000L);
            int maybeSilenceBufferSize2 = this.A00;
            int i = iA002 * maybeSilenceBufferSize2;
            this.A03 = i;
            int maybeSilenceBufferSize3 = this.A0D.length;
            if (maybeSilenceBufferSize3 != i) {
                this.A0D = new byte[i];
            }
        }
        this.A05 = 0;
        this.A08 = InterfaceC0602Ab.A00;
        this.A0B = false;
        this.A06 = 0L;
        this.A02 = 0;
        this.A0A = false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final void reset() {
        this.A09 = false;
        flush();
        this.A07 = InterfaceC0602Ab.A00;
        this.A01 = -1;
        this.A04 = -1;
        this.A03 = 0;
        this.A0C = new byte[0];
        this.A0D = new byte[0];
    }
}
