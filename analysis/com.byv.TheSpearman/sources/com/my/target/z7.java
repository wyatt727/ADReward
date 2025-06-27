package com.my.target;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes4.dex */
public interface z7 {

    public interface a {
        void a(int i, Context context);

        void a(View view, int i);

        void a(int[] iArr, Context context);
    }

    void dispose();

    Parcelable getState();

    int[] getVisibleCardNumbers();

    void restoreState(Parcelable parcelable);

    void setPromoCardSliderListener(a aVar);
}
