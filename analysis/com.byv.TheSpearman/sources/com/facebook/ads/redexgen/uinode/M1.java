package com.facebook.ads.redexgen.uinode;

import android.content.DialogInterface;
import android.widget.EditText;

/* loaded from: assets/audience_network.dex */
public class M1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ UY A01;

    public M1(UY uy, EditText editText) {
        this.A01 = uy;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A01.A03.execute(new UZ(this, dialogInterface));
    }
}
