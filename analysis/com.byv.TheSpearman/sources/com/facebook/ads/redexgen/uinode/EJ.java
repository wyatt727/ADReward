package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: assets/audience_network.dex */
public final class EJ implements Y6 {
    public static byte[] A0M;
    public static String[] A0N = {"m3Tqgcaf5Zwh2KVI4lshI8Y9OWjAyKiW", "grdEJ2UvF2rVdGgR2IFX1R9SZI3Oow9U", "adSXB2DteQqbyu8FZt3lmhGSn0N0giaq", "NRdDTd6ed3Jg0yXdfuAl28VADrUF9IBW", "O75rLRuL5gqpexSF7Nk4cqg8fxEEp65Y", "atjqzip57QIi0KmRPtssGorCsXfOnHh4", "4ftStqMBHRnBf64I9Tdbb6", "F7xqVaNkoKYb3tQw5W1HE7EtQtFRVx9Y"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C05789c A05;
    public C05979w A06;
    public C05989x A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Handler A0D;
    public final EI A0E;
    public final AF A0F;
    public final AG A0G;
    public final AbstractC0747Gj A0H;
    public final C0748Gk A0I;
    public final ArrayDeque<C05829g> A0J;
    public final CopyOnWriteArraySet<A0> A0K;
    public final Y5[] A0L;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 6);
            if (A0N[6].length() == 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "Q2Fud838jOFv6puDYoQ5JAWfmkdvAH2h";
            strArr[3] = "Px66e0ytNEnQno4fNGUkfPLcZSToOlLf";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0M = new byte[]{121, -76, -93, -42, -51, -82, -54, -65, -41, -61, -48, -89, -53, -50, -54, 116, -89, -98, Byte.MAX_VALUE, -101, -112, -88, -108, -95, 123, -104, -111, 94, 97, 93, 103, 93, 99, -125, -88, -93, -82, 90, -107, -88, -81, -88, -92, -74, -88, 99, -97, -101, 94, -103, -14, -28, -28, -22, -45, -18, -97, -24, -26, -19, -18, -15, -28, -29, -97, -31, -28, -30, -32, -12, -14, -28, -97, -32, -19, -97, -32, -29, -97, -24, -14, -97, -17, -21, -32, -8, -24, -19, -26};
    }

    static {
        A03();
    }

    public EJ(Y5[] y5Arr, AbstractC0747Gj abstractC0747Gj, InterfaceC05929r interfaceC05929r, InterfaceC0766Hd interfaceC0766Hd) {
        Log.i(A02(2, 13, 88), A02(33, 5, 52) + Integer.toHexString(System.identityHashCode(this)) + A02(0, 2, 83) + A02(15, 18, 41) + A02(47, 3, 56) + IF.A04 + A02(46, 1, 60));
        AbstractC0763Ha.A04(y5Arr.length > 0);
        this.A0L = (Y5[]) AbstractC0763Ha.A01(y5Arr);
        this.A0H = (AbstractC0747Gj) AbstractC0763Ha.A01(abstractC0747Gj);
        this.A0A = false;
        this.A03 = 0;
        this.A0B = false;
        this.A0K = new CopyOnWriteArraySet<>();
        C0748Gk c0748Gk = new C0748Gk(new AB[y5Arr.length], new InterfaceC0744Gg[y5Arr.length], null);
        this.A0I = c0748Gk;
        this.A0G = new AG();
        this.A0F = new AF();
        this.A07 = C05989x.A04;
        final Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        Handler handler = new Handler(looperMyLooper) { // from class: com.facebook.ads.redexgen.X.9f
            public static String[] A01 = {"n8jOK4TugbxocxEe6zYdC2apb8QBw5B2", "exJ9q2BbStmAElE6QlD9JR4gSu8htBEk", "BGOnc", "fVxwFvnWrEIXSQGXaFTt487unfsGWTNS", "M8AH3IesIZMXIj5TZDcC18mK6a9vd0E5", "EIDq0z1OpkYiciQBrU8tJkkKsNLFcNAn", "GYYw65loVBDf2akXR1DT72AGTz3TCOWc", "b13Ux"};

            @Override // android.os.Handler
            public final void handleMessage(Message message) throws Throwable {
                if (KL.A02(this)) {
                    return;
                }
                try {
                    this.A00.A0A(message);
                } catch (Throwable th) {
                    if (A01[3].charAt(19) != 't') {
                        throw new RuntimeException();
                    }
                    A01[6] = "ke6EFi0zu2eoeRmOo8SEy2Wv36xrwBWP";
                    KL.A00(th, this);
                }
            }
        };
        this.A0C = handler;
        this.A06 = new C05979w(AH.A01, 0L, TrackGroupArray.A04, c0748Gk);
        this.A0J = new ArrayDeque<>();
        EI ei = new EI(y5Arr, abstractC0747Gj, c0748Gk, interfaceC05929r, this.A0A, this.A03, this.A0B, handler, this, interfaceC0766Hd);
        this.A0E = ei;
        this.A0D = new Handler(ei.A0w());
    }

    private long A00(long j) {
        long jA01 = C9W.A01(j);
        if (!this.A06.A04.A01()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            long positionMs = this.A0F.A08();
            return jA01 + positionMs;
        }
        return jA01;
    }

    private C05979w A01(boolean z, boolean z2, int i) {
        C0748Gk c0748Gk;
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            this.A04 = 0L;
        } else {
            this.A01 = A6g();
            this.A00 = A07();
            this.A04 = A6d();
        }
        AH ah = z2 ? AH.A01 : this.A06.A03;
        if (A0N[1].charAt(17) == 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A0N;
        strArr[0] = "HCeOoliCNtIhqJVVEoV7ODJTUFyfMCgc";
        strArr[3] = "jOBrxCepwz9IOjYxDZZOtd2HpuVunHZu";
        Object obj = z2 ? null : this.A06.A07;
        C0703Eo c0703Eo = this.A06.A04;
        long j = this.A06.A02;
        long j2 = this.A06.A01;
        TrackGroupArray trackGroupArray = z2 ? TrackGroupArray.A04 : this.A06.A05;
        if (z2) {
            c0748Gk = this.A0I;
        } else {
            c0748Gk = this.A06.A06;
        }
        return new C05979w(ah, obj, c0703Eo, j, j2, i, false, trackGroupArray, c0748Gk);
    }

    private void A04(C05979w c05979w, int i, boolean z, int i2) {
        int i3;
        C05979w c05979wA04 = c05979w;
        int i4 = this.A02 - i;
        this.A02 = i4;
        if (i4 == 0) {
            if (c05979wA04.A02 == -9223372036854775807L) {
                c05979wA04 = c05979wA04.A04(c05979wA04.A04, 0L, c05979wA04.A01);
            }
            if ((!this.A06.A03.A0E() || this.A08) && c05979wA04.A03.A0E()) {
                this.A00 = 0;
                this.A01 = 0;
                this.A04 = 0L;
            }
            if (this.A08) {
                i3 = 0;
            } else {
                i3 = 2;
            }
            boolean z2 = this.A09;
            this.A08 = false;
            this.A09 = false;
            A05(c05979wA04, z, i2, i3, z2, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A05(final C05979w c05979w, final boolean z, final int i, final int i2, final boolean z2, final boolean z3) {
        boolean isRunningRecursiveListenerNotification = !this.A0J.isEmpty();
        ArrayDeque<C05829g> arrayDeque = this.A0J;
        final C05979w c05979w2 = this.A06;
        final CopyOnWriteArraySet<A0> copyOnWriteArraySet = this.A0K;
        final AbstractC0747Gj abstractC0747Gj = this.A0H;
        final boolean z4 = this.A0A;
        arrayDeque.addLast(new Object(c05979w, c05979w2, copyOnWriteArraySet, abstractC0747Gj, z, i, i2, z2, z4, z3) { // from class: com.facebook.ads.redexgen.X.9g
            public static String[] A0C = {"ngVoBp5pr", "xJziJS8oS", "0Acs5KUpAntiIN9SBf", "RdvtHMhhQhD1iGhGKfpT4jwIcRZugl7b", "SwdEOGzegqYmuuXtqS3DnPJA1PQs60Y1", "mjJqNiV5uYYXT5JIaz2mCpImvyi2YwVT", "z", "dC4jFhBSvokHiCeDasSLAsgetwgdiZCj"};
            public final int A00;
            public final int A01;
            public final C05979w A02;
            public final AbstractC0747Gj A03;
            public final Set<A0> A04;
            public final boolean A05;
            public final boolean A06;
            public final boolean A07;
            public final boolean A08;
            public final boolean A09;
            public final boolean A0A;
            public final boolean A0B;

            {
                this.A02 = c05979w;
                this.A04 = copyOnWriteArraySet;
                this.A03 = abstractC0747Gj;
                this.A08 = z;
                this.A00 = i;
                this.A01 = i2;
                this.A09 = z2;
                this.A06 = z4;
                this.A07 = z3 || c05979w2.A00 != c05979w.A00;
                this.A0A = (c05979w2.A03 == c05979w.A03 && c05979w2.A07 == c05979w.A07) ? false : true;
                this.A05 = c05979w2.A08 != c05979w.A08;
                this.A0B = c05979w2.A06 != c05979w.A06;
            }

            public final void A00() {
                Iterator<A0> it;
                if (this.A0A || this.A01 == 0) {
                    Iterator<A0> it2 = this.A04.iterator();
                    while (it2.hasNext()) {
                        it2.next().ADJ(this.A02.A03, this.A02.A07, this.A01);
                    }
                }
                if (this.A08) {
                    for (A0 listener : this.A04) {
                        listener.ACh(this.A00);
                    }
                }
                boolean z5 = this.A0B;
                String[] strArr = A0C;
                if (strArr[6].length() != strArr[2].length()) {
                    A0C[4] = "kVA7KUftqEYsKKgit7KobnVmlfmelHtP";
                    if (z5) {
                        this.A03.A0U(this.A02.A06.A02);
                        for (A0 a0 : this.A04) {
                            C05979w c05979w3 = this.A02;
                            String[] strArr2 = A0C;
                            if (strArr2[0].length() == strArr2[1].length()) {
                                String[] strArr3 = A0C;
                                strArr3[6] = "m";
                                strArr3[2] = "KqMQ2zUn9wEBuYOIrT";
                                a0.ADM(c05979w3.A05, this.A02.A06.A01);
                            }
                        }
                    }
                    boolean z6 = this.A05;
                    if (A0C[5].charAt(4) == 'F') {
                        throw new RuntimeException();
                    }
                    A0C[5] = "SUKzwd9m16qKT5RYTkUj9PT0NEqmu9kE";
                    if (z6) {
                        Iterator<A0> it3 = this.A04.iterator();
                        while (true) {
                            boolean zHasNext = it3.hasNext();
                            if (A0C[4].charAt(10) == 'Y') {
                                String[] strArr4 = A0C;
                                strArr4[6] = "I";
                                strArr4[2] = "zdEQR0QEwobMnnP3YQ";
                                if (!zHasNext) {
                                    break;
                                }
                                A0 listener2 = it3.next();
                                listener2.AC7(this.A02.A08);
                            } else {
                                String[] strArr5 = A0C;
                                strArr5[0] = "7SswXZjoc";
                                strArr5[1] = "LaiVjvUVk";
                                if (!zHasNext) {
                                    break;
                                }
                                A0 listener22 = it3.next();
                                listener22.AC7(this.A02.A08);
                            }
                        }
                    }
                    if (this.A07) {
                        Set<A0> set = this.A04;
                        String[] strArr6 = A0C;
                        if (strArr6[6].length() != strArr6[2].length()) {
                            A0C[5] = "xdr5mmXrWjbqVTrxDMPiLI1UYtBVMgU7";
                            it = set.iterator();
                        } else {
                            A0C[5] = "vgNSEPQsIWHaSH2OFiWclNn1gpDCsXwE";
                            it = set.iterator();
                        }
                        while (it.hasNext()) {
                            it.next().ACf(this.A06, this.A02.A00);
                        }
                    }
                    if (this.A09) {
                        Iterator<A0> it4 = this.A04.iterator();
                        while (it4.hasNext()) {
                            it4.next().AD4();
                        }
                        return;
                    }
                    return;
                }
                throw new RuntimeException();
            }
        });
        this.A06 = c05979w;
        if (isRunningRecursiveListenerNotification) {
            return;
        }
        while (!this.A0J.isEmpty()) {
            this.A0J.peekFirst().A00();
            this.A0J.removeFirst();
        }
    }

    private boolean A06() {
        return this.A06.A03.A0E() || this.A02 > 0;
    }

    public final int A07() {
        if (A06()) {
            return this.A00;
        }
        return this.A06.A04.A02;
    }

    public final void A08(int i) {
        A09(i, -9223372036854775807L);
    }

    public final void A09(int i, long j) {
        long jA00;
        AH ah = this.A06.A03;
        if (i < 0 || (!ah.A0E() && i >= ah.A01())) {
            throw new C05919q(ah, i, j);
        }
        this.A09 = true;
        this.A02++;
        boolean zA0B = A0B();
        String[] strArr = A0N;
        if (strArr[7].charAt(11) == strArr[2].charAt(11)) {
            String[] strArr2 = A0N;
            strArr2[0] = "5JrPhprFhX8le0yHjhtYDABd6qn7MJv2";
            strArr2[3] = "AcgEDj7anvk4CRi6YuD76A9KphiljDlH";
            if (zA0B) {
                Log.w(A02(2, 13, 88), A02(50, 39, 121));
                this.A0C.obtainMessage(0, 1, -1, this.A06).sendToTarget();
                return;
            }
            this.A01 = i;
            if (ah.A0E()) {
                this.A04 = j == -9223372036854775807L ? 0L : j;
                this.A00 = 0;
            } else {
                if (j == -9223372036854775807L) {
                    AG ag = this.A0G;
                    String[] strArr3 = A0N;
                    if (strArr3[0].charAt(24) != strArr3[3].charAt(24)) {
                        A0N[5] = "nEFnc7B5wfhj7ivnhhzsBLpbkebEETny";
                        jA00 = ah.A0B(i, ag).A01();
                    }
                } else {
                    jA00 = C9W.A00(j);
                    if (A0N[5].charAt(0) == 'S') {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A0N;
                    strArr4[0] = "wxFThwrlUUeaJzWEA8zt6g3O6WvT4NEY";
                    strArr4[3] = "Cn8KVFPYAIX7JaaKfRlHGvTkFrF10J5Z";
                }
                Pair<Integer, Long> pairA07 = ah.A07(this.A0G, this.A0F, i, jA00);
                this.A04 = C9W.A01(jA00);
                this.A00 = ((Integer) pairA07.first).intValue();
            }
            this.A0E.A0y(ah, i, C9W.A00(j));
            Iterator<A0> it = this.A0K.iterator();
            while (it.hasNext()) {
                it.next().ACh(1);
            }
            return;
        }
        throw new RuntimeException();
    }

    public final void A0A(Message message) {
        switch (message.what) {
            case 0:
                A04((C05979w) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                C05989x c05989x = (C05989x) message.obj;
                C05989x playbackParameters = this.A07;
                if (!playbackParameters.equals(c05989x)) {
                    this.A07 = c05989x;
                    Iterator<A0> it = this.A0K.iterator();
                    while (it.hasNext()) {
                        it.next().ACb(c05989x);
                    }
                    return;
                }
                return;
            case 2:
                C05789c c05789c = (C05789c) message.obj;
                this.A05 = c05789c;
                String[] strArr = A0N;
                if (strArr[0].charAt(24) == strArr[3].charAt(24)) {
                    throw new RuntimeException();
                }
                A0N[6] = "4yvjfA5Kw";
                Iterator<A0> it2 = this.A0K.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    if (A0N[6].length() == 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0N;
                    strArr2[0] = "M6bFWga7XOh4Nv4psw4qaL9KmcGoAikz";
                    strArr2[3] = "g5TiVjLanBSgFn2xszzFJfFzrFRrWctq";
                    if (zHasNext) {
                        it2.next().ACd(c05789c);
                    } else {
                        return;
                    }
                }
            default:
                throw new IllegalStateException();
        }
    }

    public final boolean A0B() {
        return !A06() && this.A06.A04.A01();
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final void A3Q(A0 a0) {
        this.A0K.add(a0);
    }

    @Override // com.facebook.ads.redexgen.uinode.Y6
    public final A8 A4f(A7 a7) {
        return new A8(this.A0E, a7, this.A06.A03, A6g(), this.A0D);
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final int A6B() {
        long jA6C = A6C();
        long jA6q = A6q();
        if (jA6C == -9223372036854775807L || jA6q == -9223372036854775807L) {
            return 0;
        }
        if (jA6q == 0) {
            return 100;
        }
        return IF.A06((int) ((100 * jA6C) / jA6q), 0, 100);
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final long A6C() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A09);
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final long A6Y() {
        if (A0B()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            AF af = this.A0F;
            if (A0N[4].charAt(19) == 'z') {
                throw new RuntimeException();
            }
            A0N[4] = "eLr0wKhVkEyrTiyBT4e5CdZ3SmFaaZ0Y";
            return af.A08() + C9W.A01(this.A06.A01);
        }
        return A6d();
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final int A6a() {
        if (A0B()) {
            return this.A06.A04.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final int A6b() {
        if (A0B()) {
            return this.A06.A04.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final long A6d() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A0A);
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final AH A6f() {
        return this.A06.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final int A6g() {
        if (A06()) {
            int i = this.A01;
            if (A0N[4].charAt(19) == 'z') {
                throw new RuntimeException();
            }
            A0N[6] = "IPV6VHeKuNfhgMSHvhaXB";
            return i;
        }
        return this.A06.A03.A09(this.A06.A04.A02, this.A0F).A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final long A6q() {
        AH ah = this.A06.A03;
        if (ah.A0E()) {
            return -9223372036854775807L;
        }
        if (A0B()) {
            C0703Eo c0703Eo = this.A06.A04;
            ah.A09(c0703Eo.A02, this.A0F);
            return C9W.A01(this.A0F.A0A(c0703Eo.A00, c0703Eo.A01));
        }
        return ah.A0B(A6g(), this.A0G).A02();
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final boolean A7g() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.uinode.Y6
    public final void AE5(InterfaceC0705Eq interfaceC0705Eq, boolean z, boolean z2) {
        this.A05 = null;
        C05979w c05979wA01 = A01(z, z2, 2);
        this.A08 = true;
        this.A02++;
        this.A0E.A0z(interfaceC0705Eq, z, z2);
        A05(c05979wA01, false, 4, 1, false, false);
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final void AEV() {
        StringBuilder sbAppend = new StringBuilder().append(A02(38, 8, 61)).append(Integer.toHexString(System.identityHashCode(this))).append(A02(0, 2, 83)).append(A02(15, 18, 41));
        String strA02 = A02(47, 3, 56);
        Log.i(A02(2, 13, 88), sbAppend.append(strA02).append(IF.A04).append(strA02).append(C05889m.A00()).append(A02(46, 1, 60)).toString());
        this.A0E.A0x();
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final void AFj(long j) {
        A09(A6g(), j);
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final void AFk() {
        A08(A6g());
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final void AG9(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            this.A0E.A10(z);
            A05(this.A06, false, 4, 1, false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final void AGa(boolean z) {
        if (z) {
            this.A05 = null;
        }
        C05979w c05979wA01 = A01(z, z, 1);
        this.A02++;
        this.A0E.A11(z);
        A05(c05979wA01, false, 4, 1, false, false);
    }
}
