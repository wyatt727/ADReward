package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class yn {
    private static final Pattern d = Pattern.compile("\\s+");
    private static final eb e = eb.a("auto", "none");
    private static final eb f = eb.a(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final eb g = eb.a(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, "open");
    private static final eb h = eb.a(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    /* renamed from: a, reason: collision with root package name */
    public final int f1213a;
    public final int b;
    public final int c;

    private yn(int i, int i2, int i3) {
        this.f1213a = i;
        this.b = i2;
        this.c = i3;
    }

    public static yn a(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return a(eb.a((Object[]) TextUtils.split(lowerCase, d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.impl.yn a(com.applovin.impl.eb r9) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.yn.a(com.applovin.impl.eb):com.applovin.impl.yn");
    }
}
