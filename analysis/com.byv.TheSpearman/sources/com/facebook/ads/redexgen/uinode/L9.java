package com.facebook.ads.redexgen.uinode;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public final class L9 {
    public static String[] A07 = {"AKWVUs1l0Ice5I6VX", "CXPBWDMo1Zqj2yCW5W30Ut48PEWYgYey", "QYYsUNIn7qky9LY", "uhDWqwwqE26XK4rQkizWNR4dlHqM4UZ3", "ZNpftHLPxc7R9PnANzOwdg7R2ap4pSI6", "3ke", "xa09Mpjas6OdUQMP5Qo7kdS83JfCqy78", "u6CBuCaaqyjpN4LkQhRqLLvzhKEDnG9S"};
    public float A00;
    public float A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final L8 A06;

    public L9(int i, float f, long j, Handler handler, L8 l8) {
        this(i, l8, handler);
        this.A02 = j;
        this.A01 = f;
    }

    public L9(int i, L8 l8) {
        this(i, l8, new Handler());
    }

    public L9(int i, L8 l8, Handler handler) {
        this.A04 = false;
        this.A00 = i;
        this.A06 = l8;
        this.A05 = handler;
        this.A02 = 250L;
        this.A01 = 0.25f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        float f = this.A00 - this.A01;
        this.A00 = f;
        this.A06.ACm(f);
        if (this.A00 <= 0.0f) {
            boolean z = this.A03;
            if (A07[4].charAt(25) == 'L') {
                throw new RuntimeException();
            }
            A07[6] = "KuCOx1ArmKJG2Js90Y8iwcXaowa3uSzZ";
            if (!z) {
                this.A03 = true;
                this.A06.ABA();
                this.A04 = false;
            }
        }
    }

    public final boolean A04() {
        return this.A00 <= 0.0f;
    }

    public final boolean A05() {
        return this.A04;
    }

    public final boolean A06() {
        if (!A05()) {
            return false;
        }
        this.A04 = false;
        return true;
    }

    public final boolean A07() {
        if (A04() && !this.A03) {
            this.A03 = true;
            this.A06.ABA();
        }
        if (!A04() && !A05()) {
            this.A04 = true;
            this.A06.ACm(this.A00);
            this.A05.postDelayed(new C1103Uj(this), this.A02);
            return true;
        }
        if (A07[4].charAt(25) == 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[3] = "u6tCNg8GXSpiTqjQspDcQdpU9nt4kRaX";
        strArr[7] = "uRN5Zlx2bfjM01c7Y9BPyYrHFfBp2TpI";
        return false;
    }
}
