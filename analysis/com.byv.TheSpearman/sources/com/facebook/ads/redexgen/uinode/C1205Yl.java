package com.facebook.ads.redexgen.uinode;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Yl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1205Yl extends AbstractC05447s {
    public static byte[] A00;
    public static String[] A01 = {"jrDlnlrK", "iy84zN2ZyMyHjuWhjHotEPEqpiKyPe89", "dhX4OOJDnXlCZP9pL8vYTq2cDSC1Ep0f", "V5wGJKV", "mjidYuf4", "f2fONlBHJxOBrlG7qLTpq6ivaaiBfV2e", "tNB7OhzIAdgb5rZvvS5ZVqcHEeMF5GsI", "2zYeFugNugInNaPrLN78SJaAZY8hyaCl"};
    public static final C05407m A02;
    public static final C05407m A03;
    public static final C05407m A04;
    public static final C05407m A05;
    public static final C05407m A06;
    public static final C05407m A07;
    public static final C05407m A08;
    public static final C05407m A09;
    public static final C05407m A0A;
    public static final C05407m[] A0B;
    public static final String A0C;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-102, -73, -102, -71, -92, -87, -81, -96, -94, -96, -83, -22, -35, -39, -28, -93, -107, -100, -107, -109, -92, 112, 122, 112, -106, -94, -97, -99, 112, -75, -58, -75, -66, -60, -61, 112, -89, -104, -107, -94, -107, 112, -11, -25, -18, -25, -27, -10, -62, 5, 17, 23, 16, 22, -54, -52, -53, -62, -24, -12, -15, -17, -62, 7, 24, 7, 16, 22, 21, -49, -64, -45, -49, -95, -110, -91, -95, 109, -99, -97, -106, -102, -114, -97, -90, 109, -104, -110, -90, -19, -34, -15, -19, -71, -21, -34, -33, -34, -21, -34, -25, -36, -34, -20, -71, 13, 8, 4, -2, 7, 12, -71, -24, -25, -71, -18, -23, -35, -38, -19, -34, -71, -36, -38, -20, -36, -38, -35, -34, -71, -24, -25, -71, -35, -34, -27, -34, -19, -34, -71, -21, -34, -20, -19, -21, -30, -36, -19, -17, 2, 2, -13, -5, -2, 2, -85, -88, -69, -88, -82, -65, -82, -73, -67, -88, -78, -83, -4, 13, -4, 5, 11, 10, -77, -75, -84, -78, -75, -84, -73, -68, -80, -94, -80, -80, -90, -84, -85, -100, -90, -95, -90, -104, -90, -90, -100, -94, -95, -110, -89, -100, -96, -104, -43, -54, -50, -58, -96, -101, -105, -111, -102, -117, -107, -112, -32, -27, -36, -47};
    }

    static {
        A04();
        C05407m c05407m = new C05407m(0, A00(Opcodes.IF_ICMPEQ, 8, 31), A00(73, 16, 35));
        A04 = c05407m;
        C05407m c05407m2 = new C05407m(1, A00(207, 8, 2), A00(89, 59, 111));
        A09 = c05407m2;
        String strA00 = A00(Opcodes.LRETURN, 8, 25);
        String strA002 = A00(4, 7, 49);
        C05407m c05407m3 = new C05407m(2, strA00, strA002);
        A05 = c05407m3;
        String strA003 = A00(215, 4, 66);
        String strA004 = A00(69, 4, 81);
        C05407m c05407m4 = new C05407m(3, strA003, strA004);
        A0A = c05407m4;
        String strA005 = A00(203, 4, 55);
        String strA006 = A00(11, 4, 110);
        C05407m c05407m5 = new C05407m(4, strA005, strA006);
        A08 = c05407m5;
        C05407m c05407m6 = new C05407m(5, A00(Opcodes.ATHROW, 12, 9), strA006);
        A07 = c05407m6;
        C05407m c05407m7 = new C05407m(6, A00(Opcodes.PUTFIELD, 10, 19), strA004);
        A06 = c05407m7;
        C05407m c05407m8 = new C05407m(7, A00(155, 4, 29), strA004);
        A03 = c05407m8;
        C05407m c05407m9 = new C05407m(8, A00(Opcodes.LCMP, 7, 100), strA002);
        A02 = c05407m9;
        C05407m[] c05407mArr = {c05407m, c05407m2, c05407m3, c05407m4, c05407m5, c05407m6, c05407m7, c05407m8, c05407m9};
        A0B = c05407mArr;
        A0C = AbstractC05447s.A02(A00(Opcodes.GOTO, 6, 109), c05407mArr);
    }

    public C1205Yl(C05417o c05417o) {
        super(c05417o);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05447s
    public final String A06() {
        return A00(Opcodes.GOTO, 6, 109);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05447s
    public final C05407m[] A0A() {
        return A0B;
    }

    public final Cursor A0B() {
        return A05().rawQuery(A00(42, 27, 120), null);
    }

    public final Cursor A0C() {
        return A05().rawQuery(A0C, null);
    }

    public final Cursor A0D(String str) {
        return A05().rawQuery(A00(15, 27, 38) + A04.A01 + A00(0, 4, 80), new String[]{str});
    }

    public final String A0E(String str, int i, String str2, double d, double d2, String str3, Map<String, String> map) throws SQLException {
        String string = UUID.randomUUID().toString();
        ContentValues contentValues = new ContentValues(9);
        String eventId = A04.A01;
        contentValues.put(eventId, string);
        String eventId2 = A09.A01;
        contentValues.put(eventId2, str);
        contentValues.put(A05.A01, Integer.valueOf(i));
        String eventId3 = A0A.A01;
        contentValues.put(eventId3, str2);
        contentValues.put(A08.A01, Double.valueOf(d));
        contentValues.put(A07.A01, Double.valueOf(d2));
        String eventId4 = A06.A01;
        contentValues.put(eventId4, str3);
        String str4 = A03.A01;
        String eventId5 = map != null ? new JSONObject(map).toString() : null;
        contentValues.put(str4, eventId5);
        if (A01[2].charAt(6) == '9') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "s3YvQaCKhotLBtEqHITMzm2bHxiojI5j";
        strArr[5] = "6LuOsEhvTekWWK5Zi4EuC4VUkJbxKkeL";
        contentValues.put(A02.A01, (Integer) 0);
        SQLiteDatabase sQLiteDatabaseA05 = A05();
        String eventId6 = A00(Opcodes.GOTO, 6, 109);
        sQLiteDatabaseA05.insertOrThrow(eventId6, null, contentValues);
        return string;
    }

    public final boolean A0F(String str) {
        return A05().delete(A00(Opcodes.GOTO, 6, 109), new StringBuilder().append(A04.A01).append(A00(0, 4, 80)).toString(), new String[]{str}) > 0;
    }
}
