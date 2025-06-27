package com.bytedance.sdk.openadsdk.apiImpl.feed;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.KO;
import com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.hYh;
import com.bytedance.sdk.openadsdk.utils.tPj;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: TTNativeAdImpl.java */
/* loaded from: classes2.dex */
public class QQ extends PAGNativeAd {
    protected KO EYQ;
    private boolean HX;
    protected int IPb;
    protected int Kbd;
    protected EYQ Pm;
    private boolean QQ;
    protected final Context Td;
    protected String VwS;
    protected final UB mZx;

    private String EYQ(int i) {
        return i != 1 ? i != 2 ? "embeded_ad" : "interaction" : "banner_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    public QQ(Context context, UB ub, int i, boolean z) {
        if (ub == null) {
            pi.mZx("materialMeta can't been null");
        }
        this.mZx = ub;
        this.Td = context;
        this.Kbd = i;
        this.IPb = ub.yK();
        String strTd = FH.Td(i);
        this.VwS = strTd;
        if (z) {
            this.Pm = new EYQ(context, ub, strTd);
            this.EYQ = new KO(context, this, ub, EYQ(i), this.Pm);
        }
    }

    private List<View> EYQ(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                linkedList.add(list.get(i));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedList.add(list2.get(i2));
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        UB ub = this.mZx;
        if (ub != null) {
            return ub.Hnh();
        }
        return null;
    }

    protected boolean VwS() {
        UB ub = this.mZx;
        return (ub == null || ub.Pf() == 5 || hu.Pm().Td(this.IPb) != 1) ? false : true;
    }

    protected void EYQ(String str) {
        this.VwS = str;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.QQ) {
            return;
        }
        tPj.EYQ(this.mZx, d);
        this.QQ = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.HX) {
            return;
        }
        tPj.EYQ(this.mZx, d, str, str2);
        this.HX = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null) {
            pi.mZx("container can't been null");
            return;
        }
        if (list == null) {
            pi.mZx("clickView can't been null");
        } else if (list.size() <= 0) {
            pi.mZx("clickViews size must been more than 1");
        } else {
            EYQ(viewGroup, null, list, list2, view, new VwS(pAGNativeAdInteractionListener));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    public void EYQ(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, final IPb iPb) {
        if (viewGroup == null) {
            pi.mZx("container can't been null");
            return;
        }
        if (list2 == null) {
            pi.mZx("clickView can't been null");
            return;
        }
        if (list2.size() <= 0) {
            pi.mZx("clickViews size must been more than 1");
            return;
        }
        if (VwS()) {
            list3 = EYQ(list2, list3);
        }
        List<View> list4 = list3;
        if (view != null && iPb != null && iPb.mZx()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.QQ.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    final String strEYQ = hYh.EYQ();
                    TTDelegateActivity.EYQ(QQ.this.mZx, strEYQ, new EYQ.InterfaceC0117EYQ() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.QQ.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ.InterfaceC0117EYQ
                        public void EYQ() {
                            iPb.EYQ();
                            com.bytedance.sdk.openadsdk.core.QQ.mZx().Pm(strEYQ);
                            PAGMediaView pAGMediaViewEYQ = QQ.this.QQ().EYQ();
                            if (pAGMediaViewEYQ != null) {
                                pAGMediaViewEYQ.close();
                            }
                        }
                    });
                }
            });
        }
        this.EYQ.EYQ(viewGroup, list, list2, list4, view, iPb);
        com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(viewGroup, this.mZx, -1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new Pm(QQ());
    }

    public EYQ QQ() {
        return this.Pm;
    }
}
