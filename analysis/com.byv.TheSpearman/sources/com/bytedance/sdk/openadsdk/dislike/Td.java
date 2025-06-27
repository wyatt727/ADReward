package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.settings.KO;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TTDislikeDialogDefault.java */
/* loaded from: classes2.dex */
public class Td extends TTDislikeDialogAbstract {
    private TTDislikeListView EYQ;
    private String HX;
    private mZx IPb;
    private mZx Kbd;
    private View Pm;
    private String QQ;
    private RelativeLayout Td;
    private EYQ VwS;
    private TTDislikeListView mZx;
    private List<FilterWord> tp;

    /* compiled from: TTDislikeDialogDefault.java */
    public interface EYQ {
        void EYQ();

        void EYQ(int i, FilterWord filterWord);

        void Td();

        void mZx();
    }

    public Td(Context context, String str, List<FilterWord> list) {
        super(context, zF.IPb(context, "tt_dislikeDialog"));
        this.HX = str;
        this.tp = list;
    }

    public void EYQ(String str, List<FilterWord> list) {
        mZx mzx = this.Kbd;
        if (mzx == null || this.tp == null || str == null) {
            return;
        }
        this.HX = str;
        this.tp = list;
        mzx.EYQ(list);
        setMaterialMeta(str, list);
    }

    public void EYQ(EYQ eyq) {
        this.VwS = eyq;
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            EYQ();
            EYQ(getContext());
            mZx();
            setMaterialMeta(this.HX, this.tp);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    public void EYQ(String str) {
        this.QQ = str;
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new Pm().EYQ(getContext());
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public int[] getTTDislikeListViewIds() {
        return new int[]{tp.zAe, tp.LoE};
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(tr.Td(getContext()) - 120, -2);
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            Td();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    private void EYQ() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.y = 50;
            window.setAttributes(attributes);
        }
    }

    private void mZx() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.dislike.Td.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (Td.this.VwS != null) {
                    EYQ unused = Td.this.VwS;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.dislike.Td.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (Td.this.VwS != null) {
                    Td.this.VwS.mZx();
                }
            }
        });
        mZx mzx = new mZx(getLayoutInflater(), this.tp);
        this.Kbd = mzx;
        this.EYQ.setAdapter((ListAdapter) mzx);
        mZx mzx2 = new mZx(getLayoutInflater(), new ArrayList());
        this.IPb = mzx2;
        mzx2.EYQ(false);
        this.mZx.setAdapter((ListAdapter) this.IPb);
    }

    private void EYQ(Context context) {
        this.Td = (RelativeLayout) findViewById(tp.Hrh);
        this.Pm = findViewById(tp.Vx);
        TextView textView = (TextView) findViewById(tp.WD);
        TextView textView2 = (TextView) findViewById(tp.Qh);
        PAGTextView pAGTextView = (PAGTextView) findViewById(tp.xBe);
        textView.setText(zF.EYQ(getContext(), "tt_dislike_header_tv_back"));
        textView2.setText(zF.EYQ(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.Td.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Td.this.Td();
                if (Td.this.VwS != null) {
                    Td.this.VwS.Td();
                }
            }
        });
        if (pAGTextView != null) {
            pAGTextView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.Td.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Td.this.VwS.EYQ();
                }
            });
        }
        TTDislikeListView tTDislikeListView = (TTDislikeListView) findViewById(tp.zAe);
        this.EYQ = tTDislikeListView;
        tTDislikeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.Td.5
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                try {
                    FilterWord filterWord = (FilterWord) adapterView.getAdapter().getItem(i);
                    if (filterWord.hasSecondOptions()) {
                        Td.this.EYQ(filterWord);
                        if (Td.this.VwS != null) {
                            Td.this.VwS.EYQ(i, filterWord);
                            return;
                        }
                        return;
                    }
                } catch (Throwable unused) {
                }
                if (Td.this.VwS != null) {
                    try {
                        Td.this.VwS.EYQ(i, (FilterWord) Td.this.tp.get(i));
                    } catch (Throwable unused2) {
                    }
                }
                Td.this.dismiss();
            }
        });
        this.EYQ.setClosedListenerKey(this.QQ);
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) findViewById(tp.LoE);
        this.mZx = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.Td.6
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (Td.this.VwS != null) {
                    try {
                        Td.this.VwS.EYQ(i, (FilterWord) adapterView.getAdapter().getItem(i));
                    } catch (Throwable unused) {
                    }
                }
                Td.this.dismiss();
            }
        });
        this.mZx.setClosedListenerKey(this.QQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td() {
        RelativeLayout relativeLayout = this.Td;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.Pm;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.EYQ;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        mZx mzx = this.IPb;
        if (mzx != null) {
            mzx.EYQ();
        }
        TTDislikeListView tTDislikeListView2 = this.mZx;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        mZx mzx = this.IPb;
        if (mzx != null) {
            mzx.EYQ(filterWord.getOptions());
        }
        RelativeLayout relativeLayout = this.Td;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        View view = this.Pm;
        if (view != null) {
            view.setVisibility(0);
        }
        TTDislikeListView tTDislikeListView = this.EYQ;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView2 = this.mZx;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(0);
        }
    }

    /* compiled from: TTDislikeDialogDefault.java */
    public static class mZx extends BaseAdapter {
        private boolean EYQ = true;
        private final LayoutInflater Td;
        private final List<FilterWord> mZx;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public mZx(LayoutInflater layoutInflater, List<FilterWord> list) {
            this.mZx = list;
            this.Td = layoutInflater;
        }

        public void EYQ(boolean z) {
            this.EYQ = z;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<FilterWord> list = this.mZx;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.mZx.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View viewEYQ;
            EYQ eyq;
            if (view == null) {
                eyq = new EYQ();
                viewEYQ = EYQ(this.Td.getContext());
                eyq.EYQ = (TextView) viewEYQ.findViewById(tp.cVL);
                eyq.mZx = (ImageView) viewEYQ.findViewById(tp.BEC);
                viewEYQ.setTag(eyq);
            } else {
                viewEYQ = view;
                eyq = (EYQ) view.getTag();
            }
            FilterWord filterWord = this.mZx.get(i);
            eyq.EYQ.setText(filterWord.getName());
            if (KO.Jpu().na() || i != this.mZx.size() - 1) {
                eyq.EYQ.setBackgroundResource(zF.Pm(this.Td.getContext(), "tt_dislike_middle_seletor"));
            } else {
                eyq.EYQ.setBackgroundResource(zF.Pm(this.Td.getContext(), "tt_dislike_bottom_seletor"));
            }
            if (this.EYQ && i == 0) {
                eyq.EYQ.setBackgroundResource(zF.Pm(this.Td.getContext(), "tt_dislike_top_seletor"));
            }
            if (filterWord.hasSecondOptions()) {
                eyq.mZx.setVisibility(0);
            } else {
                eyq.mZx.setVisibility(8);
            }
            return viewEYQ;
        }

        private View EYQ(Context context) {
            PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
            pAGFrameLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            PAGTextView pAGTextView = new PAGTextView(context);
            pAGTextView.setId(tp.cVL);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, tr.mZx(context, 44.0f));
            layoutParams.gravity = 17;
            pAGTextView.setLayoutParams(layoutParams);
            pAGTextView.setGravity(17);
            pAGTextView.setTextColor(Color.parseColor("#FF4A4A4A"));
            pAGTextView.setTextSize(16.0f);
            PAGImageView pAGImageView = new PAGImageView(context);
            pAGImageView.setId(tp.BEC);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(tr.mZx(context, 44.0f), tr.mZx(context, 44.0f));
            layoutParams2.gravity = 8388629;
            pAGImageView.setLayoutParams(layoutParams2);
            pAGImageView.setRotation(180.0f);
            pAGImageView.setScaleType(ImageView.ScaleType.CENTER);
            pAGImageView.setImageResource(zF.Pm(context, "tt_lefterbackicon_titlebar_press_wrapper"));
            pAGFrameLayout.addView(pAGTextView);
            pAGFrameLayout.addView(pAGImageView);
            return pAGFrameLayout;
        }

        public void EYQ(List<FilterWord> list) {
            if (list == null || list.isEmpty()) {
                return;
            }
            this.mZx.clear();
            this.mZx.addAll(list);
            notifyDataSetChanged();
        }

        public void EYQ() {
            this.mZx.clear();
            notifyDataSetChanged();
        }

        /* compiled from: TTDislikeDialogDefault.java */
        private static class EYQ {
            TextView EYQ;
            ImageView mZx;

            private EYQ() {
            }
        }
    }
}
