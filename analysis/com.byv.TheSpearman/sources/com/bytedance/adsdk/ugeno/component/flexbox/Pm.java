package com.bytedance.adsdk.ugeno.component.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.bytedance.adsdk.ugeno.mZx.IPb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: FlexboxHelper.java */
/* loaded from: classes2.dex */
class Pm {
    static final /* synthetic */ boolean Td = true;
    int[] EYQ;
    private long[] IPb;
    private boolean[] Kbd;
    private final com.bytedance.adsdk.ugeno.component.flexbox.EYQ Pm;
    long[] mZx;

    int EYQ(long j) {
        return (int) j;
    }

    int mZx(long j) {
        return (int) (j >> 32);
    }

    long mZx(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    Pm(com.bytedance.adsdk.ugeno.component.flexbox.EYQ eyq) {
        this.Pm = eyq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] EYQ(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.Pm.getFlexItemCount();
        List<mZx> listMZx = mZx(flexItemCount);
        mZx mzx = new mZx();
        if (view != null && (layoutParams instanceof com.bytedance.adsdk.ugeno.component.flexbox.mZx)) {
            mzx.mZx = ((com.bytedance.adsdk.ugeno.component.flexbox.mZx) layoutParams).Td();
        } else {
            mzx.mZx = 1;
        }
        if (i != -1 && i != flexItemCount && i < this.Pm.getFlexItemCount()) {
            mzx.EYQ = i;
            while (i < flexItemCount) {
                listMZx.get(i).EYQ++;
                i++;
            }
        } else {
            mzx.EYQ = flexItemCount;
        }
        listMZx.add(mzx);
        return EYQ(flexItemCount + 1, listMZx, sparseIntArray);
    }

    int[] EYQ(SparseIntArray sparseIntArray) {
        int flexItemCount = this.Pm.getFlexItemCount();
        return EYQ(flexItemCount, mZx(flexItemCount), sparseIntArray);
    }

    private List<mZx> mZx(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx = (com.bytedance.adsdk.ugeno.component.flexbox.mZx) this.Pm.EYQ(i2).getLayoutParams();
            mZx mzx2 = new mZx();
            mzx2.mZx = mzx.Td();
            mzx2.EYQ = i2;
            arrayList.add(mzx2);
        }
        return arrayList;
    }

    boolean mZx(SparseIntArray sparseIntArray) {
        int flexItemCount = this.Pm.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View viewEYQ = this.Pm.EYQ(i);
            if (viewEYQ != null && ((com.bytedance.adsdk.ugeno.component.flexbox.mZx) viewEYQ.getLayoutParams()).Td() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    private int[] EYQ(int i, List<mZx> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (mZx mzx : list) {
            iArr[i2] = mzx.EYQ;
            sparseIntArray.append(mzx.EYQ, mzx.mZx);
            i2++;
        }
        return iArr;
    }

    void EYQ(EYQ eyq, int i, int i2) throws NoSuchFieldException {
        EYQ(eyq, i, i2, Integer.MAX_VALUE, 0, -1, (List<Td>) null);
    }

    void mZx(EYQ eyq, int i, int i2) throws NoSuchFieldException {
        EYQ(eyq, i2, i, Integer.MAX_VALUE, 0, -1, (List<Td>) null);
    }

    void EYQ(EYQ eyq, int i, int i2, int i3, int i4, int i5, List<Td> list) throws NoSuchFieldException {
        int i6;
        EYQ eyq2;
        int i7;
        int i8;
        int i9;
        List<Td> list2;
        int i10;
        View view;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i;
        int i18 = i2;
        int i19 = i5;
        boolean zEYQ = this.Pm.EYQ();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List<Td> arrayList = list == null ? new ArrayList() : list;
        eyq.EYQ = arrayList;
        boolean z = i19 == -1;
        int iEYQ = EYQ(zEYQ);
        int iMZx = mZx(zEYQ);
        int iTd = Td(zEYQ);
        int iPm = Pm(zEYQ);
        Td td = new Td();
        int i20 = i4;
        td.KO = i20;
        int i21 = iMZx + iEYQ;
        td.Kbd = i21;
        int flexItemCount = this.Pm.getFlexItemCount();
        boolean z2 = z;
        int i22 = Integer.MIN_VALUE;
        int i23 = 0;
        int iCombineMeasuredStates = 0;
        int i24 = 0;
        while (true) {
            if (i20 >= flexItemCount) {
                i6 = iCombineMeasuredStates;
                eyq2 = eyq;
                break;
            }
            View viewMZx = this.Pm.mZx(i20);
            if (viewMZx == null) {
                if (EYQ(i20, flexItemCount, td)) {
                    EYQ(arrayList, td, i20, i23);
                }
            } else if (viewMZx.getVisibility() == 8) {
                td.HX++;
                td.QQ++;
                if (EYQ(i20, flexItemCount, td)) {
                    EYQ(arrayList, td, i20, i23);
                }
            } else {
                if (viewMZx instanceof CompoundButton) {
                    EYQ((CompoundButton) viewMZx);
                }
                com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx = (com.bytedance.adsdk.ugeno.component.flexbox.mZx) viewMZx.getLayoutParams();
                int i25 = flexItemCount;
                if (mzx.IPb() == 4) {
                    td.nWX.add(Integer.valueOf(i20));
                }
                int iEYQ2 = EYQ(mzx, zEYQ);
                if (mzx.tsL() != -1.0f && mode == 1073741824) {
                    iEYQ2 = Math.round(size * mzx.tsL());
                }
                if (zEYQ) {
                    int iEYQ3 = this.Pm.EYQ(i17, i21 + Td(mzx, true) + Pm(mzx, true), iEYQ2);
                    i7 = size;
                    i8 = mode;
                    int iMZx2 = this.Pm.mZx(i18, iTd + iPm + Kbd(mzx, true) + IPb(mzx, true) + i23, mZx(mzx, true));
                    viewMZx.measure(iEYQ3, iMZx2);
                    EYQ(i20, iEYQ3, iMZx2, viewMZx);
                    i9 = iEYQ3;
                } else {
                    i7 = size;
                    i8 = mode;
                    int iEYQ4 = this.Pm.EYQ(i18, iTd + iPm + Kbd(mzx, false) + IPb(mzx, false) + i23, mZx(mzx, false));
                    int iMZx3 = this.Pm.mZx(i17, Td(mzx, false) + i21 + Pm(mzx, false), iEYQ2);
                    viewMZx.measure(iEYQ4, iMZx3);
                    EYQ(i20, iEYQ4, iMZx3, viewMZx);
                    i9 = iMZx3;
                }
                EYQ(viewMZx, i20);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewMZx.getMeasuredState());
                int i26 = i23;
                int i27 = i21;
                Td td2 = td;
                int i28 = i20;
                list2 = arrayList;
                int i29 = i9;
                if (EYQ(viewMZx, i8, i7, td.Kbd, Pm(mzx, zEYQ) + EYQ(viewMZx, zEYQ) + Td(mzx, zEYQ), mzx, i28, i24, arrayList.size())) {
                    if (td2.mZx() > 0) {
                        EYQ(list2, td2, i28 > 0 ? i28 - 1 : 0, i26);
                        i23 = td2.VwS + i26;
                    } else {
                        i23 = i26;
                    }
                    if (zEYQ) {
                        if (mzx.mZx() == -1) {
                            com.bytedance.adsdk.ugeno.component.flexbox.EYQ eyq3 = this.Pm;
                            i10 = i2;
                            i20 = i28;
                            view = viewMZx;
                            view.measure(i29, eyq3.mZx(i10, eyq3.getPaddingTop() + this.Pm.getPaddingBottom() + mzx.nWX() + mzx.hu() + i23, mzx.mZx()));
                            EYQ(view, i20);
                        } else {
                            i10 = i2;
                            view = viewMZx;
                            i20 = i28;
                        }
                    } else {
                        i10 = i2;
                        view = viewMZx;
                        i20 = i28;
                        if (mzx.EYQ() == -1) {
                            com.bytedance.adsdk.ugeno.component.flexbox.EYQ eyq4 = this.Pm;
                            view.measure(eyq4.EYQ(i10, eyq4.getPaddingLeft() + this.Pm.getPaddingRight() + mzx.pi() + mzx.KO() + i23, mzx.EYQ()), i29);
                            EYQ(view, i20);
                        }
                    }
                    td = new Td();
                    td.QQ = 1;
                    i11 = i27;
                    td.Kbd = i11;
                    td.KO = i20;
                    i13 = Integer.MIN_VALUE;
                    i12 = 0;
                } else {
                    i10 = i2;
                    view = viewMZx;
                    i20 = i28;
                    td = td2;
                    i11 = i27;
                    td.QQ++;
                    i12 = i24 + 1;
                    i23 = i26;
                    i13 = i22;
                }
                td.UB |= mzx.Pm() != 0.0f;
                td.Uc |= mzx.Kbd() != 0.0f;
                int[] iArr = this.EYQ;
                if (iArr != null) {
                    iArr[i20] = list2.size();
                }
                td.Kbd += EYQ(view, zEYQ) + Td(mzx, zEYQ) + Pm(mzx, zEYQ);
                td.tp += mzx.Pm();
                td.MxO += mzx.Kbd();
                this.Pm.EYQ(view, i20, i12, td);
                int iMax = Math.max(i13, mZx(view, zEYQ) + Kbd(mzx, zEYQ) + IPb(mzx, zEYQ) + this.Pm.EYQ(view));
                td.VwS = Math.max(td.VwS, iMax);
                if (zEYQ) {
                    if (this.Pm.getFlexWrap() != 2) {
                        td.tsL = Math.max(td.tsL, view.getBaseline() + mzx.nWX());
                    } else {
                        td.tsL = Math.max(td.tsL, (view.getMeasuredHeight() - view.getBaseline()) + mzx.hu());
                    }
                }
                i14 = i25;
                if (EYQ(i20, i14, td)) {
                    EYQ(list2, td, i20, i23);
                    i23 += td.VwS;
                }
                i15 = i5;
                if (i15 != -1 && list2.size() > 0) {
                    if (list2.get(list2.size() - 1).hu >= i15 && i20 >= i15 && !z2) {
                        i23 = -td.EYQ();
                        i16 = i3;
                        z2 = true;
                    }
                    if (i23 <= i16 && z2) {
                        eyq2 = eyq;
                        i6 = iCombineMeasuredStates;
                        break;
                    }
                    i24 = i12;
                    i22 = iMax;
                    i20++;
                    i17 = i;
                    flexItemCount = i14;
                    i18 = i10;
                    i21 = i11;
                    arrayList = list2;
                    mode = i8;
                    i19 = i15;
                    size = i7;
                }
                i16 = i3;
                if (i23 <= i16) {
                }
                i24 = i12;
                i22 = iMax;
                i20++;
                i17 = i;
                flexItemCount = i14;
                i18 = i10;
                i21 = i11;
                arrayList = list2;
                mode = i8;
                i19 = i15;
                size = i7;
            }
            i7 = size;
            i8 = mode;
            i10 = i18;
            i15 = i19;
            list2 = arrayList;
            i11 = i21;
            i14 = flexItemCount;
            i20++;
            i17 = i;
            flexItemCount = i14;
            i18 = i10;
            i21 = i11;
            arrayList = list2;
            mode = i8;
            i19 = i15;
            size = i7;
        }
        eyq2.mZx = i6;
    }

    private void EYQ(CompoundButton compoundButton) throws NoSuchFieldException {
        com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx = (com.bytedance.adsdk.ugeno.component.flexbox.mZx) compoundButton.getLayoutParams();
        int iVwS = mzx.VwS();
        int iQQ = mzx.QQ();
        Drawable drawableEYQ = com.bytedance.adsdk.ugeno.mZx.Kbd.EYQ(compoundButton);
        int minimumWidth = drawableEYQ == null ? 0 : drawableEYQ.getMinimumWidth();
        int minimumHeight = drawableEYQ != null ? drawableEYQ.getMinimumHeight() : 0;
        if (iVwS == -1) {
            iVwS = minimumWidth;
        }
        mzx.EYQ(iVwS);
        if (iQQ == -1) {
            iQQ = minimumHeight;
        }
        mzx.mZx(iQQ);
    }

    private int EYQ(boolean z) {
        if (z) {
            return this.Pm.getPaddingStart();
        }
        return this.Pm.getPaddingTop();
    }

    private int mZx(boolean z) {
        if (z) {
            return this.Pm.getPaddingEnd();
        }
        return this.Pm.getPaddingBottom();
    }

    private int Td(boolean z) {
        if (z) {
            return this.Pm.getPaddingTop();
        }
        return this.Pm.getPaddingStart();
    }

    private int Pm(boolean z) {
        if (z) {
            return this.Pm.getPaddingBottom();
        }
        return this.Pm.getPaddingEnd();
    }

    private int EYQ(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int mZx(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int EYQ(com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx, boolean z) {
        if (z) {
            return mzx.EYQ();
        }
        return mzx.mZx();
    }

    private int mZx(com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx, boolean z) {
        if (z) {
            return mzx.mZx();
        }
        return mzx.EYQ();
    }

    private int Td(com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx, boolean z) {
        if (z) {
            return mzx.pi();
        }
        return mzx.nWX();
    }

    private int Pm(com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx, boolean z) {
        if (z) {
            return mzx.KO();
        }
        return mzx.hu();
    }

    private int Kbd(com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx, boolean z) {
        if (z) {
            return mzx.nWX();
        }
        return mzx.pi();
    }

    private int IPb(com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx, boolean z) {
        if (z) {
            return mzx.hu();
        }
        return mzx.KO();
    }

    private boolean EYQ(View view, int i, int i2, int i3, int i4, com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx, int i5, int i6, int i7) {
        if (this.Pm.getFlexWrap() == 0) {
            return false;
        }
        if (mzx.MxO()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.Pm.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int iEYQ = this.Pm.EYQ(view, i5, i6);
        if (iEYQ > 0) {
            i4 += iEYQ;
        }
        return i2 < i3 + i4;
    }

    private boolean EYQ(int i, int i2, Td td) {
        return i == i2 - 1 && td.mZx() != 0;
    }

    private void EYQ(List<Td> list, Td td, int i, int i2) {
        td.pi = i2;
        this.Pm.EYQ(td);
        td.hu = i;
        list.add(td);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void EYQ(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.bytedance.adsdk.ugeno.component.flexbox.mZx r0 = (com.bytedance.adsdk.ugeno.component.flexbox.mZx) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.VwS()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.VwS()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.HX()
            if (r1 <= r3) goto L26
            int r1 = r0.HX()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.QQ()
            if (r2 >= r5) goto L32
            int r2 = r0.QQ()
            goto L3e
        L32:
            int r5 = r0.tp()
            if (r2 <= r5) goto L3d
            int r2 = r0.tp()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L50
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.EYQ(r8, r1, r0, r7)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.component.flexbox.Pm.EYQ(android.view.View, int):void");
    }

    void EYQ(int i, int i2) {
        EYQ(i, i2, 0);
    }

    void EYQ(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        Td(this.Pm.getFlexItemCount());
        if (i3 >= this.Pm.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.Pm.getFlexDirection();
        int flexDirection2 = this.Pm.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.Pm.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.Pm.getPaddingLeft();
            paddingRight = this.Pm.getPaddingRight();
        } else if (flexDirection2 == 2 || flexDirection2 == 3) {
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.Pm.getLargestMainSize();
            }
            paddingLeft = this.Pm.getPaddingTop();
            paddingRight = this.Pm.getPaddingBottom();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
        }
        int i4 = paddingLeft + paddingRight;
        int[] iArr = this.EYQ;
        int i5 = iArr != null ? iArr[i3] : 0;
        List<Td> flexLinesInternal = this.Pm.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i6 = i5; i6 < size2; i6++) {
            Td td = flexLinesInternal.get(i6);
            if (td.Kbd < size && td.UB) {
                EYQ(i, i2, td, size, i4, false);
            } else if (td.Kbd > size && td.Uc) {
                mZx(i, i2, td, size, i4, false);
            }
        }
    }

    private void Td(int i) {
        boolean[] zArr = this.Kbd;
        if (zArr == null) {
            this.Kbd = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.Kbd = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void EYQ(int i, int i2, Td td, int i3, int i4, boolean z) {
        int i5;
        int iMax;
        double d;
        int i6;
        double d2;
        float f = 0.0f;
        if (td.tp <= 0.0f || i3 < td.Kbd) {
            return;
        }
        int i7 = td.Kbd;
        float f2 = (i3 - td.Kbd) / td.tp;
        td.Kbd = i4 + td.IPb;
        if (!z) {
            td.VwS = Integer.MIN_VALUE;
        }
        int i8 = 0;
        float f3 = 0.0f;
        boolean z2 = false;
        int i9 = 0;
        while (i8 < td.QQ) {
            int i10 = td.KO + i8;
            View viewMZx = this.Pm.mZx(i10);
            if (viewMZx == null || viewMZx.getVisibility() == 8) {
                i5 = i7;
            } else {
                com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx = (com.bytedance.adsdk.ugeno.component.flexbox.mZx) viewMZx.getLayoutParams();
                int flexDirection = this.Pm.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int i11 = i7;
                    int measuredWidth = viewMZx.getMeasuredWidth();
                    long[] jArr = this.IPb;
                    if (jArr != null) {
                        measuredWidth = EYQ(jArr[i10]);
                    }
                    int measuredHeight = viewMZx.getMeasuredHeight();
                    long[] jArr2 = this.IPb;
                    i5 = i11;
                    if (jArr2 != null) {
                        measuredHeight = mZx(jArr2[i10]);
                    }
                    if (!this.Kbd[i10] && mzx.Pm() > 0.0f) {
                        float fPm = measuredWidth + (mzx.Pm() * f2);
                        if (i8 == td.QQ - 1) {
                            fPm += f3;
                            f3 = 0.0f;
                        }
                        int iRound = Math.round(fPm);
                        if (iRound > mzx.HX()) {
                            iRound = mzx.HX();
                            this.Kbd[i10] = true;
                            td.tp -= mzx.Pm();
                            z2 = true;
                        } else {
                            f3 += fPm - iRound;
                            double d3 = f3;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                d = d3 + 1.0d;
                            }
                            f3 = (float) d;
                        }
                        int iMZx = mZx(i2, mzx, td.pi);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewMZx.measure(iMakeMeasureSpec, iMZx);
                        int measuredWidth2 = viewMZx.getMeasuredWidth();
                        int measuredHeight2 = viewMZx.getMeasuredHeight();
                        EYQ(i10, iMakeMeasureSpec, iMZx, viewMZx);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i9, measuredHeight + mzx.nWX() + mzx.hu() + this.Pm.EYQ(viewMZx));
                    td.Kbd += measuredWidth + mzx.pi() + mzx.KO();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewMZx.getMeasuredHeight();
                    long[] jArr3 = this.IPb;
                    if (jArr3 != null) {
                        measuredHeight3 = mZx(jArr3[i10]);
                    }
                    int measuredWidth3 = viewMZx.getMeasuredWidth();
                    long[] jArr4 = this.IPb;
                    if (jArr4 != null) {
                        measuredWidth3 = EYQ(jArr4[i10]);
                    }
                    if (this.Kbd[i10] || mzx.Pm() <= f) {
                        i6 = i7;
                    } else {
                        float fPm2 = measuredHeight3 + (mzx.Pm() * f2);
                        if (i8 == td.QQ - 1) {
                            fPm2 += f3;
                            f3 = f;
                        }
                        int iRound2 = Math.round(fPm2);
                        if (iRound2 > mzx.tp()) {
                            iRound2 = mzx.tp();
                            this.Kbd[i10] = true;
                            td.tp -= mzx.Pm();
                            i6 = i7;
                            z2 = true;
                        } else {
                            f3 += fPm2 - iRound2;
                            i6 = i7;
                            double d4 = f3;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                iRound2--;
                                d2 = d4 + 1.0d;
                            }
                            f3 = (float) d2;
                        }
                        int iEYQ = EYQ(i, mzx, td.pi);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewMZx.measure(iEYQ, iMakeMeasureSpec2);
                        measuredWidth3 = viewMZx.getMeasuredWidth();
                        int measuredHeight4 = viewMZx.getMeasuredHeight();
                        EYQ(i10, iEYQ, iMakeMeasureSpec2, viewMZx);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i9, measuredWidth3 + mzx.pi() + mzx.KO() + this.Pm.EYQ(viewMZx));
                    td.Kbd += measuredHeight3 + mzx.nWX() + mzx.hu();
                    i5 = i6;
                }
                td.VwS = Math.max(td.VwS, iMax);
                i9 = iMax;
            }
            i8++;
            i7 = i5;
            f = 0.0f;
        }
        int i12 = i7;
        if (!z2 || i12 == td.Kbd) {
            return;
        }
        EYQ(i, i2, td, i3, i4, true);
    }

    private void mZx(int i, int i2, Td td, int i3, int i4, boolean z) {
        int i5;
        int iMax;
        int i6 = td.Kbd;
        float f = 0.0f;
        if (td.MxO <= 0.0f || i3 > td.Kbd) {
            return;
        }
        float f2 = (td.Kbd - i3) / td.MxO;
        td.Kbd = i4 + td.IPb;
        if (!z) {
            td.VwS = Integer.MIN_VALUE;
        }
        int i7 = 0;
        float f3 = 0.0f;
        boolean z2 = false;
        int i8 = 0;
        while (i7 < td.QQ) {
            int i9 = td.KO + i7;
            View viewMZx = this.Pm.mZx(i9);
            if (viewMZx == null || viewMZx.getVisibility() == 8) {
                i5 = i7;
            } else {
                com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx = (com.bytedance.adsdk.ugeno.component.flexbox.mZx) viewMZx.getLayoutParams();
                int flexDirection = this.Pm.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i5 = i7;
                    int measuredWidth = viewMZx.getMeasuredWidth();
                    long[] jArr = this.IPb;
                    if (jArr != null) {
                        measuredWidth = EYQ(jArr[i9]);
                    }
                    int measuredHeight = viewMZx.getMeasuredHeight();
                    long[] jArr2 = this.IPb;
                    if (jArr2 != null) {
                        measuredHeight = mZx(jArr2[i9]);
                    }
                    if (!this.Kbd[i9] && mzx.Kbd() > 0.0f) {
                        float fKbd = measuredWidth - (mzx.Kbd() * f2);
                        if (i5 == td.QQ - 1) {
                            fKbd += f3;
                            f3 = 0.0f;
                        }
                        int iRound = Math.round(fKbd);
                        if (iRound < mzx.VwS()) {
                            iRound = mzx.VwS();
                            this.Kbd[i9] = true;
                            td.MxO -= mzx.Kbd();
                            z2 = true;
                        } else {
                            f3 += fKbd - iRound;
                            double d = f3;
                            if (d > 1.0d) {
                                iRound++;
                                f3 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f3 += 1.0f;
                            }
                        }
                        int iMZx = mZx(i2, mzx, td.pi);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewMZx.measure(iMakeMeasureSpec, iMZx);
                        int measuredWidth2 = viewMZx.getMeasuredWidth();
                        int measuredHeight2 = viewMZx.getMeasuredHeight();
                        EYQ(i9, iMakeMeasureSpec, iMZx, viewMZx);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i8, measuredHeight + mzx.nWX() + mzx.hu() + this.Pm.EYQ(viewMZx));
                    td.Kbd += measuredWidth + mzx.pi() + mzx.KO();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewMZx.getMeasuredHeight();
                    long[] jArr3 = this.IPb;
                    if (jArr3 != null) {
                        measuredHeight3 = mZx(jArr3[i9]);
                    }
                    int measuredWidth3 = viewMZx.getMeasuredWidth();
                    long[] jArr4 = this.IPb;
                    if (jArr4 != null) {
                        measuredWidth3 = EYQ(jArr4[i9]);
                    }
                    if (this.Kbd[i9] || mzx.Kbd() <= f) {
                        i5 = i7;
                    } else {
                        float fKbd2 = measuredHeight3 - (mzx.Kbd() * f2);
                        if (i7 == td.QQ - 1) {
                            fKbd2 += f3;
                            f3 = f;
                        }
                        int iRound2 = Math.round(fKbd2);
                        if (iRound2 < mzx.QQ()) {
                            iRound2 = mzx.QQ();
                            this.Kbd[i9] = true;
                            td.MxO -= mzx.Kbd();
                            i5 = i7;
                            z2 = true;
                        } else {
                            f3 += fKbd2 - iRound2;
                            i5 = i7;
                            double d2 = f3;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f3 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f3 += 1.0f;
                            }
                        }
                        int iEYQ = EYQ(i, mzx, td.pi);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewMZx.measure(iEYQ, iMakeMeasureSpec2);
                        measuredWidth3 = viewMZx.getMeasuredWidth();
                        int measuredHeight4 = viewMZx.getMeasuredHeight();
                        EYQ(i9, iEYQ, iMakeMeasureSpec2, viewMZx);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i8, measuredWidth3 + mzx.pi() + mzx.KO() + this.Pm.EYQ(viewMZx));
                    td.Kbd += measuredHeight3 + mzx.nWX() + mzx.hu();
                }
                td.VwS = Math.max(td.VwS, iMax);
                i8 = iMax;
            }
            i7 = i5 + 1;
            f = 0.0f;
        }
        if (!z2 || i6 == td.Kbd) {
            return;
        }
        mZx(i, i2, td, i3, i4, true);
    }

    private int EYQ(int i, com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx, int i2) {
        com.bytedance.adsdk.ugeno.component.flexbox.EYQ eyq = this.Pm;
        int iEYQ = eyq.EYQ(i, eyq.getPaddingLeft() + this.Pm.getPaddingRight() + mzx.pi() + mzx.KO() + i2, mzx.EYQ());
        int size = View.MeasureSpec.getSize(iEYQ);
        if (size > mzx.HX()) {
            return View.MeasureSpec.makeMeasureSpec(mzx.HX(), View.MeasureSpec.getMode(iEYQ));
        }
        return size < mzx.VwS() ? View.MeasureSpec.makeMeasureSpec(mzx.VwS(), View.MeasureSpec.getMode(iEYQ)) : iEYQ;
    }

    private int mZx(int i, com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx, int i2) {
        com.bytedance.adsdk.ugeno.component.flexbox.EYQ eyq = this.Pm;
        int iMZx = eyq.mZx(i, eyq.getPaddingTop() + this.Pm.getPaddingBottom() + mzx.nWX() + mzx.hu() + i2, mzx.mZx());
        int size = View.MeasureSpec.getSize(iMZx);
        if (size > mzx.tp()) {
            return View.MeasureSpec.makeMeasureSpec(mzx.tp(), View.MeasureSpec.getMode(iMZx));
        }
        return size < mzx.QQ() ? View.MeasureSpec.makeMeasureSpec(mzx.QQ(), View.MeasureSpec.getMode(iMZx)) : iMZx;
    }

    void mZx(int i, int i2, int i3) {
        int mode;
        int size;
        int flexDirection = this.Pm.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else if (flexDirection == 2 || flexDirection == 3) {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
        }
        List<Td> flexLinesInternal = this.Pm.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.Pm.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).VwS = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.Pm.getAlignContent();
                if (alignContent == 1) {
                    int i5 = size - sumOfCrossSize;
                    Td td = new Td();
                    td.VwS = i5;
                    flexLinesInternal.add(0, td);
                    return;
                }
                if (alignContent == 2) {
                    this.Pm.setFlexLines(EYQ(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f = 0.0f;
                        while (i4 < size4) {
                            arrayList.add(flexLinesInternal.get(i4));
                            if (i4 != flexLinesInternal.size() - 1) {
                                Td td2 = new Td();
                                if (i4 == flexLinesInternal.size() - 2) {
                                    td2.VwS = Math.round(f + size3);
                                    f = 0.0f;
                                } else {
                                    td2.VwS = Math.round(size3);
                                }
                                f += size3 - td2.VwS;
                                if (f > 1.0f) {
                                    td2.VwS++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    td2.VwS--;
                                    f += 1.0f;
                                }
                                arrayList.add(td2);
                            }
                            i4++;
                        }
                        this.Pm.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.Pm.setFlexLines(EYQ(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    Td td3 = new Td();
                    td3.VwS = size5;
                    for (Td td4 : flexLinesInternal) {
                        arrayList2.add(td3);
                        arrayList2.add(td4);
                        arrayList2.add(td3);
                    }
                    this.Pm.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i4 < size7) {
                        Td td5 = flexLinesInternal.get(i4);
                        float f3 = td5.VwS + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f3 += f2;
                            f2 = 0.0f;
                        }
                        int iRound = Math.round(f3);
                        f2 += f3 - iRound;
                        if (f2 > 1.0f) {
                            iRound++;
                            f2 -= 1.0f;
                        } else if (f2 < -1.0f) {
                            iRound--;
                            f2 += 1.0f;
                        }
                        td5.VwS = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    private List<Td> EYQ(List<Td> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        Td td = new Td();
        td.VwS = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(td);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(td);
            }
        }
        return arrayList;
    }

    void EYQ() {
        EYQ(0);
    }

    void EYQ(int i) {
        View viewMZx;
        if (i >= this.Pm.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.Pm.getFlexDirection();
        if (this.Pm.getAlignItems() == 4) {
            int[] iArr = this.EYQ;
            List<Td> flexLinesInternal = this.Pm.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                Td td = flexLinesInternal.get(i2);
                int i3 = td.QQ;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = td.KO + i4;
                    if (i4 < this.Pm.getFlexItemCount() && (viewMZx = this.Pm.mZx(i5)) != null && viewMZx.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx = (com.bytedance.adsdk.ugeno.component.flexbox.mZx) viewMZx.getLayoutParams();
                        if (mzx.IPb() == -1 || mzx.IPb() == 4) {
                            if (flexDirection == 0 || flexDirection == 1) {
                                EYQ(viewMZx, td.VwS, i5);
                            } else if (flexDirection == 2 || flexDirection == 3) {
                                mZx(viewMZx, td.VwS, i5);
                            } else {
                                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                            }
                        }
                    }
                }
            }
            return;
        }
        for (Td td2 : this.Pm.getFlexLinesInternal()) {
            for (Integer num : td2.nWX) {
                View viewMZx2 = this.Pm.mZx(num.intValue());
                if (flexDirection == 0 || flexDirection == 1) {
                    EYQ(viewMZx2, td2.VwS, num.intValue());
                } else if (flexDirection == 2 || flexDirection == 3) {
                    mZx(viewMZx2, td2.VwS, num.intValue());
                } else {
                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                }
            }
        }
    }

    private void EYQ(View view, int i, int i2) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx = (com.bytedance.adsdk.ugeno.component.flexbox.mZx) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - mzx.nWX()) - mzx.hu()) - this.Pm.EYQ(view), mzx.QQ()), mzx.tp());
        long[] jArr = this.IPb;
        if (jArr != null) {
            measuredWidth = EYQ(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        EYQ(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    private void mZx(View view, int i, int i2) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx = (com.bytedance.adsdk.ugeno.component.flexbox.mZx) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - mzx.pi()) - mzx.KO()) - this.Pm.EYQ(view), mzx.VwS()), mzx.HX());
        long[] jArr = this.IPb;
        if (jArr != null) {
            measuredHeight = mZx(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        EYQ(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    void EYQ(View view, Td td, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx = (com.bytedance.adsdk.ugeno.component.flexbox.mZx) view.getLayoutParams();
        int alignItems = this.Pm.getAlignItems();
        if (mzx.IPb() != -1) {
            alignItems = mzx.IPb();
        }
        int i5 = td.VwS;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.Pm.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - mzx.hu(), i3, i6 - mzx.hu());
                    return;
                } else {
                    view.layout(i, (i2 - i5) + view.getMeasuredHeight() + mzx.nWX(), i3, (i4 - i5) + view.getMeasuredHeight() + mzx.nWX());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + mzx.nWX()) - mzx.hu()) / 2;
                if (this.Pm.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.Pm.getFlexWrap() != 2) {
                    int iMax = Math.max(td.tsL - view.getBaseline(), mzx.nWX());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((td.tsL - view.getMeasuredHeight()) + view.getBaseline(), mzx.hu());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.Pm.getFlexWrap() != 2) {
            view.layout(i, i2 + mzx.nWX(), i3, i4 + mzx.nWX());
        } else {
            view.layout(i, i2 - mzx.hu(), i3, i4 - mzx.hu());
        }
    }

    void EYQ(View view, Td td, boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.component.flexbox.mZx mzx = (com.bytedance.adsdk.ugeno.component.flexbox.mZx) view.getLayoutParams();
        int alignItems = this.Pm.getAlignItems();
        if (mzx.IPb() != -1) {
            alignItems = mzx.IPb();
        }
        int i5 = td.VwS;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - mzx.KO(), i2, ((i3 + i5) - view.getMeasuredWidth()) - mzx.KO(), i4);
                    return;
                } else {
                    view.layout((i - i5) + view.getMeasuredWidth() + mzx.pi(), i2, (i3 - i5) + view.getMeasuredWidth() + mzx.pi(), i4);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + IPb.EYQ(marginLayoutParams)) - IPb.mZx(marginLayoutParams)) / 2;
                if (!z) {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                } else {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z) {
            view.layout(i + mzx.pi(), i2, i3 + mzx.pi(), i4);
        } else {
            view.layout(i - mzx.KO(), i2, i3 - mzx.KO(), i4);
        }
    }

    private void EYQ(int i, int i2, int i3, View view) {
        long[] jArr = this.mZx;
        if (jArr != null) {
            jArr[i] = mZx(i2, i3);
        }
        long[] jArr2 = this.IPb;
        if (jArr2 != null) {
            jArr2[i] = mZx(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* compiled from: FlexboxHelper.java */
    private static class mZx implements Comparable<mZx> {
        int EYQ;
        int mZx;

        private mZx() {
        }

        @Override // java.lang.Comparable
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public int compareTo(mZx mzx) {
            int i = this.mZx;
            int i2 = mzx.mZx;
            return i != i2 ? i - i2 : this.EYQ - mzx.EYQ;
        }

        public String toString() {
            return "Order{order=" + this.mZx + ", index=" + this.EYQ + AbstractJsonLexerKt.END_OBJ;
        }
    }

    /* compiled from: FlexboxHelper.java */
    static class EYQ {
        List<Td> EYQ;
        int mZx;

        EYQ() {
        }

        void EYQ() {
            this.EYQ = null;
            this.mZx = 0;
        }
    }
}
