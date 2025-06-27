package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.List;

/* compiled from: ViewUtils.java */
/* loaded from: classes2.dex */
public class Tnp {

    /* compiled from: ViewUtils.java */
    public interface mZx {
        void EYQ();

        void EYQ(View view, boolean z);

        void EYQ(boolean z);

        void mZx();
    }

    public static void EYQ(final ViewGroup viewGroup, boolean z, int i, mZx mzx, List<ViewGroup> list) {
        viewGroup.setTag(520093765, mzx);
        viewGroup.setTag(520093766, Integer.valueOf(i));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final EYQ eyq = new EYQ(viewGroup);
        if (list != null && list.size() > 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.get(i2).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.Tnp.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        eyq.EYQ = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        eyq.EYQ = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(eyq);
        if (z) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.Tnp.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        mZx mzx2 = (mZx) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        Tnp.mZx(viewGroup2, mzx2, (Integer) viewGroup2.getTag(520093766));
                    } catch (Exception e) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                    }
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 18) {
            viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.Tnp.3
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public void onWindowFocusChanged(boolean z2) {
                    try {
                        mZx mzx2 = (mZx) viewGroup.getTag(520093765);
                        if (mzx2 != null) {
                            mzx2.EYQ(z2);
                            ViewGroup viewGroup2 = viewGroup;
                            Tnp.mZx(viewGroup2, mzx2, (Integer) viewGroup2.getTag(520093766));
                        }
                    } catch (Exception e) {
                        ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                    }
                }
            });
        }
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.Tnp.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                mZx mzx2 = (mZx) viewGroup.getTag(520093765);
                if (mzx2 != null) {
                    mzx2.EYQ();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                mZx mzx2 = (mZx) viewGroup.getTag(520093765);
                if (mzx2 != null) {
                    mzx2.mZx();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    /* compiled from: ViewUtils.java */
    class EYQ implements ViewTreeObserver.OnGlobalLayoutListener {
        View EYQ = null;
        final /* synthetic */ ViewGroup mZx;

        EYQ(ViewGroup viewGroup) {
            this.mZx = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                mZx mzx = (mZx) this.mZx.getTag(520093765);
                if (this.EYQ != null) {
                    Rect rect = new Rect();
                    this.EYQ.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    this.mZx.getGlobalVisibleRect(rect2);
                    if (rect.contains(rect2)) {
                        if (mzx != null) {
                            mzx.EYQ(this.mZx, false);
                        }
                        this.mZx.setTag(520093763, Boolean.FALSE);
                        return;
                    } else {
                        if (mzx != null) {
                            mzx.EYQ(this.mZx, true);
                        }
                        this.mZx.setTag(520093763, Boolean.TRUE);
                        return;
                    }
                }
                ViewGroup viewGroup = this.mZx;
                Tnp.mZx(viewGroup, mzx, (Integer) viewGroup.getTag(520093766));
            } catch (Exception e) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.mZx.getTag(520093765), "ViewUtils", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZx(View view, mZx mzx, Integer num) {
        if (mzx == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        if (EYQ(view, num.intValue())) {
            mzx.EYQ(view, true);
        }
    }

    private static boolean EYQ(View view, int i) {
        return com.bytedance.sdk.openadsdk.core.rfB.EYQ(view, 20, i);
    }
}
