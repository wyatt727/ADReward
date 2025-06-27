package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.yb;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class t6 extends yb {
    private final u6 n;
    private final Context o;

    private SpannedString q() {
        return new SpannedString("Displayed " + zp.a(this.n.b(), true));
    }

    private SpannedString r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.n.c());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.n.d());
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.yb
    public int e() {
        return r3.a(R.color.applovin_sdk_disclosureButtonColor, this.o);
    }

    @Override // com.applovin.impl.yb
    public boolean o() {
        return true;
    }

    public t6(u6 u6Var, Context context) {
        super(yb.c.DETAIL);
        this.n = u6Var;
        this.o = context;
        this.c = r();
        this.d = q();
    }

    @Override // com.applovin.impl.yb
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }
}
