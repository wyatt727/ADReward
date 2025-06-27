package com.my.target;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class b0 {
    public static String a(List<String> list) {
        return TextUtils.join(",", list);
    }

    public static String a(String[] strArr) {
        return strArr == null ? "" : TextUtils.join(",", strArr);
    }

    public static boolean a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static int[] a(int... iArr) {
        Arrays.sort(iArr);
        return iArr;
    }
}
