package com.facebook.ads.redexgen.uinode;

import android.view.View;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class FR extends AbstractC1291am {
    public static byte[] A03;
    public long A00;
    public View A01;
    public EQ A02;

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{60, 57, 46, 41, 42, 37, 37, 46, 57, 20, 57, 46, 45, 57, 46, 56, 35, 20, Utf8.REPLACEMENT_BYTE, 34, 38, 46, 4, 15, 6, 14, 9, 56, 23, 6, 21, 6, 10, 20, 3, 20, 109, 122, 122, 103, 122, 40, Byte.MAX_VALUE, 96, 97, 100, 109, 40, 120, 105, 122, 123, 97, 102, 111, 40, 107, 96, 105, 97, 102, 109, 108, 40, 105, 108, 123, 40, 74, 105, 102, 102, 109, 122};
    }

    public FR(EQ eq, C04021u c04021u) {
        super(eq, c04021u);
        this.A00 = 10000L;
        this.A02 = eq;
    }

    private C1294ap A01(Runnable runnable) {
        return new C1294ap(this, runnable);
    }

    private List<JSONObject> A04(C04031v c04031v) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectA03 = c04031v.A03();
        if (jSONObjectA03.has(A03(22, 12, 107))) {
            try {
                this.A00 = jSONObjectA03.getJSONObject(r1).optInt(A03(3, 19, 71), 10000);
                JSONArray adsArray = jSONObjectA03.getJSONArray(A03(0, 3, 81));
                if (adsArray.length() > 0) {
                    for (int i = 0; i < adsArray.length(); i++) {
                        arrayList.add((JSONObject) adsArray.get(i));
                    }
                }
            } catch (JSONException unused) {
                String strA03 = A03(36, 38, 4);
                this.A02.A0E().A4t(C0813Jb.A01(AdErrorType.UNKNOWN_ERROR, strA03).A03().getErrorCode(), strA03);
                return arrayList;
            }
        } else {
            arrayList.add(jSONObjectA03);
        }
        return arrayList;
    }

    private void A06(C1328bN c1328bN, JSONObject jSONObject, C8T c8t) {
        this.A0C = false;
        C1293ao c1293ao = new C1293ao(this, c1328bN, LJ.A02(jSONObject, A03(34, 2, 108)));
        A0F().postDelayed(c1293ao, c8t.A05());
        c1328bN.A0J(this.A02, this.A08, this.A07.A08, A01(c1293ao), jSONObject, c8t);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1291am
    public final void A0M() {
        if (this.A01 != null) {
            this.A02.A0E().A3y();
            this.A06.A0E(this.A01);
        } else {
            this.A02.A0E().A3z();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1291am
    public final void A0O(InterfaceC03710p interfaceC03710p, C8S c8s, C8Q c8q, final C04031v c04031v) throws JSONException {
        this.A02.A0E().A3s();
        final C1328bN c1328bN = (C1328bN) interfaceC03710p;
        final List<JSONObject> listA04 = A04(c04031v);
        A06(c1328bN, listA04.get(0), c04031v.A01());
        if (listA04.size() > 1) {
            A0F().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.1w
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0X(c1328bN, listA04, c04031v);
                }
            }, this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1291am
    public final void A0R(String str) {
        this.A02.A0E().A3x(str != null);
        super.A0R(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1291am
    public final void A0V(boolean z) {
        super.A0V(z);
        this.A01 = null;
    }

    public final /* synthetic */ void A0X(C1328bN c1328bN, List list, C04031v c04031v) {
        A06(c1328bN, (JSONObject) list.get(1), c04031v.A01());
    }
}
