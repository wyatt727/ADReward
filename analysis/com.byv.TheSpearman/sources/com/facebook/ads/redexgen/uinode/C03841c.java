package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.1c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03841c implements Serializable {
    public static byte[] A0D = null;
    public static String[] A0E = {"U8UpqfD5GcCjHjfawFZje9GDKAZv", "HUavThSyJs21QkbQiVkA2MVijDNZ2nZM", "IARTRQxD0JaHLqaDLyMBN", "Hsg2CAAgFk1Vd6W6cseJD0UtB0g0pB8N", "UbckorOyb4FxR7xZ8GphAvSWlQBuZ4z3", "t3UgO82iTBj4Je3asj0XN1i1cbfA", "fleIFkN77EtPYIR4IZjCzdODP1NyIKiN", "OPDxW3mvsrdjNTdOIjiPk89aFloqol7I"};
    public static final EnumC03851d A0F;
    public static final EnumC0924Nm A0G;
    public static final long serialVersionUID = -5352540123250859603L;
    public String A00;
    public final int A01;
    public final int A02;
    public final EnumC03851d A03;
    public final EnumC0924Nm A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            if (A0E[6].charAt(18) == 'U') {
                throw new RuntimeException();
            }
            A0E[2] = "FjEz07QReKngvCKAACpwo";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0D = new byte[]{124, 64, 77, 85, 12, Byte.MAX_VALUE, 88, 67, 94, 73, 12, 91, 69, 64, 64, 12, 77, 89, 88, 67, 65, 77, 88, 69, 79, 77, 64, 64, 85, 12, 67, 92, 73, 66, 12, 69, 66, 12, 119, 95, 73, 79, 95, 113, 95, 65, 118, 100, 114, 97, 119, 118, 119, 51, 67, Byte.MAX_VALUE, 114, 106, 80, 95, 90, 86, 93, 71, 108, 71, 92, 88, 86, 93, 82, 69, 111, 110, 103, 106, 114, 84, 104, 103, 98, 104, 96, 84, Byte.MAX_VALUE, 110, 115, Byte.MAX_VALUE, 54, Base64.padSymbol, 50, 49, Utf8.REPLACEMENT_BYTE, 54, 12, 54, Base64.padSymbol, 55, 12, 48, 50, 33, 55, 68, 79, 64, 67, 77, 68, 126, 72, 79, 85, 83, 78, 126, 66, 64, 83, 69, 20, 22, 29, 22, 1, 26, 16, 44, 7, 22, 11, 7, 112, 119, 106, 109, 120, 119, 122, 124, 70, 112, 125, 34, 37, Utf8.REPLACEMENT_BYTE, 57, 36, 20, 40, 42, 57, 47, 20, 34, 40, 36, 37, 20, 62, 57, 39, 112, 106, 70, 105, 117, 120, 96, 120, 123, 117, 124, 70, 107, 124, 116, 118, 109, 124, 70, Byte.MAX_VALUE, 118, 107, 116, 120, 109, 83, 78, 85, 89, 82, 72, 93, 72, 85, 83, 82, 56, 36, 41, 49, 41, 42, 36, 45, 23, 44, 41, 60, 41, 52, 54, 33, 39, 37, 39, 44, 45, 42, 35, 27, 41, 33, 48, 44, 43, 32, 2, 21, 7, 17, 2, 20, 21, 20, 47, 0, 28, 17, 9, 47, 4, 21, 8, 4, 87, 79, 77, 84, 84, 69, 70, 72, 65, 123, 87, 65, 71, 75, 74, 64, 87, 101, 126, 99, 123, 121, 96, 96, 113, 114, 124, 117, 79, 99, 117, 115, Byte.MAX_VALUE, 126, 116, 99, 75, 76, 87, 1, 19, 20, 41, 0, 31, 19, 1, 41, 2, 31, 27, 19, 25, 3, 2, 41, 31, 24, 41, 27, 31, 26, 26, 31, 5, 19, 21, 25, 24, 18, 5};
    }

    static {
        A06();
        A0G = EnumC0924Nm.A05;
        A0F = EnumC03851d.A03;
    }

    public C03841c(String str, String str2, int i, String str3, String str4, EnumC0924Nm enumC0924Nm, int i2, boolean z, boolean z2, EnumC03851d enumC03851d, boolean z3, String str5) {
        if (z3) {
            String string = UUID.randomUUID().toString();
            this.A08 = string;
            Uri uri = AbstractC0858Ky.A00(str).buildUpon().appendQueryParameter(A03(132, 11, 111), string).appendQueryParameter(A03(58, 12, 69), str5).build();
            this.A07 = uri.toString();
        } else {
            this.A07 = str;
            this.A08 = null;
        }
        this.A06 = str2;
        this.A01 = i;
        this.A09 = str3;
        this.A05 = str4;
        this.A04 = enumC0924Nm;
        this.A02 = i2;
        this.A0B = z;
        this.A0A = z2;
        this.A03 = enumC03851d;
        this.A0C = z3;
    }

    public static int A00(JSONObject jSONObject) {
        String strA03 = A03(246, 17, 82);
        if (jSONObject.has(strA03)) {
            return jSONObject.optInt(strA03);
        }
        return jSONObject.optInt(A03(263, 19, 102), 0);
    }

    public static C03841c A01(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A03(Opcodes.IFNULL, 13, 62));
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new C03841c(jSONObjectOptJSONObject.optString(A03(282, 3, 72)), jSONObjectOptJSONObject.optString(A03(Opcodes.D2L, 19, 61)), A00(jSONObject), A05(jSONObjectOptJSONObject), A04(jSONObjectOptJSONObject), A02(jSONObjectOptJSONObject), jSONObjectOptJSONObject.optInt(A03(285, 32, 0), 5000), jSONObjectOptJSONObject.optBoolean(A03(103, 17, 87), true), jSONObjectOptJSONObject.optBoolean(A03(88, 15, 37)), EnumC03851d.A00(jSONObjectOptJSONObject.optString(A03(211, 17, 50), A0F.name())), jSONObjectOptJSONObject.optBoolean(A03(Opcodes.IF_ICMPGE, 25, 111)), jSONObject.optString(A03(70, 2, 71)));
    }

    public static EnumC0924Nm A02(JSONObject jSONObject) {
        int orientation = jSONObject.optInt(A03(Opcodes.NEW, 11, 74), A0G.A03());
        return EnumC0924Nm.A00(orientation);
    }

    public static String A04(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A03(120, 12, 5));
        String strA03 = A03(0, 45, 90);
        return jSONObjectOptJSONObject == null ? strA03 : jSONObjectOptJSONObject.optString(A03(72, 16, 125), strA03);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A03(120, 12, 5));
        String strA03 = A03(45, 13, 101);
        return jSONObjectOptJSONObject == null ? strA03 : jSONObjectOptJSONObject.optString(A03(228, 18, 6), strA03);
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        return this.A02;
    }

    public final EnumC03851d A09() {
        return this.A03;
    }

    public final EnumC0924Nm A0A() {
        return this.A04;
    }

    public final String A0B() {
        return this.A00;
    }

    public final String A0C() {
        return this.A05;
    }

    public final String A0D() {
        return this.A06;
    }

    public final String A0E() {
        return this.A07;
    }

    public final String A0F() {
        return this.A08;
    }

    public final String A0G() {
        return this.A09;
    }

    public final void A0H(String str) {
        this.A00 = str;
    }

    public final boolean A0I() {
        return this.A0B;
    }

    public final boolean A0J() {
        return this.A0C;
    }
}
