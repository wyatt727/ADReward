package com.facebook.ads.redexgen.uinode;

import android.graphics.Rect;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00030\u00030\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/instagram/common/viewpoint/core/ViewpointViewNode;", "Lcom/meta/analytics/dsp/uinode/DspViewableNode;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "(Landroid/view/View;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getView", "()Landroid/view/View;", "viewRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "equals", "", "other", "", "getVisibleRectWithinViewport", "outGlobalVisibleRect", "Landroid/graphics/Rect;", "outGlobalRect", "viewportRect", "hashCode", "", "Companion", "fbandroid.java.com.instagram.common.viewpoint.core.core_an"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.H3, reason: from Kotlin metadata */
/* loaded from: assets/audience_network.dex */
public final class ViewpointViewNode implements DspViewableNode {
    public static byte[] A01;
    public static String[] A02 = {"rLc4fYMr", "ixdDwPBhG85i5bbqpGEQKxuiwQlM2VVC", "F3cHIEtQAherQEaTxdWKmXUpP0iQmTxt", "w81i2ltv5bGBgxtzgXDyKUxhIQ2Y8G9g", "EO94kdaAUP6qiZMjy5QkstUi4eMsmPMz", "EcjLg", "Il2UHoQgd", "dt4c7RRazln7nneNUWSp1273AHuNKPtF"};
    public static final C1375cK A03;
    public static final WeakHashMap<View, ViewpointViewNode> A04;
    public final WeakReference<View> A00;

    public /* synthetic */ ViewpointViewNode(View view, AbstractC1362bv abstractC1362bv) {
        this(view);
    }

    @JvmStatic
    public static final ViewpointViewNode A00(View view) {
        return A03.A02(view);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{17, 11, 10, 57, 18, 17, 28, 31, 18, 44, 27, 29, 10, 40, 50, 51, 0, 43, 40, 37, 38, 43, 17, 46, 52, 46, 37, 43, 34, 21, 34, 36, 51, 92, 67, 79, 93, 90, 69, 88, 94, 120, 79, 73, 94};
    }

    static {
        A03();
        A03 = new C1375cK(null);
        A04 = new WeakHashMap<>();
    }

    public ViewpointViewNode(View view) {
        this.A00 = new WeakReference<>(view);
    }

    @Override // com.facebook.ads.redexgen.uinode.DspViewableNode
    public final boolean A8N(Rect rect, Rect rect2, Rect rect3) {
        C1361bu.A07(rect, A01(13, 20, 31));
        C1361bu.A07(rect2, A01(0, 13, 38));
        C1361bu.A07(rect3, A01(33, 12, 114));
        View view = this.A00.get();
        if (view == null) {
            return false;
        }
        boolean zA00 = AbstractC1374cJ.A00(view, rect, rect2, rect3);
        if (A02[7].charAt(20) == 'L') {
            throw new RuntimeException();
        }
        A02[7] = "jcDjII5YCCAGPdyBiDYMZv2MTl6lSOUa";
        return zA00;
    }

    public final boolean equals(Object other) {
        View view;
        if (other == this) {
            return true;
        }
        if (other != null) {
            boolean zA0A = C1361bu.A0A(other.getClass(), getClass());
            if (A02[0].length() == 17) {
                throw new RuntimeException();
            }
            A02[7] = "M4ONuF9mrsAu6NnJn4s6rmStGwT8wnTJ";
            return zA0A && (view = this.A00.get()) != null && view == ((ViewpointViewNode) other).A00.get();
        }
        return false;
    }

    public final int hashCode() {
        View view = this.A00.get();
        if (view != null) {
            return view.hashCode();
        }
        return 0;
    }
}
