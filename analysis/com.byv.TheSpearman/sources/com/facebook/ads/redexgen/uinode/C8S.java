package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8S {
    public static byte[] A07;
    public C8T A01;
    public String A02;
    public String A03;
    public String A04;
    public JSONObject A06;
    public int A00 = 0;
    public List<C8Q> A05 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 109);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{79, 88};
    }

    public C8S(C8T c8t, String str, String str2, String str3) {
        this.A01 = c8t;
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final int A02() {
        return this.A05.size();
    }

    public final long A03() {
        C8T c8t = this.A01;
        if (c8t != null) {
            return c8t.A0C() + this.A01.A03();
        }
        return -1L;
    }

    public final C8Q A04() {
        if (this.A00 < this.A05.size()) {
            int i = this.A00 + 1;
            this.A00 = i;
            return this.A05.get(i - 1);
        }
        return null;
    }

    public final C8T A05() {
        return this.A01;
    }

    public final String A06() {
        return this.A02;
    }

    public final String A07() {
        int i = this.A00;
        if (i > 0 && i <= this.A05.size()) {
            return this.A05.get(this.A00 - 1).A04().optString(A00(0, 2, 65));
        }
        return null;
    }

    public final String A08() {
        return this.A04;
    }

    public final JSONObject A09() {
        return this.A06;
    }

    public final void A0A(C8Q c8q) {
        this.A05.add(c8q);
    }

    public final void A0B(JSONObject jSONObject) {
        this.A06 = jSONObject;
    }

    public final boolean A0C() {
        return this.A01 == null || C0865Lf.A00() > this.A01.A0C() + ((long) this.A01.A03());
    }
}
