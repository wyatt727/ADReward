package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.dislike.Kbd;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.dislike.Td;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class TTAdDislikeDialog extends PAGFrameLayout {
    private View EYQ;
    private EYQ HX;
    private Td.mZx IPb;
    private View Kbd;
    private boolean MxO;
    private RelativeLayout Pm;
    private UB QQ;
    private TTDislikeListView Td;
    private Td.mZx VwS;
    private TTDislikeListView mZx;
    private Context tp;
    private com.bytedance.sdk.openadsdk.dislike.Kbd tsL;

    public interface EYQ {
        void EYQ(int i, FilterWord filterWord);

        void EYQ(View view);

        void mZx(View view);
    }

    public TTAdDislikeDialog(Context context, UB ub) {
        this(context.getApplicationContext());
        this.tp = context;
        this.QQ = ub;
        Pm();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TTAdDislikeDialog(Context context) {
        this(context, (AttributeSet) null);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MxO = false;
        EYQ(context, attributeSet);
    }

    private void EYQ(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTAdDislikeDialog.this.mZx();
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.EYQ = new com.bytedance.sdk.openadsdk.dislike.Pm().EYQ(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = tr.mZx(getContext(), 20.0f);
        layoutParams.rightMargin = tr.mZx(getContext(), 20.0f);
        this.EYQ.setLayoutParams(layoutParams);
        this.EYQ.setClickable(true);
        Kbd();
        Pm();
    }

    private void Pm() {
        if (this.QQ == null) {
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        Td.mZx mzx = new Td.mZx(layoutInflaterFrom, this.QQ.VEW());
        this.IPb = mzx;
        this.mZx.setAdapter((ListAdapter) mzx);
        Td.mZx mzx2 = new Td.mZx(layoutInflaterFrom, new ArrayList());
        this.VwS = mzx2;
        mzx2.EYQ(false);
        this.Td.setAdapter((ListAdapter) this.VwS);
        this.mZx.setMaterialMeta(this.QQ.GfQ());
        this.Td.setMaterialMeta(this.QQ.GfQ());
    }

    private void Kbd() {
        this.Pm = (RelativeLayout) this.EYQ.findViewById(com.bytedance.sdk.openadsdk.utils.tp.Hrh);
        this.Kbd = this.EYQ.findViewById(com.bytedance.sdk.openadsdk.utils.tp.Vx);
        PAGTextView pAGTextView = (PAGTextView) this.EYQ.findViewById(com.bytedance.sdk.openadsdk.utils.tp.xBe);
        TextView textView = (TextView) this.EYQ.findViewById(com.bytedance.sdk.openadsdk.utils.tp.WD);
        TextView textView2 = (TextView) this.EYQ.findViewById(com.bytedance.sdk.openadsdk.utils.tp.Qh);
        textView.setText(zF.EYQ(getContext(), "tt_dislike_header_tv_back"));
        textView2.setText(zF.EYQ(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTAdDislikeDialog.this.IPb();
                if (TTAdDislikeDialog.this.HX != null) {
                    EYQ unused = TTAdDislikeDialog.this.HX;
                }
            }
        });
        if (pAGTextView != null) {
            pAGTextView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTAdDislikeDialog.this.Td();
                }
            });
        }
        TTDislikeListView tTDislikeListView = (TTDislikeListView) this.EYQ.findViewById(com.bytedance.sdk.openadsdk.utils.tp.zAe);
        this.mZx = tTDislikeListView;
        tTDislikeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.4
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                try {
                    FilterWord filterWord = (FilterWord) adapterView.getAdapter().getItem(i);
                    if (filterWord.hasSecondOptions()) {
                        TTAdDislikeDialog.this.EYQ(filterWord);
                        if (TTAdDislikeDialog.this.HX != null) {
                            TTAdDislikeDialog.this.HX.EYQ(i, filterWord);
                            return;
                        }
                        return;
                    }
                } catch (Throwable unused) {
                }
                if (TTAdDislikeDialog.this.HX != null) {
                    try {
                        TTAdDislikeDialog.this.HX.EYQ(i, TTAdDislikeDialog.this.QQ.VEW().get(i));
                    } catch (Throwable unused2) {
                    }
                }
                TTAdDislikeDialog.this.mZx();
            }
        });
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) this.EYQ.findViewById(com.bytedance.sdk.openadsdk.utils.tp.LoE);
        this.Td = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.5
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (TTAdDislikeDialog.this.HX != null) {
                    try {
                        TTAdDislikeDialog.this.HX.EYQ(i, (FilterWord) adapterView.getAdapter().getItem(i));
                    } catch (Throwable unused) {
                    }
                }
                TTAdDislikeDialog.this.mZx();
            }
        });
    }

    public void EYQ() {
        if (this.EYQ.getParent() == null) {
            addView(this.EYQ);
        }
        IPb();
        setVisibility(0);
        this.MxO = true;
        EYQ eyq = this.HX;
        if (eyq != null) {
            eyq.EYQ(this);
        }
    }

    public void mZx() {
        setVisibility(8);
        this.MxO = false;
        EYQ eyq = this.HX;
        if (eyq != null) {
            eyq.mZx(this);
        }
    }

    public void setCallback(EYQ eyq) {
        this.HX = eyq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IPb() {
        RelativeLayout relativeLayout = this.Pm;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.Kbd;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.mZx;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        Td.mZx mzx = this.VwS;
        if (mzx != null) {
            mzx.EYQ();
        }
        TTDislikeListView tTDislikeListView2 = this.Td;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        Td.mZx mzx = this.VwS;
        if (mzx != null) {
            mzx.EYQ(filterWord.getOptions());
        }
        RelativeLayout relativeLayout = this.Pm;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        View view = this.Kbd;
        if (view != null) {
            view.setVisibility(0);
        }
        TTDislikeListView tTDislikeListView = this.mZx;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView2 = this.Td;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(0);
        }
    }

    public void Td() {
        Context context = this.tp;
        if (context instanceof Activity) {
            boolean z = !((Activity) context).isFinishing();
            com.bytedance.sdk.openadsdk.dislike.Kbd kbd = new com.bytedance.sdk.openadsdk.dislike.Kbd(this.tp);
            this.tsL = kbd;
            kbd.EYQ(VwS());
            this.tsL.EYQ(this.QQ.GfQ(), this.QQ.aEX().toString());
            if (!z || this.tsL.isShowing()) {
                return;
            }
            this.tsL.show();
        }
    }

    private Kbd.EYQ VwS() {
        return new Kbd.EYQ() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.6
            @Override // com.bytedance.sdk.openadsdk.dislike.Kbd.EYQ
            public void EYQ() {
                TTAdDislikeDialog.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.Kbd.EYQ
            public void mZx() {
                TTAdDislikeDialog.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.Kbd.EYQ
            public void Td() {
                TTAdDislikeDialog.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.Kbd.EYQ
            public void EYQ(int i, FilterWord filterWord) {
                if (TTAdDislikeDialog.this.HX != null) {
                    TTAdDislikeDialog.this.HX.EYQ(i, filterWord);
                    TTAdDislikeDialog.this.HX.mZx(TTAdDislikeDialog.this);
                }
            }
        };
    }
}
