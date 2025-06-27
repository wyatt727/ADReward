package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CD implements WP, InterfaceC0647Bu, H6<WT>, H9, FA {
    public static byte[] A0c;
    public static String[] A0d = {"uM3", "HhtEoeszujhq2hqW803X6wAUFNr2yIvk", "llgRlYE2HHrDKVr9Tlv1gg4sawaKL", "gd26Zevc0BeMQVnsPvgEWj4kMHitbDqE", "B56DgxYfwXnRdFUWoxgY8ZwWxUmrPQlR", "o6X9hbG4Io42IRbcZylLcsRNIhbJFPRA", "SBfu1SOz9uKNnyoy8", "5PtJb97AhuhjIJJCziWFyl83Esr9CMYA"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C1 A07;
    public WQ A08;
    public TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final Uri A0Q;
    public final C0699Ek A0S;
    public final InterfaceC0700El A0T;
    public final F1 A0U;
    public final InterfaceC0750Gm A0V;
    public final InterfaceC0758Gu A0W;
    public final String A0b;
    public final C1135Vq A0X = new C1135Vq(A07(0, 27, 27));
    public final C0769Hg A0Y = new C0769Hg();
    public final Runnable A0Z = new RunnableC0697Ei(this);
    public final Runnable A0a = new RunnableC0698Ej(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public WO[] A0K = new WO[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0c, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0c = new byte[]{78, 109, 99, 102, 103, 112, 56, 71, 122, 118, 112, 99, 97, 118, 109, 112, 79, 103, 102, 107, 99, 82, 103, 112, 107, 109, 102};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long AFm(InterfaceC0744Gg[] interfaceC0744GgArr, boolean[] zArr, FB[] fbArr, boolean[] zArr2, long j) {
        AbstractC0763Ha.A04(this.A0F);
        int i = this.A01;
        int i2 = 0;
        while (true) {
            int i3 = 0;
            if (i2 >= interfaceC0744GgArr.length) {
                boolean z = !this.A0I ? j == 0 : i != 0;
                for (int i4 = 0; i4 < interfaceC0744GgArr.length; i4++) {
                    if (fbArr[i4] == null && interfaceC0744GgArr[i4] != null) {
                        InterfaceC0744Gg interfaceC0744Gg = interfaceC0744GgArr[i4];
                        AbstractC0763Ha.A04(interfaceC0744Gg.length() == 1);
                        AbstractC0763Ha.A04(interfaceC0744Gg.A7C(0) == 0);
                        int iA00 = this.A09.A00(interfaceC0744Gg.A8A());
                        AbstractC0763Ha.A04(!this.A0L[iA00]);
                        this.A01++;
                        this.A0L[iA00] = true;
                        fbArr[i4] = new WS(this, iA00);
                        zArr2[i4] = true;
                        if (!z) {
                            WO wo = this.A0K[iA00];
                            wo.A0J();
                            z = wo.A0D(j, true, true) == -1 && wo.A0B() != 0;
                        }
                    }
                }
                if (this.A01 == 0) {
                    this.A0E = false;
                    this.A0D = false;
                    if (this.A0X.A08()) {
                        WO[] woArr = this.A0K;
                        int length = woArr.length;
                        while (i3 < length) {
                            woArr[i3].A0H();
                            i3++;
                        }
                        this.A0X.A05();
                    } else {
                        WO[] woArr2 = this.A0K;
                        int length2 = woArr2.length;
                        while (i3 < length2) {
                            woArr2[i3].A0I();
                            i3++;
                        }
                    }
                } else if (z) {
                    j = AFl(j);
                    for (int i5 = 0; i5 < fbArr.length; i5++) {
                        if (fbArr[i5] != null) {
                            zArr2[i5] = true;
                        }
                    }
                }
                this.A0I = true;
                return j;
            }
            FB fb = fbArr[i2];
            String[] strArr = A0d;
            if (strArr[4].charAt(19) == strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            A0d[2] = "mg4ta7ka0nUwB4FGZ9fOP";
            if (fb != null && (interfaceC0744GgArr[i2] == null || !zArr[i2])) {
                int i6 = ((WS) fbArr[i2]).A00;
                AbstractC0763Ha.A04(this.A0L[i6]);
                this.A01--;
                this.A0L[i6] = false;
                fbArr[i2] = null;
            }
            i2++;
        }
    }

    static {
        A0B();
    }

    public CD(Uri uri, InterfaceC0758Gu interfaceC0758Gu, InterfaceC0645Bs[] interfaceC0645BsArr, int i, F1 f1, InterfaceC0700El interfaceC0700El, InterfaceC0750Gm interfaceC0750Gm, String str, int i2) {
        this.A0Q = uri;
        this.A0W = interfaceC0758Gu;
        this.A0O = i;
        this.A0U = f1;
        this.A0T = interfaceC0700El;
        this.A0V = interfaceC0750Gm;
        this.A0b = str;
        this.A0P = i2;
        this.A0S = new C0699Ek(interfaceC0645BsArr, this);
        this.A00 = i == -1 ? 3 : i;
        f1.A03();
    }

    private int A00() {
        int i = 0;
        for (WO wo : this.A0K) {
            int extractedSamplesCount = wo.A0C();
            i += extractedSamplesCount;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.H6
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int AC2(WT wt, long j, long j2, IOException iOException) {
        boolean isErrorFatal = A0N(iOException);
        this.A0U.A0H(wt.A03, 1, -1, null, 0, null, wt.A02, this.A03, j, j2, wt.A00, iOException, isErrorFatal);
        A0E(wt);
        if (isErrorFatal) {
            return 3;
        }
        int iA00 = A00();
        boolean madeProgress = iA00 > this.A02;
        if (A0L(wt, iA00)) {
            return madeProgress ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        long jMax = Long.MIN_VALUE;
        for (WO wo : this.A0K) {
            long largestQueuedTimestampUs = wo.A0F();
            jMax = Math.max(jMax, largestQueuedTimestampUs);
        }
        return jMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        if (this.A0G || this.A0F || this.A07 == null || !this.A0H) {
            return;
        }
        for (WO wo : this.A0K) {
            if (wo.A0G() == null) {
                return;
            }
        }
        this.A0Y.A01();
        int length = this.A0K.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        this.A0N = new boolean[length];
        this.A0L = new boolean[length];
        this.A0M = new boolean[length];
        this.A03 = this.A07.A6r();
        int i = 0;
        while (true) {
            boolean isAudioVideo = true;
            if (i >= length) {
                break;
            }
            Format formatA0G = this.A0K[i].A0G();
            trackGroupArr[i] = new TrackGroup(formatA0G);
            String str = formatA0G.A0O;
            if (!AbstractC0781Hs.A0B(str) && !AbstractC0781Hs.A09(str)) {
                isAudioVideo = false;
            }
            this.A0N[i] = isAudioVideo;
            this.A0A |= isAudioVideo;
            i++;
        }
        this.A09 = new TrackGroupArray(trackGroupArr);
        if (this.A0O == -1 && this.A05 == -1 && this.A07.A6r() == -9223372036854775807L) {
            String[] strArr = A0d;
            String str2 = strArr[4];
            String str3 = strArr[5];
            int iCharAt = str2.charAt(19);
            int trackCount = str3.charAt(19);
            if (iCharAt == trackCount) {
                throw new RuntimeException();
            }
            A0d[2] = "7a3gC0RfnKvRSexgB6r2d4KLSEZ";
            this.A00 = 6;
        }
        this.A0F = true;
        this.A0T.AD9(this.A03, this.A07.A9I());
        this.A08.ACj(this);
    }

    private void A0A() {
        WT wt = new WT(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            AbstractC0763Ha.A04(A0I());
            long j = this.A03;
            if (j != -9223372036854775807L && this.A06 >= j) {
                this.A0B = true;
                this.A06 = -9223372036854775807L;
                return;
            } else {
                wt.A04(this.A07.A7t(this.A06).A00.A00, this.A06);
                this.A06 = -9223372036854775807L;
            }
        }
        this.A02 = A00();
        this.A0U.A0E(wt.A03, 1, -1, null, 0, null, wt.A02, this.A03, this.A0X.A04(wt, this, this.A00));
    }

    private void A0C(int i) {
        if (!this.A0M[i]) {
            Format formatA01 = this.A09.A01(i).A01(0);
            this.A0U.A06(AbstractC0781Hs.A01(formatA01.A0O), formatA01, 0, null, this.A04);
            boolean[] zArr = this.A0M;
            if (A0d[2].length() == 31) {
                throw new RuntimeException();
            }
            A0d[2] = "eh27oOHcwVOmHzYfi8kDTS";
            zArr[i] = true;
        }
    }

    private void A0D(int i) {
        if (this.A0E && this.A0N[i] && !this.A0K[i].A0M()) {
            String[] strArr = A0d;
            if (strArr[7].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[6] = "sgNFiq5UDquEcD4Be";
            strArr2[0] = "0a9";
            this.A06 = 0L;
            this.A0E = false;
            this.A0D = true;
            this.A04 = 0L;
            this.A02 = 0;
            for (WO wo : this.A0K) {
                wo.A0I();
            }
            this.A08.ABC(this);
        }
    }

    private void A0E(WT wt) {
        if (this.A05 != -1) {
            return;
        }
        this.A05 = wt.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.H6
    /* renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final void AC1(WT wt, long j, long j2) {
        long j3;
        if (this.A03 == -9223372036854775807L) {
            long jA02 = A02();
            if (jA02 == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = 10000 + jA02;
            }
            this.A03 = j3;
            this.A0T.AD9(j3, this.A07.A9I());
        }
        this.A0U.A0G(wt.A03, 1, -1, null, 0, null, wt.A02, this.A03, j, j2, wt.A00);
        A0E(wt);
        this.A0B = true;
        this.A08.ABC(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.H6
    /* renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final void ABz(WT wt, long j, long j2, boolean z) {
        this.A0U.A0F(wt.A03, 1, -1, null, 0, null, wt.A02, this.A03, j, j2, wt.A00);
        if (!z) {
            A0E(wt);
            for (WO wo : this.A0K) {
                wo.A0I();
            }
            if (this.A01 > 0) {
                this.A08.ABC(this);
            }
        }
    }

    private boolean A0I() {
        return this.A06 != -9223372036854775807L;
    }

    private boolean A0J() {
        return this.A0D || A0I();
    }

    private boolean A0K(long j) {
        int length = this.A0K.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return true;
            }
            WO wo = this.A0K[i];
            wo.A0J();
            int i2 = wo.A0D(j, true, false);
            boolean seekInsideQueue = i2 != -1;
            if (!seekInsideQueue) {
                if (this.A0N[i]) {
                    break;
                }
                boolean z = this.A0A;
                String[] strArr = A0d;
                String str = strArr[4];
                String str2 = strArr[5];
                int i3 = str.charAt(19);
                int trackCount = str2.charAt(19);
                if (i3 == trackCount) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0d;
                strArr2[7] = "iCn5X7g6PoYVWCe4GwpQYWYt9drfTGBT";
                strArr2[1] = "IDd3eJ2NBG0wgz78gdspZyWtrcrofueQ";
                if (!z) {
                    break;
                }
            }
            i++;
        }
        return false;
    }

    private boolean A0L(WT wt, int i) {
        C1 c1;
        if (this.A05 != -1 || ((c1 = this.A07) != null && c1.A6r() != -9223372036854775807L)) {
            this.A02 = i;
            if (A0d[2].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0d;
            strArr[6] = "F1SGTXFlfQdsRtCv2";
            strArr[0] = "c29";
            return true;
        }
        if (this.A0F && !A0J()) {
            this.A0E = true;
            return false;
        }
        this.A0D = this.A0F;
        this.A04 = 0L;
        this.A02 = 0;
        for (WO wo : this.A0K) {
            wo.A0I();
        }
        wt.A04(0L, 0L);
        return true;
    }

    public static boolean A0N(IOException iOException) {
        return iOException instanceof WM;
    }

    public final int A0O(int i, long j) {
        int iA0D;
        if (A0J()) {
            return 0;
        }
        WO wo = this.A0K[i];
        if (this.A0B && j > wo.A0F()) {
            iA0D = wo.A0A();
        } else {
            iA0D = wo.A0D(j, true, true);
            String[] strArr = A0d;
            String str = strArr[4];
            String str2 = strArr[5];
            int skipCount = str.charAt(19);
            if (skipCount == str2.charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[6] = "NIYG9FQCzFZSe10IE";
            strArr2[0] = "6cN";
            if (iA0D == -1) {
                iA0D = 0;
            }
        }
        if (iA0D > 0) {
            A0C(i);
        } else {
            A0D(i);
        }
        return iA0D;
    }

    public final int A0P(int i, C05909p c05909p, C1185Xr c1185Xr, boolean z) {
        if (A0J()) {
            return -3;
        }
        int iA0E = this.A0K[i].A0E(c05909p, c1185Xr, z, this.A0B, this.A04);
        if (iA0E == -4) {
            A0C(i);
        } else if (iA0E == -3) {
            A0D(i);
        }
        return iA0E;
    }

    public final void A0Q() throws IOException {
        this.A0X.A06(this.A00);
    }

    public final void A0R() {
        if (this.A0F) {
            for (WO wo : this.A0K) {
                wo.A0H();
            }
        }
        this.A0X.A07(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A04();
    }

    public final boolean A0S(int i) {
        return !A0J() && (this.A0B || this.A0K[i].A0M());
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final boolean A4T(long j) {
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F && this.A01 == 0) {
            return false;
        }
        boolean zA02 = this.A0Y.A02();
        boolean continuedLoading = this.A0X.A08();
        if (!continuedLoading) {
            A0A();
            return true;
        }
        return zA02;
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final void A5A(long j, boolean z) {
        int length = this.A0K.length;
        for (int i = 0; i < length; i++) {
            this.A0K[i].A0K(j, z, this.A0L[i]);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0647Bu
    public final void A5Y() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long A5x(long j, AD ad) {
        if (!this.A07.A9I()) {
            return 0L;
        }
        C0 c0A7t = this.A07.A7t(j);
        return IF.A0I(j, ad, c0A7t.A00.A01, c0A7t.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long A6D() {
        long jA02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0I()) {
            long j = this.A06;
            String[] strArr = A0d;
            if (strArr[7].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            A0d[3] = "ld4wWqv9tK9nTvU7QEEl8vpde5wWqGSi";
            return j;
        }
        if (this.A0A) {
            jA02 = Long.MAX_VALUE;
            int i = this.A0K.length;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A0N[i2]) {
                    jA02 = Math.min(jA02, this.A0K[i2].A0F());
                }
            }
        } else {
            jA02 = A02();
        }
        if (jA02 == Long.MIN_VALUE) {
            return this.A04;
        }
        return jA02;
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long A7U() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A6D();
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final TrackGroupArray A8B() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final void AAN() throws IOException {
        A0Q();
    }

    @Override // com.facebook.ads.redexgen.uinode.H9
    public final void AC6() {
        for (WO wo : this.A0K) {
            wo.A0I();
        }
        this.A0S.A03();
    }

    @Override // com.facebook.ads.redexgen.uinode.FA
    public final void ADS(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final void AE4(WQ wq, long j) {
        this.A08 = wq;
        this.A0Y.A02();
        A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long AEL() {
        if (!this.A0C) {
            this.A0U.A05();
            this.A0C = true;
        }
        boolean z = this.A0D;
        String[] strArr = A0d;
        if (strArr[6].length() != strArr[0].length()) {
            A0d[2] = "";
            if (z && (this.A0B || A00() > this.A02)) {
                this.A0D = false;
                return this.A04;
            }
            String[] strArr2 = A0d;
            if (strArr2[7].charAt(26) == strArr2[1].charAt(26)) {
                String[] strArr3 = A0d;
                strArr3[4] = "a8TiTKBNhx8jXxPRrcAgh1BUcIw96G2f";
                strArr3[5] = "NHpS1UqcJuZi4hHtySMRiLK65X8yfSYb";
                return -9223372036854775807L;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final void AER(long j) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0647Bu
    public final void AFi(C1 c1) {
        this.A07 = c1;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long AFl(long j) {
        if (!this.A07.A9I()) {
            j = 0;
        }
        this.A04 = j;
        this.A0D = false;
        if (!A0I()) {
            boolean zA0K = A0K(j);
            String[] strArr = A0d;
            if (strArr[4].charAt(19) == strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[4] = "4t4h1X84Q9aXzP6i3O1IFqP61fZwJyic";
            strArr2[5] = "YchhDxV7HDCpyjRy2lVbypcIuIxdt4SR";
            if (zA0K) {
                return j;
            }
        }
        this.A0E = false;
        this.A06 = j;
        this.A0B = false;
        if (this.A0X.A08()) {
            this.A0X.A05();
        } else {
            for (WO wo : this.A0K) {
                wo.A0I();
            }
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0647Bu
    public final C4 AGi(int i, int i2) {
        int length = this.A0K.length;
        for (int i3 = 0; i3 < length; i3++) {
            int trackCount = this.A0J[i3];
            if (trackCount == i) {
                return this.A0K[i3];
            }
        }
        WO wo = new WO(this.A0V);
        wo.A0L(this);
        int trackCount2 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.A0J, trackCount2);
        this.A0J = iArrCopyOf;
        iArrCopyOf[length] = i;
        int trackCount3 = length + 1;
        WO[] woArr = (WO[]) Arrays.copyOf(this.A0K, trackCount3);
        this.A0K = woArr;
        woArr[length] = wo;
        return wo;
    }
}
