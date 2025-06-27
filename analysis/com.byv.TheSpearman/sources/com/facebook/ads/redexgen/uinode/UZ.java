package com.facebook.ads.redexgen.uinode;

import android.content.DialogInterface;

/* loaded from: assets/audience_network.dex */
public class UZ extends KT {
    public static String[] A02 = {"r", "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ M1 A01;

    public UZ(M1 m1, DialogInterface dialogInterface) {
        this.A01 = m1;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        if (this.A01.A01.A02 != null) {
            this.A01.A01.A02.ADz(K9.A03(this.A01.A01.A00), new RY().A05(this.A01.A01.A02(this.A01.A00.getText().toString())).A08());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        A02[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}
