package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.y3;
import com.applovin.impl.yb;

/* loaded from: classes.dex */
public class uh extends yb {
    private final y3.a n;
    private final Context o;
    private final boolean p;

    @Override // com.applovin.impl.yb
    public SpannedString f() {
        return new SpannedString(this.n.a(this.o));
    }

    @Override // com.applovin.impl.yb
    public boolean o() {
        return false;
    }

    public uh(y3.a aVar, boolean z, Context context) {
        super(yb.c.RIGHT_DETAIL);
        this.n = aVar;
        this.o = context;
        this.c = new SpannedString(aVar.a());
        this.p = z;
    }

    @Override // com.applovin.impl.yb
    public boolean p() {
        Boolean boolB = this.n.b(this.o);
        if (boolB != null) {
            return boolB.equals(Boolean.valueOf(this.p));
        }
        return false;
    }
}
