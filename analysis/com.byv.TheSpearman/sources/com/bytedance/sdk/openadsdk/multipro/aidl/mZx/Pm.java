package com.bytedance.sdk.openadsdk.multipro.aidl.mZx;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: RewardVideoListenerImpl.java */
/* loaded from: classes2.dex */
public class Pm extends IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.apiImpl.Pm.EYQ EYQ;

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    public Pm(com.bytedance.sdk.openadsdk.apiImpl.Pm.EYQ eyq) {
        this.EYQ = eyq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ() {
        this.EYQ = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.mZx.Pm.1
            @Override // java.lang.Runnable
            public void run() {
                if (Pm.this.EYQ != null) {
                    Pm.this.EYQ.EYQ();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.mZx.Pm.2
            @Override // java.lang.Runnable
            public void run() {
                if (Pm.this.EYQ != null) {
                    Pm.this.EYQ.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.mZx.Pm.3
            @Override // java.lang.Runnable
            public void run() {
                if (Pm.this.EYQ != null) {
                    Pm.this.EYQ.mZx();
                }
                Pm.this.EYQ();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(final boolean z, final int i, final String str, final int i2, final String str2) throws RemoteException {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.mZx.Pm.4
            @Override // java.lang.Runnable
            public void run() {
                if (Pm.this.EYQ != null) {
                    Pm.this.EYQ.EYQ(z, i, str, i2, str2);
                }
            }
        });
    }
}
