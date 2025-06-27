package com.facebook.ads.redexgen.uinode;

import android.database.Cursor;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class EN implements YH {
    public static byte[] A03;
    public static String[] A04 = {"zSqnO64p11LQVC3SPrHTwk7q", "RQQcRArwNRw7pCFobI7zm4AECBhyO", "uX7W3VjoXSZ8mIic8tH9fb17VHeYN2EI", "VdQ4q", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "roUcO9bhLUMzgbi0", "6tdL5l5B64y16QievzXwm2hdxMIwTdT2", "M1EyYsdVjnJYnVOvo"};
    public boolean A00 = true;
    public final C1206Ym A01;
    public final C05417o A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        String[] strArr = A04;
        if (strArr[7].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "GUa5RhIL61d4FW3HWW0RBx9i";
        strArr2[1] = "4nKtohmUbY7tHai9z2t8ojCMJbrZv";
        A03 = new byte[]{62, 28, 19, 90, 9, 93, 25, 24, 17, 24, 9, 24, 93, 28, 9, 9, 24, 16, 13, 9, 14, 93, 24, 5, 30, 24, 24, 25, 24, 25, 93, 24, 11, 24, 19, 9, 14, 83, 16, 21, 7, 24, 21, 46, 59, 59, 42, 34, Utf8.REPLACEMENT_BYTE, 59, Byte.MAX_VALUE, 122, 111, 122, 16, 29, 50, 36, 50, 50, 40, 46, 47, 30, 40, 37, 32, 54, 32, 32, 58, 60, Base64.padSymbol, 12, 39, 58, 62, 54, 76, 81, 85, 93, 20, 15, 11, 5, 14, Utf8.REPLACEMENT_BYTE, 9, 4, Byte.MAX_VALUE, 114, 123, 110};
    }

    static {
        A04();
    }

    public EN(C1206Ym c1206Ym) {
        this.A01 = c1206Ym;
        this.A02 = new C05417o(c1206Ym);
    }

    private JSONArray A01(Cursor cursor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(54, 2, 44), cursor.getString(C1205Yl.A04.A00));
            jSONObject.put(A00(82, 8, 53), cursor.getString(C1205Yl.A09.A00));
            jSONObject.put(A00(90, 4, 94), cursor.getString(C1205Yl.A0A.A00));
            jSONObject.put(A00(78, 4, 109), C0865Lf.A02(cursor.getDouble(C1205Yl.A08.A00)));
            jSONObject.put(A00(66, 12, 6), C0865Lf.A02(cursor.getDouble(C1205Yl.A07.A00)));
            jSONObject.put(A00(56, 10, 20), cursor.getString(C1205Yl.A06.A00));
            String string = cursor.getString(C1205Yl.A03.A00);
            jSONObject.put(A00(50, 4, 78), string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put(A00(43, 7, 26), cursor.getString(C1205Yl.A02.A00));
            jSONObject.put(A00(38, 5, 36), this.A01.A03().A7H());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private JSONArray A02(Cursor cursor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(54, 2, 44), cursor.getString(2));
            jSONObject.put(A00(82, 8, 53), cursor.getString(0));
            jSONObject.put(A00(90, 4, 94), cursor.getString(4));
            jSONObject.put(A00(78, 4, 109), C0865Lf.A02(cursor.getDouble(5)));
            jSONObject.put(A00(66, 12, 6), C0865Lf.A02(cursor.getDouble(6)));
            jSONObject.put(A00(56, 10, 20), cursor.getString(7));
            String string = cursor.getString(8);
            jSONObject.put(A00(50, 4, 78), string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put(A00(43, 7, 26), cursor.getString(9));
            jSONObject.put(A00(38, 5, 36), this.A01.A03().A7H());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static JSONObject A03(Cursor cursor) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        while (cursor.moveToNext()) {
            String string = cursor.getString(C1204Yk.A02.A00);
            String string2 = cursor.getString(C1204Yk.A01.A00);
            String[] strArr = A04;
            if (strArr[6].charAt(14) != strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "IfQdYzKY6vCyBSxPg";
            strArr2[5] = "fxZpsWnZoPKbT5Dt";
            jSONObject.put(string, string2);
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05728v
    public final int A4I(int i) {
        int iA08 = 0;
        if (i > -1) {
            try {
                iA08 = this.A02.A08(i);
            } catch (Exception e) {
                if (this.A01.A04().A8z()) {
                    Log.e(YH.A00, A00(0, 38, 40), e);
                }
            }
        }
        this.A02.A0I();
        if (this.A00) {
            this.A02.A0J();
        }
        return iA08;
    }

    @Override // com.facebook.ads.redexgen.uinode.C8w
    public final void A4J() {
        this.A02.A0H();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05728v
    public final boolean A53(String str) {
        return this.A02.A0K(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05728v
    public final JSONArray A5y() {
        Cursor cursorA0A = null;
        try {
            cursorA0A = this.A02.A0A();
            JSONArray jSONArrayA01 = null;
            if (cursorA0A.getCount() > 0) {
                jSONArrayA01 = A01(cursorA0A);
            }
            if (cursorA0A != null) {
                cursorA0A.close();
            }
            return jSONArrayA01;
        } catch (JSONException unused) {
            if (cursorA0A != null) {
                cursorA0A.close();
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (cursorA0A != null) {
                cursorA0A.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05728v
    public final JSONObject A5z() {
        Cursor cursorA0B = null;
        try {
            cursorA0B = this.A02.A0B();
            JSONObject jSONObjectA03 = null;
            if (cursorA0B.getCount() > 0) {
                jSONObjectA03 = A03(cursorA0B);
            }
            if (cursorA0B != null) {
                cursorA0B.close();
            }
            return jSONObjectA03;
        } catch (JSONException unused) {
            if (cursorA0B != null) {
                cursorA0B.close();
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (cursorA0B != null) {
                cursorA0B.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05728v
    public final int A6z() {
        Cursor cursorA09 = null;
        try {
            cursorA09 = this.A02.A09();
            return cursorA09.moveToFirst() ? cursorA09.getInt(0) : 0;
        } finally {
            if (cursorA09 != null) {
                cursorA09.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05728v
    public final String A72(String str) {
        String string = null;
        Cursor cursorA0D = this.A02.A0D(str);
        if (cursorA0D != null) {
            if (cursorA0D.moveToNext() && cursorA0D.getCount() > 0) {
                C05407m c05407m = C1205Yl.A0A;
                String[] strArr = A04;
                String str2 = strArr[7];
                String eventType = strArr[5];
                if (str2.length() == eventType.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[3] = "VgiME";
                strArr2[4] = "4";
                String eventType2 = c05407m.A01;
                string = cursorA0D.getString(cursorA0D.getColumnIndex(eventType2));
            }
            cursorA0D.close();
        }
        return string;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05728v
    public final Pair<JSONObject, JSONArray> A89(int i) {
        Cursor cursorA0C = null;
        try {
            try {
                cursorA0C = this.A02.A0C(i);
                JSONArray events = null;
                JSONObject tokens = null;
                if (cursorA0C.getCount() > 0) {
                    tokens = A03(cursorA0C);
                    events = A02(cursorA0C);
                }
                Pair<JSONObject, JSONArray> pair = new Pair<>(tokens, events);
                if (cursorA0C != null) {
                    cursorA0C.close();
                }
                return pair;
            } catch (JSONException unused) {
                Pair<JSONObject, JSONArray> pair2 = new Pair<>(null, null);
                if (cursorA0C != null) {
                    cursorA0C.close();
                }
                return pair2;
            }
        } catch (Throwable th) {
            if (cursorA0C != null) {
                cursorA0C.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05728v
    public final boolean A8m(String str) {
        return this.A02.A0L(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8t != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.uinode.C8w
    public final void AHE(C0812Iz c0812Iz, AbstractC05708t<String> abstractC05708t) {
        this.A02.A0G(c0812Iz.A08(), c0812Iz.A05().A00, c0812Iz.A06().toString(), c0812Iz.A04(), c0812Iz.A03(), c0812Iz.A07(), c0812Iz.A09(), abstractC05708t);
    }
}
