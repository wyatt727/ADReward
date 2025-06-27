package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.CircleLongPressView;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpShakeView;
import com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView;
import com.bytedance.sdk.component.adexpress.widget.RippleView;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;

/* loaded from: classes2.dex */
public class InteractViewContainer extends FrameLayout implements QQ {
    private Context EYQ;
    private int HX;
    private String IPb;
    private VwS Kbd;
    private com.bytedance.sdk.component.adexpress.dynamic.Td.tp MxO;
    private View Pm;
    private View.OnTouchListener QQ;
    private com.bytedance.sdk.component.adexpress.dynamic.Td.VwS Td;
    private RippleView VwS;
    private DynamicBaseWidget mZx;
    private DynamicBrushMaskView pi;
    private boolean tp;
    private com.bytedance.sdk.component.adexpress.mZx.pi tsL;

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS) {
        super(context);
        this.EYQ = context;
        this.mZx = dynamicBaseWidget;
        this.Td = vwS;
        VwS();
    }

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS, com.bytedance.sdk.component.adexpress.dynamic.Td.tp tpVar, com.bytedance.sdk.component.adexpress.mZx.pi piVar) {
        super(context);
        this.EYQ = context;
        this.mZx = dynamicBaseWidget;
        this.Td = vwS;
        this.MxO = tpVar;
        this.tsL = piVar;
        VwS();
    }

    private void VwS() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.IPb = this.Td.lRN();
        this.HX = this.Td.wJ();
        this.tp = this.Td.Nuq();
        VwS vwSEYQ = HX.EYQ(this.EYQ, this.mZx, this.Td, this.MxO, this.tsL);
        this.Kbd = vwSEYQ;
        if (vwSEYQ != null) {
            this.Pm = vwSEYQ.Td();
            if (this.Td.XPd()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.IPb, "6")) {
                if (this.Td.xh() && !TextUtils.isEmpty(this.Td.dVQ())) {
                    this.VwS = new RippleView(this.EYQ, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS.EYQ(this.Td.dVQ()));
                } else {
                    this.VwS = new RippleView(this.EYQ, Color.parseColor("#99000000"));
                }
                FrameLayout frameLayout = new FrameLayout(this.EYQ);
                frameLayout.addView(this.VwS, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer.1
                    @Override // java.lang.Runnable
                    public void run() {
                        InteractViewContainer.this.VwS.mZx();
                    }
                });
            }
            if (TextUtils.equals(this.IPb, "20")) {
                this.pi = (DynamicBrushMaskView) this.Kbd.Td();
            }
            if (EYQ(this.IPb) && com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                int color = Color.parseColor("#99000000");
                if (this.Td.xh() && !TextUtils.isEmpty(this.Td.dVQ())) {
                    try {
                        color = com.bytedance.sdk.component.adexpress.dynamic.Td.VwS.EYQ(this.Td.dVQ());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.EYQ);
                view.setBackgroundColor(color);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.Kbd.Td());
            EYQ(this.Kbd.Td());
            setVisibility(0);
        }
    }

    private boolean EYQ(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.QQ instanceof com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.Td) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void EYQ(ViewGroup viewGroup) {
        if (this.Pm == null) {
            return;
        }
        String str = this.IPb;
        str.hashCode();
        switch (str) {
            case "0":
                this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.Kbd(this, this.HX);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case "2":
            case "7":
                setBackgroundColor(Color.parseColor("#80000000"));
                this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.mZx(this, this);
                break;
            case "5":
                if (this.Td.xh() && !TextUtils.isEmpty(this.Td.dVQ())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.Td.VwS.EYQ(this.Td.dVQ()));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.Td(this);
                this.Pm.setTag(2);
                break;
            case "6":
                if (!this.Td.xh() || TextUtils.isEmpty(this.Td.dVQ())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.IPb(this);
                break;
            case "8":
            case "11":
                this.mZx.setClipChildren(false);
                this.mZx.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.mZx.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.IPb(this);
                break;
            case "9":
            case "17":
                this.Pm.setTag(2);
                break;
            case "10":
                this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.Pm(this, this.HX, this.tp);
                break;
            case "12":
                this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.Td(this);
                this.Pm.setTag(2);
                break;
            case "13":
            case "24":
                if (this.IPb.equals("24") && com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                    this.mZx.setClipChildren(false);
                    this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.IPb(this);
                    break;
                } else {
                    this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.Kbd(this, this.HX);
                    break;
                }
                break;
            case "14":
                this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.mZx(this, this);
                break;
            case "16":
                View view = this.Pm;
                if (view != null && (view instanceof ShakeAnimationView) && ((ShakeAnimationView) view).getShakeLayout() != null) {
                    ((ShakeAnimationView) this.Pm).getShakeLayout().setTag(2);
                }
                this.Pm.setTag(2);
                break;
            case "18":
                View view2 = this.Pm;
                if (view2 != null && (view2 instanceof WriggleGuideAnimationView) && ((WriggleGuideAnimationView) view2).getWriggleLayout() != null) {
                    ((WriggleGuideAnimationView) this.Pm).getWriggleLayout().setTag(2);
                }
                this.Pm.setTag(2);
                break;
            case "20":
                this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.EYQ(this, this.HX, viewGroup);
                break;
            case "22":
                if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                    this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.QQ(this, this.tp);
                    break;
                } else {
                    this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.VwS(this, this.HX, viewGroup);
                    break;
                }
            case "23":
                if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                    this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.IPb(this);
                    break;
                }
                break;
            case "25":
                if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                    this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.QQ(this, this.tp);
                    break;
                }
                break;
            case "29":
                View view3 = this.Pm;
                if (view3 != null && (view3 instanceof ClickSlideUpShakeView) && ((ClickSlideUpShakeView) view3).getShakeView() != null) {
                    ((ClickSlideUpShakeView) this.Pm).getShakeView().setTag(2);
                }
                this.QQ = new com.bytedance.sdk.component.adexpress.dynamic.interact.EYQ.Kbd(this, this.HX);
                break;
        }
        View.OnTouchListener onTouchListener = this.QQ;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (QQ()) {
            this.Pm.setTag(2);
            setOnClickListener((View.OnClickListener) this.mZx.getDynamicClickListener());
        }
    }

    private boolean QQ() {
        return (this.Td.Nuq() || TextUtils.equals("9", this.IPb) || TextUtils.equals("16", this.IPb) || TextUtils.equals("17", this.IPb) || TextUtils.equals("18", this.IPb) || TextUtils.equals("20", this.IPb) || TextUtils.equals("29", this.IPb) || TextUtils.equals("10", this.IPb)) ? false : true;
    }

    public void Td() {
        VwS vwS = this.Kbd;
        if (vwS != null) {
            vwS.EYQ();
        }
    }

    public void Pm() {
        VwS vwS = this.Kbd;
        if (vwS != null) {
            vwS.mZx();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            VwS vwS = this.Kbd;
            if (vwS != null) {
                vwS.mZx();
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.mZx(e.getMessage());
        }
    }

    public void Kbd() {
        if (this.Pm != null && TextUtils.equals(this.IPb, "2")) {
            View view = this.Pm;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).Td();
            }
        }
    }

    public void IPb() {
        if (this.Pm != null && TextUtils.equals(this.IPb, "2")) {
            View view = this.Pm;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).Pm();
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.QQ
    public void EYQ() {
        if (TextUtils.equals(this.IPb, "6")) {
            RippleView rippleView = this.VwS;
            if (rippleView != null) {
                rippleView.Td();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        InteractViewContainer.this.HX();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.IPb, "20")) {
            DynamicBrushMaskView dynamicBrushMaskView = this.pi;
            if (dynamicBrushMaskView != null) {
                dynamicBrushMaskView.EYQ();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer.3
                    @Override // java.lang.Runnable
                    public void run() {
                        InteractViewContainer.this.HX();
                    }
                }, 400L);
                return;
            }
            return;
        }
        HX();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.QQ
    public void mZx() {
        if (QQ()) {
            setOnClickListener((View.OnClickListener) this.mZx.getDynamicClickListener());
            performClick();
            if (this.Td.BQ()) {
                return;
            }
            setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HX() {
        if (this.QQ != null) {
            setOnClickListener((View.OnClickListener) this.mZx.getDynamicClickListener());
            performClick();
            if (this.Td.BQ()) {
                return;
            }
            setVisibility(8);
        }
    }
}
