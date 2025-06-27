package com.bytedance.sdk.openadsdk.multipro.aidl.mZx;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: FullScreenVideoListenerImpl.java */
/* loaded from: classes2.dex */
public class Td extends IFullScreenVideoAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.apiImpl.mZx.mZx EYQ;

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    public Td(com.bytedance.sdk.openadsdk.apiImpl.mZx.mZx mzx) {
        this.EYQ = mzx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ() {
        this.EYQ = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.mZx.Td.1
            @Override // java.lang.Runnable
            public void run() {
                if (Td.this.EYQ != null) {
                    Td.this.EYQ.EYQ();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.mZx.Td.2
            @Override // java.lang.Runnable
            public void run() {
                if (Td.this.EYQ != null) {
                    Td.this.EYQ.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.EYQ == null) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.mZx.Td.3
            @Override // java.lang.Runnable
            public void run() {
                if (Td.this.EYQ != null) {
                    Td.this.EYQ.mZx();
                }
                Td.this.EYQ();
            }
        });
    }
}
