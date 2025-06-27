package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class VG extends RD {
    public static String[] A01 = {"17VeHKqvAV3iPquTRFV5nkfekqPAOX2Y", "lAWAATHLIf1ZCLkldXz2HdhVco5hUmDN", "zF5", "DmLMY21jiUoRuKlWConaRVpMyfqBnv90", "gnaW18bfkM8k", "Xsqe1WvhzdEOHDRdZu2mXr6vcctMp9sP", "yZ63PHoRBoKgX7qS3XV5e7w7nB", "vlnJSN6CnOAejO47j4gW78Wzdr557VH0"};
    public final /* synthetic */ VE A00;

    public VG(VE ve) {
        this.A00 = ve;
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A00() {
        if (this.A00.A04 != null) {
            this.A00.A04.A0W();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A03() {
        if (this.A00.A04 != null) {
            if (!this.A00.A0B && (this.A00.A0A || this.A00.A0K())) {
                VE ve = this.A00;
                QM qm = QM.A02;
                if (A01[5].charAt(14) == 'd') {
                    throw new RuntimeException();
                }
                A01[3] = "6AVoG9MmguoU1vvLobA8P3uXYnnJUDvb";
                ve.A0J(qm);
            }
            this.A00.A0A = false;
            this.A00.A0B = false;
        }
    }
}
