package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.tp;

/* loaded from: classes2.dex */
public class TopProxyLayout extends View implements EYQ<TopProxyLayout> {
    private EYQ<TopProxyLayout> EYQ;

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public TopProxyLayout(Context context) {
        this(context, null);
    }

    public TopProxyLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopProxyLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View getITopLayout() {
        Object obj = this.EYQ;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    public TopProxyLayout EYQ(boolean z, UB ub) {
        TopLayoutDislike2 topLayoutDislike2EYQ = new TopLayoutDislike2(getContext()).EYQ(z, ub);
        this.EYQ = topLayoutDislike2EYQ;
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            EYQ(topLayoutDislike2EYQ, (ViewGroup) parent);
        }
        return this;
    }

    private void EYQ(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
        if (view != null) {
            view.setId(tp.OUK);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void setShowSkip(boolean z) {
        EYQ<TopProxyLayout> eyq = this.EYQ;
        if (eyq != null) {
            eyq.setShowSkip(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void setSkipEnable(boolean z) {
        EYQ<TopProxyLayout> eyq = this.EYQ;
        if (eyq != null) {
            eyq.setSkipEnable(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void Td() {
        EYQ<TopProxyLayout> eyq = this.EYQ;
        if (eyq != null) {
            eyq.Td();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void setSkipText(CharSequence charSequence) {
        EYQ<TopProxyLayout> eyq = this.EYQ;
        if (eyq != null) {
            eyq.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void Pm() {
        EYQ<TopProxyLayout> eyq = this.EYQ;
        if (eyq != null) {
            eyq.Pm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void Kbd() {
        EYQ<TopProxyLayout> eyq = this.EYQ;
        if (eyq != null) {
            eyq.Kbd();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void setShowSound(boolean z) {
        EYQ<TopProxyLayout> eyq = this.EYQ;
        if (eyq != null) {
            eyq.setShowSound(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void setSoundMute(boolean z) {
        EYQ<TopProxyLayout> eyq = this.EYQ;
        if (eyq != null) {
            eyq.setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void EYQ(CharSequence charSequence, CharSequence charSequence2) {
        EYQ<TopProxyLayout> eyq = this.EYQ;
        if (eyq != null) {
            eyq.EYQ(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void setShowDislike(boolean z) {
        EYQ<TopProxyLayout> eyq = this.EYQ;
        if (eyq != null) {
            eyq.setShowDislike(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void setListener(mZx mzx) {
        EYQ<TopProxyLayout> eyq = this.EYQ;
        if (eyq != null) {
            eyq.setListener(mzx);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void EYQ() {
        EYQ<TopProxyLayout> eyq = this.EYQ;
        if (eyq != null) {
            eyq.EYQ();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void mZx() {
        EYQ<TopProxyLayout> eyq = this.EYQ;
        if (eyq != null) {
            eyq.mZx();
        }
    }
}
