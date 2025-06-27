package com.bytedance.adsdk.ugeno.component.flexbox;

import android.view.View;
import java.util.List;

/* compiled from: FlexContainer.java */
/* loaded from: classes2.dex */
interface EYQ {
    int EYQ(int i, int i2, int i3);

    int EYQ(View view);

    int EYQ(View view, int i, int i2);

    View EYQ(int i);

    void EYQ(View view, int i, int i2, Td td);

    void EYQ(Td td);

    boolean EYQ();

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<Td> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int mZx(int i, int i2, int i3);

    View mZx(int i);

    void setFlexLines(List<Td> list);
}
