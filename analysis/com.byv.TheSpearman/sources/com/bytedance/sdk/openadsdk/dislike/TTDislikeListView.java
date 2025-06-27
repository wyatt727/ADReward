package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class TTDislikeListView extends ListView {
    protected IListenerManager EYQ;
    private final AdapterView.OnItemClickListener Kbd;
    private String Pm;
    private String Td;
    private AdapterView.OnItemClickListener mZx;

    public TTDislikeListView(Context context) {
        super(context);
        this.Kbd = new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (TTDislikeListView.this.getAdapter() != null && TTDislikeListView.this.getAdapter().getItem(i) != null && (TTDislikeListView.this.getAdapter().getItem(i) instanceof FilterWord)) {
                    FilterWord filterWord = (FilterWord) TTDislikeListView.this.getAdapter().getItem(i);
                    if (!filterWord.hasSecondOptions()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(filterWord);
                        if (!TextUtils.isEmpty(TTDislikeListView.this.Td)) {
                            EYQ.EYQ().EYQ(TTDislikeListView.this.Td, arrayList);
                        }
                        if (!TextUtils.isEmpty(TTDislikeListView.this.Pm)) {
                            if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                                TTDislikeListView.this.EYQ("onItemClickClosed");
                            } else {
                                EYQ.InterfaceC0117EYQ interfaceC0117EYQTd = QQ.mZx().Td(TTDislikeListView.this.Pm);
                                if (interfaceC0117EYQTd != null) {
                                    interfaceC0117EYQTd.EYQ();
                                    QQ.mZx().Pm(TTDislikeListView.this.Pm);
                                }
                            }
                        }
                    }
                    try {
                        if (TTDislikeListView.this.mZx != null) {
                            TTDislikeListView.this.mZx.onItemClick(adapterView, view, i, j);
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                throw new IllegalArgumentException("Adapter data is abnormal, it must be FilterWord");
            }
        };
        EYQ();
    }

    public void setMaterialMeta(String str) {
        this.Td = str;
    }

    private void EYQ() {
        super.setOnItemClickListener(this.Kbd);
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.mZx = onItemClickListener;
    }

    public void setClosedListenerKey(String str) {
        this.Pm = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final String str) {
        xt.Td(new com.bytedance.sdk.component.VwS.QQ("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TextUtils.isEmpty(TTDislikeListView.this.Pm)) {
                        return;
                    }
                    TTDislikeListView.this.EYQ(6).executeDisLikeClosedCallback(TTDislikeListView.this.Pm, str);
                } catch (Throwable th) {
                    pi.EYQ("TTDislikeListView", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    protected IListenerManager EYQ(int i) {
        if (this.EYQ == null) {
            this.EYQ = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ().EYQ(i));
        }
        return this.EYQ;
    }

    public static void EYQ(final int i, final String str, final EYQ.InterfaceC0117EYQ interfaceC0117EYQ) {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            xt.Td(new com.bytedance.sdk.component.VwS.QQ("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.EYQ EYQ = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ();
                    if (i != 6 || interfaceC0117EYQ == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.multipro.aidl.mZx.mZx mzx = new com.bytedance.sdk.openadsdk.multipro.aidl.mZx.mZx(str, interfaceC0117EYQ);
                        IListenerManager iListenerManagerAsInterface = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.Pm.asInterface(EYQ.EYQ(6));
                        if (iListenerManagerAsInterface != null) {
                            iListenerManagerAsInterface.registerDisLikeClosedListener(str, mzx);
                        }
                    } catch (RemoteException e) {
                        pi.EYQ("TTDislikeListView", e.getMessage());
                    }
                }
            }, 5);
        }
    }

    public static void EYQ(final int i, final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            xt.Td(new com.bytedance.sdk.component.VwS.QQ("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.4
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.EYQ EYQ = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ();
                    if (i == 6) {
                        try {
                            IListenerManager iListenerManagerAsInterface = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.Pm.asInterface(EYQ.EYQ(6));
                            if (iListenerManagerAsInterface != null) {
                                iListenerManagerAsInterface.unregisterDisLikeClosedListener(str);
                            }
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }, 5);
        }
    }
}
