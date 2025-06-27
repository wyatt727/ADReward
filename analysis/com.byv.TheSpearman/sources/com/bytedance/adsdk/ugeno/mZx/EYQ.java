package com.bytedance.adsdk.ugeno.mZx;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.json.t2;

/* compiled from: ColorUtils.java */
/* loaded from: classes2.dex */
public class EYQ {

    /* compiled from: ColorUtils.java */
    /* renamed from: com.bytedance.adsdk.ugeno.mZx.EYQ$EYQ, reason: collision with other inner class name */
    public static class C0079EYQ {
        public GradientDrawable.Orientation EYQ;
        public float[] Td;
        public int[] mZx;
    }

    public static int EYQ(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.equals(t2.h.T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 4) {
            StringBuilder sb = new StringBuilder("#");
            char[] charArray = str.toCharArray();
            for (int i = 1; i < charArray.length; i++) {
                sb.append(charArray[i]);
                sb.append(charArray[i]);
            }
            return Color.parseColor(sb.toString());
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        return (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null && strArrSplit.length == 4) ? (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2])) | 0 : ViewCompat.MEASURED_STATE_MASK;
    }

    public static C0079EYQ mZx(String str) {
        int iIndexOf;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
        if (TextUtils.isEmpty(strSubstring)) {
            return null;
        }
        int iEYQ = EYQ(strSubstring, '%');
        int iIndexOf2 = strSubstring.indexOf(",");
        String strSubstring2 = strSubstring.substring(0, iIndexOf2);
        C0079EYQ c0079eyq = new C0079EYQ();
        c0079eyq.EYQ = Pm(strSubstring2);
        String strSubstring3 = strSubstring.substring(iIndexOf2 + 1);
        int[] iArr = new int[iEYQ];
        float[] fArr = new float[iEYQ];
        for (int i = 0; i < iEYQ; i++) {
            int iIndexOf3 = strSubstring3.indexOf("%");
            String strTrim = strSubstring3.substring(0, iIndexOf3 + 1).trim();
            if (strTrim.contains("rgba")) {
                iIndexOf = strTrim.indexOf(")");
            } else {
                iIndexOf = strTrim.indexOf(" ");
            }
            int i2 = iIndexOf + 1;
            iArr[i] = EYQ(strTrim.substring(0, i2).trim());
            fArr[i] = Td.EYQ(strTrim.substring(i2, strTrim.indexOf("%")).trim(), 0.0f) / 100.0f;
            int i3 = iIndexOf3 + 2;
            if (strSubstring3.length() <= i3) {
                break;
            }
            strSubstring3 = strSubstring3.substring(i3);
        }
        c0079eyq.mZx = iArr;
        c0079eyq.Td = fArr;
        return c0079eyq;
    }

    public static int EYQ(String str, char c) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        return i;
    }

    public static boolean Td(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static GradientDrawable.Orientation Pm(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            if (i == 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i == 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i == 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (i == 135) {
                return GradientDrawable.Orientation.TL_BR;
            }
            if (i == 45) {
                return GradientDrawable.Orientation.BL_TR;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }
}
