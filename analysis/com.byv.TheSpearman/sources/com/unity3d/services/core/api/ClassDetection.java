package com.unity3d.services.core.api;

import com.unity3d.services.core.properties.MadeWithUnityDetector;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class ClassDetection {
    @WebViewExposed
    public static void isMadeWithUnity(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        webViewCallback.invoke(Boolean.valueOf(MadeWithUnityDetector.isMadeWithUnity()));
    }
}
