package com.bytedance.adsdk.ugeno.component;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout;
import com.bytedance.adsdk.ugeno.mZx.QQ;
import java.util.ArrayList;
import java.util.List;

/* compiled from: UGLayoutWidget.java */
/* loaded from: classes2.dex */
public class EYQ<E extends ViewGroup> extends mZx {
    protected List<mZx<View>> EYQ;

    public EYQ(Context context) {
        this(context, null);
    }

    public EYQ(Context context, EYQ eyq) {
        super(context, eyq);
        this.EYQ = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void mZx() {
        super.mZx();
    }

    public void EYQ(mZx mzx) {
        if (mzx == null) {
            return;
        }
        this.EYQ.add(mzx);
        View viewHX = mzx.HX();
        if (viewHX != null) {
            ((ViewGroup) this.Kbd).addView(viewHX);
        }
    }

    public List<mZx<View>> EYQ() {
        return this.EYQ;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public mZx EYQ(String str) {
        mZx<T> mZx;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.tp)) {
            return this;
        }
        for (mZx<View> mzx : this.EYQ) {
            if (mzx != null && (mZx = mzx.mZx(str)) != 0) {
                return mZx;
            }
        }
        return null;
    }

    public C0075EYQ QQ() {
        return new C0075EYQ();
    }

    /* compiled from: UGLayoutWidget.java */
    /* renamed from: com.bytedance.adsdk.ugeno.component.EYQ$EYQ, reason: collision with other inner class name */
    public static class C0075EYQ {
        protected float EYQ;
        protected float IPb;
        protected float Kbd;
        protected float Pm;
        protected ViewGroup.LayoutParams QQ;
        protected float Td;
        protected float VwS;
        protected float mZx;

        public void EYQ(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            str.hashCode();
            switch (str) {
                case "height":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.mZx = -1.0f;
                        break;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.mZx = -2.0f;
                        break;
                    } else {
                        this.mZx = QQ.EYQ(context, str2);
                        break;
                    }
                case "margin":
                    this.Td = QQ.EYQ(context, str2);
                    break;
                case "marginTop":
                    this.IPb = QQ.EYQ(context, str2);
                    break;
                case "marginBottom":
                    this.VwS = QQ.EYQ(context, str2);
                    break;
                case "width":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.EYQ = -1.0f;
                        break;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.EYQ = -2.0f;
                        break;
                    } else {
                        this.EYQ = QQ.EYQ(context, str2);
                        break;
                    }
                case "marginRight":
                    this.Kbd = QQ.EYQ(context, str2);
                    break;
                case "marginLeft":
                    this.Pm = QQ.EYQ(context, str2);
                    break;
            }
        }

        public ViewGroup.LayoutParams EYQ() {
            FlexboxLayout.EYQ eyq = new FlexboxLayout.EYQ((int) this.EYQ, (int) this.mZx);
            eyq.leftMargin = (int) this.Pm;
            eyq.rightMargin = (int) this.Kbd;
            eyq.topMargin = (int) this.IPb;
            eyq.bottomMargin = (int) this.VwS;
            return eyq;
        }
    }
}
