package com.bytedance.sdk.component.adexpress.dynamic.Pm;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.Pm.mZx;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: LayoutUnitSizeUtils.java */
/* loaded from: classes2.dex */
public class MxO {
    private static final Set<String> EYQ = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));
    private static String mZx;

    /* JADX WARN: Removed duplicated region for block: B:195:0x0409  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.sdk.component.adexpress.dynamic.Pm.mZx.Td EYQ(java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, boolean r22, int r23, com.bytedance.sdk.component.adexpress.dynamic.Td.QQ r24, double r25, int r27, double r28, java.lang.String r30, com.bytedance.sdk.component.adexpress.mZx.pi r31) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.Pm.MxO.EYQ(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, com.bytedance.sdk.component.adexpress.dynamic.Td.QQ, double, int, double, java.lang.String, com.bytedance.sdk.component.adexpress.mZx.pi):com.bytedance.sdk.component.adexpress.dynamic.Pm.mZx$Td");
    }

    public static String EYQ(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static mZx.Td EYQ(mZx.Td td, String str, String str2, String str3) {
        if (str.contains("union")) {
            td.EYQ = 0.0f;
            td.mZx = 0.0f;
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = EYQ(str);
            }
            if (TextUtils.isEmpty(str3)) {
                td.EYQ = 0.0f;
                td.mZx = 0.0f;
            } else {
                return EYQ(str3, str2);
            }
        }
        return td;
    }

    public static mZx.Td EYQ(String str, String str2) {
        return EYQ(str, str2, false);
    }

    public static mZx.Td EYQ(String str, String str2, boolean z) {
        mZx.Td td = new mZx.Td();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] iArrEYQ = EYQ(str, (float) mZx(str2), z);
            td.EYQ = iArrEYQ[0];
            td.mZx = iArrEYQ[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                td.mZx = 0.0f;
            }
        } catch (Exception unused) {
        }
        return td;
    }

    public static double mZx(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString("fontSize"));
        } catch (Throwable unused) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    public static int[] EYQ(String str, float f, boolean z) {
        int[] iArrMZx = mZx(str, f, z);
        return new int[]{com.bytedance.sdk.component.adexpress.Pm.IPb.mZx(com.bytedance.sdk.component.adexpress.Pm.EYQ(), iArrMZx[0]), com.bytedance.sdk.component.adexpress.Pm.IPb.mZx(com.bytedance.sdk.component.adexpress.Pm.EYQ(), iArrMZx[1])};
    }

    public static int[] mZx(String str, float f, boolean z) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.Pm.EYQ());
            textView.setTextSize(f);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static String EYQ() {
        return mZx;
    }

    public static boolean mZx() {
        return !TextUtils.isEmpty(mZx);
    }
}
