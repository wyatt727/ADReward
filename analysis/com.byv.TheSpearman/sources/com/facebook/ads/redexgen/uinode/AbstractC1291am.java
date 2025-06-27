package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.am, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1291am implements K3 {
    public static byte[] A0D;
    public static String[] A0E = {"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    public static final Handler A0F;
    public static final C03760u A0G = null;
    public static final K4 A0H = null;
    public static final String A0I;
    public InterfaceC03710p A00;
    public InterfaceC03710p A01;
    public C8S A04;
    public K1 A05;
    public AbstractC03720q A06;
    public final C04021u A07;
    public final J2 A08;
    public final C03760u A09;
    public final K4 A0A;
    public final C1207Yn A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public String A02 = null;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{75, 110, 107, 122, 126, 111, 120, 42, 110, 101, 111, 121, 42, 100, 101, 126, 42, 111, 114, 99, 121, 126, 78, 107, 110, Byte.MAX_VALUE, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 39, 108, 103, 110, 102, 97, 47, 97, 96, 123, 47, 99, 96, 110, 107, 106, 107, 38, 57, 28, 25, 8, 12, 29, 10, 88, 17, 11, 88, 22, 13, 20, 20, 88, 80, 27, 16, 25, 17, 22, 29, 28, 81, 45, 8, 13, 28, 24, 9, 30, 76, 5, 31, 76, 2, 25, 0, 0, 76, 68, 2, 3, 76, 15, 4, 13, 5, 2, 69, 78, 107, 110, Byte.MAX_VALUE, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 96, 97, 47, 124, 123, 110, 125, 123, 78, 107, 5, 36, 107, 38, 36, 57, 46, 107, 42, 47, 107, 40, 42, 37, 47, 34, 47, 42, Utf8.REPLACEMENT_BYTE, 46, 56, 101, 122, 95, 66, 67, 74, 13, 76, 73, 76, 93, 89, 72, 95, 13, 89, 84, 93, 72, 3, 46, 43, 111, 46, 35, Base64.padSymbol, 42, 46, 43, 54, 111, 60, 59, 46, Base64.padSymbol, 59, 42, 43, 94, 91, 76, 52, 37, 60, 26, 17, 24, 16, 23, 38, 9, 24, 11, 24, 20, 10, 76, 91, 74, 79, 90, 79, 97, 76, 68, 75, 77, 90, 14, 71, 93, 14, 64, 91, 66, 66, 38, 45, 32, 49, 58, 51, 55, 38, 39, 28, 42, 39, 122, 113, 105, 118, 109, 112, 113, 114, 122, 113, 107, Utf8.REPLACEMENT_BYTE, 118, 108, Utf8.REPLACEMENT_BYTE, 122, 114, 111, 107, 102, 38, 50, 37, 49, 53, 37, 46, 35, 57, 31, 35, 33, 48, 48, 41, 46, 39, 28, 27, 3, 20, 25, 28, 17, 85, 5, 25, 20, 22, 16, 24, 16, 27, 1, 85, 28, 27, 85, 7, 16, 6, 5, 26, 27, 6, 16, 10, 9, 7, 2, 57, 18, 15, 11, 3, 57, 11, 21, 44, 59, 47, 43, 59, 45, 42, 1, 55, 58};
    }

    public abstract void A0M();

    public abstract void A0O(InterfaceC03710p interfaceC03710p, C8S c8s, C8Q c8q, C04031v c04031v);

    static {
        A08();
        AbstractC0876Lq.A02();
        A0I = AbstractC1291am.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public AbstractC1291am(C1207Yn c1207Yn, C04021u c04021u) {
        this.A0B = c1207Yn;
        this.A07 = c04021u;
        K4 k4 = A0H;
        if (k4 != null) {
            this.A0A = k4;
        } else {
            this.A0A = new K4(c1207Yn);
        }
        this.A0A.A0P(this);
        C03760u c03760u = A0G;
        if (c03760u != null) {
            this.A09 = c03760u;
        } else {
            this.A09 = new C03760u();
        }
        DynamicLoaderFactory.makeLoader(c1207Yn).getInitApi().onAdLoadInvoked(c1207Yn);
        this.A08 = c1207Yn.A09();
        c1207Yn.A0E().A4r();
    }

    private void A09(C1109Up c1109Up) throws JSONException {
        C8S placement = c1109Up.A00();
        if (placement == null || placement.A05() == null) {
            String strA07 = A07(279, 29, 125);
            C0813Jb error = new C0813Jb(AdErrorType.NO_AD_PLACEMENT, strA07);
            this.A0B.A0E().A4t(error.A03().getErrorCode(), strA07);
            AbstractC03720q abstractC03720q = this.A06;
            if (abstractC03720q != null) {
                abstractC03720q.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        C8S c8s = this.A04;
        JSONObject jSONObjectA09 = c8s.A09();
        String strA072 = A07(Opcodes.MONITOREXIT, 3, 93);
        if (jSONObjectA09 == null) {
            C8Q c8qA04 = c8s.A04();
            if (!A0D(c8s, c8qA04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A07().A9a(strA072, C8A.A0a, new C8B(A07(81, 26, 100), c8qA04.A02()));
                ABR(C0813Jb.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            C04031v loadConfig = new C04031v(c8qA04.A04(), c8s.A05(), this.A07.A0A, c8s.A05().A0C());
            A0O(this.A00, c8s, c8qA04, loadConfig);
            return;
        }
        ArrayList arrayList = new ArrayList();
        C8Q c8qA042 = c8s.A04();
        do {
            if (arrayList.isEmpty()) {
                if (A0D(c8s, c8qA042)) {
                    arrayList.add(c8qA042);
                } else {
                    return;
                }
            } else if (A0C(c8qA042)) {
                arrayList.add(c8qA042);
            }
            c8qA042 = c8s.A04();
        } while (c8qA042 != null);
        if (this.A00 == null) {
            this.A0B.A07().A9a(strA072, C8A.A0a, new C8B(A07(56, 25, 112), ((C8Q) arrayList.get(0)).A02()));
            ABR(C0813Jb.A00(AdErrorType.INTERNAL_ERROR));
            return;
        }
        boolean loaded = false;
        try {
            if (arrayList.size() > 1 && this.A00.AGd()) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C8Q) it.next()).A04());
                }
                jSONObject.put(A07(192, 3, 55), jSONArray);
                jSONObject.put(A07(Opcodes.IFNULL, 12, 113), c8s.A09());
                C04031v loadConfig2 = new C04031v(jSONObject, c8s.A05(), this.A07.A0A, c8s.A05().A0C());
                A0O(this.A00, c8s, c8qA042, loadConfig2);
                loaded = true;
            }
        } catch (Exception unused) {
            loaded = false;
        }
        if (!loaded) {
            if (arrayList.isEmpty()) {
                C0813Jb c0813JbA01 = C0813Jb.A01(AdErrorType.NO_FILL, A07(0, 0, 73));
                this.A0B.A0E().A4t(c0813JbA01.A03().getErrorCode(), A07(133, 22, 67));
                AbstractC03720q abstractC03720q2 = this.A06;
                if (abstractC03720q2 != null) {
                    abstractC03720q2.A0G(c0813JbA01);
                    return;
                }
                return;
            }
            InterfaceC03710p interfaceC03710p = this.A00;
            String[] strArr = A0E;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[0] = "F2ixlBYVHNYJB4bAHADqJrSynawwg1yM";
            strArr2[5] = "djkwyiiWLTaQwWMcVWQWfq0o8Ww2Jgo9";
            if (interfaceC03710p == null) {
                this.A0B.A07().A9a(strA072, C8A.A0a, new C8B(A07(22, 34, 7), ((C8Q) arrayList.get(0)).A02()));
                ABR(C0813Jb.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            C8Q c8q = (C8Q) arrayList.get(0);
            C04031v loadConfig3 = new C04031v(c8q.A04(), c8s.A05(), this.A07.A0A, c8s.A05().A0C());
            A0O(this.A00, c8s, c8q, loadConfig3);
        }
    }

    private final void A0A(String str, AdExperienceType adExperienceType) {
        this.A0B.A0E().A4u(str != null);
        this.A03 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            ABR(new C0813Jb(AdErrorType.API_NOT_SUPPORTED, A07(0, 0, 73)));
            return;
        }
        try {
            C0822Jl bidPayload = new C0822Jl(this.A0B, str, this.A07.A0A, this.A07.A09);
            K1 k1A01 = this.A07.A01(this.A0B, bidPayload, adExperienceType);
            this.A05 = k1A01;
            this.A0A.A0O(k1A01);
        } catch (C0814Jc e) {
            C0813Jb c0813JbA02 = C0813Jb.A02(e);
            if (A0E[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "3q2wB1pMY3UXfOrLgu";
            strArr[1] = "CsXqAZILgfX2KA";
            ABR(c0813JbA02);
        }
    }

    private void A0B(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A07(230, 12, 75));
            C03780w.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0C(C8Q c8q) {
        return (c8q == null || c8q.A04() == null) ? false : true;
    }

    private boolean A0D(C8S c8s, C8Q c8q) {
        String strA07 = A07(0, 0, 73);
        if (c8q == null) {
            C0813Jb c0813JbA01 = C0813Jb.A01(AdErrorType.NO_FILL, strA07);
            this.A0B.A0E().A4t(c0813JbA01.A03().getErrorCode(), A07(133, 22, 67));
            AbstractC03720q abstractC03720q = this.A06;
            if (abstractC03720q != null) {
                abstractC03720q.A0G(c0813JbA01);
            }
            return false;
        }
        String strA02 = c8q.A02();
        InterfaceC03710p interfaceC03710pA00 = this.A09.A00(this.A0B, c8s.A05().A0D());
        if (interfaceC03710pA00 == null) {
            this.A0B.A07().A9a(A07(Opcodes.MONITOREXIT, 3, 93), C8A.A0a, new C8B(A07(0, 22, 2), strA02));
            ABR(C0813Jb.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        }
        if (this.A07.A00() != interfaceC03710pA00.A7e()) {
            C0813Jb c0813JbA012 = C0813Jb.A01(AdErrorType.INTERNAL_ERROR, strA07);
            this.A0B.A0E().A4t(c0813JbA012.A03().getErrorCode(), A07(155, 19, 37));
            AbstractC03720q abstractC03720q2 = this.A06;
            if (abstractC03720q2 != null) {
                abstractC03720q2.A0G(c0813JbA012);
            }
            return false;
        }
        this.A00 = interfaceC03710pA00;
        String[] strArr = A0E;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[0] = "MKxF4EMWgzzLH5X7HNcHVA2i4zdAiZz9";
        strArr2[5] = "4tfdEW2uI31voJBW941pIR5b1aNGKiQe";
        JSONObject dataObject = c8q.A04();
        if (dataObject != null) {
            String adapterName = dataObject.optString(A07(320, 10, 86));
            this.A0B.A0E().AGD(adapterName);
            this.A0B.A0C(adapterName);
            C1206Ym c1206YmA00 = AbstractC05347e.A00();
            if (c1206YmA00 != null) {
                c1206YmA00.A0C(adapterName);
            }
            A0B(dataObject.optJSONObject(A07(262, 17, 72)));
            if (this.A05 == null) {
                String strA072 = A07(242, 20, 23);
                C0813Jb c0813JbA013 = C0813Jb.A01(AdErrorType.UNKNOWN_ERROR, strA072);
                this.A0B.A0E().A4t(c0813JbA013.A03().getErrorCode(), strA072);
                AbstractC03720q abstractC03720q3 = this.A06;
                if (abstractC03720q3 != null) {
                    abstractC03720q3.A0G(c0813JbA013);
                }
                return false;
            }
            return true;
        }
        String strA073 = A07(212, 18, 38);
        C0813Jb c0813JbA014 = C0813Jb.A01(AdErrorType.UNKNOWN_ERROR, strA073);
        this.A0B.A0E().A4t(c0813JbA014.A03().getErrorCode(), strA073);
        AbstractC03720q abstractC03720q4 = this.A06;
        if (abstractC03720q4 != null) {
            abstractC03720q4.A0G(c0813JbA014);
        }
        return false;
    }

    public final long A0E() {
        C8S c8s = this.A04;
        if (c8s != null) {
            return c8s.A03();
        }
        return -1L;
    }

    public final Handler A0F() {
        return A0F;
    }

    public C1F A0G() {
        return ((AbstractC1314b9) this.A01).A0H();
    }

    public final C8T A0H() {
        C8S c8s = this.A04;
        if (c8s == null) {
            return null;
        }
        return c8s.A05();
    }

    public final void A0I() {
        String strA6T;
        this.A0B.A0E().A2q(C0865Lf.A01(this.A03));
        InterfaceC03710p interfaceC03710p = this.A01;
        if (interfaceC03710p == null || (strA6T = interfaceC03710p.A6T()) == null) {
            return;
        }
        HashMap map = new HashMap();
        String strA04 = C0865Lf.A04(this.A03);
        String clientToken = A07(308, 12, 110);
        map.put(clientToken, strA04);
        new JA(strA6T, this.A08).A04(J9.A08, map);
    }

    public final void A0J() {
        InterfaceC03710p interfaceC03710p = this.A01;
        String strA07 = A07(Opcodes.MONITOREXIT, 3, 93);
        if (interfaceC03710p == null) {
            String strA072 = A07(107, 26, 7);
            this.A0B.A07().A9a(strA07, C8A.A0Q, new C8B(strA072));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0E().A4t(adErrorType.getErrorCode(), strA072);
            AbstractC03720q abstractC03720q = this.A06;
            if (abstractC03720q != null) {
                String errorMessage = adErrorType.getDefaultErrorMessage();
                abstractC03720q.A0G(C0813Jb.A01(adErrorType, errorMessage));
            }
            this.A0B.A0E().A4w();
            return;
        }
        if (this.A0C) {
            String strA073 = A07(Opcodes.FRETURN, 18, 71);
            this.A0B.A07().A9a(strA07, C8A.A0M, new C8B(strA073));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0E().A4t(adErrorType2.getErrorCode(), strA073);
            AbstractC03720q abstractC03720q2 = this.A06;
            if (abstractC03720q2 != null) {
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                abstractC03720q2.A0G(C0813Jb.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0E().A4v();
            return;
        }
        if (!TextUtils.isEmpty(this.A01.A6T())) {
            this.A08.AA3(this.A01.A6T());
        }
        this.A0B.A0E().A4x();
        this.A0C = true;
        A0M();
    }

    public final void A0K() {
        A0V(false);
    }

    public final void A0L() {
        if (this.A02 != null) {
            C03780w.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0N(InterfaceC03710p interfaceC03710p) {
        if (interfaceC03710p != null) {
            interfaceC03710p.onDestroy();
        }
    }

    public final void A0P(AbstractC03720q abstractC03720q) {
        this.A06 = abstractC03720q;
    }

    public final void A0Q(C04031v c04031v) {
        A0S(c04031v.A03().optString(A07(210, 2, 39)));
    }

    public void A0R(String str) {
        A0A(str, null);
    }

    public final void A0S(String str) {
        this.A0B.A0E().A4q();
        if (!TextUtils.isEmpty(str)) {
            new JA(str, this.A08).A04(J9.A04, null);
        }
    }

    public final void A0T(String str) {
        A0R(str);
    }

    public final void A0U(String str, AdExperienceType adExperienceType) {
        A0A(str, adExperienceType);
    }

    public void A0V(boolean z) {
        if (!z && !this.A0C) {
            return;
        }
        this.A0B.A0E().A4y();
        A0N(this.A01);
        this.A0C = false;
    }

    public final boolean A0W() {
        C8S c8s = this.A04;
        return c8s == null || c8s.A0C();
    }

    @Override // com.facebook.ads.redexgen.uinode.K3
    public final synchronized void ABR(C0813Jb c0813Jb) {
        A0F().post(new C1292an(this, c0813Jb));
    }

    @Override // com.facebook.ads.redexgen.uinode.K3
    public final synchronized void ADG(C1109Up c1109Up) {
        try {
            A09(c1109Up);
        } catch (Exception e) {
            this.A0B.A07().A9a(A07(Opcodes.MONITOREXIT, 3, 93), C8A.A0T, new C8B(e));
        }
    }
}
