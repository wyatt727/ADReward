package com.applovin.impl;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class v2 {
    public static final v2 g = new v2(-1, ViewCompat.MEASURED_STATE_MASK, 0, 0, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f1079a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Typeface f;

    public static v2 a(CaptioningManager.CaptionStyle captionStyle) {
        return yp.f1214a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    private static v2 b(CaptioningManager.CaptionStyle captionStyle) {
        return new v2(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    public v2(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f1079a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = typeface;
    }

    private static v2 c(CaptioningManager.CaptionStyle captionStyle) {
        return new v2(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : g.f1079a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : g.b, captionStyle.hasWindowColor() ? captionStyle.windowColor : g.c, captionStyle.hasEdgeType() ? captionStyle.edgeType : g.d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : g.e, captionStyle.getTypeface());
    }
}
