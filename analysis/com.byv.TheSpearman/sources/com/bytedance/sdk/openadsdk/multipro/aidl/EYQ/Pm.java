package com.bytedance.sdk.openadsdk.multipro.aidl.EYQ;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: DislikeClosedListenerManagerImpl.java */
/* loaded from: classes2.dex */
public class Pm extends EYQ {
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> EYQ = new ConcurrentHashMap<>();
    private static volatile Pm mZx;

    public static Pm EYQ() {
        if (mZx == null) {
            synchronized (Pm.class) {
                if (mZx == null) {
                    mZx = new Pm();
                }
            }
        }
        return mZx;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        EYQ.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        EYQ.remove(str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        EYQ(str, str2);
    }

    private synchronized void EYQ(String str, String str2) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList;
        try {
            ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> concurrentHashMap = EYQ;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        IDislikeClosedListener iDislikeClosedListener = (IDislikeClosedListener) remoteCallbackList.getBroadcastItem(i);
                        if (iDislikeClosedListener != null && "onItemClickClosed".equals(str2)) {
                            iDislikeClosedListener.onItemClickClosed();
                        }
                    } catch (Throwable th) {
                        pi.EYQ("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th);
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th2) {
            pi.EYQ("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th2);
        }
    }
}
