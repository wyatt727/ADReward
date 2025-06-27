package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.5S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C5S {
    public static byte[] A04;
    public final Intent A00;
    public final C5V A01;
    public final C1207Yn A02;
    public final J2 A03;

    static {
        A0T();
    }

    public static String A0S(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0T() {
        A04 = new byte[]{Byte.MAX_VALUE, 99, 29, 24, 35, 24, 29, 8, 29, 35, 30, 9, 18, 24, 16, 25, 88, 90, 87, 87, 94, 73, 111, 66, 75, 94, 80, 91, 82, 90, 93, 86, 87, 114, 87, 119, 82, 71, 82, 113, 70, 93, 87, 95, 86, 0, 15, 10, 18, 3, 20, 3, 2, 57, 5, 10, 15, 5, 13, 57, 2, 3, 10, 7, 31, 57, 11, 21, 52, 59, 46, 51, 44, Utf8.REPLACEMENT_BYTE, 27, 62, 30, 59, 46, 59, 24, 47, 52, 62, 54, Utf8.REPLACEMENT_BYTE, 22, 1, 19, 5, 22, 0, 1, 0, 50, 13, 0, 1, 11, 37, 0, 32, 5, 16, 5, 38, 17, 10, 0, 8, 1, 79, 80, 93, 92, 86, 102, 77, 80, 84, 92, 102, 73, 86, 85, 85, 80, 87, 94, 102, 80, 87, 77, 92, 75, 79, 88, 85};
    }

    public C5S(C5V c5v, Intent intent, J2 j2, C1207Yn c1207Yn) {
        this.A01 = c5v;
        this.A00 = intent;
        this.A03 = j2;
        this.A02 = c1207Yn;
    }

    public /* synthetic */ C5S(C5V c5v, Intent intent, J2 j2, C1207Yn c1207Yn, C5R c5r) {
        this(c5v, intent, j2, c1207Yn);
    }

    private FU A00() {
        return (FU) this.A00.getSerializableExtra(A0S(2, 14, 51));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MD A02() {
        C5R c5r = null;
        if (C0796Ih.A2N(this.A02)) {
            String stringExtra = this.A00.getStringExtra(A0S(45, 23, 41));
            C5V c5v = this.A01;
            C1207Yn c1207Yn = this.A02;
            J2 j2 = this.A03;
            ZW zw = new ZW(c5v, c5r);
            Intent intent = this.A00;
            String clickDelayMs = A0S(16, 10, 116);
            String stringExtra2 = intent.getStringExtra(clickDelayMs);
            if (stringExtra == null) {
                stringExtra = A0S(0, 2, 29);
            }
            return new ViewOnClickListenerC0635Bi(c5v, c1207Yn, j2, zw, stringExtra2, Integer.parseInt(stringExtra));
        }
        C5V c5v2 = this.A01;
        return new UT(c5v2, this.A02, this.A03, new ZW(c5v2, c5r));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UD A0G() {
        return new UD(this.A02, this.A03, new ZW(this.A01, null), A00(), null, new U9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UD A0H() {
        FS fs = (FS) this.A00.getSerializableExtra(A0S(86, 25, 43));
        return new UD(this.A02, this.A03, new C0689Ea(this.A01, null), fs, fs.A0T(), new U8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UA A0I(RelativeLayout relativeLayout) {
        UA ua = new UA(this.A02, new ZV(this), this.A03, new ZW(this.A01, null));
        ua.A05(relativeLayout);
        ua.A04(this.A00.getIntExtra(A0S(111, 27, 118), 200));
        AbstractC0874Lo.A0M(relativeLayout, ViewCompat.MEASURED_STATE_MASK);
        return ua;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public B3 A0J() {
        return new B3(this.A02, this.A03, new ZW(this.A01, null), A00(), new U9(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public B3 A0K() {
        return new B3(this.A02, this.A03, new ZW(this.A01, null), (FS) this.A00.getSerializableExtra(A0S(86, 25, 43)), new U8(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TI A0L() {
        PB pbA02;
        AbstractC1310b5 abstractC1310b5 = (AbstractC1310b5) this.A00.getSerializableExtra(A0S(68, 18, 21));
        C5R c5r = null;
        if (abstractC1310b5 == null || (pbA02 = PC.A02(abstractC1310b5.A0S())) == null) {
            return null;
        }
        return new TI(this.A02, new ZW(this.A01, c5r), pbA02, abstractC1310b5.A12());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1056So A0M(KB kb) {
        InterfaceC0895Mj u8;
        MC c0689Ea;
        C1308b3 c1308b3 = (C1308b3) this.A00.getSerializableExtra(A0S(26, 19, 124));
        C5R c5r = null;
        if (kb == KB.A04) {
            u8 = new U9();
            c0689Ea = new ZW(this.A01, c5r);
        } else {
            u8 = new U8();
            c0689Ea = new C0689Ea(this.A01, c5r);
        }
        return new C1056So(this.A02, u8, this.A03, c1308b3, new C05126c(this.A02), c0689Ea);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C9Y A0N() {
        return new C9Y(this.A02, new U9(), this.A03, A00(), new C05126c(this.A02), new ZW(this.A01, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C9Q A0O() {
        return new C9Q(this.A02, new U9(), this.A03, A00(), new C05126c(this.A02), new ZW(this.A01, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C9Q A0P() {
        return new C9Q(this.A02, new U8(), this.A03, (FS) this.A00.getSerializableExtra(A0S(86, 25, 43)), new C05126c(this.A02), new C0689Ea(this.A01, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C9P A0Q() {
        FU fuA00 = A00();
        fuA00.A0Z(this.A01.A0C);
        return new C9P(this.A02, this.A03, new C05126c(this.A02), new ZW(this.A01, null), fuA00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C9P A0R() {
        FS fs = (FS) this.A00.getSerializableExtra(A0S(86, 25, 43));
        fs.A0Z(this.A01.A0C);
        return new C9P(this.A02, this.A03, new C05126c(this.A02), new ZW(this.A01, null), fs);
    }

    public final UC A0U() {
        return new UC(this.A02, this.A01);
    }
}
