package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class InitializationNotificationCenter implements IInitializationNotificationCenter {
    private static InitializationNotificationCenter instance;
    private HashMap<Integer, IInitializationListener> _sdkListeners = new HashMap<>();

    public static InitializationNotificationCenter getInstance() {
        if (instance == null) {
            instance = new InitializationNotificationCenter();
        }
        return instance;
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void addListener(IInitializationListener iInitializationListener) {
        synchronized (this._sdkListeners) {
            if (iInitializationListener != null) {
                this._sdkListeners.put(new Integer(iInitializationListener.hashCode()), iInitializationListener);
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void removeListener(IInitializationListener iInitializationListener) {
        synchronized (this._sdkListeners) {
            if (iInitializationListener != null) {
                removeListener(new Integer(iInitializationListener.hashCode()));
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitialized() {
        synchronized (this._sdkListeners) {
            ArrayList arrayList = new ArrayList();
            for (final Map.Entry<Integer, IInitializationListener> entry : this._sdkListeners.entrySet()) {
                if (entry.getValue() != null) {
                    Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.configuration.InitializationNotificationCenter.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ((IInitializationListener) entry.getValue()).onSdkInitialized();
                        }
                    });
                } else {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this._sdkListeners.remove((Integer) it.next());
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitializationFailed(String str, final ErrorState errorState, final int i) {
        synchronized (this._sdkListeners) {
            final String str2 = "SDK Failed to Initialize due to " + str;
            DeviceLog.error(str2);
            ArrayList arrayList = new ArrayList();
            for (final Map.Entry<Integer, IInitializationListener> entry : this._sdkListeners.entrySet()) {
                if (entry.getValue() != null) {
                    Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.configuration.InitializationNotificationCenter.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ((IInitializationListener) entry.getValue()).onSdkInitializationFailed(str2, errorState, i);
                        }
                    });
                } else {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this._sdkListeners.remove((Integer) it.next());
            }
        }
    }

    private void removeListener(Integer num) {
        this._sdkListeners.remove(num);
    }
}
