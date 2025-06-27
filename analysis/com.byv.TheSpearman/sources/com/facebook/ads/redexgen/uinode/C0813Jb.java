package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Jb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0813Jb {
    public final AdErrorType A00;
    public final String A01;

    public C0813Jb(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C0813Jb(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C0813Jb A00(AdErrorType adErrorType) {
        return new C0813Jb(adErrorType, (String) null);
    }

    public static C0813Jb A01(AdErrorType adErrorType, String str) {
        return new C0813Jb(adErrorType, str);
    }

    public static C0813Jb A02(C0814Jc c0814Jc) {
        return new C0813Jb(c0814Jc.A00(), c0814Jc.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
