package com.my.target;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class r7 {
    public p7 a(String str, String str2, String str3) {
        try {
            if (TextUtils.isEmpty(str)) {
                ba.a("PostMessageParser: can't parse postMessage – type is empty");
                return null;
            }
            if (TextUtils.isEmpty(str2)) {
                ba.a("PostMessageParser: can't parse postMessage – action is empty");
                return null;
            }
            if (!TextUtils.isEmpty(str3)) {
                return p7.a(str, str2, str3);
            }
            ba.a("PostMessageParser: can't parse postMessage – params is empty");
            return null;
        } catch (Throwable th) {
            ba.a("PostMessageParser: can't parse postMessage – " + th.getMessage());
            return null;
        }
    }
}
