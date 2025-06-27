package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class JW implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C05357f A00;
    public final /* synthetic */ JZ A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{3, 27, 5, 60, Base64.padSymbol, 39, 32, 59, 38, 45, 89, 78, 91, 68, 89, 95, 66, 69, 76, 54, 33, 53, 49, 33, 55, 48, 27, 45, 32};
    }

    public JW(JZ jz, String str, C05357f c05357f) {
        this.A01 = jz;
        this.A02 = str;
        this.A00 = c05357f;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ArrayList arrayList;
        if (KL.A02(this)) {
            return;
        }
        try {
            C8B nvl = new C8B(A00(0, 3, 52));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, 45), jSONArray);
            jSONObject.put(A00(19, 10, 61), this.A02);
            synchronized (this.A01.A0D) {
                arrayList = new ArrayList(this.A01.A0D);
                this.A01.A0D.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                JY jy = (JY) it.next();
                jSONArray.put(A00(0, 0, 60) + jy.A00 + ';' + jy.A02 + ';' + jy.A01);
            }
            nvl.A07(jSONObject);
            nvl.A05(1);
            this.A00.A07().A9b(A00(10, 9, 82), C8A.A2R, nvl);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
