package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.14, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass14 {
    public static byte[] A0j;
    public static String[] A0k = {"pffUOHFsbkYgBuiJu7ARpuvPQkGrNkhZ", "BvccWwTCpG", "0meA5FJVxX5DgE5", "YePtA2RMVHx7NgHbnrYgVwrzWSYEbQ1I", "Qf6n1YvjZeW9gtXSw37rMADjtsvw8iaw", "w1EV2p9YRD2VJ3m0eDY9mCLTW1AndQPj", "0h3FbVKspnC9Z104DCdxRPxcboLPUKem", "Fty6e8XTkdUF2BLp98LdpCa12aPx9Eax"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final Uri A09;
    public final EnumC03660j A0A;
    public final AbstractC1310b5 A0B;
    public final JP A0C;
    public final JP A0D;
    public final JP A0E;
    public final JQ A0F;
    public final JU A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final Collection<String> A0d;
    public final List<AnonymousClass14> A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 59 out of bounds for length 50
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public AnonymousClass14(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, JP jp, AbstractC1310b5 abstractC1310b5, JP jp2, JP jp3, JQ jq, String str16, String str17, long j, JU ju, boolean z, int i, int i2, List<AnonymousClass14> list, String str18, String str19, int i3, String str20, Uri uri, String str21, boolean z2, boolean z3, int i4, int i5, int i6, int i7, EnumC03660j enumC03660j, Collection<String> collection, int i8, boolean z4) {
        this.A0J = str;
        this.A0H = str2;
        this.A0V = str3;
        this.A0W = str4;
        this.A0T = str5;
        this.A0S = str6;
        this.A0L = str7;
        this.A0Q = str8;
        this.A0M = str9;
        this.A0R = str10;
        this.A0U = str11;
        this.A0P = str12;
        this.A0O = str13;
        this.A0N = str14;
        this.A0I = str15;
        this.A0C = jp;
        this.A0B = abstractC1310b5;
        this.A0D = jp2;
        this.A0E = jp3;
        this.A0F = jq;
        this.A0c = str16;
        this.A0b = str17;
        this.A08 = j;
        this.A0G = ju;
        this.A0g = z;
        this.A0e = list;
        this.A0X = str18;
        this.A0Z = str19;
        this.A0K = A00(0, 9, 103);
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A0Y = str20;
        this.A09 = uri;
        this.A0a = str21;
        this.A0h = z2;
        this.A0i = z3;
        this.A04 = i4;
        this.A05 = i5;
        this.A06 = i6;
        this.A07 = i7;
        this.A0A = enumC03660j;
        this.A0d = collection;
        this.A03 = i8;
        this.A0f = z4;
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0j, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0k;
            if (strArr[3].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            A0k[1] = "BzWfTynEe4h";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 117);
            i4++;
        }
    }

    public static void A01() {
        A0j = new byte[]{29, 64, 31, 68, 75, 69, Utf8.REPLACEMENT_BYTE, 65, 79};
    }

    static {
        A01();
    }

    public AnonymousClass14() {
        this.A0J = null;
        this.A0H = null;
        this.A0V = null;
        this.A0W = null;
        this.A0T = null;
        this.A0S = null;
        this.A0L = null;
        this.A0Q = null;
        this.A0M = null;
        this.A0R = null;
        this.A0U = null;
        this.A0P = null;
        this.A0O = null;
        this.A0N = null;
        this.A0I = null;
        this.A0K = null;
        this.A0B = null;
        this.A0D = null;
        this.A0E = null;
        this.A0F = null;
        this.A0b = null;
        this.A0c = null;
        this.A0C = null;
        this.A08 = -1L;
        this.A0G = JU.A03;
        this.A0g = false;
        this.A02 = -1;
        this.A01 = 0;
        this.A0f = false;
        String strA00 = A00(0, 0, 102);
        this.A0X = strA00;
        this.A0Z = strA00;
        this.A00 = 0;
        this.A0Y = null;
        this.A09 = null;
        this.A0a = null;
        this.A0h = false;
        this.A0i = false;
        this.A04 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        this.A0A = null;
        this.A0d = null;
        this.A03 = 0;
        this.A0e = null;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final int A04() {
        return this.A02;
    }

    public final int A05() {
        return this.A03;
    }

    public final int A06() {
        return this.A04;
    }

    public final int A07() {
        return this.A05;
    }

    public final int A08() {
        return this.A06;
    }

    public final int A09() {
        return this.A07;
    }

    public final long A0A() {
        return this.A08;
    }

    public final Uri A0B() {
        return this.A09;
    }

    public final EnumC03660j A0C() {
        return this.A0A;
    }

    public final AbstractC1310b5 A0D() {
        return this.A0B;
    }

    public final JP A0E() {
        return this.A0C;
    }

    public final JP A0F() {
        return this.A0E;
    }

    public final JP A0G() {
        return this.A0D;
    }

    public final JQ A0H() {
        return this.A0F;
    }

    public final JU A0I() {
        return this.A0G;
    }

    public final String A0J() {
        return this.A0H;
    }

    public final String A0K() {
        return this.A0J;
    }

    public final String A0L() {
        return this.A0K;
    }

    public final String A0M() {
        return this.A0L;
    }

    public final String A0N() {
        return this.A0M;
    }

    public final String A0O() {
        return this.A0N;
    }

    public final String A0P() {
        return this.A0O;
    }

    public final String A0Q() {
        return this.A0P;
    }

    public final String A0R() {
        return this.A0Q;
    }

    public final String A0S() {
        return this.A0R;
    }

    public final String A0T() {
        return this.A0T;
    }

    public final String A0U() {
        return this.A0U;
    }

    public final String A0V() {
        return this.A0V;
    }

    public final String A0W() {
        return this.A0W;
    }

    public final String A0X() {
        return this.A0I;
    }

    public final String A0Y() {
        return this.A0X;
    }

    public final String A0Z() {
        return this.A0Y;
    }

    public final String A0a() {
        return this.A0Z;
    }

    public final String A0b() {
        return this.A0a;
    }

    public final String A0c() {
        return this.A0b;
    }

    public final String A0d() {
        return this.A0c;
    }

    public final Collection<String> A0e() {
        return this.A0d;
    }

    public final List<AnonymousClass14> A0f() {
        return this.A0e;
    }

    public final boolean A0g() {
        return this.A0f;
    }

    public final boolean A0h() {
        return this.A0g;
    }

    public final boolean A0i() {
        return this.A0h;
    }

    public final boolean A0j() {
        return this.A0i;
    }
}
