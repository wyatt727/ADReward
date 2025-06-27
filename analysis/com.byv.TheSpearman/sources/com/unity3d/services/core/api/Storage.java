package com.unity3d.services.core.api;

import com.unity3d.services.core.device.StorageError;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class Storage {
    @WebViewExposed
    public static void set(String str, String str2, Integer num, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        set(str, str2, (Object) num, webViewCallback);
    }

    @WebViewExposed
    public static void set(String str, String str2, Boolean bool, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        set(str, str2, (Object) bool, webViewCallback);
    }

    @WebViewExposed
    public static void set(String str, String str2, Long l, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        set(str, str2, (Object) l, webViewCallback);
    }

    @WebViewExposed
    public static void set(String str, String str2, Double d, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        set(str, str2, (Object) d, webViewCallback);
    }

    @WebViewExposed
    public static void set(String str, String str2, String str3, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        set(str, str2, (Object) str3, webViewCallback);
    }

    @WebViewExposed
    public static void set(String str, String str2, JSONObject jSONObject, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        set(str, str2, (Object) jSONObject, webViewCallback);
    }

    @WebViewExposed
    public static void set(String str, String str2, JSONArray jSONArray, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        set(str, str2, (Object) jSONArray, webViewCallback);
    }

    public static void set(String str, String str2, Object obj, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            if (storage.set(str2, obj)) {
                webViewCallback.invoke(str2);
                return;
            } else {
                webViewCallback.error(StorageError.COULDNT_SET_VALUE, str2);
                return;
            }
        }
        webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str, str2);
    }

    @WebViewExposed
    public static void get(String str, String str2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            Object obj = storage.get(str2);
            if (obj == null) {
                webViewCallback.error(StorageError.COULDNT_GET_VALUE, str2);
                return;
            } else {
                webViewCallback.invoke(obj);
                return;
            }
        }
        webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str, str2);
    }

    @WebViewExposed
    public static void getKeys(String str, String str2, Boolean bool, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            List<String> keys = storage.getKeys(str2, bool.booleanValue());
            if (keys != null) {
                webViewCallback.invoke(new JSONArray((Collection) keys));
                return;
            } else {
                webViewCallback.invoke(new JSONArray());
                return;
            }
        }
        webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str, str2);
    }

    @WebViewExposed
    public static void read(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            storage.readStorage();
            webViewCallback.invoke(str);
        } else {
            webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str);
        }
    }

    @WebViewExposed
    public static void write(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            if (storage.writeStorage()) {
                webViewCallback.invoke(str);
                return;
            } else {
                webViewCallback.error(StorageError.COULDNT_WRITE_STORAGE_TO_CACHE, str);
                return;
            }
        }
        webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str);
    }

    @WebViewExposed
    public static void clear(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            if (storage.clearStorage()) {
                webViewCallback.invoke(str);
                return;
            } else {
                webViewCallback.error(StorageError.COULDNT_CLEAR_STORAGE, str);
                return;
            }
        }
        webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str);
    }

    @WebViewExposed
    public static void delete(String str, String str2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            if (storage.delete(str2)) {
                webViewCallback.invoke(str);
                return;
            } else {
                webViewCallback.error(StorageError.COULDNT_DELETE_VALUE, str);
                return;
            }
        }
        webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str);
    }

    private static com.unity3d.services.core.device.Storage getStorage(String str) {
        return StorageManager.getStorage(StorageManager.StorageType.valueOf(str));
    }
}
