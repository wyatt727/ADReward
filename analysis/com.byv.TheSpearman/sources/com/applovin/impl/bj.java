package com.applovin.impl;

import android.text.SpannedString;
import com.applovin.impl.yb;

/* loaded from: classes.dex */
public class bj extends yb {
    public String toString() {
        return "SectionListItemViewModel{text=" + ((Object) this.c) + "}";
    }

    public bj(String str) {
        super(yb.c.SECTION);
        this.c = new SpannedString(str);
    }
}
