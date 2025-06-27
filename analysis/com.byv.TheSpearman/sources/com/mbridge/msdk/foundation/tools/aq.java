package com.mbridge.msdk.foundation.tools;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* compiled from: ViewCoveredUtils.java */
/* loaded from: classes4.dex */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f2981a = false;

    private static int a(View view, ViewGroup viewGroup) {
        int i = 0;
        while (i < viewGroup.getChildCount() && viewGroup.getChildAt(i) != view) {
            i++;
        }
        return i;
    }

    private static boolean a(View view, View view2, int i) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        if (!Rect.intersects(rect, rect2)) {
            return false;
        }
        int iMin = Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left);
        int iMin2 = Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top);
        return (i != 1 && (iMin * iMin2) * 2 >= view.getMeasuredHeight() * view.getMeasuredWidth()) || (i == 1 && iMin * iMin2 >= view.getMeasuredHeight() * view.getMeasuredWidth());
    }

    private static boolean a(View view, ViewGroup viewGroup, int i) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            ad.b("ViewUtils", "View Judge : Start Loop");
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0 && a(view, childAt, i)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    ad.b("ViewUtils", "View Judge : View Covered by WebView.");
                    f2981a = true;
                }
                if (a(childAt)) {
                    ad.b("ViewUtils", "View Judge : View Covered and Cover ViewGroup is not transparent.");
                    f2981a = true;
                }
                if (f2981a) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    a(view, (ViewGroup) childAt, i);
                }
            }
        }
        return f2981a;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.aq.a(android.view.View, int):boolean");
    }

    private static boolean a(View view) {
        if (view != null && (view.getTag() instanceof String) && "mb_wm".equals(view.getTag())) {
            return false;
        }
        return (Build.VERSION.SDK_INT < 19 || (view.getBackground() != null && view.getBackground().getAlpha() > 127)) && view.getAlpha() > 0.5f;
    }
}
