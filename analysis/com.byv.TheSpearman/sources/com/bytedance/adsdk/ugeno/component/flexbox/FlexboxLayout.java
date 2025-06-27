package com.bytedance.adsdk.ugeno.component.flexbox;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.component.flexbox.Pm;
import com.bytedance.adsdk.ugeno.mZx.VwS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class FlexboxLayout extends ViewGroup implements com.bytedance.adsdk.ugeno.component.flexbox.EYQ {
    private int EYQ;
    private int HX;
    private int IPb;
    private Pm KO;
    private int Kbd;
    private int MxO;
    private int Pm;
    private Drawable QQ;
    private int Td;
    private com.bytedance.adsdk.ugeno.mZx UB;
    private Pm.EYQ Uc;
    private Drawable VwS;
    private List<Td> hu;
    private int mZx;
    private SparseIntArray nWX;
    private int[] pi;
    private int tp;
    private int tsL;

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public int EYQ(View view) {
        return 0;
    }

    public FlexboxLayout(Context context) {
        super(context, null);
        this.IPb = -1;
        this.KO = new Pm(this);
        this.hu = new ArrayList();
        this.Uc = new Pm.EYQ();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) throws NoSuchFieldException {
        com.bytedance.adsdk.ugeno.mZx mzx = this.UB;
        if (mzx != null) {
            int[] iArrEYQ = mzx.EYQ(i, i2);
            EYQ(iArrEYQ[0], iArrEYQ[1]);
        } else {
            EYQ(i, i2);
        }
        com.bytedance.adsdk.ugeno.mZx mzx2 = this.UB;
        if (mzx2 != null) {
            mzx2.Pm();
        }
    }

    private void EYQ(int i, int i2) throws NoSuchFieldException {
        if (this.nWX == null) {
            this.nWX = new SparseIntArray(getChildCount());
        }
        if (this.KO.mZx(this.nWX)) {
            this.pi = this.KO.EYQ(this.nWX);
        }
        int i3 = this.EYQ;
        if (i3 == 0 || i3 == 1) {
            mZx(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            Td(i, i2);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.EYQ);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public View EYQ(int i) {
        return getChildAt(i);
    }

    public View Td(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.pi;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public View mZx(int i) {
        return Td(i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.nWX == null) {
            this.nWX = new SparseIntArray(getChildCount());
        }
        this.pi = this.KO.EYQ(view, i, layoutParams, this.nWX);
        super.addView(view, i, layoutParams);
    }

    private void mZx(int i, int i2) throws NoSuchFieldException {
        this.hu.clear();
        this.Uc.EYQ();
        this.KO.EYQ(this.Uc, i, i2);
        this.hu = this.Uc.EYQ;
        this.KO.EYQ(i, i2);
        if (this.Pm == 3) {
            for (Td td : this.hu) {
                int iMax = Integer.MIN_VALUE;
                for (int i3 = 0; i3 < td.QQ; i3++) {
                    View viewTd = Td(td.KO + i3);
                    if (viewTd != null && viewTd.getVisibility() != 8) {
                        EYQ eyq = (EYQ) viewTd.getLayoutParams();
                        if (this.mZx != 2) {
                            iMax = Math.max(iMax, viewTd.getMeasuredHeight() + Math.max(td.tsL - viewTd.getBaseline(), eyq.topMargin) + eyq.bottomMargin);
                        } else {
                            iMax = Math.max(iMax, viewTd.getMeasuredHeight() + eyq.topMargin + Math.max((td.tsL - viewTd.getMeasuredHeight()) + viewTd.getBaseline(), eyq.bottomMargin));
                        }
                    }
                }
                td.VwS = iMax;
            }
        }
        this.KO.mZx(i, i2, getPaddingTop() + getPaddingBottom());
        this.KO.EYQ();
        EYQ(this.EYQ, i, i2, this.Uc.mZx);
    }

    private void Td(int i, int i2) throws NoSuchFieldException {
        this.hu.clear();
        this.Uc.EYQ();
        this.KO.mZx(this.Uc, i, i2);
        this.hu = this.Uc.EYQ;
        this.KO.EYQ(i, i2);
        this.KO.mZx(i, i2, getPaddingLeft() + getPaddingRight());
        this.KO.EYQ();
        EYQ(this.EYQ, i, i2, this.Uc.mZx);
    }

    private void EYQ(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else if (i == 2 || i == 3) {
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i)));
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public int getLargestMainSize() {
        Iterator<Td> it = this.hu.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().Kbd);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.hu.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Td td = this.hu.get(i4);
            if (Pm(i4)) {
                if (EYQ()) {
                    i2 = this.MxO;
                } else {
                    i2 = this.tsL;
                }
                i3 += i2;
            }
            if (IPb(i4)) {
                if (EYQ()) {
                    i = this.MxO;
                } else {
                    i = this.tsL;
                }
                i3 += i;
            }
            i3 += td.VwS;
        }
        return i3;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public boolean EYQ() {
        int i = this.EYQ;
        return i == 0 || i == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        com.bytedance.adsdk.ugeno.mZx mzx = this.UB;
        if (mzx != null) {
            mzx.Kbd();
        }
        int iEYQ = VwS.EYQ(this);
        int i5 = this.EYQ;
        if (i5 == 0) {
            EYQ(iEYQ == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            EYQ(iEYQ != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            z2 = iEYQ == 1;
            EYQ(this.mZx == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            z2 = iEYQ == 1;
            EYQ(this.mZx == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.EYQ);
        }
        com.bytedance.adsdk.ugeno.mZx mzx2 = this.UB;
        if (mzx2 != null) {
            mzx2.EYQ(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void EYQ(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout.EYQ(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void EYQ(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout.EYQ(boolean, boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.QQ == null && this.VwS == null) {
            return;
        }
        if (this.HX == 0 && this.tp == 0) {
            return;
        }
        int iEYQ = VwS.EYQ(this);
        int i = this.EYQ;
        if (i == 0) {
            EYQ(canvas, iEYQ == 1, this.mZx == 2);
            return;
        }
        if (i == 1) {
            EYQ(canvas, iEYQ != 1, this.mZx == 2);
            return;
        }
        if (i == 2) {
            boolean z = iEYQ == 1;
            if (this.mZx == 2) {
                z = !z;
            }
            mZx(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = iEYQ == 1;
        if (this.mZx == 2) {
            z2 = !z2;
        }
        mZx(canvas, z2, true);
    }

    private void EYQ(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.hu.size();
        for (int i3 = 0; i3 < size; i3++) {
            Td td = this.hu.get(i3);
            for (int i4 = 0; i4 < td.QQ; i4++) {
                int i5 = td.KO + i4;
                View viewTd = Td(i5);
                if (viewTd != null && viewTd.getVisibility() != 8) {
                    EYQ eyq = (EYQ) viewTd.getLayoutParams();
                    if (Pm(i5, i4)) {
                        if (z) {
                            left = viewTd.getRight() + eyq.rightMargin;
                        } else {
                            left = (viewTd.getLeft() - eyq.leftMargin) - this.tsL;
                        }
                        EYQ(canvas, left, td.mZx, td.VwS);
                    }
                    if (i4 == td.QQ - 1 && (this.tp & 4) > 0) {
                        if (z) {
                            right = (viewTd.getLeft() - eyq.leftMargin) - this.tsL;
                        } else {
                            right = viewTd.getRight() + eyq.rightMargin;
                        }
                        EYQ(canvas, right, td.mZx, td.VwS);
                    }
                }
            }
            if (Pm(i3)) {
                if (z2) {
                    i2 = td.Pm;
                } else {
                    i2 = td.mZx - this.MxO;
                }
                mZx(canvas, paddingLeft, i2, iMax);
            }
            if (IPb(i3) && (this.HX & 4) > 0) {
                if (z2) {
                    i = td.mZx - this.MxO;
                } else {
                    i = td.Pm;
                }
                mZx(canvas, paddingLeft, i, iMax);
            }
        }
    }

    private void mZx(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.hu.size();
        for (int i3 = 0; i3 < size; i3++) {
            Td td = this.hu.get(i3);
            for (int i4 = 0; i4 < td.QQ; i4++) {
                int i5 = td.KO + i4;
                View viewTd = Td(i5);
                if (viewTd != null && viewTd.getVisibility() != 8) {
                    EYQ eyq = (EYQ) viewTd.getLayoutParams();
                    if (Pm(i5, i4)) {
                        if (z2) {
                            top = viewTd.getBottom() + eyq.bottomMargin;
                        } else {
                            top = (viewTd.getTop() - eyq.topMargin) - this.MxO;
                        }
                        mZx(canvas, td.EYQ, top, td.VwS);
                    }
                    if (i4 == td.QQ - 1 && (this.HX & 4) > 0) {
                        if (z2) {
                            bottom = (viewTd.getTop() - eyq.topMargin) - this.MxO;
                        } else {
                            bottom = viewTd.getBottom() + eyq.bottomMargin;
                        }
                        mZx(canvas, td.EYQ, bottom, td.VwS);
                    }
                }
            }
            if (Pm(i3)) {
                if (z) {
                    i2 = td.Td;
                } else {
                    i2 = td.EYQ - this.tsL;
                }
                EYQ(canvas, i2, paddingTop, iMax);
            }
            if (IPb(i3) && (this.tp & 4) > 0) {
                if (z) {
                    i = td.EYQ - this.tsL;
                } else {
                    i = td.Td;
                }
                EYQ(canvas, i, paddingTop, iMax);
            }
        }
    }

    private void EYQ(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.QQ;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.tsL + i, i3 + i2);
        this.QQ.draw(canvas);
    }

    private void mZx(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.VwS;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.MxO + i2);
        this.VwS.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof EYQ;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof EYQ) {
            return new EYQ((EYQ) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new EYQ((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new EYQ(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public int getFlexDirection() {
        return this.EYQ;
    }

    public void setFlexDirection(int i) {
        if (this.EYQ != i) {
            this.EYQ = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public int getFlexWrap() {
        return this.mZx;
    }

    public void setFlexWrap(int i) {
        if (this.mZx != i) {
            this.mZx = i;
            requestLayout();
        }
    }

    public int getJustifyContent() {
        return this.Td;
    }

    public void setJustifyContent(int i) {
        if (this.Td != i) {
            this.Td = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public int getAlignItems() {
        return this.Pm;
    }

    public void setAlignItems(int i) {
        if (this.Pm != i) {
            this.Pm = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public int getAlignContent() {
        return this.Kbd;
    }

    public void setAlignContent(int i) {
        if (this.Kbd != i) {
            this.Kbd = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public int getMaxLine() {
        return this.IPb;
    }

    public void setMaxLine(int i) {
        if (this.IPb != i) {
            this.IPb = i;
            requestLayout();
        }
    }

    public List<Td> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.hu.size());
        for (Td td : this.hu) {
            if (td.mZx() != 0) {
                arrayList.add(td);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public int EYQ(View view, int i, int i2) {
        int i3;
        int i4;
        if (EYQ()) {
            i3 = Pm(i, i2) ? 0 + this.tsL : 0;
            if ((this.tp & 4) <= 0) {
                return i3;
            }
            i4 = this.tsL;
        } else {
            i3 = Pm(i, i2) ? 0 + this.MxO : 0;
            if ((this.HX & 4) <= 0) {
                return i3;
            }
            i4 = this.MxO;
        }
        return i3 + i4;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public void EYQ(Td td) {
        if (EYQ()) {
            if ((this.tp & 4) > 0) {
                td.Kbd += this.tsL;
                td.IPb += this.tsL;
                return;
            }
            return;
        }
        if ((this.HX & 4) > 0) {
            td.Kbd += this.MxO;
            td.IPb += this.MxO;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public int EYQ(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public int mZx(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public void EYQ(View view, int i, int i2, Td td) {
        if (Pm(i, i2)) {
            if (EYQ()) {
                td.Kbd += this.tsL;
                td.IPb += this.tsL;
            } else {
                td.Kbd += this.MxO;
                td.IPb += this.MxO;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public void setFlexLines(List<Td> list) {
        this.hu = list;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.EYQ
    public List<Td> getFlexLinesInternal() {
        return this.hu;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.VwS;
    }

    public Drawable getDividerDrawableVertical() {
        return this.QQ;
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.VwS) {
            return;
        }
        this.VwS = drawable;
        if (drawable != null) {
            this.MxO = drawable.getIntrinsicHeight();
        } else {
            this.MxO = 0;
        }
        mZx();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.QQ) {
            return;
        }
        this.QQ = drawable;
        if (drawable != null) {
            this.tsL = drawable.getIntrinsicWidth();
        } else {
            this.tsL = 0;
        }
        mZx();
        requestLayout();
    }

    public int getShowDividerVertical() {
        return this.tp;
    }

    public int getShowDividerHorizontal() {
        return this.HX;
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerVertical(int i) {
        if (i != this.tp) {
            this.tp = i;
            requestLayout();
        }
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.HX) {
            this.HX = i;
            requestLayout();
        }
    }

    private void mZx() {
        if (this.VwS == null && this.QQ == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private boolean Pm(int i, int i2) {
        return Kbd(i, i2) ? EYQ() ? (this.tp & 1) != 0 : (this.HX & 1) != 0 : EYQ() ? (this.tp & 2) != 0 : (this.HX & 2) != 0;
    }

    private boolean Kbd(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewTd = Td(i - i3);
            if (viewTd != null && viewTd.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean Pm(int i) {
        if (i >= 0 && i < this.hu.size()) {
            if (Kbd(i)) {
                return EYQ() ? (this.HX & 1) != 0 : (this.tp & 1) != 0;
            }
            if (EYQ()) {
                return (this.HX & 2) != 0;
            }
            if ((this.tp & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean Kbd(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.hu.get(i2).mZx() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean IPb(int i) {
        if (i >= 0 && i < this.hu.size()) {
            for (int i2 = i + 1; i2 < this.hu.size(); i2++) {
                if (this.hu.get(i2).mZx() > 0) {
                    return false;
                }
            }
            if (EYQ()) {
                return (this.HX & 4) != 0;
            }
            if ((this.tp & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    public static class EYQ extends ViewGroup.MarginLayoutParams implements mZx {
        public static final Parcelable.Creator<EYQ> CREATOR = new Parcelable.Creator<EYQ>() { // from class: com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout.EYQ.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public EYQ createFromParcel(Parcel parcel) {
                return new EYQ(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public EYQ[] newArray(int i) {
                return new EYQ[i];
            }
        };
        private int EYQ;
        private int HX;
        private int IPb;
        private float Kbd;
        private int Pm;
        private int QQ;
        private float Td;
        private int VwS;
        private float mZx;
        private boolean tp;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public EYQ(EYQ eyq) {
            super((ViewGroup.MarginLayoutParams) eyq);
            this.EYQ = 1;
            this.mZx = 0.0f;
            this.Td = 0.0f;
            this.Pm = -1;
            this.Kbd = -1.0f;
            this.IPb = -1;
            this.VwS = -1;
            this.QQ = ViewCompat.MEASURED_SIZE_MASK;
            this.HX = ViewCompat.MEASURED_SIZE_MASK;
            this.EYQ = eyq.EYQ;
            this.mZx = eyq.mZx;
            this.Td = eyq.Td;
            this.Pm = eyq.Pm;
            this.Kbd = eyq.Kbd;
            this.IPb = eyq.IPb;
            this.VwS = eyq.VwS;
            this.QQ = eyq.QQ;
            this.HX = eyq.HX;
            this.tp = eyq.tp;
        }

        public EYQ(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.EYQ = 1;
            this.mZx = 0.0f;
            this.Td = 0.0f;
            this.Pm = -1;
            this.Kbd = -1.0f;
            this.IPb = -1;
            this.VwS = -1;
            this.QQ = ViewCompat.MEASURED_SIZE_MASK;
            this.HX = ViewCompat.MEASURED_SIZE_MASK;
        }

        public EYQ(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.EYQ = 1;
            this.mZx = 0.0f;
            this.Td = 0.0f;
            this.Pm = -1;
            this.Kbd = -1.0f;
            this.IPb = -1;
            this.VwS = -1;
            this.QQ = ViewCompat.MEASURED_SIZE_MASK;
            this.HX = ViewCompat.MEASURED_SIZE_MASK;
        }

        public EYQ(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.EYQ = 1;
            this.mZx = 0.0f;
            this.Td = 0.0f;
            this.Pm = -1;
            this.Kbd = -1.0f;
            this.IPb = -1;
            this.VwS = -1;
            this.QQ = ViewCompat.MEASURED_SIZE_MASK;
            this.HX = ViewCompat.MEASURED_SIZE_MASK;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public int EYQ() {
            return this.width;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public int mZx() {
            return this.height;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public int Td() {
            return this.EYQ;
        }

        public void Td(int i) {
            this.EYQ = i;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public float Pm() {
            return this.mZx;
        }

        public void EYQ(float f) {
            this.mZx = f;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public float Kbd() {
            return this.Td;
        }

        public void mZx(float f) {
            this.Td = f;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public int IPb() {
            return this.Pm;
        }

        public void Pm(int i) {
            this.Pm = i;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public int VwS() {
            return this.IPb;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public void EYQ(int i) {
            this.IPb = i;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public int QQ() {
            return this.VwS;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public void mZx(int i) {
            this.VwS = i;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public int HX() {
            return this.QQ;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public int tp() {
            return this.HX;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public boolean MxO() {
            return this.tp;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public float tsL() {
            return this.Kbd;
        }

        public void Td(float f) {
            this.Kbd = f;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public int pi() {
            return this.leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public int nWX() {
            return this.topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public int KO() {
            return this.rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.mZx
        public int hu() {
            return this.bottomMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.EYQ);
            parcel.writeFloat(this.mZx);
            parcel.writeFloat(this.Td);
            parcel.writeInt(this.Pm);
            parcel.writeFloat(this.Kbd);
            parcel.writeInt(this.IPb);
            parcel.writeInt(this.VwS);
            parcel.writeInt(this.QQ);
            parcel.writeInt(this.HX);
            parcel.writeByte(this.tp ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        protected EYQ(Parcel parcel) {
            super(0, 0);
            this.EYQ = 1;
            this.mZx = 0.0f;
            this.Td = 0.0f;
            this.Pm = -1;
            this.Kbd = -1.0f;
            this.IPb = -1;
            this.VwS = -1;
            this.QQ = ViewCompat.MEASURED_SIZE_MASK;
            this.HX = ViewCompat.MEASURED_SIZE_MASK;
            this.EYQ = parcel.readInt();
            this.mZx = parcel.readFloat();
            this.Td = parcel.readFloat();
            this.Pm = parcel.readInt();
            this.Kbd = parcel.readFloat();
            this.IPb = parcel.readInt();
            this.VwS = parcel.readInt();
            this.QQ = parcel.readInt();
            this.HX = parcel.readInt();
            this.tp = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    public void EYQ(com.bytedance.adsdk.ugeno.component.mZx mzx) {
        this.UB = mzx;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.mZx mzx = this.UB;
        if (mzx != null) {
            mzx.IPb();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.mZx mzx = this.UB;
        if (mzx != null) {
            mzx.VwS();
        }
    }
}
