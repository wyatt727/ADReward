package com.facebook.ads.redexgen.uinode;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.ads.internal.util.common.Stateful<android.os.Bundle>] */
/* loaded from: assets/audience_network.dex */
public class QS {
    public static byte[] A0E;
    public static String[] A0F = {"nkjKj1MvUJoP2SJPYcgbaBjYPy4EsWOF", "UEaFlSlVJfgDxU2HAGuUlGjRHCZL3UC5", "HKOtxcgqDUvcB7Zt0rEFxuoEqCvYEtNO", "rowCAjgGiKT2zEBSq3xmGSL0Kf3UrlyG", "EJAz0i2eNdRPLBpGYGjYpv17GQTuD6uU", "hVbT72qq2pp8XHiEw", "RwROuq5e2nKVw7hJaeybV0hHAIDx5UQQ", "neuOh54FNoDLqHEFUxNtW4G7fWRiy4GW"};
    public int A00;
    public int A01;
    public QF A02;
    public String A03;
    public boolean A04;
    public final C1258aF A05;
    public final C1207Yn A06;
    public final J2 A07;
    public final QE A08;
    public final QK A09;
    public final QL A0A;
    public final Object A0B;
    public final String A0C;
    public final Map<String, String> A0D;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public QS(C1207Yn c1207Yn, J2 j2, QE qe, List<C2P> list, String str, boolean z, Bundle bundle, Map<String, String> map, QK qk) {
        this.A0B = new Object();
        this.A01 = 0;
        this.A00 = 0;
        this.A03 = null;
        this.A06 = c1207Yn;
        this.A07 = j2;
        this.A08 = qe;
        this.A0C = str;
        this.A0D = map;
        this.A04 = z;
        this.A09 = qk;
        list.add(new QU(this, 0.5d, -1.0d, 2.0d, true));
        list.add(new QT(this, 1.0E-7d, -1.0d, 0.001d, false));
        if (bundle != null) {
            this.A05 = new C1258aF(list, bundle.getBundle(A0F(6, 16, 29)), qk);
            this.A01 = bundle.getInt(A0F(57, 18, 2));
            this.A00 = bundle.getInt(A0F(39, 18, 44));
        } else {
            this.A05 = new C1258aF(list, qk);
        }
        this.A0A = new QL(new Handler(), this);
    }

    public static String A0F(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0N() {
        A0E = new byte[]{11, 13, 30, 19, 25, 24, -82, -79, -98, -62, -82, -71, -74, -63, -58, -102, -82, -69, -82, -76, -78, -65, -18, 1, -10, -6, -14, -20, -6, 0, -96, -77, -86, -85, -89, -100, -76, -96, -83, -56, -67, -49, -48, -98, -53, -47, -54, -64, -67, -50, -43, -80, -59, -55, -63, -87, -81, -98, -109, -91, -90, -126, -92, -95, -103, -92, -105, -91, -91, -122, -101, -97, -105, Byte.MAX_VALUE, -123, -21, -31, -33, -14, -35, -21, -15, -23, -33, -14, -16, -37, -23, -17, 20, 12, -33, -37, -45, -43, -56, -45, 26, 30, 13, 17, 6, 10, 2, 27, 34, -87, -98, -94, -102, 37, 27, 16, -16, -26, -25, 19, 9, 10, -2, 21, -64, -70, -78, 10, 4, 11, 5, 3, -8, -4, -12, -18, -4, 2, -64, -63, -87, -68, -67, -72, 0, 1, -21, -9, -8, -18, 5, 6, -4, -16, 7, -73, -87, -82, -92, -81, -73};
    }

    static {
        A0N();
    }

    public QS(C1207Yn c1207Yn, J2 j2, QE qe, List<C2P> list, String str, boolean z, Bundle bundle, QK qk) {
        this(c1207Yn, j2, qe, list, str, z, bundle, null, qk);
    }

    public QS(C1207Yn c1207Yn, J2 j2, QE qe, List<C2P> list, String str, boolean z, QK qk) {
        this(c1207Yn, j2, qe, list, str, z, null, qk);
    }

    private final float A0E() {
        return AbstractC0871Ll.A00(this.A06) * this.A08.getVolume();
    }

    private Map<String, String> A0H(int i) {
        HashMap<String, String> map = new HashMap<>();
        AbstractC0871Ll.A03(map, this.A08.getVideoStartReason() == QM.A02, !this.A08.A95());
        A0T(map);
        A0S(map);
        A0V(map, i);
        A0U(map);
        A0R(map);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A0I(QG qg) {
        return A0J(qg, this.A08.getCurrentPositionInMillis());
    }

    private Map<String, String> A0J(QG qg, int i) {
        Map<String, String> mapA0H = A0H(i);
        mapA0H.put(A0F(0, 6, 122), String.valueOf(qg.A00));
        return mapA0H;
    }

    private void A0L() {
        A0Q(this.A0C, A0I(QG.A04));
    }

    private void A0M() {
        A0Q(this.A0C, A0I(QG.A0A));
    }

    private final void A0O(int i, boolean z, boolean z2) {
        int i2;
        if (i <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || i < (i2 = this.A01)) {
            return;
        }
        if (i > i2) {
            this.A05.A06((i - i2) / 1000.0f, A0E());
            this.A01 = i;
            if (z2 || i - this.A00 >= 5000) {
                A0Q(this.A0C, A0J(QG.A09, i));
                if (A0F[5].length() == 0) {
                    throw new RuntimeException();
                }
                String[] strArr = A0F;
                strArr[1] = "IXDsMs8MiMzYVjpFmNZXbOdNx8hS7U1p";
                strArr[6] = "KaqaEYbZ8TBX2kyM8fVmd1OK78kemUif";
                this.A00 = this.A01;
                this.A05.A05();
                return;
            }
        }
        if (z) {
            A0Q(this.A0C, A0J(QG.A09, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(String str, Map<String, String> data) {
        this.A07.AAB(str, data);
        QF qf = this.A02;
        if (qf != null) {
            qf.AC8();
        }
    }

    private void A0R(HashMap<String, String> params) {
        Map<String, String> map = this.A0D;
        if (map != null) {
            params.putAll(map);
        }
    }

    private void A0S(Map<String, String> params) {
        C2R c2rA03 = this.A05.A03();
        C2Q c2qA00 = c2rA03.A00();
        params.put(A0F(Opcodes.F2D, 3, 90), String.valueOf(c2qA00.A00()));
        params.put(A0F(Opcodes.D2F, 3, 81), String.valueOf(c2qA00.A05()));
        params.put(A0F(Opcodes.I2S, 5, 95), String.valueOf(c2qA00.A02()));
        params.put(A0F(127, 8, 95), String.valueOf(c2qA00.A01() * 1000.0d));
        params.put(A0F(82, 7, 76), String.valueOf(c2qA00.A03() * 1000.0d));
        String str = this.A03;
        if (str != null) {
            params.put(A0F(135, 6, 26), str);
        }
        C2Q c2qA01 = c2rA03.A01();
        params.put(A0F(110, 3, 127), String.valueOf(c2qA01.A00()));
        params.put(A0F(113, 3, 74), String.valueOf(c2qA01.A05()));
        params.put(A0F(116, 5, 109), String.valueOf(c2qA01.A02()));
        params.put(A0F(22, 8, 93), String.valueOf(c2qA01.A01() * 1000.0d));
        params.put(A0F(75, 7, 78), String.valueOf(c2qA01.A03() * 1000.0d));
    }

    private void A0T(Map<String, String> map) {
        map.put(A0F(30, 9, 11), String.valueOf(this.A08.A92()));
        map.put(A0F(93, 4, 51), Long.toString(this.A08.getInitialBufferTime()));
    }

    private void A0U(Map<String, String> params) {
        Rect rect = new Rect();
        this.A08.getGlobalVisibleRect(rect);
        params.put(A0F(97, 2, 122), String.valueOf(rect.top));
        params.put(A0F(91, 2, 63), String.valueOf(rect.left));
        params.put(A0F(89, 2, 116), String.valueOf(this.A08.getMeasuredHeight()));
        params.put(A0F(104, 2, 123), String.valueOf(this.A08.getMeasuredWidth()));
        WindowManager windowManager = (WindowManager) this.A06.getSystemService(A0F(Opcodes.DCMPG, 6, 16));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        params.put(A0F(121, 3, 26), String.valueOf(displayMetrics.heightPixels));
        params.put(A0F(124, 3, 100), String.valueOf(displayMetrics.widthPixels));
    }

    private void A0V(Map<String, String> map, int i) {
        map.put(A0F(99, 5, 109), String.valueOf(this.A00 / 1000.0f));
        map.put(A0F(106, 4, 5), String.valueOf(i / 1000.0f));
    }

    public final int A0W() {
        return this.A01;
    }

    public final Bundle A0X() {
        A0g(A0W(), A0W());
        Bundle bundle = new Bundle();
        bundle.putInt(A0F(57, 18, 2), this.A01);
        bundle.putInt(A0F(39, 18, 44), this.A00);
        bundle.putBundle(A0F(6, 16, 29), this.A05.A02());
        return bundle;
    }

    public final void A0Y() {
        A0Q(this.A0C, A0I(QG.A07));
    }

    public final void A0Z() {
        A0Q(this.A0C, A0I(QG.A08));
    }

    public final void A0a() {
        if (A0E() < 0.05d) {
            synchronized (this.A0B) {
                if (this.A04) {
                    A0L();
                    this.A04 = false;
                }
            }
            return;
        }
        synchronized (this.A0B) {
            if (!this.A04) {
                A0M();
                this.A04 = true;
            }
        }
    }

    public final void A0b() {
        this.A06.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.A0A);
    }

    public final void A0c() {
        this.A06.getContentResolver().unregisterContentObserver(this.A0A);
    }

    public final void A0d(int i) {
        this.A05.A04();
        A0Q(this.A0C, A0I(QG.A05));
        A0O(i, false, ((double) i) < 2000.0d);
    }

    public final void A0e(int i) {
        A0O(i, true, false);
        this.A00 = 0;
        this.A01 = 0;
        this.A05.A05();
        this.A05.A04();
    }

    public final void A0f(int i) {
        A0O(i, false, false);
    }

    public final void A0g(int i, int i2) {
        A0O(i, true, false);
        this.A00 = i2;
        this.A01 = i2;
        this.A05.A05();
        this.A05.A04();
    }

    public final void A0h(QF qf) {
        this.A02 = qf;
    }
}
