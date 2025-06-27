package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.VwS.QQ;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.IPb;
import com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.Kbd;
import com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.Pm;
import com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.VwS;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: BinderPool.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static final EYQ mZx = new EYQ();
    private IBinderPool EYQ;
    private mZx Td;
    private long Pm = 0;
    private final ServiceConnection Kbd = new ServiceConnection() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.2
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            xt.EYQ(new QQ("onServiceConnected") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.2.1
                @Override // java.lang.Runnable
                public void run() throws RemoteException {
                    EYQ.this.EYQ = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        EYQ.this.EYQ.asBinder().linkToDeath(EYQ.this.IPb, 0);
                    } catch (RemoteException e) {
                        pi.EYQ("TTAD.BinderPool", "onServiceConnected throws :", e);
                    }
                    System.currentTimeMillis();
                    long unused = EYQ.this.Pm;
                    if (EYQ.this.Td != null) {
                        EYQ.this.Td.onServiceConnected();
                    }
                }
            }, 5);
        }
    };
    private final IBinder.DeathRecipient IPb = new IBinder.DeathRecipient() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.3
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            xt.EYQ(new QQ("binderDied") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.3.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (EYQ.this.EYQ.asBinder().isBinderAlive()) {
                            EYQ.this.EYQ.asBinder().unlinkToDeath(EYQ.this.IPb, 0);
                        }
                    } catch (Exception e) {
                        pi.EYQ("TTAD.BinderPool", e.getMessage());
                    }
                    EYQ.this.EYQ = null;
                    EYQ.this.Pm();
                }
            }, 5);
        }
    };

    private EYQ() {
        Pm();
    }

    public static EYQ EYQ() {
        return mZx;
    }

    public void mZx() {
        try {
            Context contextEYQ = hu.EYQ();
            contextEYQ.startService(new Intent(contextEYQ, (Class<?>) BinderPoolService.class));
        } catch (Exception unused) {
        }
    }

    public void Td() {
        try {
            Context contextEYQ = hu.EYQ();
            contextEYQ.bindService(new Intent(contextEYQ, (Class<?>) BinderPoolService.class), this.Kbd, 1);
            this.Pm = System.currentTimeMillis();
        } catch (Throwable unused) {
        }
    }

    public void EYQ(mZx mzx) {
        this.Td = mzx;
        if (this.EYQ != null) {
            xt.EYQ(new QQ("onServiceConnected2") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.1
                @Override // java.lang.Runnable
                public void run() {
                    if (EYQ.this.Td != null) {
                        EYQ.this.Td.onServiceConnected();
                    }
                }
            }, 5);
        }
    }

    public IBinder EYQ(int i) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                try {
                    IBinderPool iBinderPool = this.EYQ;
                    if (iBinderPool != null) {
                        return iBinderPool.queryBinder(i);
                    }
                    return null;
                } catch (RemoteException e) {
                    pi.EYQ("TTAD.BinderPool", e.getMessage());
                    FH.QQ("queryBinder error");
                    return null;
                }
            }
            if (i == 0) {
                return VwS.EYQ();
            }
            if (i == 1) {
                return Kbd.EYQ();
            }
            if (i == 5) {
                return IPb.mZx();
            }
            if (i == 6) {
                return Pm.EYQ();
            }
            if (i != 7) {
                return null;
            }
            return com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.mZx.EYQ();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm() {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            Td();
        }
    }
}
