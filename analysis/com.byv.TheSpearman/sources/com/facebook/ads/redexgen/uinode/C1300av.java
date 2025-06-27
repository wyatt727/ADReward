package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.av, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1300av implements C6U {
    public static String[] A05 = {"udExhBBZigXHD765", "VCbgsgLtwNII3DWSf3Df", "sJ3cSki5Ts1gkpIy0", "hudoenMQ7OfQJqKUwYviTAHkC5956B", "3GiDDKpH2PPu7", "VAV0OzmNbR17K1ZAu", "eIBPlY8UdwZIA15YBWaPzTw3Re1i6Niv", "w6ShnqqW6c5InpRu2fdQvGfdyx0XiT7r"};
    public final /* synthetic */ AbstractC1310b5 A00;
    public final /* synthetic */ InterfaceC03891h A01;
    public final /* synthetic */ C03901i A02;
    public final /* synthetic */ C1207Yn A03;
    public final /* synthetic */ boolean A04;

    public C1300av(C03901i c03901i, C1207Yn c1207Yn, boolean z, AbstractC1310b5 abstractC1310b5, InterfaceC03891h interfaceC03891h) {
        this.A02 = c03901i;
        this.A03 = c1207Yn;
        this.A04 = z;
        this.A00 = abstractC1310b5;
        this.A01 = interfaceC03891h;
    }

    private void A00(boolean z) {
        if (z) {
            C1207Yn c1207Yn = this.A03;
            String[] strArr = A05;
            if (strArr[7].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ua1Hqbcww3qJrVJ6O";
            strArr2[2] = "2U70GzBDbPON7gkn8";
            if (C0796Ih.A1O(c1207Yn) && this.A04) {
                this.A02.A02.add(PC.A01(this.A03, this.A00, 1, new C1301aw(this)));
                return;
            } else {
                this.A01.AAf();
                return;
            }
        }
        this.A01.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void AB2() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void ABB() {
        A00(true);
    }
}
