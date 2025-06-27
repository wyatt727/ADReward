package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.graphics.Color;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.WU;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.nativeexpress.IPb;
import com.bytedance.sdk.openadsdk.core.nativeexpress.Kbd;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.VwS;
import com.bytedance.sdk.openadsdk.core.rfB;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.Tnp;
import com.bytedance.sdk.openadsdk.utils.hYh;
import com.bytedance.sdk.openadsdk.utils.tPj;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.com.bytedance.overseas.sdk.EYQ.Pm;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PAGBannerAdImpl.java */
/* loaded from: classes2.dex */
public class EYQ extends PAGBannerAd implements wBa.EYQ {
    protected BannerExpressView EYQ;
    private int HX;
    TTDislikeDialogAbstract Kbd;
    private com.bytedance.sdk.openadsdk.dislike.mZx MxO;
    protected AdSlot Pm;
    private PAGBannerAdWrapperListener QQ;
    protected UB Td;
    private boolean UB;
    private final boolean VwS;
    private boolean WU;
    private NativeExpressView hYh;
    private boolean hu;
    protected final Context mZx;
    private WU.EYQ nWX;
    private wBa pi;
    private com.com.bytedance.overseas.sdk.EYQ.Td tsL;
    private int tp = 0;
    private final Queue<Long> KO = new LinkedList();
    private String Uc = "banner_ad";
    private final AtomicBoolean zF = new AtomicBoolean(false);
    protected final View.OnAttachStateChangeListener IPb = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (EYQ.this.WU) {
                return;
            }
            EYQ eyq = EYQ.this;
            eyq.EYQ(eyq.EYQ.getCurView(), EYQ.this.Td);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            EYQ.this.EYQ.Td();
        }
    };

    /* compiled from: PAGBannerAdImpl.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ$EYQ, reason: collision with other inner class name */
    public interface InterfaceC0117EYQ {
        void EYQ();
    }

    public EYQ(Context context, UB ub, AdSlot adSlot) {
        this.mZx = context;
        this.Td = ub;
        this.Pm = adSlot;
        EYQ(context, ub, adSlot);
        this.VwS = false;
        this.WU = false;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.hu) {
            return;
        }
        tPj.EYQ(this.Td, d);
        this.hu = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.UB) {
            return;
        }
        tPj.EYQ(this.Td, d, str, str2);
        this.UB = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        UB ub = this.Td;
        if (ub != null) {
            return ub.Hnh();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        com.bytedance.sdk.openadsdk.core.bannerexpress.mZx mzx = new com.bytedance.sdk.openadsdk.core.bannerexpress.mZx(pAGBannerAdInteractionCallback);
        this.QQ = mzx;
        this.EYQ.setExpressInteractionListener(mzx);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        com.bytedance.sdk.openadsdk.core.bannerexpress.mZx mzx = new com.bytedance.sdk.openadsdk.core.bannerexpress.mZx(pAGBannerAdInteractionListener);
        this.QQ = mzx;
        this.EYQ.setExpressInteractionListener(mzx);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        com.bytedance.sdk.openadsdk.utils.mZx.EYQ(this.Td);
        return this.EYQ;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        BannerExpressView bannerExpressView = this.EYQ;
        if (bannerExpressView != null) {
            try {
                bannerExpressView.Td();
                this.EYQ.removeOnAttachStateChangeListener(this.IPb);
            } catch (Throwable unused) {
            }
        }
        Kbd();
    }

    public void EYQ(Context context, UB ub, AdSlot adSlot) {
        BannerExpressView bannerExpressView = new BannerExpressView(context, ub, adSlot);
        this.EYQ = bannerExpressView;
        bannerExpressView.addOnAttachStateChangeListener(this.IPb);
    }

    protected void EYQ(final NativeExpressView nativeExpressView, final UB ub) {
        final EmptyView emptyView;
        if (nativeExpressView == null || ub == null) {
            return;
        }
        this.Td = ub;
        this.tsL = EYQ(ub);
        this.hYh = nativeExpressView;
        final String strEYQ = hYh.EYQ();
        final InterfaceC0117EYQ interfaceC0117EYQEYQ = EYQ();
        nativeExpressView.setClosedListenerKey(strEYQ);
        nativeExpressView.setBannerClickClosedListener(interfaceC0117EYQEYQ);
        nativeExpressView.setBackupListener(new com.bytedance.sdk.component.adexpress.mZx.Td() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ.2
            @Override // com.bytedance.sdk.component.adexpress.mZx.Td
            public boolean EYQ(ViewGroup viewGroup, int i) {
                try {
                    nativeExpressView.tsL();
                    if (EYQ.this.Td.oIw()) {
                        VastBannerBackupView vastBannerBackupView = new VastBannerBackupView(nativeExpressView.getContext());
                        vastBannerBackupView.setClosedListenerKey(strEYQ);
                        vastBannerBackupView.EYQ(EYQ.this.Td, nativeExpressView, EYQ.this.tsL);
                        vastBannerBackupView.setDislikeInner(EYQ.this.MxO);
                        vastBannerBackupView.setDislikeOuter(EYQ.this.Kbd);
                        vastBannerBackupView.setAdInteractionListener(EYQ.this.QQ);
                        nativeExpressView.setVastVideoHelper(vastBannerBackupView);
                        return true;
                    }
                    BannerExpressBackupView bannerExpressBackupView = new BannerExpressBackupView(nativeExpressView.getContext());
                    bannerExpressBackupView.setClosedListenerKey(strEYQ);
                    bannerExpressBackupView.EYQ(EYQ.this.Td, nativeExpressView, EYQ.this.tsL);
                    bannerExpressBackupView.setDislikeInner(EYQ.this.MxO);
                    bannerExpressBackupView.setDislikeOuter(EYQ.this.Kbd);
                    bannerExpressBackupView.setAdInteractionListener(EYQ.this.QQ);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (!this.VwS) {
            EmptyView emptyViewEYQ = EYQ(nativeExpressView);
            if (emptyViewEYQ == null) {
                emptyViewEYQ = new EmptyView(this.mZx, nativeExpressView);
                nativeExpressView.addView(emptyViewEYQ);
            }
            emptyView = emptyViewEYQ;
            emptyView.setCallback(new EmptyView.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ.3
                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.EYQ
                public void EYQ(boolean z) {
                    EYQ.this.EYQ(z, ub);
                }

                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.EYQ
                public void EYQ() {
                    EYQ.this.Td();
                }

                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.EYQ
                public void mZx() {
                    EYQ.this.EYQ(emptyView, false, ub);
                }

                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.EYQ
                public void EYQ(View view) throws JSONException {
                    if (EYQ.this.zF.compareAndSet(false, true)) {
                        EYQ.this.EYQ(view, nativeExpressView, ub, strEYQ, interfaceC0117EYQEYQ);
                    }
                }
            });
        } else {
            Tnp.EYQ(nativeExpressView, true, 1, new Tnp.mZx() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ.4
                @Override // com.bytedance.sdk.openadsdk.utils.Tnp.mZx
                public void EYQ(boolean z) {
                    EYQ.this.EYQ(z, ub);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.Tnp.mZx
                public void EYQ() {
                    EYQ.this.Td();
                }

                @Override // com.bytedance.sdk.openadsdk.utils.Tnp.mZx
                public void mZx() {
                    EYQ.this.EYQ((EmptyView) null, true, ub);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.Tnp.mZx
                public void EYQ(View view, boolean z) throws JSONException {
                    if (z && EYQ.this.zF.compareAndSet(false, true)) {
                        EYQ.this.EYQ(view, nativeExpressView, ub, strEYQ, interfaceC0117EYQEYQ);
                    }
                }
            }, null);
            emptyView = null;
        }
        Context contextEYQ = nativeExpressView != null ? com.bytedance.sdk.component.utils.mZx.EYQ(nativeExpressView) : null;
        if (contextEYQ == null) {
            contextEYQ = this.mZx;
        }
        VwS vwS = new VwS(contextEYQ, ub, this.Uc, 2);
        vwS.EYQ(nativeExpressView);
        vwS.EYQ(this);
        vwS.EYQ(this.tsL);
        nativeExpressView.setClickListener(vwS);
        IPb iPb = new IPb(this.mZx, ub, this.Uc, 2);
        iPb.EYQ((View) nativeExpressView);
        iPb.EYQ(this);
        NativeExpressView nativeExpressView2 = this.hYh;
        if (nativeExpressView2 instanceof NativeExpressVideoView) {
            iPb.EYQ(((NativeExpressVideoView) nativeExpressView2).getVideoController());
        }
        iPb.EYQ(this.tsL);
        nativeExpressView.setClickCreativeListener(iPb);
        if (this.VwS) {
            return;
        }
        emptyView.setNeedCheckingShow(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(boolean z, UB ub) {
        if (z) {
            if (this.Td.lv() && !this.Td.zAe()) {
                this.Td.VwS(true);
                UB ub2 = this.Td;
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub2, this.Uc, ub2.Hrh());
            }
            IPb();
        } else {
            Kbd();
        }
        xt.mZx(new mZx(z, ub, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td() {
        mZx();
        IPb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(EmptyView emptyView, boolean z, UB ub) {
        BannerExpressView bannerExpressView = this.EYQ;
        if (bannerExpressView != null && ((!z && emptyView != null && emptyView == EYQ(bannerExpressView.getCurView())) || z)) {
            Kbd();
        }
        mZx(ub);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(View view, NativeExpressView nativeExpressView, UB ub, String str, InterfaceC0117EYQ interfaceC0117EYQ) throws JSONException {
        QQ.mZx().EYQ(str, interfaceC0117EYQ);
        Queue<Long> queue = this.KO;
        if (queue != null) {
            queue.offer(Long.valueOf(System.currentTimeMillis()));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (nativeExpressView != null) {
                jSONObject.put("dynamic_show_type", nativeExpressView.getDynamicShowType());
                nativeExpressView.EYQ(jSONObject, ub);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("width", view.getWidth());
                    jSONObject2.put("height", view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, this.Uc, jSONObject);
        } catch (JSONException unused2) {
            pi.EYQ("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.QQ;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, ub.Pf());
        }
        if (ub.eFB()) {
            FH.EYQ(ub, view);
        }
        IPb();
        BannerExpressView bannerExpressView = this.EYQ;
        if (bannerExpressView == null || bannerExpressView.getCurView() == null) {
            return;
        }
        this.EYQ.getCurView().tp();
        this.EYQ.getCurView().QQ();
    }

    private com.com.bytedance.overseas.sdk.EYQ.Td EYQ(UB ub) {
        if (ub.Pf() == 4) {
            return Pm.EYQ(this.mZx, ub, this.Uc);
        }
        return null;
    }

    /* compiled from: PAGBannerAdImpl.java */
    private static class mZx extends com.bytedance.sdk.component.VwS.QQ {
        boolean EYQ;
        WeakReference<EYQ> Td;
        UB mZx;

        mZx(boolean z, UB ub, EYQ eyq) {
            super("ReportWindowFocusChangedAdShow");
            this.EYQ = z;
            this.mZx = ub;
            this.Td = new WeakReference<>(eyq);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<EYQ> weakReference = this.Td;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.Td.get().mZx(this.EYQ, this.mZx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(boolean z, UB ub) {
        Long lPoll;
        try {
            if (z) {
                this.KO.offer(Long.valueOf(System.currentTimeMillis()));
            } else {
                if (this.KO.size() <= 0 || this.hYh == null || (lPoll = this.KO.poll()) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(String.valueOf(System.currentTimeMillis() - lPoll.longValue()), ub, this.Uc, this.hYh.getAdShowTime());
            }
        } catch (Exception e) {
            pi.EYQ("PAGBannerAdImpl", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EmptyView EYQ(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            try {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof EmptyView) {
                    return (EmptyView) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private void mZx(UB ub) {
        Queue<Long> queue = this.KO;
        if (queue == null || queue.size() <= 0 || ub == null) {
            return;
        }
        try {
            long jLongValue = this.KO.poll().longValue();
            if (jLongValue <= 0 || this.hYh == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(String.valueOf(System.currentTimeMillis() - jLongValue), ub, this.Uc, this.hYh.getAdShowTime());
        } catch (Exception e) {
            pi.EYQ("PAGBannerAdImpl", e.getMessage());
        }
    }

    public InterfaceC0117EYQ EYQ() {
        return new InterfaceC0117EYQ() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ.5
            @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ.InterfaceC0117EYQ
            public void EYQ() {
                EmptyView emptyViewEYQ;
                int width = EYQ.this.hYh.getWidth();
                int height = EYQ.this.hYh.getHeight();
                View viewEYQ = EYQ(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                EYQ.this.hYh.nWX();
                if (EYQ.this.VwS) {
                    emptyViewEYQ = null;
                } else {
                    EYQ eyq = EYQ.this;
                    emptyViewEYQ = eyq.EYQ(eyq.hYh);
                }
                EYQ.this.hYh.removeAllViews();
                EYQ.this.hYh.addView(viewEYQ, new ViewGroup.LayoutParams(width, height));
                EYQ.this.hYh.setClickCreativeListener(null);
                EYQ.this.hYh.setClickListener(null);
                if (hu.Pm().tr() == 1) {
                    EYQ.this.Kbd();
                } else if (EYQ.this.HX != 0 && !EYQ.this.VwS && emptyViewEYQ != null) {
                    EYQ.this.hYh.addView(emptyViewEYQ);
                }
                if (EYQ.this.QQ != null) {
                    EYQ.this.QQ.onAdDismissed();
                }
                EYQ.this.WU = true;
            }

            private View EYQ(boolean z) {
                PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(EYQ.this.mZx);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                pAGFrameLayout.setBackgroundColor(-1);
                pAGFrameLayout.setLayoutParams(layoutParams);
                View view = new View(EYQ.this.mZx);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                pAGFrameLayout.addView(view, layoutParams2);
                PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(EYQ.this.mZx);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z) {
                    pAGFrameLayout2.setBackground(zF.Td(EYQ.this.mZx, "tt_ad_closed_background_300_250"));
                } else {
                    pAGFrameLayout2.setBackground(zF.Td(EYQ.this.mZx, "tt_ad_closed_background_320_50"));
                }
                pAGFrameLayout.addView(pAGFrameLayout2, layoutParams3);
                PAGImageView pAGImageView = new PAGImageView(EYQ.this.mZx);
                pAGImageView.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z) {
                    int iMZx = tr.mZx(EYQ.this.mZx, 16.0f);
                    layoutParams4.width = tr.mZx(EYQ.this.mZx, 77.0f);
                    layoutParams4.height = tr.mZx(EYQ.this.mZx, 14.0f);
                    layoutParams4.leftMargin = iMZx;
                    layoutParams4.topMargin = iMZx;
                } else {
                    int iMZx2 = tr.mZx(EYQ.this.mZx, 8.0f);
                    layoutParams4.width = tr.mZx(EYQ.this.mZx, 45.0f);
                    layoutParams4.height = tr.mZx(EYQ.this.mZx, 8.18f);
                    layoutParams4.leftMargin = iMZx2;
                    layoutParams4.topMargin = iMZx2;
                }
                pAGImageView.setImageResource(zF.Pm(EYQ.this.mZx, "tt_ad_closed_logo_red"));
                pAGFrameLayout2.addView(pAGImageView, layoutParams4);
                PAGTextView pAGTextView = new PAGTextView(EYQ.this.mZx);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                pAGTextView.setAlpha(0.5f);
                pAGTextView.setLines(1);
                pAGTextView.setText(zF.EYQ(EYQ.this.mZx, "tt_ad_is_closed"));
                if (z) {
                    pAGTextView.setTextSize(18.0f);
                } else {
                    pAGTextView.setTextSize(12.0f);
                }
                pAGFrameLayout2.addView(pAGTextView, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ.5.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.EYQ(EYQ.this.mZx, EYQ.this.Td, EYQ.this.Uc);
                    }
                };
                pAGImageView.setOnClickListener(onClickListener);
                pAGTextView.setOnClickListener(onClickListener);
                return pAGFrameLayout;
            }
        };
    }

    @Override // com.bytedance.sdk.component.utils.wBa.EYQ
    public void EYQ(Message message) {
        if (message.what == 112202) {
            if (rfB.EYQ(this.EYQ, 50, 1)) {
                this.tp += 1000;
            }
            if (this.tp >= this.HX) {
                Pm();
                AdSlot adSlot = this.Pm;
                adSlot.setRotateOrder(adSlot.getRotateOrder() + 1);
                this.tp = 0;
                Kbd();
                return;
            }
            IPb();
        }
    }

    private void Pm() {
        Kbd.EYQ(this.mZx).EYQ(this.Pm, 1, null, new Kbd.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ.6
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.Kbd.EYQ
            public void EYQ(List<UB> list) {
                if (list == null || list.isEmpty()) {
                    EYQ.this.IPb();
                    return;
                }
                UB ub = list.get(0);
                EYQ.this.EYQ.EYQ(ub, EYQ.this.Pm);
                EYQ.this.Td(ub);
                EYQ.this.EYQ.Pm();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.Kbd.EYQ
            public void EYQ() {
                EYQ.this.IPb();
            }
        }, 5000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td(UB ub) {
        if (this.EYQ.getNextView() == null || !this.EYQ.IPb()) {
            return;
        }
        mZx(this.EYQ.getNextView(), ub);
        EYQ(this.EYQ.getNextView(), ub);
    }

    private void mZx(NativeExpressView nativeExpressView, UB ub) {
        if (nativeExpressView == null || ub == null) {
            return;
        }
        if (this.nWX != null) {
            this.MxO.EYQ(ub.GfQ(), ub.VEW());
            nativeExpressView.setDislike(this.MxO);
        }
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.Kbd;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.setMaterialMeta(ub.GfQ(), ub.VEW());
            nativeExpressView.setOuterDislike(this.Kbd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Kbd() {
        wBa wba = this.pi;
        if (wba != null) {
            wba.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IPb() {
        wBa wba = this.pi;
        if (wba != null) {
            wba.removeCallbacksAndMessages(null);
            this.pi.sendEmptyMessageDelayed(112202, 1000L);
        }
    }

    public void mZx() {
        this.Td.EYQ(SystemClock.elapsedRealtime());
        this.EYQ.mZx();
    }
}
