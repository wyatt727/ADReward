package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1336bV extends KT {
    public static byte[] A02;
    public final /* synthetic */ C03780w A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{7, 19, 4, 16, 20, 4, 15, 2, 24, 62, 2, 0, 17, 17, 8, 15, 6};
    }

    public C1336bV(C03780w c03780w, JSONObject jSONObject) {
        this.A00 = c03780w;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() throws InterruptedException {
        try {
            this.A00.A05.await();
            synchronized (this.A00.A02) {
                this.A00.A02.A0B(this.A01);
                this.A00.A06.countDown();
            }
        } catch (InterruptedException e) {
            this.A00.A03.A07().A9a(A00(0, 17, 116), C8A.A1B, new C8B(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            this.A00.A03.A07().A9a(A00(0, 17, 116), C8A.A1A, new C8B(e2));
        }
    }
}
