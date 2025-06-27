package com.json;

import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes4.dex */
public class h5 {
    public static String a(String str) {
        try {
            return new String(Base64.decode(str, 0), C.UTF8_NAME);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    static String b(String str) {
        return Base64.encodeToString(str.getBytes(), 10);
    }
}
