package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public final class EI implements Handler.Callback, WQ, InterfaceC0746Gi, InterfaceC0704Ep, C9Z, A6 {
    public static byte[] A0V;
    public static String[] A0W = {"TSIQGmaqgvrUxo0yYDewkVNDuuioOpPV", "LhstooR1wZsH8RVMZSyyF7FJZ5wrHutR", "WZmkRBn8iXpnqDBIN644YOqcruHieEQJ", "OBm1ApV8rqkCiyt7FxArHXpNA0", "RSLtmQKc5IgtmDXEpea3qKBmF", "cT5hSyxhu4oYAFMn61C1ja3cHbuAf9wl", "QQz6Qig88n9IGtqyO", "pBG4ezF2k8D44jdvacVEPM0q7VNUtk0G"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C05879l A04;
    public C05979w A05;
    public InterfaceC0705Eq A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public Y5[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final Y8 A0G;
    public final Y6 A0H;
    public final InterfaceC05929r A0J;
    public final AF A0L;
    public final AG A0M;
    public final AbstractC0747Gj A0N;
    public final C0748Gk A0O;
    public final InterfaceC0766Hd A0P;
    public final InterfaceC0776Hn A0Q;
    public final ArrayList<C05859j> A0R;
    public final boolean A0S;
    public final Y5[] A0T;
    public final AA[] A0U;
    public final C05959u A0K = new C05959u();
    public AD A06 = AD.A03;
    public final C05869k A0I = new C05869k();

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A07() throws IOException, C05789c {
        long jAGs = this.A0P.AGs();
        A0I();
        if (!this.A0K.A0P()) {
            A0B();
            A0R(jAGs, 10L);
            return;
        }
        C05939s c05939sA0G = this.A0K.A0G();
        IC.A02(A06(150, 10, 20));
        A0J();
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        c05939sA0G.A08.A5A(this.A05.A0A - this.A0D, this.A0S);
        boolean z = true;
        boolean z2 = true;
        for (Y5 y5 : this.A0C) {
            y5.AFB(this.A03, jElapsedRealtime);
            boolean z3 = true;
            z = z && y5.A91();
            boolean z4 = y5.A9C() || y5.A91() || A0s(y5);
            if (!z4) {
                y5.AAP();
            }
            if (!z2 || !z4) {
                z3 = false;
            }
            z2 = z3;
        }
        if (!z2) {
            A0B();
        }
        long j = c05939sA0G.A02.A01;
        if (z && ((j == -9223372036854775807L || j <= this.A05.A0A) && c05939sA0G.A02.A05)) {
            A0N(4);
            A0H();
        } else if (this.A05.A00 == 2 && A0u(z2)) {
            A0N(3);
            if (this.A08) {
                A0G();
            }
        } else if (this.A05.A00 == 3) {
            int length = this.A0C.length;
            String[] strArr = A0W;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[4] = "Eggx5Ft4Lgnx6HVrotcHBkscR";
            strArr2[3] = "Urp4oA4mdP1paz0o5Y10JqXrCe";
            if (length != 0 ? !z2 : !A0q()) {
                this.A09 = this.A08;
                A0N(2);
                A0H();
            }
        }
        if (this.A05.A00 == 2) {
            for (Y5 y52 : this.A0C) {
                y52.AAP();
            }
        }
        boolean z5 = this.A08;
        if (A0W[7].charAt(9) != '8') {
            throw new RuntimeException();
        }
        A0W[5] = "rTELFOhgZqImPwKgVJI0nXuoysvpkaxO";
        if ((z5 && this.A05.A00 == 3) || this.A05.A00 == 2) {
            A0R(jAGs, 10L);
        } else if (this.A0C.length == 0 || this.A05.A00 == 4) {
            this.A0Q.AF8(2);
        } else {
            A0R(jAGs, 1000L);
        }
        IC.A00();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0E() throws com.facebook.ads.redexgen.uinode.C05789c {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.EI.A0E():void");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0I() throws java.io.IOException, com.facebook.ads.redexgen.uinode.C05789c {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.EI.A0I():void");
    }

    public static void A0K() {
        byte[] bArr = {68, 121, 110, 81, 109, 96, 120, 100, 115, 72, 108, 113, 109, 72, 111, 117, 100, 115, 111, 96, 109, 111, 82, 69, 122, 70, 75, 83, 79, 88, 99, 71, 90, 70, 99, 68, 94, 79, 88, 68, 75, 70, 16, 98, 75, 68, 78, 70, 79, 88, 66, 108, 101, 100, 121, 98, 101, 108, 43, 102, 110, 120, 120, 106, 108, 110, 120, 43, 120, 110, 101, Byte.MAX_VALUE, 43, 106, 109, Byte.MAX_VALUE, 110, 121, 43, 121, 110, 103, 110, 106, 120, 110, 37, 69, 98, 120, 105, 126, 98, 109, 96, 44, 126, 121, 98, 120, 101, 97, 105, 44, 105, 126, 126, 99, 126, 34, 24, 36, 41, 49, 42, 41, 43, 35, 104, 45, 58, 58, 39, 58, 102, 74, 118, 108, 107, 122, 124, 57, 124, 107, 107, 118, 107, 55, 72, 111, 116, 107, 59, 125, 122, 114, 119, 126, Byte.MAX_VALUE, 53, 90, 81, 109, 81, 83, 91, 105, 81, 76, 85};
        String[] strArr = A0W;
        if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
            throw new RuntimeException();
        }
        A0W[7] = "OuUcfGxYs8HKuxzYIQS3N8YCcqwYwO9D";
        A0V = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0S(C05849i c05849i) throws C05789c {
        if (c05849i.A01 != this.A07) {
            return;
        }
        AH ah = this.A05.A03;
        AH ah2 = c05849i.A00;
        Object obj = c05849i.A02;
        this.A0K.A0N(ah2);
        this.A05 = this.A05.A03(ah2, obj);
        A0F();
        int i = this.A01;
        if (i > 0) {
            this.A0I.A03(i);
            this.A01 = 0;
            C05879l c05879l = this.A04;
            if (c05879l != null) {
                Pair<Integer, Long> pairA04 = A04(c05879l, true);
                this.A04 = null;
                if (pairA04 == null) {
                    A08();
                    return;
                }
                int iIntValue = ((Integer) pairA04.first).intValue();
                long jLongValue = ((Long) pairA04.second).longValue();
                C0703Eo c0703EoA0L = this.A0K.A0L(iIntValue, jLongValue);
                this.A05 = this.A05.A04(c0703EoA0L, c0703EoA0L.A01() ? 0L : jLongValue, jLongValue);
                return;
            }
            if (this.A05.A02 == -9223372036854775807L) {
                if (ah2.A0E()) {
                    A08();
                    return;
                }
                Pair<Integer, Long> pairA05 = A05(ah2, ah2.A05(this.A0B), -9223372036854775807L);
                int iIntValue2 = ((Integer) pairA05.first).intValue();
                long jLongValue2 = ((Long) pairA05.second).longValue();
                C0703Eo c0703EoA0L2 = this.A0K.A0L(iIntValue2, jLongValue2);
                this.A05 = this.A05.A04(c0703EoA0L2, c0703EoA0L2.A01() ? 0L : jLongValue2, jLongValue2);
                return;
            }
            return;
        }
        int i2 = this.A05.A04.A02;
        long j = this.A05.A01;
        if (ah.A0E()) {
            if (ah2.A0E()) {
                return;
            }
            C0703Eo c0703EoA0L3 = this.A0K.A0L(i2, j);
            this.A05 = this.A05.A04(c0703EoA0L3, c0703EoA0L3.A01() ? 0L : j, j);
            return;
        }
        C05939s c05939sA0E = this.A0K.A0E();
        int iA04 = ah2.A04(c05939sA0E == null ? ah.A0A(i2, this.A0L, true).A03 : c05939sA0E.A09);
        if (iA04 != -1) {
            if (iA04 != i2) {
                this.A05 = this.A05.A01(iA04);
            }
            C0703Eo c0703Eo = this.A05.A04;
            if (c0703Eo.A01()) {
                C0703Eo c0703EoA0L4 = this.A0K.A0L(iA04, j);
                if (!c0703EoA0L4.equals(c0703Eo)) {
                    this.A05 = this.A05.A04(c0703EoA0L4, A02(c0703EoA0L4, c0703EoA0L4.A01() ? 0L : j), j);
                    return;
                }
            }
            if (this.A0K.A0U(c0703Eo, this.A03)) {
                return;
            }
            A0j(false);
            return;
        }
        int iA01 = A01(i2, ah, ah2);
        if (A0W[2].charAt(12) == 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[4] = "W6zkXP9eIZkyJx4uPbHf9NTX6";
        strArr[3] = "m3yrwIeXeqUIkhQgLJp1WNCsrl";
        if (iA01 == -1) {
            A08();
            return;
        }
        Pair<Integer, Long> pairA052 = A05(ah2, ah2.A09(iA01, this.A0L).A00, -9223372036854775807L);
        int iIntValue3 = ((Integer) pairA052.first).intValue();
        long jLongValue3 = ((Long) pairA052.second).longValue();
        C0703Eo c0703EoA0L5 = this.A0K.A0L(iIntValue3, jLongValue3);
        ah2.A0A(iIntValue3, this.A0L, true);
        if (c05939sA0E != null) {
            Object obj2 = this.A0L.A03;
            c05939sA0E.A02 = c05939sA0E.A02.A00(-1);
            while (c05939sA0E.A01 != null) {
                c05939sA0E = c05939sA0E.A01;
                if (c05939sA0E.A09.equals(obj2)) {
                    C05959u c05959u = this.A0K;
                    C05949t c05949t = c05939sA0E.A02;
                    if (A0W[2].charAt(12) == 'N') {
                        throw new RuntimeException();
                    }
                    A0W[5] = "ODoCru5Men7rnsumvsVlRJsOWyiHNrdt";
                    c05939sA0E.A02 = c05959u.A0J(c05949t, iIntValue3);
                } else {
                    c05939sA0E.A02 = c05939sA0E.A02.A00(-1);
                }
            }
        }
        boolean zA01 = c0703EoA0L5.A01();
        if (A0W[6].length() != 17) {
            throw new RuntimeException();
        }
        A0W[7] = "hRbRvIJE18IQkSZp4h0fxN12mLMfZDhd";
        this.A05 = this.A05.A04(c0703EoA0L5, A02(c0703EoA0L5, zA01 ? 0L : jLongValue3), jLongValue3);
    }

    static {
        A0K();
    }

    public EI(Y5[] y5Arr, AbstractC0747Gj abstractC0747Gj, C0748Gk c0748Gk, InterfaceC05929r interfaceC05929r, boolean z, int i, boolean z2, Handler handler, Y6 y6, InterfaceC0766Hd interfaceC0766Hd) {
        this.A0T = y5Arr;
        this.A0N = abstractC0747Gj;
        this.A0O = c0748Gk;
        this.A0J = interfaceC05929r;
        this.A08 = z;
        this.A02 = i;
        this.A0B = z2;
        this.A0E = handler;
        this.A0H = y6;
        this.A0P = interfaceC0766Hd;
        this.A0D = interfaceC05929r.A65();
        this.A0S = interfaceC05929r.AFO();
        this.A05 = new C05979w(AH.A01, -9223372036854775807L, TrackGroupArray.A04, c0748Gk);
        this.A0U = new AA[y5Arr.length];
        for (int i2 = 0; i2 < y5Arr.length; i2++) {
            y5Arr[i2].AG2(i2);
            this.A0U[i2] = y5Arr[i2].A6I();
        }
        this.A0G = new Y8(this, interfaceC0766Hd);
        this.A0R = new ArrayList<>();
        this.A0C = new Y5[0];
        this.A0M = new AG();
        this.A0L = new AF();
        abstractC0747Gj.A00(this);
        HandlerThread handlerThread = new HandlerThread(A06(21, 29, 0), -16);
        this.A0F = handlerThread;
        handlerThread.start();
        this.A0Q = interfaceC0766Hd.A4c(handlerThread.getLooper(), this);
    }

    private int A00() {
        AH ah = this.A05.A03;
        if (ah.A0E()) {
            return 0;
        }
        return ah.A0B(ah.A05(this.A0B), this.A0M).A00;
    }

    private int A01(int i, AH ah, AH ah2) {
        int iA03 = i;
        int maxIterations = -1;
        int iA00 = ah.A00();
        for (int i2 = 0; i2 < iA00 && maxIterations == -1; i2++) {
            iA03 = ah.A03(iA03, this.A0L, this.A0M, this.A02, this.A0B);
            if (iA03 == -1) {
                break;
            }
            maxIterations = ah2.A04(ah.A0A(iA03, this.A0L, true).A03);
        }
        return maxIterations;
    }

    private long A02(C0703Eo c0703Eo, long j) throws C05789c {
        return A03(c0703Eo, j, this.A0K.A0G() != this.A0K.A0H());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long A03(com.facebook.ads.redexgen.uinode.C0703Eo r9, long r10, boolean r12) throws com.facebook.ads.redexgen.uinode.C05789c {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.EI.A03(com.facebook.ads.redexgen.X.Eo, long, boolean):long");
    }

    private Pair<Integer, Long> A04(C05879l c05879l, boolean z) {
        int iA01;
        AH ah = this.A05.A03;
        AH ah2 = c05879l.A02;
        if (ah.A0E()) {
            return null;
        }
        if (ah2.A0E()) {
            ah2 = ah;
        }
        try {
            Pair<Integer, Long> pairA07 = ah2.A07(this.A0M, this.A0L, c05879l.A00, c05879l.A01);
            if (ah == ah2) {
                return pairA07;
            }
            int iA04 = ah.A04(ah2.A0A(((Integer) pairA07.first).intValue(), this.A0L, true).A03);
            if (iA04 != -1) {
                return Pair.create(Integer.valueOf(iA04), (Long) pairA07.second);
            }
            if (!z || (iA01 = A01(((Integer) pairA07.first).intValue(), ah2, ah)) == -1) {
                return null;
            }
            Pair<Integer, Long> pairA05 = A05(ah, ah.A09(iA01, this.A0L).A00, -9223372036854775807L);
            String[] strArr = A0W;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[1] = "LZRu6qU1d7MAJxELkyp6D6bqJ9pCtQWv";
            strArr2[0] = "5OOlDtGsHYXmvjCA2lYHypc4I8JTMes9";
            return pairA05;
        } catch (IndexOutOfBoundsException unused) {
            throw new C05919q(ah, c05879l.A00, c05879l.A01);
        }
    }

    private Pair<Integer, Long> A05(AH ah, int i, long j) {
        return ah.A07(this.A0M, this.A0L, i, j);
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        C05939s c05939sA0F = this.A0K.A0F();
        long nextLoadPositionUs = c05939sA0F.A06();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        boolean zAGI = this.A0J.AGI(nextLoadPositionUs - c05939sA0F.A08(this.A03), this.A0G.A7h().A01);
        A0k(zAGI);
        if (zAGI) {
            c05939sA0F.A0F(this.A03);
        }
    }

    private void A0A() {
        int i;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            int i2 = this.A0I.A01;
            if (this.A0I.A03) {
                i = this.A0I.A00;
            } else {
                i = -1;
            }
            handler.obtainMessage(0, i2, i, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        C05939s c05939sA0F = this.A0K.A0F();
        C05939s readingPeriodHolder = this.A0K.A0H();
        if (c05939sA0F != null && !c05939sA0F.A06) {
            if (readingPeriodHolder != null) {
                C05939s loadingPeriodHolder = readingPeriodHolder.A01;
                if (loadingPeriodHolder != c05939sA0F) {
                    return;
                }
            }
            Y5[] y5Arr = this.A0C;
            if (A0W[2].charAt(12) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[4] = "M2PhxJTgTMxoek0nGdRGZ8ED7";
            strArr[3] = "JhH24KrsERDOvzAX41swXn1Uhz";
            for (Y5 y5 : y5Arr) {
                if (!y5.A8a()) {
                    return;
                }
            }
            c05939sA0F.A08.AAN();
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            C05949t c05949tA0I = this.A0K.A0I(this.A03, this.A05);
            if (c05949tA0I == null) {
                this.A07.AAO();
                return;
            }
            WP mediaPeriod = this.A0K.A0K(this.A0U, this.A0N, this.A0J.A60(), this.A07, this.A05.A03.A0A(c05949tA0I.A04.A02, this.A0L, true).A03, c05949tA0I);
            mediaPeriod.AE4(this, c05949tA0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.ACr();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0r(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws C05789c {
        this.A09 = false;
        this.A0G.A05();
        for (Y5 y5 : this.A0C) {
            y5.start();
        }
    }

    private void A0H() throws C05789c {
        this.A0G.A06();
        for (Y5 y5 : this.A0C) {
            A0c(y5);
        }
    }

    private void A0J() throws C05789c {
        long jA0C;
        if (!this.A0K.A0P()) {
            return;
        }
        C05939s c05939sA0G = this.A0K.A0G();
        WP wp = c05939sA0G.A08;
        if (A0W[6].length() != 17) {
            throw new RuntimeException();
        }
        A0W[7] = "e9etinPRA8BQH2CZknXr4yAbSJ3blA39";
        long jAEL = wp.AEL();
        if (jAEL != -9223372036854775807L) {
            A0P(jAEL);
            if (jAEL != this.A05.A0A) {
                C05979w c05979w = this.A05;
                C0703Eo c0703Eo = c05979w.A04;
                long periodPositionUs = this.A05.A01;
                this.A05 = c05979w.A04(c0703Eo, jAEL, periodPositionUs);
                this.A0I.A04(4);
            }
        } else {
            long jA04 = this.A0G.A04();
            this.A03 = jA04;
            long jA08 = c05939sA0G.A08(jA04);
            A0Q(this.A05.A0A, jA08);
            this.A05.A0A = jA08;
        }
        C05979w c05979w2 = this.A05;
        if (this.A0C.length == 0) {
            jA0C = c05939sA0G.A02.A01;
        } else {
            jA0C = c05939sA0G.A0C(true);
        }
        c05979w2.A09 = jA0C;
    }

    private void A0L(float f) {
        for (C05939s c05939sA0E = this.A0K.A0E(); c05939sA0E != null; c05939sA0E = c05939sA0E.A01) {
            C0748Gk c0748Gk = c05939sA0E.A04;
            if (A0W[7].charAt(9) != '8') {
                throw new RuntimeException();
            }
            A0W[5] = "TmHCYSIZuHNmxK6kBnR58JopztOBcNrn";
            if (c0748Gk != null) {
                for (InterfaceC0744Gg interfaceC0744Gg : c05939sA0E.A04.A01.A01()) {
                    if (interfaceC0744Gg != null) {
                        interfaceC0744Gg.ACc(f);
                    }
                }
            }
        }
    }

    private void A0M(int i) throws C05789c {
        this.A02 = i;
        if (!this.A0K.A0R(i)) {
            A0j(true);
        }
    }

    private void A0N(int i) {
        if (this.A05.A00 != i) {
            C05979w c05979wA02 = this.A05.A02(i);
            if (A0W[7].charAt(9) != '8') {
                throw new RuntimeException();
            }
            A0W[2] = "kM2qExU4ybhQ7HWfawBquzR2zjX0F4jA";
            this.A05 = c05979wA02;
        }
    }

    private void A0O(int i, boolean playing, int i2) throws C05789c {
        C05939s playingPeriodHolder = this.A0K.A0G();
        Y5 y5 = this.A0T[i];
        this.A0C[i2] = y5;
        if (y5.A81() == 0) {
            AB ab = playingPeriodHolder.A04.A03[i];
            String[] strArr = A0W;
            if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0W[2] = "NYdCxyfB4qBB5fQElsuicf6C6huVudSr";
            Format[] formatArrA0v = A0v(playingPeriodHolder.A04.A01.A00(i));
            boolean z = this.A08 && this.A05.A00 == 3;
            y5.A5V(ab, formatArrA0v, playingPeriodHolder.A0A[i], this.A03, !playing && z, playingPeriodHolder.A07());
            this.A0G.A09(y5);
            if (z) {
                y5.start();
            }
        }
    }

    private void A0P(long j) throws C05789c {
        if (this.A0K.A0P()) {
            j = this.A0K.A0G().A09(j);
        }
        this.A03 = j;
        this.A0G.A07(j);
        for (Y5 y5 : this.A0C) {
            y5.AFN(this.A03);
        }
    }

    private void A0Q(long j, long j2) throws C05789c {
        C05859j c05859j;
        if (this.A0R.isEmpty() || this.A05.A04.A01()) {
            return;
        }
        if (this.A05.A02 == j) {
            j--;
        }
        C05979w c05979w = this.A05;
        if (A0W[2].charAt(12) == 'N') {
            throw new RuntimeException();
        }
        A0W[2] = "iI9novLuZIFAEfCO4qiE3Y1J9OFTcxg5";
        int i = c05979w.A04.A02;
        int currentPeriodIndex = this.A00;
        C05859j c05859j2 = currentPeriodIndex > 0 ? this.A0R.get(currentPeriodIndex - 1) : null;
        while (c05859j2 != null) {
            if (c05859j2.A00 <= i) {
                int i2 = c05859j2.A00;
                if (A0W[7].charAt(9) == '8') {
                    A0W[2] = "hDlIvL5rLgyE5VG4VUIth4YrdDyvlxxs";
                    if (i2 != i || c05859j2.A01 <= j) {
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            int currentPeriodIndex2 = this.A00 - 1;
            this.A00 = currentPeriodIndex2;
            c05859j2 = currentPeriodIndex2 > 0 ? this.A0R.get(currentPeriodIndex2 - 1) : null;
        }
        if (this.A00 < this.A0R.size()) {
            c05859j = this.A0R.get(this.A00);
        } else {
            c05859j = null;
        }
        while (c05859j != null && c05859j.A02 != null && (c05859j.A00 < i || (c05859j.A00 == i && c05859j.A01 <= j))) {
            int i3 = this.A00 + 1;
            this.A00 = i3;
            if (i3 < this.A0R.size()) {
                c05859j = this.A0R.get(this.A00);
            } else {
                c05859j = null;
            }
        }
        while (c05859j != null && c05859j.A02 != null && c05859j.A00 == i && c05859j.A01 > j && c05859j.A01 <= j2) {
            A0Z(c05859j.A03);
            if (c05859j.A03.A0B() || c05859j.A03.A0D()) {
                this.A0R.remove(this.A00);
            } else {
                this.A00++;
            }
            if (this.A00 < this.A0R.size()) {
                ArrayList<C05859j> arrayList = this.A0R;
                int i4 = this.A00;
                if (A0W[5].charAt(1) == 'w') {
                    throw new RuntimeException();
                }
                A0W[6] = "2inRqgHKNmW90mXz8";
                c05859j = arrayList.get(i4);
            } else {
                c05859j = null;
            }
        }
    }

    private void A0R(long j, long j2) {
        this.A0Q.AF8(2);
        this.A0Q.AFo(2, j + j2);
    }

    private void A0T(C05879l c05879l) throws Throwable {
        long jLongValue;
        C0703Eo c0703EoA0L;
        long jLongValue2;
        boolean seekPositionAdjusted;
        this.A0I.A03(1);
        Pair<Integer, Long> resolvedSeekPosition = A04(c05879l, true);
        if (resolvedSeekPosition == null) {
            c0703EoA0L = new C0703Eo(A00());
            jLongValue2 = -9223372036854775807L;
            jLongValue = -9223372036854775807L;
            seekPositionAdjusted = true;
        } else {
            int iIntValue = ((Integer) resolvedSeekPosition.first).intValue();
            jLongValue = ((Long) resolvedSeekPosition.second).longValue();
            c0703EoA0L = this.A0K.A0L(iIntValue, jLongValue);
            if (c0703EoA0L.A01()) {
                jLongValue2 = 0;
                seekPositionAdjusted = true;
            } else {
                jLongValue2 = ((Long) resolvedSeekPosition.second).longValue();
                seekPositionAdjusted = c05879l.A01 == -9223372036854775807L;
            }
        }
        try {
            try {
                if (this.A07 != null && this.A01 <= 0) {
                    if (A0W[5].charAt(1) != 'w') {
                        A0W[5] = "YfoxJXVxtggAgJ3C0qUN5WGXkfVCteCk";
                        try {
                            if (jLongValue2 == -9223372036854775807L) {
                                A0N(4);
                                A0o(false, true, false);
                            } else {
                                long jA5x = jLongValue2;
                                if (c0703EoA0L.equals(this.A05.A04)) {
                                    C05939s c05939sA0G = this.A0K.A0G();
                                    if (c05939sA0G != null && jA5x != 0) {
                                        jA5x = c05939sA0G.A08.A5x(jA5x, this.A06);
                                    }
                                    long contentPositionUs = C9W.A01(jA5x);
                                    long newPeriodPositionUs = this.A05.A0A;
                                    if (contentPositionUs == C9W.A01(newPeriodPositionUs)) {
                                        this.A05 = this.A05.A04(c0703EoA0L, this.A05.A0A, jLongValue);
                                        if (seekPositionAdjusted) {
                                            this.A0I.A04(2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                long jA02 = A02(c0703EoA0L, jA5x);
                                seekPositionAdjusted |= jLongValue2 != jA02;
                                if (A0W[6].length() == 17) {
                                    A0W[7] = "LtwUHLpv08wEzos7LWvR75PA6MqqEvuh";
                                    jLongValue2 = jA02;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            this.A05 = this.A05.A04(c0703EoA0L, jLongValue2, jLongValue);
                            if (seekPositionAdjusted) {
                                this.A0I.A04(2);
                            }
                            throw th;
                        }
                    }
                    throw new RuntimeException();
                }
                this.A04 = c05879l;
                this.A05 = this.A05.A04(c0703EoA0L, jLongValue2, jLongValue);
                if (seekPositionAdjusted) {
                    C05869k c05869k = this.A0I;
                    String[] strArr = A0W;
                    if (strArr[4].length() != strArr[3].length()) {
                        A0W[6] = "NnvGpWmx2ly54VvtA";
                        c05869k.A04(2);
                    } else {
                        c05869k.A04(2);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void A0V(C05939s c05939s) throws C05789c {
        C05939s c05939sA0G = this.A0K.A0G();
        if (c05939sA0G == null || c05939s == c05939sA0G) {
            return;
        }
        int i = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        int i2 = 0;
        while (true) {
            Y5[] y5Arr = this.A0T;
            if (i2 < y5Arr.length) {
                Y5 y5 = y5Arr[i2];
                zArr[i2] = y5.A81() != 0;
                if (c05939sA0G.A04.A00(i2)) {
                    i++;
                }
                if (zArr[i2] && (!c05939sA0G.A04.A00(i2) || (y5.A8y() && y5.A84() == c05939s.A0A[i2]))) {
                    A0b(y5);
                }
                i2++;
            } else {
                this.A05 = this.A05.A05(c05939sA0G.A03, c05939sA0G.A04);
                A0p(zArr, i);
                return;
            }
        }
    }

    private void A0W(C05989x c05989x) {
        this.A0G.AGA(c05989x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(A8 a8) throws C05789c {
        if (a8.A0D()) {
            return;
        }
        try {
            a8.A04().A8V(a8.A00(), a8.A09());
            a8.A0A(true);
            String[] strArr = A0W;
            if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[4] = "j7cBoz179DrNpy3qD7RptXNd9";
            strArr2[3] = "0iwSWX3dM4PAnuiRq1LulMUFPW";
        } catch (Throwable th) {
            a8.A0A(true);
            throw th;
        }
    }

    private void A0Y(A8 a8) throws C05789c {
        if (a8.A02() == -9223372036854775807L) {
            A0Z(a8);
            return;
        }
        if (this.A07 == null || this.A01 > 0) {
            this.A0R.add(new C05859j(a8));
            return;
        }
        C05859j c05859j = new C05859j(a8);
        if (A0r(c05859j)) {
            this.A0R.add(c05859j);
            Collections.sort(this.A0R);
        } else {
            a8.A0A(false);
        }
    }

    private void A0Z(A8 a8) throws C05789c {
        if (a8.A03().getLooper() == this.A0Q.A7L()) {
            A0X(a8);
            C05979w c05979w = this.A05;
            if (A0W[6].length() != 17) {
                throw new RuntimeException();
            }
            A0W[5] = "cBEQE15IFXZqMCE104UHZMDgeC8qTiqN";
            if (c05979w.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AFn(2);
                return;
            }
            return;
        }
        this.A0Q.AAb(15, a8).sendToTarget();
    }

    private void A0a(final A8 a8) {
        a8.A03().post(new Runnable() { // from class: com.facebook.ads.redexgen.X.9h
            public static byte[] A02;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 14);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{-60, -9, -18, -49, -21, -32, -8, -28, -15, -56, -20, -17, -21, -56, -19, -13, -28, -15, -19, -32, -21, -52, -27, -36, -17, -25, -36, -38, -21, -36, -37, -105, -36, -23, -23, -26, -23, -105, -37, -36, -29, -32, -19, -36, -23, -32, -27, -34, -105, -28, -36, -22, -22, -40, -34, -36, -105, -26, -27, -105, -36, -17, -21, -36, -23, -27, -40, -29, -105, -21, -33, -23, -36, -40, -37, -91};
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (KL.A02(this)) {
                    return;
                }
                try {
                    try {
                        this.A00.A0X(a8);
                    } catch (C05789c e) {
                        Log.e(A00(0, 21, 113), A00(21, 55, 105), e);
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    KL.A00(th, this);
                }
            }
        });
    }

    private void A0b(Y5 y5) throws C05789c {
        this.A0G.A08(y5);
        A0c(y5);
        y5.A58();
    }

    private void A0c(Y5 y5) throws C05789c {
        if (y5.A81() == 2) {
            y5.stop();
        }
    }

    private void A0d(AD ad) {
        this.A06 = ad;
    }

    private void A0e(WP wp) {
        if (!this.A0K.A0T(wp)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(WP wp) throws C05789c {
        if (!this.A0K.A0T(wp)) {
            return;
        }
        C05939s c05939sA0F = this.A0K.A0F();
        c05939sA0F.A0E(this.A0G.A7h().A01);
        A0i(c05939sA0F.A03, c05939sA0F.A04);
        if (!this.A0K.A0P()) {
            C05939s loadingPeriodHolder = this.A0K.A0C();
            A0P(loadingPeriodHolder.A02.A03);
            A0V(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.FC
    /* renamed from: A0g, reason: merged with bridge method [inline-methods] */
    public final void ABC(WP wp) {
        this.A0Q.AAb(10, wp).sendToTarget();
    }

    private void A0h(InterfaceC0705Eq interfaceC0705Eq, boolean z, boolean z2) {
        this.A01++;
        A0o(true, z, z2);
        this.A0J.onPrepared();
        this.A07 = interfaceC0705Eq;
        A0N(2);
        interfaceC0705Eq.AE7(this.A0H, true, this);
        this.A0Q.AFn(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, C0748Gk c0748Gk) {
        this.A0J.ADN(this.A0T, trackGroupArray, c0748Gk.A01);
    }

    private void A0j(boolean z) throws C05789c {
        C0703Eo c0703Eo = this.A0K.A0G().A02.A04;
        long jA03 = A03(c0703Eo, this.A05.A0A, true);
        if (jA03 != this.A05.A0A) {
            C05979w c05979w = this.A05;
            this.A05 = c05979w.A04(c0703Eo, jA03, c05979w.A01);
            if (z) {
                this.A0I.A04(4);
            }
        }
    }

    private void A0k(boolean z) {
        if (this.A05.A08 != z) {
            this.A05 = this.A05.A06(z);
        }
    }

    private void A0l(boolean z) throws C05789c {
        this.A09 = false;
        this.A08 = z;
        if (!z) {
            A0H();
            A0J();
        } else if (this.A05.A00 == 3) {
            A0G();
            this.A0Q.AFn(2);
        } else {
            if (this.A05.A00 != 2) {
                return;
            }
            this.A0Q.AFn(2);
        }
    }

    private void A0m(boolean z) throws C05789c {
        this.A0B = z;
        if (!this.A0K.A0V(z)) {
            A0j(true);
        }
    }

    private void A0n(boolean z, boolean z2) {
        A0o(true, z, z);
        this.A0I.A03(this.A01 + (z2 ? 1 : 0));
        this.A01 = 0;
        this.A0J.ADF();
        A0N(1);
    }

    private void A0o(boolean z, boolean z2, boolean z3) {
        Object obj;
        long j;
        C0748Gk c0748Gk;
        InterfaceC0705Eq interfaceC0705Eq;
        this.A0Q.AF8(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (Y5 y5 : this.A0C) {
            try {
                A0b(y5);
            } catch (C05789c | RuntimeException e) {
                Log.e(A06(0, 21, 43), A06(138, 12, 49), e);
            }
        }
        this.A0C = new Y5[0];
        this.A0K.A0O(!z2);
        A0k(false);
        if (z2) {
            this.A04 = null;
        }
        if (z3) {
            this.A0K.A0N(AH.A01);
            Iterator<C05859j> it = this.A0R.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        AH ah = z3 ? AH.A01 : this.A05.A03;
        if (z3) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        C0703Eo c0703Eo = z2 ? new C0703Eo(A00()) : this.A05.A04;
        long j2 = -9223372036854775807L;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            j = this.A05.A0A;
        }
        if (!z2) {
            j2 = this.A05.A01;
        }
        int i = this.A05.A00;
        TrackGroupArray trackGroupArray = z3 ? TrackGroupArray.A04 : this.A05.A05;
        if (z3) {
            c0748Gk = this.A0O;
        } else {
            c0748Gk = this.A05.A06;
        }
        this.A05 = new C05979w(ah, obj, c0703Eo, j, j2, i, false, trackGroupArray, c0748Gk);
        if (z && (interfaceC0705Eq = this.A07) != null) {
            interfaceC0705Eq.AEb(this);
            this.A07 = null;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0p(boolean[] r6, int r7) throws com.facebook.ads.redexgen.uinode.C05789c {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.Y5[] r0 = new com.facebook.ads.redexgen.uinode.Y5[r7]
            r5.A0C = r0
            r4 = 0
            com.facebook.ads.redexgen.X.9u r0 = r5.A0K
            com.facebook.ads.redexgen.X.9s r3 = r0.A0G()
            r2 = 0
        Lc:
            com.facebook.ads.redexgen.X.Y5[] r0 = r5.A0T
            int r0 = r0.length
            if (r2 >= r0) goto L24
            com.facebook.ads.redexgen.X.Gk r0 = r3.A04
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L21
            boolean r1 = r6[r2]
            int r0 = r4 + 1
            r5.A0O(r2, r1, r4)
            r4 = r0
        L21:
            int r2 = r2 + 1
            goto Lc
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.EI.A0p(boolean[], int):void");
    }

    private boolean A0q() {
        C05939s c05939sA0G = this.A0K.A0G();
        long j = c05939sA0G.A02.A01;
        if (j != -9223372036854775807L) {
            long playingPeriodDurationUs = this.A05.A0A;
            if (playingPeriodDurationUs >= j) {
                C05939s c05939s = c05939sA0G.A01;
                if (A0W[7].charAt(9) != '8') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[1] = "YaIhV2LltIG4HuclCS5WOO9hjwkCXeMt";
                strArr[0] = "X0pypN8zwLPsNLuJVHuHfetSc0yM8k9B";
                if (c05939s != null) {
                    C05939s playingPeriodHolder = c05939sA0G.A01;
                    if (!playingPeriodHolder.A06) {
                        C05939s playingPeriodHolder2 = c05939sA0G.A01;
                        if (playingPeriodHolder2.A02.A04.A01()) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean A0r(C05859j c05859j) {
        if (c05859j.A02 == null) {
            Pair<Integer, Long> pairA04 = A04(new C05879l(c05859j.A03.A08(), c05859j.A03.A01(), C9W.A00(c05859j.A03.A02())), false);
            if (pairA04 == null) {
                return false;
            }
            int iIntValue = ((Integer) pairA04.first).intValue();
            long jLongValue = ((Long) pairA04.second).longValue();
            AH ah = this.A05.A03;
            Integer num = (Integer) pairA04.first;
            String[] strArr = A0W;
            if (strArr[1].charAt(10) != strArr[0].charAt(10)) {
                A0W[6] = "Qe4SjxIsSBa3x6HAW";
                c05859j.A01(iIntValue, jLongValue, ah.A0A(num.intValue(), this.A0L, true).A03);
            } else {
                throw new RuntimeException();
            }
        } else {
            int iA04 = this.A05.A03.A04(c05859j.A02);
            if (iA04 == -1) {
                return false;
            }
            c05859j.A00 = iA04;
        }
        return true;
    }

    private boolean A0s(Y5 y5) {
        C05939s c05939sA0H = this.A0K.A0H();
        C05939s readingPeriodHolder = c05939sA0H.A01;
        if (readingPeriodHolder != null) {
            C05939s readingPeriodHolder2 = c05939sA0H.A01;
            if (readingPeriodHolder2.A06 && y5.A8a()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0t(C0703Eo c0703Eo, long j, C05939s c05939s) {
        if (c0703Eo.equals(c05939s.A02.A04) && c05939s.A06) {
            this.A05.A03.A09(c05939s.A02.A04.A02, this.A0L);
            int iA04 = this.A0L.A04(j);
            if (iA04 == -1 || this.A0L.A09(iA04) == c05939s.A02.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean A0u(boolean z) {
        if (this.A0C.length == 0) {
            return A0q();
        }
        if (!z) {
            return false;
        }
        if (!this.A05.A08) {
            return true;
        }
        C05939s c05939sA0F = this.A0K.A0F();
        long jA0C = c05939sA0F.A0C(!c05939sA0F.A02.A05);
        return jA0C == Long.MIN_VALUE || this.A0J.AGL(jA0C - c05939sA0F.A08(this.A03), this.A0G.A7h().A01, this.A09);
    }

    public static Format[] A0v(InterfaceC0744Gg interfaceC0744Gg) {
        int length = interfaceC0744Gg != null ? interfaceC0744Gg.length() : 0;
        Format[] formatArr = new Format[length];
        String[] strArr = A0W;
        String str = strArr[1];
        String str2 = strArr[0];
        int iCharAt = str.charAt(10);
        int length2 = str2.charAt(10);
        if (iCharAt == length2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[4] = "X04sVE4WijYjotgv6w3bASzS6";
        strArr2[3] = "U1jCIvxI6fY8JZE6Ili1DHAvIg";
        for (int length3 = 0; length3 < length; length3++) {
            formatArr[length3] = interfaceC0744Gg.A76(length3);
        }
        return formatArr;
    }

    public final Looper A0w() {
        return this.A0F.getLooper();
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0010 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A0x() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return
        L7:
            com.facebook.ads.redexgen.X.Hn r1 = r2.A0Q     // Catch: java.lang.Throwable -> L23
            r0 = 7
            r1.AFn(r0)     // Catch: java.lang.Throwable -> L23
            r1 = 0
        Le:
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L18
            r2.wait()     // Catch: java.lang.InterruptedException -> L16 java.lang.Throwable -> L23
            goto Le
        L16:
            r1 = 1
            goto Le
        L18:
            if (r1 == 0) goto L21
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L23
            r0.interrupt()     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r2)
            return
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.EI.A0x():void");
    }

    public final void A0y(AH ah, int i, long j) {
        this.A0Q.AAb(3, new C05879l(ah, i, j)).sendToTarget();
    }

    public final void A0z(InterfaceC0705Eq interfaceC0705Eq, boolean z, boolean z2) {
        this.A0Q.AAa(0, z ? 1 : 0, z2 ? 1 : 0, interfaceC0705Eq).sendToTarget();
    }

    public final void A10(boolean z) {
        this.A0Q.AAZ(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z) {
        this.A0Q.AAZ(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.uinode.C9Z
    public final void ACb(C05989x c05989x) {
        this.A0E.obtainMessage(1, c05989x).sendToTarget();
        A0L(c05989x.A01);
    }

    @Override // com.facebook.ads.redexgen.uinode.WQ
    public final void ACj(WP wp) {
        this.A0Q.AAb(9, wp).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0704Ep
    public final void ADA(InterfaceC0705Eq interfaceC0705Eq, AH ah, Object obj) {
        this.A0Q.AAb(8, new C05849i(interfaceC0705Eq, ah, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.uinode.A6
    public final synchronized void AFp(A8 a8) {
        if (this.A0A) {
            Log.w(A06(0, 21, 43), A06(50, 37, 33));
            a8.A0A(false);
        } else {
            this.A0Q.AAb(14, a8).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        String strA06 = A06(0, 21, 43);
        try {
            switch (message.what) {
                case 0:
                    A0h((InterfaceC0705Eq) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((C05879l) message.obj);
                    break;
                case 4:
                    A0W((C05989x) message.obj);
                    break;
                case 5:
                    A0d((AD) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((C05849i) message.obj);
                    break;
                case 9:
                    A0f((WP) message.obj);
                    break;
                case 10:
                    A0e((WP) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0M(message.arg1);
                    break;
                case 13:
                    A0m(message.arg1 != 0);
                    break;
                case 14:
                    A0Y((A8) message.obj);
                    break;
                case 15:
                    A0a((A8) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (C05789c e) {
            Log.e(strA06, A06(110, 15, 98), e);
            A0n(false, false);
            this.A0E.obtainMessage(2, e).sendToTarget();
            A0A();
        } catch (IOException e2) {
            Log.e(strA06, A06(125, 13, 51), e2);
            A0n(false, false);
            this.A0E.obtainMessage(2, C05789c.A00(e2)).sendToTarget();
            A0A();
        } catch (RuntimeException e3) {
            Log.e(strA06, A06(87, 23, 38), e3);
            A0n(false, false);
            this.A0E.obtainMessage(2, C05789c.A02(e3)).sendToTarget();
            A0A();
        }
        return true;
    }
}
