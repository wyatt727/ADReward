package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

/* loaded from: classes.dex */
public class Barrier extends ConstraintHelper {
    public static final int BOTTOM = 3;
    public static final int END = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int START = 5;
    public static final int TOP = 2;
    private androidx.constraintlayout.core.widgets.Barrier mBarrier;
    private int mIndicatedType;
    private int mResolvedType;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attrs) {
        super(context, attrs);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        super.setVisibility(8);
    }

    public int getType() {
        return this.mIndicatedType;
    }

    public void setType(int type) {
        this.mIndicatedType = type;
    }

    private void updateType(ConstraintWidget widget, int type, boolean isRtl) {
        this.mResolvedType = type;
        if (Build.VERSION.SDK_INT < 17) {
            int i = this.mIndicatedType;
            if (i == 5) {
                this.mResolvedType = 0;
            } else if (i == 6) {
                this.mResolvedType = 1;
            }
        } else if (isRtl) {
            int i2 = this.mIndicatedType;
            if (i2 == 5) {
                this.mResolvedType = 1;
            } else if (i2 == 6) {
                this.mResolvedType = 0;
            }
        } else {
            int i3 = this.mIndicatedType;
            if (i3 == 5) {
                this.mResolvedType = 0;
            } else if (i3 == 6) {
                this.mResolvedType = 1;
            }
        }
        if (widget instanceof androidx.constraintlayout.core.widgets.Barrier) {
            ((androidx.constraintlayout.core.widgets.Barrier) widget).setBarrierType(this.mResolvedType);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void resolveRtl(ConstraintWidget widget, boolean isRtl) {
        updateType(widget, this.mIndicatedType, isRtl);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void init(AttributeSet attrs) {
        super.init(attrs);
        this.mBarrier = new androidx.constraintlayout.core.widgets.Barrier();
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.mBarrier.setAllowsGoneWidget(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.mBarrier.setMargin(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.mBarrier;
        validateParams();
    }

    public void setAllowsGoneWidget(boolean supportGone) {
        this.mBarrier.setAllowsGoneWidget(supportGone);
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.mBarrier.getAllowsGoneWidget();
    }

    public boolean getAllowsGoneWidget() {
        return this.mBarrier.getAllowsGoneWidget();
    }

    public void setDpMargin(int margin) {
        this.mBarrier.setMargin((int) ((margin * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public int getMargin() {
        return this.mBarrier.getMargin();
    }

    public void setMargin(int margin) {
        this.mBarrier.setMargin(margin);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget child, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> mapIdToWidget) {
        super.loadParameters(constraint, child, layoutParams, mapIdToWidget);
        if (child instanceof androidx.constraintlayout.core.widgets.Barrier) {
            androidx.constraintlayout.core.widgets.Barrier barrier = (androidx.constraintlayout.core.widgets.Barrier) child;
            updateType(barrier, constraint.layout.mBarrierDirection, ((ConstraintWidgetContainer) child.getParent()).isRtl());
            barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
            barrier.setMargin(constraint.layout.mBarrierMargin);
        }
    }
}
