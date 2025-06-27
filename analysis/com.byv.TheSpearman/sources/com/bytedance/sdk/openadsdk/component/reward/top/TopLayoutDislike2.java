package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Pm;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.KO;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.widget.ShadowImageView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowTextView;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;

/* loaded from: classes2.dex */
public class TopLayoutDislike2 extends PAGLinearLayout implements EYQ<TopLayoutDislike2> {
    private View EYQ;
    private mZx HX;
    private int IPb;
    private int Kbd;
    private boolean MxO;
    private TextView Pm;
    private boolean QQ;
    private ShadowImageView Td;
    private boolean VwS;
    private ImageView mZx;
    private boolean pi;
    private boolean tp;
    private CharSequence tsL;

    public TopLayoutDislike2(Context context) {
        this(context, null);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.tsL = "";
        setOrientation(0);
    }

    public void setShouldShowSkipTime(boolean z) {
        this.tp = z;
    }

    public TopLayoutDislike2 EYQ(boolean z, UB ub) {
        boolean z2;
        EYQ(ub);
        this.EYQ.setVisibility(0);
        ((ImageView) this.EYQ).setImageResource(zF.Pm(hu.EYQ(), "tt_reward_full_feedback"));
        this.mZx.setImageResource(zF.Pm(hu.EYQ(), "tt_skip_btn"));
        if (Build.VERSION.SDK_INT >= 19 && this.mZx.getDrawable() != null) {
            this.mZx.getDrawable().setAutoMirrored(true);
        }
        this.mZx.setVisibility(8);
        this.Kbd = ub.mN() == null ? 0 : ((int) ub.mN().IPb()) * ub.mN().XN();
        if (KO.Td(ub) && ub.QQ() != null) {
            this.Kbd = (int) ub.QQ().mZx();
        }
        if (this.Kbd <= 0) {
            this.Kbd = 10;
        }
        if (ub.KvC() == 8 && ub.Nvm() != null) {
            this.IPb = hu.Pm().UB(ub.Nvm().getCodeId());
            z2 = false;
        } else {
            if (ub.Nvm() != null) {
                this.IPb = hu.Pm().tp(ub.Nvm().getCodeId());
            }
            z2 = true;
        }
        if (com.bytedance.sdk.openadsdk.core.model.zF.MxO(ub)) {
            this.IPb = hu.Pm().EYQ(String.valueOf(ub.yK()), z2);
            this.Kbd = ub.eVP();
        }
        int i = this.IPb;
        this.tp = i == -1 || i >= this.Kbd;
        if (ub.oIw()) {
            this.EYQ.setVisibility(8);
            this.VwS = true;
        }
        this.Pm.setVisibility(0);
        this.Pm.setText("");
        this.Pm.setEnabled(false);
        this.Pm.setClickable(false);
        VwS();
        return this;
    }

    private void EYQ(UB ub) {
        IPb();
    }

    private void IPb() {
        this.Td = new ShadowImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tr.mZx(getContext(), 28.0f), tr.mZx(getContext(), 28.0f));
        layoutParams.leftMargin = tr.mZx(getContext(), 16.0f);
        layoutParams.topMargin = tr.mZx(getContext(), 20.0f);
        this.Td.setLayoutParams(layoutParams);
        this.Td.setScaleType(ImageView.ScaleType.CENTER);
        ShadowImageView shadowImageView = new ShadowImageView(getContext());
        this.EYQ = shadowImageView;
        shadowImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(tr.mZx(getContext(), 28.0f), tr.mZx(getContext(), 28.0f));
        layoutParams2.topMargin = tr.mZx(getContext(), 20.0f);
        layoutParams2.leftMargin = tr.mZx(getContext(), 16.0f);
        this.EYQ.setLayoutParams(layoutParams2);
        ((ImageView) this.EYQ).setScaleType(ImageView.ScaleType.CENTER);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        ShadowTextView shadowTextView = new ShadowTextView(getContext());
        this.Pm = shadowTextView;
        shadowTextView.setId(520093714);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, tr.mZx(getContext(), 28.0f));
        layoutParams4.topMargin = tr.mZx(getContext(), 20.0f);
        int iMZx = tr.mZx(getContext(), 16.0f);
        layoutParams2.rightMargin = iMZx;
        layoutParams4.rightMargin = iMZx;
        this.Pm.setLayoutParams(layoutParams4);
        this.Pm.setGravity(17);
        this.Pm.setTextColor(Color.parseColor("#ffffff"));
        this.Pm.setTextSize(14.0f);
        this.Pm.setVisibility(8);
        this.mZx = new ShadowImageView(getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(tr.mZx(getContext(), 28.0f), tr.mZx(getContext(), 28.0f));
        layoutParams5.topMargin = tr.mZx(getContext(), 20.0f);
        layoutParams5.rightMargin = tr.mZx(getContext(), 16.0f);
        this.mZx.setLayoutParams(layoutParams5);
        this.mZx.setPadding(tr.mZx(getContext(), 4.0f), tr.mZx(getContext(), 4.0f), tr.mZx(getContext(), 4.0f), tr.mZx(getContext(), 4.0f));
        this.mZx.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.Td);
        addView(this.EYQ);
        addView(view);
        addView(this.Pm);
        addView(this.mZx);
    }

    private void VwS() {
        View view = this.EYQ;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.HX != null) {
                        TopLayoutDislike2.this.HX.Td(view2);
                    }
                }
            });
        }
        ShadowImageView shadowImageView = this.Td;
        if (shadowImageView != null) {
            shadowImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    int iPm;
                    TopLayoutDislike2.this.QQ = !r0.QQ;
                    if (TopLayoutDislike2.this.mZx != null) {
                        iPm = TopLayoutDislike2.this.QQ ? zF.Pm(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute") : zF.Pm(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute");
                    } else {
                        iPm = TopLayoutDislike2.this.QQ ? zF.Pm(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : zF.Pm(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper");
                    }
                    TopLayoutDislike2.this.Td.setImageResource(iPm);
                    if (Build.VERSION.SDK_INT >= 19 && TopLayoutDislike2.this.Td.getDrawable() != null) {
                        TopLayoutDislike2.this.Td.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.HX != null) {
                        TopLayoutDislike2.this.HX.mZx(view2);
                    }
                }
            });
        }
        ImageView imageView = this.mZx;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.HX != null) {
                        TopLayoutDislike2.this.HX.EYQ(view2);
                    }
                }
            });
            return;
        }
        TextView textView = this.Pm;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.HX != null) {
                        TopLayoutDislike2.this.HX.EYQ(view2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void setShowSkip(boolean z) {
        TextView textView = this.Pm;
        if (textView != null) {
            if (!z) {
                textView.setText("");
            }
            if (this.mZx.getVisibility() == 4) {
                return;
            }
            this.MxO = !z;
            this.mZx.setVisibility((z && this.pi) ? 0 : 8);
            this.Pm.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void setSkipEnable(boolean z) {
        ImageView imageView = this.mZx;
        if (imageView != null) {
            imageView.setEnabled(z);
            this.mZx.setClickable(z);
            return;
        }
        TextView textView = this.Pm;
        if (textView != null) {
            textView.setEnabled(z);
            this.Pm.setClickable(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void setShowSound(boolean z) {
        ShadowImageView shadowImageView = this.Td;
        if (shadowImageView != null) {
            shadowImageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void setSoundMute(boolean z) {
        int iPm;
        this.QQ = z;
        if (this.mZx != null) {
            if (z) {
                iPm = zF.Pm(getContext(), "tt_reward_full_mute");
            } else {
                iPm = zF.Pm(getContext(), "tt_reward_full_unmute");
            }
        } else if (z) {
            iPm = zF.Pm(getContext(), "tt_mute_wrapper");
        } else {
            iPm = zF.Pm(getContext(), "tt_unmute_wrapper");
        }
        this.Td.setImageResource(iPm);
        if (Build.VERSION.SDK_INT < 19 || this.Td.getDrawable() == null) {
            return;
        }
        this.Td.getDrawable().setAutoMirrored(true);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void EYQ(CharSequence charSequence, CharSequence charSequence2) throws NumberFormatException {
        int i;
        if (!TextUtils.isEmpty(charSequence)) {
            this.tsL = charSequence;
        }
        if (this.mZx != null) {
            this.pi = true;
            if (this.tp) {
                this.Pm.setText(((Object) this.tsL) + CmcdHeadersFactory.STREAMING_FORMAT_SS);
                EYQ(false);
                return;
            }
            String str = (String) this.tsL;
            try {
                int i2 = this.IPb;
                if (i2 == 0) {
                    i = Integer.parseInt(str);
                } else {
                    i = i2 - (this.Kbd - Integer.parseInt(str));
                }
                if (i > 0) {
                    if (this.IPb == 0) {
                        EYQ(false);
                        return;
                    } else {
                        this.Pm.setText(String.format(zF.EYQ(Pm.EYQ(), "tt_reward_full_skip"), Integer.valueOf(i)));
                        EYQ(true);
                        return;
                    }
                }
                this.Pm.setText(((Object) this.tsL) + CmcdHeadersFactory.STREAMING_FORMAT_SS);
                EYQ(false);
            } catch (Exception unused) {
            }
        }
    }

    private void EYQ(boolean z) {
        if (this.MxO) {
            return;
        }
        if (this.tp) {
            this.mZx.setVisibility(8);
            this.Pm.setVisibility(0);
        } else if (z) {
            this.Pm.setVisibility(0);
            this.mZx.setVisibility(8);
        } else {
            this.mZx.setVisibility(0);
            this.Pm.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.Pm.setText(charSequence);
        ImageView imageView = this.mZx;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void setShowDislike(boolean z) {
        View view = this.EYQ;
        if (view == null || this.VwS) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void setListener(mZx mzx) {
        this.HX = mzx;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void EYQ() {
        ImageView imageView = this.mZx;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.Pm;
        if (textView != null) {
            textView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void mZx() {
        ShadowImageView shadowImageView = this.Td;
        if (shadowImageView != null) {
            shadowImageView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void Pm() {
        this.Pm.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void Kbd() {
        ImageView imageView = this.mZx;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.Pm.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.EYQ
    public void Td() {
        this.Pm.setWidth(20);
        this.Pm.setVisibility(4);
        this.mZx.setVisibility(4);
        this.MxO = true;
    }
}
