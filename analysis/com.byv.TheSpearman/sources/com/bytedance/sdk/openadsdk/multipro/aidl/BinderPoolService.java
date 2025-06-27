package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.QQ;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.settings.KO;
import com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.IPb;
import com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.Kbd;
import com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.Pm;
import com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.VwS;

/* loaded from: classes2.dex */
public class BinderPoolService extends Service {
    public static volatile boolean EYQ;
    private static boolean Td;
    private final Binder mZx = new EYQ();

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        hu.EYQ(getApplicationContext());
        EYQ = true;
        if (!Td) {
            QQ.mZx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.1
                @Override // java.lang.Runnable
                public void run() {
                    KO.Jpu().EYQ(BinderPoolService.this.getApplicationContext());
                }
            });
        }
        Td = true;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mZx;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    public static class EYQ extends IBinderPool.Stub {
        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int i) throws RemoteException {
            if (i == 0) {
                return VwS.EYQ();
            }
            if (i == 1) {
                return Kbd.EYQ();
            }
            if (i == 4) {
                return com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.Td.EYQ();
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
        }
    }
}
