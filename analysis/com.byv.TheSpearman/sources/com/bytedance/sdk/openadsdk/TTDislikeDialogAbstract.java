package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class TTDislikeDialogAbstract extends Dialog {
    private View EYQ;
    private List<FilterWord> Td;
    private String mZx;

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    public abstract int[] getTTDislikeListViewIds();

    public TTDislikeDialogAbstract(Context context) {
        super(context);
    }

    public TTDislikeDialogAbstract(Context context, int i) {
        super(context, i);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View layoutView = getLayoutView();
        this.EYQ = layoutView;
        if (layoutView == null) {
            throw new IllegalArgumentException("getLayoutView,layout  may be abnormal, please check");
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.EYQ;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
        EYQ();
    }

    private void EYQ() {
        if (this.Td == null || this.EYQ == null) {
            return;
        }
        int[] tTDislikeListViewIds = getTTDislikeListViewIds();
        if (tTDislikeListViewIds == null || tTDislikeListViewIds.length <= 0) {
            throw new IllegalArgumentException("The options list of dislike is empty, please set TTDislikeListView");
        }
        for (int i : tTDislikeListViewIds) {
            View viewFindViewById = this.EYQ.findViewById(i);
            if (viewFindViewById == null) {
                throw new IllegalArgumentException("getTTDislikeListViewIds can not find view by Id,please check");
            }
            if (!(viewFindViewById instanceof TTDislikeListView)) {
                throw new IllegalArgumentException("getTTDislikeListViewIds can not find view by Id , please check");
            }
            ((TTDislikeListView) viewFindViewById).setMaterialMeta(this.mZx);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.mZx = str;
        this.Td = list;
        EYQ();
    }
}
