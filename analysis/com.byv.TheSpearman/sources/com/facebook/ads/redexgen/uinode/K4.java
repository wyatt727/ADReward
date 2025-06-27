package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public final class K4 {
    public static byte[] A07;
    public static final ThreadFactoryC0877Lr A08;
    public static final Executor A09;
    public static final AtomicReference<K8> A0A;
    public long A00;
    public K3 A01;
    public Map<String, String> A02;
    public final C2S A03;
    public final C1207Yn A04;
    public final K5 A05;
    public final String A06;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{57, 62, 105, 111, 51, 62, 51, 122, 105, 107, 119, 117, 78, 65, 68, 72, 67, 89, 82, 95, 72, 92, 88, 72, 94, 89, 82, 68, 73, 98, 88, 11, 121, 101, 17, 11, 100, 101, 10, 108, 99, 102, 102, 10, 88, 79, 73, 79, 67, 92, 79, 78, 20, 53, 122, 28, 51, 54, 54, 122, Utf8.REPLACEMENT_BYTE, 40, 40, 53, 40, 122, 57, 53, 62, Utf8.REPLACEMENT_BYTE, 122, 1, Byte.MAX_VALUE, 41, 7, 122, Byte.MAX_VALUE, 41, 15, 13, 6, 13, 26, 1, 11, 81, 90, 75, 72, 80, 77, 84, 40, 41, 0, 47, 42, 42, 14, 41, 41, 45, 41, 43, 54, 47, 48, Base64.padSymbol, 60};
    }

    static {
        A0A();
        ThreadFactoryC0877Lr threadFactoryC0877Lr = new ThreadFactoryC0877Lr();
        A08 = threadFactoryC0877Lr;
        A09 = Executors.newCachedThreadPool(threadFactoryC0877Lr);
        A0A = new AtomicReference<>();
    }

    public K4(C1207Yn c1207Yn) {
        this(c1207Yn, C2T.A00(c1207Yn.A01()));
    }

    public K4(C1207Yn c1207Yn, C2S c2s) {
        this.A00 = -1L;
        this.A04 = c1207Yn;
        this.A05 = K5.A00();
        this.A06 = K9.A01(c1207Yn);
        this.A03 = c2s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1111Us A02(long j, K1 k1) {
        return new C1111Us(this, k1, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C1207Yn c1207Yn = this.A04;
        if (c1207Yn == null || !C1018Rc.A0A(c1207Yn)) {
            return;
        }
        C8B c8b = new C8B(A05(7, 5, 107));
        c8b.A05(1);
        this.A04.A07().A9a(A05(85, 7, 111), C8A.A1x, c8b);
    }

    private void A0B(int i, String str) {
        String strA05 = A05(36, 16, 122);
        String strA052 = A05(0, 7, 90);
        String strA053 = A05(92, 10, 22);
        AbstractC0826Jp.A05(strA053, strA05, strA052);
        AbstractC0826Jp.A04(strA053, String.format(Locale.US, A05(52, 26, 10), Integer.valueOf(i), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(C0813Jb c0813Jb) {
        K3 k3 = this.A01;
        if (k3 != null) {
            k3.ABR(c0813Jb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C0813Jb c0813Jb) {
        ExecutorC0868Li.A00(new Uq(this, c0813Jb));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(C1109Up c1109Up) {
        K3 k3 = this.A01;
        if (k3 != null) {
            k3.ADG(c1109Up);
        }
    }

    private void A0L(C1109Up c1109Up) {
        InterfaceC05397l syncModule;
        ExecutorC0868Li.A00(new C1110Ur(this, c1109Up));
        if (C0796Ih.A26(this.A04) && (syncModule = this.A04.A05()) != null) {
            syncModule.A5m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(String str, long j, K1 k1) {
        String str2;
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            K7 k7A06 = this.A05.A06(this.A04, str, j);
            C8S c8sA00 = k7A06.A00();
            if (c8sA00 != null) {
                C0796Ih.A0R(this.A04).A2X(c8sA00.A08());
                this.A04.A07().AAL();
                this.A03.A0N(c8sA00.A06());
                K0.A05(c8sA00.A05().A0B(), k1);
                M2.A01(this.A04, A09, c8sA00);
                C8B c8b = new C8B(A05(29, 7, 123) + LE.A02());
                c8b.A06(1);
                c8b.A0A(false);
                this.A04.A07().AAA(A05(78, 7, 56), C8A.A1W, c8b);
            }
            switch (K2.A00[k7A06.A01().ordinal()]) {
                case 1:
                    C1109Up c1109Up = (C1109Up) k7A06;
                    if (c8sA00 != null) {
                        if (c8sA00.A05().A0E()) {
                            K0.A07(str, k1);
                        }
                        Map<String, String> map = this.A02;
                        if (map != null) {
                            str2 = map.get(A05(12, 17, 93));
                        } else {
                            str2 = null;
                        }
                        if (!TextUtils.isEmpty(k7A06.A02()) && !TextUtils.isEmpty(str2)) {
                            this.A04.A02().AFL(this.A04, str2, k7A06.A02());
                        }
                    }
                    this.A04.A0E().A2w(C0865Lf.A01(this.A00));
                    A0L(c1109Up);
                    break;
                case 2:
                    C1108Uo c1108Uo = (C1108Uo) k7A06;
                    String strA04 = c1108Uo.A04();
                    AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1108Uo.A03(), AdErrorType.ERROR_MESSAGE);
                    A0B(c1108Uo.A03(), strA04);
                    if (strA04 == null) {
                        strA04 = str;
                    }
                    this.A04.A0E().A2v(C0865Lf.A01(this.A00), adErrorTypeAdErrorTypeFromCode.getErrorCode(), strA04, adErrorTypeAdErrorTypeFromCode.isPublicError());
                    A0D(C0813Jb.A01(adErrorTypeAdErrorTypeFromCode, strA04));
                    break;
                default:
                    AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                    this.A04.A0E().A2v(C0865Lf.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                    A0D(C0813Jb.A01(adErrorType, str));
                    break;
            }
        } catch (Exception e2) {
            e = e2;
            String message = e.getMessage();
            AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
            this.A04.A0E().A2v(C0865Lf.A01(this.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            A0D(C0813Jb.A01(adErrorType2, message));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j, K1 k1) {
        A09.execute(new C1112Ut(this, str, j, k1));
    }

    public final void A0O(K1 k1) {
        this.A00 = System.currentTimeMillis();
        C8J.A0B(this.A04);
        A0A.get();
        if (0 != 0) {
            throw new NullPointerException(A05(102, 7, 9));
        }
        if (K0.A08(k1)) {
            ExecutorC0879Lt.A06.execute(new C1114Uv(this));
            String strA02 = K0.A02(k1);
            if (strA02 != null) {
                this.A04.A0E().AGt();
                A0N(strA02, 0L, k1);
                return;
            } else {
                AdErrorType error = AdErrorType.LOAD_TOO_FREQUENTLY;
                this.A04.A0E().A2v(C0865Lf.A01(this.A00), error.getErrorCode(), error.getDefaultErrorMessage(), error.isPublicError());
                A0D(C0813Jb.A01(error, null));
                return;
            }
        }
        A09.execute(new C1113Uu(this, k1));
    }

    public final void A0P(K3 k3) {
        this.A01 = k3;
    }
}
