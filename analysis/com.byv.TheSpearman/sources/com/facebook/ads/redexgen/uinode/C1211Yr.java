package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1211Yr implements C0L {
    public static byte[] A01;
    public static String[] A02 = {"aROWSCJTZ7USEA9NykDAgKPqU9Hz2yMC", "Zqbs868sBagHNlYScp55lXssWh10RIQa", "mbYc5GC1jhCg", "AuzesFDqytnerPl8cSxQvwaSTNgSXgGN", "J34OJh55Zf7CVcps1JZJSO0d6JwePACZ", "sgVYwbqUus7", "7dh0o4NaZc6u8WRc1KGfxvMUmypAWeMQ", "ZE0swazaf"};
    public final /* synthetic */ C1206Ym A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A02[3].charAt(2) == 'x') {
                throw new RuntimeException();
            }
            A02[0] = "5v5qZEzKm5dZGLy7lyhruzHwv9U4ulwR";
            bArrCopyOfRange[i4] = (byte) ((b ^ i3) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{5, 1, 13, 11, 9};
    }

    static {
        A01();
    }

    public C1211Yr(C1206Ym c1206Ym) {
        this.A00 = c1206Ym;
    }

    @Override // com.facebook.ads.redexgen.uinode.C0L
    public final void A9U(Throwable th) {
        this.A00.A07().A9a(A00(0, 5, 0), C8A.A1e, new C8B(th));
    }

    @Override // com.facebook.ads.redexgen.uinode.C0L
    public final void A9f(Throwable th) {
        this.A00.A07().A9a(A00(0, 5, 0), C8A.A1g, new C8B(th));
    }

    @Override // com.facebook.ads.redexgen.uinode.C0L
    public final void AEP(String str, int i, String str2, Long l, Long l2, AnonymousClass06 anonymousClass06) {
        C05156f.A05(this.A00, anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A09, anonymousClass06.A07, anonymousClass06.A03, i, str2, l, l2, null);
    }

    @Override // com.facebook.ads.redexgen.uinode.C0L
    public final void AEQ(String str, boolean z, AnonymousClass06 anonymousClass06) {
        C05156f.A04(this.A00, new C05146e(anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A07, anonymousClass06.A03, str), z);
    }
}
