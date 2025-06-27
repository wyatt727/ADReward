package com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ;

import android.text.TextUtils;
import android.util.Base64;

/* compiled from: ParamEncode.java */
/* loaded from: classes2.dex */
public class IPb {
    public static String EYQ(String str) {
        return TextUtils.isEmpty(str) ? "" : Base64.encodeToString(str.getBytes(), 10);
    }

    public static String mZx(String str) {
        return TextUtils.isEmpty(str) ? "" : new String(Base64.decode(str, 10));
    }
}
