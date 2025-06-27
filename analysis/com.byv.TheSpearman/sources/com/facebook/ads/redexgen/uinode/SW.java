package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class SW implements InterfaceC0954Oq {
    public static String[] A02 = {"z07VqEjGvJ", "HVUavbLQzawZdZVBJZvs2mdfMmVurwko", "OXCJr9QWCT6iNhGP7b2SKXpA8jzUGtxO", "XfWPaMhvYm", "d0mI5Otk4DkPTVLBqA06pYB2qhxVYO4x", "4lS6eLthtLYEvbxsvILcFz16jeQVP", "9TNy9PrFUeRgfy9Rk5pKZK4U", "r8zM3TRfMT7OJmVxj71ND5jlCBdKG"};
    public final /* synthetic */ C0979Pp A00;
    public final /* synthetic */ SV A01;

    public SW(SV sv, C0979Pp c0979Pp) {
        this.A01 = sv;
        this.A00 = c0979Pp;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0954Oq
    public final void AAn() {
        if (this.A00.A02() == 0) {
            RE re = this.A01.A02;
            String[] strArr = A02;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "rJocaZsUv9";
            strArr2[6] = "3nzpDtzjz9tePwbisyAfJiul";
            re.A0U();
        }
        if (this.A01.A03 != null) {
            this.A01.A03.A0U();
        }
    }
}
