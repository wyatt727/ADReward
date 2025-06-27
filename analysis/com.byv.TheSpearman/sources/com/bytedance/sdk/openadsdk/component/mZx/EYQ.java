package com.bytedance.sdk.openadsdk.component.mZx;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.Td;
import com.bytedance.sdk.openadsdk.core.UB;
import com.bytedance.sdk.openadsdk.core.VwS;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.hYh;
import com.bytedance.sdk.openadsdk.core.model.mZx;
import com.bytedance.sdk.openadsdk.utils.Nvm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FeedAdManager.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static volatile EYQ EYQ;
    private final UB mZx = hu.Td();

    public static EYQ EYQ() {
        if (EYQ == null) {
            synchronized (EYQ.class) {
                if (EYQ == null) {
                    EYQ = new EYQ();
                }
            }
        }
        return EYQ;
    }

    private EYQ() {
    }

    public void EYQ(final Context context, final AdSlot adSlot, final Td td) {
        final Nvm nvmEYQ = Nvm.EYQ();
        this.mZx.EYQ(adSlot, new hYh(), 5, new UB.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.mZx.EYQ.1
            @Override // com.bytedance.sdk.openadsdk.core.UB.EYQ
            public void EYQ(int i, String str) {
                td.onError(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.UB.EYQ
            public void EYQ(com.bytedance.sdk.openadsdk.core.model.EYQ eyq, mZx mzx) {
                if (eyq.Td() != null && !eyq.Td().isEmpty()) {
                    List<com.bytedance.sdk.openadsdk.core.model.UB> listTd = eyq.Td();
                    ArrayList arrayList = new ArrayList(listTd.size());
                    Iterator<com.bytedance.sdk.openadsdk.core.model.UB> it = listTd.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.bytedance.sdk.openadsdk.core.model.UB next = it.next();
                        if (com.bytedance.sdk.openadsdk.core.model.UB.Kbd(next) || (next != null && next.wG())) {
                            PAGNativeAd pAGNativeAdEYQ = EYQ(context, next, adSlot);
                            if (td instanceof PAGNativeAdLoadListener) {
                                arrayList.add(pAGNativeAdEYQ);
                            }
                        }
                        if (com.bytedance.sdk.openadsdk.core.model.UB.Kbd(next) && next.mN() != null && next.mN().MxO() != null) {
                            if (hu.Pm().Kbd(String.valueOf(next.yK())) && hu.Pm().VOV()) {
                                if (next.mN() != null) {
                                    next.mN().IPb(1);
                                }
                                if (next.oCs() != null) {
                                    next.oCs().IPb(1);
                                }
                                com.bytedance.sdk.openadsdk.core.video.EYQ.mZx mzxEYQ = com.bytedance.sdk.openadsdk.core.model.UB.EYQ(CacheDirFactory.getICacheDir(next.Cia()).Td(), next);
                                mzxEYQ.EYQ("material_meta", next);
                                mzxEYQ.EYQ("ad_slot", adSlot);
                                com.bytedance.sdk.openadsdk.core.video.Pm.EYQ.EYQ(mzxEYQ, null);
                            }
                        }
                    }
                    if ((td instanceof PAGNativeAdLoadListener) && !arrayList.isEmpty()) {
                        AdSlot adSlot2 = adSlot;
                        if (adSlot2 != null && !TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.tp.Td.EYQ(listTd.get(0), nvmEYQ.Td());
                        }
                        Td td2 = td;
                        if (td2 instanceof PAGNativeAdLoadListener) {
                            ((PAGNativeAdLoadListener) td2).onAdLoaded(arrayList.get(0));
                        }
                        if (mzx.Kbd() == null || mzx.Kbd().isEmpty()) {
                            return;
                        }
                        mZx.EYQ(mzx);
                        return;
                    }
                    td.onError(-4, VwS.EYQ(-4));
                    mzx.EYQ(-4);
                    mZx.EYQ(mzx);
                    return;
                }
                td.onError(-3, VwS.EYQ(-3));
                mzx.EYQ(-3);
                mZx.EYQ(mzx);
            }

            private PAGNativeAd EYQ(Context context2, com.bytedance.sdk.openadsdk.core.model.UB ub, AdSlot adSlot2) {
                if (ub.zF() == 2) {
                    if (ub.mN() != null) {
                        return new com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.EYQ(context2, ub, adSlot2);
                    }
                    return new com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.mZx(context2, ub, adSlot2);
                }
                return new com.bytedance.sdk.openadsdk.apiImpl.feed.mZx(context2, ub, 5, adSlot2);
            }
        });
    }
}
