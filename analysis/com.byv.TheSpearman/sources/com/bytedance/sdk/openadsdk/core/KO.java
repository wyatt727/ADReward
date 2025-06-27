package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.mZx.mZx;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.Tnp;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InteractionManager.java */
/* loaded from: classes2.dex */
public class KO {
    private final com.bytedance.sdk.openadsdk.core.model.UB EYQ;
    private final String IPb;
    private com.bykv.vk.openvk.component.video.api.Pm.Td MxO;
    private final PAGNativeAd Pm;
    private long QQ;
    private final Context Td;
    private com.bytedance.sdk.openadsdk.apiImpl.feed.IPb VwS;
    private com.com.bytedance.overseas.sdk.EYQ.Td mZx;
    private com.bytedance.sdk.openadsdk.core.mZx.EYQ nWX;
    private com.bytedance.sdk.openadsdk.core.mZx.mZx pi;
    private final com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ tp;
    private List<View> Kbd = new ArrayList();
    private final com.bytedance.sdk.openadsdk.mZx.VwS HX = new com.bytedance.sdk.openadsdk.mZx.VwS();
    private final AtomicBoolean tsL = new AtomicBoolean(false);

    public com.bytedance.sdk.openadsdk.mZx.VwS EYQ() {
        return this.HX;
    }

    public KO(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.UB ub, String str, com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ eyq) {
        this.Pm = pAGNativeAd;
        this.EYQ = ub;
        this.Td = context;
        this.IPb = str;
        this.tp = eyq;
        if (ub.Pf() == 4) {
            this.mZx = com.com.bytedance.overseas.sdk.EYQ.Pm.EYQ(context, ub, str);
        }
    }

    public void EYQ(View view, int i) {
        com.bytedance.sdk.openadsdk.apiImpl.feed.IPb iPb = this.VwS;
        if (iPb != null) {
            iPb.onAdClicked();
        }
    }

    public void EYQ(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, com.bytedance.sdk.openadsdk.apiImpl.feed.IPb iPb) {
        if (Build.VERSION.SDK_INT < 18) {
            EmptyView emptyViewMZx = mZx(viewGroup, list, list2, list3, iPb);
            EYQ(viewGroup, view);
            EYQ(viewGroup, emptyViewMZx, list2, list3);
            emptyViewMZx.setNeedCheckingShow(true);
            return;
        }
        EYQ(viewGroup, list, list2, list3, iPb);
        EYQ(viewGroup, view);
        EYQ(viewGroup, list2, list3);
    }

    private void EYQ(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.apiImpl.feed.IPb iPb) {
        this.VwS = iPb;
        viewGroup.addOnLayoutChangeListener(new EYQ(this.HX, viewGroup));
        this.Kbd = list;
        EYQ(list2, (com.bytedance.sdk.openadsdk.core.mZx.Td) null);
        if (list != null) {
            for (View view : this.Kbd) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        EYQ(list3, (com.bytedance.sdk.openadsdk.core.mZx.Td) null);
    }

    private void EYQ(List<View> list, com.bytedance.sdk.openadsdk.core.mZx.Td td) {
        if (com.bytedance.sdk.component.utils.MxO.mZx(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(td);
                    view.setOnTouchListener(td);
                }
            }
        }
    }

    private EmptyView mZx(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.apiImpl.feed.IPb iPb) {
        this.VwS = iPb;
        viewGroup.addOnLayoutChangeListener(new EYQ(this.HX, viewGroup));
        this.Kbd = list;
        EmptyView emptyViewPm = Pm(viewGroup);
        if (emptyViewPm == null) {
            emptyViewPm = new EmptyView(this.Td, viewGroup);
            viewGroup.addView(emptyViewPm);
        }
        emptyViewPm.EYQ();
        emptyViewPm.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.Kbd) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        emptyViewPm.setRefCreativeViews(list3);
        return emptyViewPm;
    }

    public void EYQ(com.bykv.vk.openvk.component.video.api.Pm.Td td) {
        this.MxO = td;
        com.bytedance.sdk.openadsdk.core.mZx.mZx mzx = this.pi;
        if (mzx != null) {
            mzx.EYQ(td);
        }
        com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq = this.nWX;
        if (eyq != null) {
            eyq.EYQ(td);
        }
    }

    /* compiled from: InteractionManager.java */
    private static class EYQ implements View.OnLayoutChangeListener {
        private final com.bytedance.sdk.openadsdk.mZx.VwS EYQ;
        private final ViewGroup mZx;

        public EYQ(com.bytedance.sdk.openadsdk.mZx.VwS vwS, ViewGroup viewGroup) {
            this.EYQ = vwS;
            this.mZx = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.EYQ.EYQ(System.currentTimeMillis(), rfB.EYQ(this.mZx));
        }
    }

    private void EYQ(ViewGroup viewGroup, View view) {
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        Context contextEYQ = viewGroup != null ? com.bytedance.sdk.component.utils.mZx.EYQ(viewGroup) : null;
        if (contextEYQ == null) {
            contextEYQ = this.Td;
        }
        if (this.EYQ.zF() == 2) {
            com.bytedance.sdk.openadsdk.core.model.UB ub = this.EYQ;
            String str = this.IPb;
            this.pi = new com.bytedance.sdk.openadsdk.core.nativeexpress.VwS(contextEYQ, ub, str, FH.EYQ(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.UB ub2 = this.EYQ;
            String str2 = this.IPb;
            this.pi = new com.bytedance.sdk.openadsdk.core.mZx.mZx(contextEYQ, ub2, str2, FH.EYQ(str2));
        }
        this.pi.EYQ(viewGroup);
        this.pi.EYQ(this.MxO);
        this.pi.mZx(view);
        this.pi.EYQ(this.mZx);
        this.pi.EYQ(this.Pm);
        this.pi.EYQ(map);
        this.pi.EYQ(new mZx.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.KO.1
            @Override // com.bytedance.sdk.openadsdk.core.mZx.mZx.EYQ
            public void EYQ(View view2, int i) {
                if (KO.this.VwS != null) {
                    KO.this.VwS.onAdClicked();
                }
            }
        });
        if (this.EYQ.zF() == 2) {
            Context context = this.Td;
            com.bytedance.sdk.openadsdk.core.model.UB ub3 = this.EYQ;
            String str3 = this.IPb;
            this.nWX = new com.bytedance.sdk.openadsdk.core.nativeexpress.IPb(context, ub3, str3, FH.EYQ(str3));
        } else {
            Context context2 = this.Td;
            com.bytedance.sdk.openadsdk.core.model.UB ub4 = this.EYQ;
            String str4 = this.IPb;
            this.nWX = new com.bytedance.sdk.openadsdk.core.mZx.EYQ(context2, ub4, str4, FH.EYQ(str4));
        }
        this.nWX.EYQ(viewGroup);
        this.nWX.EYQ(this.MxO);
        this.nWX.mZx(view);
        this.nWX.EYQ(this.mZx);
        this.nWX.EYQ(this.Pm);
        this.nWX.EYQ(map);
        this.nWX.EYQ(new mZx.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.KO.2
            @Override // com.bytedance.sdk.openadsdk.core.mZx.mZx.EYQ
            public void EYQ(View view2, int i) {
                if (KO.this.VwS != null) {
                    KO.this.VwS.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(KO.this.EYQ, 9);
                KO.this.tp.pi();
            }
        });
    }

    private void EYQ(ViewGroup viewGroup, EmptyView emptyView, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.mZx.mZx mzx = this.pi;
        if (mzx == null || this.nWX == null) {
            return;
        }
        emptyView.EYQ(list, mzx);
        emptyView.EYQ(list2, this.nWX);
        EYQ(this.pi, this.nWX);
        EYQ(emptyView, viewGroup);
    }

    private void EYQ(ViewGroup viewGroup, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.mZx.mZx mzx = this.pi;
        if (mzx == null || this.nWX == null) {
            return;
        }
        EYQ(list, mzx);
        EYQ(list2, this.nWX);
        EYQ(this.pi, this.nWX);
        EYQ(viewGroup);
    }

    private void EYQ(com.bytedance.sdk.openadsdk.core.mZx.mZx mzx, com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq) {
        if (this.EYQ.zF() == 2) {
            mZx(mzx, eyq);
        } else {
            EYQ(eyq);
        }
    }

    private void mZx(com.bytedance.sdk.openadsdk.core.mZx.mZx mzx, com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq) {
        com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ eyq2 = this.tp;
        if (eyq2 != null && eyq2.mZx() != null) {
            NativeExpressView nativeExpressViewMZx = this.tp.mZx();
            if ((mzx instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.VwS) && (eyq instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.IPb)) {
                nativeExpressViewMZx.setClickListener((com.bytedance.sdk.openadsdk.core.nativeexpress.VwS) mzx);
                nativeExpressViewMZx.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.nativeexpress.IPb) eyq);
            }
            nativeExpressViewMZx.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.mZx() { // from class: com.bytedance.sdk.openadsdk.core.KO.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.mZx
                public void EYQ() {
                    KO.this.VwS.onAdClicked();
                }
            });
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ eyq3 = this.tp;
        if (eyq3 != null && eyq3.EYQ() != null) {
            this.tp.EYQ().setOnClickListener(eyq);
            this.tp.EYQ().setOnTouchListener(eyq);
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ eyq4 = this.tp;
        if (eyq4 != null) {
            eyq4.EYQ(eyq);
            this.tp.EYQ(mzx);
        }
    }

    private void EYQ(com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq) {
        if (com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().Pm(String.valueOf(this.EYQ.yK()))) {
            com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ eyq2 = this.tp;
            if (eyq2 != null && eyq2.EYQ() != null) {
                this.tp.EYQ().setOnClickListener(eyq);
                this.tp.EYQ().setOnTouchListener(eyq);
            }
            com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ eyq3 = this.tp;
            if (eyq3 != null) {
                eyq3.EYQ(eyq);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ eyq4 = this.tp;
        if (eyq4 != null && eyq4.EYQ() != null) {
            PAGMediaView pAGMediaViewEYQ = this.tp.EYQ();
            com.bytedance.sdk.openadsdk.core.mZx.Td td = new com.bytedance.sdk.openadsdk.core.mZx.Td() { // from class: com.bytedance.sdk.openadsdk.core.KO.4
                @Override // com.bytedance.sdk.openadsdk.core.mZx.Td
                protected void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, boolean z) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            pAGMediaViewEYQ.setOnClickListener(td);
            pAGMediaViewEYQ.setOnTouchListener(td);
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ eyq5 = this.tp;
        if (eyq5 != null) {
            eyq5.EYQ((com.bytedance.sdk.openadsdk.core.mZx.EYQ) null);
        }
    }

    private void EYQ(EmptyView emptyView, final ViewGroup viewGroup) {
        emptyView.setCallback(new EmptyView.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.KO.5
            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.EYQ
            public void EYQ(boolean z) {
                KO.this.EYQ(z, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.EYQ
            public void EYQ() {
                KO.this.mZx(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.EYQ
            public void mZx() {
                KO.this.mZx();
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.EYQ
            @JProtect
            public void EYQ(View view) throws JSONException {
                KO.this.mZx(viewGroup, view);
            }
        });
    }

    private void EYQ(final ViewGroup viewGroup) {
        Tnp.EYQ(viewGroup, true, 5, new Tnp.mZx() { // from class: com.bytedance.sdk.openadsdk.core.KO.6
            @Override // com.bytedance.sdk.openadsdk.utils.Tnp.mZx
            public void EYQ(boolean z) {
                KO.this.EYQ(z, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.Tnp.mZx
            public void EYQ() {
                KO.this.mZx(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.Tnp.mZx
            public void mZx() {
                KO.this.mZx();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.Tnp.mZx
            public void EYQ(View view, boolean z) throws JSONException {
                if (z) {
                    KO.this.mZx(viewGroup, view);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(boolean z, ViewGroup viewGroup) {
        if (z && this.EYQ.lv() && !this.EYQ.zAe()) {
            this.EYQ.VwS(true);
            com.bytedance.sdk.openadsdk.core.model.UB ub = this.EYQ;
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, this.IPb, ub.Hrh());
        }
        if (!z && this.QQ > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.QQ);
            this.HX.EYQ(System.currentTimeMillis(), rfB.EYQ(viewGroup));
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(strValueOf, this.EYQ, this.IPb, this.HX);
            this.QQ = 0L;
            return;
        }
        this.HX.EYQ(System.currentTimeMillis(), rfB.EYQ(viewGroup));
        this.QQ = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(ViewGroup viewGroup) {
        this.HX.EYQ(System.currentTimeMillis(), rfB.EYQ(viewGroup));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx() {
        if (this.QQ > 0) {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(String.valueOf(SystemClock.elapsedRealtime() - this.QQ), this.EYQ, this.IPb, this.HX);
            this.QQ = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(ViewGroup viewGroup, View view) throws JSONException {
        if (this.tsL.get()) {
            return;
        }
        this.tsL.set(true);
        if (this.Pm instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.mZx) {
            NativeExpressView nativeExpressViewMZx = this.tp.mZx();
            if (nativeExpressViewMZx != null) {
                nativeExpressViewMZx.QQ();
            }
            ((com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.mZx) this.Pm).EYQ(true);
        }
        this.HX.EYQ(System.currentTimeMillis(), rfB.EYQ(viewGroup));
        this.QQ = SystemClock.elapsedRealtime();
        Td(viewGroup);
        com.bytedance.sdk.openadsdk.apiImpl.feed.IPb iPb = this.VwS;
        if (iPb != null) {
            iPb.EYQ(this.Pm);
        }
        if (this.EYQ.eFB()) {
            FH.EYQ(this.EYQ, view);
        }
        if (this.EYQ.zzY() != null) {
            this.EYQ.zzY().EYQ().EYQ(0L);
        }
    }

    private void Td(ViewGroup viewGroup) throws JSONException {
        com.bytedance.sdk.openadsdk.core.model.UB ub;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.Kbd != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : this.Kbd) {
                    if (view != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("width", view.getWidth());
                            jSONObject2.put("height", view.getHeight());
                            jSONObject2.put("alpha", view.getAlpha());
                        } catch (Throwable unused) {
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("image_view", jSONArray.toString());
            }
            if (viewGroup != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("width", viewGroup.getWidth());
                    jSONObject3.put("height", viewGroup.getHeight());
                    jSONObject3.put("alpha", viewGroup.getAlpha());
                } catch (Throwable unused2) {
                }
                jSONObject.put("root_view", jSONObject3.toString());
            }
            if (this.tp.QQ() != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("width", tr.Td(this.Td, r11.getWidth()) * 1.0f);
                    jSONObject4.put("height", tr.Td(this.Td, r11.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            NativeExpressView nativeExpressViewMZx = this.tp.mZx();
            if (nativeExpressViewMZx != null && (ub = this.EYQ) != null) {
                jSONObject.put("dynamic_show_type", ub.NZ());
                nativeExpressViewMZx.EYQ(jSONObject, this.EYQ);
            }
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.EYQ, this.IPb, jSONObject);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.pi.EYQ("InteractionManager", "onShowFun json error", e);
        }
    }

    private EmptyView Pm(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof EmptyView) {
                return (EmptyView) childAt;
            }
        }
        return null;
    }
}
