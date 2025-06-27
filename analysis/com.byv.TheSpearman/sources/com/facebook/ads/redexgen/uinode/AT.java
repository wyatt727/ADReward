package com.facebook.ads.redexgen.uinode;

import android.media.AudioAttributes;

/* loaded from: assets/audience_network.dex */
public final class AT {
    public static final AT A04 = new AS().A00();
    public AudioAttributes A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public AT(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    public final AudioAttributes A00() {
        if (this.A00 == null) {
            this.A00 = new AudioAttributes.Builder().setContentType(this.A01).setFlags(this.A02).setUsage(this.A03).build();
        }
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AT at = (AT) obj;
        return this.A01 == at.A01 && this.A02 == at.A02 && this.A03 == at.A03;
    }

    public final int hashCode() {
        int result = this.A01;
        int result2 = ((((17 * 31) + result) * 31) + this.A02) * 31;
        int result3 = this.A03;
        return result2 + result3;
    }
}
