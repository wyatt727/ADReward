package com.bytedance.sdk.openadsdk.core.VwS.Td;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ResourceHelper.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static final Set<String> EYQ = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.VwS.Td.EYQ.1
        {
            add(MimeTypes.IMAGE_JPEG);
            add(MimeTypes.IMAGE_PNG);
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };
    public static Set<String> mZx = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.VwS.Td.EYQ.2
        {
            add("application/x-javascript");
        }
    };

    /* compiled from: ResourceHelper.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.VwS.Td.EYQ$EYQ, reason: collision with other inner class name */
    public enum EnumC0111EYQ {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    /* compiled from: ResourceHelper.java */
    public enum mZx {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    public static Point EYQ(Context context, int i, int i2, mZx mzx) {
        if (context == null) {
            context = hu.EYQ();
        }
        Point point = new Point(i, i2);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iMZx = tr.mZx(context, i);
        int iMZx2 = tr.mZx(context, i2);
        if (iMZx <= width && iMZx2 <= height) {
            return point;
        }
        Point point2 = new Point();
        if (mZx.HTML_RESOURCE == mzx) {
            point2.x = Math.min(width, iMZx);
            point2.y = Math.min(height, iMZx2);
        } else {
            float f = iMZx;
            float f2 = f / width;
            float f3 = iMZx2;
            float f4 = f3 / height;
            if (f2 >= f4) {
                point2.x = width;
                point2.y = (int) (f3 / f2);
            } else {
                point2.x = (int) (f / f4);
                point2.y = height;
            }
        }
        if (point2.x < 0 || point2.y < 0) {
            return point;
        }
        point2.x = tr.Td(context, point2.x);
        point2.y = tr.Td(context, point2.y);
        return point2;
    }
}
