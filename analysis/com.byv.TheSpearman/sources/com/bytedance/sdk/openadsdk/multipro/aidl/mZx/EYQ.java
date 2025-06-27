package com.bytedance.sdk.openadsdk.multipro.aidl.mZx;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: AppOpenAdListenerImpl.java */
/* loaded from: classes2.dex */
public class EYQ extends IAppOpenAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.apiImpl.Td.mZx EYQ;

    public EYQ(com.bytedance.sdk.openadsdk.apiImpl.Td.mZx mzx) {
        this.EYQ = mzx;
    }

    private void EYQ() {
        this.EYQ = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() throws RemoteException {
        EYQ();
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.mZx.EYQ.1
            @Override // java.lang.Runnable
            public void run() {
                if (EYQ.this.EYQ != null) {
                    EYQ.this.EYQ.EYQ();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() throws RemoteException {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.mZx.EYQ.2
            @Override // java.lang.Runnable
            public void run() {
                if (EYQ.this.EYQ != null) {
                    EYQ.this.EYQ.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() throws RemoteException {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.mZx.EYQ.3
            @Override // java.lang.Runnable
            public void run() {
                if (EYQ.this.EYQ != null) {
                    EYQ.this.EYQ.mZx();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() throws RemoteException {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.mZx.EYQ.4
            @Override // java.lang.Runnable
            public void run() {
                if (EYQ.this.EYQ != null) {
                    EYQ.this.EYQ.Td();
                }
            }
        });
    }
}
