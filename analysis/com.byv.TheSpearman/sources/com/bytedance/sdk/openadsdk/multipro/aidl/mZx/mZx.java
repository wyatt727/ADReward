package com.bytedance.sdk.openadsdk.multipro.aidl.mZx;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: DislikeClosedListenerImpl.java */
/* loaded from: classes2.dex */
public class mZx extends IDislikeClosedListener.Stub {
    private final EYQ.InterfaceC0117EYQ EYQ;
    private final String mZx;

    public mZx(String str, EYQ.InterfaceC0117EYQ interfaceC0117EYQ) {
        this.mZx = str;
        this.EYQ = interfaceC0117EYQ;
    }

    @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
    public void onItemClickClosed() throws RemoteException {
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.mZx.mZx.1
            @Override // java.lang.Runnable
            public void run() {
                if (mZx.this.EYQ != null) {
                    mZx.this.EYQ.EYQ();
                    TTDislikeListView.EYQ(6, mZx.this.mZx);
                }
            }
        });
    }
}
