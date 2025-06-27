package com.mbridge.msdk.dycreator.e;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.tools.ad;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommUtil.java */
/* loaded from: classes4.dex */
public final class c {
    public static double a(double d, double d2, int i) {
        if (i < 0) {
            return 1.0d;
        }
        try {
            return new BigDecimal(Double.toString(d)).divide(new BigDecimal(Double.toString(d2)), i, 4).doubleValue();
        } catch (Exception e) {
            ad.b("CommUtil", e.getMessage());
            return 1.0d;
        }
    }

    public static int a(Context context, float f) {
        if (context == null) {
            return 0;
        }
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                return 0;
            }
            return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
        } catch (Exception e) {
            ad.b("CommUtil", e.getMessage());
            return 0;
        }
    }

    public static Map<String, String> a(Context context, AttributeSet attributeSet) {
        HashMap map = new HashMap();
        if (context != null && attributeSet != null) {
            int attributeCount = attributeSet.getAttributeCount();
            for (int i = 0; i < attributeCount; i++) {
                String attributeName = attributeSet.getAttributeName(i);
                if (!TextUtils.isEmpty(attributeName)) {
                    if (attributeName.equals("mbridge_data")) {
                        try {
                            map.put("mbridgeData", b.f2673a.get(attributeSet.getAttributeValue(i).substring(8)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_click")) {
                        try {
                            map.put("mbridgeAction", b.f2673a.get(attributeSet.getAttributeValue(i).substring(8)));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_strategy")) {
                        try {
                            map.put("mbridgeStrategy", b.f2673a.get(attributeSet.getAttributeValue(i).substring(8)));
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_effect")) {
                        try {
                            map.put("mbridgeEffect", b.f2673a.get(attributeSet.getAttributeValue(i).substring(8)));
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_report")) {
                        try {
                            map.put("mbridgeReport", attributeSet.getAttributeValue(i));
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            }
        }
        return map;
    }

    public static void a(Map<String, String> map, View view) {
        if (map == null || view == null) {
            return;
        }
        if (map.containsKey("mbridgeData")) {
            com.mbridge.msdk.dycreator.binding.b.a().c(view);
        }
        if (map.containsKey("mbridgeAction")) {
            com.mbridge.msdk.dycreator.binding.b.a().d(view);
        }
        if (map.containsKey("mbridgeEffect")) {
            com.mbridge.msdk.dycreator.binding.b.a().b(view);
        }
        if (map.containsKey("mbridgeReport")) {
            com.mbridge.msdk.dycreator.binding.b.a().a(view);
        }
    }

    public static Map<String, Boolean> a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("\\|");
            if (strArrSplit != null && strArrSplit.length > 0) {
                for (String str2 : strArrSplit) {
                    if (str2.equals("mbridgeAttached")) {
                        map.put("mbridgeAttached", true);
                    }
                    if (str2.equals("mbridgeDetached")) {
                        map.put("mbridgeDetached", true);
                    }
                }
            } else {
                if (str.equals("mbridgeAttached")) {
                    map.put("mbridgeAttached", true);
                }
                if (str.equals("mbridgeDetached")) {
                    map.put("mbridgeDetached", true);
                }
            }
        }
        return map;
    }
}
