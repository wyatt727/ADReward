package com.unity3d.services.core.api;

import com.unity3d.services.core.lifecycle.LifecycleError;
import com.unity3d.services.core.lifecycle.LifecycleListener;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class Lifecycle {
    private static LifecycleListener _listener;

    @WebViewExposed
    public static void register(JSONArray jSONArray, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (ClientProperties.getApplication() != null) {
            if (getLifecycleListener() == null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        arrayList.add((String) jSONArray.get(i));
                    } catch (JSONException unused) {
                        webViewCallback.error(LifecycleError.JSON_ERROR, new Object[0]);
                        return;
                    }
                }
                setLifecycleListener(new LifecycleListener(arrayList));
                ClientProperties.getApplication().registerActivityLifecycleCallbacks(getLifecycleListener());
                webViewCallback.invoke(new Object[0]);
                return;
            }
            webViewCallback.error(LifecycleError.LISTENER_NOT_NULL, new Object[0]);
            return;
        }
        webViewCallback.error(LifecycleError.APPLICATION_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void unregister(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (ClientProperties.getApplication() != null) {
            if (getLifecycleListener() != null) {
                ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(getLifecycleListener());
                setLifecycleListener(null);
            }
            webViewCallback.invoke(new Object[0]);
            return;
        }
        webViewCallback.error(LifecycleError.APPLICATION_NULL, new Object[0]);
    }

    public static LifecycleListener getLifecycleListener() {
        return _listener;
    }

    public static void setLifecycleListener(LifecycleListener lifecycleListener) {
        _listener = lifecycleListener;
    }
}
