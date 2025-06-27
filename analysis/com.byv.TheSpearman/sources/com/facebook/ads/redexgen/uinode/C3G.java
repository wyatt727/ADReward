package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.3G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3G extends AbstractC05186j implements InterfaceC0779Hq {
    public static byte[] A0E;
    public static String[] A0F = {"2QlMa6qwn7PgdSN4l85jvs7nWajl1MES", "7IDLWOxlh1sFSIB31zRzFYQ7PMnWp72Y", "sIqK", "BoflpFUQeBwwM6pd17Qd", "rQg4TubfQMsXj8fsx3Kc9qFAo71Wl6cI", "0mBM", "Xb0wUTlMwSXhcbJOEuklFsawZUYnk", "6gVYRFlBQUgMJoz7eJC1LBuasB8Ybt5d"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final C0609Ai A0C;
    public final InterfaceC0615Ao A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0E = new byte[]{37, 39, 50, 68, 57, 47, 41, 68, 11, 11, 9, 68, 14, 15, 9, 6, 4, 17, 103, 46, 38, 38, 46, 37, 44, 103, 59, 40, 62, 103, 45, 44, 42, 38, 45, 44, 59, 111, 96, 106, 124, 97, 103, 106, 32, 125, 97, 104, 122, 121, 111, 124, 107, 32, 98, 107, 111, 96, 108, 111, 109, 101, 108, 120, 105, 100, 98, 34, Byte.MAX_VALUE, 108, 122, Base64.padSymbol, 54, Utf8.REPLACEMENT_BYTE, 48, 48, 59, 50, 115, Base64.padSymbol, 49, 43, 48, 42, 59, 54, 33, 60, Utf8.REPLACEMENT_BYTE, 39, 54, 13, 0, 23, 10, 20, 9, 17, 0, 82, 94, 71, 18, 86, 81, 79, 74, 75, 18, 76, 86, 69, 90, 3, 7, 3, 11, 47, 45, 54, 48, 45, 54, 43, 38, 125, 111, 99, 126, 98, 107, 35, 124, 111, 122, 107, 29, 15, 3, 29, 27, 0, 9, 72, 87, 64, 93, 84, 94, 70, 87};
    }

    static {
        A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3G(Context context, DM dm, InterfaceC0629Bc<FrameworkMediaCrypto> interfaceC0629Bc, boolean z, Handler handler, InterfaceC0610Aj interfaceC0610Aj, AU au, InterfaceC0602Ab... interfaceC0602AbArr) {
        this(context, dm, interfaceC0629Bc, z, handler, interfaceC0610Aj, new C1192Xy(au, interfaceC0602AbArr));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3G(Context context, DM dm, InterfaceC0629Bc<FrameworkMediaCrypto> interfaceC0629Bc, boolean z, Handler handler, InterfaceC0610Aj interfaceC0610Aj, InterfaceC0615Ao interfaceC0615Ao) {
        super(1, dm, interfaceC0629Bc, z);
        this.A0B = context.getApplicationContext();
        this.A0D = interfaceC0615Ao;
        this.A0C = new C0609Ai(handler, interfaceC0610Aj);
        interfaceC0615Ao.AG4(new C1190Xw(this));
    }

    private int A00(DG dg, Format format) {
        PackageManager packageManager;
        if (IF.A02 < 24 && A04(15, 22, 10).equals(dg.A02)) {
            boolean z = true;
            if (IF.A02 == 23 && (packageManager = this.A0B.getPackageManager()) != null) {
                boolean needsRawDecoderWorkaround = packageManager.hasSystemFeature(A04(37, 25, 77));
                if (needsRawDecoderWorkaround) {
                    z = false;
                }
            }
            if (z) {
                return -1;
            }
        }
        return format.A09;
    }

    private final int A01(DG dg, Format format, Format[] formatArr) {
        int maxInputSize = A00(dg, format);
        return maxInputSize;
    }

    private final MediaFormat A02(Format format, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A04(113, 4, 45), str);
        mediaFormat.setInteger(A04(71, 13, 29), format.A05);
        mediaFormat.setInteger(A04(125, 11, 77), format.A0C);
        DS.A06(mediaFormat, format.A0P);
        DS.A04(mediaFormat, A04(99, 14, 124), i);
        if (IF.A02 >= 23) {
            mediaFormat.setInteger(A04(117, 8, 28), 0);
        }
        return mediaFormat;
    }

    private void A05() {
        long jA6e = this.A0D.A6e(A91());
        if (jA6e != Long.MIN_VALUE) {
            if (!this.A08) {
                long newCurrentPositionUs = this.A05;
                jA6e = Math.max(newCurrentPositionUs, jA6e);
            }
            this.A05 = jA6e;
            this.A08 = false;
        }
    }

    public static boolean A08(String str) {
        if (IF.A02 < 24 && A04(0, 15, 41).equals(str)) {
            if (A04(136, 7, 45).equals(IF.A05)) {
                if (!IF.A03.startsWith(A04(Opcodes.D2L, 8, 113)) && !IF.A03.startsWith(A04(84, 7, 16))) {
                    boolean zStartsWith = IF.A03.startsWith(A04(91, 8, 38));
                    if (A0F[0].charAt(11) == 'E') {
                        throw new RuntimeException();
                    }
                    A0F[7] = "opGrTNmI0QvRBzLgsKXfoISibxDPDheH";
                    if (zStartsWith) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean A09(String str) {
        int iA00 = AbstractC0781Hs.A00(str);
        return iA00 != 0 && this.A0D.A90(iA00);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j, com.facebook.ads.redexgen.uinode.EM
    public final void A13() {
        super.A13();
        this.A0D.AE2();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j, com.facebook.ads.redexgen.uinode.EM
    public final void A14() {
        A05();
        this.A0D.pause();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j, com.facebook.ads.redexgen.uinode.EM
    public final void A15() {
        try {
            this.A0D.AEV();
            try {
                super.A15();
                this.A0U.A00();
                this.A0C.A04(this.A0U);
                String[] strArr = A0F;
                if (strArr[5].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                A0F[0] = "oD9vMZ2y7vvHJ8P8Vn8jWHJMMQFHYWzQ";
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A15();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j, com.facebook.ads.redexgen.uinode.EM
    public final void A16(long j, boolean z) throws C05789c {
        super.A16(j, z);
        this.A0D.reset();
        this.A05 = j;
        this.A07 = true;
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j, com.facebook.ads.redexgen.uinode.EM
    public final void A17(boolean z) throws C05789c {
        super.A17(z);
        this.A0C.A05(this.A0U);
        int i = A12().A00;
        if (i != 0) {
            this.A0D.A5W(i);
        } else {
            this.A0D.A59();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j
    public final int A1B(MediaCodec mediaCodec, DG dg, Format format, Format format2) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd A[PHI: r0
      0x00bd: PHI (r0v18 int) = (r0v14 int), (r0v21 int) binds: [B:61:0x00db, B:48:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5 A[PHI: r0
      0x00c5: PHI (r0v15 int) = (r0v14 int), (r0v18 int), (r0v21 int) binds: [B:61:0x00db, B:50:0x00c3, B:48:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A1C(com.facebook.ads.redexgen.uinode.DM r15, com.facebook.ads.redexgen.uinode.InterfaceC0629Bc<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> r16, com.facebook.ads.internal.exoplayer2.thirdparty.Format r17) throws com.facebook.ads.redexgen.uinode.DP {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C3G.A1C(com.facebook.ads.redexgen.X.DM, com.facebook.ads.redexgen.X.Bc, com.facebook.ads.internal.exoplayer2.thirdparty.Format):int");
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j
    public final DG A1F(DM dm, Format format, boolean z) throws DP {
        DG passthroughDecoderInfo;
        if (A09(format.A0O) && (passthroughDecoderInfo = dm.A7c()) != null) {
            return passthroughDecoderInfo;
        }
        return super.A1F(dm, format, z);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j
    public final void A1I() throws C05789c {
        try {
            this.A0D.AE3();
        } catch (C0614An e) {
            throw C05789c.A01(e, A0z());
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x006a */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1L(android.media.MediaCodec r11, android.media.MediaFormat r12) throws com.facebook.ads.redexgen.uinode.C05789c {
        /*
            r10 = this;
            android.media.MediaFormat r3 = r10.A06
            if (r3 == 0) goto L29
            r2 = 113(0x71, float:1.58E-43)
            r1 = 4
            r0 = 45
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.String r3 = r3.getString(r0)
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C3G.A0F
            r0 = 5
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L29:
            int r3 = r10.A04
            goto L3e
        L2c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C3G.A0F
            java.lang.String r1 = "rkxX"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "9ODr"
            r0 = 2
            r2[r0] = r1
            int r3 = com.facebook.ads.redexgen.uinode.AbstractC0781Hs.A00(r3)
            android.media.MediaFormat r12 = r10.A06
        L3e:
            r2 = 71
            r1 = 13
            r0 = 29
            java.lang.String r0 = A04(r2, r1, r0)
            int r4 = r12.getInteger(r0)
            r2 = 125(0x7d, float:1.75E-43)
            r1 = 11
            r0 = 77
            java.lang.String r0 = A04(r2, r1, r0)
            int r5 = r12.getInteger(r0)
            boolean r0 = r10.A09
            if (r0 == 0) goto L71
            r1 = 6
            if (r4 != r1) goto L71
            int r0 = r10.A00
            if (r0 >= r1) goto L71
            int[] r7 = new int[r0]
            r1 = 0
        L68:
            int r0 = r10.A00
            if (r1 >= r0) goto L72
            r7[r1] = r1
            int r1 = r1 + 1
            goto L68
        L71:
            r7 = 0
        L72:
            com.facebook.ads.redexgen.X.Ao r2 = r10.A0D     // Catch: com.facebook.ads.redexgen.uinode.C0611Ak -> L7d
            r6 = 0
            int r8 = r10.A02     // Catch: com.facebook.ads.redexgen.uinode.C0611Ak -> L7d
            int r9 = r10.A03     // Catch: com.facebook.ads.redexgen.uinode.C0611Ak -> L7d
            r2.A4P(r3, r4, r5, r6, r7, r8, r9)     // Catch: com.facebook.ads.redexgen.uinode.C0611Ak -> L7d
            return
        L7d:
            r1 = move-exception
            int r0 = r10.A0z()
            com.facebook.ads.redexgen.X.9c r0 = com.facebook.ads.redexgen.uinode.C05789c.A01(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C3G.A1L(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j
    public final void A1M(Format format) throws C05789c {
        int i;
        super.A1M(format);
        this.A0C.A03(format);
        if (A04(62, 9, 78).equals(format.A0O)) {
            i = format.A0A;
        } else {
            i = 2;
        }
        this.A04 = i;
        this.A00 = format.A05;
        this.A02 = format.A06;
        this.A03 = format.A07;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j
    public final void A1N(C1185Xr c1185Xr) {
        if (this.A07 && !c1185Xr.A03()) {
            if (Math.abs(c1185Xr.A00 - this.A05) > 500000) {
                this.A05 = c1185Xr.A00;
            }
            this.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j
    public final void A1O(DG dg, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.A01 = A01(dg, format, A1A());
        this.A09 = A08(dg.A02);
        this.A0A = dg.A04;
        MediaFormat mediaFormatA02 = A02(format, dg.A01 == null ? A04(62, 9, 78) : dg.A01, this.A01);
        mediaCodec.configure(mediaFormatA02, (Surface) null, mediaCrypto, 0);
        if (this.A0A) {
            this.A06 = mediaFormatA02;
            String strA04 = A04(113, 4, 45);
            String codecMimeType = format.A0O;
            mediaFormatA02.setString(strA04, codecMimeType);
            return;
        }
        this.A06 = null;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j
    public final void A1P(String str, long j, long j2) {
        this.A0C.A06(str, j, j2);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j
    public final boolean A1Q(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws Exception {
        if (this.A0A && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.A0U.A08++;
            this.A0D.A8U();
            return true;
        }
        try {
            if (!this.A0D.A8R(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.A0U.A06++;
            return true;
        } catch (C0612Al | C0614An e) {
            throw C05789c.A01(e, A0z());
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.EM, com.facebook.ads.redexgen.uinode.Y5
    public final InterfaceC0779Hq A7N() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0779Hq
    public final C05989x A7h() {
        return this.A0D.A7h();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0779Hq
    public final long A7k() {
        if (A81() == 2) {
            A05();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.uinode.EM, com.facebook.ads.redexgen.uinode.A7
    public final void A8V(int i, Object obj) throws C05789c {
        switch (i) {
            case 2:
                this.A0D.setVolume(((Float) obj).floatValue());
                break;
            case 3:
                this.A0D.AFs((AT) obj);
                break;
            default:
                super.A8V(i, obj);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j, com.facebook.ads.redexgen.uinode.Y5
    public final boolean A91() {
        return super.A91() && this.A0D.A91();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05186j, com.facebook.ads.redexgen.uinode.Y5
    public final boolean A9C() {
        return this.A0D.A8Z() || super.A9C();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0779Hq
    public final C05989x AGA(C05989x c05989x) {
        return this.A0D.AGA(c05989x);
    }
}
