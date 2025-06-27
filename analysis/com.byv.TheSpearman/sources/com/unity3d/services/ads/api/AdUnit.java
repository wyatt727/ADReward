package com.unity3d.services.ads.api;

import android.content.Intent;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.WindowInsets;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.t2;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.ads.adunit.AdUnitError;
import com.unity3d.services.ads.adunit.AdUnitMotionEvent;
import com.unity3d.services.ads.adunit.AdUnitSoftwareActivity;
import com.unity3d.services.ads.adunit.AdUnitTransparentActivity;
import com.unity3d.services.ads.adunit.AdUnitTransparentSoftwareActivity;
import com.unity3d.services.ads.adunit.IAdUnitActivity;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AdUnit {
    private static IAdUnitActivity _adUnitActivity = null;
    private static int _currentActivityId = -1;

    private AdUnit() {
    }

    public static void setAdUnitActivity(IAdUnitActivity iAdUnitActivity) {
        _adUnitActivity = iAdUnitActivity;
    }

    public static IAdUnitActivity getAdUnitActivity() {
        return _adUnitActivity;
    }

    public static int getCurrentAdUnitActivityId() {
        return _currentActivityId;
    }

    public static void setCurrentAdUnitActivityId(int i) {
        _currentActivityId = i;
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        open(num, jSONArray, num2, null, webViewCallback);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        open(num, jSONArray, num2, jSONArray2, 0, true, webViewCallback);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        open(num, jSONArray, num2, jSONArray2, num3, bool, false, webViewCallback);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, Boolean bool2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        open(num, jSONArray, num2, jSONArray2, num3, bool, bool2, 0, webViewCallback);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, Boolean bool2, Integer num4, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intent intent;
        if (!bool.booleanValue() && bool2.booleanValue()) {
            DeviceLog.debug("Unity Ads opening new transparent ad unit activity, hardware acceleration disabled");
            intent = new Intent(ClientProperties.getActivity(), (Class<?>) AdUnitTransparentSoftwareActivity.class);
        } else if (bool.booleanValue() && !bool2.booleanValue()) {
            DeviceLog.debug("Unity Ads opening new hardware accelerated ad unit activity");
            intent = new Intent(ClientProperties.getActivity(), (Class<?>) AdUnitActivity.class);
        } else if (bool.booleanValue() && bool2.booleanValue()) {
            DeviceLog.debug("Unity Ads opening new hardware accelerated transparent ad unit activity");
            intent = new Intent(ClientProperties.getActivity(), (Class<?>) AdUnitTransparentActivity.class);
        } else {
            DeviceLog.debug("Unity Ads opening new ad unit activity, hardware acceleration disabled");
            intent = new Intent(ClientProperties.getActivity(), (Class<?>) AdUnitSoftwareActivity.class);
        }
        intent.addFlags(268500992);
        if (num != null) {
            try {
                intent.putExtra(AdUnitActivity.EXTRA_ACTIVITY_ID, num.intValue());
                setCurrentAdUnitActivityId(num.intValue());
                try {
                    intent.putExtra(AdUnitActivity.EXTRA_VIEWS, getViewList(jSONArray));
                    if (jSONArray2 != null) {
                        try {
                            intent.putExtra(AdUnitActivity.EXTRA_KEY_EVENT_LIST, getKeyEventList(jSONArray2));
                        } catch (Exception e) {
                            DeviceLog.exception("Error parsing views from viewList", e);
                            webViewCallback.error(AdUnitError.CORRUPTED_KEYEVENTLIST, jSONArray2, e.getMessage());
                            return;
                        }
                    }
                    intent.putExtra(AdUnitActivity.EXTRA_SYSTEM_UI_VISIBILITY, num3);
                    intent.putExtra("orientation", num2);
                    intent.putExtra(AdUnitActivity.EXTRA_DISPLAY_CUTOUT_MODE, num4);
                    ClientProperties.getActivity().startActivity(intent);
                    DeviceLog.debug("Opened AdUnitActivity with: " + jSONArray.toString());
                    webViewCallback.invoke(new Object[0]);
                    return;
                } catch (Exception e2) {
                    DeviceLog.exception("Error parsing views from viewList", e2);
                    webViewCallback.error(AdUnitError.CORRUPTED_VIEWLIST, jSONArray, e2.getMessage());
                    return;
                }
            } catch (Exception e3) {
                DeviceLog.exception("Could not set activityId for intent", e3);
                webViewCallback.error(AdUnitError.ACTIVITY_ID, Integer.valueOf(num.intValue()), e3.getMessage());
                return;
            }
        }
        DeviceLog.error("Activity ID is NULL");
        webViewCallback.error(AdUnitError.ACTIVITY_ID, "Activity ID NULL");
    }

    @WebViewExposed
    public static void close(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (getAdUnitActivity() != null) {
            getAdUnitActivity().finish();
            webViewCallback.invoke(new Object[0]);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setViews(final JSONArray jSONArray, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        try {
            getViewList(jSONArray);
            z = false;
        } catch (JSONException unused) {
            webViewCallback.error(AdUnitError.CORRUPTED_VIEWLIST, jSONArray);
            z = true;
        }
        if (!z) {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.1
                @Override // java.lang.Runnable
                public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    if (AdUnit.getAdUnitActivity() != null) {
                        try {
                            AdUnit.getAdUnitActivity().setViews(AdUnit.getViewList(jSONArray));
                        } catch (Exception e) {
                            DeviceLog.exception("Corrupted viewlist", e);
                        }
                    }
                }
            });
        }
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(jSONArray);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getViews(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(new JSONArray((Collection) Arrays.asList(getAdUnitActivity().getViews())));
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setOrientation(final Integer num, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.2
            @Override // java.lang.Runnable
            public void run() {
                if (AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().setOrientation(num.intValue());
                }
            }
        });
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(num);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getOrientation(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(Integer.valueOf(getAdUnitActivity().getRequestedOrientation()));
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setKeepScreenOn(final Boolean bool, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.3
            @Override // java.lang.Runnable
            public void run() {
                if (AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().setKeepScreenOn(bool.booleanValue());
                }
            }
        });
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(new Object[0]);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setSystemUiVisibility(final Integer num, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.4
            @Override // java.lang.Runnable
            public void run() {
                if (AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().setSystemUiVisibility(num.intValue());
                }
            }
        });
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(num);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setKeyEventList(JSONArray jSONArray, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (getAdUnitActivity() != null) {
            try {
                getAdUnitActivity().setKeyEventList(getKeyEventList(jSONArray));
                webViewCallback.invoke(jSONArray);
                return;
            } catch (Exception e) {
                DeviceLog.exception("Error parsing views from viewList", e);
                webViewCallback.error(AdUnitError.CORRUPTED_KEYEVENTLIST, jSONArray, e.getMessage());
                return;
            }
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setViewFrame(final String str, final Integer num, final Integer num2, final Integer num3, final Integer num4, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.5
            @Override // java.lang.Runnable
            public void run() {
                if (AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().setViewFrame(str, num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                }
            }
        });
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(new Object[0]);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getViewFrame(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getViewFrame(str) != null) {
                Map<String, Integer> viewFrame = getAdUnitActivity().getViewFrame(str);
                webViewCallback.invoke(viewFrame.get("x"), viewFrame.get("y"), viewFrame.get("width"), viewFrame.get("height"));
                return;
            } else {
                webViewCallback.error(AdUnitError.UNKNOWN_VIEW, new Object[0]);
                return;
            }
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void startMotionEventCapture(Integer num, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                getAdUnitActivity().getLayout().startCapture(num.intValue());
                webViewCallback.invoke(new Object[0]);
                return;
            } else {
                webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
                return;
            }
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void endMotionEventCapture(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                getAdUnitActivity().getLayout().endCapture();
                webViewCallback.invoke(new Object[0]);
                return;
            } else {
                webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
                return;
            }
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void clearMotionEventCapture(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                getAdUnitActivity().getLayout().clearCapture();
                webViewCallback.invoke(new Object[0]);
                return;
            } else {
                webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
                return;
            }
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getMotionEventCount(JSONArray jSONArray, WebViewCallback webViewCallback) throws IllegalAccessException, JSONException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
            } catch (Exception e) {
                DeviceLog.exception("Error retrieving int from eventTypes", e);
            }
        }
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                if (getAdUnitActivity().getLayout().getCurrentEventCount() >= getAdUnitActivity().getLayout().getMaxEventCount()) {
                    webViewCallback.error(AdUnitError.MAX_MOTION_EVENT_COUNT_REACHED, new Object[0]);
                    return;
                }
                SparseIntArray eventCount = getAdUnitActivity().getLayout().getEventCount(arrayList);
                JSONObject jSONObject = new JSONObject();
                for (int i2 = 0; i2 < eventCount.size(); i2++) {
                    int iKeyAt = eventCount.keyAt(i2);
                    try {
                        jSONObject.put(Integer.toString(iKeyAt), eventCount.get(iKeyAt));
                    } catch (Exception e2) {
                        DeviceLog.exception("Error building response JSON", e2);
                    }
                }
                webViewCallback.invoke(jSONObject);
                return;
            }
            webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
            return;
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getMotionEventData(JSONObject jSONObject, WebViewCallback webViewCallback) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Iterator<String> itKeys = jSONObject.keys();
        SparseArray<ArrayList<Integer>> sparseArray = new SparseArray<>();
        while (true) {
            if (!itKeys.hasNext()) {
                break;
            }
            String next = itKeys.next();
            int i = Integer.parseInt(next);
            if (sparseArray.get(i) == null) {
                sparseArray.put(i, new ArrayList<>());
            }
            JSONArray jSONArray = null;
            try {
                jSONArray = jSONObject.getJSONArray(next);
            } catch (Exception e) {
                DeviceLog.exception("Couldn't fetch keyIndices", e);
            }
            if (jSONArray != null) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        sparseArray.get(i).add(Integer.valueOf(jSONArray.getInt(i2)));
                    } catch (Exception e2) {
                        DeviceLog.exception("Couldn't add value to requested infos", e2);
                    }
                }
            }
        }
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                if (getAdUnitActivity().getLayout().getCurrentEventCount() >= getAdUnitActivity().getLayout().getMaxEventCount()) {
                    webViewCallback.error(AdUnitError.MAX_MOTION_EVENT_COUNT_REACHED, new Object[0]);
                    return;
                }
                SparseArray<SparseArray<AdUnitMotionEvent>> events = getAdUnitActivity().getLayout().getEvents(sparseArray);
                JSONObject jSONObject2 = new JSONObject();
                for (int i3 = 0; i3 < events.size(); i3++) {
                    int iKeyAt = events.keyAt(i3);
                    SparseArray<AdUnitMotionEvent> sparseArray2 = events.get(iKeyAt);
                    JSONObject jSONObject3 = new JSONObject();
                    for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
                        JSONObject jSONObject4 = new JSONObject();
                        int iKeyAt2 = sparseArray2.keyAt(i4);
                        AdUnitMotionEvent adUnitMotionEvent = sparseArray2.get(iKeyAt2);
                        try {
                            jSONObject4.put(t2.h.h, adUnitMotionEvent.getAction());
                            jSONObject4.put("isObscured", adUnitMotionEvent.isObscured());
                            jSONObject4.put("toolType", adUnitMotionEvent.getToolType());
                            jSONObject4.put(FirebaseAnalytics.Param.SOURCE, adUnitMotionEvent.getSource());
                            jSONObject4.put("deviceId", adUnitMotionEvent.getDeviceId());
                            jSONObject4.put("x", adUnitMotionEvent.getX());
                            jSONObject4.put("y", adUnitMotionEvent.getY());
                            jSONObject4.put("eventTime", adUnitMotionEvent.getEventTime());
                            jSONObject4.put("pressure", adUnitMotionEvent.getPressure());
                            jSONObject4.put("size", adUnitMotionEvent.getSize());
                            jSONObject3.put(Integer.toString(iKeyAt2), jSONObject4);
                        } catch (Exception e3) {
                            DeviceLog.debug("Couldn't construct event info", e3);
                        }
                    }
                    try {
                        jSONObject2.put(Integer.toString(iKeyAt), jSONObject3);
                    } catch (Exception e4) {
                        DeviceLog.debug("Couldn't construct info object", e4);
                    }
                }
                webViewCallback.invoke(jSONObject2);
                return;
            }
            webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
            return;
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getCurrentMotionEventCount(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                webViewCallback.invoke(Integer.valueOf(getAdUnitActivity().getLayout().getCurrentEventCount()));
                return;
            } else {
                webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
                return;
            }
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getSafeAreaInsets(WebViewCallback webViewCallback) throws IllegalAccessException, JSONException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (getAdUnitActivity() != null && getAdUnitActivity().getLayout() != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                WindowInsets rootWindowInsets = getAdUnitActivity().getLayout().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        Object objInvoke = rootWindowInsets.getClass().getMethod("getDisplayCutout", new Class[0]).invoke(rootWindowInsets, new Object[0]);
                        if (objInvoke != null) {
                            Object objInvoke2 = objInvoke.getClass().getMethod("getSafeInsetTop", new Class[0]).invoke(objInvoke, new Object[0]);
                            Object objInvoke3 = objInvoke.getClass().getMethod("getSafeInsetRight", new Class[0]).invoke(objInvoke, new Object[0]);
                            Object objInvoke4 = objInvoke.getClass().getMethod("getSafeInsetBottom", new Class[0]).invoke(objInvoke, new Object[0]);
                            Object objInvoke5 = objInvoke.getClass().getMethod("getSafeInsetLeft", new Class[0]).invoke(objInvoke, new Object[0]);
                            jSONObject.put("top", objInvoke2);
                            jSONObject.put("right", objInvoke3);
                            jSONObject.put("bottom", objInvoke4);
                            jSONObject.put("left", objInvoke5);
                            webViewCallback.invoke(jSONObject);
                        } else {
                            webViewCallback.error(AdUnitError.NO_DISPLAY_CUTOUT_AVAILABLE, new Object[0]);
                        }
                        return;
                    } catch (IllegalAccessException e) {
                        e = e;
                        webViewCallback.error(AdUnitError.DISPLAY_CUTOUT_INVOKE_FAILED, new Object[0]);
                        DeviceLog.debug("Error while calling displayCutout getter", e);
                        return;
                    } catch (NoSuchMethodException e2) {
                        webViewCallback.error(AdUnitError.DISPLAY_CUTOUT_METHOD_NOT_AVAILABLE, new Object[0]);
                        DeviceLog.debug("Method getDisplayCutout not found", e2);
                        return;
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        webViewCallback.error(AdUnitError.DISPLAY_CUTOUT_INVOKE_FAILED, new Object[0]);
                        DeviceLog.debug("Error while calling displayCutout getter", e);
                        return;
                    } catch (JSONException e4) {
                        webViewCallback.error(AdUnitError.DISPLAY_CUTOUT_JSON_ERROR, new Object[0]);
                        DeviceLog.debug("JSON error while constructing display cutout object", e4);
                        return;
                    }
                }
                webViewCallback.error(AdUnitError.NO_DISPLAY_CUTOUT_AVAILABLE, new Object[0]);
                return;
            }
            webViewCallback.error(AdUnitError.API_LEVEL_ERROR, new Object[0]);
            return;
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setLayoutInDisplayCutoutMode(final Integer num, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.6
            @Override // java.lang.Runnable
            public void run() {
                if (AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().setLayoutInDisplayCutoutMode(num.intValue());
                }
            }
        });
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(num);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] getViewList(JSONArray jSONArray) throws JSONException {
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return strArr;
    }

    private static ArrayList<Integer> getKeyEventList(JSONArray jSONArray) throws JSONException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int iIntValue = 0;
        while (true) {
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (numValueOf.intValue() >= jSONArray.length()) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(jSONArray.getInt(numValueOf.intValue())));
            iIntValue = numValueOf.intValue() + 1;
        }
    }
}
