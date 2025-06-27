package com.facebook.ads.redexgen.uinode;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Yk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1204Yk extends AbstractC05447s {
    public static byte[] A00;
    public static final C05407m A01;
    public static final C05407m A02;
    public static final C05407m[] A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final String A07;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{19, 14, 19, 91, Utf8.REPLACEMENT_BYTE, 44, 45, 36, 45, 60, 45, 72, 46, 58, 39, 37, 72, 28, 7, 3, 13, 6, 27, 72, Utf8.REPLACEMENT_BYTE, 32, 45, 58, 45, 72, 38, 39, 60, 72, 45, 48, 33, 59, 60, 59, 72, 64, 59, 45, 36, 45, 43, 60, 72, 89, 72, 46, 58, 39, 37, 72, 13, 30, 13, 6, 28, 27, 72, Utf8.REPLACEMENT_BYTE, 32, 45, 58, 45, 72, 28, 7, 3, 13, 6, 27, 70, 8, 53, 46, 40, Base64.padSymbol, 57, 36, 34, 35, 109, 58, 37, 40, 35, 109, 57, Utf8.REPLACEMENT_BYTE, 52, 36, 35, 42, 109, 57, 34, 109, 41, 40, 33, 40, 57, 40, 109, 46, 37, 36, 33, 41, 33, 40, 62, 62, 109, 57, 34, 38, 40, 35, 62, 99, 22, 49, 41, 62, 51, 54, 59, Byte.MAX_VALUE, 43, 48, 52, 58, 49, 113, 92, 77, 80, 92, 74, 91, 70, 74, 62, 78, 76, 87, 83, 95, 76, 71, 62, 85, 91, 71, 36, 55, 36, 47, 53, 50, 2, 25, 29, 19, 24, 25, 2, 6, 8, 3, 50, 4, 9, 80, 75, 79, 65, 74, 87};
    }

    static {
        A04();
        C05407m c05407m = new C05407m(0, A00(Opcodes.TABLESWITCH, 8, 73), A00(Opcodes.D2L, 16, 58));
        A02 = c05407m;
        C05407m c05407m2 = new C05407m(1, A00(Opcodes.IF_ACMPEQ, 5, 82), A00(Opcodes.F2I, 4, 44));
        A01 = c05407m2;
        C05407m[] c05407mArr = {c05407m, c05407m2};
        A03 = c05407mArr;
        A07 = C1204Yk.class.getSimpleName();
        String strA00 = A00(Opcodes.GETSTATIC, 6, 0);
        A05 = AbstractC05447s.A02(strA00, c05407mArr);
        A06 = AbstractC05447s.A03(strA00, c05407mArr, c05407m2);
        A04 = A00(5, 71, 76) + c05407m.A01 + A00(0, 3, 23) + A00(Opcodes.IF_ICMPEQ, 6, 101) + A00(4, 1, 53) + C1205Yl.A09.A01 + A00(3, 1, 86);
    }

    public C1204Yk(C05417o c05417o) {
        super(c05417o);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05447s
    public final String A06() {
        return A00(Opcodes.GETSTATIC, 6, 0);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05447s
    public final C05407m[] A0A() {
        return A03;
    }

    public final Cursor A0B() {
        return A05().rawQuery(A05, null);
    }

    public final String A0C(String str) throws SQLiteException, IllegalArgumentException {
        if (!TextUtils.isEmpty(str)) {
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = A05().rawQuery(A06, new String[]{str});
                String string = cursorRawQuery.moveToNext() ? cursorRawQuery.getString(A02.A00) : null;
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
                String string2 = UUID.randomUUID().toString();
                ContentValues contentValues = new ContentValues(2);
                contentValues.put(A02.A01, string2);
                contentValues.put(A01.A01, str);
                A05().insertOrThrow(A00(Opcodes.GETSTATIC, 6, 0), null, contentValues);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return string2;
            } finally {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
        }
        throw new IllegalArgumentException(A00(125, 14, 123));
    }

    public final void A0D(C1206Ym c1206Ym) throws SQLException {
        try {
            A05().execSQL(A04);
        } catch (SQLException e) {
            if (c1206Ym.A04().A8z()) {
                Log.e(A07, A00(76, 49, 105), e);
            }
        }
    }
}
