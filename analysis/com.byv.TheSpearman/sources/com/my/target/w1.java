package com.my.target;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class w1 extends LinearSnapHelper {
    public int b;
    public OrientationHelper g;
    public OrientationHelper h;
    public RecyclerView i;
    public boolean c = false;
    public float d = 60.0f;
    public int e = -1;
    public float f = -1.0f;

    /* renamed from: a, reason: collision with root package name */
    public final DecelerateInterpolator f4170a = new DecelerateInterpolator(1.7f);

    public class a extends LinearSmoothScroller {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return w1.this.d / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForDeceleration(int i) {
            return (int) Math.ceil(calculateTimeForScrolling(i) / 0.3d);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            RecyclerView recyclerView = w1.this.i;
            if (recyclerView == null || recyclerView.getLayoutManager() == null) {
                return;
            }
            w1 w1Var = w1.this;
            int[] iArrCalculateDistanceToFinalSnap = w1Var.calculateDistanceToFinalSnap(w1Var.i.getLayoutManager(), view);
            int i = iArrCalculateDistanceToFinalSnap[0];
            int i2 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                action.update(i, i2, iCalculateTimeForDeceleration, w1.this.f4170a);
            }
        }
    }

    public w1(int i) {
        this.b = i;
    }

    public final int a() {
        int width;
        RecyclerView recyclerView = this.i;
        if (recyclerView == null) {
            return Integer.MAX_VALUE;
        }
        if (this.f == -1.0f) {
            int i = this.e;
            if (i != -1) {
                return i;
            }
            return Integer.MAX_VALUE;
        }
        if (this.g != null) {
            width = recyclerView.getHeight();
        } else {
            if (this.h == null) {
                return Integer.MAX_VALUE;
            }
            width = recyclerView.getWidth();
        }
        return (int) (width * this.f);
    }

    public final int a(View view, OrientationHelper orientationHelper) {
        int decoratedEnd;
        int endAfterPadding;
        if (this.c) {
            decoratedEnd = orientationHelper.getDecoratedEnd(view);
            endAfterPadding = orientationHelper.getEndAfterPadding();
        } else {
            int decoratedEnd2 = orientationHelper.getDecoratedEnd(view);
            if (decoratedEnd2 < orientationHelper.getEnd() - ((orientationHelper.getEnd() - orientationHelper.getEndAfterPadding()) / 2)) {
                return decoratedEnd2 - orientationHelper.getEndAfterPadding();
            }
            decoratedEnd = orientationHelper.getDecoratedEnd(view);
            endAfterPadding = orientationHelper.getEnd();
        }
        return decoratedEnd - endAfterPadding;
    }

    public final View a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i, boolean z) {
        View view = null;
        if (layoutManager.getChildCount() != 0 && (layoutManager instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (z && a(linearLayoutManager)) {
                return null;
            }
            int i2 = Integer.MAX_VALUE;
            int startAfterPadding = layoutManager.getClipToPadding() ? orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2) : orientationHelper.getEnd() / 2;
            boolean z2 = i == 8388611;
            for (int i3 = 0; i3 < linearLayoutManager.getChildCount(); i3++) {
                View childAt = linearLayoutManager.getChildAt(i3);
                int iAbs = Math.abs(z2 ? !this.c ? orientationHelper.getDecoratedStart(childAt) : orientationHelper.getStartAfterPadding() - orientationHelper.getDecoratedStart(childAt) : (orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
                if (iAbs < i2) {
                    view = childAt;
                    i2 = iAbs;
                }
            }
        }
        return view;
    }

    public final View a(RecyclerView.LayoutManager layoutManager, boolean z) {
        OrientationHelper verticalHelper;
        OrientationHelper verticalHelper2;
        int i = this.b;
        if (i == 17) {
            return a(layoutManager, getHorizontalHelper(layoutManager), 17, z);
        }
        if (i != 48) {
            if (i == 80) {
                verticalHelper2 = getVerticalHelper(layoutManager);
            } else if (i == 8388611) {
                verticalHelper = getHorizontalHelper(layoutManager);
            } else {
                if (i != 8388613) {
                    return null;
                }
                verticalHelper2 = getHorizontalHelper(layoutManager);
            }
            return a(layoutManager, verticalHelper2, GravityCompat.END, z);
        }
        verticalHelper = getVerticalHelper(layoutManager);
        return a(layoutManager, verticalHelper, GravityCompat.START, z);
    }

    public void a(int i) {
        a(i, Boolean.TRUE);
    }

    public void a(int i, Boolean bool) {
        if (this.b != i) {
            this.b = i;
            a(bool);
        }
    }

    public final void a(Boolean bool) {
        RecyclerView.LayoutManager layoutManager;
        View viewA;
        RecyclerView recyclerView = this.i;
        if (recyclerView == null || recyclerView.getLayoutManager() == null || (viewA = a((layoutManager = this.i.getLayoutManager()), false)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewA);
        if (bool.booleanValue()) {
            this.i.smoothScrollBy(iArrCalculateDistanceToFinalSnap[0], iArrCalculateDistanceToFinalSnap[1]);
        } else {
            this.i.scrollBy(iArrCalculateDistanceToFinalSnap[0], iArrCalculateDistanceToFinalSnap[1]);
        }
    }

    public final boolean a(LinearLayoutManager linearLayoutManager) {
        return ((linearLayoutManager.getReverseLayout() || this.b != 8388611) && !(linearLayoutManager.getReverseLayout() && this.b == 8388613) && ((linearLayoutManager.getReverseLayout() || this.b != 48) && !(linearLayoutManager.getReverseLayout() && this.b == 80))) ? this.b == 17 ? linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 || linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1 : linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 : linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(null);
            this.i = recyclerView;
        } else {
            this.i = null;
        }
        try {
            super.attachToRecyclerView(recyclerView);
        } catch (Throwable unused) {
        }
    }

    public final int b(View view, OrientationHelper orientationHelper) {
        boolean z = this.c;
        int decoratedStart = orientationHelper.getDecoratedStart(view);
        return (z || decoratedStart >= orientationHelper.getStartAfterPadding() / 2) ? decoratedStart - orientationHelper.getStartAfterPadding() : decoratedStart;
    }

    public void b(int i) {
        RecyclerView recyclerView;
        RecyclerView.SmoothScroller smoothScrollerCreateScroller;
        if (i == -1 || (recyclerView = this.i) == null || recyclerView.getLayoutManager() == null || (smoothScrollerCreateScroller = createScroller(this.i.getLayoutManager())) == null) {
            return;
        }
        smoothScrollerCreateScroller.setTargetPosition(i);
        this.i.getLayoutManager().startSmoothScroll(smoothScrollerCreateScroller);
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int i = this.b;
        if (i == 17) {
            return super.calculateDistanceToFinalSnap(layoutManager, view);
        }
        int[] iArr = new int[2];
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return iArr;
        }
        OrientationHelper horizontalHelper = getHorizontalHelper((LinearLayoutManager) layoutManager);
        if (i == 8388611) {
            iArr[0] = b(view, horizontalHelper);
        } else {
            iArr[0] = a(view, horizontalHelper);
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateScrollDistance(int i, int i2) {
        if (this.i == null || ((this.g == null && this.h == null) || (this.e == -1 && this.f == -1.0f))) {
            return super.calculateScrollDistance(i, i2);
        }
        Scroller scroller = new Scroller(this.i.getContext(), new DecelerateInterpolator());
        int iA = a();
        int i3 = -iA;
        scroller.fling(0, 0, i, i2, i3, iA, i3, iA);
        return new int[]{scroller.getFinalX(), scroller.getFinalY()};
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || this.i == null) {
            return null;
        }
        return new a(this.i.getContext());
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return a(layoutManager, true);
    }

    public final OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.h;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.h = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.h;
    }

    public final OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.g;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.g = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.g;
    }
}
