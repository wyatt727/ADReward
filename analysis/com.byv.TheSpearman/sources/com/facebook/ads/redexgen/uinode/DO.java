package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;

/* loaded from: assets/audience_network.dex */
public final class DO {
    public final String A00;
    public final boolean A01;

    public DO(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != DO.class) {
            return false;
        }
        DO r5 = (DO) obj;
        return TextUtils.equals(this.A00, r5.A00) && this.A01 == r5.A01;
    }

    public final int hashCode() {
        int result = 1 * 31;
        String str = this.A00;
        int prime = str == null ? 0 : str.hashCode();
        int result2 = (result + prime) * 31;
        int prime2 = this.A01 ? 1231 : 1237;
        return result2 + prime2;
    }
}
