package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class NativeCallback {
    private static AtomicInteger _callbackCount = new AtomicInteger(0);
    private Method _callback;
    private String _id;
    private final INativeCallbackSubject _nativeCallbackSubject;

    public NativeCallback(Method method) {
        this(method, SharedInstances.INSTANCE.getWebViewAppNativeCallbackSubject());
    }

    public NativeCallback(Method method, INativeCallbackSubject iNativeCallbackSubject) {
        this._callback = method;
        this._id = this._callback.getName().toUpperCase(Locale.US) + "_" + _callbackCount.getAndIncrement();
        this._nativeCallbackSubject = iNativeCallbackSubject;
    }

    public String getId() {
        return this._id;
    }

    public void invoke(String str, Object... objArr) throws Exception {
        Object[] array;
        try {
            CallbackStatus callbackStatusValueOf = CallbackStatus.valueOf(str);
            if (objArr == null) {
                array = new Object[]{callbackStatusValueOf};
            } else {
                ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
                arrayList.add(0, callbackStatusValueOf);
                array = arrayList.toArray();
            }
            this._callback.invoke(null, array);
            this._nativeCallbackSubject.remove(this);
        } catch (Exception e) {
            DeviceLog.error("Illegal status");
            this._nativeCallbackSubject.remove(this);
            throw e;
        }
    }
}
